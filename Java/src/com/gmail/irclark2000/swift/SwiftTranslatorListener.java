package com.gmail.irclark2000.swift;

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
import com.gmail.irclark2000.swift.parser.SwiftParser.Dictionary_literal_itemContext;


/**
 * @author Isaac Clark
 * Listener for Antlr Parser to translate swift
 *
 */
public class SwiftTranslatorListener extends SwiftBaseListener {
	private final static String DEFAULT_TYPE = "AnyType";
	private final static String UNKNOWN_TYPE = "UnknownType";
	
	ParseTreeProperty<String> type = new ParseTreeProperty<String>();
	String getType(ParseTree ctx) {
		return type.get(ctx);
	}
	void setType(ParseTree ctx, String s) {
	    type.put(ctx, s);
	}

	@Override 
	public void exitTop_level(SwiftParser.Top_levelContext ctx) {
	}
	@Override public void exitExpression(SwiftParser.ExpressionContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
		setType (ctx, getType(ctx.prefix_expression()));
	}
	@Override public void exitPrefix_expression(SwiftParser.Prefix_expressionContext ctx) { 
		if(ctx.prefix_expression() != null) {
			setType(ctx, getType(ctx.prefix_expression()));
		}
		else if(ctx.postfix_expression() != null) {
			setType(ctx, getType(ctx.postfix_expression()));
		} else if(ctx.in_out_expression() != null) {
				setType(ctx, UNKNOWN_TYPE);
		}
	}
	@Override public void exitPostfix_expression(SwiftParser.Postfix_expressionContext ctx) {
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
	function_call_expression
	 | initializer_expression
	 | explicit_member_expression
	 | postfix_self_expression
	 | dynamic_type_expression
	 | subscript_expression
	 | forced_value_expression
	 | optional_chaining_expression) 
*/
	@Override public void exitFunction_call_expression(SwiftParser.Function_call_expressionContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
		String type;
		if (ctx.trailing_closure() != null) {
			type = SwiftTranslationHelper.getFunctionSignature (ctx.parenthesized_expression(), ctx.trailing_closure());
		} else {
			type = SwiftTranslationHelper.getFunctionSignature (ctx.parenthesized_expression(), null);
		}
		setType(ctx, type);
	}

	@Override public void exitInitializer_expression(SwiftParser.Initializer_expressionContext ctx) { 
		
	}

	@Override public void exitDictionary_literal(SwiftParser.Dictionary_literalContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
		String type = "AnyType";
		if (ctx.dictionary_literal_items() != null && ctx.dictionary_literal_items().getChildCount() != 0) {
			type = getType(ctx.dictionary_literal_items());
		}
		setType(ctx, type);
	}

	@Override public void exitDictionary_literal_items(SwiftParser.Dictionary_literal_itemsContext ctx) { 
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
	
	@Override public void exitDictionary_literal_item(SwiftParser.Dictionary_literal_itemContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
		setType(ctx, getType (ctx.expression(1)));
	}

	@Override public void exitLiteral(SwiftParser.LiteralContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String type = "";
		if(ctx.integer_literal() != null) {
			type = "Int";
		} else if(ctx.String_literal() != null) {
			type = "String";
		} else if(ctx.Floating_point_literal() != null) {
			type = "Float";
		}
		setType(ctx, type);
	}
	@Override public void exitLiteral_expression(SwiftParser.Literal_expressionContext ctx) { 
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

	@Override public void exitArray_literal(SwiftParser.Array_literalContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
		String type = DEFAULT_TYPE;
		if (ctx.array_literal_items() != null) {
			type = getType(ctx.array_literal_items());
		}
		setType(ctx, type);
	}
	
	@Override public void exitArray_literal_items(SwiftParser.Array_literal_itemsContext ctx) { 
		String type = getType(ctx.array_literal_item(0));
		for (Array_literal_itemContext dl : ctx.array_literal_item()) {
			if (!type.equals(getType(dl))) {
				type = DEFAULT_TYPE;
			}
		}
		setType(ctx, "Array:" + type);
	}

	@Override public void exitArray_literal_item(SwiftParser.Array_literal_itemContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
		
		setType(ctx, getType(ctx.expression()));
	}


	@Override public void exitFunction_declaration(SwiftParser.Function_declarationContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
		Token semi = ctx.getStart();
		int i = semi.getTokenIndex();
		List<Token> cmtChannel = tokenStream.getHiddenTokensToLeft(i, SwiftLexer.COMMENT);
		if (cmtChannel != null) {
			
		}
		
	}

	@Override public void exitIf_statement(SwiftParser.If_statementContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
	}
	@Override public void exitIdentifier(SwiftParser.IdentifierContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
	}
	@Override public void exitOperator(SwiftParser.OperatorContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
	}
	@Override public void exitStatement(SwiftParser.StatementContext ctx) { 
		String code = ctx.getText();
		String.format("%s", code);
	}
	
	SwiftTranslatorListener(CommonTokenStream tokenStream) {
		super();
		this.tokenStream = tokenStream;
		this.rewriter = new TokenStreamRewriter(tokenStream);
	}
	
	private BufferedTokenStream tokenStream;
	private TokenStreamRewriter rewriter;
//	SwiftTranslatorListener() {
//			super();	
//	}

}
