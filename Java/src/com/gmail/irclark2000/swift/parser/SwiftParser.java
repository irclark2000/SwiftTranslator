// Generated from Swift.g4 by ANTLR 4.0
package com.gmail.irclark2000.swift.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__84=1, T__83=2, T__82=3, T__81=4, T__80=5, T__79=6, T__78=7, T__77=8, 
		T__76=9, T__75=10, T__74=11, T__73=12, T__72=13, T__71=14, T__70=15, T__69=16, 
		T__68=17, T__67=18, T__66=19, T__65=20, T__64=21, T__63=22, T__62=23, 
		T__61=24, T__60=25, T__59=26, T__58=27, T__57=28, T__56=29, T__55=30, 
		T__54=31, T__53=32, T__52=33, T__51=34, T__50=35, T__49=36, T__48=37, 
		T__47=38, T__46=39, T__45=40, T__44=41, T__43=42, T__42=43, T__41=44, 
		T__40=45, T__39=46, T__38=47, T__37=48, T__36=49, T__35=50, T__34=51, 
		T__33=52, T__32=53, T__31=54, T__30=55, T__29=56, T__28=57, T__27=58, 
		T__26=59, T__25=60, T__24=61, T__23=62, T__22=63, T__21=64, T__20=65, 
		T__19=66, T__18=67, T__17=68, T__16=69, T__15=70, T__14=71, T__13=72, 
		T__12=73, T__11=74, T__10=75, T__9=76, T__8=77, T__7=78, T__6=79, T__5=80, 
		T__4=81, T__3=82, T__2=83, T__1=84, T__0=85, Operator=86, Identifier=87, 
		Implicit_parameter_name=88, Binary_literal=89, Octal_literal=90, Decimal_literal=91, 
		Hexadecimal_literal=92, Floating_point_literal=93, String_literal=94, 
		Quoted_text=95, Quoted_text_item=96, Escaped_character=97;
	public static final String[] tokenNames = {
		"<INVALID>", "'left'", "'&'", "'self'", "'nonmutating'", "'Self'", "'['", 
		"'<'", "'continue'", "'Type'", "'Protocol'", "'fallthrough'", "'__LINE__'", 
		"'override'", "'postfix'", "'unowned(unsafe)'", "'inout'", "'}'", "'__COLUMN__'", 
		"'__FUNCTION__'", "'case'", "'do'", "'super'", "'->'", "')'", "'_'", "'convenience'", 
		"'@'", "'associativity'", "'='", "'didSet'", "'new'", "'class'", "'__FILE__'", 
		"'!'", "'enum'", "']'", "'get'", "'in'", "'default'", "','", "'while'", 
		"'('", "':'", "'if'", "'none'", "'var'", "'?'", "'set'", "'typealias'", 
		"'as'", "'precedence'", "'...'", "'{'", "'init'", "'break'", "'let'", 
		"'weak'", "'deinit'", "'func'", "'infix'", "'else'", "'dynamicType'", 
		"'mutating'", "'struct'", "'static'", "'import'", "'is'", "'.'", "'subscript'", 
		"'unowned'", "'for'", "'operator'", "'return'", "'prefix'", "';'", "'willSet'", 
		"'extension'", "'>'", "'protocol'", "'right'", "'switch'", "'unowned(safe)'", 
		"'where'", "'=='", "'#'", "Operator", "Identifier", "Implicit_parameter_name", 
		"Binary_literal", "Octal_literal", "Decimal_literal", "Hexadecimal_literal", 
		"Floating_point_literal", "String_literal", "Quoted_text", "Quoted_text_item", 
		"Escaped_character"
	};
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_loop_statement = 3, 
		RULE_for_statement = 4, RULE_for_init = 5, RULE_for_in_statement = 6, 
		RULE_while_statement = 7, RULE_while_condition = 8, RULE_do_while_statement = 9, 
		RULE_branch_statement = 10, RULE_if_statement = 11, RULE_if_condition = 12, 
		RULE_else_clause = 13, RULE_switch_statement = 14, RULE_switch_cases = 15, 
		RULE_switch_case = 16, RULE_case_label = 17, RULE_case_item_list = 18, 
		RULE_default_label = 19, RULE_guard_clause = 20, RULE_guard_expression = 21, 
		RULE_labeled_statement = 22, RULE_statement_label = 23, RULE_label_name = 24, 
		RULE_control_transfer_statement = 25, RULE_break_statement = 26, RULE_continue_statement = 27, 
		RULE_fallthrough_statement = 28, RULE_return_statement = 29, RULE_generic_parameter_clause = 30, 
		RULE_generic_parameter_list = 31, RULE_generic_parameter = 32, RULE_requirement_clause = 33, 
		RULE_requirement_list = 34, RULE_requirement = 35, RULE_conformance_requirement = 36, 
		RULE_same_type_requirement = 37, RULE_generic_argument_clause = 38, RULE_generic_argument_list = 39, 
		RULE_generic_argument = 40, RULE_declaration = 41, RULE_declarations = 42, 
		RULE_declaration_specifiers = 43, RULE_declaration_specifier = 44, RULE_code_block = 45, 
		RULE_import_declaration = 46, RULE_import_kind = 47, RULE_import_path = 48, 
		RULE_import_path_identifier = 49, RULE_constant_declaration = 50, RULE_pattern_initializer_list = 51, 
		RULE_pattern_initializer = 52, RULE_initializer = 53, RULE_variable_declaration = 54, 
		RULE_variable_declaration_head = 55, RULE_variable_name = 56, RULE_getter_setter_block = 57, 
		RULE_getter_clause = 58, RULE_setter_clause = 59, RULE_setter_name = 60, 
		RULE_getter_setter_keyword_block = 61, RULE_getter_keyword_clause = 62, 
		RULE_setter_keyword_clause = 63, RULE_willSet_didSet_block = 64, RULE_willSet_clause = 65, 
		RULE_didSet_clause = 66, RULE_typealias_declaration = 67, RULE_typealias_head = 68, 
		RULE_typealias_name = 69, RULE_typealias_assignment = 70, RULE_function_declaration = 71, 
		RULE_function_head = 72, RULE_function_name = 73, RULE_function_signature = 74, 
		RULE_function_result = 75, RULE_function_body = 76, RULE_parameter_clauses = 77, 
		RULE_parameter_clause = 78, RULE_parameter_list = 79, RULE_parameter = 80, 
		RULE_parameter_name = 81, RULE_local_parameter_name = 82, RULE_default_argument_clause = 83, 
		RULE_enum_declaration = 84, RULE_union_style_enum = 85, RULE_union_style_enum_members = 86, 
		RULE_union_style_enum_member = 87, RULE_union_style_enum_case_clause = 88, 
		RULE_union_style_enum_case_list = 89, RULE_union_style_enum_case = 90, 
		RULE_enum_name = 91, RULE_enum_case_name = 92, RULE_raw_value_style_enum = 93, 
		RULE_raw_value_style_enum_members = 94, RULE_raw_value_style_enum_member = 95, 
		RULE_raw_value_style_enum_case_clause = 96, RULE_raw_value_style_enum_case_list = 97, 
		RULE_raw_value_style_enum_case = 98, RULE_raw_value_assignment = 99, RULE_struct_declaration = 100, 
		RULE_struct_name = 101, RULE_struct_body = 102, RULE_class_declaration = 103, 
		RULE_class_name = 104, RULE_class_body = 105, RULE_protocol_declaration = 106, 
		RULE_protocol_name = 107, RULE_protocol_body = 108, RULE_protocol_member_declaration = 109, 
		RULE_protocol_member_declarations = 110, RULE_protocol_property_declaration = 111, 
		RULE_protocol_method_declaration = 112, RULE_protocol_initializer_declaration = 113, 
		RULE_protocol_subscript_declaration = 114, RULE_protocol_associated_type_declaration = 115, 
		RULE_initializer_declaration = 116, RULE_initializer_head = 117, RULE_initializer_body = 118, 
		RULE_deinitializer_declaration = 119, RULE_extension_declaration = 120, 
		RULE_extension_body = 121, RULE_subscript_declaration = 122, RULE_subscript_head = 123, 
		RULE_subscript_result = 124, RULE_operator_declaration = 125, RULE_prefix_operator_declaration = 126, 
		RULE_postfix_operator_declaration = 127, RULE_infix_operator_declaration = 128, 
		RULE_infix_operator_attributes = 129, RULE_precedence_clause = 130, RULE_precedence_level = 131, 
		RULE_associativity_clause = 132, RULE_associativity = 133, RULE_pattern = 134, 
		RULE_wildcard_pattern = 135, RULE_identifier_pattern = 136, RULE_value_binding_pattern = 137, 
		RULE_tuple_pattern = 138, RULE_tuple_pattern_element_list = 139, RULE_tuple_pattern_element = 140, 
		RULE_enum_case_pattern = 141, RULE_type_casting_pattern = 142, RULE_is_pattern = 143, 
		RULE_as_pattern = 144, RULE_expression_pattern = 145, RULE_attribute = 146, 
		RULE_attribute_name = 147, RULE_attribute_argument_clause = 148, RULE_attributes = 149, 
		RULE_balanced_tokens = 150, RULE_balanced_token = 151, RULE_expression_list = 152, 
		RULE_expression = 153, RULE_in_out_expression = 154, RULE_assignment_operator = 155, 
		RULE_conditional_operator = 156, RULE_type_casting_operator = 157, RULE_trailing_closure = 158, 
		RULE_primary_expression = 159, RULE_literal_expression = 160, RULE_array_literal = 161, 
		RULE_array_literal_items = 162, RULE_array_literal_item = 163, RULE_dictionary_literal = 164, 
		RULE_dictionary_literal_items = 165, RULE_dictionary_literal_item = 166, 
		RULE_self_expression = 167, RULE_superclass_expression = 168, RULE_superclass_method_expression = 169, 
		RULE_superclass_subscript_expression = 170, RULE_superclass_initializer_expression = 171, 
		RULE_closure_expression = 172, RULE_closure_signature = 173, RULE_capture_list = 174, 
		RULE_capture_specifier = 175, RULE_implicit_member_expression = 176, RULE_parenthesized_expression = 177, 
		RULE_expression_element_list = 178, RULE_expression_element = 179, RULE_wildcard_expression = 180, 
		RULE_binary_operator = 181, RULE_prefix_operator = 182, RULE_postfix_operator = 183, 
		RULE_type = 184, RULE_type_annotation = 185, RULE_type_identifier = 186, 
		RULE_type_name = 187, RULE_tuple_type = 188, RULE_tuple_type_body = 189, 
		RULE_tuple_type_element_list = 190, RULE_tuple_type_element = 191, RULE_element_name = 192, 
		RULE_function_type = 193, RULE_array_type = 194, RULE_optional_type = 195, 
		RULE_implicitly_unwrapped_optional_type = 196, RULE_protocol_composition_type = 197, 
		RULE_protocol_identifier_list = 198, RULE_protocol_identifier = 199, RULE_metatype_type = 200, 
		RULE_type_inheritance_clause = 201, RULE_type_inheritance_list = 202, 
		RULE_identifier = 203, RULE_keyword = 204, RULE_context_sensitive_keyword = 205, 
		RULE_identifier_list = 206, RULE_literal = 207, RULE_integer_literal = 208;
	public static final String[] ruleNames = {
		"top_level", "statement", "statements", "loop_statement", "for_statement", 
		"for_init", "for_in_statement", "while_statement", "while_condition", 
		"do_while_statement", "branch_statement", "if_statement", "if_condition", 
		"else_clause", "switch_statement", "switch_cases", "switch_case", "case_label", 
		"case_item_list", "default_label", "guard_clause", "guard_expression", 
		"labeled_statement", "statement_label", "label_name", "control_transfer_statement", 
		"break_statement", "continue_statement", "fallthrough_statement", "return_statement", 
		"generic_parameter_clause", "generic_parameter_list", "generic_parameter", 
		"requirement_clause", "requirement_list", "requirement", "conformance_requirement", 
		"same_type_requirement", "generic_argument_clause", "generic_argument_list", 
		"generic_argument", "declaration", "declarations", "declaration_specifiers", 
		"declaration_specifier", "code_block", "import_declaration", "import_kind", 
		"import_path", "import_path_identifier", "constant_declaration", "pattern_initializer_list", 
		"pattern_initializer", "initializer", "variable_declaration", "variable_declaration_head", 
		"variable_name", "getter_setter_block", "getter_clause", "setter_clause", 
		"setter_name", "getter_setter_keyword_block", "getter_keyword_clause", 
		"setter_keyword_clause", "willSet_didSet_block", "willSet_clause", "didSet_clause", 
		"typealias_declaration", "typealias_head", "typealias_name", "typealias_assignment", 
		"function_declaration", "function_head", "function_name", "function_signature", 
		"function_result", "function_body", "parameter_clauses", "parameter_clause", 
		"parameter_list", "parameter", "parameter_name", "local_parameter_name", 
		"default_argument_clause", "enum_declaration", "union_style_enum", "union_style_enum_members", 
		"union_style_enum_member", "union_style_enum_case_clause", "union_style_enum_case_list", 
		"union_style_enum_case", "enum_name", "enum_case_name", "raw_value_style_enum", 
		"raw_value_style_enum_members", "raw_value_style_enum_member", "raw_value_style_enum_case_clause", 
		"raw_value_style_enum_case_list", "raw_value_style_enum_case", "raw_value_assignment", 
		"struct_declaration", "struct_name", "struct_body", "class_declaration", 
		"class_name", "class_body", "protocol_declaration", "protocol_name", "protocol_body", 
		"protocol_member_declaration", "protocol_member_declarations", "protocol_property_declaration", 
		"protocol_method_declaration", "protocol_initializer_declaration", "protocol_subscript_declaration", 
		"protocol_associated_type_declaration", "initializer_declaration", "initializer_head", 
		"initializer_body", "deinitializer_declaration", "extension_declaration", 
		"extension_body", "subscript_declaration", "subscript_head", "subscript_result", 
		"operator_declaration", "prefix_operator_declaration", "postfix_operator_declaration", 
		"infix_operator_declaration", "infix_operator_attributes", "precedence_clause", 
		"precedence_level", "associativity_clause", "associativity", "pattern", 
		"wildcard_pattern", "identifier_pattern", "value_binding_pattern", "tuple_pattern", 
		"tuple_pattern_element_list", "tuple_pattern_element", "enum_case_pattern", 
		"type_casting_pattern", "is_pattern", "as_pattern", "expression_pattern", 
		"attribute", "attribute_name", "attribute_argument_clause", "attributes", 
		"balanced_tokens", "balanced_token", "expression_list", "expression", 
		"in_out_expression", "assignment_operator", "conditional_operator", "type_casting_operator", 
		"trailing_closure", "primary_expression", "literal_expression", "array_literal", 
		"array_literal_items", "array_literal_item", "dictionary_literal", "dictionary_literal_items", 
		"dictionary_literal_item", "self_expression", "superclass_expression", 
		"superclass_method_expression", "superclass_subscript_expression", "superclass_initializer_expression", 
		"closure_expression", "closure_signature", "capture_list", "capture_specifier", 
		"implicit_member_expression", "parenthesized_expression", "expression_element_list", 
		"expression_element", "wildcard_expression", "binary_operator", "prefix_operator", 
		"postfix_operator", "type", "type_annotation", "type_identifier", "type_name", 
		"tuple_type", "tuple_type_body", "tuple_type_element_list", "tuple_type_element", 
		"element_name", "function_type", "array_type", "optional_type", "implicitly_unwrapped_optional_type", 
		"protocol_composition_type", "protocol_identifier_list", "protocol_identifier", 
		"metatype_type", "type_inheritance_clause", "type_inheritance_list", "identifier", 
		"keyword", "context_sensitive_keyword", "identifier_list", "literal", 
		"integer_literal"
	};

	@Override
	public String getGrammarFileName() { return "Swift.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Top_levelContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode EOF() { return getToken(SwiftParser.EOF, 0); }
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTop_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTop_level(this);
		}
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 37) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (81 - 64)) | (1L << (82 - 64)) | (1L << (Operator - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(421);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(418); statement();
					}
					break;

				case 2:
					{
					setState(419); declaration();
					}
					break;

				case 3:
					{
					setState(420); expression(0);
					}
					break;
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Control_transfer_statementContext control_transfer_statement() {
			return getRuleContext(Control_transfer_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428); expression(0);
				setState(430);
				_la = _input.LA(1);
				if (_la==75) {
					{
					setState(429); match(75);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); declaration();
				setState(434);
				_la = _input.LA(1);
				if (_la==75) {
					{
					setState(433); match(75);
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436); loop_statement();
				setState(438);
				_la = _input.LA(1);
				if (_la==75) {
					{
					setState(437); match(75);
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440); branch_statement();
				setState(442);
				_la = _input.LA(1);
				if (_la==75) {
					{
					setState(441); match(75);
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(444); labeled_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(445); control_transfer_statement();
				setState(447);
				_la = _input.LA(1);
				if (_la==75) {
					{
					setState(446); match(75);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(451); statement();
				}
				}
				setState(454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 37) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (81 - 64)) | (1L << (82 - 64)) | (1L << (Operator - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLoop_statement(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop_statement);
		try {
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456); for_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457); for_in_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458); while_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(459); do_while_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_statement);
		int _la;
		try {
			setState(488);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462); match(71);
				setState(464);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (68 - 65)) | (1L << (70 - 65)) | (1L << (72 - 65)) | (1L << (74 - 65)) | (1L << (76 - 65)) | (1L << (80 - 65)) | (1L << (82 - 65)) | (1L << (Operator - 65)) | (1L << (Identifier - 65)) | (1L << (Binary_literal - 65)) | (1L << (Octal_literal - 65)) | (1L << (Decimal_literal - 65)) | (1L << (Hexadecimal_literal - 65)) | (1L << (Floating_point_literal - 65)) | (1L << (String_literal - 65)))) != 0)) {
					{
					setState(463); for_init();
					}
				}

				setState(466); match(75);
				setState(468);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
					{
					setState(467); expression(0);
					}
				}

				setState(470); match(75);
				setState(472);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(471); expression(0);
					}
					break;
				}
				setState(474); code_block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475); match(71);
				{
				setState(477);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (68 - 65)) | (1L << (70 - 65)) | (1L << (72 - 65)) | (1L << (74 - 65)) | (1L << (76 - 65)) | (1L << (80 - 65)) | (1L << (82 - 65)) | (1L << (Operator - 65)) | (1L << (Identifier - 65)) | (1L << (Binary_literal - 65)) | (1L << (Octal_literal - 65)) | (1L << (Decimal_literal - 65)) | (1L << (Hexadecimal_literal - 65)) | (1L << (Floating_point_literal - 65)) | (1L << (String_literal - 65)))) != 0)) {
					{
					setState(476); for_init();
					}
				}

				setState(479); match(75);
				setState(481);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
					{
					setState(480); expression(0);
					}
				}

				setState(483); match(75);
				setState(485);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(484); expression(0);
					}
					break;
				}
				}
				setState(487); code_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_init(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_init);
		try {
			setState(492);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490); variable_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491); expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_in_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_in_statement(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_in_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494); match(71);
			setState(495); pattern(0);
			setState(496); match(38);
			setState(497); expression(0);
			setState(498); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public While_conditionContext while_condition() {
			return getRuleContext(While_conditionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); match(41);
			setState(501); while_condition();
			setState(502); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public While_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhile_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhile_condition(this);
		}
	}

	public final While_conditionContext while_condition() throws RecognitionException {
		While_conditionContext _localctx = new While_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_condition);
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505); declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public While_conditionContext while_condition() {
			return getRuleContext(While_conditionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508); match(21);
			setState(509); code_block();
			setState(510); match(41);
			setState(511); while_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBranch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBranch_statement(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_branch_statement);
		try {
			setState(515);
			switch (_input.LA(1)) {
			case 44:
				enterOuterAlt(_localctx, 1);
				{
				setState(513); if_statement();
				}
				break;
			case 81:
				enterOuterAlt(_localctx, 2);
				{
				setState(514); switch_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); match(44);
			setState(518); if_condition();
			setState(519); code_block();
			setState(521);
			_la = _input.LA(1);
			if (_la==61) {
				{
				setState(520); else_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIf_condition(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_condition);
		try {
			setState(525);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524); declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElse_clause(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else_clause);
		try {
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); match(61);
				setState(528); code_block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529); match(61);
				setState(530); if_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_statement(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533); match(81);
			setState(534); expression(0);
			setState(535); match(53);
			setState(537);
			_la = _input.LA(1);
			if (_la==20 || _la==39) {
				{
				setState(536); switch_cases();
				}
			}

			setState(539); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_casesContext extends ParserRuleContext {
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Switch_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_cases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_cases(this);
		}
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); switch_case();
			setState(543);
			_la = _input.LA(1);
			if (_la==20 || _la==39) {
				{
				setState(542); switch_cases();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_caseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Default_labelContext default_label() {
			return getRuleContext(Default_labelContext.class,0);
		}
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_case(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_case);
		try {
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545); case_label();
				setState(546); statements();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548); default_label();
				setState(549); statements();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551); case_label();
				setState(552); match(75);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(554); default_label();
				setState(555); match(75);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_labelContext extends ParserRuleContext {
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCase_label(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); match(20);
			setState(560); case_item_list();
			setState(561); match(43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_item_listContext extends ParserRuleContext {
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public Guard_clauseContext guard_clause(int i) {
			return getRuleContext(Guard_clauseContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public List<Guard_clauseContext> guard_clause() {
			return getRuleContexts(Guard_clauseContext.class);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCase_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCase_item_list(this);
		}
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); pattern(0);
			setState(565);
			_la = _input.LA(1);
			if (_la==83) {
				{
				setState(564); guard_clause();
				}
			}

			setState(567); pattern(0);
			setState(569);
			_la = _input.LA(1);
			if (_la==83) {
				{
				setState(568); guard_clause();
				}
			}

			setState(571); match(40);
			setState(572); case_item_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_labelContext extends ParserRuleContext {
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefault_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefault_label(this);
		}
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); match(39);
			setState(575); match(43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_clauseContext extends ParserRuleContext {
		public Guard_expressionContext guard_expression() {
			return getRuleContext(Guard_expressionContext.class,0);
		}
		public Guard_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGuard_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGuard_clause(this);
		}
	}

	public final Guard_clauseContext guard_clause() throws RecognitionException {
		Guard_clauseContext _localctx = new Guard_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_guard_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); match(83);
			setState(578); guard_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Guard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGuard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGuard_expression(this);
		}
	}

	public final Guard_expressionContext guard_expression() throws RecognitionException {
		Guard_expressionContext _localctx = new Guard_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_guard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public Statement_labelContext statement_label() {
			return getRuleContext(Statement_labelContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabeled_statement(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_labeled_statement);
		try {
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582); statement_label();
				setState(583); loop_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585); statement_label();
				setState(586); switch_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_labelContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatement_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatement_label(this);
		}
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); label_name();
			setState(591); match(43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabel_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabel_name(this);
		}
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_transfer_statementContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Fallthrough_statementContext fallthrough_statement() {
			return getRuleContext(Fallthrough_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Control_transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_transfer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterControl_transfer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitControl_transfer_statement(this);
		}
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_control_transfer_statement);
		try {
			setState(599);
			switch (_input.LA(1)) {
			case 55:
				enterOuterAlt(_localctx, 1);
				{
				setState(595); break_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(596); continue_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 3);
				{
				setState(597); fallthrough_statement();
				}
				break;
			case 73:
				enterOuterAlt(_localctx, 4);
				{
				setState(598); return_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBreak_statement(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(55);
			setState(603);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(602); label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContinue_statement(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); match(8);
			setState(607);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(606); label_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fallthrough_statementContext extends ParserRuleContext {
		public Fallthrough_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthrough_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFallthrough_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFallthrough_statement(this);
		}
	}

	public final Fallthrough_statementContext fallthrough_statement() throws RecognitionException {
		Fallthrough_statementContext _localctx = new Fallthrough_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fallthrough_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611); match(73);
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(612); expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public Requirement_clauseContext requirement_clause() {
			return getRuleContext(Requirement_clauseContext.class,0);
		}
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter_clause(this);
		}
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_generic_parameter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615); match(7);
			setState(616); generic_parameter_list();
			setState(618);
			_la = _input.LA(1);
			if (_la==83) {
				{
				setState(617); requirement_clause();
				}
			}

			setState(620); match(78);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameter_listContext extends ParserRuleContext {
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public Generic_parameterContext generic_parameter() {
			return getRuleContext(Generic_parameterContext.class,0);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter_list(this);
		}
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_generic_parameter_list);
		try {
			setState(627);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622); generic_parameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623); generic_parameter();
				setState(624); match(40);
				setState(625); generic_parameter_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_parameterContext extends ParserRuleContext {
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter(this);
		}
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generic_parameter);
		try {
			setState(638);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629); type_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630); type_name();
				setState(631); match(43);
				setState(632); type_identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634); type_name();
				setState(635); match(43);
				setState(636); protocol_composition_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_clauseContext extends ParserRuleContext {
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement_clause(this);
		}
	}

	public final Requirement_clauseContext requirement_clause() throws RecognitionException {
		Requirement_clauseContext _localctx = new Requirement_clauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_requirement_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); match(83);
			setState(641); requirement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Requirement_listContext extends ParserRuleContext {
		public RequirementContext requirement() {
			return getRuleContext(RequirementContext.class,0);
		}
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement_list(this);
		}
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_requirement_list);
		try {
			setState(648);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643); requirement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644); requirement();
				setState(645); match(40);
				setState(646); requirement_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementContext extends ParserRuleContext {
		public Conformance_requirementContext conformance_requirement() {
			return getRuleContext(Conformance_requirementContext.class,0);
		}
		public Same_type_requirementContext same_type_requirement() {
			return getRuleContext(Same_type_requirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_requirement);
		try {
			setState(652);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650); conformance_requirement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651); same_type_requirement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conformance_requirementContext extends ParserRuleContext {
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConformance_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConformance_requirement(this);
		}
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conformance_requirement);
		try {
			setState(662);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(654); type_identifier();
				setState(655); match(43);
				setState(656); type_identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658); type_identifier();
				setState(659); match(43);
				setState(660); protocol_composition_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_type_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Same_type_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSame_type_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSame_type_requirement(this);
		}
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664); type_identifier();
			setState(665); match(84);
			setState(666); type_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_clauseContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument_clause(this);
		}
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668); match(7);
			setState(669); generic_argument_list();
			setState(670); match(78);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argument_listContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Generic_argumentContext generic_argument() {
			return getRuleContext(Generic_argumentContext.class,0);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument_list(this);
		}
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_generic_argument_list);
		try {
			setState(677);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672); generic_argument();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673); generic_argument();
				setState(674); match(40);
				setState(675); generic_argument_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Generic_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument(this);
		}
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Extension_declarationContext extension_declaration() {
			return getRuleContext(Extension_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Subscript_declarationContext subscript_declaration() {
			return getRuleContext(Subscript_declarationContext.class,0);
		}
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declaration);
		try {
			setState(695);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681); import_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682); constant_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(683); variable_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684); typealias_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(685); function_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(686); enum_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(687); struct_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(688); class_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(689); protocol_declaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(690); initializer_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(691); deinitializer_declaration();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(692); extension_declaration();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(693); subscript_declaration();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(694); operator_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); declaration();
			setState(699);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 37) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (82 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(698); declarations();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration_specifiers(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declaration_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701); declaration_specifier();
			setState(703);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 13) | (1L << 15) | (1L << 32) | (1L << 57) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (70 - 65)) | (1L << (82 - 65)))) != 0)) {
				{
				setState(702); declaration_specifiers();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_specifierContext extends ParserRuleContext {
		public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration_specifier(this);
		}
	}

	public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
		Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declaration_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 13) | (1L << 15) | (1L << 32) | (1L << 57) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (70 - 65)) | (1L << (82 - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707); match(53);
			setState(709);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 8) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 33) | (1L << 37) | (1L << 41) | (1L << 42) | (1L << 44) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 53) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (71 - 64)) | (1L << (72 - 64)) | (1L << (73 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (81 - 64)) | (1L << (82 - 64)) | (1L << (Operator - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(708); statements();
				}
			}

			setState(711); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_declarationContext extends ParserRuleContext {
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_declaration(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(713); attributes();
				}
			}

			setState(716); match(66);
			setState(718);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (32 - 32)) | (1L << (35 - 32)) | (1L << (46 - 32)) | (1L << (49 - 32)) | (1L << (59 - 32)) | (1L << (64 - 32)) | (1L << (79 - 32)))) != 0)) {
				{
				setState(717); import_kind();
				}
			}

			setState(720); import_path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_kindContext extends ParserRuleContext {
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_kind(this);
		}
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_la = _input.LA(1);
			if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (32 - 32)) | (1L << (35 - 32)) | (1L << (46 - 32)) | (1L << (49 - 32)) | (1L << (59 - 32)) | (1L << (64 - 32)) | (1L << (79 - 32)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_pathContext extends ParserRuleContext {
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public Import_path_identifierContext import_path_identifier() {
			return getRuleContext(Import_path_identifierContext.class,0);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_path(this);
		}
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_import_path);
		try {
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724); import_path_identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725); import_path_identifier();
				setState(726);
				matchWildcard();
				setState(727); import_path();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_path_identifierContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(SwiftParser.Operator, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Import_path_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_path_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_path_identifier(this);
		}
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_import_path_identifier);
		try {
			setState(733);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 13:
			case 14:
			case 15:
			case 16:
			case 28:
			case 30:
			case 37:
			case 45:
			case 48:
			case 51:
			case 57:
			case 60:
			case 63:
			case 70:
			case 72:
			case 74:
			case 76:
			case 80:
			case 82:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(731); identifier();
				}
				break;
			case Operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(732); match(Operator);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConstant_declaration(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(735); attributes();
				}
			}

			setState(739);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 13) | (1L << 15) | (1L << 32) | (1L << 57) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (70 - 65)) | (1L << (82 - 65)))) != 0)) {
				{
				setState(738); declaration_specifiers();
				}
			}

			setState(741); match(56);
			setState(742); pattern_initializer_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_initializer_listContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Pattern_initializerContext pattern_initializer() {
			return getRuleContext(Pattern_initializerContext.class,0);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern_initializer_list(this);
		}
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_pattern_initializer_list);
		try {
			setState(749);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744); pattern_initializer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745); pattern_initializer();
				setState(746); match(40);
				setState(747); pattern_initializer_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_initializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern_initializer(this);
		}
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_pattern_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751); pattern(0);
			setState(753);
			_la = _input.LA(1);
			if (_la==29) {
				{
				setState(752); initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755); match(29);
			setState(756); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variable_declaration);
		int _la;
		try {
			setState(784);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758); variable_declaration_head();
				setState(759); pattern_initializer_list();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761); variable_declaration_head();
				setState(762); variable_name();
				setState(763); type_annotation();
				setState(764); code_block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766); variable_declaration_head();
				setState(767); variable_name();
				setState(768); type_annotation();
				setState(769); getter_setter_block();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(771); variable_declaration_head();
				setState(772); variable_name();
				setState(773); type_annotation();
				setState(774); getter_setter_keyword_block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(776); variable_declaration_head();
				setState(777); variable_name();
				setState(778); type_annotation();
				setState(780);
				_la = _input.LA(1);
				if (_la==29) {
					{
					setState(779); initializer();
					}
				}

				setState(782); willSet_didSet_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaration_headContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Variable_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_declaration_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_declaration_head(this);
		}
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(786); attributes();
				}
			}

			setState(790);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 13) | (1L << 15) | (1L << 32) | (1L << 57) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (70 - 65)) | (1L << (82 - 65)))) != 0)) {
				{
				setState(789); declaration_specifiers();
				}
			}

			setState(792); match(46);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_name(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_setter_blockContext extends ParserRuleContext {
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_setter_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_setter_block(this);
		}
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_getter_setter_block);
		int _la;
		try {
			setState(808);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(796); match(53);
				setState(797); getter_clause();
				setState(799);
				_la = _input.LA(1);
				if (_la==27 || _la==48) {
					{
					setState(798); setter_clause();
					}
				}

				setState(801); match(17);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803); match(53);
				setState(804); setter_clause();
				setState(805); getter_clause();
				setState(806); match(17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_clause(this);
		}
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(810); attributes();
				}
			}

			setState(813); match(37);
			setState(814); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_clauseContext extends ParserRuleContext {
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Setter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_clause(this);
		}
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(816); attributes();
				}
			}

			setState(819); match(48);
			setState(821);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(820); setter_name();
				}
			}

			setState(823); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_name(this);
		}
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(825); identifier();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_setter_keyword_blockContext extends ParserRuleContext {
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_setter_keyword_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_setter_keyword_block(this);
		}
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(839);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827); match(53);
				setState(828); getter_keyword_clause();
				setState(830);
				_la = _input.LA(1);
				if (_la==27 || _la==48) {
					{
					setState(829); setter_keyword_clause();
					}
				}

				setState(832); match(17);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834); match(53);
				setState(835); setter_keyword_clause();
				setState(836); getter_keyword_clause();
				setState(837); match(17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_keyword_clause(this);
		}
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(841); attributes();
				}
			}

			setState(844); match(37);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_keyword_clause(this);
		}
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(846); attributes();
				}
			}

			setState(849); match(48);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSet_didSet_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSet_didSet_block(this);
		}
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(863);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851); match(53);
				setState(852); willSet_clause();
				setState(854);
				_la = _input.LA(1);
				if (_la==27 || _la==30) {
					{
					setState(853); didSet_clause();
					}
				}

				setState(856); match(17);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858); match(53);
				setState(859); didSet_clause();
				setState(860); willSet_clause();
				setState(861); match(17);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSet_clauseContext extends ParserRuleContext {
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public WillSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSet_clause(this);
		}
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(865); attributes();
				}
			}

			setState(868); match(76);
			setState(870);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(869); setter_name();
				}
			}

			setState(872); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DidSet_clauseContext extends ParserRuleContext {
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public DidSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDidSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDidSet_clause(this);
		}
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(874); attributes();
				}
			}

			setState(877); match(30);
			setState(879);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(878); setter_name();
				}
			}

			setState(881); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_declarationContext extends ParserRuleContext {
		public Typealias_headContext typealias_head() {
			return getRuleContext(Typealias_headContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_declaration(this);
		}
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typealias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883); typealias_head();
			setState(884); typealias_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_headContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public Typealias_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_head(this);
		}
	}

	public final Typealias_headContext typealias_head() throws RecognitionException {
		Typealias_headContext _localctx = new Typealias_headContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typealias_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886); match(49);
			setState(887); typealias_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Typealias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_name(this);
		}
	}

	public final Typealias_nameContext typealias_name() throws RecognitionException {
		Typealias_nameContext _localctx = new Typealias_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typealias_assignmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typealias_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_assignment(this);
		}
	}

	public final Typealias_assignmentContext typealias_assignment() throws RecognitionException {
		Typealias_assignmentContext _localctx = new Typealias_assignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891); match(29);
			setState(892); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_declarationContext extends ParserRuleContext {
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894); function_head();
			setState(895); function_name();
			setState(897);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(896); generic_parameter_clause();
				}
			}

			setState(899); function_signature();
			setState(900); function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_headContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_head(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(902); attributes();
				}
			}

			setState(906);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 13) | (1L << 15) | (1L << 32) | (1L << 57) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (70 - 65)) | (1L << (82 - 65)))) != 0)) {
				{
				setState(905); declaration_specifiers();
				}
			}

			setState(908); match(59);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(SwiftParser.Operator, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_function_name);
		try {
			setState(912);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 13:
			case 14:
			case 15:
			case 16:
			case 28:
			case 30:
			case 37:
			case 45:
			case 48:
			case 51:
			case 57:
			case 60:
			case 63:
			case 70:
			case 72:
			case 74:
			case 76:
			case 80:
			case 82:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(910); identifier();
				}
				break;
			case Operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(911); match(Operator);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_signatureContext extends ParserRuleContext {
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_signature(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_function_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914); parameter_clauses();
			setState(916);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(915); function_result();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_resultContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_result(this);
		}
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_function_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918); match(23);
			setState(920);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(919); attributes();
				}
			}

			setState(922); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_body(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_clausesContext extends ParserRuleContext {
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Parameter_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_clauses(this);
		}
	}

	public final Parameter_clausesContext parameter_clauses() throws RecognitionException {
		Parameter_clausesContext _localctx = new Parameter_clausesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_parameter_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926); parameter_clause();
			setState(928);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(927); parameter_clauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_clauseContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_clause(this);
		}
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_parameter_clause);
		int _la;
		try {
			setState(939);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930); match(42);
				setState(931); match(24);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932); match(42);
				setState(933); parameter_list();
				setState(935);
				_la = _input.LA(1);
				if (_la==52) {
					{
					setState(934); match(52);
					}
				}

				setState(937); match(24);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_parameter_list);
		try {
			setState(946);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941); parameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942); parameter();
				setState(943); match(40);
				setState(944); parameter_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_parameter);
		int _la;
		try {
			setState(984);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(948); match(16);
					}
					break;
				}
				setState(952);
				_la = _input.LA(1);
				if (_la==56) {
					{
					setState(951); match(56);
					}
				}

				setState(955);
				_la = _input.LA(1);
				if (_la==85) {
					{
					setState(954); match(85);
					}
				}

				setState(957); parameter_name();
				setState(959);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)) | (1L << (Identifier - 70)))) != 0)) {
					{
					setState(958); local_parameter_name();
					}
				}

				setState(961); type_annotation();
				setState(963);
				_la = _input.LA(1);
				if (_la==29) {
					{
					setState(962); default_argument_clause();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				_la = _input.LA(1);
				if (_la==16) {
					{
					setState(965); match(16);
					}
				}

				setState(968); match(46);
				setState(970);
				_la = _input.LA(1);
				if (_la==85) {
					{
					setState(969); match(85);
					}
				}

				setState(972); parameter_name();
				setState(974);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)) | (1L << (Identifier - 70)))) != 0)) {
					{
					setState(973); local_parameter_name();
					}
				}

				setState(976); type_annotation();
				setState(978);
				_la = _input.LA(1);
				if (_la==29) {
					{
					setState(977); default_argument_clause();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(981);
				_la = _input.LA(1);
				if (_la==27) {
					{
					setState(980); attributes();
					}
				}

				setState(983); type(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_parameter_name);
		try {
			setState(988);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 13:
			case 14:
			case 15:
			case 16:
			case 28:
			case 30:
			case 37:
			case 45:
			case 48:
			case 51:
			case 57:
			case 60:
			case 63:
			case 70:
			case 72:
			case 74:
			case 76:
			case 80:
			case 82:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(986); identifier();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(987); match(25);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLocal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLocal_parameter_name(this);
		}
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_local_parameter_name);
		try {
			setState(992);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 13:
			case 14:
			case 15:
			case 16:
			case 28:
			case 30:
			case 37:
			case 45:
			case 48:
			case 51:
			case 57:
			case 60:
			case 63:
			case 70:
			case 72:
			case 74:
			case 76:
			case 80:
			case 82:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(990); identifier();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(991); match(25);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_argument_clauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefault_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefault_argument_clause(this);
		}
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994); match(29);
			setState(995); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declarationContext extends ParserRuleContext {
		public Raw_value_style_enumContext raw_value_style_enum() {
			return getRuleContext(Raw_value_style_enumContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Union_style_enumContext union_style_enum() {
			return getRuleContext(Union_style_enumContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_declaration(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enum_declaration);
		int _la;
		try {
			setState(1005);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				_la = _input.LA(1);
				if (_la==27) {
					{
					setState(997); attributes();
					}
				}

				setState(1000); union_style_enum();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				_la = _input.LA(1);
				if (_la==27) {
					{
					setState(1001); attributes();
					}
				}

				setState(1004); raw_value_style_enum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enumContext extends ParserRuleContext {
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum(this);
		}
	}

	public final Union_style_enumContext union_style_enum() throws RecognitionException {
		Union_style_enumContext _localctx = new Union_style_enumContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007); enum_name();
			setState(1009);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1008); generic_parameter_clause();
				}
			}

			setState(1011); match(53);
			setState(1013);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 20) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 37) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (82 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1012); union_style_enum_members();
				}
			}

			setState(1015); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_membersContext extends ParserRuleContext {
		public Union_style_enum_memberContext union_style_enum_member() {
			return getRuleContext(Union_style_enum_memberContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_members(this);
		}
	}

	public final Union_style_enum_membersContext union_style_enum_members() throws RecognitionException {
		Union_style_enum_membersContext _localctx = new Union_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017); union_style_enum_member();
			setState(1019);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 20) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 37) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (82 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1018); union_style_enum_members();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_memberContext extends ParserRuleContext {
		public Union_style_enum_case_clauseContext union_style_enum_case_clause() {
			return getRuleContext(Union_style_enum_case_clauseContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Union_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_member(this);
		}
	}

	public final Union_style_enum_memberContext union_style_enum_member() throws RecognitionException {
		Union_style_enum_memberContext _localctx = new Union_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_union_style_enum_member);
		try {
			setState(1023);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022); union_style_enum_case_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_case_clauseContext extends ParserRuleContext {
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Union_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case_clause(this);
		}
	}

	public final Union_style_enum_case_clauseContext union_style_enum_case_clause() throws RecognitionException {
		Union_style_enum_case_clauseContext _localctx = new Union_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1025); attributes();
				}
			}

			setState(1028); match(20);
			setState(1029); union_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_case_listContext extends ParserRuleContext {
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public Union_style_enum_caseContext union_style_enum_case() {
			return getRuleContext(Union_style_enum_caseContext.class,0);
		}
		public Union_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case_list(this);
		}
	}

	public final Union_style_enum_case_listContext union_style_enum_case_list() throws RecognitionException {
		Union_style_enum_case_listContext _localctx = new Union_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_union_style_enum_case_list);
		try {
			setState(1036);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1031); union_style_enum_case();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032); union_style_enum_case();
				setState(1033); match(40);
				setState(1034); union_style_enum_case_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_style_enum_caseContext extends ParserRuleContext {
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Union_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case(this);
		}
	}

	public final Union_style_enum_caseContext union_style_enum_case() throws RecognitionException {
		Union_style_enum_caseContext _localctx = new Union_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038); enum_case_name();
			setState(1040);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(1039); tuple_type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_name(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_case_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_case_name(this);
		}
	}

	public final Enum_case_nameContext enum_case_name() throws RecognitionException {
		Enum_case_nameContext _localctx = new Enum_case_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enumContext extends ParserRuleContext {
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Raw_value_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum(this);
		}
	}

	public final Raw_value_style_enumContext raw_value_style_enum() throws RecognitionException {
		Raw_value_style_enumContext _localctx = new Raw_value_style_enumContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046); enum_name();
			setState(1048);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1047); generic_parameter_clause();
				}
			}

			setState(1050); match(43);
			setState(1051); type_identifier();
			setState(1052); match(53);
			setState(1054);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 20) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 37) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (82 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1053); raw_value_style_enum_members();
				}
			}

			setState(1056); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_membersContext extends ParserRuleContext {
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Raw_value_style_enum_memberContext raw_value_style_enum_member() {
			return getRuleContext(Raw_value_style_enum_memberContext.class,0);
		}
		public Raw_value_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_members(this);
		}
	}

	public final Raw_value_style_enum_membersContext raw_value_style_enum_members() throws RecognitionException {
		Raw_value_style_enum_membersContext _localctx = new Raw_value_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); raw_value_style_enum_member();
			setState(1060);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 20) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 37) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (82 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1059); raw_value_style_enum_members();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() {
			return getRuleContext(Raw_value_style_enum_case_clauseContext.class,0);
		}
		public Raw_value_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_member(this);
		}
	}

	public final Raw_value_style_enum_memberContext raw_value_style_enum_member() throws RecognitionException {
		Raw_value_style_enum_memberContext _localctx = new Raw_value_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_raw_value_style_enum_member);
		try {
			setState(1064);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063); raw_value_style_enum_case_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_case_clauseContext extends ParserRuleContext {
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case_clause(this);
		}
	}

	public final Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() throws RecognitionException {
		Raw_value_style_enum_case_clauseContext _localctx = new Raw_value_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1066); attributes();
				}
			}

			setState(1069); match(20);
			setState(1070); raw_value_style_enum_case_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_case_listContext extends ParserRuleContext {
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public Raw_value_style_enum_caseContext raw_value_style_enum_case() {
			return getRuleContext(Raw_value_style_enum_caseContext.class,0);
		}
		public Raw_value_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case_list(this);
		}
	}

	public final Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() throws RecognitionException {
		Raw_value_style_enum_case_listContext _localctx = new Raw_value_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_raw_value_style_enum_case_list);
		try {
			setState(1077);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072); raw_value_style_enum_case();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073); raw_value_style_enum_case();
				setState(1074); match(40);
				setState(1075); raw_value_style_enum_case_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Raw_value_assignmentContext raw_value_assignment() {
			return getRuleContext(Raw_value_assignmentContext.class,0);
		}
		public Raw_value_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case(this);
		}
	}

	public final Raw_value_style_enum_caseContext raw_value_style_enum_case() throws RecognitionException {
		Raw_value_style_enum_caseContext _localctx = new Raw_value_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_raw_value_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079); enum_case_name();
			setState(1081);
			_la = _input.LA(1);
			if (_la==29) {
				{
				setState(1080); raw_value_assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_value_assignmentContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Raw_value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_assignment(this);
		}
	}

	public final Raw_value_assignmentContext raw_value_assignment() throws RecognitionException {
		Raw_value_assignmentContext _localctx = new Raw_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083); match(29);
			setState(1084); literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1086); attributes();
				}
			}

			setState(1089); match(64);
			setState(1090); struct_name();
			setState(1092);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1091); generic_parameter_clause();
				}
			}

			setState(1095);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(1094); type_inheritance_clause();
				}
			}

			setState(1097); struct_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_name(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_body(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101); match(53);
			setState(1103);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 37) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (82 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1102); declarations();
				}
			}

			setState(1105); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1107); attributes();
				}
			}

			setState(1110); match(32);
			setState(1111); class_name();
			setState(1113);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1112); generic_parameter_clause();
				}
			}

			setState(1116);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(1115); type_inheritance_clause();
				}
			}

			setState(1118); class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_body(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122); match(53);
			setState(1124);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 37) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (82 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1123); declarations();
				}
			}

			setState(1126); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Protocol_bodyContext protocol_body() {
			return getRuleContext(Protocol_bodyContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_declaration(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1128); attributes();
				}
			}

			setState(1131); match(79);
			setState(1132); protocol_name();
			setState(1134);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(1133); type_inheritance_clause();
				}
			}

			setState(1136); protocol_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_name(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_bodyContext extends ParserRuleContext {
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_body(this);
		}
	}

	public final Protocol_bodyContext protocol_body() throws RecognitionException {
		Protocol_bodyContext _localctx = new Protocol_bodyContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140); match(53);
			setState(1142);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 13) | (1L << 15) | (1L << 26) | (1L << 27) | (1L << 32) | (1L << 46) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (69 - 65)) | (1L << (70 - 65)) | (1L << (82 - 65)))) != 0)) {
				{
				setState(1141); protocol_member_declarations();
				}
			}

			setState(1144); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_member_declarationContext extends ParserRuleContext {
		public Protocol_initializer_declarationContext protocol_initializer_declaration() {
			return getRuleContext(Protocol_initializer_declarationContext.class,0);
		}
		public Protocol_associated_type_declarationContext protocol_associated_type_declaration() {
			return getRuleContext(Protocol_associated_type_declarationContext.class,0);
		}
		public Protocol_property_declarationContext protocol_property_declaration() {
			return getRuleContext(Protocol_property_declarationContext.class,0);
		}
		public Protocol_subscript_declarationContext protocol_subscript_declaration() {
			return getRuleContext(Protocol_subscript_declarationContext.class,0);
		}
		public Protocol_method_declarationContext protocol_method_declaration() {
			return getRuleContext(Protocol_method_declarationContext.class,0);
		}
		public Protocol_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_member_declaration(this);
		}
	}

	public final Protocol_member_declarationContext protocol_member_declaration() throws RecognitionException {
		Protocol_member_declarationContext _localctx = new Protocol_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_protocol_member_declaration);
		try {
			setState(1151);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146); protocol_property_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147); protocol_method_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1148); protocol_initializer_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1149); protocol_subscript_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1150); protocol_associated_type_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_member_declarationsContext extends ParserRuleContext {
		public Protocol_member_declarationContext protocol_member_declaration() {
			return getRuleContext(Protocol_member_declarationContext.class,0);
		}
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_member_declarations(this);
		}
	}

	public final Protocol_member_declarationsContext protocol_member_declarations() throws RecognitionException {
		Protocol_member_declarationsContext _localctx = new Protocol_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_protocol_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153); protocol_member_declaration();
			setState(1155);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 13) | (1L << 15) | (1L << 26) | (1L << 27) | (1L << 32) | (1L << 46) | (1L << 49) | (1L << 54) | (1L << 57) | (1L << 59) | (1L << 63))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (69 - 65)) | (1L << (70 - 65)) | (1L << (82 - 65)))) != 0)) {
				{
				setState(1154); protocol_member_declarations();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_property_declarationContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_property_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_property_declaration(this);
		}
	}

	public final Protocol_property_declarationContext protocol_property_declaration() throws RecognitionException {
		Protocol_property_declarationContext _localctx = new Protocol_property_declarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157); variable_declaration_head();
			setState(1158); variable_name();
			setState(1159); type_annotation();
			setState(1160); getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_method_declarationContext extends ParserRuleContext {
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Protocol_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_method_declaration(this);
		}
	}

	public final Protocol_method_declarationContext protocol_method_declaration() throws RecognitionException {
		Protocol_method_declarationContext _localctx = new Protocol_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162); function_head();
			setState(1163); function_name();
			setState(1165);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1164); generic_parameter_clause();
				}
			}

			setState(1167); function_signature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_initializer_declarationContext extends ParserRuleContext {
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Protocol_initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_initializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_initializer_declaration(this);
		}
	}

	public final Protocol_initializer_declarationContext protocol_initializer_declaration() throws RecognitionException {
		Protocol_initializer_declarationContext _localctx = new Protocol_initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_protocol_initializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169); initializer_head();
			setState(1171);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1170); generic_parameter_clause();
				}
			}

			setState(1173); parameter_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Protocol_subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_subscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_subscript_declaration(this);
		}
	}

	public final Protocol_subscript_declarationContext protocol_subscript_declaration() throws RecognitionException {
		Protocol_subscript_declarationContext _localctx = new Protocol_subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175); subscript_head();
			setState(1176); subscript_result();
			setState(1177); getter_setter_keyword_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_associated_type_declarationContext extends ParserRuleContext {
		public Typealias_headContext typealias_head() {
			return getRuleContext(Typealias_headContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Protocol_associated_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_associated_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_associated_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_associated_type_declaration(this);
		}
	}

	public final Protocol_associated_type_declarationContext protocol_associated_type_declaration() throws RecognitionException {
		Protocol_associated_type_declarationContext _localctx = new Protocol_associated_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179); typealias_head();
			setState(1181);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(1180); type_inheritance_clause();
				}
			}

			setState(1184);
			_la = _input.LA(1);
			if (_la==29) {
				{
				setState(1183); typealias_assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_declarationContext extends ParserRuleContext {
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Initializer_bodyContext initializer_body() {
			return getRuleContext(Initializer_bodyContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_declaration(this);
		}
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_initializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186); initializer_head();
			setState(1188);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1187); generic_parameter_clause();
				}
			}

			setState(1190); parameter_clause();
			setState(1191); initializer_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Initializer_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_head(this);
		}
	}

	public final Initializer_headContext initializer_head() throws RecognitionException {
		Initializer_headContext _localctx = new Initializer_headContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_initializer_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1193); attributes();
				}
			}

			setState(1197);
			_la = _input.LA(1);
			if (_la==26) {
				{
				setState(1196); match(26);
				}
			}

			setState(1199); match(54);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Initializer_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_body(this);
		}
	}

	public final Initializer_bodyContext initializer_body() throws RecognitionException {
		Initializer_bodyContext _localctx = new Initializer_bodyContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deinitializer_declarationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Deinitializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeinitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeinitializer_declaration(this);
		}
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1203); attributes();
				}
			}

			setState(1206); match(58);
			setState(1207); code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_declarationContext extends ParserRuleContext {
		public Extension_bodyContext extension_body() {
			return getRuleContext(Extension_bodyContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Extension_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtension_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtension_declaration(this);
		}
	}

	public final Extension_declarationContext extension_declaration() throws RecognitionException {
		Extension_declarationContext _localctx = new Extension_declarationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_extension_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209); match(77);
			setState(1210); type_identifier();
			setState(1212);
			_la = _input.LA(1);
			if (_la==43) {
				{
				setState(1211); type_inheritance_clause();
				}
			}

			setState(1214); extension_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extension_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Extension_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtension_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtension_body(this);
		}
	}

	public final Extension_bodyContext extension_body() throws RecognitionException {
		Extension_bodyContext _localctx = new Extension_bodyContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216); match(53);
			setState(1218);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 37) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 49) | (1L << 51) | (1L << 54) | (1L << 56) | (1L << 57) | (1L << 58) | (1L << 59) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (69 - 64)) | (1L << (70 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (80 - 64)) | (1L << (82 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1217); declarations();
				}
			}

			setState(1220); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_declarationContext extends ParserRuleContext {
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_declaration(this);
		}
	}

	public final Subscript_declarationContext subscript_declaration() throws RecognitionException {
		Subscript_declarationContext _localctx = new Subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_subscript_declaration);
		try {
			setState(1234);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222); subscript_head();
				setState(1223); subscript_result();
				setState(1224); code_block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226); subscript_head();
				setState(1227); subscript_result();
				setState(1228); getter_setter_block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1230); subscript_head();
				setState(1231); subscript_result();
				setState(1232); getter_setter_keyword_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_headContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Subscript_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_head(this);
		}
	}

	public final Subscript_headContext subscript_head() throws RecognitionException {
		Subscript_headContext _localctx = new Subscript_headContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1236); attributes();
				}
			}

			setState(1239); match(69);
			setState(1240); parameter_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subscript_resultContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Subscript_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_result(this);
		}
	}

	public final Subscript_resultContext subscript_result() throws RecognitionException {
		Subscript_resultContext _localctx = new Subscript_resultContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_subscript_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242); match(23);
			setState(1244);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1243); attributes();
				}
			}

			setState(1246); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_declarationContext extends ParserRuleContext {
		public Postfix_operator_declarationContext postfix_operator_declaration() {
			return getRuleContext(Postfix_operator_declarationContext.class,0);
		}
		public Prefix_operator_declarationContext prefix_operator_declaration() {
			return getRuleContext(Prefix_operator_declarationContext.class,0);
		}
		public Infix_operator_declarationContext infix_operator_declaration() {
			return getRuleContext(Infix_operator_declarationContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator_declaration(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_operator_declaration);
		try {
			setState(1251);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1248); prefix_operator_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249); postfix_operator_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1250); infix_operator_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefix_operator_declaration(this);
		}
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253); match(72);
			setState(1254); match(74);
			setState(1255); match(72);
			setState(1256); match(53);
			setState(1257); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_operator_declaration(this);
		}
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259); match(72);
			setState(1260); match(14);
			setState(1261); match(72);
			setState(1262); match(53);
			setState(1263); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public Infix_operator_attributesContext infix_operator_attributes() {
			return getRuleContext(Infix_operator_attributesContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfix_operator_declaration(this);
		}
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265); match(72);
			setState(1266); match(60);
			setState(1267); match(72);
			setState(1268); match(53);
			setState(1269); infix_operator_attributes();
			setState(1270); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_operator_attributesContext extends ParserRuleContext {
		public Precedence_clauseContext precedence_clause() {
			return getRuleContext(Precedence_clauseContext.class,0);
		}
		public Associativity_clauseContext associativity_clause() {
			return getRuleContext(Associativity_clauseContext.class,0);
		}
		public Infix_operator_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfix_operator_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfix_operator_attributes(this);
		}
	}

	public final Infix_operator_attributesContext infix_operator_attributes() throws RecognitionException {
		Infix_operator_attributesContext _localctx = new Infix_operator_attributesContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_infix_operator_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			_la = _input.LA(1);
			if (_la==51) {
				{
				setState(1272); precedence_clause();
				}
			}

			setState(1276);
			_la = _input.LA(1);
			if (_la==28) {
				{
				setState(1275); associativity_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_clauseContext extends ParserRuleContext {
		public Precedence_levelContext precedence_level() {
			return getRuleContext(Precedence_levelContext.class,0);
		}
		public Precedence_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedence_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedence_clause(this);
		}
	}

	public final Precedence_clauseContext precedence_clause() throws RecognitionException {
		Precedence_clauseContext _localctx = new Precedence_clauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_precedence_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278); match(51);
			setState(1279); precedence_level();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precedence_levelContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Precedence_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedence_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedence_level(this);
		}
	}

	public final Precedence_levelContext precedence_level() throws RecognitionException {
		Precedence_levelContext _localctx = new Precedence_levelContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_precedence_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281); integer_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associativity_clauseContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public Associativity_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativity_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativity_clause(this);
		}
	}

	public final Associativity_clauseContext associativity_clause() throws RecognitionException {
		Associativity_clauseContext _localctx = new Associativity_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_associativity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283); match(28);
			setState(1284); associativity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativity(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==45 || _la==80) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public int _p;
		public Enum_case_patternContext enum_case_pattern() {
			return getRuleContext(Enum_case_patternContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Expression_patternContext expression_pattern() {
			return getRuleContext(Expression_patternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PatternContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState, _p);
		PatternContext _prevctx = _localctx;
		int _startState = 268;
		enterRecursionRule(_localctx, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1289); wildcard_pattern();
				setState(1291);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1290); type_annotation();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(1293); identifier_pattern();
				setState(1295);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1294); type_annotation();
					}
					break;
				}
				}
				break;

			case 3:
				{
				setState(1297); value_binding_pattern();
				}
				break;

			case 4:
				{
				setState(1298); tuple_pattern();
				setState(1300);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1299); type_annotation();
					}
					break;
				}
				}
				break;

			case 5:
				{
				setState(1302); enum_case_pattern();
				}
				break;

			case 6:
				{
				setState(1303); match(67);
				setState(1304); type(0);
				}
				break;

			case 7:
				{
				setState(1305); expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1308);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(1309); match(50);
					setState(1310); type(0);
					}
					} 
				}
				setState(1315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Wildcard_patternContext extends ParserRuleContext {
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcard_pattern(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316); match(25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_patternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier_pattern(this);
		}
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_binding_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterValue_binding_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitValue_binding_pattern(this);
		}
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_value_binding_pattern);
		try {
			setState(1324);
			switch (_input.LA(1)) {
			case 46:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320); match(46);
				setState(1321); pattern(0);
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 2);
				{
				setState(1322); match(56);
				setState(1323); pattern(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_patternContext extends ParserRuleContext {
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_tuple_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326); match(42);
			setState(1328);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 46) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 56) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (67 - 67)) | (1L << (68 - 67)) | (1L << (70 - 67)) | (1L << (72 - 67)) | (1L << (74 - 67)) | (1L << (76 - 67)) | (1L << (80 - 67)) | (1L << (82 - 67)) | (1L << (Operator - 67)) | (1L << (Identifier - 67)) | (1L << (Binary_literal - 67)) | (1L << (Octal_literal - 67)) | (1L << (Decimal_literal - 67)) | (1L << (Hexadecimal_literal - 67)) | (1L << (Floating_point_literal - 67)) | (1L << (String_literal - 67)))) != 0)) {
				{
				setState(1327); tuple_pattern_element_list();
				}
			}

			setState(1330); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_element_listContext extends ParserRuleContext {
		public List<Tuple_pattern_elementContext> tuple_pattern_element() {
			return getRuleContexts(Tuple_pattern_elementContext.class);
		}
		public Tuple_pattern_elementContext tuple_pattern_element(int i) {
			return getRuleContext(Tuple_pattern_elementContext.class,i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern_element_list(this);
		}
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332); tuple_pattern_element();
			setState(1337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==40) {
				{
				{
				setState(1333); match(40);
				setState(1334); tuple_pattern_element();
				}
				}
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_pattern_elementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Tuple_pattern_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern_element(this);
		}
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340); pattern(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_case_patternContext extends ParserRuleContext {
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Enum_case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_case_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_case_pattern(this);
		}
	}

	public final Enum_case_patternContext enum_case_pattern() throws RecognitionException {
		Enum_case_patternContext _localctx = new Enum_case_patternContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(1342); type_identifier();
				}
			}

			setState(1345); match(68);
			setState(1346); enum_case_name();
			setState(1348);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1347); tuple_pattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_casting_patternContext extends ParserRuleContext {
		public As_patternContext as_pattern() {
			return getRuleContext(As_patternContext.class,0);
		}
		public Is_patternContext is_pattern() {
			return getRuleContext(Is_patternContext.class,0);
		}
		public Type_casting_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_casting_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_casting_pattern(this);
		}
	}

	public final Type_casting_patternContext type_casting_pattern() throws RecognitionException {
		Type_casting_patternContext _localctx = new Type_casting_patternContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_type_casting_pattern);
		try {
			setState(1352);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350); is_pattern();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351); as_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_patternContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Is_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIs_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIs_pattern(this);
		}
	}

	public final Is_patternContext is_pattern() throws RecognitionException {
		Is_patternContext _localctx = new Is_patternContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_is_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354); match(67);
			setState(1355); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class As_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public As_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAs_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAs_pattern(this);
		}
	}

	public final As_patternContext as_pattern() throws RecognitionException {
		As_patternContext _localctx = new As_patternContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_as_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357); pattern(0);
			setState(1358); match(50);
			setState(1359); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_pattern(this);
		}
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363); match(27);
			setState(1364); attribute_name();
			setState(1366);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1365); attribute_argument_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute_name(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute_argument_clause(this);
		}
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_attribute_argument_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370); match(42);
			setState(1372);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
				{
				setState(1371); balanced_tokens();
				}
			}

			setState(1374); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376); attribute();
			setState(1378);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1377); attributes();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_tokensContext extends ParserRuleContext {
		public Balanced_tokenContext balanced_token() {
			return getRuleContext(Balanced_tokenContext.class,0);
		}
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Balanced_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalanced_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalanced_tokens(this);
		}
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_balanced_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380); balanced_token();
			setState(1382);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
				{
				setState(1381); balanced_tokens();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Balanced_tokenContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public TerminalNode Operator() { return getToken(SwiftParser.Operator, 0); }
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalanced_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalanced_token(this);
		}
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_balanced_token);
		int _la;
		try {
			setState(1404);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384); match(42);
				setState(1386);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
					{
					setState(1385); balanced_tokens();
					}
				}

				setState(1388); match(24);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389); match(6);
				setState(1391);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
					{
					setState(1390); balanced_tokens();
					}
				}

				setState(1393); match(36);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1394); match(53);
				setState(1396);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
					{
					setState(1395); balanced_tokens();
					}
				}

				setState(1398); match(17);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1399); identifier();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1400); expression(0);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1401); context_sensitive_keyword();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1402); literal();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1403); match(Operator);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406); expression(0);
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==40) {
				{
				{
				setState(1407); match(40);
				setState(1408); expression(0);
				}
				}
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			switch (_input.LA(1)) {
			case Operator:
				{
				setState(1415); prefix_operator();
				setState(1416); expression(17);
				}
				break;
			case 2:
				{
				setState(1418); in_out_expression();
				}
				break;
			case 1:
			case 3:
			case 4:
			case 6:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 18:
			case 19:
			case 22:
			case 25:
			case 28:
			case 30:
			case 33:
			case 37:
			case 42:
			case 45:
			case 48:
			case 51:
			case 53:
			case 57:
			case 60:
			case 63:
			case 68:
			case 70:
			case 72:
			case 74:
			case 76:
			case 80:
			case 82:
			case Identifier:
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
			case Floating_point_literal:
			case String_literal:
				{
				setState(1419); primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1470);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1422);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(1423); binary_operator();
						setState(1424); expression(0);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1426);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(1427); assignment_operator();
						setState(1428); expression(0);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1430);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(1431); conditional_operator();
						setState(1432); expression(0);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1434);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(1435); type_casting_operator();
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1436);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(1437); postfix_operator();
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1438);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1439); parenthesized_expression();
						setState(1441);
						switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
						case 1:
							{
							setState(1440); trailing_closure();
							}
							break;
						}
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1443);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1444); match(68);
						setState(1445); match(54);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1446);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(1447); match(68);
						setState(1448); match(Decimal_literal);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1449);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(1450); match(68);
						setState(1451); identifier();
						setState(1453);
						switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
						case 1:
							{
							setState(1452); generic_argument_clause();
							}
							break;
						}
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1455);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1456); match(68);
						setState(1457); match(3);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1458);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1459); match(68);
						setState(1460); match(62);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1461);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(1462); match(6);
						setState(1463); expression_list();
						setState(1464); match(36);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1466);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1467); match(34);
						}
						break;

					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1468);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1469); match(47);
						}
						break;
					}
					} 
				}
				setState(1474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class In_out_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIn_out_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIn_out_expression(this);
		}
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475); match(2);
			setState(1476); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478); match(29);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_operatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditional_operator(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480); match(47);
			setState(1481); expression(0);
			setState(1482); match(43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_casting_operatorContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_casting_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_casting_operator(this);
		}
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_type_casting_operator);
		int _la;
		try {
			setState(1491);
			switch (_input.LA(1)) {
			case 67:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484); match(67);
				setState(1485); type(0);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486); match(50);
				setState(1488);
				_la = _input.LA(1);
				if (_la==47) {
					{
					setState(1487); match(47);
					}
				}

				setState(1490); type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trailing_closureContext extends ParserRuleContext {
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Trailing_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTrailing_closure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTrailing_closure(this);
		}
	}

	public final Trailing_closureContext trailing_closure() throws RecognitionException {
		Trailing_closureContext _localctx = new Trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493); closure_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Wildcard_expressionContext wildcard_expression() {
			return getRuleContext(Wildcard_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Superclass_expressionContext superclass_expression() {
			return getRuleContext(Superclass_expressionContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Implicit_member_expressionContext implicit_member_expression() {
			return getRuleContext(Implicit_member_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_primary_expression);
		try {
			setState(1506);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 13:
			case 14:
			case 15:
			case 16:
			case 28:
			case 30:
			case 37:
			case 45:
			case 48:
			case 51:
			case 57:
			case 60:
			case 63:
			case 70:
			case 72:
			case 74:
			case 76:
			case 80:
			case 82:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495); identifier();
				setState(1497);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1496); generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 6:
			case 12:
			case 18:
			case 19:
			case 33:
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
			case Floating_point_literal:
			case String_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1499); literal_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1500); self_expression();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 4);
				{
				setState(1501); superclass_expression();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 5);
				{
				setState(1502); closure_expression();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 6);
				{
				setState(1503); parenthesized_expression();
				}
				break;
			case 68:
				enterOuterAlt(_localctx, 7);
				{
				setState(1504); implicit_member_expression();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 8);
				{
				setState(1505); wildcard_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_expressionContext extends ParserRuleContext {
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Dictionary_literalContext dictionary_literal() {
			return getRuleContext(Dictionary_literalContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteral_expression(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_literal_expression);
		try {
			setState(1515);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1508); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1509); array_literal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1510); dictionary_literal();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1511); match(33);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1512); match(12);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1513); match(18);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1514); match(19);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literalContext extends ParserRuleContext {
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517); match(6);
			setState(1519);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
				{
				setState(1518); array_literal_items();
				}
			}

			setState(1521); match(36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literal_itemsContext extends ParserRuleContext {
		public Array_literal_itemContext array_literal_item(int i) {
			return getRuleContext(Array_literal_itemContext.class,i);
		}
		public List<Array_literal_itemContext> array_literal_item() {
			return getRuleContexts(Array_literal_itemContext.class);
		}
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal_items(this);
		}
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_array_literal_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523); array_literal_item();
			setState(1525);
			_la = _input.LA(1);
			if (_la==40) {
				{
				setState(1524); match(40);
				}
			}

			setState(1527); array_literal_item();
			setState(1528); match(40);
			setState(1529); array_literal_items();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literal_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal_item(this);
		}
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literalContext extends ParserRuleContext {
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public Dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal(this);
		}
	}

	public final Dictionary_literalContext dictionary_literal() throws RecognitionException {
		Dictionary_literalContext _localctx = new Dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_dictionary_literal);
		try {
			setState(1540);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533); match(6);
				setState(1534); dictionary_literal_items();
				setState(1535); match(36);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537); match(6);
				setState(1538); match(43);
				setState(1539); match(36);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literal_itemsContext extends ParserRuleContext {
		public Dictionary_literal_itemContext dictionary_literal_item(int i) {
			return getRuleContext(Dictionary_literal_itemContext.class,i);
		}
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public List<Dictionary_literal_itemContext> dictionary_literal_item() {
			return getRuleContexts(Dictionary_literal_itemContext.class);
		}
		public Dictionary_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal_items(this);
		}
	}

	public final Dictionary_literal_itemsContext dictionary_literal_items() throws RecognitionException {
		Dictionary_literal_itemsContext _localctx = new Dictionary_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_dictionary_literal_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542); dictionary_literal_item();
			setState(1544);
			_la = _input.LA(1);
			if (_la==40) {
				{
				setState(1543); match(40);
				}
			}

			setState(1546); dictionary_literal_item();
			setState(1547); match(40);
			setState(1548); dictionary_literal_items();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dictionary_literal_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Dictionary_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal_item(this);
		}
	}

	public final Dictionary_literal_itemContext dictionary_literal_item() throws RecognitionException {
		Dictionary_literal_itemContext _localctx = new Dictionary_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550); expression(0);
			setState(1551); match(43);
			setState(1552); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Self_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSelf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSelf_expression(this);
		}
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_self_expression);
		try {
			setState(1566);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1554); match(3);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1555); match(3);
				setState(1556); match(68);
				setState(1557); identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1558); match(3);
				setState(1559); match(6);
				setState(1560); expression(0);
				setState(1561); match(36);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1563); match(3);
				setState(1564); match(68);
				setState(1565); match(54);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_expressionContext extends ParserRuleContext {
		public Superclass_subscript_expressionContext superclass_subscript_expression() {
			return getRuleContext(Superclass_subscript_expressionContext.class,0);
		}
		public Superclass_method_expressionContext superclass_method_expression() {
			return getRuleContext(Superclass_method_expressionContext.class,0);
		}
		public Superclass_initializer_expressionContext superclass_initializer_expression() {
			return getRuleContext(Superclass_initializer_expressionContext.class,0);
		}
		public Superclass_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_expression(this);
		}
	}

	public final Superclass_expressionContext superclass_expression() throws RecognitionException {
		Superclass_expressionContext _localctx = new Superclass_expressionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_superclass_expression);
		try {
			setState(1572);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1568); superclass_method_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1569); superclass_subscript_expression();
				setState(1570); superclass_initializer_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_method_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Superclass_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_method_expression(this);
		}
	}

	public final Superclass_method_expressionContext superclass_method_expression() throws RecognitionException {
		Superclass_method_expressionContext _localctx = new Superclass_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_superclass_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574); match(22);
			setState(1575); match(68);
			setState(1576); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_subscript_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Superclass_subscript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_subscript_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_subscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_subscript_expression(this);
		}
	}

	public final Superclass_subscript_expressionContext superclass_subscript_expression() throws RecognitionException {
		Superclass_subscript_expressionContext _localctx = new Superclass_subscript_expressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_superclass_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578); match(22);
			setState(1579); match(6);
			setState(1580); expression(0);
			setState(1581); match(36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_initializer_expressionContext extends ParserRuleContext {
		public Superclass_initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_initializer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_initializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_initializer_expression(this);
		}
	}

	public final Superclass_initializer_expressionContext superclass_initializer_expression() throws RecognitionException {
		Superclass_initializer_expressionContext _localctx = new Superclass_initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_superclass_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583); match(22);
			setState(1584); match(68);
			setState(1585); match(54);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_expressionContext extends ParserRuleContext {
		public Closure_signatureContext closure_signature() {
			return getRuleContext(Closure_signatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosure_expression(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587); match(53);
			setState(1589);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1588); closure_signature();
				}
				break;
			}
			setState(1591); statements();
			setState(1592); match(17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Closure_signatureContext extends ParserRuleContext {
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Closure_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosure_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosure_signature(this);
		}
	}

	public final Closure_signatureContext closure_signature() throws RecognitionException {
		Closure_signatureContext _localctx = new Closure_signatureContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_closure_signature);
		int _la;
		try {
			setState(1623);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594); parameter_clause();
				setState(1596);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(1595); function_result();
					}
				}

				setState(1598); match(38);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600); identifier_list();
				setState(1602);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(1601); function_result();
					}
				}

				setState(1604); match(38);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1606); capture_list();
				setState(1607); parameter_clause();
				setState(1609);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(1608); function_result();
					}
				}

				setState(1611); match(38);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1613); capture_list();
				setState(1614); identifier_list();
				setState(1616);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(1615); function_result();
					}
				}

				setState(1618); match(38);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1620); capture_list();
				setState(1621); match(38);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Capture_specifierContext capture_specifier() {
			return getRuleContext(Capture_specifierContext.class,0);
		}
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCapture_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCapture_list(this);
		}
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625); match(6);
			setState(1626); capture_specifier();
			setState(1627); expression(0);
			setState(1628); match(36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_specifierContext extends ParserRuleContext {
		public Capture_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCapture_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCapture_specifier(this);
		}
	}

	public final Capture_specifierContext capture_specifier() throws RecognitionException {
		Capture_specifierContext _localctx = new Capture_specifierContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			_la = _input.LA(1);
			if ( !(_la==15 || _la==57 || _la==70 || _la==82) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicit_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicit_member_expression(this);
		}
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632); match(68);
			setState(1633); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public Expression_element_listContext expression_element_list() {
			return getRuleContext(Expression_element_listContext.class,0);
		}
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParenthesized_expression(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_parenthesized_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635); match(42);
			setState(1637);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 4) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 33) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 53) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (68 - 68)) | (1L << (70 - 68)) | (1L << (72 - 68)) | (1L << (74 - 68)) | (1L << (76 - 68)) | (1L << (80 - 68)) | (1L << (82 - 68)) | (1L << (Operator - 68)) | (1L << (Identifier - 68)) | (1L << (Binary_literal - 68)) | (1L << (Octal_literal - 68)) | (1L << (Decimal_literal - 68)) | (1L << (Hexadecimal_literal - 68)) | (1L << (Floating_point_literal - 68)) | (1L << (String_literal - 68)))) != 0)) {
				{
				setState(1636); expression_element_list();
				}
			}

			setState(1639); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_element_listContext extends ParserRuleContext {
		public Expression_elementContext expression_element() {
			return getRuleContext(Expression_elementContext.class,0);
		}
		public Expression_element_listContext expression_element_list() {
			return getRuleContext(Expression_element_listContext.class,0);
		}
		public Expression_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_element_list(this);
		}
	}

	public final Expression_element_listContext expression_element_list() throws RecognitionException {
		Expression_element_listContext _localctx = new Expression_element_listContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_expression_element_list);
		try {
			setState(1646);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641); expression_element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1642); expression_element();
				setState(1643); match(40);
				setState(1644); expression_element_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_element(this);
		}
	}

	public final Expression_elementContext expression_element() throws RecognitionException {
		Expression_elementContext _localctx = new Expression_elementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_expression_element);
		try {
			setState(1653);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1649); identifier();
				setState(1650); match(43);
				setState(1651); expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Wildcard_expressionContext extends ParserRuleContext {
		public Wildcard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcard_expression(this);
		}
	}

	public final Wildcard_expressionContext wildcard_expression() throws RecognitionException {
		Wildcard_expressionContext _localctx = new Wildcard_expressionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655); match(25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_operatorContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(SwiftParser.Operator, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinary_operator(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657); match(Operator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_operatorContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(SwiftParser.Operator, 0); }
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefix_operator(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659); match(Operator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_operatorContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(SwiftParser.Operator, 0); }
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_operator(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); match(Operator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public int _p;
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType(this);
		}
	}

	public final TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState, _p);
		TypeContext _prevctx = _localctx;
		int _startState = 368;
		enterRecursionRule(_localctx, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			switch (_input.LA(1)) {
			case 1:
			case 4:
			case 13:
			case 14:
			case 15:
			case 16:
			case 28:
			case 30:
			case 37:
			case 45:
			case 48:
			case 51:
			case 57:
			case 60:
			case 63:
			case 70:
			case 72:
			case 74:
			case 76:
			case 80:
			case 82:
			case Identifier:
				{
				setState(1664); type_identifier();
				}
				break;
			case 42:
				{
				setState(1665); tuple_type();
				}
				break;
			case 79:
				{
				setState(1666); protocol_composition_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1685);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1669);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1670); match(23);
						setState(1671); type(9);
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1672);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(1673); match(6);
						setState(1674); match(36);
						}
						break;

					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1675);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1676); match(47);
						}
						break;

					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1677);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1678); match(34);
						}
						break;

					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1679);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1680); match(68);
						setState(1681); match(9);
						}
						break;

					case 6:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1682);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1683); match(68);
						setState(1684); match(10);
						}
						break;
					}
					} 
				}
				setState(1689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_annotationContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_annotation(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690); match(43);
			setState(1692);
			_la = _input.LA(1);
			if (_la==27) {
				{
				setState(1691); attributes();
				}
			}

			setState(1694); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_identifierContext extends ParserRuleContext {
		public List<Generic_argument_clauseContext> generic_argument_clause() {
			return getRuleContexts(Generic_argument_clauseContext.class);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Generic_argument_clauseContext generic_argument_clause(int i) {
			return getRuleContext(Generic_argument_clauseContext.class,i);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_identifier(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_type_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696); type_name();
			setState(1698);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1697); generic_argument_clause();
				}
			}

			setState(1700); type_name();
			setState(1702);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(1701); generic_argument_clause();
				}
			}

			setState(1704); match(68);
			setState(1705); type_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_typeContext extends ParserRuleContext {
		public Tuple_type_bodyContext tuple_type_body() {
			return getRuleContext(Tuple_type_bodyContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709); match(42);
			setState(1711);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 42) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (79 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(1710); tuple_type_body();
				}
			}

			setState(1713); match(24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_bodyContext extends ParserRuleContext {
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_body(this);
		}
	}

	public final Tuple_type_bodyContext tuple_type_body() throws RecognitionException {
		Tuple_type_bodyContext _localctx = new Tuple_type_bodyContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_tuple_type_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715); tuple_type_element_list();
			setState(1717);
			_la = _input.LA(1);
			if (_la==52) {
				{
				setState(1716); match(52);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public Tuple_type_elementContext tuple_type_element() {
			return getRuleContext(Tuple_type_elementContext.class,0);
		}
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_element_list(this);
		}
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_tuple_type_element_list);
		try {
			setState(1724);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1719); tuple_type_element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1720); tuple_type_element();
				setState(1721); match(40);
				setState(1722); tuple_type_element_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_elementContext extends ParserRuleContext {
		public Element_nameContext element_name() {
			return getRuleContext(Element_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_element(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_tuple_type_element);
		int _la;
		try {
			setState(1739);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1727);
				_la = _input.LA(1);
				if (_la==27) {
					{
					setState(1726); attributes();
					}
				}

				setState(1730);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1729); match(16);
					}
					break;
				}
				setState(1732); type(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1734);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1733); match(16);
					}
					break;
				}
				setState(1736); element_name();
				setState(1737); type_annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElement_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElement_name(this);
		}
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_typeContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_type(this);
		}
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_function_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743); type(0);
			setState(1744); match(23);
			setState(1745); type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_typeContext extends ParserRuleContext {
		public int _p;
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Array_typeContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_type(this);
		}
	}

	public final Array_typeContext array_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_typeContext _localctx = new Array_typeContext(_ctx, _parentState, _p);
		Array_typeContext _prevctx = _localctx;
		int _startState = 388;
		enterRecursionRule(_localctx, RULE_array_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1748); type(0);
			setState(1749); match(6);
			setState(1750); match(36);
			}
			_ctx.stop = _input.LT(-1);
			setState(1757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_typeContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_array_type);
					setState(1752);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(1753); match(6);
					setState(1754); match(36);
					}
					} 
				}
				setState(1759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Optional_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Optional_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptional_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptional_type(this);
		}
	}

	public final Optional_typeContext optional_type() throws RecognitionException {
		Optional_typeContext _localctx = new Optional_typeContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_optional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760); type(0);
			setState(1761); match(47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicitly_unwrapped_optional_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Implicitly_unwrapped_optional_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitly_unwrapped_optional_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicitly_unwrapped_optional_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicitly_unwrapped_optional_type(this);
		}
	}

	public final Implicitly_unwrapped_optional_typeContext implicitly_unwrapped_optional_type() throws RecognitionException {
		Implicitly_unwrapped_optional_typeContext _localctx = new Implicitly_unwrapped_optional_typeContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_implicitly_unwrapped_optional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763); type(0);
			setState(1764); match(34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_composition_typeContext extends ParserRuleContext {
		public Protocol_identifier_listContext protocol_identifier_list() {
			return getRuleContext(Protocol_identifier_listContext.class,0);
		}
		public Protocol_composition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_composition_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_composition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_composition_type(this);
		}
	}

	public final Protocol_composition_typeContext protocol_composition_type() throws RecognitionException {
		Protocol_composition_typeContext _localctx = new Protocol_composition_typeContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_protocol_composition_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766); match(79);
			setState(1767); match(7);
			setState(1769);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(1768); protocol_identifier_list();
				}
			}

			setState(1771); match(78);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_identifier_listContext extends ParserRuleContext {
		public Protocol_identifier_listContext protocol_identifier_list() {
			return getRuleContext(Protocol_identifier_listContext.class,0);
		}
		public Protocol_identifierContext protocol_identifier() {
			return getRuleContext(Protocol_identifierContext.class,0);
		}
		public Protocol_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_identifier_list(this);
		}
	}

	public final Protocol_identifier_listContext protocol_identifier_list() throws RecognitionException {
		Protocol_identifier_listContext _localctx = new Protocol_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_protocol_identifier_list);
		try {
			setState(1778);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1773); protocol_identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774); protocol_identifier();
				setState(1775); match(40);
				setState(1776); protocol_identifier_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_identifierContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_identifier(this);
		}
	}

	public final Protocol_identifierContext protocol_identifier() throws RecognitionException {
		Protocol_identifierContext _localctx = new Protocol_identifierContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780); type_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Metatype_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Metatype_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metatype_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterMetatype_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitMetatype_type(this);
		}
	}

	public final Metatype_typeContext metatype_type() throws RecognitionException {
		Metatype_typeContext _localctx = new Metatype_typeContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_metatype_type);
		try {
			setState(1790);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782); type(0);
				setState(1783); match(68);
				setState(1784); match(9);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1786); type(0);
				setState(1787); match(68);
				setState(1788); match(10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_inheritance_clauseContext extends ParserRuleContext {
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_inheritance_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_inheritance_clause(this);
		}
	}

	public final Type_inheritance_clauseContext type_inheritance_clause() throws RecognitionException {
		Type_inheritance_clauseContext _localctx = new Type_inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_type_inheritance_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792); match(43);
			setState(1793); type_inheritance_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_inheritance_listContext extends ParserRuleContext {
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_inheritance_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_inheritance_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_inheritance_list(this);
		}
	}

	public final Type_inheritance_listContext type_inheritance_list() throws RecognitionException {
		Type_inheritance_listContext _localctx = new Type_inheritance_listContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_type_inheritance_list);
		try {
			setState(1800);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1795); type_identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1796); type_identifier();
				setState(1797); match(40);
				setState(1798); type_inheritance_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SwiftParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_identifier);
		try {
			setState(1804);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802); match(Identifier);
				}
				break;
			case 1:
			case 4:
			case 13:
			case 14:
			case 15:
			case 16:
			case 28:
			case 30:
			case 37:
			case 45:
			case 48:
			case 51:
			case 57:
			case 60:
			case 63:
			case 70:
			case 72:
			case 74:
			case 76:
			case 80:
			case 82:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803); context_sensitive_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 5) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 26) | (1L << 31) | (1L << 32) | (1L << 35) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << 44) | (1L << 46) | (1L << 49) | (1L << 50) | (1L << 54) | (1L << 55) | (1L << 56) | (1L << 58) | (1L << 59) | (1L << 61) | (1L << 62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (65 - 64)) | (1L << (66 - 64)) | (1L << (67 - 64)) | (1L << (69 - 64)) | (1L << (71 - 64)) | (1L << (73 - 64)) | (1L << (77 - 64)) | (1L << (79 - 64)) | (1L << (81 - 64)) | (1L << (83 - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Context_sensitive_keywordContext extends ParserRuleContext {
		public Context_sensitive_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_sensitive_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContext_sensitive_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContext_sensitive_keyword(this);
		}
	}

	public final Context_sensitive_keywordContext context_sensitive_keyword() throws RecognitionException {
		Context_sensitive_keywordContext _localctx = new Context_sensitive_keywordContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_context_sensitive_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 4) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 28) | (1L << 30) | (1L << 37) | (1L << 45) | (1L << 48) | (1L << 51) | (1L << 57) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (70 - 70)) | (1L << (72 - 70)) | (1L << (74 - 70)) | (1L << (76 - 70)) | (1L << (80 - 70)) | (1L << (82 - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_identifier_list);
		try {
			setState(1815);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1810); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1811); identifier();
				setState(1812); match(40);
				setState(1813); identifier_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode String_literal() { return getToken(SwiftParser.String_literal, 0); }
		public TerminalNode Floating_point_literal() { return getToken(SwiftParser.Floating_point_literal, 0); }
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_literal);
		try {
			setState(1820);
			switch (_input.LA(1)) {
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817); integer_literal();
				}
				break;
			case Floating_point_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818); match(Floating_point_literal);
				}
				break;
			case String_literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(1819); match(String_literal);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
		public TerminalNode Octal_literal() { return getToken(SwiftParser.Octal_literal, 0); }
		public TerminalNode Binary_literal() { return getToken(SwiftParser.Binary_literal, 0); }
		public TerminalNode Hexadecimal_literal() { return getToken(SwiftParser.Hexadecimal_literal, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInteger_literal(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (Binary_literal - 89)) | (1L << (Octal_literal - 89)) | (1L << (Decimal_literal - 89)) | (1L << (Hexadecimal_literal - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 134: return pattern_sempred((PatternContext)_localctx, predIndex);

		case 153: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 184: return type_sempred((TypeContext)_localctx, predIndex);

		case 194: return array_type_sempred((Array_typeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 14 >= _localctx._p;

		case 2: return 13 >= _localctx._p;

		case 3: return 12 >= _localctx._p;

		case 4: return 11 >= _localctx._p;

		case 5: return 10 >= _localctx._p;

		case 6: return 9 >= _localctx._p;

		case 7: return 8 >= _localctx._p;

		case 8: return 7 >= _localctx._p;

		case 9: return 6 >= _localctx._p;

		case 10: return 5 >= _localctx._p;

		case 11: return 4 >= _localctx._p;

		case 12: return 3 >= _localctx._p;

		case 13: return 2 >= _localctx._p;

		case 14: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean array_type_sempred(Array_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17: return 5 >= _localctx._p;

		case 16: return 9 >= _localctx._p;

		case 19: return 2 >= _localctx._p;

		case 18: return 4 >= _localctx._p;

		case 20: return 1 >= _localctx._p;

		case 15: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3c\u0723\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\t"+
		"F\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4"+
		"R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]"+
		"\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th"+
		"\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t"+
		"\tt\4u\tu\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177"+
		"\t\177\4\u0080\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083"+
		"\4\u0084\t\u0084\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088"+
		"\t\u0088\4\u0089\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c"+
		"\4\u008d\t\u008d\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091"+
		"\t\u0091\4\u0092\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095"+
		"\4\u0096\t\u0096\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a"+
		"\t\u009a\4\u009b\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e"+
		"\4\u009f\t\u009f\4\u00a0\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3"+
		"\t\u00a3\4\u00a4\t\u00a4\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7"+
		"\4\u00a8\t\u00a8\4\u00a9\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac"+
		"\t\u00ac\4\u00ad\t\u00ad\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0"+
		"\4\u00b1\t\u00b1\4\u00b2\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5"+
		"\t\u00b5\4\u00b6\t\u00b6\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9"+
		"\4\u00ba\t\u00ba\4\u00bb\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be"+
		"\t\u00be\4\u00bf\t\u00bf\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2"+
		"\4\u00c3\t\u00c3\4\u00c4\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7"+
		"\t\u00c7\4\u00c8\t\u00c8\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb"+
		"\4\u00cc\t\u00cc\4\u00cd\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0"+
		"\t\u00d0\4\u00d1\t\u00d1\4\u00d2\t\u00d2\3\2\3\2\3\2\7\2\u01a8\n\2\f\2"+
		"\16\2\u01ab\13\2\3\2\3\2\3\3\3\3\5\3\u01b1\n\3\3\3\3\3\5\3\u01b5\n\3\3"+
		"\3\3\3\5\3\u01b9\n\3\3\3\3\3\5\3\u01bd\n\3\3\3\3\3\3\3\5\3\u01c2\n\3\5"+
		"\3\u01c4\n\3\3\4\6\4\u01c7\n\4\r\4\16\4\u01c8\3\5\3\5\3\5\3\5\5\5\u01cf"+
		"\n\5\3\6\3\6\5\6\u01d3\n\6\3\6\3\6\5\6\u01d7\n\6\3\6\3\6\5\6\u01db\n\6"+
		"\3\6\3\6\3\6\5\6\u01e0\n\6\3\6\3\6\5\6\u01e4\n\6\3\6\3\6\5\6\u01e8\n\6"+
		"\3\6\5\6\u01eb\n\6\3\7\3\7\5\7\u01ef\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\5\n\u01fd\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f"+
		"\u0206\n\f\3\r\3\r\3\r\3\r\5\r\u020c\n\r\3\16\3\16\5\16\u0210\n\16\3\17"+
		"\3\17\3\17\3\17\5\17\u0216\n\17\3\20\3\20\3\20\3\20\5\20\u021c\n\20\3"+
		"\20\3\20\3\21\3\21\5\21\u0222\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0230\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\5\24\u0238\n\24\3\24\3\24\5\24\u023c\n\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u024f"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u025a\n\33\3\34"+
		"\3\34\5\34\u025e\n\34\3\35\3\35\5\35\u0262\n\35\3\36\3\36\3\37\3\37\5"+
		"\37\u0268\n\37\3 \3 \3 \5 \u026d\n \3 \3 \3!\3!\3!\3!\3!\5!\u0276\n!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0281\n\"\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\5$\u028b\n$\3%\3%\5%\u028f\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0299\n&"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u02a8\n)\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02ba\n+\3,\3,\5,\u02be\n,\3-\3"+
		"-\5-\u02c2\n-\3.\3.\3/\3/\5/\u02c8\n/\3/\3/\3\60\5\60\u02cd\n\60\3\60"+
		"\3\60\5\60\u02d1\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u02dc\n\62\3\63\3\63\5\63\u02e0\n\63\3\64\5\64\u02e3\n\64\3\64\5\64\u02e6"+
		"\n\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u02f0\n\65\3\66\3\66"+
		"\5\66\u02f4\n\66\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\58\u030f\n8\38\38\58\u0313\n8\39\59\u0316"+
		"\n9\39\59\u0319\n9\39\39\3:\3:\3;\3;\3;\5;\u0322\n;\3;\3;\3;\3;\3;\3;"+
		"\3;\5;\u032b\n;\3<\5<\u032e\n<\3<\3<\3<\3=\5=\u0334\n=\3=\3=\5=\u0338"+
		"\n=\3=\3=\3>\3>\3?\3?\3?\5?\u0341\n?\3?\3?\3?\3?\3?\3?\3?\5?\u034a\n?"+
		"\3@\5@\u034d\n@\3@\3@\3A\5A\u0352\nA\3A\3A\3B\3B\3B\5B\u0359\nB\3B\3B"+
		"\3B\3B\3B\3B\3B\5B\u0362\nB\3C\5C\u0365\nC\3C\3C\5C\u0369\nC\3C\3C\3D"+
		"\5D\u036e\nD\3D\3D\5D\u0372\nD\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3H\3H\3H"+
		"\3I\3I\3I\5I\u0384\nI\3I\3I\3I\3J\5J\u038a\nJ\3J\5J\u038d\nJ\3J\3J\3K"+
		"\3K\5K\u0393\nK\3L\3L\5L\u0397\nL\3M\3M\5M\u039b\nM\3M\3M\3N\3N\3O\3O"+
		"\5O\u03a3\nO\3P\3P\3P\3P\3P\5P\u03aa\nP\3P\3P\5P\u03ae\nP\3Q\3Q\3Q\3Q"+
		"\3Q\5Q\u03b5\nQ\3R\5R\u03b8\nR\3R\5R\u03bb\nR\3R\5R\u03be\nR\3R\3R\5R"+
		"\u03c2\nR\3R\3R\5R\u03c6\nR\3R\5R\u03c9\nR\3R\3R\5R\u03cd\nR\3R\3R\5R"+
		"\u03d1\nR\3R\3R\5R\u03d5\nR\3R\5R\u03d8\nR\3R\5R\u03db\nR\3S\3S\5S\u03df"+
		"\nS\3T\3T\5T\u03e3\nT\3U\3U\3U\3V\5V\u03e9\nV\3V\3V\5V\u03ed\nV\3V\5V"+
		"\u03f0\nV\3W\3W\5W\u03f4\nW\3W\3W\5W\u03f8\nW\3W\3W\3X\3X\5X\u03fe\nX"+
		"\3Y\3Y\5Y\u0402\nY\3Z\5Z\u0405\nZ\3Z\3Z\3Z\3[\3[\3[\3[\3[\5[\u040f\n["+
		"\3\\\3\\\5\\\u0413\n\\\3]\3]\3^\3^\3_\3_\5_\u041b\n_\3_\3_\3_\3_\5_\u0421"+
		"\n_\3_\3_\3`\3`\5`\u0427\n`\3a\3a\5a\u042b\na\3b\5b\u042e\nb\3b\3b\3b"+
		"\3c\3c\3c\3c\3c\5c\u0438\nc\3d\3d\5d\u043c\nd\3e\3e\3e\3f\5f\u0442\nf"+
		"\3f\3f\3f\5f\u0447\nf\3f\5f\u044a\nf\3f\3f\3g\3g\3h\3h\5h\u0452\nh\3h"+
		"\3h\3i\5i\u0457\ni\3i\3i\3i\5i\u045c\ni\3i\5i\u045f\ni\3i\3i\3j\3j\3k"+
		"\3k\5k\u0467\nk\3k\3k\3l\5l\u046c\nl\3l\3l\3l\5l\u0471\nl\3l\3l\3m\3m"+
		"\3n\3n\5n\u0479\nn\3n\3n\3o\3o\3o\3o\3o\5o\u0482\no\3p\3p\5p\u0486\np"+
		"\3q\3q\3q\3q\3q\3r\3r\3r\5r\u0490\nr\3r\3r\3s\3s\5s\u0496\ns\3s\3s\3t"+
		"\3t\3t\3t\3u\3u\5u\u04a0\nu\3u\5u\u04a3\nu\3v\3v\5v\u04a7\nv\3v\3v\3v"+
		"\3w\5w\u04ad\nw\3w\5w\u04b0\nw\3w\3w\3x\3x\3y\5y\u04b7\ny\3y\3y\3y\3z"+
		"\3z\3z\5z\u04bf\nz\3z\3z\3{\3{\5{\u04c5\n{\3{\3{\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\5|\u04d5\n|\3}\5}\u04d8\n}\3}\3}\3}\3~\3~\5~\u04df\n~"+
		"\3~\3~\3\177\3\177\3\177\5\177\u04e6\n\177\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\5\u0083\u04fc"+
		"\n\u0083\3\u0083\5\u0083\u04ff\n\u0083\3\u0084\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u050e\n\u0088\3\u0088\3\u0088\5\u0088\u0512\n\u0088\3\u0088\3"+
		"\u0088\3\u0088\5\u0088\u0517\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5"+
		"\u0088\u051d\n\u0088\3\u0088\3\u0088\3\u0088\7\u0088\u0522\n\u0088\f\u0088"+
		"\16\u0088\u0525\13\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\5\u008b\u052f\n\u008b\3\u008c\3\u008c\5\u008c\u0533\n"+
		"\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\7\u008d\u053a\n\u008d\f"+
		"\u008d\16\u008d\u053d\13\u008d\3\u008e\3\u008e\3\u008f\5\u008f\u0542\n"+
		"\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u0547\n\u008f\3\u0090\3\u0090\5"+
		"\u0090\u054b\n\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3"+
		"\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u0559\n\u0094\3"+
		"\u0095\3\u0095\3\u0096\3\u0096\5\u0096\u055f\n\u0096\3\u0096\3\u0096\3"+
		"\u0097\3\u0097\5\u0097\u0565\n\u0097\3\u0098\3\u0098\5\u0098\u0569\n\u0098"+
		"\3\u0099\3\u0099\5\u0099\u056d\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u0572\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0577\n\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u057f\n\u0099\3\u009a\3"+
		"\u009a\3\u009a\7\u009a\u0584\n\u009a\f\u009a\16\u009a\u0587\13\u009a\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u058f\n\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\5\u009b\u05a4\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u05b0\n\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u05c1\n\u009b\f\u009b"+
		"\16\u009b\u05c4\13\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u05d3"+
		"\n\u009f\3\u009f\5\u009f\u05d6\n\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\5\u00a1\u05dc\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u05e5\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u05ee\n\u00a2\3\u00a3\3\u00a3\5\u00a3\u05f2\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u05f8\n\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0607\n\u00a6\3\u00a7\3\u00a7\5\u00a7"+
		"\u060b\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0621\n\u00a9\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\5\u00aa\u0627\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\5\u00ae\u0638\n\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af"+
		"\3\u00af\5\u00af\u063f\n\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af"+
		"\u0645\n\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u064c\n"+
		"\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0653\n\u00af\3"+
		"\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u065a\n\u00af\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b3\3\u00b3\5\u00b3\u0668\n\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0671\n\u00b4\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u0678\n\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0686\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\7\u00ba\u0698\n\u00ba\f\u00ba\16\u00ba\u069b\13\u00ba\3\u00bb\3\u00bb"+
		"\5\u00bb\u069f\n\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\5\u00bc\u06a5\n"+
		"\u00bc\3\u00bc\3\u00bc\5\u00bc\u06a9\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3"+
		"\u00bd\3\u00bd\3\u00be\3\u00be\5\u00be\u06b2\n\u00be\3\u00be\3\u00be\3"+
		"\u00bf\3\u00bf\5\u00bf\u06b8\n\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3"+
		"\u00c0\5\u00c0\u06bf\n\u00c0\3\u00c1\5\u00c1\u06c2\n\u00c1\3\u00c1\5\u00c1"+
		"\u06c5\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u06c9\n\u00c1\3\u00c1\3\u00c1\3"+
		"\u00c1\5\u00c1\u06ce\n\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3"+
		"\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\7\u00c4\u06de\n\u00c4\f\u00c4\16\u00c4\u06e1\13\u00c4\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u06ec"+
		"\n\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8"+
		"\u06f5\n\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0701\n\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u070b\n\u00cc\3\u00cd"+
		"\3\u00cd\5\u00cd\u070f\n\u00cd\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u071a\n\u00d0\3\u00d1\3\u00d1"+
		"\3\u00d1\5\u00d1\u071f\n\u00d1\3\u00d2\3\u00d2\3\u00d2\2\u00d3\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180"+
		"\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198"+
		"\u019a\u019c\u019e\u01a0\u01a2\2\t\13\6\6\17\17\21\21\"\";;AACCHHTT\t"+
		"\"\"%%\60\60\63\63==BBQQ\5\3\3//RR\6\21\21;;HHTT\32\5\5\7\7\n\13\r\r\26"+
		"\30\34\34!\"%%()++..\60\60\63\648:<=?@BEGGIIKKOOQQSSUU\24\3\3\6\6\17\22"+
		"\36\36  \'\'//\62\62\65\65;;>>AAHHJJLLNNRRTT\3[^\u076e\2\u01a9\3\2\2\2"+
		"\4\u01c3\3\2\2\2\6\u01c6\3\2\2\2\b\u01ce\3\2\2\2\n\u01ea\3\2\2\2\f\u01ee"+
		"\3\2\2\2\16\u01f0\3\2\2\2\20\u01f6\3\2\2\2\22\u01fc\3\2\2\2\24\u01fe\3"+
		"\2\2\2\26\u0205\3\2\2\2\30\u0207\3\2\2\2\32\u020f\3\2\2\2\34\u0215\3\2"+
		"\2\2\36\u0217\3\2\2\2 \u021f\3\2\2\2\"\u022f\3\2\2\2$\u0231\3\2\2\2&\u0235"+
		"\3\2\2\2(\u0240\3\2\2\2*\u0243\3\2\2\2,\u0246\3\2\2\2.\u024e\3\2\2\2\60"+
		"\u0250\3\2\2\2\62\u0253\3\2\2\2\64\u0259\3\2\2\2\66\u025b\3\2\2\28\u025f"+
		"\3\2\2\2:\u0263\3\2\2\2<\u0265\3\2\2\2>\u0269\3\2\2\2@\u0275\3\2\2\2B"+
		"\u0280\3\2\2\2D\u0282\3\2\2\2F\u028a\3\2\2\2H\u028e\3\2\2\2J\u0298\3\2"+
		"\2\2L\u029a\3\2\2\2N\u029e\3\2\2\2P\u02a7\3\2\2\2R\u02a9\3\2\2\2T\u02b9"+
		"\3\2\2\2V\u02bb\3\2\2\2X\u02bf\3\2\2\2Z\u02c3\3\2\2\2\\\u02c5\3\2\2\2"+
		"^\u02cc\3\2\2\2`\u02d4\3\2\2\2b\u02db\3\2\2\2d\u02df\3\2\2\2f\u02e2\3"+
		"\2\2\2h\u02ef\3\2\2\2j\u02f1\3\2\2\2l\u02f5\3\2\2\2n\u0312\3\2\2\2p\u0315"+
		"\3\2\2\2r\u031c\3\2\2\2t\u032a\3\2\2\2v\u032d\3\2\2\2x\u0333\3\2\2\2z"+
		"\u033b\3\2\2\2|\u0349\3\2\2\2~\u034c\3\2\2\2\u0080\u0351\3\2\2\2\u0082"+
		"\u0361\3\2\2\2\u0084\u0364\3\2\2\2\u0086\u036d\3\2\2\2\u0088\u0375\3\2"+
		"\2\2\u008a\u0378\3\2\2\2\u008c\u037b\3\2\2\2\u008e\u037d\3\2\2\2\u0090"+
		"\u0380\3\2\2\2\u0092\u0389\3\2\2\2\u0094\u0392\3\2\2\2\u0096\u0394\3\2"+
		"\2\2\u0098\u0398\3\2\2\2\u009a\u039e\3\2\2\2\u009c\u03a0\3\2\2\2\u009e"+
		"\u03ad\3\2\2\2\u00a0\u03b4\3\2\2\2\u00a2\u03da\3\2\2\2\u00a4\u03de\3\2"+
		"\2\2\u00a6\u03e2\3\2\2\2\u00a8\u03e4\3\2\2\2\u00aa\u03ef\3\2\2\2\u00ac"+
		"\u03f1\3\2\2\2\u00ae\u03fb\3\2\2\2\u00b0\u0401\3\2\2\2\u00b2\u0404\3\2"+
		"\2\2\u00b4\u040e\3\2\2\2\u00b6\u0410\3\2\2\2\u00b8\u0414\3\2\2\2\u00ba"+
		"\u0416\3\2\2\2\u00bc\u0418\3\2\2\2\u00be\u0424\3\2\2\2\u00c0\u042a\3\2"+
		"\2\2\u00c2\u042d\3\2\2\2\u00c4\u0437\3\2\2\2\u00c6\u0439\3\2\2\2\u00c8"+
		"\u043d\3\2\2\2\u00ca\u0441\3\2\2\2\u00cc\u044d\3\2\2\2\u00ce\u044f\3\2"+
		"\2\2\u00d0\u0456\3\2\2\2\u00d2\u0462\3\2\2\2\u00d4\u0464\3\2\2\2\u00d6"+
		"\u046b\3\2\2\2\u00d8\u0474\3\2\2\2\u00da\u0476\3\2\2\2\u00dc\u0481\3\2"+
		"\2\2\u00de\u0483\3\2\2\2\u00e0\u0487\3\2\2\2\u00e2\u048c\3\2\2\2\u00e4"+
		"\u0493\3\2\2\2\u00e6\u0499\3\2\2\2\u00e8\u049d\3\2\2\2\u00ea\u04a4\3\2"+
		"\2\2\u00ec\u04ac\3\2\2\2\u00ee\u04b3\3\2\2\2\u00f0\u04b6\3\2\2\2\u00f2"+
		"\u04bb\3\2\2\2\u00f4\u04c2\3\2\2\2\u00f6\u04d4\3\2\2\2\u00f8\u04d7\3\2"+
		"\2\2\u00fa\u04dc\3\2\2\2\u00fc\u04e5\3\2\2\2\u00fe\u04e7\3\2\2\2\u0100"+
		"\u04ed\3\2\2\2\u0102\u04f3\3\2\2\2\u0104\u04fb\3\2\2\2\u0106\u0500\3\2"+
		"\2\2\u0108\u0503\3\2\2\2\u010a\u0505\3\2\2\2\u010c\u0508\3\2\2\2\u010e"+
		"\u051c\3\2\2\2\u0110\u0526\3\2\2\2\u0112\u0528\3\2\2\2\u0114\u052e\3\2"+
		"\2\2\u0116\u0530\3\2\2\2\u0118\u0536\3\2\2\2\u011a\u053e\3\2\2\2\u011c"+
		"\u0541\3\2\2\2\u011e\u054a\3\2\2\2\u0120\u054c\3\2\2\2\u0122\u054f\3\2"+
		"\2\2\u0124\u0553\3\2\2\2\u0126\u0555\3\2\2\2\u0128\u055a\3\2\2\2\u012a"+
		"\u055c\3\2\2\2\u012c\u0562\3\2\2\2\u012e\u0566\3\2\2\2\u0130\u057e\3\2"+
		"\2\2\u0132\u0580\3\2\2\2\u0134\u058e\3\2\2\2\u0136\u05c5\3\2\2\2\u0138"+
		"\u05c8\3\2\2\2\u013a\u05ca\3\2\2\2\u013c\u05d5\3\2\2\2\u013e\u05d7\3\2"+
		"\2\2\u0140\u05e4\3\2\2\2\u0142\u05ed\3\2\2\2\u0144\u05ef\3\2\2\2\u0146"+
		"\u05f5\3\2\2\2\u0148\u05fd\3\2\2\2\u014a\u0606\3\2\2\2\u014c\u0608\3\2"+
		"\2\2\u014e\u0610\3\2\2\2\u0150\u0620\3\2\2\2\u0152\u0626\3\2\2\2\u0154"+
		"\u0628\3\2\2\2\u0156\u062c\3\2\2\2\u0158\u0631\3\2\2\2\u015a\u0635\3\2"+
		"\2\2\u015c\u0659\3\2\2\2\u015e\u065b\3\2\2\2\u0160\u0660\3\2\2\2\u0162"+
		"\u0662\3\2\2\2\u0164\u0665\3\2\2\2\u0166\u0670\3\2\2\2\u0168\u0677\3\2"+
		"\2\2\u016a\u0679\3\2\2\2\u016c\u067b\3\2\2\2\u016e\u067d\3\2\2\2\u0170"+
		"\u067f\3\2\2\2\u0172\u0685\3\2\2\2\u0174\u069c\3\2\2\2\u0176\u06a2\3\2"+
		"\2\2\u0178\u06ad\3\2\2\2\u017a\u06af\3\2\2\2\u017c\u06b5\3\2\2\2\u017e"+
		"\u06be\3\2\2\2\u0180\u06cd\3\2\2\2\u0182\u06cf\3\2\2\2\u0184\u06d1\3\2"+
		"\2\2\u0186\u06d5\3\2\2\2\u0188\u06e2\3\2\2\2\u018a\u06e5\3\2\2\2\u018c"+
		"\u06e8\3\2\2\2\u018e\u06f4\3\2\2\2\u0190\u06f6\3\2\2\2\u0192\u0700\3\2"+
		"\2\2\u0194\u0702\3\2\2\2\u0196\u070a\3\2\2\2\u0198\u070e\3\2\2\2\u019a"+
		"\u0710\3\2\2\2\u019c\u0712\3\2\2\2\u019e\u0719\3\2\2\2\u01a0\u071e\3\2"+
		"\2\2\u01a2\u0720\3\2\2\2\u01a4\u01a8\5\4\3\2\u01a5\u01a8\5T+\2\u01a6\u01a8"+
		"\5\u0134\u009b\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3"+
		"\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\1\2\2\u01ad\3\3\2\2\2"+
		"\u01ae\u01b0\5\u0134\u009b\2\u01af\u01b1\7M\2\2\u01b0\u01af\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01c4\3\2\2\2\u01b2\u01b4\5T+\2\u01b3\u01b5\7M\2"+
		"\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01c4\3\2\2\2\u01b6\u01b8"+
		"\5\b\5\2\u01b7\u01b9\7M\2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01c4\3\2\2\2\u01ba\u01bc\5\26\f\2\u01bb\u01bd\7M\2\2\u01bc\u01bb\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c4\3\2\2\2\u01be\u01c4\5.\30\2\u01bf"+
		"\u01c1\5\64\33\2\u01c0\u01c2\7M\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01ae\3\2\2\2\u01c3\u01b2\3\2\2\2\u01c3"+
		"\u01b6\3\2\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01be\3\2\2\2\u01c3\u01bf\3\2"+
		"\2\2\u01c4\5\3\2\2\2\u01c5\u01c7\5\4\3\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\7\3\2\2\2\u01ca"+
		"\u01cf\5\n\6\2\u01cb\u01cf\5\16\b\2\u01cc\u01cf\5\20\t\2\u01cd\u01cf\5"+
		"\24\13\2\u01ce\u01ca\3\2\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\t\3\2\2\2\u01d0\u01d2\7I\2\2\u01d1\u01d3\5\f\7\2"+
		"\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6"+
		"\7M\2\2\u01d5\u01d7\5\u0134\u009b\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3"+
		"\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\7M\2\2\u01d9\u01db\5\u0134\u009b"+
		"\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01eb"+
		"\5\\/\2\u01dd\u01df\7I\2\2\u01de\u01e0\5\f\7\2\u01df\u01de\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\7M\2\2\u01e2\u01e4\5\u0134"+
		"\u009b\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\7M\2\2\u01e6\u01e8\5\u0134\u009b\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\5\\/\2\u01ea\u01d0\3\2\2\2\u01ea"+
		"\u01dd\3\2\2\2\u01eb\13\3\2\2\2\u01ec\u01ef\5n8\2\u01ed\u01ef\5\u0132"+
		"\u009a\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\r\3\2\2\2\u01f0"+
		"\u01f1\7I\2\2\u01f1\u01f2\5\u010e\u0088\2\u01f2\u01f3\7(\2\2\u01f3\u01f4"+
		"\5\u0134\u009b\2\u01f4\u01f5\5\\/\2\u01f5\17\3\2\2\2\u01f6\u01f7\7+\2"+
		"\2\u01f7\u01f8\5\22\n\2\u01f8\u01f9\5\\/\2\u01f9\21\3\2\2\2\u01fa\u01fd"+
		"\5\u0134\u009b\2\u01fb\u01fd\5T+\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2"+
		"\2\2\u01fd\23\3\2\2\2\u01fe\u01ff\7\27\2\2\u01ff\u0200\5\\/\2\u0200\u0201"+
		"\7+\2\2\u0201\u0202\5\22\n\2\u0202\25\3\2\2\2\u0203\u0206\5\30\r\2\u0204"+
		"\u0206\5\36\20\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\27\3\2"+
		"\2\2\u0207\u0208\7.\2\2\u0208\u0209\5\32\16\2\u0209\u020b\5\\/\2\u020a"+
		"\u020c\5\34\17\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\31\3\2"+
		"\2\2\u020d\u0210\5\u0134\u009b\2\u020e\u0210\5T+\2\u020f\u020d\3\2\2\2"+
		"\u020f\u020e\3\2\2\2\u0210\33\3\2\2\2\u0211\u0212\7?\2\2\u0212\u0216\5"+
		"\\/\2\u0213\u0214\7?\2\2\u0214\u0216\5\30\r\2\u0215\u0211\3\2\2\2\u0215"+
		"\u0213\3\2\2\2\u0216\35\3\2\2\2\u0217\u0218\7S\2\2\u0218\u0219\5\u0134"+
		"\u009b\2\u0219\u021b\7\67\2\2\u021a\u021c\5 \21\2\u021b\u021a\3\2\2\2"+
		"\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7\23\2\2\u021e\37"+
		"\3\2\2\2\u021f\u0221\5\"\22\2\u0220\u0222\5 \21\2\u0221\u0220\3\2\2\2"+
		"\u0221\u0222\3\2\2\2\u0222!\3\2\2\2\u0223\u0224\5$\23\2\u0224\u0225\5"+
		"\6\4\2\u0225\u0230\3\2\2\2\u0226\u0227\5(\25\2\u0227\u0228\5\6\4\2\u0228"+
		"\u0230\3\2\2\2\u0229\u022a\5$\23\2\u022a\u022b\7M\2\2\u022b\u0230\3\2"+
		"\2\2\u022c\u022d\5(\25\2\u022d\u022e\7M\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u0223\3\2\2\2\u022f\u0226\3\2\2\2\u022f\u0229\3\2\2\2\u022f\u022c\3\2"+
		"\2\2\u0230#\3\2\2\2\u0231\u0232\7\26\2\2\u0232\u0233\5&\24\2\u0233\u0234"+
		"\7-\2\2\u0234%\3\2\2\2\u0235\u0237\5\u010e\u0088\2\u0236\u0238\5*\26\2"+
		"\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b"+
		"\5\u010e\u0088\2\u023a\u023c\5*\26\2\u023b\u023a\3\2\2\2\u023b\u023c\3"+
		"\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\7*\2\2\u023e\u023f\5&\24\2\u023f"+
		"\'\3\2\2\2\u0240\u0241\7)\2\2\u0241\u0242\7-\2\2\u0242)\3\2\2\2\u0243"+
		"\u0244\7U\2\2\u0244\u0245\5,\27\2\u0245+\3\2\2\2\u0246\u0247\5\u0134\u009b"+
		"\2\u0247-\3\2\2\2\u0248\u0249\5\60\31\2\u0249\u024a\5\b\5\2\u024a\u024f"+
		"\3\2\2\2\u024b\u024c\5\60\31\2\u024c\u024d\5\36\20\2\u024d\u024f\3\2\2"+
		"\2\u024e\u0248\3\2\2\2\u024e\u024b\3\2\2\2\u024f/\3\2\2\2\u0250\u0251"+
		"\5\62\32\2\u0251\u0252\7-\2\2\u0252\61\3\2\2\2\u0253\u0254\5\u0198\u00cd"+
		"\2\u0254\63\3\2\2\2\u0255\u025a\5\66\34\2\u0256\u025a\58\35\2\u0257\u025a"+
		"\5:\36\2\u0258\u025a\5<\37\2\u0259\u0255\3\2\2\2\u0259\u0256\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u025a\65\3\2\2\2\u025b\u025d\79\2\2"+
		"\u025c\u025e\5\62\32\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\67"+
		"\3\2\2\2\u025f\u0261\7\n\2\2\u0260\u0262\5\62\32\2\u0261\u0260\3\2\2\2"+
		"\u0261\u0262\3\2\2\2\u02629\3\2\2\2\u0263\u0264\7\r\2\2\u0264;\3\2\2\2"+
		"\u0265\u0267\7K\2\2\u0266\u0268\5\u0134\u009b\2\u0267\u0266\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268=\3\2\2\2\u0269\u026a\7\t\2\2\u026a\u026c\5@!\2\u026b"+
		"\u026d\5D#\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2"+
		"\2\u026e\u026f\7P\2\2\u026f?\3\2\2\2\u0270\u0276\5B\"\2\u0271\u0272\5"+
		"B\"\2\u0272\u0273\7*\2\2\u0273\u0274\5@!\2\u0274\u0276\3\2\2\2\u0275\u0270"+
		"\3\2\2\2\u0275\u0271\3\2\2\2\u0276A\3\2\2\2\u0277\u0281\5\u0178\u00bd"+
		"\2\u0278\u0279\5\u0178\u00bd\2\u0279\u027a\7-\2\2\u027a\u027b\5\u0176"+
		"\u00bc\2\u027b\u0281\3\2\2\2\u027c\u027d\5\u0178\u00bd\2\u027d\u027e\7"+
		"-\2\2\u027e\u027f\5\u018c\u00c7\2\u027f\u0281\3\2\2\2\u0280\u0277\3\2"+
		"\2\2\u0280\u0278\3\2\2\2\u0280\u027c\3\2\2\2\u0281C\3\2\2\2\u0282\u0283"+
		"\7U\2\2\u0283\u0284\5F$\2\u0284E\3\2\2\2\u0285\u028b\5H%\2\u0286\u0287"+
		"\5H%\2\u0287\u0288\7*\2\2\u0288\u0289\5F$\2\u0289\u028b\3\2\2\2\u028a"+
		"\u0285\3\2\2\2\u028a\u0286\3\2\2\2\u028bG\3\2\2\2\u028c\u028f\5J&\2\u028d"+
		"\u028f\5L\'\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028fI\3\2\2\2\u0290"+
		"\u0291\5\u0176\u00bc\2\u0291\u0292\7-\2\2\u0292\u0293\5\u0176\u00bc\2"+
		"\u0293\u0299\3\2\2\2\u0294\u0295\5\u0176\u00bc\2\u0295\u0296\7-\2\2\u0296"+
		"\u0297\5\u018c\u00c7\2\u0297\u0299\3\2\2\2\u0298\u0290\3\2\2\2\u0298\u0294"+
		"\3\2\2\2\u0299K\3\2\2\2\u029a\u029b\5\u0176\u00bc\2\u029b\u029c\7V\2\2"+
		"\u029c\u029d\5\u0176\u00bc\2\u029dM\3\2\2\2\u029e\u029f\7\t\2\2\u029f"+
		"\u02a0\5P)\2\u02a0\u02a1\7P\2\2\u02a1O\3\2\2\2\u02a2\u02a8\5R*\2\u02a3"+
		"\u02a4\5R*\2\u02a4\u02a5\7*\2\2\u02a5\u02a6\5P)\2\u02a6\u02a8\3\2\2\2"+
		"\u02a7\u02a2\3\2\2\2\u02a7\u02a3\3\2\2\2\u02a8Q\3\2\2\2\u02a9\u02aa\5"+
		"\u0172\u00ba\2\u02aaS\3\2\2\2\u02ab\u02ba\5^\60\2\u02ac\u02ba\5f\64\2"+
		"\u02ad\u02ba\5n8\2\u02ae\u02ba\5\u0088E\2\u02af\u02ba\5\u0090I\2\u02b0"+
		"\u02ba\5\u00aaV\2\u02b1\u02ba\5\u00caf\2\u02b2\u02ba\5\u00d0i\2\u02b3"+
		"\u02ba\5\u00d6l\2\u02b4\u02ba\5\u00eav\2\u02b5\u02ba\5\u00f0y\2\u02b6"+
		"\u02ba\5\u00f2z\2\u02b7\u02ba\5\u00f6|\2\u02b8\u02ba\5\u00fc\177\2\u02b9"+
		"\u02ab\3\2\2\2\u02b9\u02ac\3\2\2\2\u02b9\u02ad\3\2\2\2\u02b9\u02ae\3\2"+
		"\2\2\u02b9\u02af\3\2\2\2\u02b9\u02b0\3\2\2\2\u02b9\u02b1\3\2\2\2\u02b9"+
		"\u02b2\3\2\2\2\u02b9\u02b3\3\2\2\2\u02b9\u02b4\3\2\2\2\u02b9\u02b5\3\2"+
		"\2\2\u02b9\u02b6\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba"+
		"U\3\2\2\2\u02bb\u02bd\5T+\2\u02bc\u02be\5V,\2\u02bd\u02bc\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02beW\3\2\2\2\u02bf\u02c1\5Z.\2\u02c0\u02c2\5X-\2\u02c1"+
		"\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2Y\3\2\2\2\u02c3\u02c4\t\2\2\2"+
		"\u02c4[\3\2\2\2\u02c5\u02c7\7\67\2\2\u02c6\u02c8\5\6\4\2\u02c7\u02c6\3"+
		"\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\7\23\2\2\u02ca"+
		"]\3\2\2\2\u02cb\u02cd\5\u012c\u0097\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\7D\2\2\u02cf\u02d1\5`\61\2\u02d0"+
		"\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\5b"+
		"\62\2\u02d3_\3\2\2\2\u02d4\u02d5\t\3\2\2\u02d5a\3\2\2\2\u02d6\u02dc\5"+
		"d\63\2\u02d7\u02d8\5d\63\2\u02d8\u02d9\13\2\2\2\u02d9\u02da\5b\62\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02d6\3\2\2\2\u02db\u02d7\3\2\2\2\u02dcc\3\2\2\2"+
		"\u02dd\u02e0\5\u0198\u00cd\2\u02de\u02e0\7X\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02de\3\2\2\2\u02e0e\3\2\2\2\u02e1\u02e3\5\u012c\u0097\2\u02e2\u02e1"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e6\5X-\2\u02e5"+
		"\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\7:"+
		"\2\2\u02e8\u02e9\5h\65\2\u02e9g\3\2\2\2\u02ea\u02f0\5j\66\2\u02eb\u02ec"+
		"\5j\66\2\u02ec\u02ed\7*\2\2\u02ed\u02ee\5h\65\2\u02ee\u02f0\3\2\2\2\u02ef"+
		"\u02ea\3\2\2\2\u02ef\u02eb\3\2\2\2\u02f0i\3\2\2\2\u02f1\u02f3\5\u010e"+
		"\u0088\2\u02f2\u02f4\5l\67\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"k\3\2\2\2\u02f5\u02f6\7\37\2\2\u02f6\u02f7\5\u0134\u009b\2\u02f7m\3\2"+
		"\2\2\u02f8\u02f9\5p9\2\u02f9\u02fa\5h\65\2\u02fa\u0313\3\2\2\2\u02fb\u02fc"+
		"\5p9\2\u02fc\u02fd\5r:\2\u02fd\u02fe\5\u0174\u00bb\2\u02fe\u02ff\5\\/"+
		"\2\u02ff\u0313\3\2\2\2\u0300\u0301\5p9\2\u0301\u0302\5r:\2\u0302\u0303"+
		"\5\u0174\u00bb\2\u0303\u0304\5t;\2\u0304\u0313\3\2\2\2\u0305\u0306\5p"+
		"9\2\u0306\u0307\5r:\2\u0307\u0308\5\u0174\u00bb\2\u0308\u0309\5|?\2\u0309"+
		"\u0313\3\2\2\2\u030a\u030b\5p9\2\u030b\u030c\5r:\2\u030c\u030e\5\u0174"+
		"\u00bb\2\u030d\u030f\5l\67\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\5\u0082B\2\u0311\u0313\3\2\2\2\u0312\u02f8"+
		"\3\2\2\2\u0312\u02fb\3\2\2\2\u0312\u0300\3\2\2\2\u0312\u0305\3\2\2\2\u0312"+
		"\u030a\3\2\2\2\u0313o\3\2\2\2\u0314\u0316\5\u012c\u0097\2\u0315\u0314"+
		"\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\3\2\2\2\u0317\u0319\5X-\2\u0318"+
		"\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\7\60"+
		"\2\2\u031bq\3\2\2\2\u031c\u031d\5\u0198\u00cd\2\u031ds\3\2\2\2\u031e\u031f"+
		"\7\67\2\2\u031f\u0321\5v<\2\u0320\u0322\5x=\2\u0321\u0320\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\7\23\2\2\u0324\u032b\3"+
		"\2\2\2\u0325\u0326\7\67\2\2\u0326\u0327\5x=\2\u0327\u0328\5v<\2\u0328"+
		"\u0329\7\23\2\2\u0329\u032b\3\2\2\2\u032a\u031e\3\2\2\2\u032a\u0325\3"+
		"\2\2\2\u032bu\3\2\2\2\u032c\u032e\5\u012c\u0097\2\u032d\u032c\3\2\2\2"+
		"\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\7\'\2\2\u0330\u0331"+
		"\5\\/\2\u0331w\3\2\2\2\u0332\u0334\5\u012c\u0097\2\u0333\u0332\3\2\2\2"+
		"\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\7\62\2\2\u0336\u0338"+
		"\5z>\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u033a\5\\/\2\u033ay\3\2\2\2\u033b\u033c\5\u0198\u00cd\2\u033c{\3\2\2"+
		"\2\u033d\u033e\7\67\2\2\u033e\u0340\5~@\2\u033f\u0341\5\u0080A\2\u0340"+
		"\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\7\23"+
		"\2\2\u0343\u034a\3\2\2\2\u0344\u0345\7\67\2\2\u0345\u0346\5\u0080A\2\u0346"+
		"\u0347\5~@\2\u0347\u0348\7\23\2\2\u0348\u034a\3\2\2\2\u0349\u033d\3\2"+
		"\2\2\u0349\u0344\3\2\2\2\u034a}\3\2\2\2\u034b\u034d\5\u012c\u0097\2\u034c"+
		"\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\7\'"+
		"\2\2\u034f\177\3\2\2\2\u0350\u0352\5\u012c\u0097\2\u0351\u0350\3\2\2\2"+
		"\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7\62\2\2\u0354\u0081"+
		"\3\2\2\2\u0355\u0356\7\67\2\2\u0356\u0358\5\u0084C\2\u0357\u0359\5\u0086"+
		"D\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035b\7\23\2\2\u035b\u0362\3\2\2\2\u035c\u035d\7\67\2\2\u035d\u035e\5"+
		"\u0086D\2\u035e\u035f\5\u0084C\2\u035f\u0360\7\23\2\2\u0360\u0362\3\2"+
		"\2\2\u0361\u0355\3\2\2\2\u0361\u035c\3\2\2\2\u0362\u0083\3\2\2\2\u0363"+
		"\u0365\5\u012c\u0097\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366"+
		"\3\2\2\2\u0366\u0368\7N\2\2\u0367\u0369\5z>\2\u0368\u0367\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\5\\/\2\u036b\u0085\3\2"+
		"\2\2\u036c\u036e\5\u012c\u0097\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2"+
		"\2\u036e\u036f\3\2\2\2\u036f\u0371\7 \2\2\u0370\u0372\5z>\2\u0371\u0370"+
		"\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\5\\/\2\u0374"+
		"\u0087\3\2\2\2\u0375\u0376\5\u008aF\2\u0376\u0377\5\u008eH\2\u0377\u0089"+
		"\3\2\2\2\u0378\u0379\7\63\2\2\u0379\u037a\5\u008cG\2\u037a\u008b\3\2\2"+
		"\2\u037b\u037c\5\u0198\u00cd\2\u037c\u008d\3\2\2\2\u037d\u037e\7\37\2"+
		"\2\u037e\u037f\5\u0172\u00ba\2\u037f\u008f\3\2\2\2\u0380\u0381\5\u0092"+
		"J\2\u0381\u0383\5\u0094K\2\u0382\u0384\5> \2\u0383\u0382\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\5\u0096L\2\u0386\u0387"+
		"\5\u009aN\2\u0387\u0091\3\2\2\2\u0388\u038a\5\u012c\u0097\2\u0389\u0388"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\3\2\2\2\u038b\u038d\5X-\2\u038c"+
		"\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\7="+
		"\2\2\u038f\u0093\3\2\2\2\u0390\u0393\5\u0198\u00cd\2\u0391\u0393\7X\2"+
		"\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u0095\3\2\2\2\u0394\u0396"+
		"\5\u009cO\2\u0395\u0397\5\u0098M\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2"+
		"\2\2\u0397\u0097\3\2\2\2\u0398\u039a\7\31\2\2\u0399\u039b\5\u012c\u0097"+
		"\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d"+
		"\5\u0172\u00ba\2\u039d\u0099\3\2\2\2\u039e\u039f\5\\/\2\u039f\u009b\3"+
		"\2\2\2\u03a0\u03a2\5\u009eP\2\u03a1\u03a3\5\u009cO\2\u03a2\u03a1\3\2\2"+
		"\2\u03a2\u03a3\3\2\2\2\u03a3\u009d\3\2\2\2\u03a4\u03a5\7,\2\2\u03a5\u03ae"+
		"\7\32\2\2\u03a6\u03a7\7,\2\2\u03a7\u03a9\5\u00a0Q\2\u03a8\u03aa\7\66\2"+
		"\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac"+
		"\7\32\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03a4\3\2\2\2\u03ad\u03a6\3\2\2\2"+
		"\u03ae\u009f\3\2\2\2\u03af\u03b5\5\u00a2R\2\u03b0\u03b1\5\u00a2R\2\u03b1"+
		"\u03b2\7*\2\2\u03b2\u03b3\5\u00a0Q\2\u03b3\u03b5\3\2\2\2\u03b4\u03af\3"+
		"\2\2\2\u03b4\u03b0\3\2\2\2\u03b5\u00a1\3\2\2\2\u03b6\u03b8\7\22\2\2\u03b7"+
		"\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9\u03bb\7:"+
		"\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc"+
		"\u03be\7W\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2"+
		"\2\2\u03bf\u03c1\5\u00a4S\2\u03c0\u03c2\5\u00a6T\2\u03c1\u03c0\3\2\2\2"+
		"\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\5\u0174\u00bb\2\u03c4"+
		"\u03c6\5\u00a8U\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03db"+
		"\3\2\2\2\u03c7\u03c9\7\22\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2"+
		"\u03c9\u03ca\3\2\2\2\u03ca\u03cc\7\60\2\2\u03cb\u03cd\7W\2\2\u03cc\u03cb"+
		"\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\5\u00a4S"+
		"\2\u03cf\u03d1\5\u00a6T\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u03d4\5\u0174\u00bb\2\u03d3\u03d5\5\u00a8U\2\u03d4"+
		"\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03db\3\2\2\2\u03d6\u03d8\5\u012c"+
		"\u0097\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"\u03db\5\u0172\u00ba\2\u03da\u03b7\3\2\2\2\u03da\u03c8\3\2\2\2\u03da\u03d7"+
		"\3\2\2\2\u03db\u00a3\3\2\2\2\u03dc\u03df\5\u0198\u00cd\2\u03dd\u03df\7"+
		"\33\2\2\u03de\u03dc\3\2\2\2\u03de\u03dd\3\2\2\2\u03df\u00a5\3\2\2\2\u03e0"+
		"\u03e3\5\u0198\u00cd\2\u03e1\u03e3\7\33\2\2\u03e2\u03e0\3\2\2\2\u03e2"+
		"\u03e1\3\2\2\2\u03e3\u00a7\3\2\2\2\u03e4\u03e5\7\37\2\2\u03e5\u03e6\5"+
		"\u0134\u009b\2\u03e6\u00a9\3\2\2\2\u03e7\u03e9\5\u012c\u0097\2\u03e8\u03e7"+
		"\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03f0\5\u00acW"+
		"\2\u03eb\u03ed\5\u012c\u0097\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2"+
		"\u03ed\u03ee\3\2\2\2\u03ee\u03f0\5\u00bc_\2\u03ef\u03e8\3\2\2\2\u03ef"+
		"\u03ec\3\2\2\2\u03f0\u00ab\3\2\2\2\u03f1\u03f3\5\u00b8]\2\u03f2\u03f4"+
		"\5> \2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u03f7\7\67\2\2\u03f6\u03f8\5\u00aeX\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8"+
		"\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\7\23\2\2\u03fa\u00ad\3\2\2\2"+
		"\u03fb\u03fd\5\u00b0Y\2\u03fc\u03fe\5\u00aeX\2\u03fd\u03fc\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u00af\3\2\2\2\u03ff\u0402\5T+\2\u0400\u0402\5\u00b2"+
		"Z\2\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2\2\u0402\u00b1\3\2\2\2\u0403"+
		"\u0405\5\u012c\u0097\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406"+
		"\3\2\2\2\u0406\u0407\7\26\2\2\u0407\u0408\5\u00b4[\2\u0408\u00b3\3\2\2"+
		"\2\u0409\u040f\5\u00b6\\\2\u040a\u040b\5\u00b6\\\2\u040b\u040c\7*\2\2"+
		"\u040c\u040d\5\u00b4[\2\u040d\u040f\3\2\2\2\u040e\u0409\3\2\2\2\u040e"+
		"\u040a\3\2\2\2\u040f\u00b5\3\2\2\2\u0410\u0412\5\u00ba^\2\u0411\u0413"+
		"\5\u017a\u00be\2\u0412\u0411\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u00b7\3"+
		"\2\2\2\u0414\u0415\5\u0198\u00cd\2\u0415\u00b9\3\2\2\2\u0416\u0417\5\u0198"+
		"\u00cd\2\u0417\u00bb\3\2\2\2\u0418\u041a\5\u00b8]\2\u0419\u041b\5> \2"+
		"\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041d"+
		"\7-\2\2\u041d\u041e\5\u0176\u00bc\2\u041e\u0420\7\67\2\2\u041f\u0421\5"+
		"\u00be`\2\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2"+
		"\u0422\u0423\7\23\2\2\u0423\u00bd\3\2\2\2\u0424\u0426\5\u00c0a\2\u0425"+
		"\u0427\5\u00be`\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u00bf"+
		"\3\2\2\2\u0428\u042b\5T+\2\u0429\u042b\5\u00c2b\2\u042a\u0428\3\2\2\2"+
		"\u042a\u0429\3\2\2\2\u042b\u00c1\3\2\2\2\u042c\u042e\5\u012c\u0097\2\u042d"+
		"\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\7\26"+
		"\2\2\u0430\u0431\5\u00c4c\2\u0431\u00c3\3\2\2\2\u0432\u0438\5\u00c6d\2"+
		"\u0433\u0434\5\u00c6d\2\u0434\u0435\7*\2\2\u0435\u0436\5\u00c4c\2\u0436"+
		"\u0438\3\2\2\2\u0437\u0432\3\2\2\2\u0437\u0433\3\2\2\2\u0438\u00c5\3\2"+
		"\2\2\u0439\u043b\5\u00ba^\2\u043a\u043c\5\u00c8e\2\u043b\u043a\3\2\2\2"+
		"\u043b\u043c\3\2\2\2\u043c\u00c7\3\2\2\2\u043d\u043e\7\37\2\2\u043e\u043f"+
		"\5\u01a0\u00d1\2\u043f\u00c9\3\2\2\2\u0440\u0442\5\u012c\u0097\2\u0441"+
		"\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\7B"+
		"\2\2\u0444\u0446\5\u00ccg\2\u0445\u0447\5> \2\u0446\u0445\3\2\2\2\u0446"+
		"\u0447\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u044a\5\u0194\u00cb\2\u0449\u0448"+
		"\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\5\u00ceh"+
		"\2\u044c\u00cb\3\2\2\2\u044d\u044e\5\u0198\u00cd\2\u044e\u00cd\3\2\2\2"+
		"\u044f\u0451\7\67\2\2\u0450\u0452\5V,\2\u0451\u0450\3\2\2\2\u0451\u0452"+
		"\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\7\23\2\2\u0454\u00cf\3\2\2\2"+
		"\u0455\u0457\5\u012c\u0097\2\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457"+
		"\u0458\3\2\2\2\u0458\u0459\7\"\2\2\u0459\u045b\5\u00d2j\2\u045a\u045c"+
		"\5> \2\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e\3\2\2\2\u045d"+
		"\u045f\5\u0194\u00cb\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460"+
		"\3\2\2\2\u0460\u0461\5\u00d4k\2\u0461\u00d1\3\2\2\2\u0462\u0463\5\u0198"+
		"\u00cd\2\u0463\u00d3\3\2\2\2\u0464\u0466\7\67\2\2\u0465\u0467\5V,\2\u0466"+
		"\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\7\23"+
		"\2\2\u0469\u00d5\3\2\2\2\u046a\u046c\5\u012c\u0097\2\u046b\u046a\3\2\2"+
		"\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\7Q\2\2\u046e\u0470"+
		"\5\u00d8m\2\u046f\u0471\5\u0194\u00cb\2\u0470\u046f\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\5\u00dan\2\u0473\u00d7\3\2\2"+
		"\2\u0474\u0475\5\u0198\u00cd\2\u0475\u00d9\3\2\2\2\u0476\u0478\7\67\2"+
		"\2\u0477\u0479\5\u00dep\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479"+
		"\u047a\3\2\2\2\u047a\u047b\7\23\2\2\u047b\u00db\3\2\2\2\u047c\u0482\5"+
		"\u00e0q\2\u047d\u0482\5\u00e2r\2\u047e\u0482\5\u00e4s\2\u047f\u0482\5"+
		"\u00e6t\2\u0480\u0482\5\u00e8u\2\u0481\u047c\3\2\2\2\u0481\u047d\3\2\2"+
		"\2\u0481\u047e\3\2\2\2\u0481\u047f\3\2\2\2\u0481\u0480\3\2\2\2\u0482\u00dd"+
		"\3\2\2\2\u0483\u0485\5\u00dco\2\u0484\u0486\5\u00dep\2\u0485\u0484\3\2"+
		"\2\2\u0485\u0486\3\2\2\2\u0486\u00df\3\2\2\2\u0487\u0488\5p9\2\u0488\u0489"+
		"\5r:\2\u0489\u048a\5\u0174\u00bb\2\u048a\u048b\5|?\2\u048b\u00e1\3\2\2"+
		"\2\u048c\u048d\5\u0092J\2\u048d\u048f\5\u0094K\2\u048e\u0490\5> \2\u048f"+
		"\u048e\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\5\u0096"+
		"L\2\u0492\u00e3\3\2\2\2\u0493\u0495\5\u00ecw\2\u0494\u0496\5> \2\u0495"+
		"\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\5\u009e"+
		"P\2\u0498\u00e5\3\2\2\2\u0499\u049a\5\u00f8}\2\u049a\u049b\5\u00fa~\2"+
		"\u049b\u049c\5|?\2\u049c\u00e7\3\2\2\2\u049d\u049f\5\u008aF\2\u049e\u04a0"+
		"\5\u0194\u00cb\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\3"+
		"\2\2\2\u04a1\u04a3\5\u008eH\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2"+
		"\u04a3\u00e9\3\2\2\2\u04a4\u04a6\5\u00ecw\2\u04a5\u04a7\5> \2\u04a6\u04a5"+
		"\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\5\u009eP"+
		"\2\u04a9\u04aa\5\u00eex\2\u04aa\u00eb\3\2\2\2\u04ab\u04ad\5\u012c\u0097"+
		"\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04b0"+
		"\7\34\2\2\u04af\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2"+
		"\u04b1\u04b2\78\2\2\u04b2\u00ed\3\2\2\2\u04b3\u04b4\5\\/\2\u04b4\u00ef"+
		"\3\2\2\2\u04b5\u04b7\5\u012c\u0097\2\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3"+
		"\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7<\2\2\u04b9\u04ba\5\\/\2\u04ba"+
		"\u00f1\3\2\2\2\u04bb\u04bc\7O\2\2\u04bc\u04be\5\u0176\u00bc\2\u04bd\u04bf"+
		"\5\u0194\u00cb\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c0\3"+
		"\2\2\2\u04c0\u04c1\5\u00f4{\2\u04c1\u00f3\3\2\2\2\u04c2\u04c4\7\67\2\2"+
		"\u04c3\u04c5\5V,\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c7\7\23\2\2\u04c7\u00f5\3\2\2\2\u04c8\u04c9\5\u00f8"+
		"}\2\u04c9\u04ca\5\u00fa~\2\u04ca\u04cb\5\\/\2\u04cb\u04d5\3\2\2\2\u04cc"+
		"\u04cd\5\u00f8}\2\u04cd\u04ce\5\u00fa~\2\u04ce\u04cf\5t;\2\u04cf\u04d5"+
		"\3\2\2\2\u04d0\u04d1\5\u00f8}\2\u04d1\u04d2\5\u00fa~\2\u04d2\u04d3\5|"+
		"?\2\u04d3\u04d5\3\2\2\2\u04d4\u04c8\3\2\2\2\u04d4\u04cc\3\2\2\2\u04d4"+
		"\u04d0\3\2\2\2\u04d5\u00f7\3\2\2\2\u04d6\u04d8\5\u012c\u0097\2\u04d7\u04d6"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\7G\2\2\u04da"+
		"\u04db\5\u009eP\2\u04db\u00f9\3\2\2\2\u04dc\u04de\7\31\2\2\u04dd\u04df"+
		"\5\u012c\u0097\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3"+
		"\2\2\2\u04e0\u04e1\5\u0172\u00ba\2\u04e1\u00fb\3\2\2\2\u04e2\u04e6\5\u00fe"+
		"\u0080\2\u04e3\u04e6\5\u0100\u0081\2\u04e4\u04e6\5\u0102\u0082\2\u04e5"+
		"\u04e2\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e4\3\2\2\2\u04e6\u00fd\3\2"+
		"\2\2\u04e7\u04e8\7J\2\2\u04e8\u04e9\7L\2\2\u04e9\u04ea\7J\2\2\u04ea\u04eb"+
		"\7\67\2\2\u04eb\u04ec\7\23\2\2\u04ec\u00ff\3\2\2\2\u04ed\u04ee\7J\2\2"+
		"\u04ee\u04ef\7\20\2\2\u04ef\u04f0\7J\2\2\u04f0\u04f1\7\67\2\2\u04f1\u04f2"+
		"\7\23\2\2\u04f2\u0101\3\2\2\2\u04f3\u04f4\7J\2\2\u04f4\u04f5\7>\2\2\u04f5"+
		"\u04f6\7J\2\2\u04f6\u04f7\7\67\2\2\u04f7\u04f8\5\u0104\u0083\2\u04f8\u04f9"+
		"\7\23\2\2\u04f9\u0103\3\2\2\2\u04fa\u04fc\5\u0106\u0084\2\u04fb\u04fa"+
		"\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04ff\5\u010a\u0086"+
		"\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0105\3\2\2\2\u0500\u0501"+
		"\7\65\2\2\u0501\u0502\5\u0108\u0085\2\u0502\u0107\3\2\2\2\u0503\u0504"+
		"\5\u01a2\u00d2\2\u0504\u0109\3\2\2\2\u0505\u0506\7\36\2\2\u0506\u0507"+
		"\5\u010c\u0087\2\u0507\u010b\3\2\2\2\u0508\u0509\t\4\2\2\u0509\u010d\3"+
		"\2\2\2\u050a\u050b\b\u0088\1\2\u050b\u050d\5\u0110\u0089\2\u050c\u050e"+
		"\5\u0174\u00bb\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u051d\3"+
		"\2\2\2\u050f\u0511\5\u0112\u008a\2\u0510\u0512\5\u0174\u00bb\2\u0511\u0510"+
		"\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u051d\3\2\2\2\u0513\u051d\5\u0114\u008b"+
		"\2\u0514\u0516\5\u0116\u008c\2\u0515\u0517\5\u0174\u00bb\2\u0516\u0515"+
		"\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u051d\3\2\2\2\u0518\u051d\5\u011c\u008f"+
		"\2\u0519\u051a\7E\2\2\u051a\u051d\5\u0172\u00ba\2\u051b\u051d\5\u0124"+
		"\u0093\2\u051c\u050a\3\2\2\2\u051c\u050f\3\2\2\2\u051c\u0513\3\2\2\2\u051c"+
		"\u0514\3\2\2\2\u051c\u0518\3\2\2\2\u051c\u0519\3\2\2\2\u051c\u051b\3\2"+
		"\2\2\u051d\u0523\3\2\2\2\u051e\u051f\6\u0088\2\3\u051f\u0520\7\64\2\2"+
		"\u0520\u0522\5\u0172\u00ba\2\u0521\u051e\3\2\2\2\u0522\u0525\3\2\2\2\u0523"+
		"\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u010f\3\2\2\2\u0525\u0523\3\2"+
		"\2\2\u0526\u0527\7\33\2\2\u0527\u0111\3\2\2\2\u0528\u0529\5\u0198\u00cd"+
		"\2\u0529\u0113\3\2\2\2\u052a\u052b\7\60\2\2\u052b\u052f\5\u010e\u0088"+
		"\2\u052c\u052d\7:\2\2\u052d\u052f\5\u010e\u0088\2\u052e\u052a\3\2\2\2"+
		"\u052e\u052c\3\2\2\2\u052f\u0115\3\2\2\2\u0530\u0532\7,\2\2\u0531\u0533"+
		"\5\u0118\u008d\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534\3"+
		"\2\2\2\u0534\u0535\7\32\2\2\u0535\u0117\3\2\2\2\u0536\u053b\5\u011a\u008e"+
		"\2\u0537\u0538\7*\2\2\u0538\u053a\5\u011a\u008e\2\u0539\u0537\3\2\2\2"+
		"\u053a\u053d\3\2\2\2\u053b\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u0119"+
		"\3\2\2\2\u053d\u053b\3\2\2\2\u053e\u053f\5\u010e\u0088\2\u053f\u011b\3"+
		"\2\2\2\u0540\u0542\5\u0176\u00bc\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2"+
		"\2\2\u0542\u0543\3\2\2\2\u0543\u0544\7F\2\2\u0544\u0546\5\u00ba^\2\u0545"+
		"\u0547\5\u0116\u008c\2\u0546\u0545\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u011d"+
		"\3\2\2\2\u0548\u054b\5\u0120\u0091\2\u0549\u054b\5\u0122\u0092\2\u054a"+
		"\u0548\3\2\2\2\u054a\u0549\3\2\2\2\u054b\u011f\3\2\2\2\u054c\u054d\7E"+
		"\2\2\u054d\u054e\5\u0172\u00ba\2\u054e\u0121\3\2\2\2\u054f\u0550\5\u010e"+
		"\u0088\2\u0550\u0551\7\64\2\2\u0551\u0552\5\u0172\u00ba\2\u0552\u0123"+
		"\3\2\2\2\u0553\u0554\5\u0134\u009b\2\u0554\u0125\3\2\2\2\u0555\u0556\7"+
		"\35\2\2\u0556\u0558\5\u0128\u0095\2\u0557\u0559\5\u012a\u0096\2\u0558"+
		"\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u0127\3\2\2\2\u055a\u055b\5\u0198"+
		"\u00cd\2\u055b\u0129\3\2\2\2\u055c\u055e\7,\2\2\u055d\u055f\5\u012e\u0098"+
		"\2\u055e\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561"+
		"\7\32\2\2\u0561\u012b\3\2\2\2\u0562\u0564\5\u0126\u0094\2\u0563\u0565"+
		"\5\u012c\u0097\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u012d\3"+
		"\2\2\2\u0566\u0568\5\u0130\u0099\2\u0567\u0569\5\u012e\u0098\2\u0568\u0567"+
		"\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u012f\3\2\2\2\u056a\u056c\7,\2\2\u056b"+
		"\u056d\5\u012e\u0098\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e"+
		"\3\2\2\2\u056e\u057f\7\32\2\2\u056f\u0571\7\b\2\2\u0570\u0572\5\u012e"+
		"\u0098\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\3\2\2\2\u0573"+
		"\u057f\7&\2\2\u0574\u0576\7\67\2\2\u0575\u0577\5\u012e\u0098\2\u0576\u0575"+
		"\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057f\7\23\2\2"+
		"\u0579\u057f\5\u0198\u00cd\2\u057a\u057f\5\u0134\u009b\2\u057b\u057f\5"+
		"\u019c\u00cf\2\u057c\u057f\5\u01a0\u00d1\2\u057d\u057f\7X\2\2\u057e\u056a"+
		"\3\2\2\2\u057e\u056f\3\2\2\2\u057e\u0574\3\2\2\2\u057e\u0579\3\2\2\2\u057e"+
		"\u057a\3\2\2\2\u057e\u057b\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057d\3\2"+
		"\2\2\u057f\u0131\3\2\2\2\u0580\u0585\5\u0134\u009b\2\u0581\u0582\7*\2"+
		"\2\u0582\u0584\5\u0134\u009b\2\u0583\u0581\3\2\2\2\u0584\u0587\3\2\2\2"+
		"\u0585\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0133\3\2\2\2\u0587\u0585"+
		"\3\2\2\2\u0588\u0589\b\u009b\1\2\u0589\u058a\5\u016e\u00b8\2\u058a\u058b"+
		"\5\u0134\u009b\2\u058b\u058f\3\2\2\2\u058c\u058f\5\u0136\u009c\2\u058d"+
		"\u058f\5\u0140\u00a1\2\u058e\u0588\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058d"+
		"\3\2\2\2\u058f\u05c2\3\2\2\2\u0590\u0591\6\u009b\3\3\u0591\u0592\5\u016c"+
		"\u00b7\2\u0592\u0593\5\u0134\u009b\2\u0593\u05c1\3\2\2\2\u0594\u0595\6"+
		"\u009b\4\3\u0595\u0596\5\u0138\u009d\2\u0596\u0597\5\u0134\u009b\2\u0597"+
		"\u05c1\3\2\2\2\u0598\u0599\6\u009b\5\3\u0599\u059a\5\u013a\u009e\2\u059a"+
		"\u059b\5\u0134\u009b\2\u059b\u05c1\3\2\2\2\u059c\u059d\6\u009b\6\3\u059d"+
		"\u05c1\5\u013c\u009f\2\u059e\u059f\6\u009b\7\3\u059f\u05c1\5\u0170\u00b9"+
		"\2\u05a0\u05a1\6\u009b\b\3\u05a1\u05a3\5\u0164\u00b3\2\u05a2\u05a4\5\u013e"+
		"\u00a0\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05c1\3\2\2\2\u05a5"+
		"\u05a6\6\u009b\t\3\u05a6\u05a7\7F\2\2\u05a7\u05c1\78\2\2\u05a8\u05a9\6"+
		"\u009b\n\3\u05a9\u05aa\7F\2\2\u05aa\u05c1\7]\2\2\u05ab\u05ac\6\u009b\13"+
		"\3\u05ac\u05ad\7F\2\2\u05ad\u05af\5\u0198\u00cd\2\u05ae\u05b0\5N(\2\u05af"+
		"\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05c1\3\2\2\2\u05b1\u05b2\6\u009b"+
		"\f\3\u05b2\u05b3\7F\2\2\u05b3\u05c1\7\5\2\2\u05b4\u05b5\6\u009b\r\3\u05b5"+
		"\u05b6\7F\2\2\u05b6\u05c1\7@\2\2\u05b7\u05b8\6\u009b\16\3\u05b8\u05b9"+
		"\7\b\2\2\u05b9\u05ba\5\u0132\u009a\2\u05ba\u05bb\7&\2\2\u05bb\u05c1\3"+
		"\2\2\2\u05bc\u05bd\6\u009b\17\3\u05bd\u05c1\7$\2\2\u05be\u05bf\6\u009b"+
		"\20\3\u05bf\u05c1\7\61\2\2\u05c0\u0590\3\2\2\2\u05c0\u0594\3\2\2\2\u05c0"+
		"\u0598\3\2\2\2\u05c0\u059c\3\2\2\2\u05c0\u059e\3\2\2\2\u05c0\u05a0\3\2"+
		"\2\2\u05c0\u05a5\3\2\2\2\u05c0\u05a8\3\2\2\2\u05c0\u05ab\3\2\2\2\u05c0"+
		"\u05b1\3\2\2\2\u05c0\u05b4\3\2\2\2\u05c0\u05b7\3\2\2\2\u05c0\u05bc\3\2"+
		"\2\2\u05c0\u05be\3\2\2\2\u05c1\u05c4\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c2"+
		"\u05c3\3\2\2\2\u05c3\u0135\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c5\u05c6\7\4"+
		"\2\2\u05c6\u05c7\5\u0198\u00cd\2\u05c7\u0137\3\2\2\2\u05c8\u05c9\7\37"+
		"\2\2\u05c9\u0139\3\2\2\2\u05ca\u05cb\7\61\2\2\u05cb\u05cc\5\u0134\u009b"+
		"\2\u05cc\u05cd\7-\2\2\u05cd\u013b\3\2\2\2\u05ce\u05cf\7E\2\2\u05cf\u05d6"+
		"\5\u0172\u00ba\2\u05d0\u05d2\7\64\2\2\u05d1\u05d3\7\61\2\2\u05d2\u05d1"+
		"\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\5\u0172\u00ba"+
		"\2\u05d5\u05ce\3\2\2\2\u05d5\u05d0\3\2\2\2\u05d6\u013d\3\2\2\2\u05d7\u05d8"+
		"\5\u015a\u00ae\2\u05d8\u013f\3\2\2\2\u05d9\u05db\5\u0198\u00cd\2\u05da"+
		"\u05dc\5N(\2\u05db\u05da\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05e5\3\2\2"+
		"\2\u05dd\u05e5\5\u0142\u00a2\2\u05de\u05e5\5\u0150\u00a9\2\u05df\u05e5"+
		"\5\u0152\u00aa\2\u05e0\u05e5\5\u015a\u00ae\2\u05e1\u05e5\5\u0164\u00b3"+
		"\2\u05e2\u05e5\5\u0162\u00b2\2\u05e3\u05e5\5\u016a\u00b6\2\u05e4\u05d9"+
		"\3\2\2\2\u05e4\u05dd\3\2\2\2\u05e4\u05de\3\2\2\2\u05e4\u05df\3\2\2\2\u05e4"+
		"\u05e0\3\2\2\2\u05e4\u05e1\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e3\3\2"+
		"\2\2\u05e5\u0141\3\2\2\2\u05e6\u05ee\5\u01a0\u00d1\2\u05e7\u05ee\5\u0144"+
		"\u00a3\2\u05e8\u05ee\5\u014a\u00a6\2\u05e9\u05ee\7#\2\2\u05ea\u05ee\7"+
		"\16\2\2\u05eb\u05ee\7\24\2\2\u05ec\u05ee\7\25\2\2\u05ed\u05e6\3\2\2\2"+
		"\u05ed\u05e7\3\2\2\2\u05ed\u05e8\3\2\2\2\u05ed\u05e9\3\2\2\2\u05ed\u05ea"+
		"\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ec\3\2\2\2\u05ee\u0143\3\2\2\2\u05ef"+
		"\u05f1\7\b\2\2\u05f0\u05f2\5\u0146\u00a4\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2"+
		"\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\7&\2\2\u05f4\u0145\3\2\2\2\u05f5"+
		"\u05f7\5\u0148\u00a5\2\u05f6\u05f8\7*\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8"+
		"\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fa\5\u0148\u00a5\2\u05fa\u05fb\7"+
		"*\2\2\u05fb\u05fc\5\u0146\u00a4\2\u05fc\u0147\3\2\2\2\u05fd\u05fe\5\u0134"+
		"\u009b\2\u05fe\u0149\3\2\2\2\u05ff\u0600\7\b\2\2\u0600\u0601\5\u014c\u00a7"+
		"\2\u0601\u0602\7&\2\2\u0602\u0607\3\2\2\2\u0603\u0604\7\b\2\2\u0604\u0605"+
		"\7-\2\2\u0605\u0607\7&\2\2\u0606\u05ff\3\2\2\2\u0606\u0603\3\2\2\2\u0607"+
		"\u014b\3\2\2\2\u0608\u060a\5\u014e\u00a8\2\u0609\u060b\7*\2\2\u060a\u0609"+
		"\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060d\5\u014e\u00a8"+
		"\2\u060d\u060e\7*\2\2\u060e\u060f\5\u014c\u00a7\2\u060f\u014d\3\2\2\2"+
		"\u0610\u0611\5\u0134\u009b\2\u0611\u0612\7-\2\2\u0612\u0613\5\u0134\u009b"+
		"\2\u0613\u014f\3\2\2\2\u0614\u0621\7\5\2\2\u0615\u0616\7\5\2\2\u0616\u0617"+
		"\7F\2\2\u0617\u0621\5\u0198\u00cd\2\u0618\u0619\7\5\2\2\u0619\u061a\7"+
		"\b\2\2\u061a\u061b\5\u0134\u009b\2\u061b\u061c\7&\2\2\u061c\u0621\3\2"+
		"\2\2\u061d\u061e\7\5\2\2\u061e\u061f\7F\2\2\u061f\u0621\78\2\2\u0620\u0614"+
		"\3\2\2\2\u0620\u0615\3\2\2\2\u0620\u0618\3\2\2\2\u0620\u061d\3\2\2\2\u0621"+
		"\u0151\3\2\2\2\u0622\u0627\5\u0154\u00ab\2\u0623\u0624\5\u0156\u00ac\2"+
		"\u0624\u0625\5\u0158\u00ad\2\u0625\u0627\3\2\2\2\u0626\u0622\3\2\2\2\u0626"+
		"\u0623\3\2\2\2\u0627\u0153\3\2\2\2\u0628\u0629\7\30\2\2\u0629\u062a\7"+
		"F\2\2\u062a\u062b\5\u0198\u00cd\2\u062b\u0155\3\2\2\2\u062c\u062d\7\30"+
		"\2\2\u062d\u062e\7\b\2\2\u062e\u062f\5\u0134\u009b\2\u062f\u0630\7&\2"+
		"\2\u0630\u0157\3\2\2\2\u0631\u0632\7\30\2\2\u0632\u0633\7F\2\2\u0633\u0634"+
		"\78\2\2\u0634\u0159\3\2\2\2\u0635\u0637\7\67\2\2\u0636\u0638\5\u015c\u00af"+
		"\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063a"+
		"\5\6\4\2\u063a\u063b\7\23\2\2\u063b\u015b\3\2\2\2\u063c\u063e\5\u009e"+
		"P\2\u063d\u063f\5\u0098M\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u0640\3\2\2\2\u0640\u0641\7(\2\2\u0641\u065a\3\2\2\2\u0642\u0644\5\u019e"+
		"\u00d0\2\u0643\u0645\5\u0098M\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2"+
		"\2\u0645\u0646\3\2\2\2\u0646\u0647\7(\2\2\u0647\u065a\3\2\2\2\u0648\u0649"+
		"\5\u015e\u00b0\2\u0649\u064b\5\u009eP\2\u064a\u064c\5\u0098M\2\u064b\u064a"+
		"\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\7(\2\2\u064e"+
		"\u065a\3\2\2\2\u064f\u0650\5\u015e\u00b0\2\u0650\u0652\5\u019e\u00d0\2"+
		"\u0651\u0653\5\u0098M\2\u0652\u0651\3\2\2\2\u0652\u0653\3\2\2\2\u0653"+
		"\u0654\3\2\2\2\u0654\u0655\7(\2\2\u0655\u065a\3\2\2\2\u0656\u0657\5\u015e"+
		"\u00b0\2\u0657\u0658\7(\2\2\u0658\u065a\3\2\2\2\u0659\u063c\3\2\2\2\u0659"+
		"\u0642\3\2\2\2\u0659\u0648\3\2\2\2\u0659\u064f\3\2\2\2\u0659\u0656\3\2"+
		"\2\2\u065a\u015d\3\2\2\2\u065b\u065c\7\b\2\2\u065c\u065d\5\u0160\u00b1"+
		"\2\u065d\u065e\5\u0134\u009b\2\u065e\u065f\7&\2\2\u065f\u015f\3\2\2\2"+
		"\u0660\u0661\t\5\2\2\u0661\u0161\3\2\2\2\u0662\u0663\7F\2\2\u0663\u0664"+
		"\5\u0198\u00cd\2\u0664\u0163\3\2\2\2\u0665\u0667\7,\2\2\u0666\u0668\5"+
		"\u0166\u00b4\2\u0667\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\3\2"+
		"\2\2\u0669\u066a\7\32\2\2\u066a\u0165\3\2\2\2\u066b\u0671\5\u0168\u00b5"+
		"\2\u066c\u066d\5\u0168\u00b5\2\u066d\u066e\7*\2\2\u066e\u066f\5\u0166"+
		"\u00b4\2\u066f\u0671\3\2\2\2\u0670\u066b\3\2\2\2\u0670\u066c\3\2\2\2\u0671"+
		"\u0167\3\2\2\2\u0672\u0678\5\u0134\u009b\2\u0673\u0674\5\u0198\u00cd\2"+
		"\u0674\u0675\7-\2\2\u0675\u0676\5\u0134\u009b\2\u0676\u0678\3\2\2\2\u0677"+
		"\u0672\3\2\2\2\u0677\u0673\3\2\2\2\u0678\u0169\3\2\2\2\u0679\u067a\7\33"+
		"\2\2\u067a\u016b\3\2\2\2\u067b\u067c\7X\2\2\u067c\u016d\3\2\2\2\u067d"+
		"\u067e\7X\2\2\u067e\u016f\3\2\2\2\u067f\u0680\7X\2\2\u0680\u0171\3\2\2"+
		"\2\u0681\u0682\b\u00ba\1\2\u0682\u0686\5\u0176\u00bc\2\u0683\u0686\5\u017a"+
		"\u00be\2\u0684\u0686\5\u018c\u00c7\2\u0685\u0681\3\2\2\2\u0685\u0683\3"+
		"\2\2\2\u0685\u0684\3\2\2\2\u0686\u0699\3\2\2\2\u0687\u0688\6\u00ba\21"+
		"\3\u0688\u0689\7\31\2\2\u0689\u0698\5\u0172\u00ba\2\u068a\u068b\6\u00ba"+
		"\22\3\u068b\u068c\7\b\2\2\u068c\u0698\7&\2\2\u068d\u068e\6\u00ba\23\3"+
		"\u068e\u0698\7\61\2\2\u068f\u0690\6\u00ba\24\3\u0690\u0698\7$\2\2\u0691"+
		"\u0692\6\u00ba\25\3\u0692\u0693\7F\2\2\u0693\u0698\7\13\2\2\u0694\u0695"+
		"\6\u00ba\26\3\u0695\u0696\7F\2\2\u0696\u0698\7\f\2\2\u0697\u0687\3\2\2"+
		"\2\u0697\u068a\3\2\2\2\u0697\u068d\3\2\2\2\u0697\u068f\3\2\2\2\u0697\u0691"+
		"\3\2\2\2\u0697\u0694\3\2\2\2\u0698\u069b\3\2\2\2\u0699\u0697\3\2\2\2\u0699"+
		"\u069a\3\2\2\2\u069a\u0173\3\2\2\2\u069b\u0699\3\2\2\2\u069c\u069e\7-"+
		"\2\2\u069d\u069f\5\u012c\u0097\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2"+
		"\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\5\u0172\u00ba\2\u06a1\u0175\3\2\2\2"+
		"\u06a2\u06a4\5\u0178\u00bd\2\u06a3\u06a5\5N(\2\u06a4\u06a3\3\2\2\2\u06a4"+
		"\u06a5\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a8\5\u0178\u00bd\2\u06a7\u06a9"+
		"\5N(\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa"+
		"\u06ab\7F\2\2\u06ab\u06ac\5\u0176\u00bc\2\u06ac\u0177\3\2\2\2\u06ad\u06ae"+
		"\5\u0198\u00cd\2\u06ae\u0179\3\2\2\2\u06af\u06b1\7,\2\2\u06b0\u06b2\5"+
		"\u017c\u00bf\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2"+
		"\2\2\u06b3\u06b4\7\32\2\2\u06b4\u017b\3\2\2\2\u06b5\u06b7\5\u017e\u00c0"+
		"\2\u06b6\u06b8\7\66\2\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8"+
		"\u017d\3\2\2\2\u06b9\u06bf\5\u0180\u00c1\2\u06ba\u06bb\5\u0180\u00c1\2"+
		"\u06bb\u06bc\7*\2\2\u06bc\u06bd\5\u017e\u00c0\2\u06bd\u06bf\3\2\2\2\u06be"+
		"\u06b9\3\2\2\2\u06be\u06ba\3\2\2\2\u06bf\u017f\3\2\2\2\u06c0\u06c2\5\u012c"+
		"\u0097\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c4\3\2\2\2\u06c3"+
		"\u06c5\7\22\2\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c6\3"+
		"\2\2\2\u06c6\u06ce\5\u0172\u00ba\2\u06c7\u06c9\7\22\2\2\u06c8\u06c7\3"+
		"\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\5\u0182\u00c2"+
		"\2\u06cb\u06cc\5\u0174\u00bb\2\u06cc\u06ce\3\2\2\2\u06cd\u06c1\3\2\2\2"+
		"\u06cd\u06c8\3\2\2\2\u06ce\u0181\3\2\2\2\u06cf\u06d0\5\u0198\u00cd\2\u06d0"+
		"\u0183\3\2\2\2\u06d1\u06d2\5\u0172\u00ba\2\u06d2\u06d3\7\31\2\2\u06d3"+
		"\u06d4\5\u0172\u00ba\2\u06d4\u0185\3\2\2\2\u06d5\u06d6\b\u00c4\1\2\u06d6"+
		"\u06d7\5\u0172\u00ba\2\u06d7\u06d8\7\b\2\2\u06d8\u06d9\7&\2\2\u06d9\u06df"+
		"\3\2\2\2\u06da\u06db\6\u00c4\27\3\u06db\u06dc\7\b\2\2\u06dc\u06de\7&\2"+
		"\2\u06dd\u06da\3\2\2\2\u06de\u06e1\3\2\2\2\u06df\u06dd\3\2\2\2\u06df\u06e0"+
		"\3\2\2\2\u06e0\u0187\3\2\2\2\u06e1\u06df\3\2\2\2\u06e2\u06e3\5\u0172\u00ba"+
		"\2\u06e3\u06e4\7\61\2\2\u06e4\u0189\3\2\2\2\u06e5\u06e6\5\u0172\u00ba"+
		"\2\u06e6\u06e7\7$\2\2\u06e7\u018b\3\2\2\2\u06e8\u06e9\7Q\2\2\u06e9\u06eb"+
		"\7\t\2\2\u06ea\u06ec\5\u018e\u00c8\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3"+
		"\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\7P\2\2\u06ee\u018d\3\2\2\2\u06ef"+
		"\u06f5\5\u0190\u00c9\2\u06f0\u06f1\5\u0190\u00c9\2\u06f1\u06f2\7*\2\2"+
		"\u06f2\u06f3\5\u018e\u00c8\2\u06f3\u06f5\3\2\2\2\u06f4\u06ef\3\2\2\2\u06f4"+
		"\u06f0\3\2\2\2\u06f5\u018f\3\2\2\2\u06f6\u06f7\5\u0176\u00bc\2\u06f7\u0191"+
		"\3\2\2\2\u06f8\u06f9\5\u0172\u00ba\2\u06f9\u06fa\7F\2\2\u06fa\u06fb\7"+
		"\13\2\2\u06fb\u0701\3\2\2\2\u06fc\u06fd\5\u0172\u00ba\2\u06fd\u06fe\7"+
		"F\2\2\u06fe\u06ff\7\f\2\2\u06ff\u0701\3\2\2\2\u0700\u06f8\3\2\2\2\u0700"+
		"\u06fc\3\2\2\2\u0701\u0193\3\2\2\2\u0702\u0703\7-\2\2\u0703\u0704\5\u0196"+
		"\u00cc\2\u0704\u0195\3\2\2\2\u0705\u070b\5\u0176\u00bc\2\u0706\u0707\5"+
		"\u0176\u00bc\2\u0707\u0708\7*\2\2\u0708\u0709\5\u0196\u00cc\2\u0709\u070b"+
		"\3\2\2\2\u070a\u0705\3\2\2\2\u070a\u0706\3\2\2\2\u070b\u0197\3\2\2\2\u070c"+
		"\u070f\7Y\2\2\u070d\u070f\5\u019c\u00cf\2\u070e\u070c\3\2\2\2\u070e\u070d"+
		"\3\2\2\2\u070f\u0199\3\2\2\2\u0710\u0711\t\6\2\2\u0711\u019b\3\2\2\2\u0712"+
		"\u0713\t\7\2\2\u0713\u019d\3\2\2\2\u0714\u071a\5\u0198\u00cd\2\u0715\u0716"+
		"\5\u0198\u00cd\2\u0716\u0717\7*\2\2\u0717\u0718\5\u019e\u00d0\2\u0718"+
		"\u071a\3\2\2\2\u0719\u0714\3\2\2\2\u0719\u0715\3\2\2\2\u071a\u019f\3\2"+
		"\2\2\u071b\u071f\5\u01a2\u00d2\2\u071c\u071f\7_\2\2\u071d\u071f\7`\2\2"+
		"\u071e\u071b\3\2\2\2\u071e\u071c\3\2\2\2\u071e\u071d\3\2\2\2\u071f\u01a1"+
		"\3\2\2\2\u0720\u0721\t\b\2\2\u0721\u01a3\3\2\2\2\u00d0\u01a7\u01a9\u01b0"+
		"\u01b4\u01b8\u01bc\u01c1\u01c3\u01c8\u01ce\u01d2\u01d6\u01da\u01df\u01e3"+
		"\u01e7\u01ea\u01ee\u01fc\u0205\u020b\u020f\u0215\u021b\u0221\u022f\u0237"+
		"\u023b\u024e\u0259\u025d\u0261\u0267\u026c\u0275\u0280\u028a\u028e\u0298"+
		"\u02a7\u02b9\u02bd\u02c1\u02c7\u02cc\u02d0\u02db\u02df\u02e2\u02e5\u02ef"+
		"\u02f3\u030e\u0312\u0315\u0318\u0321\u032a\u032d\u0333\u0337\u0340\u0349"+
		"\u034c\u0351\u0358\u0361\u0364\u0368\u036d\u0371\u0383\u0389\u038c\u0392"+
		"\u0396\u039a\u03a2\u03a9\u03ad\u03b4\u03b7\u03ba\u03bd\u03c1\u03c5\u03c8"+
		"\u03cc\u03d0\u03d4\u03d7\u03da\u03de\u03e2\u03e8\u03ec\u03ef\u03f3\u03f7"+
		"\u03fd\u0401\u0404\u040e\u0412\u041a\u0420\u0426\u042a\u042d\u0437\u043b"+
		"\u0441\u0446\u0449\u0451\u0456\u045b\u045e\u0466\u046b\u0470\u0478\u0481"+
		"\u0485\u048f\u0495\u049f\u04a2\u04a6\u04ac\u04af\u04b6\u04be\u04c4\u04d4"+
		"\u04d7\u04de\u04e5\u04fb\u04fe\u050d\u0511\u0516\u051c\u0523\u052e\u0532"+
		"\u053b\u0541\u0546\u054a\u0558\u055e\u0564\u0568\u056c\u0571\u0576\u057e"+
		"\u0585\u058e\u05a3\u05af\u05c0\u05c2\u05d2\u05d5\u05db\u05e4\u05ed\u05f1"+
		"\u05f7\u0606\u060a\u0620\u0626\u0637\u063e\u0644\u064b\u0652\u0659\u0667"+
		"\u0670\u0677\u0685\u0697\u0699\u069e\u06a4\u06a8\u06b1\u06b7\u06be\u06c1"+
		"\u06c4\u06c8\u06cd\u06df\u06eb\u06f4\u0700\u070a\u070e\u0719\u071e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}