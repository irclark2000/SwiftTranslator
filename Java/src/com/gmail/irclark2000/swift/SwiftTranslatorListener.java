package com.gmail.irclark2000.swift;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import com.gmail.irclark2000.swift.parser.SwiftBaseListener;
import com.gmail.irclark2000.swift.parser.SwiftLexer;
import com.gmail.irclark2000.swift.parser.SwiftParser;
import com.gmail.irclark2000.swift.parser.SwiftParser.Array_literal_itemContext;
import com.gmail.irclark2000.swift.parser.SwiftParser.Declaration_modifierContext;
import com.gmail.irclark2000.swift.parser.SwiftParser.Dictionary_literal_itemContext;
import com.gmail.irclark2000.swift.parser.SwiftParser.ParameterContext;
import com.gmail.irclark2000.swift.parser.SwiftParser.Parameter_clauseContext;
import com.gmail.irclark2000.swift.symbol.ClassSymbol;
import com.gmail.irclark2000.swift.symbol.FunctionSymbol;
import com.gmail.irclark2000.swift.symbol.Scope;

/**
 * @author Isaac Clark Listener for Antlr Parser to translate swift
 * 
 */
public class SwiftTranslatorListener extends SwiftBaseListener {
	private final static String TAG = "SwiftTranslatorListener";
	private final static String DEFAULT_TYPE = "AnyType";
	private final static String UNKNOWN_TYPE = "UnknownType";

	ParseTreeProperty<String> type = new ParseTreeProperty<String>();
	ParseTreeProperty<ArrayList<String>> list = new ParseTreeProperty<ArrayList<String>>();
	ParseTreeProperty<ArrayList<ArrayList<String>>> listOfLists = new ParseTreeProperty<ArrayList<ArrayList<String>>>();

	String getType(ParseTree ctx) {
		return type.get(ctx);
	}

	void setType(ParseTree ctx, String s) {
		type.put(ctx, s);
	}

	ArrayList<String> getList(ParseTree ctx) {
		return list.get(ctx);
	}

	void setList(ParseTree ctx, ArrayList<String> s) {
		list.put(ctx, s);
	}

	ArrayList<ArrayList<String>> getListOfLists(ParseTree ctx) {
		return listOfLists.get(ctx);
	}

	void setListOfLists(ParseTree ctx, ArrayList<ArrayList<String>> s) {
		listOfLists.put(ctx, s);
	}

	@Override
	public void exitTop_level(SwiftParser.Top_levelContext ctx) {
	}

	@Override
	public void exitExpression(SwiftParser.ExpressionContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setType(ctx, getType(ctx.prefix_expression()));
	}

