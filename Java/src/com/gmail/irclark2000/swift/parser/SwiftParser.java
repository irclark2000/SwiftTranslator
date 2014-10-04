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
		T__40=1, T__39=2, T__38=3, T__37=4, T__36=5, T__35=6, T__34=7, T__33=8, 
		T__32=9, T__31=10, T__30=11, T__29=12, T__28=13, T__27=14, T__26=15, T__25=16, 
		T__24=17, T__23=18, T__22=19, T__21=20, T__20=21, T__19=22, T__18=23, 
		T__17=24, T__16=25, T__15=26, T__14=27, T__13=28, T__12=29, T__11=30, 
		T__10=31, T__9=32, T__8=33, T__7=34, T__6=35, T__5=36, T__4=37, T__3=38, 
		T__2=39, T__1=40, T__0=41, Arithmetic_operator=42, TILDE=43, ARROW=44, 
		AS=45, AND=46, BREAK=47, CASE=48, CLASS=49, COLON=50, COMMA=51, CONTINUE=52, 
		DEFAULT=53, DIDSET=54, DIVIDE=55, DO=56, DOT=57, DOTDOT=58, EQUALS=59, 
		ELSE=60, ENUM=61, EXCLAMATION=62, FALLTHROUGH=63, FOR=64, FUNC=65, GET=66, 
		GTHAN=67, IDIVIDE=68, IF=69, IMPORT=70, IN=71, IS=72, ISEQUAL=73, LBRACE=74, 
		LBRACKET=75, LET=76, LPAREN=77, LTHAN=78, SLEFT=79, SRIGHT=80, MINUS=81, 
		MINUSMINUS=82, MOD=83, NOTEQUAL=84, OR=85, LAND=86, LOR=87, LXOR=88, OVERRIDE=89, 
		PLUS=90, PLUSPLUS=91, PUBLIC=92, PRIVATE=93, PROTOCOL=94, QMARK=95, RBRACE=96, 
		RBRACKET=97, RPAREN=98, RETURN=99, SELF=100, SEMI=101, SET=102, STAR=103, 
		STRUCT=104, SUPER=105, SWITCH=106, TYPEALIAS=107, VAR=108, WHERE=109, 
		WHILE=110, WILLSET=111, XOR=112, Identifier=113, Dot_operator_characters=114, 
		Dot_operator_head=115, Implicit_parameter_name=116, Binary_literal=117, 
		Octal_literal=118, Decimal_literal=119, Decimal_digits=120, Hexadecimal_literal=121, 
		Floating_point_literal=122, String_literal=123, Escaped_character=124, 
		WS=125, Block_comment=126, Line_comment=127;
	public static final String[] tokenNames = {
		"<INVALID>", "'left'", "'nonmutating'", "'Type'", "'Protocol'", "'__LINE__'", 
		"'postfix'", "'inout'", "'unowned(unsafe)'", "'__COLUMN__'", "'__FUNCTION__'", 
		"'_'", "'convenience'", "'@'", "'associativity'", "'lazy'", "'__FILE__'", 
		"'safe'", "'none'", "'dynamic'", "'unsafe'", "'precedence'", "'init'", 
		"'...'", "'deinit'", "'weak'", "'final'", "'infix'", "'dynamicType'", 
		"'mutating'", "'ional'", "'static'", "'required'", "'subscript'", "'unowned'", 
		"'operator'", "'prefix'", "'extension'", "'right'", "'unowned(safe)'", 
		"'#'", "'internal'", "Arithmetic_operator", "'~'", "'->'", "'as'", "'&'", 
		"'break'", "'case'", "'class'", "':'", "','", "'continue'", "'default'", 
		"'didSet'", "'/'", "'do'", "'.'", "'..'", "'='", "'else'", "'enum'", "'!'", 
		"'fallthrough'", "'for'", "'func'", "'get'", "'>'", "'\\'", "'if'", "'import'", 
		"'in'", "'is'", "'=='", "'{'", "'['", "'let'", "'('", "'<'", "'<<'", "'>>'", 
		"'-'", "'--'", "'%'", "'!='", "'|'", "'&&'", "'||'", "'^^'", "'override'", 
		"'+'", "'++'", "'public'", "'private'", "'protocol'", "'?'", "'}'", "']'", 
		"')'", "'return'", "'self'", "';'", "'set'", "'*'", "'struct'", "'super'", 
		"'switch'", "'typealias'", "'var'", "'where'", "'while'", "'willSet'", 
		"'^'", "Identifier", "Dot_operator_characters", "Dot_operator_head", "Implicit_parameter_name", 
		"Binary_literal", "Octal_literal", "Decimal_literal", "Decimal_digits", 
		"Hexadecimal_literal", "Floating_point_literal", "String_literal", "Escaped_character", 
		"WS", "Block_comment", "Line_comment"
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
		RULE_top_level_declaration = 43, RULE_code_block = 44, RULE_import_declaration = 45, 
		RULE_import_kind = 46, RULE_import_path = 47, RULE_import_path_identifier = 48, 
		RULE_constant_declaration = 49, RULE_pattern_initializer_list = 50, RULE_pattern_initializer = 51, 
		RULE_initializer = 52, RULE_variable_declaration = 53, RULE_variable_declaration_head = 54, 
		RULE_variable_name = 55, RULE_getter_setter_block = 56, RULE_getter_clause = 57, 
		RULE_setter_clause = 58, RULE_setter_name = 59, RULE_getter_setter_keyword_block = 60, 
		RULE_getter_keyword_clause = 61, RULE_setter_keyword_clause = 62, RULE_willSet_didSet_block = 63, 
		RULE_willSet_clause = 64, RULE_didSet_clause = 65, RULE_typealias_declaration = 66, 
		RULE_typealias_head = 67, RULE_typealias_name = 68, RULE_typealias_assignment = 69, 
		RULE_function_declaration = 70, RULE_function_head = 71, RULE_function_name = 72, 
		RULE_function_signature = 73, RULE_function_result = 74, RULE_function_body = 75, 
		RULE_parameter_clauses = 76, RULE_parameter_clause = 77, RULE_parameter_list = 78, 
		RULE_parameter = 79, RULE_external_parameter_name = 80, RULE_local_parameter_name = 81, 
		RULE_default_argument_clause = 82, RULE_enum_declaration = 83, RULE_union_style_enum = 84, 
		RULE_union_style_enum_members = 85, RULE_union_style_enum_member = 86, 
		RULE_union_style_enum_case_clause = 87, RULE_union_style_enum_case_list = 88, 
		RULE_union_style_enum_case = 89, RULE_enum_name = 90, RULE_enum_case_name = 91, 
		RULE_raw_value_style_enum = 92, RULE_raw_value_style_enum_members = 93, 
		RULE_raw_value_style_enum_member = 94, RULE_raw_value_style_enum_case_clause = 95, 
		RULE_raw_value_style_enum_case_list = 96, RULE_raw_value_style_enum_case = 97, 
		RULE_raw_value_assignment = 98, RULE_struct_declaration = 99, RULE_struct_name = 100, 
		RULE_struct_body = 101, RULE_class_declaration = 102, RULE_class_name = 103, 
		RULE_class_body = 104, RULE_protocol_declaration = 105, RULE_protocol_name = 106, 
		RULE_protocol_body = 107, RULE_protocol_member_declaration = 108, RULE_protocol_member_declarations = 109, 
		RULE_protocol_property_declaration = 110, RULE_protocol_method_declaration = 111, 
		RULE_protocol_initializer_declaration = 112, RULE_protocol_subscript_declaration = 113, 
		RULE_protocol_associated_type_declaration = 114, RULE_initializer_declaration = 115, 
		RULE_initializer_head = 116, RULE_initializer_body = 117, RULE_deinitializer_declaration = 118, 
		RULE_extension_declaration = 119, RULE_extension_body = 120, RULE_subscript_declaration = 121, 
		RULE_subscript_head = 122, RULE_subscript_result = 123, RULE_operator_declaration = 124, 
		RULE_prefix_operator_declaration = 125, RULE_postfix_operator_declaration = 126, 
		RULE_infix_operator_declaration = 127, RULE_infix_operator_attributes = 128, 
		RULE_precedence_clause = 129, RULE_precedence_level = 130, RULE_associativity_clause = 131, 
		RULE_associativity = 132, RULE_declaration_modifier = 133, RULE_declaration_modifiers = 134, 
		RULE_access_level_modifier = 135, RULE_access_level_modifiers = 136, RULE_pattern = 137, 
		RULE_wildcard_pattern = 138, RULE_identifier_pattern = 139, RULE_value_binding_pattern = 140, 
		RULE_tuple_pattern = 141, RULE_tuple_pattern_element_list = 142, RULE_tuple_pattern_element = 143, 
		RULE_enum_case_pattern = 144, RULE_type_casting_pattern = 145, RULE_is_pattern = 146, 
		RULE_as_pattern = 147, RULE_expression_pattern = 148, RULE_attribute = 149, 
		RULE_attribute_name = 150, RULE_attribute_argument_clause = 151, RULE_attributes = 152, 
		RULE_balanced_tokens = 153, RULE_balanced_token = 154, RULE_context_sensitive_keyword = 155, 
		RULE_expression = 156, RULE_expression_list = 157, RULE_prefix_expression = 158, 
		RULE_in_out_expression = 159, RULE_binary_expression = 160, RULE_binary_expressions = 161, 
		RULE_assignment_operator = 162, RULE_conditional_operator = 163, RULE_type_casting_operator = 164, 
		RULE_primary_expression = 165, RULE_literal_expression = 166, RULE_array_literal = 167, 
		RULE_array_literal_items = 168, RULE_array_literal_item = 169, RULE_dictionary_literal = 170, 
		RULE_dictionary_literal_items = 171, RULE_dictionary_literal_item = 172, 
		RULE_self_expression = 173, RULE_superclass_expression = 174, RULE_superclass_method_expression = 175, 
		RULE_superclass_subscript_expression = 176, RULE_superclass_initializer_expression = 177, 
		RULE_closure_expression = 178, RULE_closure_signature = 179, RULE_capture_list = 180, 
		RULE_capture_specifier = 181, RULE_implicit_member_expression = 182, RULE_parenthesized_expression = 183, 
		RULE_expression_element_list = 184, RULE_expression_element = 185, RULE_wildcard_expression = 186, 
		RULE_postfix_expression = 187, RULE_function_call_expression = 188, RULE_trailing_closure = 189, 
		RULE_initializer_expression = 190, RULE_explicit_member_expression = 191, 
		RULE_postfix_self_expression = 192, RULE_dynamic_type_expression = 193, 
		RULE_subscript_expression = 194, RULE_forced_value_expression = 195, RULE_optional_chaining_expression = 196, 
		RULE_type = 197, RULE_type_annotation = 198, RULE_type_identifier = 199, 
		RULE_type_name = 200, RULE_tuple_type = 201, RULE_tuple_type_body = 202, 
		RULE_tuple_type_element_list = 203, RULE_tuple_type_element = 204, RULE_element_name = 205, 
		RULE_function_type = 206, RULE_array_type = 207, RULE_dictionary_type = 208, 
		RULE_optional_type = 209, RULE_implicitly_unwrapped_optional_type = 210, 
		RULE_protocol_composition_type = 211, RULE_protocol_identifier_list = 212, 
		RULE_protocol_identifier = 213, RULE_metatype_type = 214, RULE_type_inheritance_clause = 215, 
		RULE_type_inheritance_list = 216, RULE_class_requirement = 217, RULE_binary_operator = 218, 
		RULE_prefix_operator = 219, RULE_postfix_operator = 220, RULE_operator = 221, 
		RULE_arithmetic_operator = 222, RULE_decimal_digits = 223, RULE_identifier = 224, 
		RULE_identifier_list = 225, RULE_literal = 226, RULE_integer_literal = 227;
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
		"generic_argument", "declaration", "declarations", "top_level_declaration", 
		"code_block", "import_declaration", "import_kind", "import_path", "import_path_identifier", 
		"constant_declaration", "pattern_initializer_list", "pattern_initializer", 
		"initializer", "variable_declaration", "variable_declaration_head", "variable_name", 
		"getter_setter_block", "getter_clause", "setter_clause", "setter_name", 
		"getter_setter_keyword_block", "getter_keyword_clause", "setter_keyword_clause", 
		"willSet_didSet_block", "willSet_clause", "didSet_clause", "typealias_declaration", 
		"typealias_head", "typealias_name", "typealias_assignment", "function_declaration", 
		"function_head", "function_name", "function_signature", "function_result", 
		"function_body", "parameter_clauses", "parameter_clause", "parameter_list", 
		"parameter", "external_parameter_name", "local_parameter_name", "default_argument_clause", 
		"enum_declaration", "union_style_enum", "union_style_enum_members", "union_style_enum_member", 
		"union_style_enum_case_clause", "union_style_enum_case_list", "union_style_enum_case", 
		"enum_name", "enum_case_name", "raw_value_style_enum", "raw_value_style_enum_members", 
		"raw_value_style_enum_member", "raw_value_style_enum_case_clause", "raw_value_style_enum_case_list", 
		"raw_value_style_enum_case", "raw_value_assignment", "struct_declaration", 
		"struct_name", "struct_body", "class_declaration", "class_name", "class_body", 
		"protocol_declaration", "protocol_name", "protocol_body", "protocol_member_declaration", 
		"protocol_member_declarations", "protocol_property_declaration", "protocol_method_declaration", 
		"protocol_initializer_declaration", "protocol_subscript_declaration", 
		"protocol_associated_type_declaration", "initializer_declaration", "initializer_head", 
		"initializer_body", "deinitializer_declaration", "extension_declaration", 
		"extension_body", "subscript_declaration", "subscript_head", "subscript_result", 
		"operator_declaration", "prefix_operator_declaration", "postfix_operator_declaration", 
		"infix_operator_declaration", "infix_operator_attributes", "precedence_clause", 
		"precedence_level", "associativity_clause", "associativity", "declaration_modifier", 
		"declaration_modifiers", "access_level_modifier", "access_level_modifiers", 
		"pattern", "wildcard_pattern", "identifier_pattern", "value_binding_pattern", 
		"tuple_pattern", "tuple_pattern_element_list", "tuple_pattern_element", 
		"enum_case_pattern", "type_casting_pattern", "is_pattern", "as_pattern", 
		"expression_pattern", "attribute", "attribute_name", "attribute_argument_clause", 
		"attributes", "balanced_tokens", "balanced_token", "context_sensitive_keyword", 
		"expression", "expression_list", "prefix_expression", "in_out_expression", 
		"binary_expression", "binary_expressions", "assignment_operator", "conditional_operator", 
		"type_casting_operator", "primary_expression", "literal_expression", "array_literal", 
		"array_literal_items", "array_literal_item", "dictionary_literal", "dictionary_literal_items", 
		"dictionary_literal_item", "self_expression", "superclass_expression", 
		"superclass_method_expression", "superclass_subscript_expression", "superclass_initializer_expression", 
		"closure_expression", "closure_signature", "capture_list", "capture_specifier", 
		"implicit_member_expression", "parenthesized_expression", "expression_element_list", 
		"expression_element", "wildcard_expression", "postfix_expression", "function_call_expression", 
		"trailing_closure", "initializer_expression", "explicit_member_expression", 
		"postfix_self_expression", "dynamic_type_expression", "subscript_expression", 
		"forced_value_expression", "optional_chaining_expression", "type", "type_annotation", 
		"type_identifier", "type_name", "tuple_type", "tuple_type_body", "tuple_type_element_list", 
		"tuple_type_element", "element_name", "function_type", "array_type", "dictionary_type", 
		"optional_type", "implicitly_unwrapped_optional_type", "protocol_composition_type", 
		"protocol_identifier_list", "protocol_identifier", "metatype_type", "type_inheritance_clause", 
		"type_inheritance_list", "class_requirement", "binary_operator", "prefix_operator", 
		"postfix_operator", "operator", "arithmetic_operator", "decimal_digits", 
		"identifier", "identifier_list", "literal", "integer_literal"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << TILDE) | (1L << AND) | (1L << BREAK) | (1L << CLASS) | (1L << CONTINUE) | (1L << DIDSET) | (1L << DO) | (1L << DOT) | (1L << ENUM) | (1L << EXCLAMATION) | (1L << FALLTHROUGH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FUNC - 64)) | (1L << (GET - 64)) | (1L << (IF - 64)) | (1L << (IMPORT - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACKET - 64)) | (1L << (LET - 64)) | (1L << (LPAREN - 64)) | (1L << (MINUSMINUS - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTOCOL - 64)) | (1L << (QMARK - 64)) | (1L << (RETURN - 64)) | (1L << (SELF - 64)) | (1L << (SET - 64)) | (1L << (STRUCT - 64)) | (1L << (SUPER - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEALIAS - 64)) | (1L << (VAR - 64)) | (1L << (WHILE - 64)) | (1L << (WILLSET - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				{
				setState(456); statement();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462); match(EOF);
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
			setState(492);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464); expression();
				setState(466);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(465); match(SEMI);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468); declaration();
				setState(470);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(469); match(SEMI);
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472); expression();
				setState(474);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(473); match(SEMI);
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(476); loop_statement();
				setState(478);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(477); match(SEMI);
					}
				}

				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(480); branch_statement();
				setState(482);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(481); match(SEMI);
					}
				}

				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(484); labeled_statement();
				setState(486);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(485); match(SEMI);
					}
				}

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(488); control_transfer_statement();
				setState(490);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(489); match(SEMI);
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
			setState(495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(494); statement();
				}
				}
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << TILDE) | (1L << AND) | (1L << BREAK) | (1L << CLASS) | (1L << CONTINUE) | (1L << DIDSET) | (1L << DO) | (1L << DOT) | (1L << ENUM) | (1L << EXCLAMATION) | (1L << FALLTHROUGH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FUNC - 64)) | (1L << (GET - 64)) | (1L << (IF - 64)) | (1L << (IMPORT - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACKET - 64)) | (1L << (LET - 64)) | (1L << (LPAREN - 64)) | (1L << (MINUSMINUS - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTOCOL - 64)) | (1L << (QMARK - 64)) | (1L << (RETURN - 64)) | (1L << (SELF - 64)) | (1L << (SET - 64)) | (1L << (STRUCT - 64)) | (1L << (SUPER - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEALIAS - 64)) | (1L << (VAR - 64)) | (1L << (WHILE - 64)) | (1L << (WILLSET - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0) );
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
			setState(503);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499); for_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500); for_in_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501); while_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(502); do_while_statement();
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
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505); match(FOR);
				setState(507);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << TILDE) | (1L << AND) | (1L << CLASS) | (1L << DIDSET) | (1L << DOT) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (QMARK - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (VAR - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
					{
					setState(506); for_init();
					}
				}

				setState(509); match(SEMI);
				setState(511);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
					{
					setState(510); expression();
					}
				}

				setState(513); match(SEMI);
				setState(515);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(514); expression();
					}
					break;
				}
				setState(517); code_block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518); match(FOR);
				{
				setState(520);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << TILDE) | (1L << AND) | (1L << CLASS) | (1L << DIDSET) | (1L << DOT) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (PUBLIC - 66)) | (1L << (PRIVATE - 66)) | (1L << (QMARK - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (VAR - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
					{
					setState(519); for_init();
					}
				}

				setState(522); match(SEMI);
				setState(524);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
					{
					setState(523); expression();
					}
				}

				setState(526); match(SEMI);
				setState(528);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(527); expression();
					}
					break;
				}
				}
				setState(530); code_block();
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
			setState(535);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533); variable_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534); expression_list();
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
			setState(537); match(FOR);
			setState(538); pattern(0);
			setState(539); match(IN);
			setState(540); expression();
			setState(541); code_block();
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
			setState(543); match(WHILE);
			setState(544); while_condition();
			setState(545); code_block();
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
			setState(549);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548); declaration();
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
			setState(551); match(DO);
			setState(552); code_block();
			setState(553); match(WHILE);
			setState(554); while_condition();
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
			setState(558);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(556); if_statement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(557); switch_statement();
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
			setState(560); match(IF);
			setState(561); if_condition();
			setState(562); code_block();
			setState(564);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(563); else_clause();
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
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567); declaration();
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
			setState(574);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570); match(ELSE);
				setState(571); code_block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572); match(ELSE);
				setState(573); if_statement();
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
			setState(576); match(SWITCH);
			setState(577); expression();
			setState(578); match(LBRACE);
			setState(580);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT) {
				{
				setState(579); switch_cases();
				}
			}

			setState(582); match(RBRACE);
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
			setState(584); switch_case();
			setState(586);
			_la = _input.LA(1);
			if (_la==CASE || _la==DEFAULT) {
				{
				setState(585); switch_cases();
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
			setState(600);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(588); case_label();
				setState(589); statements();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591); default_label();
				setState(592); statements();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594); case_label();
				setState(595); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(597); default_label();
				setState(598); match(SEMI);
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
			setState(602); match(CASE);
			setState(603); case_item_list();
			setState(604); match(COLON);
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
			setState(606); pattern(0);
			setState(608);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(607); guard_clause();
				}
			}

			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(610); match(COMMA);
				setState(611); pattern(0);
				setState(613);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(612); guard_clause();
					}
				}

				}
				}
				setState(619);
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
			setState(620); match(DEFAULT);
			setState(621); match(COLON);
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
			setState(623); match(WHERE);
			setState(624); guard_expression();
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
			setState(626); expression();
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
			setState(634);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628); statement_label();
				setState(629); loop_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631); statement_label();
				setState(632); switch_statement();
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
			setState(636); label_name();
			setState(637); match(COLON);
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
			setState(639); identifier();
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
			setState(645);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(641); break_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(642); continue_statement();
				}
				break;
			case FALLTHROUGH:
				enterOuterAlt(_localctx, 3);
				{
				setState(643); fallthrough_statement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(644); return_statement();
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
			setState(647); match(BREAK);
			setState(649);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(648); label_name();
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
			setState(651); match(CONTINUE);
			setState(653);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(652); label_name();
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
			setState(655); match(FALLTHROUGH);
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
			setState(657); match(RETURN);
			setState(659);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(658); expression();
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
			setState(661); match(LTHAN);
			setState(662); generic_parameter_list();
			setState(664);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(663); requirement_clause();
				}
			}

			setState(666); match(GTHAN);
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
		public Generic_parameterContext generic_parameter(int i) {
			return getRuleContext(Generic_parameterContext.class,i);
		}
		public List<Generic_parameterContext> generic_parameter() {
			return getRuleContexts(Generic_parameterContext.class);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668); generic_parameter();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(669); match(COMMA);
				setState(670); generic_parameter();
				}
				}
				setState(675);
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
			setState(685);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676); type_name();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677); type_name();
				setState(678); match(COLON);
				setState(679); type_identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681); type_name();
				setState(682); match(COLON);
				setState(683); protocol_composition_type();
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
			setState(687); match(WHERE);
			setState(688); requirement_list();
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
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); requirement();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(691); match(COMMA);
				setState(692); requirement();
				}
				}
				setState(697);
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
			setState(700);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698); conformance_requirement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699); same_type_requirement();
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
			setState(710);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702); type_identifier();
				setState(703); match(COLON);
				setState(704); type_identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706); type_identifier();
				setState(707); match(COLON);
				setState(708); protocol_composition_type();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); type_identifier();
			setState(713);
			_la = _input.LA(1);
			if ( !(_la==ISEQUAL || _la==NOTEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(714); type_identifier();
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
			setState(716); match(LTHAN);
			setState(717); generic_argument_list();
			setState(718); match(GTHAN);
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
		public Generic_argumentContext generic_argument(int i) {
			return getRuleContext(Generic_argumentContext.class,i);
		}
		public List<Generic_argumentContext> generic_argument() {
			return getRuleContexts(Generic_argumentContext.class);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720); generic_argument();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(721); match(COMMA);
				setState(722); generic_argument();
				}
				}
				setState(727);
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
			setState(728); type(0);
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
			setState(744);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730); import_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731); constant_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(732); variable_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733); typealias_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(734); function_declaration();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(735); enum_declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(736); struct_declaration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(737); class_declaration();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(738); protocol_declaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(739); initializer_declaration();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(740); deinitializer_declaration();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(741); extension_declaration();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(742); subscript_declaration();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(743); operator_declaration();
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
			setState(747); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(746); declaration();
				}
				}
				setState(749); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 41) | (1L << CLASS) | (1L << ENUM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (IMPORT - 65)) | (1L << (LET - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTOCOL - 65)) | (1L << (QMARK - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0) );
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

	public static class Top_level_declarationContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Top_level_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTop_level_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTop_level_declaration(this);
		}
	}

	public final Top_level_declarationContext top_level_declaration() throws RecognitionException {
		Top_level_declarationContext _localctx = new Top_level_declarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_top_level_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << TILDE) | (1L << AND) | (1L << BREAK) | (1L << CLASS) | (1L << CONTINUE) | (1L << DIDSET) | (1L << DO) | (1L << DOT) | (1L << ENUM) | (1L << EXCLAMATION) | (1L << FALLTHROUGH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FUNC - 64)) | (1L << (GET - 64)) | (1L << (IF - 64)) | (1L << (IMPORT - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACKET - 64)) | (1L << (LET - 64)) | (1L << (LPAREN - 64)) | (1L << (MINUSMINUS - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTOCOL - 64)) | (1L << (QMARK - 64)) | (1L << (RETURN - 64)) | (1L << (SELF - 64)) | (1L << (SET - 64)) | (1L << (STRUCT - 64)) | (1L << (SUPER - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEALIAS - 64)) | (1L << (VAR - 64)) | (1L << (WHILE - 64)) | (1L << (WILLSET - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(751); statements();
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
		enterRule(_localctx, 88, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); match(LBRACE);
			setState(756);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 41) | (1L << TILDE) | (1L << AND) | (1L << BREAK) | (1L << CLASS) | (1L << CONTINUE) | (1L << DIDSET) | (1L << DO) | (1L << DOT) | (1L << ENUM) | (1L << EXCLAMATION) | (1L << FALLTHROUGH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FOR - 64)) | (1L << (FUNC - 64)) | (1L << (GET - 64)) | (1L << (IF - 64)) | (1L << (IMPORT - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACKET - 64)) | (1L << (LET - 64)) | (1L << (LPAREN - 64)) | (1L << (MINUSMINUS - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PLUSPLUS - 64)) | (1L << (PUBLIC - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTOCOL - 64)) | (1L << (QMARK - 64)) | (1L << (RETURN - 64)) | (1L << (SELF - 64)) | (1L << (SET - 64)) | (1L << (STRUCT - 64)) | (1L << (SUPER - 64)) | (1L << (SWITCH - 64)) | (1L << (TYPEALIAS - 64)) | (1L << (VAR - 64)) | (1L << (WHILE - 64)) | (1L << (WILLSET - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(755); statements();
				}
			}

			setState(758); match(RBRACE);
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
		enterRule(_localctx, 90, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(760); attributes();
				}
			}

			setState(763); match(IMPORT);
			setState(765);
			_la = _input.LA(1);
			if (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (CLASS - 49)) | (1L << (ENUM - 49)) | (1L << (FUNC - 49)) | (1L << (PROTOCOL - 49)) | (1L << (STRUCT - 49)) | (1L << (TYPEALIAS - 49)) | (1L << (VAR - 49)))) != 0)) {
				{
				setState(764); import_kind();
				}
			}

			setState(767); import_path();
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
		enterRule(_localctx, 92, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (CLASS - 49)) | (1L << (ENUM - 49)) | (1L << (FUNC - 49)) | (1L << (PROTOCOL - 49)) | (1L << (STRUCT - 49)) | (1L << (TYPEALIAS - 49)) | (1L << (VAR - 49)))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_import_path);
		try {
			setState(776);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771); import_path_identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772); import_path_identifier();
				setState(773); match(DOT);
				setState(774); import_path();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		enterRule(_localctx, 96, RULE_import_path_identifier);
		try {
			setState(780);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 6:
			case 7:
			case 8:
			case 14:
			case 18:
			case 21:
			case 22:
			case 25:
			case 27:
			case 29:
			case 34:
			case 35:
			case 36:
			case 38:
			case 39:
			case DIDSET:
			case GET:
			case OVERRIDE:
			case SET:
			case WILLSET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(778); identifier();
				}
				break;
			case Arithmetic_operator:
			case DOT:
			case EQUALS:
			case EXCLAMATION:
			case GTHAN:
			case ISEQUAL:
			case LTHAN:
			case NOTEQUAL:
			case Dot_operator_head:
				enterOuterAlt(_localctx, 2);
				{
				setState(779); operator();
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
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
		enterRule(_localctx, 98, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(782); attributes();
				}
			}

			setState(786);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 15) | (1L << 19) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 36) | (1L << 41) | (1L << CLASS))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (OVERRIDE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (QMARK - 89)))) != 0)) {
				{
				setState(785); declaration_modifiers();
				}
			}

			setState(788); match(LET);
			setState(789); pattern_initializer_list();
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
		public Pattern_initializerContext pattern_initializer(int i) {
			return getRuleContext(Pattern_initializerContext.class,i);
		}
		public List<Pattern_initializerContext> pattern_initializer() {
			return getRuleContexts(Pattern_initializerContext.class);
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
		enterRule(_localctx, 100, RULE_pattern_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791); pattern_initializer();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(792); match(COMMA);
				setState(793); pattern_initializer();
				}
				}
				setState(798);
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
		enterRule(_localctx, 102, RULE_pattern_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799); pattern(0);
			setState(801);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(800); initializer();
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
		enterRule(_localctx, 104, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803); match(EQUALS);
			setState(804); expression();
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
		enterRule(_localctx, 106, RULE_variable_declaration);
		int _la;
		try {
			setState(832);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806); variable_declaration_head();
				setState(807); pattern_initializer_list();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809); variable_declaration_head();
				setState(810); variable_name();
				setState(811); type_annotation();
				setState(812); code_block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(814); variable_declaration_head();
				setState(815); variable_name();
				setState(816); type_annotation();
				setState(817); getter_setter_block();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(819); variable_declaration_head();
				setState(820); variable_name();
				setState(821); type_annotation();
				setState(822); getter_setter_keyword_block();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(824); variable_declaration_head();
				setState(825); variable_name();
				setState(826); type_annotation();
				setState(828);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(827); initializer();
					}
				}

				setState(830); willSet_didSet_block();
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
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
		enterRule(_localctx, 108, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(834); attributes();
				}
			}

			setState(838);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 15) | (1L << 19) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 36) | (1L << 41) | (1L << CLASS))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (OVERRIDE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (QMARK - 89)))) != 0)) {
				{
				setState(837); declaration_modifiers();
				}
			}

			setState(840); match(VAR);
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
		enterRule(_localctx, 110, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842); identifier();
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
		enterRule(_localctx, 112, RULE_getter_setter_block);
		int _la;
		try {
			setState(856);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844); match(LBRACE);
				setState(845); getter_clause();
				setState(847);
				_la = _input.LA(1);
				if (_la==13 || _la==SET) {
					{
					setState(846); setter_clause();
					}
				}

				setState(849); match(RBRACE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851); match(LBRACE);
				setState(852); setter_clause();
				setState(853); getter_clause();
				setState(854); match(RBRACE);
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
		enterRule(_localctx, 114, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(858); attributes();
				}
			}

			setState(861); match(GET);
			setState(862); code_block();
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
		enterRule(_localctx, 116, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(864); attributes();
				}
			}

			setState(867); match(SET);
			setState(869);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(868); setter_name();
				}
			}

			setState(871); code_block();
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
		enterRule(_localctx, 118, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873); match(LPAREN);
			setState(874); identifier();
			setState(875); match(RPAREN);
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
		enterRule(_localctx, 120, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(889);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(877); match(LBRACE);
				setState(878); getter_keyword_clause();
				setState(880);
				_la = _input.LA(1);
				if (_la==13 || _la==SET) {
					{
					setState(879); setter_keyword_clause();
					}
				}

				setState(882); match(RBRACE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(884); match(LBRACE);
				setState(885); setter_keyword_clause();
				setState(886); getter_keyword_clause();
				setState(887); match(RBRACE);
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
		enterRule(_localctx, 122, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(891); attributes();
				}
			}

			setState(894); match(GET);
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
		enterRule(_localctx, 124, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(896); attributes();
				}
			}

			setState(899); match(SET);
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
		enterRule(_localctx, 126, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(913);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(901); match(LBRACE);
				setState(902); willSet_clause();
				setState(904);
				_la = _input.LA(1);
				if (_la==13 || _la==DIDSET) {
					{
					setState(903); didSet_clause();
					}
				}

				setState(906); match(RBRACE);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908); match(LBRACE);
				setState(909); didSet_clause();
				setState(910); willSet_clause();
				setState(911); match(RBRACE);
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
		enterRule(_localctx, 128, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(915); attributes();
				}
			}

			setState(918); match(WILLSET);
			setState(920);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(919); setter_name();
				}
			}

			setState(922); code_block();
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
		enterRule(_localctx, 130, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(924); attributes();
				}
			}

			setState(927); match(DIDSET);
			setState(929);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(928); setter_name();
				}
			}

			setState(931); code_block();
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
		enterRule(_localctx, 132, RULE_typealias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933); typealias_head();
			setState(934); typealias_assignment();
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
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
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
		enterRule(_localctx, 134, RULE_typealias_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(936); attributes();
				}
			}

			setState(940);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (41 - 41)) | (1L << (PUBLIC - 41)) | (1L << (PRIVATE - 41)))) != 0)) {
				{
				setState(939); access_level_modifier();
				}
			}

			setState(942); match(TYPEALIAS);
			setState(943); typealias_name();
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
		enterRule(_localctx, 136, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945); identifier();
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
		enterRule(_localctx, 138, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947); match(EQUALS);
			setState(948); type(0);
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
		enterRule(_localctx, 140, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950); function_head();
			setState(951); function_name();
			setState(953);
			_la = _input.LA(1);
			if (_la==LTHAN) {
				{
				setState(952); generic_parameter_clause();
				}
			}

			setState(955); function_signature();
			setState(956); function_body();
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
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
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
		enterRule(_localctx, 142, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(958); attributes();
				}
			}

			setState(962);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 15) | (1L << 19) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 36) | (1L << 41) | (1L << CLASS))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (OVERRIDE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (QMARK - 89)))) != 0)) {
				{
				setState(961); declaration_modifiers();
				}
			}

			setState(964); match(FUNC);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		enterRule(_localctx, 144, RULE_function_name);
		try {
			setState(968);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 6:
			case 7:
			case 8:
			case 14:
			case 18:
			case 21:
			case 22:
			case 25:
			case 27:
			case 29:
			case 34:
			case 35:
			case 36:
			case 38:
			case 39:
			case DIDSET:
			case GET:
			case OVERRIDE:
			case SET:
			case WILLSET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(966); identifier();
				}
				break;
			case Arithmetic_operator:
			case DOT:
			case EQUALS:
			case EXCLAMATION:
			case GTHAN:
			case ISEQUAL:
			case LTHAN:
			case NOTEQUAL:
			case Dot_operator_head:
				enterOuterAlt(_localctx, 2);
				{
				setState(967); operator();
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
		enterRule(_localctx, 146, RULE_function_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970); parameter_clauses();
			setState(972);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(971); function_result();
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
		enterRule(_localctx, 148, RULE_function_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); match(ARROW);
			setState(976);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(975); attributes();
				}
			}

			setState(978); type(0);
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
		enterRule(_localctx, 150, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980); code_block();
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
		enterRule(_localctx, 152, RULE_parameter_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982); parameter_clause();
			setState(984);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(983); parameter_clauses();
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
		enterRule(_localctx, 154, RULE_parameter_clause);
		int _la;
		try {
			setState(995);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(986); match(LPAREN);
				setState(987); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988); match(LPAREN);
				setState(989); parameter_list();
				setState(991);
				_la = _input.LA(1);
				if (_la==23) {
					{
					setState(990); match(23);
					}
				}

				setState(993); match(RPAREN);
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
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
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
		enterRule(_localctx, 156, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); parameter();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(998); match(COMMA);
				setState(999); parameter();
				}
				}
				setState(1004);
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

	public static class ParameterContext extends ParserRuleContext {
		public External_parameter_nameContext external_parameter_name() {
			return getRuleContext(External_parameter_nameContext.class,0);
		}
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
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
		enterRule(_localctx, 158, RULE_parameter);
		int _la;
		try {
			setState(1041);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(1005); match(7);
					}
					break;
				}
				setState(1009);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(1008); match(LET);
					}
				}

				setState(1012);
				_la = _input.LA(1);
				if (_la==40) {
					{
					setState(1011); match(40);
					}
				}

				setState(1015);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(1014); external_parameter_name();
					}
					break;
				}
				setState(1017); local_parameter_name();
				setState(1018); type_annotation();
				setState(1020);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(1019); default_argument_clause();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				_la = _input.LA(1);
				if (_la==7) {
					{
					setState(1022); match(7);
					}
				}

				setState(1025); match(VAR);
				setState(1027);
				_la = _input.LA(1);
				if (_la==40) {
					{
					setState(1026); match(40);
					}
				}

				setState(1030);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(1029); external_parameter_name();
					}
					break;
				}
				setState(1032); local_parameter_name();
				setState(1033); type_annotation();
				setState(1035);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(1034); default_argument_clause();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1038);
				_la = _input.LA(1);
				if (_la==13) {
					{
					setState(1037); attributes();
					}
				}

				setState(1040); type(0);
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

	public static class External_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public External_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExternal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExternal_parameter_name(this);
		}
	}

	public final External_parameter_nameContext external_parameter_name() throws RecognitionException {
		External_parameter_nameContext _localctx = new External_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_external_parameter_name);
		try {
			setState(1045);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 6:
			case 7:
			case 8:
			case 14:
			case 18:
			case 21:
			case 22:
			case 25:
			case 27:
			case 29:
			case 34:
			case 35:
			case 36:
			case 38:
			case 39:
			case DIDSET:
			case GET:
			case OVERRIDE:
			case SET:
			case WILLSET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043); identifier();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044); match(11);
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
		enterRule(_localctx, 162, RULE_local_parameter_name);
		try {
			setState(1049);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 6:
			case 7:
			case 8:
			case 14:
			case 18:
			case 21:
			case 22:
			case 25:
			case 27:
			case 29:
			case 34:
			case 35:
			case 36:
			case 38:
			case 39:
			case DIDSET:
			case GET:
			case OVERRIDE:
			case SET:
			case WILLSET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047); identifier();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048); match(11);
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
		enterRule(_localctx, 164, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051); match(EQUALS);
			setState(1052); expression();
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
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
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
		enterRule(_localctx, 166, RULE_enum_declaration);
		int _la;
		try {
			setState(1068);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				_la = _input.LA(1);
				if (_la==13) {
					{
					setState(1054); attributes();
					}
				}

				setState(1058);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (41 - 41)) | (1L << (PUBLIC - 41)) | (1L << (PRIVATE - 41)))) != 0)) {
					{
					setState(1057); access_level_modifier();
					}
				}

				setState(1060); union_style_enum();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				_la = _input.LA(1);
				if (_la==13) {
					{
					setState(1061); attributes();
					}
				}

				setState(1065);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (41 - 41)) | (1L << (PUBLIC - 41)) | (1L << (PRIVATE - 41)))) != 0)) {
					{
					setState(1064); access_level_modifier();
					}
				}

				setState(1067); raw_value_style_enum();
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
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
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
		enterRule(_localctx, 168, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070); match(ENUM);
			setState(1071); enum_name();
			setState(1073);
			_la = _input.LA(1);
			if (_la==LTHAN) {
				{
				setState(1072); generic_parameter_clause();
				}
			}

			setState(1076);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1075); type_inheritance_clause();
				}
			}

			setState(1078); match(LBRACE);
			setState(1080);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 41) | (1L << CASE) | (1L << CLASS) | (1L << ENUM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (IMPORT - 65)) | (1L << (LET - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTOCOL - 65)) | (1L << (QMARK - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0)) {
				{
				setState(1079); union_style_enum_members();
				}
			}

			setState(1082); match(RBRACE);
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
		enterRule(_localctx, 170, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084); union_style_enum_member();
			setState(1086);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 41) | (1L << CASE) | (1L << CLASS) | (1L << ENUM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (IMPORT - 65)) | (1L << (LET - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTOCOL - 65)) | (1L << (QMARK - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0)) {
				{
				setState(1085); union_style_enum_members();
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
		enterRule(_localctx, 172, RULE_union_style_enum_member);
		try {
			setState(1090);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089); union_style_enum_case_clause();
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
		enterRule(_localctx, 174, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1092); attributes();
				}
			}

			setState(1095); match(CASE);
			setState(1096); union_style_enum_case_list();
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
		public Union_style_enum_caseContext union_style_enum_case(int i) {
			return getRuleContext(Union_style_enum_caseContext.class,i);
		}
		public List<Union_style_enum_caseContext> union_style_enum_case() {
			return getRuleContexts(Union_style_enum_caseContext.class);
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
		enterRule(_localctx, 176, RULE_union_style_enum_case_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098); union_style_enum_case();
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1099); match(COMMA);
				setState(1100); union_style_enum_case();
				}
				}
				setState(1105);
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
		enterRule(_localctx, 178, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106); enum_case_name();
			setState(1108);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1107); tuple_type();
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
		enterRule(_localctx, 180, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110); identifier();
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
		enterRule(_localctx, 182, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112); identifier();
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
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
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
		enterRule(_localctx, 184, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114); match(ENUM);
			setState(1115); enum_name();
			setState(1117);
			_la = _input.LA(1);
			if (_la==LTHAN) {
				{
				setState(1116); generic_parameter_clause();
				}
			}

			setState(1119); type_inheritance_clause();
			setState(1120); match(LBRACE);
			setState(1121); raw_value_style_enum_members();
			setState(1122); match(RBRACE);
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
		public List<Raw_value_style_enum_memberContext> raw_value_style_enum_member() {
			return getRuleContexts(Raw_value_style_enum_memberContext.class);
		}
		public Raw_value_style_enum_memberContext raw_value_style_enum_member(int i) {
			return getRuleContext(Raw_value_style_enum_memberContext.class,i);
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
		enterRule(_localctx, 186, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1124); raw_value_style_enum_member();
				}
				}
				setState(1127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 41) | (1L << CASE) | (1L << CLASS) | (1L << ENUM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (IMPORT - 65)) | (1L << (LET - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTOCOL - 65)) | (1L << (QMARK - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0) );
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
		enterRule(_localctx, 188, RULE_raw_value_style_enum_member);
		try {
			setState(1131);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130); raw_value_style_enum_case_clause();
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
		enterRule(_localctx, 190, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1133); attributes();
				}
			}

			setState(1136); match(CASE);
			setState(1137); raw_value_style_enum_case_list();
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
		public List<Raw_value_style_enum_caseContext> raw_value_style_enum_case() {
			return getRuleContexts(Raw_value_style_enum_caseContext.class);
		}
		public Raw_value_style_enum_caseContext raw_value_style_enum_case(int i) {
			return getRuleContext(Raw_value_style_enum_caseContext.class,i);
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
		enterRule(_localctx, 192, RULE_raw_value_style_enum_case_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139); raw_value_style_enum_case();
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1140); match(COMMA);
				setState(1141); raw_value_style_enum_case();
				}
				}
				setState(1146);
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
		enterRule(_localctx, 194, RULE_raw_value_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); enum_case_name();
			setState(1149);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(1148); raw_value_assignment();
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
		enterRule(_localctx, 196, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151); match(EQUALS);
			setState(1152); literal();
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
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
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
		enterRule(_localctx, 198, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1154); attributes();
				}
			}

			setState(1158);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (41 - 41)) | (1L << (PUBLIC - 41)) | (1L << (PRIVATE - 41)))) != 0)) {
				{
				setState(1157); access_level_modifier();
				}
			}

			setState(1160); match(STRUCT);
			setState(1161); struct_name();
			setState(1163);
			_la = _input.LA(1);
			if (_la==LTHAN) {
				{
				setState(1162); generic_parameter_clause();
				}
			}

			setState(1166);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1165); type_inheritance_clause();
				}
			}

			setState(1168); struct_body();
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
		enterRule(_localctx, 200, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170); identifier();
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
		enterRule(_localctx, 202, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172); match(LBRACE);
			setState(1174);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 41) | (1L << CLASS) | (1L << ENUM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (IMPORT - 65)) | (1L << (LET - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTOCOL - 65)) | (1L << (QMARK - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0)) {
				{
				setState(1173); declarations();
				}
			}

			setState(1176); match(RBRACE);
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
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
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
		enterRule(_localctx, 204, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1178); attributes();
				}
			}

			setState(1182);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (41 - 41)) | (1L << (PUBLIC - 41)) | (1L << (PRIVATE - 41)))) != 0)) {
				{
				setState(1181); access_level_modifier();
				}
			}

			setState(1184); match(CLASS);
			setState(1185); class_name();
			setState(1187);
			_la = _input.LA(1);
			if (_la==LTHAN) {
				{
				setState(1186); generic_parameter_clause();
				}
			}

			setState(1190);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1189); type_inheritance_clause();
				}
			}

			setState(1192); class_body();
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
		enterRule(_localctx, 206, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); identifier();
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
		enterRule(_localctx, 208, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196); match(LBRACE);
			setState(1198);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 41) | (1L << CLASS) | (1L << ENUM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (IMPORT - 65)) | (1L << (LET - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTOCOL - 65)) | (1L << (QMARK - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0)) {
				{
				setState(1197); declarations();
				}
			}

			setState(1200); match(RBRACE);
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
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
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
		enterRule(_localctx, 210, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1202); attributes();
				}
			}

			setState(1206);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (41 - 41)) | (1L << (PUBLIC - 41)) | (1L << (PRIVATE - 41)))) != 0)) {
				{
				setState(1205); access_level_modifier();
				}
			}

			setState(1208); match(PROTOCOL);
			setState(1209); protocol_name();
			setState(1211);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1210); type_inheritance_clause();
				}
			}

			setState(1213); protocol_body();
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
		enterRule(_localctx, 212, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215); identifier();
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
		enterRule(_localctx, 214, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217); match(LBRACE);
			setState(1219);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 41) | (1L << CLASS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (QMARK - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0)) {
				{
				setState(1218); protocol_member_declarations();
				}
			}

			setState(1221); match(RBRACE);
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
		enterRule(_localctx, 216, RULE_protocol_member_declaration);
		try {
			setState(1228);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1223); protocol_property_declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224); protocol_method_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225); protocol_initializer_declaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1226); protocol_subscript_declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1227); protocol_associated_type_declaration();
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
		enterRule(_localctx, 218, RULE_protocol_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230); protocol_member_declaration();
			setState(1232);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 41) | (1L << CLASS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (QMARK - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0)) {
				{
				setState(1231); protocol_member_declarations();
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
		enterRule(_localctx, 220, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234); variable_declaration_head();
			setState(1235); variable_name();
			setState(1236); type_annotation();
			setState(1237); getter_setter_keyword_block();
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
		enterRule(_localctx, 222, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239); function_head();
			setState(1240); function_name();
			setState(1242);
			_la = _input.LA(1);
			if (_la==LTHAN) {
				{
				setState(1241); generic_parameter_clause();
				}
			}

			setState(1244); function_signature();
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
		enterRule(_localctx, 224, RULE_protocol_initializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246); initializer_head();
			setState(1248);
			_la = _input.LA(1);
			if (_la==LTHAN) {
				{
				setState(1247); generic_parameter_clause();
				}
			}

			setState(1250); parameter_clause();
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
		enterRule(_localctx, 226, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252); subscript_head();
			setState(1253); subscript_result();
			setState(1254); getter_setter_keyword_block();
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
		enterRule(_localctx, 228, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256); typealias_head();
			setState(1258);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1257); type_inheritance_clause();
				}
			}

			setState(1261);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(1260); typealias_assignment();
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
		enterRule(_localctx, 230, RULE_initializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263); initializer_head();
			setState(1265);
			_la = _input.LA(1);
			if (_la==LTHAN) {
				{
				setState(1264); generic_parameter_clause();
				}
			}

			setState(1267); parameter_clause();
			setState(1268); initializer_body();
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
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
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
		enterRule(_localctx, 232, RULE_initializer_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1270); attributes();
				}
			}

			setState(1274);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 15) | (1L << 19) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 36) | (1L << 41) | (1L << CLASS))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (OVERRIDE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (QMARK - 89)))) != 0)) {
				{
				setState(1273); declaration_modifiers();
				}
			}

			setState(1276); match(22);
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
		enterRule(_localctx, 234, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278); code_block();
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
		enterRule(_localctx, 236, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1280); attributes();
				}
			}

			setState(1283); match(24);
			setState(1284); code_block();
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
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
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
		enterRule(_localctx, 238, RULE_extension_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (41 - 41)) | (1L << (PUBLIC - 41)) | (1L << (PRIVATE - 41)))) != 0)) {
				{
				setState(1286); access_level_modifier();
				}
			}

			setState(1289); match(37);
			setState(1290); type_identifier();
			setState(1292);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1291); type_inheritance_clause();
				}
			}

			setState(1294); extension_body();
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
		enterRule(_localctx, 240, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296); match(LBRACE);
			setState(1298);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 13) | (1L << 15) | (1L << 19) | (1L << 22) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 33) | (1L << 34) | (1L << 36) | (1L << 37) | (1L << 41) | (1L << CLASS) | (1L << ENUM))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (FUNC - 65)) | (1L << (IMPORT - 65)) | (1L << (LET - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PUBLIC - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTOCOL - 65)) | (1L << (QMARK - 65)) | (1L << (STRUCT - 65)) | (1L << (TYPEALIAS - 65)) | (1L << (VAR - 65)))) != 0)) {
				{
				setState(1297); declarations();
				}
			}

			setState(1300); match(RBRACE);
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
		enterRule(_localctx, 242, RULE_subscript_declaration);
		try {
			setState(1314);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302); subscript_head();
				setState(1303); subscript_result();
				setState(1304); code_block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306); subscript_head();
				setState(1307); subscript_result();
				setState(1308); getter_setter_block();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1310); subscript_head();
				setState(1311); subscript_result();
				setState(1312); getter_setter_keyword_block();
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
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
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
		enterRule(_localctx, 244, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1316); attributes();
				}
			}

			setState(1320);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 15) | (1L << 19) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 36) | (1L << 41) | (1L << CLASS))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (OVERRIDE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (QMARK - 89)))) != 0)) {
				{
				setState(1319); declaration_modifiers();
				}
			}

			setState(1322); match(33);
			setState(1323); parameter_clause();
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
		enterRule(_localctx, 246, RULE_subscript_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325); match(ARROW);
			setState(1327);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1326); attributes();
				}
			}

			setState(1329); type(0);
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
		enterRule(_localctx, 248, RULE_operator_declaration);
		try {
			setState(1334);
			switch (_input.LA(1)) {
			case 36:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331); prefix_operator_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(1332); postfix_operator_declaration();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 3);
				{
				setState(1333); infix_operator_declaration();
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

	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
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
		enterRule(_localctx, 250, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336); match(36);
			setState(1337); match(35);
			setState(1338); operator();
			setState(1339); match(LBRACE);
			setState(1340); match(RBRACE);
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
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
		enterRule(_localctx, 252, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342); match(6);
			setState(1343); match(35);
			setState(1344); operator();
			setState(1345); match(LBRACE);
			setState(1346); match(RBRACE);
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		enterRule(_localctx, 254, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348); match(27);
			setState(1349); match(35);
			setState(1350); operator();
			setState(1351); match(LBRACE);
			setState(1353);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1352); infix_operator_attributes();
				}
				break;
			}
			setState(1355); match(RBRACE);
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
		enterRule(_localctx, 256, RULE_infix_operator_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			_la = _input.LA(1);
			if (_la==21) {
				{
				setState(1357); precedence_clause();
				}
			}

			setState(1361);
			_la = _input.LA(1);
			if (_la==14) {
				{
				setState(1360); associativity_clause();
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
		enterRule(_localctx, 258, RULE_precedence_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363); match(21);
			setState(1364); precedence_level();
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
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
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
		enterRule(_localctx, 260, RULE_precedence_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366); match(Decimal_literal);
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
		enterRule(_localctx, 262, RULE_associativity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368); match(14);
			setState(1369); associativity();
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
		enterRule(_localctx, 264, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 18) | (1L << 38))) != 0)) ) {
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

	public static class Declaration_modifierContext extends ParserRuleContext {
		public Access_level_modifierContext access_level_modifier() {
			return getRuleContext(Access_level_modifierContext.class,0);
		}
		public Declaration_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration_modifier(this);
		}
	}

	public final Declaration_modifierContext declaration_modifier() throws RecognitionException {
		Declaration_modifierContext _localctx = new Declaration_modifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_declaration_modifier);
		try {
			setState(1399);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373); match(CLASS);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374); match(12);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1375); match(19);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1376); match(26);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1377); match(27);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1378); match(15);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1379); match(29);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1380); match(2);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1381); match(QMARK);
				setState(1382); match(30);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1383); match(OVERRIDE);
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1384); match(6);
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1385); match(36);
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1386); match(32);
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1387); match(31);
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1388); match(34);
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1389); match(34);
				setState(1390); match(LPAREN);
				setState(1391); match(17);
				setState(1392); match(RPAREN);
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1393); match(34);
				setState(1394); match(LPAREN);
				setState(1395); match(20);
				setState(1396); match(RPAREN);
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1397); match(25);
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1398); access_level_modifier();
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

	public static class Declaration_modifiersContext extends ParserRuleContext {
		public Declaration_modifierContext declaration_modifier() {
			return getRuleContext(Declaration_modifierContext.class,0);
		}
		public Declaration_modifiersContext declaration_modifiers() {
			return getRuleContext(Declaration_modifiersContext.class,0);
		}
		public Declaration_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration_modifiers(this);
		}
	}

	public final Declaration_modifiersContext declaration_modifiers() throws RecognitionException {
		Declaration_modifiersContext _localctx = new Declaration_modifiersContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_declaration_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401); declaration_modifier();
			setState(1403);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 12) | (1L << 15) | (1L << 19) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 34) | (1L << 36) | (1L << 41) | (1L << CLASS))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (OVERRIDE - 89)) | (1L << (PUBLIC - 89)) | (1L << (PRIVATE - 89)) | (1L << (QMARK - 89)))) != 0)) {
				{
				setState(1402); declaration_modifiers();
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

	public static class Access_level_modifierContext extends ParserRuleContext {
		public Access_level_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAccess_level_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAccess_level_modifier(this);
		}
	}

	public final Access_level_modifierContext access_level_modifier() throws RecognitionException {
		Access_level_modifierContext _localctx = new Access_level_modifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_access_level_modifier);
		try {
			setState(1420);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1405); match(41);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1406); match(41);
				setState(1407); match(LPAREN);
				setState(1408); match(SET);
				setState(1409); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1410); match(PRIVATE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1411); match(PRIVATE);
				setState(1412); match(LPAREN);
				setState(1413); match(SET);
				setState(1414); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1415); match(PUBLIC);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1416); match(PUBLIC);
				setState(1417); match(LPAREN);
				setState(1418); match(SET);
				setState(1419); match(RPAREN);
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

	public static class Access_level_modifiersContext extends ParserRuleContext {
		public List<Access_level_modifierContext> access_level_modifier() {
			return getRuleContexts(Access_level_modifierContext.class);
		}
		public Access_level_modifierContext access_level_modifier(int i) {
			return getRuleContext(Access_level_modifierContext.class,i);
		}
		public Access_level_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_level_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAccess_level_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAccess_level_modifiers(this);
		}
	}

	public final Access_level_modifiersContext access_level_modifiers() throws RecognitionException {
		Access_level_modifiersContext _localctx = new Access_level_modifiersContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_access_level_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1422); access_level_modifier();
				}
				}
				setState(1425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (41 - 41)) | (1L << (PUBLIC - 41)) | (1L << (PRIVATE - 41)))) != 0) );
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
		int _startState = 274;
		enterRecursionRule(_localctx, RULE_pattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1428); wildcard_pattern();
				setState(1430);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1429); type_annotation();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(1432); identifier_pattern();
				setState(1434);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1433); type_annotation();
					}
					break;
				}
				}
				break;

			case 3:
				{
				setState(1436); value_binding_pattern();
				}
				break;

			case 4:
				{
				setState(1437); tuple_pattern();
				setState(1439);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1438); type_annotation();
					}
					break;
				}
				}
				break;

			case 5:
				{
				setState(1441); enum_case_pattern();
				}
				break;

			case 6:
				{
				setState(1442); match(IS);
				setState(1443); type(0);
				}
				break;

			case 7:
				{
				setState(1444); expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1447);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(1448); match(AS);
					setState(1449); type(0);
					}
					} 
				}
				setState(1454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
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
		enterRule(_localctx, 276, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455); match(11);
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
		enterRule(_localctx, 278, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457); identifier();
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
		enterRule(_localctx, 280, RULE_value_binding_pattern);
		try {
			setState(1463);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459); match(VAR);
				setState(1460); pattern(0);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461); match(LET);
				setState(1462); pattern(0);
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
		enterRule(_localctx, 282, RULE_tuple_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465); match(LPAREN);
			setState(1467);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (IS - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LET - 66)) | (1L << (LPAREN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (VAR - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
				{
				setState(1466); tuple_pattern_element_list();
				}
			}

			setState(1469); match(RPAREN);
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
		public Tuple_pattern_elementContext tuple_pattern_element() {
			return getRuleContext(Tuple_pattern_elementContext.class,0);
		}
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
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
		enterRule(_localctx, 284, RULE_tuple_pattern_element_list);
		try {
			setState(1476);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471); tuple_pattern_element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472); tuple_pattern_element();
				setState(1473); match(COMMA);
				setState(1474); tuple_pattern_element_list();
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
		enterRule(_localctx, 286, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478); pattern(0);
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
		enterRule(_localctx, 288, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 14) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << DIDSET))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (OVERRIDE - 66)) | (1L << (SET - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1480); type_identifier();
				}
			}

			setState(1483); match(DOT);
			setState(1484); enum_case_name();
			setState(1486);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1485); tuple_pattern();
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
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 290, RULE_type_casting_pattern);
		try {
			setState(1494);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488); match(IS);
				setState(1489); type(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490); pattern(0);
				setState(1491); match(AS);
				setState(1492); type(0);
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
		enterRule(_localctx, 292, RULE_is_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496); match(IS);
			setState(1497); type(0);
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
		enterRule(_localctx, 294, RULE_as_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499); pattern(0);
			setState(1500); match(AS);
			setState(1501); type(0);
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
		enterRule(_localctx, 296, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503); expression();
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
		enterRule(_localctx, 298, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505); match(13);
			setState(1506); attribute_name();
			setState(1508);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1507); attribute_argument_clause();
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
		enterRule(_localctx, 300, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510); identifier();
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
		enterRule(_localctx, 302, RULE_attribute_argument_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512); match(LPAREN);
			setState(1514);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << Arithmetic_operator) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EQUALS) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (GTHAN - 66)) | (1L << (ISEQUAL - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (LTHAN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (NOTEQUAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Dot_operator_head - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
				{
				setState(1513); balanced_tokens();
				}
			}

			setState(1516); match(RPAREN);
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
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
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
		enterRule(_localctx, 304, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1518); attribute();
				}
				}
				setState(1521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==13 );
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
		public List<Balanced_tokenContext> balanced_token() {
			return getRuleContexts(Balanced_tokenContext.class);
		}
		public Balanced_tokenContext balanced_token(int i) {
			return getRuleContext(Balanced_tokenContext.class,i);
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
		enterRule(_localctx, 306, RULE_balanced_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1523); balanced_token();
				}
				}
				setState(1526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << Arithmetic_operator) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EQUALS) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (GTHAN - 66)) | (1L << (ISEQUAL - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (LTHAN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (NOTEQUAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Dot_operator_head - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0) );
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
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
		enterRule(_localctx, 308, RULE_balanced_token);
		int _la;
		try {
			setState(1548);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528); match(LPAREN);
				setState(1530);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << Arithmetic_operator) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EQUALS) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (GTHAN - 66)) | (1L << (ISEQUAL - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (LTHAN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (NOTEQUAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Dot_operator_head - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
					{
					setState(1529); balanced_tokens();
					}
				}

				setState(1532); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1533); match(LBRACKET);
				setState(1535);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << Arithmetic_operator) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EQUALS) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (GTHAN - 66)) | (1L << (ISEQUAL - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (LTHAN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (NOTEQUAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Dot_operator_head - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
					{
					setState(1534); balanced_tokens();
					}
				}

				setState(1537); match(RBRACKET);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1538); match(LBRACE);
				setState(1540);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << Arithmetic_operator) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EQUALS) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (GTHAN - 66)) | (1L << (ISEQUAL - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (LTHAN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (NOTEQUAL - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Dot_operator_head - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
					{
					setState(1539); balanced_tokens();
					}
				}

				setState(1542); match(RBRACE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1543); identifier();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1544); expression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1545); context_sensitive_keyword();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1546); literal();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1547); operator();
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

	public static class Context_sensitive_keywordContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SwiftParser.SET, 0); }
		public TerminalNode GET() { return getToken(SwiftParser.GET, 0); }
		public TerminalNode WILLSET() { return getToken(SwiftParser.WILLSET, 0); }
		public TerminalNode DIDSET() { return getToken(SwiftParser.DIDSET, 0); }
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
		enterRule(_localctx, 310, RULE_context_sensitive_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 14) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << DIDSET))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (OVERRIDE - 66)) | (1L << (SET - 66)) | (1L << (WILLSET - 66)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Binary_expressionsContext binary_expressions() {
			return getRuleContext(Binary_expressionsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552); prefix_expression();
			setState(1554);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1553); binary_expressions();
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
		enterRule(_localctx, 314, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556); expression();
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1557); match(COMMA);
				setState(1558); expression();
				}
				}
				setState(1563);
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

	public static class Prefix_expressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Prefix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefix_expression(this);
		}
	}

	public final Prefix_expressionContext prefix_expression() throws RecognitionException {
		Prefix_expressionContext _localctx = new Prefix_expressionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_prefix_expression);
		try {
			setState(1569);
			switch (_input.LA(1)) {
			case TILDE:
			case EXCLAMATION:
			case MINUSMINUS:
			case PLUSPLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564); prefix_operator();
				setState(1565); prefix_expression();
				}
				break;
			case 1:
			case 2:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 14:
			case 16:
			case 18:
			case 21:
			case 22:
			case 25:
			case 27:
			case 29:
			case 34:
			case 35:
			case 36:
			case 38:
			case 39:
			case DIDSET:
			case DOT:
			case GET:
			case LBRACE:
			case LBRACKET:
			case LPAREN:
			case OVERRIDE:
			case SELF:
			case SET:
			case SUPER:
			case WILLSET:
			case Identifier:
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
			case Floating_point_literal:
			case String_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567); postfix_expression(0);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(1568); in_out_expression();
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
		enterRule(_localctx, 318, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571); match(AND);
			setState(1572); identifier();
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

	public static class Binary_expressionContext extends ParserRuleContext {
		public Prefix_expressionContext prefix_expression() {
			return getRuleContext(Prefix_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Binary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinary_expression(this);
		}
	}

	public final Binary_expressionContext binary_expression() throws RecognitionException {
		Binary_expressionContext _localctx = new Binary_expressionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_binary_expression);
		try {
			setState(1584);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574); binary_operator();
				setState(1575); prefix_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577); assignment_operator();
				setState(1578); prefix_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1580); conditional_operator();
				setState(1581); prefix_expression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1583); type_casting_operator();
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

	public static class Binary_expressionsContext extends ParserRuleContext {
		public Binary_expressionContext binary_expression(int i) {
			return getRuleContext(Binary_expressionContext.class,i);
		}
		public List<Binary_expressionContext> binary_expression() {
			return getRuleContexts(Binary_expressionContext.class);
		}
		public Binary_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinary_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinary_expressions(this);
		}
	}

	public final Binary_expressionsContext binary_expressions() throws RecognitionException {
		Binary_expressionsContext _localctx = new Binary_expressionsContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_binary_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1587); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1586); binary_expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1589); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 324, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591); match(EQUALS);
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
		enterRule(_localctx, 326, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593); match(QMARK);
			setState(1594); expression();
			setState(1595); match(COLON);
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
		enterRule(_localctx, 328, RULE_type_casting_operator);
		try {
			setState(1604);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597); match(IS);
				setState(1598); type(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1599); match(AS);
				setState(1600); type(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1601); match(AS);
				setState(1602); match(QMARK);
				setState(1603); type(0);
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
		enterRule(_localctx, 330, RULE_primary_expression);
		try {
			setState(1617);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 6:
			case 7:
			case 8:
			case 14:
			case 18:
			case 21:
			case 22:
			case 25:
			case 27:
			case 29:
			case 34:
			case 35:
			case 36:
			case 38:
			case 39:
			case DIDSET:
			case GET:
			case OVERRIDE:
			case SET:
			case WILLSET:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606); identifier();
				setState(1608);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1607); generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 5:
			case 9:
			case 10:
			case 16:
			case LBRACKET:
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
			case Floating_point_literal:
			case String_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610); literal_expression();
				}
				break;
			case SELF:
				enterOuterAlt(_localctx, 3);
				{
				setState(1611); self_expression();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1612); superclass_expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1613); closure_expression();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1614); parenthesized_expression();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1615); implicit_member_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 8);
				{
				setState(1616); wildcard_expression();
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
		enterRule(_localctx, 332, RULE_literal_expression);
		try {
			setState(1626);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620); array_literal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1621); dictionary_literal();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1622); match(16);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1623); match(5);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1624); match(9);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1625); match(10);
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
		enterRule(_localctx, 334, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628); match(LBRACKET);
			setState(1630);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
				{
				setState(1629); array_literal_items();
				}
			}

			setState(1632); match(RBRACKET);
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
		enterRule(_localctx, 336, RULE_array_literal_items);
		int _la;
		try {
			setState(1646);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634); array_literal_item();
				setState(1636);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1635); match(COMMA);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1638); array_literal_item();
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1639); match(COMMA);
					setState(1640); array_literal_item();
					}
					}
					setState(1645);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 338, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648); expression();
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
		enterRule(_localctx, 340, RULE_dictionary_literal);
		try {
			setState(1657);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1650); match(LBRACKET);
				setState(1651); dictionary_literal_items();
				setState(1652); match(RBRACKET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1654); match(LBRACKET);
				setState(1655); match(COLON);
				setState(1656); match(RBRACKET);
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
		enterRule(_localctx, 342, RULE_dictionary_literal_items);
		int _la;
		try {
			setState(1671);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1659); dictionary_literal_item();
				setState(1661);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1660); match(COMMA);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663); dictionary_literal_item();
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1664); match(COMMA);
					setState(1665); dictionary_literal_item();
					}
					}
					setState(1670);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 344, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673); expression();
			setState(1674); match(COLON);
			setState(1675); expression();
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
		enterRule(_localctx, 346, RULE_self_expression);
		try {
			setState(1689);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677); match(SELF);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678); match(SELF);
				setState(1679); match(DOT);
				setState(1680); identifier();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1681); match(SELF);
				setState(1682); match(LBRACKET);
				setState(1683); expression();
				setState(1684); match(RBRACKET);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1686); match(SELF);
				setState(1687); match(DOT);
				setState(1688); match(22);
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
		enterRule(_localctx, 348, RULE_superclass_expression);
		try {
			setState(1695);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1691); superclass_method_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1692); superclass_subscript_expression();
				setState(1693); superclass_initializer_expression();
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
		enterRule(_localctx, 350, RULE_superclass_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697); match(SUPER);
			setState(1698); match(DOT);
			setState(1699); identifier();
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
		enterRule(_localctx, 352, RULE_superclass_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701); match(SUPER);
			setState(1702); match(LBRACKET);
			setState(1703); expression();
			setState(1704); match(RBRACKET);
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
		enterRule(_localctx, 354, RULE_superclass_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706); match(SUPER);
			setState(1707); match(DOT);
			setState(1708); match(22);
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
		enterRule(_localctx, 356, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710); match(LBRACE);
			setState(1712);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1711); closure_signature();
				}
				break;
			}
			setState(1714); statements();
			setState(1715); match(RBRACE);
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
		enterRule(_localctx, 358, RULE_closure_signature);
		int _la;
		try {
			setState(1746);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1717); parameter_clause();
				setState(1719);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(1718); function_result();
					}
				}

				setState(1721); match(IN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723); identifier_list();
				setState(1725);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(1724); function_result();
					}
				}

				setState(1727); match(IN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1729); capture_list();
				setState(1730); parameter_clause();
				setState(1732);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(1731); function_result();
					}
				}

				setState(1734); match(IN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1736); capture_list();
				setState(1737); identifier_list();
				setState(1739);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(1738); function_result();
					}
				}

				setState(1741); match(IN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1743); capture_list();
				setState(1744); match(IN);
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
		enterRule(_localctx, 360, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748); match(LBRACKET);
			setState(1749); capture_specifier();
			setState(1750); expression();
			setState(1751); match(RBRACKET);
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
		enterRule(_localctx, 362, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 25) | (1L << 34) | (1L << 39))) != 0)) ) {
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
		enterRule(_localctx, 364, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755); match(DOT);
			setState(1756); identifier();
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
		enterRule(_localctx, 366, RULE_parenthesized_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758); match(LPAREN);
			setState(1760);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 16) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << TILDE) | (1L << AND) | (1L << DIDSET) | (1L << DOT) | (1L << EXCLAMATION))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (LBRACE - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (MINUSMINUS - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PLUSPLUS - 66)) | (1L << (SELF - 66)) | (1L << (SET - 66)) | (1L << (SUPER - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)) | (1L << (Binary_literal - 66)) | (1L << (Octal_literal - 66)) | (1L << (Decimal_literal - 66)) | (1L << (Hexadecimal_literal - 66)) | (1L << (Floating_point_literal - 66)) | (1L << (String_literal - 66)))) != 0)) {
				{
				setState(1759); expression_element_list();
				}
			}

			setState(1762); match(RPAREN);
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
		public List<Expression_elementContext> expression_element() {
			return getRuleContexts(Expression_elementContext.class);
		}
		public Expression_elementContext expression_element(int i) {
			return getRuleContext(Expression_elementContext.class,i);
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
		enterRule(_localctx, 368, RULE_expression_element_list);
		int _la;
		try {
			setState(1773);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1764); expression_element();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1765); expression_element();
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1766); match(COMMA);
					setState(1767); expression_element();
					}
					}
					setState(1772);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 370, RULE_expression_element);
		try {
			setState(1780);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1775); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1776); identifier();
				setState(1777); match(COLON);
				setState(1778); expression();
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
		enterRule(_localctx, 372, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782); match(11);
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public int _p;
		public Forced_value_expressionContext forced_value_expression() {
			return getRuleContext(Forced_value_expressionContext.class,0);
		}
		public Explicit_member_expressionContext explicit_member_expression() {
			return getRuleContext(Explicit_member_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Initializer_expressionContext initializer_expression() {
			return getRuleContext(Initializer_expressionContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public Optional_chaining_expressionContext optional_chaining_expression() {
			return getRuleContext(Optional_chaining_expressionContext.class,0);
		}
		public Dynamic_type_expressionContext dynamic_type_expression() {
			return getRuleContext(Dynamic_type_expressionContext.class,0);
		}
		public Subscript_expressionContext subscript_expression() {
			return getRuleContext(Subscript_expressionContext.class,0);
		}
		public Function_call_expressionContext function_call_expression() {
			return getRuleContext(Function_call_expressionContext.class,0);
		}
		public Postfix_self_expressionContext postfix_self_expression() {
			return getRuleContext(Postfix_self_expressionContext.class,0);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState, _p);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 374;
		enterRecursionRule(_localctx, RULE_postfix_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1785); primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1800);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1787);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1788); postfix_operator();
						}
						break;

					case 2:
						{
						_localctx = new Postfix_expressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1789);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1798);
						switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
						case 1:
							{
							setState(1790); function_call_expression();
							}
							break;

						case 2:
							{
							setState(1791); initializer_expression();
							}
							break;

						case 3:
							{
							setState(1792); explicit_member_expression();
							}
							break;

						case 4:
							{
							setState(1793); postfix_self_expression();
							}
							break;

						case 5:
							{
							setState(1794); dynamic_type_expression();
							}
							break;

						case 6:
							{
							setState(1795); subscript_expression();
							}
							break;

						case 7:
							{
							setState(1796); forced_value_expression();
							}
							break;

						case 8:
							{
							setState(1797); optional_chaining_expression();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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

	public static class Function_call_expressionContext extends ParserRuleContext {
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public Function_call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_call_expression(this);
		}
	}

	public final Function_call_expressionContext function_call_expression() throws RecognitionException {
		Function_call_expressionContext _localctx = new Function_call_expressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_function_call_expression);
		int _la;
		try {
			setState(1810);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805); parenthesized_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1807);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1806); parenthesized_expression();
					}
				}

				setState(1809); trailing_closure();
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
		enterRule(_localctx, 378, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812); closure_expression();
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

	public static class Initializer_expressionContext extends ParserRuleContext {
		public Initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_expression(this);
		}
	}

	public final Initializer_expressionContext initializer_expression() throws RecognitionException {
		Initializer_expressionContext _localctx = new Initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814); match(DOT);
			setState(1815); match(22);
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

	public static class Explicit_member_expressionContext extends ParserRuleContext {
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Decimal_digitsContext decimal_digits() {
			return getRuleContext(Decimal_digitsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Explicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicit_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicit_member_expression(this);
		}
	}

	public final Explicit_member_expressionContext explicit_member_expression() throws RecognitionException {
		Explicit_member_expressionContext _localctx = new Explicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_explicit_member_expression);
		try {
			setState(1824);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1817); match(DOT);
				setState(1818); decimal_digits();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1819); match(DOT);
				setState(1820); identifier();
				setState(1822);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1821); generic_argument_clause();
					}
					break;
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

	public static class Postfix_self_expressionContext extends ParserRuleContext {
		public Postfix_self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_self_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_self_expression(this);
		}
	}

	public final Postfix_self_expressionContext postfix_self_expression() throws RecognitionException {
		Postfix_self_expressionContext _localctx = new Postfix_self_expressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_postfix_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826); match(DOT);
			setState(1827); match(SELF);
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

	public static class Dynamic_type_expressionContext extends ParserRuleContext {
		public Dynamic_type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_type_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDynamic_type_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDynamic_type_expression(this);
		}
	}

	public final Dynamic_type_expressionContext dynamic_type_expression() throws RecognitionException {
		Dynamic_type_expressionContext _localctx = new Dynamic_type_expressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_dynamic_type_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829); match(DOT);
			setState(1830); match(28);
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

	public static class Subscript_expressionContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Subscript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_expression(this);
		}
	}

	public final Subscript_expressionContext subscript_expression() throws RecognitionException {
		Subscript_expressionContext _localctx = new Subscript_expressionContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832); match(LBRACKET);
			setState(1833); expression_list();
			setState(1834); match(RBRACKET);
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

	public static class Forced_value_expressionContext extends ParserRuleContext {
		public Forced_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forced_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterForced_value_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitForced_value_expression(this);
		}
	}

	public final Forced_value_expressionContext forced_value_expression() throws RecognitionException {
		Forced_value_expressionContext _localctx = new Forced_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_forced_value_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836); match(EXCLAMATION);
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

	public static class Optional_chaining_expressionContext extends ParserRuleContext {
		public Optional_chaining_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_chaining_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptional_chaining_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptional_chaining_expression(this);
		}
	}

	public final Optional_chaining_expressionContext optional_chaining_expression() throws RecognitionException {
		Optional_chaining_expressionContext _localctx = new Optional_chaining_expressionContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_optional_chaining_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838); match(QMARK);
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
		public Dictionary_typeContext dictionary_type() {
			return getRuleContext(Dictionary_typeContext.class,0);
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
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
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
		int _startState = 394;
		enterRecursionRule(_localctx, RULE_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1841); array_type();
				}
				break;

			case 2:
				{
				setState(1842); dictionary_type();
				}
				break;

			case 3:
				{
				setState(1843); type_identifier();
				}
				break;

			case 4:
				{
				setState(1844); tuple_type();
				}
				break;

			case 5:
				{
				setState(1845); protocol_composition_type();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1861);
					switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1848);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(1849); match(ARROW);
						setState(1850); type(9);
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1851);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(1852); match(QMARK);
						}
						break;

					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1853);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(1854); match(EXCLAMATION);
						}
						break;

					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1855);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(1856); match(DOT);
						setState(1857); match(3);
						}
						break;

					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1858);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(1859); match(DOT);
						setState(1860); match(4);
						}
						break;
					}
					} 
				}
				setState(1865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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
		enterRule(_localctx, 396, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866); match(COLON);
			setState(1868);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(1867); attributes();
				}
			}

			setState(1870); type(0);
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
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
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
		enterRule(_localctx, 398, RULE_type_identifier);
		int _la;
		try {
			setState(1883);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1872); type_name();
				setState(1874);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1873); generic_argument_clause();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876); type_name();
				setState(1878);
				_la = _input.LA(1);
				if (_la==LTHAN) {
					{
					setState(1877); generic_argument_clause();
					}
				}

				setState(1880); match(DOT);
				setState(1881); type_identifier();
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
		enterRule(_localctx, 400, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885); identifier();
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
		enterRule(_localctx, 402, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887); match(LPAREN);
			setState(1889);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 13) | (1L << 14) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << DIDSET))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (LBRACKET - 66)) | (1L << (LPAREN - 66)) | (1L << (OVERRIDE - 66)) | (1L << (PROTOCOL - 66)) | (1L << (SET - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1888); tuple_type_body();
				}
			}

			setState(1891); match(RPAREN);
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
		enterRule(_localctx, 404, RULE_tuple_type_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893); tuple_type_element_list();
			setState(1895);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(1894); match(23);
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
		public Tuple_type_elementContext tuple_type_element(int i) {
			return getRuleContext(Tuple_type_elementContext.class,i);
		}
		public List<Tuple_type_elementContext> tuple_type_element() {
			return getRuleContexts(Tuple_type_elementContext.class);
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
		enterRule(_localctx, 406, RULE_tuple_type_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897); tuple_type_element();
			setState(1902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1898); match(COMMA);
				setState(1899); tuple_type_element();
				}
				}
				setState(1904);
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
		enterRule(_localctx, 408, RULE_tuple_type_element);
		int _la;
		try {
			setState(1918);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1906);
				_la = _input.LA(1);
				if (_la==13) {
					{
					setState(1905); attributes();
					}
				}

				setState(1909);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1908); match(7);
					}
					break;
				}
				setState(1911); type(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1913);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1912); match(7);
					}
					break;
				}
				setState(1915); element_name();
				setState(1916); type_annotation();
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
		enterRule(_localctx, 410, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920); identifier();
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
		enterRule(_localctx, 412, RULE_function_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922); type(0);
			setState(1923); match(ARROW);
			setState(1924); type(0);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926); match(LBRACKET);
			setState(1927); type(0);
			setState(1928); match(RBRACKET);
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

	public static class Dictionary_typeContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public Dictionary_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_type(this);
		}
	}

	public final Dictionary_typeContext dictionary_type() throws RecognitionException {
		Dictionary_typeContext _localctx = new Dictionary_typeContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_dictionary_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930); match(LBRACKET);
			setState(1931); type(0);
			setState(1932); match(COLON);
			setState(1933); type(0);
			setState(1934); match(RBRACKET);
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
		enterRule(_localctx, 418, RULE_optional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936); type(0);
			setState(1937); match(QMARK);
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
		enterRule(_localctx, 420, RULE_implicitly_unwrapped_optional_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939); type(0);
			setState(1940); match(EXCLAMATION);
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
		enterRule(_localctx, 422, RULE_protocol_composition_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942); match(PROTOCOL);
			setState(1943); match(LTHAN);
			setState(1945);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 14) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 25) | (1L << 27) | (1L << 29) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 38) | (1L << 39) | (1L << DIDSET))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GET - 66)) | (1L << (OVERRIDE - 66)) | (1L << (SET - 66)) | (1L << (WILLSET - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1944); protocol_identifier_list();
				}
			}

			setState(1947); match(GTHAN);
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
		public Protocol_identifierContext protocol_identifier(int i) {
			return getRuleContext(Protocol_identifierContext.class,i);
		}
		public List<Protocol_identifierContext> protocol_identifier() {
			return getRuleContexts(Protocol_identifierContext.class);
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
		enterRule(_localctx, 424, RULE_protocol_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949); protocol_identifier();
			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1950); match(COMMA);
				setState(1951); protocol_identifier();
				}
				}
				setState(1956);
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
		enterRule(_localctx, 426, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957); type_identifier();
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
		enterRule(_localctx, 428, RULE_metatype_type);
		try {
			setState(1967);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959); type(0);
				setState(1960); match(DOT);
				setState(1961); match(3);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1963); type(0);
				setState(1964); match(DOT);
				setState(1965); match(4);
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
		public Class_requirementContext class_requirement() {
			return getRuleContext(Class_requirementContext.class,0);
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
		enterRule(_localctx, 430, RULE_type_inheritance_clause);
		try {
			setState(1978);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1969); match(COLON);
				setState(1970); class_requirement();
				setState(1971); match(COMMA);
				setState(1972); type_inheritance_list();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974); match(COLON);
				setState(1975); class_requirement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1976); match(COLON);
				setState(1977); type_inheritance_list();
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

	public static class Type_inheritance_listContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
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
		enterRule(_localctx, 432, RULE_type_inheritance_list);
		int _la;
		try {
			setState(1989);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1980); type_identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1981); type_identifier();
				setState(1986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1982); match(COMMA);
					setState(1983); type_identifier();
					}
					}
					setState(1988);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Class_requirementContext extends ParserRuleContext {
		public Class_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_requirement(this);
		}
	}

	public final Class_requirementContext class_requirement() throws RecognitionException {
		Class_requirementContext _localctx = new Class_requirementContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_class_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991); match(CLASS);
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
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
		enterRule(_localctx, 436, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993); operator();
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
		public TerminalNode MINUSMINUS() { return getToken(SwiftParser.MINUSMINUS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SwiftParser.EXCLAMATION, 0); }
		public TerminalNode PLUSPLUS() { return getToken(SwiftParser.PLUSPLUS, 0); }
		public TerminalNode TILDE() { return getToken(SwiftParser.TILDE, 0); }
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
		enterRule(_localctx, 438, RULE_prefix_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			_la = _input.LA(1);
			if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (TILDE - 43)) | (1L << (EXCLAMATION - 43)) | (1L << (MINUSMINUS - 43)) | (1L << (PLUSPLUS - 43)))) != 0)) ) {
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

	public static class Postfix_operatorContext extends ParserRuleContext {
		public TerminalNode MINUSMINUS() { return getToken(SwiftParser.MINUSMINUS, 0); }
		public TerminalNode PLUSPLUS() { return getToken(SwiftParser.PLUSPLUS, 0); }
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
		enterRule(_localctx, 440, RULE_postfix_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			_la = _input.LA(1);
			if ( !(_la==MINUSMINUS || _la==PLUSPLUS) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode LTHAN() { return getToken(SwiftParser.LTHAN, 0); }
		public TerminalNode Dot_operator_characters() { return getToken(SwiftParser.Dot_operator_characters, 0); }
		public TerminalNode EQUALS() { return getToken(SwiftParser.EQUALS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(SwiftParser.EXCLAMATION, 0); }
		public TerminalNode DOT() { return getToken(SwiftParser.DOT, 0); }
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public TerminalNode Dot_operator_head() { return getToken(SwiftParser.Dot_operator_head, 0); }
		public TerminalNode GTHAN() { return getToken(SwiftParser.GTHAN, 0); }
		public TerminalNode ISEQUAL() { return getToken(SwiftParser.ISEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(SwiftParser.NOTEQUAL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_operator);
		int _la;
		try {
			setState(2012);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1999); match(EQUALS);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2000); match(EXCLAMATION);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2001); match(LTHAN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2002); match(GTHAN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2003); match(EXCLAMATION);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2004); match(DOT);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2005); match(ISEQUAL);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2006); match(NOTEQUAL);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2007); arithmetic_operator();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2008); match(Dot_operator_head);
				setState(2010);
				_la = _input.LA(1);
				if (_la==Dot_operator_characters) {
					{
					setState(2009); match(Dot_operator_characters);
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

	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public TerminalNode Arithmetic_operator() { return getToken(SwiftParser.Arithmetic_operator, 0); }
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArithmetic_operator(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_arithmetic_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014); match(Arithmetic_operator);
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

	public static class Decimal_digitsContext extends ParserRuleContext {
		public TerminalNode Decimal_digits() { return getToken(SwiftParser.Decimal_digits, 0); }
		public Decimal_digitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_digits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDecimal_digits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDecimal_digits(this);
		}
	}

	public final Decimal_digitsContext decimal_digits() throws RecognitionException {
		Decimal_digitsContext _localctx = new Decimal_digitsContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_decimal_digits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016); match(Decimal_digits);
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
		enterRule(_localctx, 448, RULE_identifier);
		try {
			setState(2020);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2018); match(Identifier);
				}
				break;
			case 1:
			case 2:
			case 6:
			case 7:
			case 8:
			case 14:
			case 18:
			case 21:
			case 22:
			case 25:
			case 27:
			case 29:
			case 34:
			case 35:
			case 36:
			case 38:
			case 39:
			case DIDSET:
			case GET:
			case OVERRIDE:
			case SET:
			case WILLSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(2019); context_sensitive_keyword();
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
		enterRule(_localctx, 450, RULE_identifier_list);
		try {
			setState(2027);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2022); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2023); identifier();
				setState(2024); match(COMMA);
				setState(2025); identifier_list();
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
		enterRule(_localctx, 452, RULE_literal);
		try {
			setState(2032);
			switch (_input.LA(1)) {
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(2029); integer_literal();
				}
				break;
			case Floating_point_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(2030); match(Floating_point_literal);
				}
				break;
			case String_literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(2031); match(String_literal);
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
		enterRule(_localctx, 454, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (Binary_literal - 117)) | (1L << (Octal_literal - 117)) | (1L << (Decimal_literal - 117)) | (1L << (Hexadecimal_literal - 117)))) != 0)) ) {
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
		case 137: return pattern_sempred((PatternContext)_localctx, predIndex);

		case 187: return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);

		case 197: return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 2 >= _localctx._p;

		case 2: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 8 >= _localctx._p;

		case 4: return 5 >= _localctx._p;

		case 5: return 4 >= _localctx._p;

		case 6: return 2 >= _localctx._p;

		case 7: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\u0081\u07f7\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t"+
		"\\\4]\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4"+
		"h\th\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\t"+
		"s\4t\tt\4u\tu\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4"+
		"\177\t\177\4\u0080\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083"+
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
		"\t\u00d0\4\u00d1\t\u00d1\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4"+
		"\4\u00d5\t\u00d5\4\u00d6\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9"+
		"\t\u00d9\4\u00da\t\u00da\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd"+
		"\4\u00de\t\u00de\4\u00df\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2"+
		"\t\u00e2\4\u00e3\t\u00e3\4\u00e4\t\u00e4\4\u00e5\t\u00e5\3\2\7\2\u01cc"+
		"\n\2\f\2\16\2\u01cf\13\2\3\2\3\2\3\3\3\3\5\3\u01d5\n\3\3\3\3\3\5\3\u01d9"+
		"\n\3\3\3\3\3\5\3\u01dd\n\3\3\3\3\3\5\3\u01e1\n\3\3\3\3\3\5\3\u01e5\n\3"+
		"\3\3\3\3\5\3\u01e9\n\3\3\3\3\3\5\3\u01ed\n\3\5\3\u01ef\n\3\3\4\6\4\u01f2"+
		"\n\4\r\4\16\4\u01f3\3\5\3\5\3\5\3\5\5\5\u01fa\n\5\3\6\3\6\5\6\u01fe\n"+
		"\6\3\6\3\6\5\6\u0202\n\6\3\6\3\6\5\6\u0206\n\6\3\6\3\6\3\6\5\6\u020b\n"+
		"\6\3\6\3\6\5\6\u020f\n\6\3\6\3\6\5\6\u0213\n\6\3\6\5\6\u0216\n\6\3\7\3"+
		"\7\5\7\u021a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0228"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0231\n\f\3\r\3\r\3\r\3\r\5"+
		"\r\u0237\n\r\3\16\3\16\5\16\u023b\n\16\3\17\3\17\3\17\3\17\5\17\u0241"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u0247\n\20\3\20\3\20\3\21\3\21\5\21\u024d"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u025b\n\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0263\n\24\3\24\3\24\3"+
		"\24\5\24\u0268\n\24\7\24\u026a\n\24\f\24\16\24\u026d\13\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u027d"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0288\n\33\3\34"+
		"\3\34\5\34\u028c\n\34\3\35\3\35\5\35\u0290\n\35\3\36\3\36\3\37\3\37\5"+
		"\37\u0296\n\37\3 \3 \3 \5 \u029b\n \3 \3 \3!\3!\3!\7!\u02a2\n!\f!\16!"+
		"\u02a5\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02b0\n\"\3#\3#\3#"+
		"\3$\3$\3$\7$\u02b8\n$\f$\16$\u02bb\13$\3%\3%\5%\u02bf\n%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\5&\u02c9\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\7)\u02d6\n"+
		")\f)\16)\u02d9\13)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+"+
		"\u02eb\n+\3,\6,\u02ee\n,\r,\16,\u02ef\3-\5-\u02f3\n-\3.\3.\5.\u02f7\n"+
		".\3.\3.\3/\5/\u02fc\n/\3/\3/\5/\u0300\n/\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u030b\n\61\3\62\3\62\5\62\u030f\n\62\3\63\5\63\u0312\n"+
		"\63\3\63\5\63\u0315\n\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u031d\n\64"+
		"\f\64\16\64\u0320\13\64\3\65\3\65\5\65\u0324\n\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u033f\n\67\3\67\3\67\5\67\u0343"+
		"\n\67\38\58\u0346\n8\38\58\u0349\n8\38\38\39\39\3:\3:\3:\5:\u0352\n:\3"+
		":\3:\3:\3:\3:\3:\3:\5:\u035b\n:\3;\5;\u035e\n;\3;\3;\3;\3<\5<\u0364\n"+
		"<\3<\3<\5<\u0368\n<\3<\3<\3=\3=\3=\3=\3>\3>\3>\5>\u0373\n>\3>\3>\3>\3"+
		">\3>\3>\3>\5>\u037c\n>\3?\5?\u037f\n?\3?\3?\3@\5@\u0384\n@\3@\3@\3A\3"+
		"A\3A\5A\u038b\nA\3A\3A\3A\3A\3A\3A\3A\5A\u0394\nA\3B\5B\u0397\nB\3B\3"+
		"B\5B\u039b\nB\3B\3B\3C\5C\u03a0\nC\3C\3C\5C\u03a4\nC\3C\3C\3D\3D\3D\3"+
		"E\5E\u03ac\nE\3E\5E\u03af\nE\3E\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\5H\u03bc"+
		"\nH\3H\3H\3H\3I\5I\u03c2\nI\3I\5I\u03c5\nI\3I\3I\3J\3J\5J\u03cb\nJ\3K"+
		"\3K\5K\u03cf\nK\3L\3L\5L\u03d3\nL\3L\3L\3M\3M\3N\3N\5N\u03db\nN\3O\3O"+
		"\3O\3O\3O\5O\u03e2\nO\3O\3O\5O\u03e6\nO\3P\3P\3P\7P\u03eb\nP\fP\16P\u03ee"+
		"\13P\3Q\5Q\u03f1\nQ\3Q\5Q\u03f4\nQ\3Q\5Q\u03f7\nQ\3Q\5Q\u03fa\nQ\3Q\3"+
		"Q\3Q\5Q\u03ff\nQ\3Q\5Q\u0402\nQ\3Q\3Q\5Q\u0406\nQ\3Q\5Q\u0409\nQ\3Q\3"+
		"Q\3Q\5Q\u040e\nQ\3Q\5Q\u0411\nQ\3Q\5Q\u0414\nQ\3R\3R\5R\u0418\nR\3S\3"+
		"S\5S\u041c\nS\3T\3T\3T\3U\5U\u0422\nU\3U\5U\u0425\nU\3U\3U\5U\u0429\n"+
		"U\3U\5U\u042c\nU\3U\5U\u042f\nU\3V\3V\3V\5V\u0434\nV\3V\5V\u0437\nV\3"+
		"V\3V\5V\u043b\nV\3V\3V\3W\3W\5W\u0441\nW\3X\3X\5X\u0445\nX\3Y\5Y\u0448"+
		"\nY\3Y\3Y\3Y\3Z\3Z\3Z\7Z\u0450\nZ\fZ\16Z\u0453\13Z\3[\3[\5[\u0457\n[\3"+
		"\\\3\\\3]\3]\3^\3^\3^\5^\u0460\n^\3^\3^\3^\3^\3^\3_\6_\u0468\n_\r_\16"+
		"_\u0469\3`\3`\5`\u046e\n`\3a\5a\u0471\na\3a\3a\3a\3b\3b\3b\7b\u0479\n"+
		"b\fb\16b\u047c\13b\3c\3c\5c\u0480\nc\3d\3d\3d\3e\5e\u0486\ne\3e\5e\u0489"+
		"\ne\3e\3e\3e\5e\u048e\ne\3e\5e\u0491\ne\3e\3e\3f\3f\3g\3g\5g\u0499\ng"+
		"\3g\3g\3h\5h\u049e\nh\3h\5h\u04a1\nh\3h\3h\3h\5h\u04a6\nh\3h\5h\u04a9"+
		"\nh\3h\3h\3i\3i\3j\3j\5j\u04b1\nj\3j\3j\3k\5k\u04b6\nk\3k\5k\u04b9\nk"+
		"\3k\3k\3k\5k\u04be\nk\3k\3k\3l\3l\3m\3m\5m\u04c6\nm\3m\3m\3n\3n\3n\3n"+
		"\3n\5n\u04cf\nn\3o\3o\5o\u04d3\no\3p\3p\3p\3p\3p\3q\3q\3q\5q\u04dd\nq"+
		"\3q\3q\3r\3r\5r\u04e3\nr\3r\3r\3s\3s\3s\3s\3t\3t\5t\u04ed\nt\3t\5t\u04f0"+
		"\nt\3u\3u\5u\u04f4\nu\3u\3u\3u\3v\5v\u04fa\nv\3v\5v\u04fd\nv\3v\3v\3w"+
		"\3w\3x\5x\u0504\nx\3x\3x\3x\3y\5y\u050a\ny\3y\3y\3y\5y\u050f\ny\3y\3y"+
		"\3z\3z\5z\u0515\nz\3z\3z\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u0525"+
		"\n{\3|\5|\u0528\n|\3|\5|\u052b\n|\3|\3|\3|\3}\3}\5}\u0532\n}\3}\3}\3~"+
		"\3~\3~\5~\u0539\n~\3\177\3\177\3\177\3\177\3\177\3\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u054c\n\u0081\3\u0081\3\u0081\3\u0082\5\u0082\u0551\n\u0082\3"+
		"\u0082\5\u0082\u0554\n\u0082\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3"+
		"\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u057a\n\u0087\3\u0088\3\u0088"+
		"\5\u0088\u057e\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u058f\n\u0089\3\u008a\6\u008a\u0592\n\u008a\r\u008a\16\u008a"+
		"\u0593\3\u008b\3\u008b\3\u008b\5\u008b\u0599\n\u008b\3\u008b\3\u008b\5"+
		"\u008b\u059d\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u05a2\n\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u05a8\n\u008b\3\u008b\3\u008b\3\u008b"+
		"\7\u008b\u05ad\n\u008b\f\u008b\16\u008b\u05b0\13\u008b\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u05ba\n\u008e"+
		"\3\u008f\3\u008f\5\u008f\u05be\n\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\5\u0090\u05c7\n\u0090\3\u0091\3\u0091\3\u0092"+
		"\5\u0092\u05cc\n\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u05d1\n\u0092\3"+
		"\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u05d9\n\u0093\3"+
		"\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\3\u0097\5\u0097\u05e7\n\u0097\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\5\u0099\u05ed\n\u0099\3\u0099\3\u0099\3\u009a\6\u009a\u05f2\n"+
		"\u009a\r\u009a\16\u009a\u05f3\3\u009b\6\u009b\u05f7\n\u009b\r\u009b\16"+
		"\u009b\u05f8\3\u009c\3\u009c\5\u009c\u05fd\n\u009c\3\u009c\3\u009c\3\u009c"+
		"\5\u009c\u0602\n\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u0607\n\u009c\3"+
		"\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\5\u009c\u060f\n\u009c\3"+
		"\u009d\3\u009d\3\u009e\3\u009e\5\u009e\u0615\n\u009e\3\u009f\3\u009f\3"+
		"\u009f\7\u009f\u061a\n\u009f\f\u009f\16\u009f\u061d\13\u009f\3\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0624\n\u00a0\3\u00a1\3\u00a1\3"+
		"\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u0633\n\u00a2\3\u00a3\6\u00a3\u0636\n\u00a3\r"+
		"\u00a3\16\u00a3\u0637\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0647"+
		"\n\u00a6\3\u00a7\3\u00a7\5\u00a7\u064b\n\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0654\n\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u065d\n\u00a8\3\u00a9"+
		"\3\u00a9\5\u00a9\u0661\n\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\5\u00aa"+
		"\u0667\n\u00aa\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u066c\n\u00aa\f\u00aa\16"+
		"\u00aa\u066f\13\u00aa\5\u00aa\u0671\n\u00aa\3\u00ab\3\u00ab\3\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u067c\n\u00ac\3"+
		"\u00ad\3\u00ad\5\u00ad\u0680\n\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u0685"+
		"\n\u00ad\f\u00ad\16\u00ad\u0688\13\u00ad\5\u00ad\u068a\n\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u069c\n\u00af"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u06a2\n\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\5\u00b4\u06b3\n\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b5\3\u00b5\5\u00b5\u06ba\n\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\5\u00b5\u06c0\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\5\u00b5\u06c7\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5"+
		"\u06ce\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u06d5\n"+
		"\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b9\3\u00b9\5\u00b9\u06e3\n\u00b9\3\u00b9\3\u00b9"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\7\u00ba\u06eb\n\u00ba\f\u00ba\16\u00ba"+
		"\u06ee\13\u00ba\5\u00ba\u06f0\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u06f7\n\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u0709\n\u00bd\7\u00bd\u070b\n\u00bd\f\u00bd\16"+
		"\u00bd\u070e\13\u00bd\3\u00be\3\u00be\5\u00be\u0712\n\u00be\3\u00be\5"+
		"\u00be\u0715\n\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u0721\n\u00c1\5\u00c1\u0723\n\u00c1"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u0739\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\7\u00c7\u0748\n\u00c7\f\u00c7\16\u00c7\u074b\13\u00c7\3\u00c8\3\u00c8"+
		"\5\u00c8\u074f\n\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\5\u00c9\u0755\n"+
		"\u00c9\3\u00c9\3\u00c9\5\u00c9\u0759\n\u00c9\3\u00c9\3\u00c9\3\u00c9\5"+
		"\u00c9\u075e\n\u00c9\3\u00ca\3\u00ca\3\u00cb\3\u00cb\5\u00cb\u0764\n\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cc\3\u00cc\5\u00cc\u076a\n\u00cc\3\u00cd\3\u00cd"+
		"\3\u00cd\7\u00cd\u076f\n\u00cd\f\u00cd\16\u00cd\u0772\13\u00cd\3\u00ce"+
		"\5\u00ce\u0775\n\u00ce\3\u00ce\5\u00ce\u0778\n\u00ce\3\u00ce\3\u00ce\5"+
		"\u00ce\u077c\n\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0781\n\u00ce\3\u00cf"+
		"\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u079c\n\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u07a3\n\u00d6\f\u00d6"+
		"\16\u00d6\u07a6\13\u00d6\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u07b2\n\u00d8\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u07bd"+
		"\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\7\u00da\u07c3\n\u00da\f\u00da"+
		"\16\u00da\u07c6\13\u00da\5\u00da\u07c8\n\u00da\3\u00db\3\u00db\3\u00dc"+
		"\3\u00dc\3\u00dd\3\u00dd\3\u00de\3\u00de\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\5\u00df\u07dd"+
		"\n\u00df\5\u00df\u07df\n\u00df\3\u00e0\3\u00e0\3\u00e1\3\u00e1\3\u00e2"+
		"\3\u00e2\5\u00e2\u07e7\n\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\5\u00e3\u07ee\n\u00e3\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u07f3\n\u00e4\3"+
		"\u00e5\3\u00e5\3\u00e5\2\u00e6\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba"+
		"\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\2\n\4KKVV\b\63\63??CC``jjm"+
		"n\5\3\3\24\24((\21\3\4\b\n\20\20\24\24\27\30\33\33\35\35\37\37$&()88D"+
		"D[[hhqq\6\n\n\33\33$$))\6--@@TT]]\4TT]]\4wy{{\u0869\2\u01cd\3\2\2\2\4"+
		"\u01ee\3\2\2\2\6\u01f1\3\2\2\2\b\u01f9\3\2\2\2\n\u0215\3\2\2\2\f\u0219"+
		"\3\2\2\2\16\u021b\3\2\2\2\20\u0221\3\2\2\2\22\u0227\3\2\2\2\24\u0229\3"+
		"\2\2\2\26\u0230\3\2\2\2\30\u0232\3\2\2\2\32\u023a\3\2\2\2\34\u0240\3\2"+
		"\2\2\36\u0242\3\2\2\2 \u024a\3\2\2\2\"\u025a\3\2\2\2$\u025c\3\2\2\2&\u0260"+
		"\3\2\2\2(\u026e\3\2\2\2*\u0271\3\2\2\2,\u0274\3\2\2\2.\u027c\3\2\2\2\60"+
		"\u027e\3\2\2\2\62\u0281\3\2\2\2\64\u0287\3\2\2\2\66\u0289\3\2\2\28\u028d"+
		"\3\2\2\2:\u0291\3\2\2\2<\u0293\3\2\2\2>\u0297\3\2\2\2@\u029e\3\2\2\2B"+
		"\u02af\3\2\2\2D\u02b1\3\2\2\2F\u02b4\3\2\2\2H\u02be\3\2\2\2J\u02c8\3\2"+
		"\2\2L\u02ca\3\2\2\2N\u02ce\3\2\2\2P\u02d2\3\2\2\2R\u02da\3\2\2\2T\u02ea"+
		"\3\2\2\2V\u02ed\3\2\2\2X\u02f2\3\2\2\2Z\u02f4\3\2\2\2\\\u02fb\3\2\2\2"+
		"^\u0303\3\2\2\2`\u030a\3\2\2\2b\u030e\3\2\2\2d\u0311\3\2\2\2f\u0319\3"+
		"\2\2\2h\u0321\3\2\2\2j\u0325\3\2\2\2l\u0342\3\2\2\2n\u0345\3\2\2\2p\u034c"+
		"\3\2\2\2r\u035a\3\2\2\2t\u035d\3\2\2\2v\u0363\3\2\2\2x\u036b\3\2\2\2z"+
		"\u037b\3\2\2\2|\u037e\3\2\2\2~\u0383\3\2\2\2\u0080\u0393\3\2\2\2\u0082"+
		"\u0396\3\2\2\2\u0084\u039f\3\2\2\2\u0086\u03a7\3\2\2\2\u0088\u03ab\3\2"+
		"\2\2\u008a\u03b3\3\2\2\2\u008c\u03b5\3\2\2\2\u008e\u03b8\3\2\2\2\u0090"+
		"\u03c1\3\2\2\2\u0092\u03ca\3\2\2\2\u0094\u03cc\3\2\2\2\u0096\u03d0\3\2"+
		"\2\2\u0098\u03d6\3\2\2\2\u009a\u03d8\3\2\2\2\u009c\u03e5\3\2\2\2\u009e"+
		"\u03e7\3\2\2\2\u00a0\u0413\3\2\2\2\u00a2\u0417\3\2\2\2\u00a4\u041b\3\2"+
		"\2\2\u00a6\u041d\3\2\2\2\u00a8\u042e\3\2\2\2\u00aa\u0430\3\2\2\2\u00ac"+
		"\u043e\3\2\2\2\u00ae\u0444\3\2\2\2\u00b0\u0447\3\2\2\2\u00b2\u044c\3\2"+
		"\2\2\u00b4\u0454\3\2\2\2\u00b6\u0458\3\2\2\2\u00b8\u045a\3\2\2\2\u00ba"+
		"\u045c\3\2\2\2\u00bc\u0467\3\2\2\2\u00be\u046d\3\2\2\2\u00c0\u0470\3\2"+
		"\2\2\u00c2\u0475\3\2\2\2\u00c4\u047d\3\2\2\2\u00c6\u0481\3\2\2\2\u00c8"+
		"\u0485\3\2\2\2\u00ca\u0494\3\2\2\2\u00cc\u0496\3\2\2\2\u00ce\u049d\3\2"+
		"\2\2\u00d0\u04ac\3\2\2\2\u00d2\u04ae\3\2\2\2\u00d4\u04b5\3\2\2\2\u00d6"+
		"\u04c1\3\2\2\2\u00d8\u04c3\3\2\2\2\u00da\u04ce\3\2\2\2\u00dc\u04d0\3\2"+
		"\2\2\u00de\u04d4\3\2\2\2\u00e0\u04d9\3\2\2\2\u00e2\u04e0\3\2\2\2\u00e4"+
		"\u04e6\3\2\2\2\u00e6\u04ea\3\2\2\2\u00e8\u04f1\3\2\2\2\u00ea\u04f9\3\2"+
		"\2\2\u00ec\u0500\3\2\2\2\u00ee\u0503\3\2\2\2\u00f0\u0509\3\2\2\2\u00f2"+
		"\u0512\3\2\2\2\u00f4\u0524\3\2\2\2\u00f6\u0527\3\2\2\2\u00f8\u052f\3\2"+
		"\2\2\u00fa\u0538\3\2\2\2\u00fc\u053a\3\2\2\2\u00fe\u0540\3\2\2\2\u0100"+
		"\u0546\3\2\2\2\u0102\u0550\3\2\2\2\u0104\u0555\3\2\2\2\u0106\u0558\3\2"+
		"\2\2\u0108\u055a\3\2\2\2\u010a\u055d\3\2\2\2\u010c\u0579\3\2\2\2\u010e"+
		"\u057b\3\2\2\2\u0110\u058e\3\2\2\2\u0112\u0591\3\2\2\2\u0114\u05a7\3\2"+
		"\2\2\u0116\u05b1\3\2\2\2\u0118\u05b3\3\2\2\2\u011a\u05b9\3\2\2\2\u011c"+
		"\u05bb\3\2\2\2\u011e\u05c6\3\2\2\2\u0120\u05c8\3\2\2\2\u0122\u05cb\3\2"+
		"\2\2\u0124\u05d8\3\2\2\2\u0126\u05da\3\2\2\2\u0128\u05dd\3\2\2\2\u012a"+
		"\u05e1\3\2\2\2\u012c\u05e3\3\2\2\2\u012e\u05e8\3\2\2\2\u0130\u05ea\3\2"+
		"\2\2\u0132\u05f1\3\2\2\2\u0134\u05f6\3\2\2\2\u0136\u060e\3\2\2\2\u0138"+
		"\u0610\3\2\2\2\u013a\u0612\3\2\2\2\u013c\u0616\3\2\2\2\u013e\u0623\3\2"+
		"\2\2\u0140\u0625\3\2\2\2\u0142\u0632\3\2\2\2\u0144\u0635\3\2\2\2\u0146"+
		"\u0639\3\2\2\2\u0148\u063b\3\2\2\2\u014a\u0646\3\2\2\2\u014c\u0653\3\2"+
		"\2\2\u014e\u065c\3\2\2\2\u0150\u065e\3\2\2\2\u0152\u0670\3\2\2\2\u0154"+
		"\u0672\3\2\2\2\u0156\u067b\3\2\2\2\u0158\u0689\3\2\2\2\u015a\u068b\3\2"+
		"\2\2\u015c\u069b\3\2\2\2\u015e\u06a1\3\2\2\2\u0160\u06a3\3\2\2\2\u0162"+
		"\u06a7\3\2\2\2\u0164\u06ac\3\2\2\2\u0166\u06b0\3\2\2\2\u0168\u06d4\3\2"+
		"\2\2\u016a\u06d6\3\2\2\2\u016c\u06db\3\2\2\2\u016e\u06dd\3\2\2\2\u0170"+
		"\u06e0\3\2\2\2\u0172\u06ef\3\2\2\2\u0174\u06f6\3\2\2\2\u0176\u06f8\3\2"+
		"\2\2\u0178\u06fa\3\2\2\2\u017a\u0714\3\2\2\2\u017c\u0716\3\2\2\2\u017e"+
		"\u0718\3\2\2\2\u0180\u0722\3\2\2\2\u0182\u0724\3\2\2\2\u0184\u0727\3\2"+
		"\2\2\u0186\u072a\3\2\2\2\u0188\u072e\3\2\2\2\u018a\u0730\3\2\2\2\u018c"+
		"\u0738\3\2\2\2\u018e\u074c\3\2\2\2\u0190\u075d\3\2\2\2\u0192\u075f\3\2"+
		"\2\2\u0194\u0761\3\2\2\2\u0196\u0767\3\2\2\2\u0198\u076b\3\2\2\2\u019a"+
		"\u0780\3\2\2\2\u019c\u0782\3\2\2\2\u019e\u0784\3\2\2\2\u01a0\u0788\3\2"+
		"\2\2\u01a2\u078c\3\2\2\2\u01a4\u0792\3\2\2\2\u01a6\u0795\3\2\2\2\u01a8"+
		"\u0798\3\2\2\2\u01aa\u079f\3\2\2\2\u01ac\u07a7\3\2\2\2\u01ae\u07b1\3\2"+
		"\2\2\u01b0\u07bc\3\2\2\2\u01b2\u07c7\3\2\2\2\u01b4\u07c9\3\2\2\2\u01b6"+
		"\u07cb\3\2\2\2\u01b8\u07cd\3\2\2\2\u01ba\u07cf\3\2\2\2\u01bc\u07de\3\2"+
		"\2\2\u01be\u07e0\3\2\2\2\u01c0\u07e2\3\2\2\2\u01c2\u07e6\3\2\2\2\u01c4"+
		"\u07ed\3\2\2\2\u01c6\u07f2\3\2\2\2\u01c8\u07f4\3\2\2\2\u01ca\u01cc\5\4"+
		"\3\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7\1"+
		"\2\2\u01d1\3\3\2\2\2\u01d2\u01d4\5\u013a\u009e\2\u01d3\u01d5\7g\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01ef\3\2\2\2\u01d6\u01d8\5T"+
		"+\2\u01d7\u01d9\7g\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01ef"+
		"\3\2\2\2\u01da\u01dc\5\u013a\u009e\2\u01db\u01dd\7g\2\2\u01dc\u01db\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01ef\3\2\2\2\u01de\u01e0\5\b\5\2\u01df"+
		"\u01e1\7g\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01ef\3\2"+
		"\2\2\u01e2\u01e4\5\26\f\2\u01e3\u01e5\7g\2\2\u01e4\u01e3\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01ef\3\2\2\2\u01e6\u01e8\5.\30\2\u01e7\u01e9\7g"+
		"\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ef\3\2\2\2\u01ea"+
		"\u01ec\5\64\33\2\u01eb\u01ed\7g\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3"+
		"\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01d2\3\2\2\2\u01ee\u01d6\3\2\2\2\u01ee"+
		"\u01da\3\2\2\2\u01ee\u01de\3\2\2\2\u01ee\u01e2\3\2\2\2\u01ee\u01e6\3\2"+
		"\2\2\u01ee\u01ea\3\2\2\2\u01ef\5\3\2\2\2\u01f0\u01f2\5\4\3\2\u01f1\u01f0"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\7\3\2\2\2\u01f5\u01fa\5\n\6\2\u01f6\u01fa\5\16\b\2\u01f7\u01fa\5\20\t"+
		"\2\u01f8\u01fa\5\24\13\2\u01f9\u01f5\3\2\2\2\u01f9\u01f6\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\t\3\2\2\2\u01fb\u01fd\7B\2\2"+
		"\u01fc\u01fe\5\f\7\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0201\7g\2\2\u0200\u0202\5\u013a\u009e\2\u0201\u0200\3"+
		"\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\7g\2\2\u0204"+
		"\u0206\5\u013a\u009e\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0216\5Z.\2\u0208\u020a\7B\2\2\u0209\u020b\5\f\7\2\u020a"+
		"\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\7g"+
		"\2\2\u020d\u020f\5\u013a\u009e\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2"+
		"\2\u020f\u0210\3\2\2\2\u0210\u0212\7g\2\2\u0211\u0213\5\u013a\u009e\2"+
		"\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216"+
		"\5Z.\2\u0215\u01fb\3\2\2\2\u0215\u0208\3\2\2\2\u0216\13\3\2\2\2\u0217"+
		"\u021a\5l\67\2\u0218\u021a\5\u013c\u009f\2\u0219\u0217\3\2\2\2\u0219\u0218"+
		"\3\2\2\2\u021a\r\3\2\2\2\u021b\u021c\7B\2\2\u021c\u021d\5\u0114\u008b"+
		"\2\u021d\u021e\7I\2\2\u021e\u021f\5\u013a\u009e\2\u021f\u0220\5Z.\2\u0220"+
		"\17\3\2\2\2\u0221\u0222\7p\2\2\u0222\u0223\5\22\n\2\u0223\u0224\5Z.\2"+
		"\u0224\21\3\2\2\2\u0225\u0228\5\u013a\u009e\2\u0226\u0228\5T+\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228\23\3\2\2\2\u0229\u022a\7:\2\2"+
		"\u022a\u022b\5Z.\2\u022b\u022c\7p\2\2\u022c\u022d\5\22\n\2\u022d\25\3"+
		"\2\2\2\u022e\u0231\5\30\r\2\u022f\u0231\5\36\20\2\u0230\u022e\3\2\2\2"+
		"\u0230\u022f\3\2\2\2\u0231\27\3\2\2\2\u0232\u0233\7G\2\2\u0233\u0234\5"+
		"\32\16\2\u0234\u0236\5Z.\2\u0235\u0237\5\34\17\2\u0236\u0235\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\31\3\2\2\2\u0238\u023b\5\u013a\u009e\2\u0239\u023b"+
		"\5T+\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\33\3\2\2\2\u023c"+
		"\u023d\7>\2\2\u023d\u0241\5Z.\2\u023e\u023f\7>\2\2\u023f\u0241\5\30\r"+
		"\2\u0240\u023c\3\2\2\2\u0240\u023e\3\2\2\2\u0241\35\3\2\2\2\u0242\u0243"+
		"\7l\2\2\u0243\u0244\5\u013a\u009e\2\u0244\u0246\7L\2\2\u0245\u0247\5 "+
		"\21\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\7b\2\2\u0249\37\3\2\2\2\u024a\u024c\5\"\22\2\u024b\u024d\5 \21"+
		"\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d!\3\2\2\2\u024e\u024f"+
		"\5$\23\2\u024f\u0250\5\6\4\2\u0250\u025b\3\2\2\2\u0251\u0252\5(\25\2\u0252"+
		"\u0253\5\6\4\2\u0253\u025b\3\2\2\2\u0254\u0255\5$\23\2\u0255\u0256\7g"+
		"\2\2\u0256\u025b\3\2\2\2\u0257\u0258\5(\25\2\u0258\u0259\7g\2\2\u0259"+
		"\u025b\3\2\2\2\u025a\u024e\3\2\2\2\u025a\u0251\3\2\2\2\u025a\u0254\3\2"+
		"\2\2\u025a\u0257\3\2\2\2\u025b#\3\2\2\2\u025c\u025d\7\62\2\2\u025d\u025e"+
		"\5&\24\2\u025e\u025f\7\64\2\2\u025f%\3\2\2\2\u0260\u0262\5\u0114\u008b"+
		"\2\u0261\u0263\5*\26\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u026b"+
		"\3\2\2\2\u0264\u0265\7\65\2\2\u0265\u0267\5\u0114\u008b\2\u0266\u0268"+
		"\5*\26\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269"+
		"\u0264\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c\'\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7\67\2\2\u026f\u0270"+
		"\7\64\2\2\u0270)\3\2\2\2\u0271\u0272\7o\2\2\u0272\u0273\5,\27\2\u0273"+
		"+\3\2\2\2\u0274\u0275\5\u013a\u009e\2\u0275-\3\2\2\2\u0276\u0277\5\60"+
		"\31\2\u0277\u0278\5\b\5\2\u0278\u027d\3\2\2\2\u0279\u027a\5\60\31\2\u027a"+
		"\u027b\5\36\20\2\u027b\u027d\3\2\2\2\u027c\u0276\3\2\2\2\u027c\u0279\3"+
		"\2\2\2\u027d/\3\2\2\2\u027e\u027f\5\62\32\2\u027f\u0280\7\64\2\2\u0280"+
		"\61\3\2\2\2\u0281\u0282\5\u01c2\u00e2\2\u0282\63\3\2\2\2\u0283\u0288\5"+
		"\66\34\2\u0284\u0288\58\35\2\u0285\u0288\5:\36\2\u0286\u0288\5<\37\2\u0287"+
		"\u0283\3\2\2\2\u0287\u0284\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2"+
		"\2\2\u0288\65\3\2\2\2\u0289\u028b\7\61\2\2\u028a\u028c\5\62\32\2\u028b"+
		"\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\67\3\2\2\2\u028d\u028f\7\66\2"+
		"\2\u028e\u0290\5\62\32\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"9\3\2\2\2\u0291\u0292\7A\2\2\u0292;\3\2\2\2\u0293\u0295\7e\2\2\u0294\u0296"+
		"\5\u013a\u009e\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296=\3\2\2"+
		"\2\u0297\u0298\7P\2\2\u0298\u029a\5@!\2\u0299\u029b\5D#\2\u029a\u0299"+
		"\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\7E\2\2\u029d"+
		"?\3\2\2\2\u029e\u02a3\5B\"\2\u029f\u02a0\7\65\2\2\u02a0\u02a2\5B\"\2\u02a1"+
		"\u029f\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4A\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02b0\5\u0192\u00ca\2\u02a7"+
		"\u02a8\5\u0192\u00ca\2\u02a8\u02a9\7\64\2\2\u02a9\u02aa\5\u0190\u00c9"+
		"\2\u02aa\u02b0\3\2\2\2\u02ab\u02ac\5\u0192\u00ca\2\u02ac\u02ad\7\64\2"+
		"\2\u02ad\u02ae\5\u01a8\u00d5\2\u02ae\u02b0\3\2\2\2\u02af\u02a6\3\2\2\2"+
		"\u02af\u02a7\3\2\2\2\u02af\u02ab\3\2\2\2\u02b0C\3\2\2\2\u02b1\u02b2\7"+
		"o\2\2\u02b2\u02b3\5F$\2\u02b3E\3\2\2\2\u02b4\u02b9\5H%\2\u02b5\u02b6\7"+
		"\65\2\2\u02b6\u02b8\5H%\2\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02baG\3\2\2\2\u02bb\u02b9\3\2\2\2"+
		"\u02bc\u02bf\5J&\2\u02bd\u02bf\5L\'\2\u02be\u02bc\3\2\2\2\u02be\u02bd"+
		"\3\2\2\2\u02bfI\3\2\2\2\u02c0\u02c1\5\u0190\u00c9\2\u02c1\u02c2\7\64\2"+
		"\2\u02c2\u02c3\5\u0190\u00c9\2\u02c3\u02c9\3\2\2\2\u02c4\u02c5\5\u0190"+
		"\u00c9\2\u02c5\u02c6\7\64\2\2\u02c6\u02c7\5\u01a8\u00d5\2\u02c7\u02c9"+
		"\3\2\2\2\u02c8\u02c0\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9K\3\2\2\2\u02ca"+
		"\u02cb\5\u0190\u00c9\2\u02cb\u02cc\t\2\2\2\u02cc\u02cd\5\u0190\u00c9\2"+
		"\u02cdM\3\2\2\2\u02ce\u02cf\7P\2\2\u02cf\u02d0\5P)\2\u02d0\u02d1\7E\2"+
		"\2\u02d1O\3\2\2\2\u02d2\u02d7\5R*\2\u02d3\u02d4\7\65\2\2\u02d4\u02d6\5"+
		"R*\2\u02d5\u02d3\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8Q\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\5\u018c"+
		"\u00c7\2\u02dbS\3\2\2\2\u02dc\u02eb\5\\/\2\u02dd\u02eb\5d\63\2\u02de\u02eb"+
		"\5l\67\2\u02df\u02eb\5\u0086D\2\u02e0\u02eb\5\u008eH\2\u02e1\u02eb\5\u00a8"+
		"U\2\u02e2\u02eb\5\u00c8e\2\u02e3\u02eb\5\u00ceh\2\u02e4\u02eb\5\u00d4"+
		"k\2\u02e5\u02eb\5\u00e8u\2\u02e6\u02eb\5\u00eex\2\u02e7\u02eb\5\u00f0"+
		"y\2\u02e8\u02eb\5\u00f4{\2\u02e9\u02eb\5\u00fa~\2\u02ea\u02dc\3\2\2\2"+
		"\u02ea\u02dd\3\2\2\2\u02ea\u02de\3\2\2\2\u02ea\u02df\3\2\2\2\u02ea\u02e0"+
		"\3\2\2\2\u02ea\u02e1\3\2\2\2\u02ea\u02e2\3\2\2\2\u02ea\u02e3\3\2\2\2\u02ea"+
		"\u02e4\3\2\2\2\u02ea\u02e5\3\2\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02e7\3\2"+
		"\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02e9\3\2\2\2\u02ebU\3\2\2\2\u02ec\u02ee"+
		"\5T+\2\u02ed\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0W\3\2\2\2\u02f1\u02f3\5\6\4\2\u02f2\u02f1\3\2\2\2"+
		"\u02f2\u02f3\3\2\2\2\u02f3Y\3\2\2\2\u02f4\u02f6\7L\2\2\u02f5\u02f7\5\6"+
		"\4\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f9\7b\2\2\u02f9[\3\2\2\2\u02fa\u02fc\5\u0132\u009a\2\u02fb\u02fa\3"+
		"\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7H\2\2\u02fe"+
		"\u0300\5^\60\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301\u0302\5`\61\2\u0302]\3\2\2\2\u0303\u0304\t\3\2\2\u0304_\3\2"+
		"\2\2\u0305\u030b\5b\62\2\u0306\u0307\5b\62\2\u0307\u0308\7;\2\2\u0308"+
		"\u0309\5`\61\2\u0309\u030b\3\2\2\2\u030a\u0305\3\2\2\2\u030a\u0306\3\2"+
		"\2\2\u030ba\3\2\2\2\u030c\u030f\5\u01c2\u00e2\2\u030d\u030f\5\u01bc\u00df"+
		"\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030fc\3\2\2\2\u0310\u0312"+
		"\5\u0132\u009a\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3"+
		"\2\2\2\u0313\u0315\5\u010e\u0088\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2"+
		"\2\2\u0315\u0316\3\2\2\2\u0316\u0317\7N\2\2\u0317\u0318\5f\64\2\u0318"+
		"e\3\2\2\2\u0319\u031e\5h\65\2\u031a\u031b\7\65\2\2\u031b\u031d\5h\65\2"+
		"\u031c\u031a\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031fg\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0323\5\u0114\u008b"+
		"\2\u0322\u0324\5j\66\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324i"+
		"\3\2\2\2\u0325\u0326\7=\2\2\u0326\u0327\5\u013a\u009e\2\u0327k\3\2\2\2"+
		"\u0328\u0329\5n8\2\u0329\u032a\5f\64\2\u032a\u0343\3\2\2\2\u032b\u032c"+
		"\5n8\2\u032c\u032d\5p9\2\u032d\u032e\5\u018e\u00c8\2\u032e\u032f\5Z.\2"+
		"\u032f\u0343\3\2\2\2\u0330\u0331\5n8\2\u0331\u0332\5p9\2\u0332\u0333\5"+
		"\u018e\u00c8\2\u0333\u0334\5r:\2\u0334\u0343\3\2\2\2\u0335\u0336\5n8\2"+
		"\u0336\u0337\5p9\2\u0337\u0338\5\u018e\u00c8\2\u0338\u0339\5z>\2\u0339"+
		"\u0343\3\2\2\2\u033a\u033b\5n8\2\u033b\u033c\5p9\2\u033c\u033e\5\u018e"+
		"\u00c8\2\u033d\u033f\5j\66\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u0341\5\u0080A\2\u0341\u0343\3\2\2\2\u0342\u0328"+
		"\3\2\2\2\u0342\u032b\3\2\2\2\u0342\u0330\3\2\2\2\u0342\u0335\3\2\2\2\u0342"+
		"\u033a\3\2\2\2\u0343m\3\2\2\2\u0344\u0346\5\u0132\u009a\2\u0345\u0344"+
		"\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0349\5\u010e\u0088"+
		"\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b"+
		"\7n\2\2\u034bo\3\2\2\2\u034c\u034d\5\u01c2\u00e2\2\u034dq\3\2\2\2\u034e"+
		"\u034f\7L\2\2\u034f\u0351\5t;\2\u0350\u0352\5v<\2\u0351\u0350\3\2\2\2"+
		"\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7b\2\2\u0354\u035b"+
		"\3\2\2\2\u0355\u0356\7L\2\2\u0356\u0357\5v<\2\u0357\u0358\5t;\2\u0358"+
		"\u0359\7b\2\2\u0359\u035b\3\2\2\2\u035a\u034e\3\2\2\2\u035a\u0355\3\2"+
		"\2\2\u035bs\3\2\2\2\u035c\u035e\5\u0132\u009a\2\u035d\u035c\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\7D\2\2\u0360\u0361\5Z."+
		"\2\u0361u\3\2\2\2\u0362\u0364\5\u0132\u009a\2\u0363\u0362\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\7h\2\2\u0366\u0368\5x="+
		"\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a"+
		"\5Z.\2\u036aw\3\2\2\2\u036b\u036c\7O\2\2\u036c\u036d\5\u01c2\u00e2\2\u036d"+
		"\u036e\7d\2\2\u036ey\3\2\2\2\u036f\u0370\7L\2\2\u0370\u0372\5|?\2\u0371"+
		"\u0373\5~@\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2"+
		"\2\u0374\u0375\7b\2\2\u0375\u037c\3\2\2\2\u0376\u0377\7L\2\2\u0377\u0378"+
		"\5~@\2\u0378\u0379\5|?\2\u0379\u037a\7b\2\2\u037a\u037c\3\2\2\2\u037b"+
		"\u036f\3\2\2\2\u037b\u0376\3\2\2\2\u037c{\3\2\2\2\u037d\u037f\5\u0132"+
		"\u009a\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380"+
		"\u0381\7D\2\2\u0381}\3\2\2\2\u0382\u0384\5\u0132\u009a\2\u0383\u0382\3"+
		"\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\7h\2\2\u0386"+
		"\177\3\2\2\2\u0387\u0388\7L\2\2\u0388\u038a\5\u0082B\2\u0389\u038b\5\u0084"+
		"C\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038d\7b\2\2\u038d\u0394\3\2\2\2\u038e\u038f\7L\2\2\u038f\u0390\5\u0084"+
		"C\2\u0390\u0391\5\u0082B\2\u0391\u0392\7b\2\2\u0392\u0394\3\2\2\2\u0393"+
		"\u0387\3\2\2\2\u0393\u038e\3\2\2\2\u0394\u0081\3\2\2\2\u0395\u0397\5\u0132"+
		"\u009a\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398"+
		"\u039a\7q\2\2\u0399\u039b\5x=\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2"+
		"\2\u039b\u039c\3\2\2\2\u039c\u039d\5Z.\2\u039d\u0083\3\2\2\2\u039e\u03a0"+
		"\5\u0132\u009a\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3"+
		"\2\2\2\u03a1\u03a3\78\2\2\u03a2\u03a4\5x=\2\u03a3\u03a2\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\5Z.\2\u03a6\u0085\3\2\2"+
		"\2\u03a7\u03a8\5\u0088E\2\u03a8\u03a9\5\u008cG\2\u03a9\u0087\3\2\2\2\u03aa"+
		"\u03ac\5\u0132\u009a\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae"+
		"\3\2\2\2\u03ad\u03af\5\u0110\u0089\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3"+
		"\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\7m\2\2\u03b1\u03b2\5\u008aF\2\u03b2"+
		"\u0089\3\2\2\2\u03b3\u03b4\5\u01c2\u00e2\2\u03b4\u008b\3\2\2\2\u03b5\u03b6"+
		"\7=\2\2\u03b6\u03b7\5\u018c\u00c7\2\u03b7\u008d\3\2\2\2\u03b8\u03b9\5"+
		"\u0090I\2\u03b9\u03bb\5\u0092J\2\u03ba\u03bc\5> \2\u03bb\u03ba\3\2\2\2"+
		"\u03bb\u03bc\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\5\u0094K\2\u03be"+
		"\u03bf\5\u0098M\2\u03bf\u008f\3\2\2\2\u03c0\u03c2\5\u0132\u009a\2\u03c1"+
		"\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c5\5\u010e"+
		"\u0088\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03c7\7C\2\2\u03c7\u0091\3\2\2\2\u03c8\u03cb\5\u01c2\u00e2\2\u03c9\u03cb"+
		"\5\u01bc\u00df\2\u03ca\u03c8\3\2\2\2\u03ca\u03c9\3\2\2\2\u03cb\u0093\3"+
		"\2\2\2\u03cc\u03ce\5\u009aN\2\u03cd\u03cf\5\u0096L\2\u03ce\u03cd\3\2\2"+
		"\2\u03ce\u03cf\3\2\2\2\u03cf\u0095\3\2\2\2\u03d0\u03d2\7.\2\2\u03d1\u03d3"+
		"\5\u0132\u009a\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3"+
		"\2\2\2\u03d4\u03d5\5\u018c\u00c7\2\u03d5\u0097\3\2\2\2\u03d6\u03d7\5Z"+
		".\2\u03d7\u0099\3\2\2\2\u03d8\u03da\5\u009cO\2\u03d9\u03db\5\u009aN\2"+
		"\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u009b\3\2\2\2\u03dc\u03dd"+
		"\7O\2\2\u03dd\u03e6\7d\2\2\u03de\u03df\7O\2\2\u03df\u03e1\5\u009eP\2\u03e0"+
		"\u03e2\7\31\2\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3"+
		"\2\2\2\u03e3\u03e4\7d\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03dc\3\2\2\2\u03e5"+
		"\u03de\3\2\2\2\u03e6\u009d\3\2\2\2\u03e7\u03ec\5\u00a0Q\2\u03e8\u03e9"+
		"\7\65\2\2\u03e9\u03eb\5\u00a0Q\2\u03ea\u03e8\3\2\2\2\u03eb\u03ee\3\2\2"+
		"\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u009f\3\2\2\2\u03ee\u03ec"+
		"\3\2\2\2\u03ef\u03f1\7\t\2\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1"+
		"\u03f3\3\2\2\2\u03f2\u03f4\7N\2\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f7\7*\2\2\u03f6\u03f5\3\2\2\2\u03f6"+
		"\u03f7\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03fa\5\u00a2R\2\u03f9\u03f8"+
		"\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\5\u00a4S"+
		"\2\u03fc\u03fe\5\u018e\u00c8\2\u03fd\u03ff\5\u00a6T\2\u03fe\u03fd\3\2"+
		"\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0414\3\2\2\2\u0400\u0402\7\t\2\2\u0401"+
		"\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\7n"+
		"\2\2\u0404\u0406\7*\2\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0408\3\2\2\2\u0407\u0409\5\u00a2R\2\u0408\u0407\3\2\2\2\u0408\u0409"+
		"\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\5\u00a4S\2\u040b\u040d\5\u018e"+
		"\u00c8\2\u040c\u040e\5\u00a6T\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2"+
		"\2\u040e\u0414\3\2\2\2\u040f\u0411\5\u0132\u009a\2\u0410\u040f\3\2\2\2"+
		"\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\5\u018c\u00c7\2\u0413"+
		"\u03f0\3\2\2\2\u0413\u0401\3\2\2\2\u0413\u0410\3\2\2\2\u0414\u00a1\3\2"+
		"\2\2\u0415\u0418\5\u01c2\u00e2\2\u0416\u0418\7\r\2\2\u0417\u0415\3\2\2"+
		"\2\u0417\u0416\3\2\2\2\u0418\u00a3\3\2\2\2\u0419\u041c\5\u01c2\u00e2\2"+
		"\u041a\u041c\7\r\2\2\u041b\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041c\u00a5"+
		"\3\2\2\2\u041d\u041e\7=\2\2\u041e\u041f\5\u013a\u009e\2\u041f\u00a7\3"+
		"\2\2\2\u0420\u0422\5\u0132\u009a\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2"+
		"\2\2\u0422\u0424\3\2\2\2\u0423\u0425\5\u0110\u0089\2\u0424\u0423\3\2\2"+
		"\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u042f\5\u00aaV\2\u0427"+
		"\u0429\5\u0132\u009a\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b"+
		"\3\2\2\2\u042a\u042c\5\u0110\u0089\2\u042b\u042a\3\2\2\2\u042b\u042c\3"+
		"\2\2\2\u042c\u042d\3\2\2\2\u042d\u042f\5\u00ba^\2\u042e\u0421\3\2\2\2"+
		"\u042e\u0428\3\2\2\2\u042f\u00a9\3\2\2\2\u0430\u0431\7?\2\2\u0431\u0433"+
		"\5\u00b6\\\2\u0432\u0434\5> \2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2"+
		"\u0434\u0436\3\2\2\2\u0435\u0437\5\u01b0\u00d9\2\u0436\u0435\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\7L\2\2\u0439\u043b\5\u00ac"+
		"W\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u043d\7b\2\2\u043d\u00ab\3\2\2\2\u043e\u0440\5\u00aeX\2\u043f\u0441\5"+
		"\u00acW\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u00ad\3\2\2\2"+
		"\u0442\u0445\5T+\2\u0443\u0445\5\u00b0Y\2\u0444\u0442\3\2\2\2\u0444\u0443"+
		"\3\2\2\2\u0445\u00af\3\2\2\2\u0446\u0448\5\u0132\u009a\2\u0447\u0446\3"+
		"\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\7\62\2\2\u044a"+
		"\u044b\5\u00b2Z\2\u044b\u00b1\3\2\2\2\u044c\u0451\5\u00b4[\2\u044d\u044e"+
		"\7\65\2\2\u044e\u0450\5\u00b4[\2\u044f\u044d\3\2\2\2\u0450\u0453\3\2\2"+
		"\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u00b3\3\2\2\2\u0453\u0451"+
		"\3\2\2\2\u0454\u0456\5\u00b8]\2\u0455\u0457\5\u0194\u00cb\2\u0456\u0455"+
		"\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u00b5\3\2\2\2\u0458\u0459\5\u01c2\u00e2"+
		"\2\u0459\u00b7\3\2\2\2\u045a\u045b\5\u01c2\u00e2\2\u045b\u00b9\3\2\2\2"+
		"\u045c\u045d\7?\2\2\u045d\u045f\5\u00b6\\\2\u045e\u0460\5> \2\u045f\u045e"+
		"\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\5\u01b0\u00d9"+
		"\2\u0462\u0463\7L\2\2\u0463\u0464\5\u00bc_\2\u0464\u0465\7b\2\2\u0465"+
		"\u00bb\3\2\2\2\u0466\u0468\5\u00be`\2\u0467\u0466\3\2\2\2\u0468\u0469"+
		"\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u00bd\3\2\2\2\u046b"+
		"\u046e\5T+\2\u046c\u046e\5\u00c0a\2\u046d\u046b\3\2\2\2\u046d\u046c\3"+
		"\2\2\2\u046e\u00bf\3\2\2\2\u046f\u0471\5\u0132\u009a\2\u0470\u046f\3\2"+
		"\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\7\62\2\2\u0473"+
		"\u0474\5\u00c2b\2\u0474\u00c1\3\2\2\2\u0475\u047a\5\u00c4c\2\u0476\u0477"+
		"\7\65\2\2\u0477\u0479\5\u00c4c\2\u0478\u0476\3\2\2\2\u0479\u047c\3\2\2"+
		"\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u00c3\3\2\2\2\u047c\u047a"+
		"\3\2\2\2\u047d\u047f\5\u00b8]\2\u047e\u0480\5\u00c6d\2\u047f\u047e\3\2"+
		"\2\2\u047f\u0480\3\2\2\2\u0480\u00c5\3\2\2\2\u0481\u0482\7=\2\2\u0482"+
		"\u0483\5\u01c6\u00e4\2\u0483\u00c7\3\2\2\2\u0484\u0486\5\u0132\u009a\2"+
		"\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0488\3\2\2\2\u0487\u0489"+
		"\5\u0110\u0089\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3"+
		"\2\2\2\u048a\u048b\7j\2\2\u048b\u048d\5\u00caf\2\u048c\u048e\5> \2\u048d"+
		"\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u0491\5\u01b0"+
		"\u00d9\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492"+
		"\u0493\5\u00ccg\2\u0493\u00c9\3\2\2\2\u0494\u0495\5\u01c2\u00e2\2\u0495"+
		"\u00cb\3\2\2\2\u0496\u0498\7L\2\2\u0497\u0499\5V,\2\u0498\u0497\3\2\2"+
		"\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b\7b\2\2\u049b\u00cd"+
		"\3\2\2\2\u049c\u049e\5\u0132\u009a\2\u049d\u049c\3\2\2\2\u049d\u049e\3"+
		"\2\2\2\u049e\u04a0\3\2\2\2\u049f\u04a1\5\u0110\u0089\2\u04a0\u049f\3\2"+
		"\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\7\63\2\2\u04a3"+
		"\u04a5\5\u00d0i\2\u04a4\u04a6\5> \2\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3"+
		"\2\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a9\5\u01b0\u00d9\2\u04a8\u04a7\3\2"+
		"\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\5\u00d2j\2\u04ab"+
		"\u00cf\3\2\2\2\u04ac\u04ad\5\u01c2\u00e2\2\u04ad\u00d1\3\2\2\2\u04ae\u04b0"+
		"\7L\2\2\u04af\u04b1\5V,\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1"+
		"\u04b2\3\2\2\2\u04b2\u04b3\7b\2\2\u04b3\u00d3\3\2\2\2\u04b4\u04b6\5\u0132"+
		"\u009a\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b8\3\2\2\2\u04b7"+
		"\u04b9\5\u0110\u0089\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba"+
		"\3\2\2\2\u04ba\u04bb\7`\2\2\u04bb\u04bd\5\u00d6l\2\u04bc\u04be\5\u01b0"+
		"\u00d9\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u04c0\5\u00d8m\2\u04c0\u00d5\3\2\2\2\u04c1\u04c2\5\u01c2\u00e2\2\u04c2"+
		"\u00d7\3\2\2\2\u04c3\u04c5\7L\2\2\u04c4\u04c6\5\u00dco\2\u04c5\u04c4\3"+
		"\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\7b\2\2\u04c8"+
		"\u00d9\3\2\2\2\u04c9\u04cf\5\u00dep\2\u04ca\u04cf\5\u00e0q\2\u04cb\u04cf"+
		"\5\u00e2r\2\u04cc\u04cf\5\u00e4s\2\u04cd\u04cf\5\u00e6t\2\u04ce\u04c9"+
		"\3\2\2\2\u04ce\u04ca\3\2\2\2\u04ce\u04cb\3\2\2\2\u04ce\u04cc\3\2\2\2\u04ce"+
		"\u04cd\3\2\2\2\u04cf\u00db\3\2\2\2\u04d0\u04d2\5\u00dan\2\u04d1\u04d3"+
		"\5\u00dco\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u00dd\3\2\2"+
		"\2\u04d4\u04d5\5n8\2\u04d5\u04d6\5p9\2\u04d6\u04d7\5\u018e\u00c8\2\u04d7"+
		"\u04d8\5z>\2\u04d8\u00df\3\2\2\2\u04d9\u04da\5\u0090I\2\u04da\u04dc\5"+
		"\u0092J\2\u04db\u04dd\5> \2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04df\5\u0094K\2\u04df\u00e1\3\2\2\2\u04e0\u04e2"+
		"\5\u00eav\2\u04e1\u04e3\5> \2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2"+
		"\u04e3\u04e4\3\2\2\2\u04e4\u04e5\5\u009cO\2\u04e5\u00e3\3\2\2\2\u04e6"+
		"\u04e7\5\u00f6|\2\u04e7\u04e8\5\u00f8}\2\u04e8\u04e9\5z>\2\u04e9\u00e5"+
		"\3\2\2\2\u04ea\u04ec\5\u0088E\2\u04eb\u04ed\5\u01b0\u00d9\2\u04ec\u04eb"+
		"\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ef\3\2\2\2\u04ee\u04f0\5\u008cG"+
		"\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u00e7\3\2\2\2\u04f1\u04f3"+
		"\5\u00eav\2\u04f2\u04f4\5> \2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2"+
		"\u04f4\u04f5\3\2\2\2\u04f5\u04f6\5\u009cO\2\u04f6\u04f7\5\u00ecw\2\u04f7"+
		"\u00e9\3\2\2\2\u04f8\u04fa\5\u0132\u009a\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa"+
		"\3\2\2\2\u04fa\u04fc\3\2\2\2\u04fb\u04fd\5\u010e\u0088\2\u04fc\u04fb\3"+
		"\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\7\30\2\2\u04ff"+
		"\u00eb\3\2\2\2\u0500\u0501\5Z.\2\u0501\u00ed\3\2\2\2\u0502\u0504\5\u0132"+
		"\u009a\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0506\7\32\2\2\u0506\u0507\5Z.\2\u0507\u00ef\3\2\2\2\u0508\u050a\5\u0110"+
		"\u0089\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u050c\7\'\2\2\u050c\u050e\5\u0190\u00c9\2\u050d\u050f\5\u01b0\u00d9\2"+
		"\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511"+
		"\5\u00f2z\2\u0511\u00f1\3\2\2\2\u0512\u0514\7L\2\2\u0513\u0515\5V,\2\u0514"+
		"\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\7b"+
		"\2\2\u0517\u00f3\3\2\2\2\u0518\u0519\5\u00f6|\2\u0519\u051a\5\u00f8}\2"+
		"\u051a\u051b\5Z.\2\u051b\u0525\3\2\2\2\u051c\u051d\5\u00f6|\2\u051d\u051e"+
		"\5\u00f8}\2\u051e\u051f\5r:\2\u051f\u0525\3\2\2\2\u0520\u0521\5\u00f6"+
		"|\2\u0521\u0522\5\u00f8}\2\u0522\u0523\5z>\2\u0523\u0525\3\2\2\2\u0524"+
		"\u0518\3\2\2\2\u0524\u051c\3\2\2\2\u0524\u0520\3\2\2\2\u0525\u00f5\3\2"+
		"\2\2\u0526\u0528\5\u0132\u009a\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2"+
		"\2\u0528\u052a\3\2\2\2\u0529\u052b\5\u010e\u0088\2\u052a\u0529\3\2\2\2"+
		"\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\7#\2\2\u052d\u052e"+
		"\5\u009cO\2\u052e\u00f7\3\2\2\2\u052f\u0531\7.\2\2\u0530\u0532\5\u0132"+
		"\u009a\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533"+
		"\u0534\5\u018c\u00c7\2\u0534\u00f9\3\2\2\2\u0535\u0539\5\u00fc\177\2\u0536"+
		"\u0539\5\u00fe\u0080\2\u0537\u0539\5\u0100\u0081\2\u0538\u0535\3\2\2\2"+
		"\u0538\u0536\3\2\2\2\u0538\u0537\3\2\2\2\u0539\u00fb\3\2\2\2\u053a\u053b"+
		"\7&\2\2\u053b\u053c\7%\2\2\u053c\u053d\5\u01bc\u00df\2\u053d\u053e\7L"+
		"\2\2\u053e\u053f\7b\2\2\u053f\u00fd\3\2\2\2\u0540\u0541\7\b\2\2\u0541"+
		"\u0542\7%\2\2\u0542\u0543\5\u01bc\u00df\2\u0543\u0544\7L\2\2\u0544\u0545"+
		"\7b\2\2\u0545\u00ff\3\2\2\2\u0546\u0547\7\35\2\2\u0547\u0548\7%\2\2\u0548"+
		"\u0549\5\u01bc\u00df\2\u0549\u054b\7L\2\2\u054a\u054c\5\u0102\u0082\2"+
		"\u054b\u054a\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e"+
		"\7b\2\2\u054e\u0101\3\2\2\2\u054f\u0551\5\u0104\u0083\2\u0550\u054f\3"+
		"\2\2\2\u0550\u0551\3\2\2\2\u0551\u0553\3\2\2\2\u0552\u0554\5\u0108\u0085"+
		"\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0103\3\2\2\2\u0555\u0556"+
		"\7\27\2\2\u0556\u0557\5\u0106\u0084\2\u0557\u0105\3\2\2\2\u0558\u0559"+
		"\7y\2\2\u0559\u0107\3\2\2\2\u055a\u055b\7\20\2\2\u055b\u055c\5\u010a\u0086"+
		"\2\u055c\u0109\3\2\2\2\u055d\u055e\t\4\2\2\u055e\u010b\3\2\2\2\u055f\u057a"+
		"\7\63\2\2\u0560\u057a\7\16\2\2\u0561\u057a\7\25\2\2\u0562\u057a\7\34\2"+
		"\2\u0563\u057a\7\35\2\2\u0564\u057a\7\21\2\2\u0565\u057a\7\37\2\2\u0566"+
		"\u057a\7\4\2\2\u0567\u0568\7a\2\2\u0568\u057a\7 \2\2\u0569\u057a\7[\2"+
		"\2\u056a\u057a\7\b\2\2\u056b\u057a\7&\2\2\u056c\u057a\7\"\2\2\u056d\u057a"+
		"\7!\2\2\u056e\u057a\7$\2\2\u056f\u0570\7$\2\2\u0570\u0571\7O\2\2\u0571"+
		"\u0572\7\23\2\2\u0572\u057a\7d\2\2\u0573\u0574\7$\2\2\u0574\u0575\7O\2"+
		"\2\u0575\u0576\7\26\2\2\u0576\u057a\7d\2\2\u0577\u057a\7\33\2\2\u0578"+
		"\u057a\5\u0110\u0089\2\u0579\u055f\3\2\2\2\u0579\u0560\3\2\2\2\u0579\u0561"+
		"\3\2\2\2\u0579\u0562\3\2\2\2\u0579\u0563\3\2\2\2\u0579\u0564\3\2\2\2\u0579"+
		"\u0565\3\2\2\2\u0579\u0566\3\2\2\2\u0579\u0567\3\2\2\2\u0579\u0569\3\2"+
		"\2\2\u0579\u056a\3\2\2\2\u0579\u056b\3\2\2\2\u0579\u056c\3\2\2\2\u0579"+
		"\u056d\3\2\2\2\u0579\u056e\3\2\2\2\u0579\u056f\3\2\2\2\u0579\u0573\3\2"+
		"\2\2\u0579\u0577\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u010d\3\2\2\2\u057b"+
		"\u057d\5\u010c\u0087\2\u057c\u057e\5\u010e\u0088\2\u057d\u057c\3\2\2\2"+
		"\u057d\u057e\3\2\2\2\u057e\u010f\3\2\2\2\u057f\u058f\7+\2\2\u0580\u0581"+
		"\7+\2\2\u0581\u0582\7O\2\2\u0582\u0583\7h\2\2\u0583\u058f\7d\2\2\u0584"+
		"\u058f\7_\2\2\u0585\u0586\7_\2\2\u0586\u0587\7O\2\2\u0587\u0588\7h\2\2"+
		"\u0588\u058f\7d\2\2\u0589\u058f\7^\2\2\u058a\u058b\7^\2\2\u058b\u058c"+
		"\7O\2\2\u058c\u058d\7h\2\2\u058d\u058f\7d\2\2\u058e\u057f\3\2\2\2\u058e"+
		"\u0580\3\2\2\2\u058e\u0584\3\2\2\2\u058e\u0585\3\2\2\2\u058e\u0589\3\2"+
		"\2\2\u058e\u058a\3\2\2\2\u058f\u0111\3\2\2\2\u0590\u0592\5\u0110\u0089"+
		"\2\u0591\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0591\3\2\2\2\u0593\u0594"+
		"\3\2\2\2\u0594\u0113\3\2\2\2\u0595\u0596\b\u008b\1\2\u0596\u0598\5\u0116"+
		"\u008c\2\u0597\u0599\5\u018e\u00c8\2\u0598\u0597\3\2\2\2\u0598\u0599\3"+
		"\2\2\2\u0599\u05a8\3\2\2\2\u059a\u059c\5\u0118\u008d\2\u059b\u059d\5\u018e"+
		"\u00c8\2\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u05a8\3\2\2\2\u059e"+
		"\u05a8\5\u011a\u008e\2\u059f\u05a1\5\u011c\u008f\2\u05a0\u05a2\5\u018e"+
		"\u00c8\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a8\3\2\2\2\u05a3"+
		"\u05a8\5\u0122\u0092\2\u05a4\u05a5\7J\2\2\u05a5\u05a8\5\u018c\u00c7\2"+
		"\u05a6\u05a8\5\u012a\u0096\2\u05a7\u0595\3\2\2\2\u05a7\u059a\3\2\2\2\u05a7"+
		"\u059e\3\2\2\2\u05a7\u059f\3\2\2\2\u05a7\u05a3\3\2\2\2\u05a7\u05a4\3\2"+
		"\2\2\u05a7\u05a6\3\2\2\2\u05a8\u05ae\3\2\2\2\u05a9\u05aa\6\u008b\2\3\u05aa"+
		"\u05ab\7/\2\2\u05ab\u05ad\5\u018c\u00c7\2\u05ac\u05a9\3\2\2\2\u05ad\u05b0"+
		"\3\2\2\2\u05ae\u05ac\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u0115\3\2\2\2\u05b0"+
		"\u05ae\3\2\2\2\u05b1\u05b2\7\r\2\2\u05b2\u0117\3\2\2\2\u05b3\u05b4\5\u01c2"+
		"\u00e2\2\u05b4\u0119\3\2\2\2\u05b5\u05b6\7n\2\2\u05b6\u05ba\5\u0114\u008b"+
		"\2\u05b7\u05b8\7N\2\2\u05b8\u05ba\5\u0114\u008b\2\u05b9\u05b5\3\2\2\2"+
		"\u05b9\u05b7\3\2\2\2\u05ba\u011b\3\2\2\2\u05bb\u05bd\7O\2\2\u05bc\u05be"+
		"\5\u011e\u0090\2\u05bd\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\3"+
		"\2\2\2\u05bf\u05c0\7d\2\2\u05c0\u011d\3\2\2\2\u05c1\u05c7\5\u0120\u0091"+
		"\2\u05c2\u05c3\5\u0120\u0091\2\u05c3\u05c4\7\65\2\2\u05c4\u05c5\5\u011e"+
		"\u0090\2\u05c5\u05c7\3\2\2\2\u05c6\u05c1\3\2\2\2\u05c6\u05c2\3\2\2\2\u05c7"+
		"\u011f\3\2\2\2\u05c8\u05c9\5\u0114\u008b\2\u05c9\u0121\3\2\2\2\u05ca\u05cc"+
		"\5\u0190\u00c9\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3"+
		"\2\2\2\u05cd\u05ce\7;\2\2\u05ce\u05d0\5\u00b8]\2\u05cf\u05d1\5\u011c\u008f"+
		"\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u0123\3\2\2\2\u05d2\u05d3"+
		"\7J\2\2\u05d3\u05d9\5\u018c\u00c7\2\u05d4\u05d5\5\u0114\u008b\2\u05d5"+
		"\u05d6\7/\2\2\u05d6\u05d7\5\u018c\u00c7\2\u05d7\u05d9\3\2\2\2\u05d8\u05d2"+
		"\3\2\2\2\u05d8\u05d4\3\2\2\2\u05d9\u0125\3\2\2\2\u05da\u05db\7J\2\2\u05db"+
		"\u05dc\5\u018c\u00c7\2\u05dc\u0127\3\2\2\2\u05dd\u05de\5\u0114\u008b\2"+
		"\u05de\u05df\7/\2\2\u05df\u05e0\5\u018c\u00c7\2\u05e0\u0129\3\2\2\2\u05e1"+
		"\u05e2\5\u013a\u009e\2\u05e2\u012b\3\2\2\2\u05e3\u05e4\7\17\2\2\u05e4"+
		"\u05e6\5\u012e\u0098\2\u05e5\u05e7\5\u0130\u0099\2\u05e6\u05e5\3\2\2\2"+
		"\u05e6\u05e7\3\2\2\2\u05e7\u012d\3\2\2\2\u05e8\u05e9\5\u01c2\u00e2\2\u05e9"+
		"\u012f\3\2\2\2\u05ea\u05ec\7O\2\2\u05eb\u05ed\5\u0134\u009b\2\u05ec\u05eb"+
		"\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\7d\2\2\u05ef"+
		"\u0131\3\2\2\2\u05f0\u05f2\5\u012c\u0097\2\u05f1\u05f0\3\2\2\2\u05f2\u05f3"+
		"\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u0133\3\2\2\2\u05f5"+
		"\u05f7\5\u0136\u009c\2\u05f6\u05f5\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f6"+
		"\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u0135\3\2\2\2\u05fa\u05fc\7O\2\2\u05fb"+
		"\u05fd\5\u0134\u009b\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe"+
		"\3\2\2\2\u05fe\u060f\7d\2\2\u05ff\u0601\7M\2\2\u0600\u0602\5\u0134\u009b"+
		"\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u060f"+
		"\7c\2\2\u0604\u0606\7L\2\2\u0605\u0607\5\u0134\u009b\2\u0606\u0605\3\2"+
		"\2\2\u0606\u0607\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060f\7b\2\2\u0609"+
		"\u060f\5\u01c2\u00e2\2\u060a\u060f\5\u013a\u009e\2\u060b\u060f\5\u0138"+
		"\u009d\2\u060c\u060f\5\u01c6\u00e4\2\u060d\u060f\5\u01bc\u00df\2\u060e"+
		"\u05fa\3\2\2\2\u060e\u05ff\3\2\2\2\u060e\u0604\3\2\2\2\u060e\u0609\3\2"+
		"\2\2\u060e\u060a\3\2\2\2\u060e\u060b\3\2\2\2\u060e\u060c\3\2\2\2\u060e"+
		"\u060d\3\2\2\2\u060f\u0137\3\2\2\2\u0610\u0611\t\5\2\2\u0611\u0139\3\2"+
		"\2\2\u0612\u0614\5\u013e\u00a0\2\u0613\u0615\5\u0144\u00a3\2\u0614\u0613"+
		"\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u013b\3\2\2\2\u0616\u061b\5\u013a\u009e"+
		"\2\u0617\u0618\7\65\2\2\u0618\u061a\5\u013a\u009e\2\u0619\u0617\3\2\2"+
		"\2\u061a\u061d\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u013d"+
		"\3\2\2\2\u061d\u061b\3\2\2\2\u061e\u061f\5\u01b8\u00dd\2\u061f\u0620\5"+
		"\u013e\u00a0\2\u0620\u0624\3\2\2\2\u0621\u0624\5\u0178\u00bd\2\u0622\u0624"+
		"\5\u0140\u00a1\2\u0623\u061e\3\2\2\2\u0623\u0621\3\2\2\2\u0623\u0622\3"+
		"\2\2\2\u0624\u013f\3\2\2\2\u0625\u0626\7\60\2\2\u0626\u0627\5\u01c2\u00e2"+
		"\2\u0627\u0141\3\2\2\2\u0628\u0629\5\u01b6\u00dc\2\u0629\u062a\5\u013e"+
		"\u00a0\2\u062a\u0633\3\2\2\2\u062b\u062c\5\u0146\u00a4\2\u062c\u062d\5"+
		"\u013e\u00a0\2\u062d\u0633\3\2\2\2\u062e\u062f\5\u0148\u00a5\2\u062f\u0630"+
		"\5\u013e\u00a0\2\u0630\u0633\3\2\2\2\u0631\u0633\5\u014a\u00a6\2\u0632"+
		"\u0628\3\2\2\2\u0632\u062b\3\2\2\2\u0632\u062e\3\2\2\2\u0632\u0631\3\2"+
		"\2\2\u0633\u0143\3\2\2\2\u0634\u0636\5\u0142\u00a2\2\u0635\u0634\3\2\2"+
		"\2\u0636\u0637\3\2\2\2\u0637\u0635\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0145"+
		"\3\2\2\2\u0639\u063a\7=\2\2\u063a\u0147\3\2\2\2\u063b\u063c\7a\2\2\u063c"+
		"\u063d\5\u013a\u009e\2\u063d\u063e\7\64\2\2\u063e\u0149\3\2\2\2\u063f"+
		"\u0640\7J\2\2\u0640\u0647\5\u018c\u00c7\2\u0641\u0642\7/\2\2\u0642\u0647"+
		"\5\u018c\u00c7\2\u0643\u0644\7/\2\2\u0644\u0645\7a\2\2\u0645\u0647\5\u018c"+
		"\u00c7\2\u0646\u063f\3\2\2\2\u0646\u0641\3\2\2\2\u0646\u0643\3\2\2\2\u0647"+
		"\u014b\3\2\2\2\u0648\u064a\5\u01c2\u00e2\2\u0649\u064b\5N(\2\u064a\u0649"+
		"\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u0654\3\2\2\2\u064c\u0654\5\u014e\u00a8"+
		"\2\u064d\u0654\5\u015c\u00af\2\u064e\u0654\5\u015e\u00b0\2\u064f\u0654"+
		"\5\u0166\u00b4\2\u0650\u0654\5\u0170\u00b9\2\u0651\u0654\5\u016e\u00b8"+
		"\2\u0652\u0654\5\u0176\u00bc\2\u0653\u0648\3\2\2\2\u0653\u064c\3\2\2\2"+
		"\u0653\u064d\3\2\2\2\u0653\u064e\3\2\2\2\u0653\u064f\3\2\2\2\u0653\u0650"+
		"\3\2\2\2\u0653\u0651\3\2\2\2\u0653\u0652\3\2\2\2\u0654\u014d\3\2\2\2\u0655"+
		"\u065d\5\u01c6\u00e4\2\u0656\u065d\5\u0150\u00a9\2\u0657\u065d\5\u0156"+
		"\u00ac\2\u0658\u065d\7\22\2\2\u0659\u065d\7\7\2\2\u065a\u065d\7\13\2\2"+
		"\u065b\u065d\7\f\2\2\u065c\u0655\3\2\2\2\u065c\u0656\3\2\2\2\u065c\u0657"+
		"\3\2\2\2\u065c\u0658\3\2\2\2\u065c\u0659\3\2\2\2\u065c\u065a\3\2\2\2\u065c"+
		"\u065b\3\2\2\2\u065d\u014f\3\2\2\2\u065e\u0660\7M\2\2\u065f\u0661\5\u0152"+
		"\u00aa\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0663\7c\2\2\u0663\u0151\3\2\2\2\u0664\u0666\5\u0154\u00ab\2\u0665\u0667"+
		"\7\65\2\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0671\3\2\2\2"+
		"\u0668\u066d\5\u0154\u00ab\2\u0669\u066a\7\65\2\2\u066a\u066c\5\u0154"+
		"\u00ab\2\u066b\u0669\3\2\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d"+
		"\u066e\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u0664\3\2"+
		"\2\2\u0670\u0668\3\2\2\2\u0671\u0153\3\2\2\2\u0672\u0673\5\u013a\u009e"+
		"\2\u0673\u0155\3\2\2\2\u0674\u0675\7M\2\2\u0675\u0676\5\u0158\u00ad\2"+
		"\u0676\u0677\7c\2\2\u0677\u067c\3\2\2\2\u0678\u0679\7M\2\2\u0679\u067a"+
		"\7\64\2\2\u067a\u067c\7c\2\2\u067b\u0674\3\2\2\2\u067b\u0678\3\2\2\2\u067c"+
		"\u0157\3\2\2\2\u067d\u067f\5\u015a\u00ae\2\u067e\u0680\7\65\2\2\u067f"+
		"\u067e\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u068a\3\2\2\2\u0681\u0686\5\u015a"+
		"\u00ae\2\u0682\u0683\7\65\2\2\u0683\u0685\5\u015a\u00ae\2\u0684\u0682"+
		"\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0687\3\2\2\2\u0687"+
		"\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u067d\3\2\2\2\u0689\u0681\3\2"+
		"\2\2\u068a\u0159\3\2\2\2\u068b\u068c\5\u013a\u009e\2\u068c\u068d\7\64"+
		"\2\2\u068d\u068e\5\u013a\u009e\2\u068e\u015b\3\2\2\2\u068f\u069c\7f\2"+
		"\2\u0690\u0691\7f\2\2\u0691\u0692\7;\2\2\u0692\u069c\5\u01c2\u00e2\2\u0693"+
		"\u0694\7f\2\2\u0694\u0695\7M\2\2\u0695\u0696\5\u013a\u009e\2\u0696\u0697"+
		"\7c\2\2\u0697\u069c\3\2\2\2\u0698\u0699\7f\2\2\u0699\u069a\7;\2\2\u069a"+
		"\u069c\7\30\2\2\u069b\u068f\3\2\2\2\u069b\u0690\3\2\2\2\u069b\u0693\3"+
		"\2\2\2\u069b\u0698\3\2\2\2\u069c\u015d\3\2\2\2\u069d\u06a2\5\u0160\u00b1"+
		"\2\u069e\u069f\5\u0162\u00b2\2\u069f\u06a0\5\u0164\u00b3\2\u06a0\u06a2"+
		"\3\2\2\2\u06a1\u069d\3\2\2\2\u06a1\u069e\3\2\2\2\u06a2\u015f\3\2\2\2\u06a3"+
		"\u06a4\7k\2\2\u06a4\u06a5\7;\2\2\u06a5\u06a6\5\u01c2\u00e2\2\u06a6\u0161"+
		"\3\2\2\2\u06a7\u06a8\7k\2\2\u06a8\u06a9\7M\2\2\u06a9\u06aa\5\u013a\u009e"+
		"\2\u06aa\u06ab\7c\2\2\u06ab\u0163\3\2\2\2\u06ac\u06ad\7k\2\2\u06ad\u06ae"+
		"\7;\2\2\u06ae\u06af\7\30\2\2\u06af\u0165\3\2\2\2\u06b0\u06b2\7L\2\2\u06b1"+
		"\u06b3\5\u0168\u00b5\2\u06b2\u06b1\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4"+
		"\3\2\2\2\u06b4\u06b5\5\6\4\2\u06b5\u06b6\7b\2\2\u06b6\u0167\3\2\2\2\u06b7"+
		"\u06b9\5\u009cO\2\u06b8\u06ba\5\u0096L\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba"+
		"\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc\7I\2\2\u06bc\u06d5\3\2\2\2\u06bd"+
		"\u06bf\5\u01c4\u00e3\2\u06be\u06c0\5\u0096L\2\u06bf\u06be\3\2\2\2\u06bf"+
		"\u06c0\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\7I\2\2\u06c2\u06d5\3\2"+
		"\2\2\u06c3\u06c4\5\u016a\u00b6\2\u06c4\u06c6\5\u009cO\2\u06c5\u06c7\5"+
		"\u0096L\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c8\3\2\2\2"+
		"\u06c8\u06c9\7I\2\2\u06c9\u06d5\3\2\2\2\u06ca\u06cb\5\u016a\u00b6\2\u06cb"+
		"\u06cd\5\u01c4\u00e3\2\u06cc\u06ce\5\u0096L\2\u06cd\u06cc\3\2\2\2\u06cd"+
		"\u06ce\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d0\7I\2\2\u06d0\u06d5\3\2"+
		"\2\2\u06d1\u06d2\5\u016a\u00b6\2\u06d2\u06d3\7I\2\2\u06d3\u06d5\3\2\2"+
		"\2\u06d4\u06b7\3\2\2\2\u06d4\u06bd\3\2\2\2\u06d4\u06c3\3\2\2\2\u06d4\u06ca"+
		"\3\2\2\2\u06d4\u06d1\3\2\2\2\u06d5\u0169\3\2\2\2\u06d6\u06d7\7M\2\2\u06d7"+
		"\u06d8\5\u016c\u00b7\2\u06d8\u06d9\5\u013a\u009e\2\u06d9\u06da\7c\2\2"+
		"\u06da\u016b\3\2\2\2\u06db\u06dc\t\6\2\2\u06dc\u016d\3\2\2\2\u06dd\u06de"+
		"\7;\2\2\u06de\u06df\5\u01c2\u00e2\2\u06df\u016f\3\2\2\2\u06e0\u06e2\7"+
		"O\2\2\u06e1\u06e3\5\u0172\u00ba\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2"+
		"\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e5\7d\2\2\u06e5\u0171\3\2\2\2\u06e6"+
		"\u06f0\5\u0174\u00bb\2\u06e7\u06ec\5\u0174\u00bb\2\u06e8\u06e9\7\65\2"+
		"\2\u06e9\u06eb\5\u0174\u00bb\2\u06ea\u06e8\3\2\2\2\u06eb\u06ee\3\2\2\2"+
		"\u06ec\u06ea\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06f0\3\2\2\2\u06ee\u06ec"+
		"\3\2\2\2\u06ef\u06e6\3\2\2\2\u06ef\u06e7\3\2\2\2\u06f0\u0173\3\2\2\2\u06f1"+
		"\u06f7\5\u013a\u009e\2\u06f2\u06f3\5\u01c2\u00e2\2\u06f3\u06f4\7\64\2"+
		"\2\u06f4\u06f5\5\u013a\u009e\2\u06f5\u06f7\3\2\2\2\u06f6\u06f1\3\2\2\2"+
		"\u06f6\u06f2\3\2\2\2\u06f7\u0175\3\2\2\2\u06f8\u06f9\7\r\2\2\u06f9\u0177"+
		"\3\2\2\2\u06fa\u06fb\b\u00bd\1\2\u06fb\u06fc\5\u014c\u00a7\2\u06fc\u070c"+
		"\3\2\2\2\u06fd\u06fe\6\u00bd\3\3\u06fe\u070b\5\u01ba\u00de\2\u06ff\u0708"+
		"\6\u00bd\4\3\u0700\u0709\5\u017a\u00be\2\u0701\u0709\5\u017e\u00c0\2\u0702"+
		"\u0709\5\u0180\u00c1\2\u0703\u0709\5\u0182\u00c2\2\u0704\u0709\5\u0184"+
		"\u00c3\2\u0705\u0709\5\u0186\u00c4\2\u0706\u0709\5\u0188\u00c5\2\u0707"+
		"\u0709\5\u018a\u00c6\2\u0708\u0700\3\2\2\2\u0708\u0701\3\2\2\2\u0708\u0702"+
		"\3\2\2\2\u0708\u0703\3\2\2\2\u0708\u0704\3\2\2\2\u0708\u0705\3\2\2\2\u0708"+
		"\u0706\3\2\2\2\u0708\u0707\3\2\2\2\u0709\u070b\3\2\2\2\u070a\u06fd\3\2"+
		"\2\2\u070a\u06ff\3\2\2\2\u070b\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c"+
		"\u070d\3\2\2\2\u070d\u0179\3\2\2\2\u070e\u070c\3\2\2\2\u070f\u0715\5\u0170"+
		"\u00b9\2\u0710\u0712\5\u0170\u00b9\2\u0711\u0710\3\2\2\2\u0711\u0712\3"+
		"\2\2\2\u0712\u0713\3\2\2\2\u0713\u0715\5\u017c\u00bf\2\u0714\u070f\3\2"+
		"\2\2\u0714\u0711\3\2\2\2\u0715\u017b\3\2\2\2\u0716\u0717\5\u0166\u00b4"+
		"\2\u0717\u017d\3\2\2\2\u0718\u0719\7;\2\2\u0719\u071a\7\30\2\2\u071a\u017f"+
		"\3\2\2\2\u071b\u071c\7;\2\2\u071c\u0723\5\u01c0\u00e1\2\u071d\u071e\7"+
		";\2\2\u071e\u0720\5\u01c2\u00e2\2\u071f\u0721\5N(\2\u0720\u071f\3\2\2"+
		"\2\u0720\u0721\3\2\2\2\u0721\u0723\3\2\2\2\u0722\u071b\3\2\2\2\u0722\u071d"+
		"\3\2\2\2\u0723\u0181\3\2\2\2\u0724\u0725\7;\2\2\u0725\u0726\7f\2\2\u0726"+
		"\u0183\3\2\2\2\u0727\u0728\7;\2\2\u0728\u0729\7\36\2\2\u0729\u0185\3\2"+
		"\2\2\u072a\u072b\7M\2\2\u072b\u072c\5\u013c\u009f\2\u072c\u072d\7c\2\2"+
		"\u072d\u0187\3\2\2\2\u072e\u072f\7@\2\2\u072f\u0189\3\2\2\2\u0730\u0731"+
		"\7a\2\2\u0731\u018b\3\2\2\2\u0732\u0733\b\u00c7\1\2\u0733\u0739\5\u01a0"+
		"\u00d1\2\u0734\u0739\5\u01a2\u00d2\2\u0735\u0739\5\u0190\u00c9\2\u0736"+
		"\u0739\5\u0194\u00cb\2\u0737\u0739\5\u01a8\u00d5\2\u0738\u0732\3\2\2\2"+
		"\u0738\u0734\3\2\2\2\u0738\u0735\3\2\2\2\u0738\u0736\3\2\2\2\u0738\u0737"+
		"\3\2\2\2\u0739\u0749\3\2\2\2\u073a\u073b\6\u00c7\5\3\u073b\u073c\7.\2"+
		"\2\u073c\u0748\5\u018c\u00c7\2\u073d\u073e\6\u00c7\6\3\u073e\u0748\7a"+
		"\2\2\u073f\u0740\6\u00c7\7\3\u0740\u0748\7@\2\2\u0741\u0742\6\u00c7\b"+
		"\3\u0742\u0743\7;\2\2\u0743\u0748\7\5\2\2\u0744\u0745\6\u00c7\t\3\u0745"+
		"\u0746\7;\2\2\u0746\u0748\7\6\2\2\u0747\u073a\3\2\2\2\u0747\u073d\3\2"+
		"\2\2\u0747\u073f\3\2\2\2\u0747\u0741\3\2\2\2\u0747\u0744\3\2\2\2\u0748"+
		"\u074b\3\2\2\2\u0749\u0747\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u018d\3\2"+
		"\2\2\u074b\u0749\3\2\2\2\u074c\u074e\7\64\2\2\u074d\u074f\5\u0132\u009a"+
		"\2\u074e\u074d\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751"+
		"\5\u018c\u00c7\2\u0751\u018f\3\2\2\2\u0752\u0754\5\u0192\u00ca\2\u0753"+
		"\u0755\5N(\2\u0754\u0753\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u075e\3\2\2"+
		"\2\u0756\u0758\5\u0192\u00ca\2\u0757\u0759\5N(\2\u0758\u0757\3\2\2\2\u0758"+
		"\u0759\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075b\7;\2\2\u075b\u075c\5\u0190"+
		"\u00c9\2\u075c\u075e\3\2\2\2\u075d\u0752\3\2\2\2\u075d\u0756\3\2\2\2\u075e"+
		"\u0191\3\2\2\2\u075f\u0760\5\u01c2\u00e2\2\u0760\u0193\3\2\2\2\u0761\u0763"+
		"\7O\2\2\u0762\u0764\5\u0196\u00cc\2\u0763\u0762\3\2\2\2\u0763\u0764\3"+
		"\2\2\2\u0764\u0765\3\2\2\2\u0765\u0766\7d\2\2\u0766\u0195\3\2\2\2\u0767"+
		"\u0769\5\u0198\u00cd\2\u0768\u076a\7\31\2\2\u0769\u0768\3\2\2\2\u0769"+
		"\u076a\3\2\2\2\u076a\u0197\3\2\2\2\u076b\u0770\5\u019a\u00ce\2\u076c\u076d"+
		"\7\65\2\2\u076d\u076f\5\u019a\u00ce\2\u076e\u076c\3\2\2\2\u076f\u0772"+
		"\3\2\2\2\u0770\u076e\3\2\2\2\u0770\u0771\3\2\2\2\u0771\u0199\3\2\2\2\u0772"+
		"\u0770\3\2\2\2\u0773\u0775\5\u0132\u009a\2\u0774\u0773\3\2\2\2\u0774\u0775"+
		"\3\2\2\2\u0775\u0777\3\2\2\2\u0776\u0778\7\t\2\2\u0777\u0776\3\2\2\2\u0777"+
		"\u0778\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u0781\5\u018c\u00c7\2\u077a\u077c"+
		"\7\t\2\2\u077b\u077a\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2\2\u077d"+
		"\u077e\5\u019c\u00cf\2\u077e\u077f\5\u018e\u00c8\2\u077f\u0781\3\2\2\2"+
		"\u0780\u0774\3\2\2\2\u0780\u077b\3\2\2\2\u0781\u019b\3\2\2\2\u0782\u0783"+
		"\5\u01c2\u00e2\2\u0783\u019d\3\2\2\2\u0784\u0785\5\u018c\u00c7\2\u0785"+
		"\u0786\7.\2\2\u0786\u0787\5\u018c\u00c7\2\u0787\u019f\3\2\2\2\u0788\u0789"+
		"\7M\2\2\u0789\u078a\5\u018c\u00c7\2\u078a\u078b\7c\2\2\u078b\u01a1\3\2"+
		"\2\2\u078c\u078d\7M\2\2\u078d\u078e\5\u018c\u00c7\2\u078e\u078f\7\64\2"+
		"\2\u078f\u0790\5\u018c\u00c7\2\u0790\u0791\7c\2\2\u0791\u01a3\3\2\2\2"+
		"\u0792\u0793\5\u018c\u00c7\2\u0793\u0794\7a\2\2\u0794\u01a5\3\2\2\2\u0795"+
		"\u0796\5\u018c\u00c7\2\u0796\u0797\7@\2\2\u0797\u01a7\3\2\2\2\u0798\u0799"+
		"\7`\2\2\u0799\u079b\7P\2\2\u079a\u079c\5\u01aa\u00d6\2\u079b\u079a\3\2"+
		"\2\2\u079b\u079c\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\7E\2\2\u079e"+
		"\u01a9\3\2\2\2\u079f\u07a4\5\u01ac\u00d7\2\u07a0\u07a1\7\65\2\2\u07a1"+
		"\u07a3\5\u01ac\u00d7\2\u07a2\u07a0\3\2\2\2\u07a3\u07a6\3\2\2\2\u07a4\u07a2"+
		"\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u01ab\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a7"+
		"\u07a8\5\u0190\u00c9\2\u07a8\u01ad\3\2\2\2\u07a9\u07aa\5\u018c\u00c7\2"+
		"\u07aa\u07ab\7;\2\2\u07ab\u07ac\7\5\2\2\u07ac\u07b2\3\2\2\2\u07ad\u07ae"+
		"\5\u018c\u00c7\2\u07ae\u07af\7;\2\2\u07af\u07b0\7\6\2\2\u07b0\u07b2\3"+
		"\2\2\2\u07b1\u07a9\3\2\2\2\u07b1\u07ad\3\2\2\2\u07b2\u01af\3\2\2\2\u07b3"+
		"\u07b4\7\64\2\2\u07b4\u07b5\5\u01b4\u00db\2\u07b5\u07b6\7\65\2\2\u07b6"+
		"\u07b7\5\u01b2\u00da\2\u07b7\u07bd\3\2\2\2\u07b8\u07b9\7\64\2\2\u07b9"+
		"\u07bd\5\u01b4\u00db\2\u07ba\u07bb\7\64\2\2\u07bb\u07bd\5\u01b2\u00da"+
		"\2\u07bc\u07b3\3\2\2\2\u07bc\u07b8\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u01b1"+
		"\3\2\2\2\u07be\u07c8\5\u0190\u00c9\2\u07bf\u07c4\5\u0190\u00c9\2\u07c0"+
		"\u07c1\7\65\2\2\u07c1\u07c3\5\u0190\u00c9\2\u07c2\u07c0\3\2\2\2\u07c3"+
		"\u07c6\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c8\3\2"+
		"\2\2\u07c6\u07c4\3\2\2\2\u07c7\u07be\3\2\2\2\u07c7\u07bf\3\2\2\2\u07c8"+
		"\u01b3\3\2\2\2\u07c9\u07ca\7\63\2\2\u07ca\u01b5\3\2\2\2\u07cb\u07cc\5"+
		"\u01bc\u00df\2\u07cc\u01b7\3\2\2\2\u07cd\u07ce\t\7\2\2\u07ce\u01b9\3\2"+
		"\2\2\u07cf\u07d0\t\b\2\2\u07d0\u01bb\3\2\2\2\u07d1\u07df\7=\2\2\u07d2"+
		"\u07df\7@\2\2\u07d3\u07df\7P\2\2\u07d4\u07df\7E\2\2\u07d5\u07df\7@\2\2"+
		"\u07d6\u07df\7;\2\2\u07d7\u07df\7K\2\2\u07d8\u07df\7V\2\2\u07d9\u07df"+
		"\5\u01be\u00e0\2\u07da\u07dc\7u\2\2\u07db\u07dd\7t\2\2\u07dc\u07db\3\2"+
		"\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07df\3\2\2\2\u07de\u07d1\3\2\2\2\u07de"+
		"\u07d2\3\2\2\2\u07de\u07d3\3\2\2\2\u07de\u07d4\3\2\2\2\u07de\u07d5\3\2"+
		"\2\2\u07de\u07d6\3\2\2\2\u07de\u07d7\3\2\2\2\u07de\u07d8\3\2\2\2\u07de"+
		"\u07d9\3\2\2\2\u07de\u07da\3\2\2\2\u07df\u01bd\3\2\2\2\u07e0\u07e1\7,"+
		"\2\2\u07e1\u01bf\3\2\2\2\u07e2\u07e3\7z\2\2\u07e3\u01c1\3\2\2\2\u07e4"+
		"\u07e7\7s\2\2\u07e5\u07e7\5\u0138\u009d\2\u07e6\u07e4\3\2\2\2\u07e6\u07e5"+
		"\3\2\2\2\u07e7\u01c3\3\2\2\2\u07e8\u07ee\5\u01c2\u00e2\2\u07e9\u07ea\5"+
		"\u01c2\u00e2\2\u07ea\u07eb\7\65\2\2\u07eb\u07ec\5\u01c4\u00e3\2\u07ec"+
		"\u07ee\3\2\2\2\u07ed\u07e8\3\2\2\2\u07ed\u07e9\3\2\2\2\u07ee\u01c5\3\2"+
		"\2\2\u07ef\u07f3\5\u01c8\u00e5\2\u07f0\u07f3\7|\2\2\u07f1\u07f3\7}\2\2"+
		"\u07f2\u07ef\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f1\3\2\2\2\u07f3\u01c7"+
		"\3\2\2\2\u07f4\u07f5\t\t\2\2\u07f5\u01c9\3\2\2\2\u00ee\u01cd\u01d4\u01d8"+
		"\u01dc\u01e0\u01e4\u01e8\u01ec\u01ee\u01f3\u01f9\u01fd\u0201\u0205\u020a"+
		"\u020e\u0212\u0215\u0219\u0227\u0230\u0236\u023a\u0240\u0246\u024c\u025a"+
		"\u0262\u0267\u026b\u027c\u0287\u028b\u028f\u0295\u029a\u02a3\u02af\u02b9"+
		"\u02be\u02c8\u02d7\u02ea\u02ef\u02f2\u02f6\u02fb\u02ff\u030a\u030e\u0311"+
		"\u0314\u031e\u0323\u033e\u0342\u0345\u0348\u0351\u035a\u035d\u0363\u0367"+
		"\u0372\u037b\u037e\u0383\u038a\u0393\u0396\u039a\u039f\u03a3\u03ab\u03ae"+
		"\u03bb\u03c1\u03c4\u03ca\u03ce\u03d2\u03da\u03e1\u03e5\u03ec\u03f0\u03f3"+
		"\u03f6\u03f9\u03fe\u0401\u0405\u0408\u040d\u0410\u0413\u0417\u041b\u0421"+
		"\u0424\u0428\u042b\u042e\u0433\u0436\u043a\u0440\u0444\u0447\u0451\u0456"+
		"\u045f\u0469\u046d\u0470\u047a\u047f\u0485\u0488\u048d\u0490\u0498\u049d"+
		"\u04a0\u04a5\u04a8\u04b0\u04b5\u04b8\u04bd\u04c5\u04ce\u04d2\u04dc\u04e2"+
		"\u04ec\u04ef\u04f3\u04f9\u04fc\u0503\u0509\u050e\u0514\u0524\u0527\u052a"+
		"\u0531\u0538\u054b\u0550\u0553\u0579\u057d\u058e\u0593\u0598\u059c\u05a1"+
		"\u05a7\u05ae\u05b9\u05bd\u05c6\u05cb\u05d0\u05d8\u05e6\u05ec\u05f3\u05f8"+
		"\u05fc\u0601\u0606\u060e\u0614\u061b\u0623\u0632\u0637\u0646\u064a\u0653"+
		"\u065c\u0660\u0666\u066d\u0670\u067b\u067f\u0686\u0689\u069b\u06a1\u06b2"+
		"\u06b9\u06bf\u06c6\u06cd\u06d4\u06e2\u06ec\u06ef\u06f6\u0708\u070a\u070c"+
		"\u0711\u0714\u0720\u0722\u0738\u0747\u0749\u074e\u0754\u0758\u075d\u0763"+
		"\u0769\u0770\u0774\u0777\u077b\u0780\u079b\u07a4\u07b1\u07bc\u07c4\u07c7"+
		"\u07dc\u07de\u07e6\u07ed\u07f2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}