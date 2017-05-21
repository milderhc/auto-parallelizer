// Generated from /home/milderhc/Documents/lenguajes/ta/antlr/AutoParallelizer/grammar/CPP.g4 by ANTLR 4.6
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, ID=85, COMMENT=86, LINE_COMMENT=87, 
		WS=88, INT=89, LONG=90, LONGLONG=91, CHAR=92, DOUBLE=93, BOOL=94, STRING=95, 
		MULTILINEMACRO=96, DIRECTIVE=97;
	public static final int
		RULE_cpp = 0, RULE_global = 1, RULE_main = 2, RULE_mainSign = 3, RULE_namespace = 4, 
		RULE_using = 5, RULE_nestedNamespace = 6, RULE_id = 7, RULE_path = 8, 
		RULE_typedef = 9, RULE_datatype = 10, RULE_datatypeDefinition = 11, RULE_template = 12, 
		RULE_function = 13, RULE_functionSign = 14, RULE_functionRem = 15, RULE_functionBody = 16, 
		RULE_parameters = 17, RULE_structClass = 18, RULE_inheritance = 19, RULE_encapsulation = 20, 
		RULE_structClassBody = 21, RULE_globalClass = 22, RULE_classConstructor = 23, 
		RULE_expressionList = 24, RULE_integerType = 25, RULE_floatType = 26, 
		RULE_boolType = 27, RULE_instruction = 28, RULE_scope = 29, RULE_declarationBlock = 30, 
		RULE_declaration = 31, RULE_properDeclaration = 32, RULE_declarationType = 33, 
		RULE_assignmentBlock = 34, RULE_ifBlock = 35, RULE_whileBlock = 36, RULE_doWhileBlock = 37, 
		RULE_doWhileBody = 38, RULE_forBlock = 39, RULE_forExpression = 40, RULE_classicFor = 41, 
		RULE_forEach = 42, RULE_switchBlock = 43, RULE_switchBody = 44, RULE_switchInstruction = 45, 
		RULE_primaryExpression = 46, RULE_controlStructureBody = 47, RULE_assignment = 48, 
		RULE_properAssignment = 49, RULE_expression = 50, RULE_expression2 = 51, 
		RULE_curlyBrackets = 52, RULE_callSomething = 53, RULE_callFunction = 54, 
		RULE_functionArguments = 55, RULE_value = 56, RULE_accessOp = 57, RULE_accessBrackets = 58, 
		RULE_binOp = 59, RULE_assignmentOp = 60, RULE_unOp1 = 61, RULE_unOp2 = 62, 
		RULE_increaseOp = 63;
	public static final String[] ruleNames = {
		"cpp", "global", "main", "mainSign", "namespace", "using", "nestedNamespace", 
		"id", "path", "typedef", "datatype", "datatypeDefinition", "template", 
		"function", "functionSign", "functionRem", "functionBody", "parameters", 
		"structClass", "inheritance", "encapsulation", "structClassBody", "globalClass", 
		"classConstructor", "expressionList", "integerType", "floatType", "boolType", 
		"instruction", "scope", "declarationBlock", "declaration", "properDeclaration", 
		"declarationType", "assignmentBlock", "ifBlock", "whileBlock", "doWhileBlock", 
		"doWhileBody", "forBlock", "forExpression", "classicFor", "forEach", "switchBlock", 
		"switchBody", "switchInstruction", "primaryExpression", "controlStructureBody", 
		"assignment", "properAssignment", "expression", "expression2", "curlyBrackets", 
		"callSomething", "callFunction", "functionArguments", "value", "accessOp", 
		"accessBrackets", "binOp", "assignmentOp", "unOp1", "unOp2", "increaseOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'int'", "'main'", "'('", "')'", "'namespace'", "'{'", "'}'", 
		"'using'", "'::'", "'*'", "'&&'", "'&'", "'/'", "'typedef'", "'const'", 
		"'<'", "','", "'>'", "'unsigned'", "'template'", "'class'", "'typename'", 
		"'inline'", "'void'", "'struct'", "':'", "'private'", "'protected'", "'public'", 
		"'char'", "'short'", "'long'", "'float'", "'double'", "'bool'", "'break'", 
		"'continue'", "'return'", "'static'", "'if'", "'else'", "'while'", "'do'", 
		"'for'", "'auto'", "'switch'", "'default'", "'case'", "'?'", "'['", "']'", 
		"'sizeof'", "'.'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+'", "'-'", 
		"'%'", "'<<'", "'|'", "'^'", "'and'", "'or'", "'xor'", "'||'", "'='", 
		"'+='", "'-='", "'/='", "'*='", "'%='", "'&='", "'|='", "'^='", "'<<='", 
		"'>>='", "'!'", "'~'", "'--'", "'++'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ID", "COMMENT", "LINE_COMMENT", "WS", "INT", "LONG", "LONGLONG", 
		"CHAR", "DOUBLE", "BOOL", "STRING", "MULTILINEMACRO", "DIRECTIVE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CPP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CppContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPPParser.EOF, 0); }
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public CppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitCpp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CppContext cpp() throws RecognitionException {
		CppContext _localctx = new CppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cpp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					global();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(134);
				main();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__39))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
					{
					{
					setState(135);
					global();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalContext extends ParserRuleContext {
		public TypedefContext typedef() {
			return getRuleContext(TypedefContext.class,0);
		}
		public StructClassContext structClass() {
			return getRuleContext(StructClassContext.class,0);
		}
		public AssignmentBlockContext assignmentBlock() {
			return getRuleContext(AssignmentBlockContext.class,0);
		}
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public TerminalNode MULTILINEMACRO() { return getToken(CPPParser.MULTILINEMACRO, 0); }
		public TerminalNode DIRECTIVE() { return getToken(CPPParser.DIRECTIVE, 0); }
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				typedef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				structClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				assignmentBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				declarationBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				namespace();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				using();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				match(MULTILINEMACRO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				match(DIRECTIVE);
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

	public static class MainContext extends ParserRuleContext {
		public MainSignContext mainSign() {
			return getRuleContext(MainSignContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			mainSign();
			setState(158);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainSignContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MainSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainSign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitMainSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainSignContext mainSign() throws RecognitionException {
		MainSignContext _localctx = new MainSignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(160);
				match(T__1);
				}
			}

			setState(163);
			match(T__2);
			setState(164);
			match(T__3);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) || _la==ID) {
				{
				setState(165);
				parameters();
				}
			}

			setState(168);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__5);
			setState(171);
			match(ID);
			setState(172);
			match(T__6);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__39))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
				{
				{
				setState(173);
				global();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingContext extends ParserRuleContext {
		public NestedNamespaceContext nestedNamespace() {
			return getRuleContext(NestedNamespaceContext.class,0);
		}
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__8);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(182);
				match(T__5);
				}
			}

			setState(185);
			nestedNamespace();
			setState(186);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedNamespaceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CPPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPParser.ID, i);
		}
		public NestedNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNamespace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitNestedNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedNamespaceContext nestedNamespace() throws RecognitionException {
		NestedNamespaceContext _localctx = new NestedNamespaceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nestedNamespace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					match(T__9);
					setState(190);
					match(ID);
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class IdContext extends ParserRuleContext {
		public NestedNamespaceContext nestedNamespace() {
			return getRuleContext(NestedNamespaceContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(196);
				match(T__10);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(205);
			nestedNamespace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CPPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPParser.ID, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ID);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(208);
				match(T__13);
				setState(209);
				match(ID);
				}
				}
				setState(214);
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

	public static class TypedefContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitTypedef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__14);
			setState(216);
			datatype();
			setState(217);
			match(ID);
			setState(218);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeDefinitionContext datatypeDefinition() {
			return getRuleContext(DatatypeDefinitionContext.class,0);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(220);
				match(T__15);
				}
			}

			setState(223);
			datatypeDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeDefinitionContext extends ParserRuleContext {
		public NestedNamespaceContext nestedNamespace() {
			return getRuleContext(NestedNamespaceContext.class,0);
		}
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public FloatTypeContext floatType() {
			return getRuleContext(FloatTypeContext.class,0);
		}
		public BoolTypeContext boolType() {
			return getRuleContext(BoolTypeContext.class,0);
		}
		public DatatypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypeDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitDatatypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeDefinitionContext datatypeDefinition() throws RecognitionException {
		DatatypeDefinitionContext _localctx = new DatatypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_datatypeDefinition);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				nestedNamespace();
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(226);
					match(T__16);
					setState(227);
					datatype();
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__17) {
						{
						{
						setState(228);
						match(T__17);
						setState(229);
						datatype();
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(235);
					match(T__18);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(239);
					match(T__19);
					}
				}

				setState(242);
				integerType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				floatType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				boolType();
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

	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__20);
			setState(248);
			match(T__16);
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
			match(ID);
			setState(251);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionSignContext functionSign() {
			return getRuleContext(FunctionSignContext.class,0);
		}
		public FunctionRemContext functionRem() {
			return getRuleContext(FunctionRemContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			functionSign();
			setState(254);
			functionRem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunctionSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignContext functionSign() throws RecognitionException {
		FunctionSignContext _localctx = new FunctionSignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(256);
				template();
				}
			}

			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(259);
				match(T__23);
				}
			}

			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__15:
			case T__19:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case ID:
				{
				setState(262);
				datatype();
				}
				break;
			case T__24:
				{
				setState(263);
				match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(266);
			id();
			setState(267);
			match(T__3);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) || _la==ID) {
				{
				setState(268);
				parameters();
				}
			}

			setState(271);
			match(T__4);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(272);
				match(T__15);
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

	public static class FunctionRemContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionRemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionRem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunctionRem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionRemContext functionRem() throws RecognitionException {
		FunctionRemContext _localctx = new FunctionRemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionRem);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				functionBody();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__0);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__6);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				{
				setState(280);
				instruction();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public List<ProperDeclarationContext> properDeclaration() {
			return getRuleContexts(ProperDeclarationContext.class);
		}
		public ProperDeclarationContext properDeclaration(int i) {
			return getRuleContext(ProperDeclarationContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			datatype();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) || _la==ID) {
				{
				setState(289);
				properDeclaration();
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(292);
				match(T__17);
				setState(293);
				datatype();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) || _la==ID) {
					{
					setState(294);
					properDeclaration();
					}
				}

				}
				}
				setState(301);
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

	public static class StructClassContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CPPParser.ID, 0); }
		public StructClassBodyContext structClassBody() {
			return getRuleContext(StructClassBodyContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public StructClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structClass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitStructClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructClassContext structClass() throws RecognitionException {
		StructClassContext _localctx = new StructClassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(302);
				template();
				}
			}

			setState(305);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(306);
			match(ID);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(307);
				inheritance();
				}
			}

			setState(310);
			structClassBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CPPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPParser.ID, i);
		}
		public List<EncapsulationContext> encapsulation() {
			return getRuleContexts(EncapsulationContext.class);
		}
		public EncapsulationContext encapsulation(int i) {
			return getRuleContext(EncapsulationContext.class,i);
		}
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
		}
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inheritance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(T__26);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				setState(313);
				encapsulation();
				}
			}

			setState(316);
			match(ID);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(317);
				match(T__16);
				setState(318);
				datatype();
				setState(319);
				match(T__18);
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(323);
				match(T__17);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
					{
					setState(324);
					encapsulation();
					}
				}

				setState(327);
				match(ID);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(328);
					match(T__16);
					setState(329);
					datatype();
					setState(330);
					match(T__18);
					}
				}

				}
				}
				setState(338);
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

	public static class EncapsulationContext extends ParserRuleContext {
		public EncapsulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encapsulation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitEncapsulation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncapsulationContext encapsulation() throws RecognitionException {
		EncapsulationContext _localctx = new EncapsulationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_encapsulation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StructClassBodyContext extends ParserRuleContext {
		public List<GlobalClassContext> globalClass() {
			return getRuleContexts(GlobalClassContext.class);
		}
		public GlobalClassContext globalClass(int i) {
			return getRuleContext(GlobalClassContext.class,i);
		}
		public List<ProperDeclarationContext> properDeclaration() {
			return getRuleContexts(ProperDeclarationContext.class);
		}
		public ProperDeclarationContext properDeclaration(int i) {
			return getRuleContext(ProperDeclarationContext.class,i);
		}
		public StructClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structClassBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitStructClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructClassBodyContext structClassBody() throws RecognitionException {
		StructClassBodyContext _localctx = new StructClassBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structClassBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__6);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__39))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
				{
				{
				setState(342);
				globalClass();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(T__7);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) || _la==ID) {
				{
				setState(349);
				properDeclaration();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(350);
					match(T__17);
					setState(351);
					properDeclaration();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(359);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalClassContext extends ParserRuleContext {
		public EncapsulationContext encapsulation() {
			return getRuleContext(EncapsulationContext.class,0);
		}
		public ClassConstructorContext classConstructor() {
			return getRuleContext(ClassConstructorContext.class,0);
		}
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public GlobalClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalClass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitGlobalClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalClassContext globalClass() throws RecognitionException {
		GlobalClassContext _localctx = new GlobalClassContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_globalClass);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				encapsulation();
				setState(362);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				classConstructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				global();
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

	public static class ClassConstructorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CPPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CPPParser.ID, i);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitClassConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ID);
			setState(369);
			match(T__3);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) || _la==ID) {
				{
				setState(370);
				parameters();
				}
			}

			setState(373);
			match(T__4);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(374);
				match(T__26);
				setState(375);
				match(ID);
				setState(376);
				match(T__3);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(377);
					expressionList();
					}
				}

				setState(380);
				match(T__4);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(381);
					match(T__17);
					setState(382);
					match(ID);
					setState(383);
					match(T__3);
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
						{
						setState(384);
						expressionList();
						}
					}

					setState(387);
					match(T__4);
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(395);
			scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			expression(0);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(398);
				match(T__17);
				setState(399);
				expression(0);
				}
				}
				setState(404);
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

	public static class IntegerTypeContext extends ParserRuleContext {
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integerType);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(T__32);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				match(T__32);
				setState(410);
				match(T__32);
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

	public static class FloatTypeContext extends ParserRuleContext {
		public FloatTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatTypeContext floatType() throws RecognitionException {
		FloatTypeContext _localctx = new FloatTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_floatType);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(T__34);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(T__32);
				setState(416);
				match(T__34);
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

	public static class BoolTypeContext extends ParserRuleContext {
		public BoolTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolTypeContext boolType() throws RecognitionException {
		BoolTypeContext _localctx = new BoolTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__35);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public AssignmentBlockContext assignmentBlock() {
			return getRuleContext(AssignmentBlockContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public DoWhileBlockContext doWhileBlock() {
			return getRuleContext(DoWhileBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public CallSomethingContext callSomething() {
			return getRuleContext(CallSomethingContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_instruction);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				declarationBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				assignmentBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				ifBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				whileBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				doWhileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				forBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				switchBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				callSomething();
				setState(429);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(431);
				scope();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(432);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(433);
				match(T__36);
				setState(434);
				match(T__0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(435);
				match(T__37);
				setState(436);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(437);
				match(T__38);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(438);
					expression(0);
					}
				}

				setState(441);
				match(T__0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(442);
				expression(0);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(443);
					match(T__17);
					setState(444);
					expression(0);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				match(T__0);
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

	public static class ScopeContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__6);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				{
				setState(455);
				instruction();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationBlockContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationBlockContext declarationBlock() throws RecognitionException {
		DeclarationBlockContext _localctx = new DeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(463);
				match(T__15);
				}
				break;
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(466);
				match(T__39);
				}
			}

			setState(469);
			declaration();
			setState(470);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ProperDeclarationContext properDeclaration() {
			return getRuleContext(ProperDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			datatype();
			setState(473);
			properDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProperDeclarationContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<DeclarationTypeContext> declarationType() {
			return getRuleContexts(DeclarationTypeContext.class);
		}
		public DeclarationTypeContext declarationType(int i) {
			return getRuleContext(DeclarationTypeContext.class,i);
		}
		public ProperDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitProperDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProperDeclarationContext properDeclaration() throws RecognitionException {
		ProperDeclarationContext _localctx = new ProperDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_properDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			id();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__50 || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__76 - 70)) | (1L << (T__77 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)))) != 0)) {
				{
				setState(476);
				declarationType();
				}
			}

			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					match(T__17);
					setState(480);
					id();
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3 || _la==T__50 || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__76 - 70)) | (1L << (T__77 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)))) != 0)) {
						{
						setState(481);
						declarationType();
						}
					}

					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	public static class DeclarationTypeContext extends ParserRuleContext {
		public ProperAssignmentContext properAssignment() {
			return getRuleContext(ProperAssignmentContext.class,0);
		}
		public List<AccessBracketsContext> accessBrackets() {
			return getRuleContexts(AccessBracketsContext.class);
		}
		public AccessBracketsContext accessBrackets(int i) {
			return getRuleContext(AccessBracketsContext.class,i);
		}
		public DeclarationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitDeclarationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationTypeContext declarationType() throws RecognitionException {
		DeclarationTypeContext _localctx = new DeclarationTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declarationType);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				properAssignment();
				}
				break;
			case T__3:
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(490);
					accessBrackets();
					}
					}
					setState(493); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==T__50 );
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

	public static class AssignmentBlockContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitAssignmentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentBlockContext assignmentBlock() throws RecognitionException {
		AssignmentBlockContext _localctx = new AssignmentBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignmentBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			assignment();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(498);
				match(T__17);
				setState(499);
				assignment();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ControlStructureBodyContext> controlStructureBody() {
			return getRuleContexts(ControlStructureBodyContext.class);
		}
		public ControlStructureBodyContext controlStructureBody(int i) {
			return getRuleContext(ControlStructureBodyContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T__40);
			setState(508);
			match(T__3);
			setState(509);
			expression(0);
			setState(510);
			match(T__4);
			setState(511);
			controlStructureBody();
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(512);
				match(T__41);
				setState(513);
				controlStructureBody();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T__42);
			setState(517);
			match(T__3);
			setState(518);
			expression(0);
			setState(519);
			match(T__4);
			setState(520);
			controlStructureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileBlockContext extends ParserRuleContext {
		public DoWhileBodyContext doWhileBody() {
			return getRuleContext(DoWhileBodyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitDoWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__43);
			setState(523);
			doWhileBody();
			setState(524);
			match(T__42);
			setState(525);
			match(T__3);
			setState(526);
			expression(0);
			setState(527);
			match(T__4);
			setState(528);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileBodyContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DoWhileBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitDoWhileBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileBodyContext doWhileBody() throws RecognitionException {
		DoWhileBodyContext _localctx = new DoWhileBodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_doWhileBody);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				instruction();
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

	public static class ForBlockContext extends ParserRuleContext {
		public ControlStructureBodyContext controlStructureBody() {
			return getRuleContext(ControlStructureBodyContext.class,0);
		}
		public ClassicForContext classicFor() {
			return getRuleContext(ClassicForContext.class,0);
		}
		public ForEachContext forEach() {
			return getRuleContext(ForEachContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(T__44);
			setState(535);
			match(T__3);
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(536);
				classicFor();
				}
				break;
			case 2:
				{
				setState(537);
				forEach();
				}
				break;
			}
			setState(540);
			match(T__4);
			setState(541);
			controlStructureBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			primaryExpression();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(544);
				match(T__17);
				setState(545);
				primaryExpression();
				}
				}
				setState(550);
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

	public static class ClassicForContext extends ParserRuleContext {
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassicForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicFor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitClassicFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassicForContext classicFor() throws RecognitionException {
		ClassicForContext _localctx = new ClassicForContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classicFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(551);
				forExpression();
				}
			}

			setState(554);
			match(T__0);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(555);
				expression(0);
				}
			}

			setState(558);
			match(T__0);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(559);
				forExpression();
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

	public static class ForEachContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CallSomethingContext callSomething() {
			return getRuleContext(CallSomethingContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ForEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEach; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitForEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachContext forEach() throws RecognitionException {
		ForEachContext _localctx = new ForEachContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(562);
				match(T__15);
				}
				break;
			}
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				{
				setState(565);
				match(T__45);
				}
				break;
			case T__1:
			case T__15:
			case T__19:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case ID:
				{
				setState(566);
				datatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(569);
			id();
			setState(570);
			match(T__26);
			setState(571);
			callSomething();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_switchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__46);
			setState(574);
			match(T__3);
			setState(575);
			primaryExpression();
			setState(576);
			match(T__4);
			setState(577);
			switchBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBodyContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<SwitchInstructionContext> switchInstruction() {
			return getRuleContexts(SwitchInstructionContext.class);
		}
		public SwitchInstructionContext switchInstruction(int i) {
			return getRuleContext(SwitchInstructionContext.class,i);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitSwitchBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switchBody);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(T__6);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					{
					setState(581);
					switchInstruction();
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(587);
					match(T__47);
					setState(588);
					match(T__26);
					setState(590); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(589);
						instruction();
						}
						}
						setState(592); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0) );
					}
				}

				setState(596);
				match(T__7);
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

	public static class SwitchInstructionContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SwitchInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchInstruction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitSwitchInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchInstructionContext switchInstruction() throws RecognitionException {
		SwitchInstructionContext _localctx = new SwitchInstructionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_switchInstruction);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(T__48);
				setState(601);
				primaryExpression();
				setState(602);
				match(T__26);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				match(T__36);
				setState(605);
				match(T__0);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_primaryExpression);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				declaration();
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

	public static class ControlStructureBodyContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public ControlStructureBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructureBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitControlStructureBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStructureBodyContext controlStructureBody() throws RecognitionException {
		ControlStructureBodyContext _localctx = new ControlStructureBodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_controlStructureBody);
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				match(T__0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public CallSomethingContext callSomething() {
			return getRuleContext(CallSomethingContext.class,0);
		}
		public ProperAssignmentContext properAssignment() {
			return getRuleContext(ProperAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			callSomething();
			setState(619);
			properAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProperAssignmentContext extends ParserRuleContext {
		public List<AssignmentOpContext> assignmentOp() {
			return getRuleContexts(AssignmentOpContext.class);
		}
		public AssignmentOpContext assignmentOp(int i) {
			return getRuleContext(AssignmentOpContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CallSomethingContext> callSomething() {
			return getRuleContexts(CallSomethingContext.class);
		}
		public CallSomethingContext callSomething(int i) {
			return getRuleContext(CallSomethingContext.class,i);
		}
		public ProperAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitProperAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProperAssignmentContext properAssignment() throws RecognitionException {
		ProperAssignmentContext _localctx = new ProperAssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_properAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					assignmentOp();
					setState(622);
					callSomething();
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(629);
			assignmentOp();
			setState(630);
			expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public UnOp1Context unOp1() {
			return getRuleContext(UnOp1Context.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnOp2Context unOp2() {
			return getRuleContext(UnOp2Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(633);
				assignment();
				}
				break;
			case 2:
				{
				setState(634);
				unOp1();
				setState(635);
				expression(4);
				}
				break;
			case 3:
				{
				setState(637);
				unOp2();
				setState(638);
				expression2();
				}
				break;
			case 4:
				{
				setState(640);
				expression2();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(653);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(643);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(644);
						binOp();
						setState(645);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(647);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(648);
						match(T__49);
						setState(649);
						expression(0);
						setState(650);
						match(T__26);
						setState(651);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	public static class Expression2Context extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallSomethingContext callSomething() {
			return getRuleContext(CallSomethingContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CurlyBracketsContext curlyBrackets() {
			return getRuleContext(CurlyBracketsContext.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_expression2);
		int _la;
		try {
			int _alt;
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(T__3);
				setState(659);
				expression(0);
				setState(660);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				callSomething();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				datatype();
				setState(669);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(664);
					match(T__3);
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
						{
						setState(665);
						functionArguments();
						}
					}

					setState(668);
					match(T__4);
					}
					break;
				}
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(671);
						match(T__50);
						setState(672);
						expression(0);
						setState(673);
						match(T__51);
						}
						} 
					}
					setState(679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(680);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(681);
				match(T__52);
				setState(682);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(683);
				match(T__3);
				setState(684);
				datatype();
				setState(685);
				match(T__4);
				setState(686);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(688);
				match(T__6);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(689);
					curlyBrackets();
					}
				}

				setState(692);
				match(T__7);
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

	public static class CurlyBracketsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CurlyBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curlyBrackets; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitCurlyBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurlyBracketsContext curlyBrackets() throws RecognitionException {
		CurlyBracketsContext _localctx = new CurlyBracketsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_curlyBrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			expression(0);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(696);
				match(T__17);
				setState(697);
				expression(0);
				}
				}
				setState(702);
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

	public static class CallSomethingContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public AccessOpContext accessOp() {
			return getRuleContext(AccessOpContext.class,0);
		}
		public CallSomethingContext callSomething() {
			return getRuleContext(CallSomethingContext.class,0);
		}
		public List<AccessBracketsContext> accessBrackets() {
			return getRuleContexts(AccessBracketsContext.class);
		}
		public AccessBracketsContext accessBrackets(int i) {
			return getRuleContext(AccessBracketsContext.class,i);
		}
		public IncreaseOpContext increaseOp() {
			return getRuleContext(IncreaseOpContext.class,0);
		}
		public CallSomethingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSomething; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitCallSomething(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSomethingContext callSomething() throws RecognitionException {
		CallSomethingContext _localctx = new CallSomethingContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_callSomething);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			id();
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(704);
				callFunction();
				}
				break;
			}
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3 || _la==T__50) {
					{
					{
					setState(707);
					accessBrackets();
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(713);
				accessOp();
				setState(714);
				callSomething();
				}
				break;
			}
			setState(721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(718);
					accessBrackets();
					}
					} 
				}
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(724);
				increaseOp();
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

	public static class CallFunctionContext extends ParserRuleContext {
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(T__3);
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(728);
				functionArguments();
				}
			}

			setState(731);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			expression(0);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(734);
				match(T__17);
				setState(735);
				expression(0);
				}
				}
				setState(740);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CPPParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CPPParser.LONG, 0); }
		public TerminalNode LONGLONG() { return getToken(CPPParser.LONGLONG, 0); }
		public TerminalNode CHAR() { return getToken(CPPParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(CPPParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(CPPParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(CPPParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (INT - 89)) | (1L << (LONG - 89)) | (1L << (LONGLONG - 89)) | (1L << (CHAR - 89)) | (1L << (DOUBLE - 89)) | (1L << (BOOL - 89)) | (1L << (STRING - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AccessOpContext extends ParserRuleContext {
		public AccessOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitAccessOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessOpContext accessOp() throws RecognitionException {
		AccessOpContext _localctx = new AccessOpContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_accessOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AccessBracketsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AccessBracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessBrackets; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitAccessBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessBracketsContext accessBrackets() throws RecognitionException {
		AccessBracketsContext _localctx = new AccessBracketsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_accessBrackets);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(T__50);
				setState(746);
				expression(0);
				setState(747);
				match(T__51);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				match(T__3);
				setState(750);
				expression(0);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(751);
					match(T__17);
					setState(752);
					expression(0);
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(758);
				match(T__4);
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

	public static class BinOpContext extends ParserRuleContext {
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_binOp);
		int _la;
		try {
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				match(T__56);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				match(T__16);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(765);
				match(T__18);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(766);
					match(T__18);
					}
				}

				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 5);
				{
				setState(769);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 6);
				{
				setState(770);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 7);
				{
				setState(771);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 8);
				{
				setState(772);
				match(T__60);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 9);
				{
				setState(773);
				match(T__10);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 10);
				{
				setState(774);
				match(T__13);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 11);
				{
				setState(775);
				match(T__61);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 12);
				{
				setState(776);
				match(T__62);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 13);
				{
				setState(777);
				match(T__12);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 14);
				{
				setState(778);
				match(T__63);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 15);
				{
				setState(779);
				match(T__64);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 16);
				{
				setState(780);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 17);
				{
				setState(781);
				match(T__66);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 18);
				{
				setState(782);
				match(T__67);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 19);
				{
				setState(783);
				match(T__11);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 20);
				{
				setState(784);
				match(T__68);
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

	public static class AssignmentOpContext extends ParserRuleContext {
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitAssignmentOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assignmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__76 - 70)) | (1L << (T__77 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnOp1Context extends ParserRuleContext {
		public UnOp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unOp1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitUnOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnOp1Context unOp1() throws RecognitionException {
		UnOp1Context _localctx = new UnOp1Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_unOp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_la = _input.LA(1);
			if ( !(_la==T__80 || _la==T__81) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UnOp2Context extends ParserRuleContext {
		public IncreaseOpContext increaseOp() {
			return getRuleContext(IncreaseOpContext.class,0);
		}
		public UnOp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unOp2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitUnOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnOp2Context unOp2() throws RecognitionException {
		UnOp2Context _localctx = new UnOp2Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_unOp2);
		try {
			setState(794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(T__60);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(T__59);
				}
				break;
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				increaseOp();
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

	public static class IncreaseOpContext extends ParserRuleContext {
		public IncreaseOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increaseOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitIncreaseOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncreaseOpContext increaseOp() throws RecognitionException {
		IncreaseOpContext _localctx = new IncreaseOpContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_increaseOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_la = _input.LA(1);
			if ( !(_la==T__82 || _la==T__83) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 50:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3c\u0321\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\3\2"+
		"\7\2\u008b\n\2\f\2\16\2\u008e\13\2\5\2\u0090\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u009e\n\3\3\4\3\4\3\4\3\5\5\5\u00a4\n\5"+
		"\3\5\3\5\3\5\5\5\u00a9\n\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00b1\n\6\f\6\16"+
		"\6\u00b4\13\6\3\6\3\6\3\7\3\7\5\7\u00ba\n\7\3\7\3\7\3\7\3\b\3\b\3\b\7"+
		"\b\u00c2\n\b\f\b\16\b\u00c5\13\b\3\t\7\t\u00c8\n\t\f\t\16\t\u00cb\13\t"+
		"\3\t\5\t\u00ce\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u00d5\n\n\f\n\16\n\u00d8\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\5\f\u00e0\n\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00e9\n\r\f\r\16\r\u00ec\13\r\3\r\3\r\5\r\u00f0\n\r\3\r\5\r\u00f3"+
		"\n\r\3\r\3\r\3\r\5\r\u00f8\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\5\20\u0104\n\20\3\20\5\20\u0107\n\20\3\20\3\20\5\20\u010b\n"+
		"\20\3\20\3\20\3\20\5\20\u0110\n\20\3\20\3\20\5\20\u0114\n\20\3\21\3\21"+
		"\5\21\u0118\n\21\3\22\3\22\7\22\u011c\n\22\f\22\16\22\u011f\13\22\3\22"+
		"\3\22\3\23\3\23\5\23\u0125\n\23\3\23\3\23\3\23\5\23\u012a\n\23\7\23\u012c"+
		"\n\23\f\23\16\23\u012f\13\23\3\24\5\24\u0132\n\24\3\24\3\24\3\24\5\24"+
		"\u0137\n\24\3\24\3\24\3\25\3\25\5\25\u013d\n\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0144\n\25\3\25\3\25\5\25\u0148\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u014f\n\25\7\25\u0151\n\25\f\25\16\25\u0154\13\25\3\26\3\26\3\27"+
		"\3\27\7\27\u015a\n\27\f\27\16\27\u015d\13\27\3\27\3\27\3\27\3\27\7\27"+
		"\u0163\n\27\f\27\16\27\u0166\13\27\5\27\u0168\n\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0171\n\30\3\31\3\31\3\31\5\31\u0176\n\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u017d\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0184"+
		"\n\31\3\31\7\31\u0187\n\31\f\31\16\31\u018a\13\31\5\31\u018c\n\31\3\31"+
		"\3\31\3\32\3\32\3\32\7\32\u0193\n\32\f\32\16\32\u0196\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u019e\n\33\3\34\3\34\3\34\3\34\5\34\u01a4\n"+
		"\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01ba\n\36\3\36\3\36\3\36\3\36"+
		"\7\36\u01c0\n\36\f\36\16\36\u01c3\13\36\3\36\3\36\5\36\u01c7\n\36\3\37"+
		"\3\37\7\37\u01cb\n\37\f\37\16\37\u01ce\13\37\3\37\3\37\3 \5 \u01d3\n "+
		"\3 \5 \u01d6\n \3 \3 \3 \3!\3!\3!\3\"\3\"\5\"\u01e0\n\"\3\"\3\"\3\"\5"+
		"\"\u01e5\n\"\7\"\u01e7\n\"\f\"\16\"\u01ea\13\"\3#\3#\6#\u01ee\n#\r#\16"+
		"#\u01ef\5#\u01f2\n#\3$\3$\3$\7$\u01f7\n$\f$\16$\u01fa\13$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u0205\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\5(\u0217\n(\3)\3)\3)\3)\5)\u021d\n)\3)\3)\3)\3*\3*\3*\7"+
		"*\u0225\n*\f*\16*\u0228\13*\3+\5+\u022b\n+\3+\3+\5+\u022f\n+\3+\3+\5+"+
		"\u0233\n+\3,\5,\u0236\n,\3,\3,\5,\u023a\n,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3-\3.\3.\3.\7.\u0249\n.\f.\16.\u024c\13.\3.\3.\3.\6.\u0251\n.\r.\16."+
		"\u0252\5.\u0255\n.\3.\5.\u0258\n.\3/\3/\3/\3/\3/\3/\3/\5/\u0261\n/\3\60"+
		"\3\60\3\60\5\60\u0266\n\60\3\61\3\61\3\61\5\61\u026b\n\61\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\7\63\u0273\n\63\f\63\16\63\u0276\13\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0284\n\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0290\n\64\f\64\16"+
		"\64\u0293\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u029d\n\65"+
		"\3\65\5\65\u02a0\n\65\3\65\3\65\3\65\3\65\7\65\u02a6\n\65\f\65\16\65\u02a9"+
		"\13\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u02b5\n"+
		"\65\3\65\5\65\u02b8\n\65\3\66\3\66\3\66\7\66\u02bd\n\66\f\66\16\66\u02c0"+
		"\13\66\3\67\3\67\5\67\u02c4\n\67\3\67\7\67\u02c7\n\67\f\67\16\67\u02ca"+
		"\13\67\3\67\3\67\3\67\5\67\u02cf\n\67\3\67\7\67\u02d2\n\67\f\67\16\67"+
		"\u02d5\13\67\3\67\5\67\u02d8\n\67\38\38\58\u02dc\n8\38\38\39\39\39\79"+
		"\u02e3\n9\f9\169\u02e6\139\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\7<\u02f4"+
		"\n<\f<\16<\u02f7\13<\3<\3<\5<\u02fb\n<\3=\3=\3=\3=\3=\5=\u0302\n=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0314\n=\3>\3>\3?\3?\3"+
		"@\3@\3@\5@\u031d\n@\3A\3A\3A\2\3fB\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2"+
		"\13\3\2\16\17\3\2\30\31\4\2\30\30\34\34\3\2\36 \3\2[a\3\289\3\2HR\3\2"+
		"ST\3\2UV\u0378\2\u0085\3\2\2\2\4\u009d\3\2\2\2\6\u009f\3\2\2\2\b\u00a3"+
		"\3\2\2\2\n\u00ac\3\2\2\2\f\u00b7\3\2\2\2\16\u00be\3\2\2\2\20\u00c9\3\2"+
		"\2\2\22\u00d1\3\2\2\2\24\u00d9\3\2\2\2\26\u00df\3\2\2\2\30\u00f7\3\2\2"+
		"\2\32\u00f9\3\2\2\2\34\u00ff\3\2\2\2\36\u0103\3\2\2\2 \u0117\3\2\2\2\""+
		"\u0119\3\2\2\2$\u0122\3\2\2\2&\u0131\3\2\2\2(\u013a\3\2\2\2*\u0155\3\2"+
		"\2\2,\u0157\3\2\2\2.\u0170\3\2\2\2\60\u0172\3\2\2\2\62\u018f\3\2\2\2\64"+
		"\u019d\3\2\2\2\66\u01a3\3\2\2\28\u01a5\3\2\2\2:\u01c6\3\2\2\2<\u01c8\3"+
		"\2\2\2>\u01d2\3\2\2\2@\u01da\3\2\2\2B\u01dd\3\2\2\2D\u01f1\3\2\2\2F\u01f3"+
		"\3\2\2\2H\u01fd\3\2\2\2J\u0206\3\2\2\2L\u020c\3\2\2\2N\u0216\3\2\2\2P"+
		"\u0218\3\2\2\2R\u0221\3\2\2\2T\u022a\3\2\2\2V\u0235\3\2\2\2X\u023f\3\2"+
		"\2\2Z\u0257\3\2\2\2\\\u0260\3\2\2\2^\u0265\3\2\2\2`\u026a\3\2\2\2b\u026c"+
		"\3\2\2\2d\u0274\3\2\2\2f\u0283\3\2\2\2h\u02b7\3\2\2\2j\u02b9\3\2\2\2l"+
		"\u02c1\3\2\2\2n\u02d9\3\2\2\2p\u02df\3\2\2\2r\u02e7\3\2\2\2t\u02e9\3\2"+
		"\2\2v\u02fa\3\2\2\2x\u0313\3\2\2\2z\u0315\3\2\2\2|\u0317\3\2\2\2~\u031c"+
		"\3\2\2\2\u0080\u031e\3\2\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008f\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u008c\5\6\4\2\u0089\u008b\5\4\3\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0088\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\2\2\3\u0092\3\3\2\2\2"+
		"\u0093\u009e\5\24\13\2\u0094\u009e\5&\24\2\u0095\u009e\5F$\2\u0096\u009e"+
		"\5> \2\u0097\u009e\5\34\17\2\u0098\u009e\5\n\6\2\u0099\u009e\5\f\7\2\u009a"+
		"\u009e\7\3\2\2\u009b\u009e\7b\2\2\u009c\u009e\7c\2\2\u009d\u0093\3\2\2"+
		"\2\u009d\u0094\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0097"+
		"\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\5\3\2\2\2\u009f\u00a0\5\b\5\2"+
		"\u00a0\u00a1\5\"\22\2\u00a1\7\3\2\2\2\u00a2\u00a4\7\4\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6"+
		"\u00a8\7\6\2\2\u00a7\u00a9\5$\23\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab\t\3\2\2\2\u00ac\u00ad"+
		"\7\b\2\2\u00ad\u00ae\7W\2\2\u00ae\u00b2\7\t\2\2\u00af\u00b1\5\4\3\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\n\2\2\u00b6"+
		"\13\3\2\2\2\u00b7\u00b9\7\13\2\2\u00b8\u00ba\7\b\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5\16\b\2\u00bc"+
		"\u00bd\7\3\2\2\u00bd\r\3\2\2\2\u00be\u00c3\7W\2\2\u00bf\u00c0\7\f\2\2"+
		"\u00c0\u00c2\7W\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\17\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c8\7\r\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00ce\t\2\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\5\16\b\2\u00d0\21\3\2\2\2\u00d1\u00d6\7W\2\2\u00d2\u00d3"+
		"\7\20\2\2\u00d3\u00d5\7W\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\23\3\2\2\2\u00d8\u00d6\3\2\2"+
		"\2\u00d9\u00da\7\21\2\2\u00da\u00db\5\26\f\2\u00db\u00dc\7W\2\2\u00dc"+
		"\u00dd\7\3\2\2\u00dd\25\3\2\2\2\u00de\u00e0\7\22\2\2\u00df\u00de\3\2\2"+
		"\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\5\30\r\2\u00e2"+
		"\27\3\2\2\2\u00e3\u00ef\5\16\b\2\u00e4\u00e5\7\23\2\2\u00e5\u00ea\5\26"+
		"\f\2\u00e6\u00e7\7\24\2\2\u00e7\u00e9\5\26\f\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\25\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00e4\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f8\3\2\2\2\u00f1\u00f3\7\26"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f8\5\64\33\2\u00f5\u00f8\5\66\34\2\u00f6\u00f8\58\35\2\u00f7\u00e3"+
		"\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\31\3\2\2\2\u00f9\u00fa\7\27\2\2\u00fa\u00fb\7\23\2\2\u00fb\u00fc\t\3"+
		"\2\2\u00fc\u00fd\7W\2\2\u00fd\u00fe\7\25\2\2\u00fe\33\3\2\2\2\u00ff\u0100"+
		"\5\36\20\2\u0100\u0101\5 \21\2\u0101\35\3\2\2\2\u0102\u0104\5\32\16\2"+
		"\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107"+
		"\7\32\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2"+
		"\u0108\u010b\5\26\f\2\u0109\u010b\7\33\2\2\u010a\u0108\3\2\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5\20\t\2\u010d\u010f\7\6\2\2"+
		"\u010e\u0110\5$\23\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0113\7\7\2\2\u0112\u0114\7\22\2\2\u0113\u0112\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114\37\3\2\2\2\u0115\u0118\5\"\22\2\u0116\u0118"+
		"\7\3\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118!\3\2\2\2\u0119"+
		"\u011d\7\t\2\2\u011a\u011c\5:\36\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\7\n\2\2\u0121#\3\2\2\2\u0122\u0124\5\26\f\2"+
		"\u0123\u0125\5B\"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012d"+
		"\3\2\2\2\u0126\u0127\7\24\2\2\u0127\u0129\5\26\f\2\u0128\u012a\5B\"\2"+
		"\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0126"+
		"\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"%\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\5\32\16\2\u0131\u0130\3\2\2"+
		"\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\t\4\2\2\u0134\u0136"+
		"\7W\2\2\u0135\u0137\5(\25\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\5,\27\2\u0139\'\3\2\2\2\u013a\u013c\7\35\2"+
		"\2\u013b\u013d\5*\26\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u0143\7W\2\2\u013f\u0140\7\23\2\2\u0140\u0141\5\26\f\2"+
		"\u0141\u0142\7\25\2\2\u0142\u0144\3\2\2\2\u0143\u013f\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0152\3\2\2\2\u0145\u0147\7\24\2\2\u0146\u0148\5*\26\2"+
		"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014e"+
		"\7W\2\2\u014a\u014b\7\23\2\2\u014b\u014c\5\26\f\2\u014c\u014d\7\25\2\2"+
		"\u014d\u014f\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u0145\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153)\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\t\5\2\2"+
		"\u0156+\3\2\2\2\u0157\u015b\7\t\2\2\u0158\u015a\5.\30\2\u0159\u0158\3"+
		"\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0167\7\n\2\2\u015f\u0164\5B"+
		"\"\2\u0160\u0161\7\24\2\2\u0161\u0163\5B\"\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\7\3\2\2\u016a-\3\2\2\2\u016b\u016c\5*\26\2"+
		"\u016c\u016d\7\35\2\2\u016d\u0171\3\2\2\2\u016e\u0171\5\60\31\2\u016f"+
		"\u0171\5\4\3\2\u0170\u016b\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u016f\3\2"+
		"\2\2\u0171/\3\2\2\2\u0172\u0173\7W\2\2\u0173\u0175\7\6\2\2\u0174\u0176"+
		"\5$\23\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u018b\7\7\2\2\u0178\u0179\7\35\2\2\u0179\u017a\7W\2\2\u017a\u017c\7\6"+
		"\2\2\u017b\u017d\5\62\32\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0188\7\7\2\2\u017f\u0180\7\24\2\2\u0180\u0181\7"+
		"W\2\2\u0181\u0183\7\6\2\2\u0182\u0184\5\62\32\2\u0183\u0182\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\7\7\2\2\u0186\u017f\3\2"+
		"\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0178\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018e\5<\37\2\u018e\61\3\2\2\2\u018f\u0194"+
		"\5f\64\2\u0190\u0191\7\24\2\2\u0191\u0193\5f\64\2\u0192\u0190\3\2\2\2"+
		"\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\63"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019e\7!\2\2\u0198\u019e\7\"\2\2\u0199"+
		"\u019e\7\4\2\2\u019a\u019e\7#\2\2\u019b\u019c\7#\2\2\u019c\u019e\7#\2"+
		"\2\u019d\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019a"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019e\65\3\2\2\2\u019f\u01a4\7$\2\2\u01a0"+
		"\u01a4\7%\2\2\u01a1\u01a2\7#\2\2\u01a2\u01a4\7%\2\2\u01a3\u019f\3\2\2"+
		"\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\67\3\2\2\2\u01a5\u01a6"+
		"\7&\2\2\u01a69\3\2\2\2\u01a7\u01c7\5> \2\u01a8\u01c7\5F$\2\u01a9\u01c7"+
		"\5H%\2\u01aa\u01c7\5J&\2\u01ab\u01c7\5L\'\2\u01ac\u01c7\5P)\2\u01ad\u01c7"+
		"\5X-\2\u01ae\u01af\5l\67\2\u01af\u01b0\7\3\2\2\u01b0\u01c7\3\2\2\2\u01b1"+
		"\u01c7\5<\37\2\u01b2\u01c7\7\3\2\2\u01b3\u01b4\7\'\2\2\u01b4\u01c7\7\3"+
		"\2\2\u01b5\u01b6\7(\2\2\u01b6\u01c7\7\3\2\2\u01b7\u01b9\7)\2\2\u01b8\u01ba"+
		"\5f\64\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01c7\7\3\2\2\u01bc\u01c1\5f\64\2\u01bd\u01be\7\24\2\2\u01be\u01c0\5"+
		"f\64\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7\3"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01a7\3\2\2\2\u01c6\u01a8\3\2\2\2\u01c6"+
		"\u01a9\3\2\2\2\u01c6\u01aa\3\2\2\2\u01c6\u01ab\3\2\2\2\u01c6\u01ac\3\2"+
		"\2\2\u01c6\u01ad\3\2\2\2\u01c6\u01ae\3\2\2\2\u01c6\u01b1\3\2\2\2\u01c6"+
		"\u01b2\3\2\2\2\u01c6\u01b3\3\2\2\2\u01c6\u01b5\3\2\2\2\u01c6\u01b7\3\2"+
		"\2\2\u01c6\u01bc\3\2\2\2\u01c7;\3\2\2\2\u01c8\u01cc\7\t\2\2\u01c9\u01cb"+
		"\5:\36\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7\n"+
		"\2\2\u01d0=\3\2\2\2\u01d1\u01d3\7\22\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\7*\2\2\u01d5\u01d4\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\5@!\2\u01d8\u01d9\7\3\2"+
		"\2\u01d9?\3\2\2\2\u01da\u01db\5\26\f\2\u01db\u01dc\5B\"\2\u01dcA\3\2\2"+
		"\2\u01dd\u01df\5\20\t\2\u01de\u01e0\5D#\2\u01df\u01de\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e8\3\2\2\2\u01e1\u01e2\7\24\2\2\u01e2\u01e4\5\20\t\2"+
		"\u01e3\u01e5\5D#\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7"+
		"\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9C\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01f2\5d\63\2"+
		"\u01ec\u01ee\5v<\2\u01ed\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01eb\3\2\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f2E\3\2\2\2\u01f3\u01f8\5b\62\2\u01f4\u01f5\7\24\2\2"+
		"\u01f5\u01f7\5b\62\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fc\7\3\2\2\u01fcG\3\2\2\2\u01fd\u01fe\7+\2\2\u01fe\u01ff\7\6\2\2\u01ff"+
		"\u0200\5f\64\2\u0200\u0201\7\7\2\2\u0201\u0204\5`\61\2\u0202\u0203\7,"+
		"\2\2\u0203\u0205\5`\61\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"I\3\2\2\2\u0206\u0207\7-\2\2\u0207\u0208\7\6\2\2\u0208\u0209\5f\64\2\u0209"+
		"\u020a\7\7\2\2\u020a\u020b\5`\61\2\u020bK\3\2\2\2\u020c\u020d\7.\2\2\u020d"+
		"\u020e\5N(\2\u020e\u020f\7-\2\2\u020f\u0210\7\6\2\2\u0210\u0211\5f\64"+
		"\2\u0211\u0212\7\7\2\2\u0212\u0213\7\3\2\2\u0213M\3\2\2\2\u0214\u0217"+
		"\5<\37\2\u0215\u0217\5:\36\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217"+
		"O\3\2\2\2\u0218\u0219\7/\2\2\u0219\u021c\7\6\2\2\u021a\u021d\5T+\2\u021b"+
		"\u021d\5V,\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d\u021e\3\2\2"+
		"\2\u021e\u021f\7\7\2\2\u021f\u0220\5`\61\2\u0220Q\3\2\2\2\u0221\u0226"+
		"\5^\60\2\u0222\u0223\7\24\2\2\u0223\u0225\5^\60\2\u0224\u0222\3\2\2\2"+
		"\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227S\3"+
		"\2\2\2\u0228\u0226\3\2\2\2\u0229\u022b\5R*\2\u022a\u0229\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\7\3\2\2\u022d\u022f\5f"+
		"\64\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0232\7\3\2\2\u0231\u0233\5R*\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2"+
		"\2\u0233U\3\2\2\2\u0234\u0236\7\22\2\2\u0235\u0234\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u023a\7\60\2\2\u0238\u023a\5\26\f\2"+
		"\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c"+
		"\5\20\t\2\u023c\u023d\7\35\2\2\u023d\u023e\5l\67\2\u023eW\3\2\2\2\u023f"+
		"\u0240\7\61\2\2\u0240\u0241\7\6\2\2\u0241\u0242\5^\60\2\u0242\u0243\7"+
		"\7\2\2\u0243\u0244\5Z.\2\u0244Y\3\2\2\2\u0245\u0258\5:\36\2\u0246\u024a"+
		"\7\t\2\2\u0247\u0249\5\\/\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0254\3\2\2\2\u024c\u024a\3\2"+
		"\2\2\u024d\u024e\7\62\2\2\u024e\u0250\7\35\2\2\u024f\u0251\5:\36\2\u0250"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0255\3\2\2\2\u0254\u024d\3\2\2\2\u0254\u0255\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0258\7\n\2\2\u0257\u0245\3\2\2\2\u0257\u0246\3\2"+
		"\2\2\u0258[\3\2\2\2\u0259\u0261\5:\36\2\u025a\u025b\7\63\2\2\u025b\u025c"+
		"\5^\60\2\u025c\u025d\7\35\2\2\u025d\u0261\3\2\2\2\u025e\u025f\7\'\2\2"+
		"\u025f\u0261\7\3\2\2\u0260\u0259\3\2\2\2\u0260\u025a\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0261]\3\2\2\2\u0262\u0266\5f\64\2\u0263\u0266\5b\62\2\u0264"+
		"\u0266\5@!\2\u0265\u0262\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0264\3\2\2"+
		"\2\u0266_\3\2\2\2\u0267\u026b\5<\37\2\u0268\u026b\5:\36\2\u0269\u026b"+
		"\7\3\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026b"+
		"a\3\2\2\2\u026c\u026d\5l\67\2\u026d\u026e\5d\63\2\u026ec\3\2\2\2\u026f"+
		"\u0270\5z>\2\u0270\u0271\5l\67\2\u0271\u0273\3\2\2\2\u0272\u026f\3\2\2"+
		"\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277"+
		"\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0278\5z>\2\u0278\u0279\5f\64\2\u0279"+
		"e\3\2\2\2\u027a\u027b\b\64\1\2\u027b\u0284\5b\62\2\u027c\u027d\5|?\2\u027d"+
		"\u027e\5f\64\6\u027e\u0284\3\2\2\2\u027f\u0280\5~@\2\u0280\u0281\5h\65"+
		"\2\u0281\u0284\3\2\2\2\u0282\u0284\5h\65\2\u0283\u027a\3\2\2\2\u0283\u027c"+
		"\3\2\2\2\u0283\u027f\3\2\2\2\u0283\u0282\3\2\2\2\u0284\u0291\3\2\2\2\u0285"+
		"\u0286\f\b\2\2\u0286\u0287\5x=\2\u0287\u0288\5f\64\t\u0288\u0290\3\2\2"+
		"\2\u0289\u028a\f\3\2\2\u028a\u028b\7\64\2\2\u028b\u028c\5f\64\2\u028c"+
		"\u028d\7\35\2\2\u028d\u028e\5f\64\4\u028e\u0290\3\2\2\2\u028f\u0285\3"+
		"\2\2\2\u028f\u0289\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292g\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0295\7\6\2\2"+
		"\u0295\u0296\5f\64\2\u0296\u0297\7\7\2\2\u0297\u02b8\3\2\2\2\u0298\u02b8"+
		"\5l\67\2\u0299\u029f\5\26\f\2\u029a\u029c\7\6\2\2\u029b\u029d\5p9\2\u029c"+
		"\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\7\7"+
		"\2\2\u029f\u029a\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a7\3\2\2\2\u02a1"+
		"\u02a2\7\65\2\2\u02a2\u02a3\5f\64\2\u02a3\u02a4\7\66\2\2\u02a4\u02a6\3"+
		"\2\2\2\u02a5\u02a1\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02b8\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02b8\5r"+
		":\2\u02ab\u02ac\7\67\2\2\u02ac\u02b8\5f\64\2\u02ad\u02ae\7\6\2\2\u02ae"+
		"\u02af\5\26\f\2\u02af\u02b0\7\7\2\2\u02b0\u02b1\5f\64\2\u02b1\u02b8\3"+
		"\2\2\2\u02b2\u02b4\7\t\2\2\u02b3\u02b5\5j\66\2\u02b4\u02b3\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\7\n\2\2\u02b7\u0294\3\2"+
		"\2\2\u02b7\u0298\3\2\2\2\u02b7\u0299\3\2\2\2\u02b7\u02aa\3\2\2\2\u02b7"+
		"\u02ab\3\2\2\2\u02b7\u02ad\3\2\2\2\u02b7\u02b2\3\2\2\2\u02b8i\3\2\2\2"+
		"\u02b9\u02be\5f\64\2\u02ba\u02bb\7\24\2\2\u02bb\u02bd\5f\64\2\u02bc\u02ba"+
		"\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"k\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c3\5\20\t\2\u02c2\u02c4\5n8\2\u02c3"+
		"\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02ce\3\2\2\2\u02c5\u02c7\5v"+
		"<\2\u02c6\u02c5\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\5t"+
		";\2\u02cc\u02cd\5l\67\2\u02cd\u02cf\3\2\2\2\u02ce\u02c8\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d3\3\2\2\2\u02d0\u02d2\5v<\2\u02d1\u02d0\3\2\2"+
		"\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d7"+
		"\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d8\5\u0080A\2\u02d7\u02d6\3\2\2"+
		"\2\u02d7\u02d8\3\2\2\2\u02d8m\3\2\2\2\u02d9\u02db\7\6\2\2\u02da\u02dc"+
		"\5p9\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02de\7\7\2\2\u02deo\3\2\2\2\u02df\u02e4\5f\64\2\u02e0\u02e1\7\24\2\2"+
		"\u02e1\u02e3\5f\64\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5q\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7"+
		"\u02e8\t\6\2\2\u02e8s\3\2\2\2\u02e9\u02ea\t\7\2\2\u02eau\3\2\2\2\u02eb"+
		"\u02ec\7\65\2\2\u02ec\u02ed\5f\64\2\u02ed\u02ee\7\66\2\2\u02ee\u02fb\3"+
		"\2\2\2\u02ef\u02f0\7\6\2\2\u02f0\u02f5\5f\64\2\u02f1\u02f2\7\24\2\2\u02f2"+
		"\u02f4\5f\64\2\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8"+
		"\u02f9\7\7\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02eb\3\2\2\2\u02fa\u02ef\3\2"+
		"\2\2\u02fbw\3\2\2\2\u02fc\u0314\7:\2\2\u02fd\u0314\7;\2\2\u02fe\u0314"+
		"\7\23\2\2\u02ff\u0301\7\25\2\2\u0300\u0302\7\25\2\2\u0301\u0300\3\2\2"+
		"\2\u0301\u0302\3\2\2\2\u0302\u0314\3\2\2\2\u0303\u0314\7<\2\2\u0304\u0314"+
		"\7=\2\2\u0305\u0314\7>\2\2\u0306\u0314\7?\2\2\u0307\u0314\7\r\2\2\u0308"+
		"\u0314\7\20\2\2\u0309\u0314\7@\2\2\u030a\u0314\7A\2\2\u030b\u0314\7\17"+
		"\2\2\u030c\u0314\7B\2\2\u030d\u0314\7C\2\2\u030e\u0314\7D\2\2\u030f\u0314"+
		"\7E\2\2\u0310\u0314\7F\2\2\u0311\u0314\7\16\2\2\u0312\u0314\7G\2\2\u0313"+
		"\u02fc\3\2\2\2\u0313\u02fd\3\2\2\2\u0313\u02fe\3\2\2\2\u0313\u02ff\3\2"+
		"\2\2\u0313\u0303\3\2\2\2\u0313\u0304\3\2\2\2\u0313\u0305\3\2\2\2\u0313"+
		"\u0306\3\2\2\2\u0313\u0307\3\2\2\2\u0313\u0308\3\2\2\2\u0313\u0309\3\2"+
		"\2\2\u0313\u030a\3\2\2\2\u0313\u030b\3\2\2\2\u0313\u030c\3\2\2\2\u0313"+
		"\u030d\3\2\2\2\u0313\u030e\3\2\2\2\u0313\u030f\3\2\2\2\u0313\u0310\3\2"+
		"\2\2\u0313\u0311\3\2\2\2\u0313\u0312\3\2\2\2\u0314y\3\2\2\2\u0315\u0316"+
		"\t\b\2\2\u0316{\3\2\2\2\u0317\u0318\t\t\2\2\u0318}\3\2\2\2\u0319\u031d"+
		"\7?\2\2\u031a\u031d\7>\2\2\u031b\u031d\5\u0080A\2\u031c\u0319\3\2\2\2"+
		"\u031c\u031a\3\2\2\2\u031c\u031b\3\2\2\2\u031d\177\3\2\2\2\u031e\u031f"+
		"\t\n\2\2\u031f\u0081\3\2\2\2b\u0085\u008c\u008f\u009d\u00a3\u00a8\u00b2"+
		"\u00b9\u00c3\u00c9\u00cd\u00d6\u00df\u00ea\u00ef\u00f2\u00f7\u0103\u0106"+
		"\u010a\u010f\u0113\u0117\u011d\u0124\u0129\u012d\u0131\u0136\u013c\u0143"+
		"\u0147\u014e\u0152\u015b\u0164\u0167\u0170\u0175\u017c\u0183\u0188\u018b"+
		"\u0194\u019d\u01a3\u01b9\u01c1\u01c6\u01cc\u01d2\u01d5\u01df\u01e4\u01e8"+
		"\u01ef\u01f1\u01f8\u0204\u0216\u021c\u0226\u022a\u022e\u0232\u0235\u0239"+
		"\u024a\u0252\u0254\u0257\u0260\u0265\u026a\u0274\u0283\u028f\u0291\u029c"+
		"\u029f\u02a7\u02b4\u02b7\u02be\u02c3\u02c8\u02ce\u02d3\u02d7\u02db\u02e4"+
		"\u02f5\u02fa\u0301\u0313\u031c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}