	@Override
	public void enterClass_declaration(SwiftParser.Class_declarationContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);

	}

	@Override
	public void exitClass_name(SwiftParser.Class_nameContext ctx) {
	}

	@Override
	public void enterFunction_head(SwiftParser.Function_headContext ctx) {
		if (ctx.declaration_modifiers() != null) {
			setList(ctx, getList(ctx.declaration_modifiers()));
		}
	}

	@Override
	public void enterDeclaration_modifiers(
			SwiftParser.Declaration_modifiersContext ctx) {
		ArrayList<String> mods = new ArrayList<String>();
		for (Declaration_modifierContext mod : ctx.declaration_modifier()) {
			mods.add(getType(mod));
		}
		setList(ctx, mods);
	}

	@Override
	public void enterDeclaration_modifier(
			SwiftParser.Declaration_modifierContext ctx) {
		setType(ctx, ctx.getText());
	}

	@Override
	public void exitClass_declaration(SwiftParser.Class_declarationContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		ClassSymbol sym = new ClassSymbol();
		sym.setName(getType(ctx.class_name()));
		sym.addModifier(getType(ctx.access_level_modifier()));
		if (ctx.generic_parameter_clause() != null) {
			ParseLog.report(TAG, "class declaration generic parameter clause not supported");
		}

		/*
		 * class_declaration : attributes? access_level_modifier? CLASS
		 * class_name generic_parameter_clause? type_inheritance_clause?
		 * class_body ;
		 * 
		 * class_name : identifier ;
		 * 
		 * class_body : '{' declarations? '}' ;
		 */
	}

	@Override
	public void enterClass_name(SwiftParser.Class_nameContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setType(ctx, getType(ctx.identifier()));
	}

	@Override
	public void exitPrefix_expression(SwiftParser.Prefix_expressionContext ctx) {
		if (ctx.prefix_expression() != null) {
			setType(ctx, getType(ctx.prefix_expression()));
		} else if (ctx.postfix_expression() != null) {
			setType(ctx, getType(ctx.postfix_expression()));
		} else if (ctx.in_out_expression() != null) {
			setType(ctx, UNKNOWN_TYPE);
		}
	}

	@Override
	public void exitPostfix_expression(SwiftParser.Postfix_expressionContext ctx) {
		String type;
		if (ctx.primary_expression() != null) {
			type = getType(ctx.primary_expression());
		} else if (ctx.postfix_operator() != null) {
			type = getType(ctx.postfix_expression());
		} else {
			type = getType(ctx.getChild(1));
		}
		setType(ctx, type);
	}

	/*
	 * function_call_expression | initializer_expression |
	 * explicit_member_expression | postfix_self_expression |
	 * dynamic_type_expression | subscript_expression | forced_value_expression
	 * | optional_chaining_expression)
	 */
	@Override
	public void exitFunction_call_expression(
			SwiftParser.Function_call_expressionContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String type;
		if (ctx.trailing_closure() != null) {
			type = SwiftTranslationHelper.getFunctionSignature(
					ctx.parenthesized_expression(), ctx.trailing_closure());
		} else {
			type = SwiftTranslationHelper.getFunctionSignature(
					ctx.parenthesized_expression(), null);
		}
		setType(ctx, type);
	}

	@Override
	public void exitInitializer_expression(
			SwiftParser.Initializer_expressionContext ctx) {

	}

	@Override
	public void exitDictionary_literal(SwiftParser.Dictionary_literalContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String type = "AnyType";
		if (ctx.dictionary_literal_items() != null
				&& ctx.dictionary_literal_items().getChildCount() != 0) {
			type = getType(ctx.dictionary_literal_items());
		}
		setType(ctx, type);
	}

	@Override
	public void exitDictionary_literal_items(
			SwiftParser.Dictionary_literal_itemsContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String type = getType(ctx.dictionary_literal_item(0));
		for (Dictionary_literal_itemContext dl : ctx.dictionary_literal_item()) {
			if (!type.equals(getType(dl))) {
				type = DEFAULT_TYPE;
			}
		}
		setType(ctx, "Dictionary:" + type);
	}

	@Override
	public void exitDictionary_literal_item(
			SwiftParser.Dictionary_literal_itemContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setType(ctx, getType(ctx.expression(1)));
	}

	@Override
	public void exitLiteral(SwiftParser.LiteralContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String type = "";
		if (ctx.integer_literal() != null) {
			type = "Int";
		} else if (ctx.String_literal() != null) {
			type = "String";
		} else if (ctx.Floating_point_literal() != null) {
			type = "Float";
		}
		setType(ctx, type);
	}

	@Override
	public void exitLiteral_expression(SwiftParser.Literal_expressionContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String type;
		if (ctx.literal() != null) {
			type = getType(ctx.literal());
		} else if (ctx.array_literal() != null) {
			type = getType(ctx.array_literal());
		} else if (ctx.dictionary_literal() != null) {
			type = getType(ctx.dictionary_literal());
		} else {
			type = "String";
		}
		setType(ctx, type);
	}

	@Override
	public void exitArray_literal(SwiftParser.Array_literalContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String type = DEFAULT_TYPE;
		if (ctx.array_literal_items() != null) {
			type = getType(ctx.array_literal_items());
		}
		setType(ctx, type);
	}

	@Override
	public void exitArray_literal_items(
			SwiftParser.Array_literal_itemsContext ctx) {
		String type = getType(ctx.array_literal_item(0));
		for (Array_literal_itemContext dl : ctx.array_literal_item()) {
			if (!type.equals(getType(dl))) {
				type = DEFAULT_TYPE;
			}
		}
		setType(ctx, "Array:" + type);
	}

	@Override
	public void exitArray_literal_item(SwiftParser.Array_literal_itemContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);

		setType(ctx, getType(ctx.expression()));
	}

	@Override
	public void exitFunction_declaration(
			SwiftParser.Function_declarationContext ctx) {
		ArrayList<String> modifiers = getList(ctx.function_head());
		String name = getType(ctx.function_name());
		FunctionSymbol sym = new FunctionSymbol();
		sym.setName(name);
		currentScope.addSymbol(sym);
		if (ctx.generic_parameter_clause() != null) {
			ParseLog.report(TAG,
					"function declaration generic parameter clause not supported");
		}
		sym.addModifiers(modifiers);
		String result = getType(ctx.function_signature());
		if (result != null) {
			sym.setType("void");
		} else {
			sym.setType(result);
		}
		sym.setSignature(getListOfLists(ctx.function_signature()));
		// generic_parameter_clause? function_signature function_body ;
	}

	@Override
	public void enterFunction_signature(
			SwiftParser.Function_signatureContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		if (ctx.function_result() != null) {
			setType(ctx, getType(ctx.function_result()));
		}
		setListOfLists(ctx, getListOfLists(ctx.parameter_clauses()));
		if (ctx.function_result() != null) {
			setType(ctx, getType(ctx.function_result()));
		}
	}

	@Override
	public void enterFunction_result(SwiftParser.Function_resultContext ctx) {
		if (ctx.attributes() != null) {
			ParseLog.report(TAG, "function result attribute not supported");
		}
		setType(ctx, getType(ctx.type()));
	}

	@Override
	public void exitParameter_clauses(SwiftParser.Parameter_clausesContext ctx) {
		ArrayList<ArrayList<String>> ll = new ArrayList<ArrayList<String>>();
		for (Parameter_clauseContext cl : ctx.parameter_clause()) {
			ll.add(getList(cl));
		}
		setListOfLists(ctx, ll);
	}

	@Override
	public void exitParameter_clause(SwiftParser.Parameter_clauseContext ctx) {
		if (ctx.parameter_list() != null) {
			setList(ctx, getList(ctx.parameter_list()));
		}
		if (ctx.DOTDOTDOT() != null) {
			ArrayList<String> list = getList(ctx);
			list.add("...");
			setList(ctx, list);
		}
	}

	@Override
	public void enterParameter_list(SwiftParser.Parameter_listContext ctx) {
		ArrayList<String> pList = new ArrayList<String>();
		for (ParameterContext param : ctx.parameter()) {
			pList.add(getType(param));
		}
		setList(ctx, pList);
	}

	@Override
	public void enterParameter(SwiftParser.ParameterContext ctx) {
		if (ctx.INOUT() != null) {
			ParseLog.report(TAG, "parameter inout not supported");
		} else if (ctx.VAR() != null) {
			ParseLog.report(TAG, "parameter var keyword not supported");
		} else if (ctx.LET() != null) {
			ParseLog.report(TAG, "parameter let keyword not supported");
		} else if (ctx.type() != null) {
			setType(ctx, getType(ctx.type()));
		}
		if (ctx.local_parameter_name() != null) {
			String name = SwiftTranslationHelper.appendWithSpace("",
					getType(ctx.external_parameter_name()));
			name = SwiftTranslationHelper.appendWithSpace(name,
					getType(ctx.local_parameter_name()));
		}
	}

	@Override
	public void enterType_annotation(SwiftParser.Type_annotationContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setType(ctx, getType(ctx.type()));
	}

	@Override
	public void enterType(SwiftParser.TypeContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setType(ctx, ctx.getText());
	}

	@Override
	public void enterFunction_name(SwiftParser.Function_nameContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setType(ctx, ctx.getText());
	}

	@Override
	public void enterFunction_declaration(
			SwiftParser.Function_declarationContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		Token semi = ctx.getStart();
		int i = semi.getTokenIndex();
		List<Token> cmtChannel = tokenStream.getHiddenTokensToLeft(i,
				SwiftLexer.COMMENT);
		if (cmtChannel != null) {

		}
	}

	@Override
	public void exitIf_statement(SwiftParser.If_statementContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
	}

	@Override
	public void enterIdentifier(SwiftParser.IdentifierContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setType(ctx, ctx.getText());
	}

	@Override
	public void exitOperator(SwiftParser.OperatorContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
	}

	@Override
	public void exitStatement(SwiftParser.StatementContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
	}

	SwiftTranslatorListener(CommonTokenStream tokenStream,
			ParseParameters params) {
		super();
		this.tokenStream = tokenStream;
		this.gScope = params.gScope;
		this.fScope = new Scope(params.fileName, params.gScope);
		this.currentScope = fScope;
		this.rewriter = new TokenStreamRewriter(tokenStream);
	}

	private BufferedTokenStream tokenStream;
	private TokenStreamRewriter rewriter;
	private ParseParameters params;
	private Scope gScope;
	private Scope fScope;
	private Scope currentScope;
	// SwiftTranslatorListener() {
	// super();
	// }

}
