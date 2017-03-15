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
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, ID=86, COMMENT=87, LINE_COMMENT=88, 
		WS=89, INT=90, LONG=91, LONGLONG=92, CHAR=93, DOUBLE=94, BOOL=95, STRING=96, 
		MULTILINEMACRO=97, DIRECTIVE=98;
	public static final int
		RULE_cpp = 0, RULE_global = 1, RULE_namespace = 2, RULE_using = 3, RULE_nestedNamespace = 4, 
		RULE_id = 5, RULE_path = 6, RULE_typedef = 7, RULE_datatype = 8, RULE_datatypeDefinition = 9, 
		RULE_template = 10, RULE_function = 11, RULE_functionRem = 12, RULE_functionBody = 13, 
		RULE_parameters = 14, RULE_structClass = 15, RULE_inheritance = 16, RULE_encapsulation = 17, 
		RULE_structClassBody = 18, RULE_globalClass = 19, RULE_classConstructor = 20, 
		RULE_integerType = 21, RULE_floatType = 22, RULE_boolType = 23, RULE_instruction = 24, 
		RULE_scope = 25, RULE_declarationBlock = 26, RULE_declaration = 27, RULE_properDeclaration = 28, 
		RULE_declarationType = 29, RULE_assignmentBlock = 30, RULE_ifBlock = 31, 
		RULE_whileBlock = 32, RULE_doWhileBlock = 33, RULE_doWhileBody = 34, RULE_forBlock = 35, 
		RULE_forExpression = 36, RULE_classicFor = 37, RULE_forEach = 38, RULE_switchBlock = 39, 
		RULE_switchBody = 40, RULE_switchInstruction = 41, RULE_primaryExpression = 42, 
		RULE_controlStructureBody = 43, RULE_assignment = 44, RULE_properAssignment = 45, 
		RULE_expression = 46, RULE_expression2 = 47, RULE_callSomething = 48, 
		RULE_callFunction = 49, RULE_functionArguments = 50, RULE_value = 51, 
		RULE_accessOp = 52, RULE_accessBrackets = 53, RULE_binOp = 54, RULE_assignmentOp = 55, 
		RULE_unOp1 = 56, RULE_unOp2 = 57, RULE_increaseOp = 58, RULE_main = 59;
	public static final String[] ruleNames = {
		"cpp", "global", "namespace", "using", "nestedNamespace", "id", "path", 
		"typedef", "datatype", "datatypeDefinition", "template", "function", "functionRem", 
		"functionBody", "parameters", "structClass", "inheritance", "encapsulation", 
		"structClassBody", "globalClass", "classConstructor", "integerType", "floatType", 
		"boolType", "instruction", "scope", "declarationBlock", "declaration", 
		"properDeclaration", "declarationType", "assignmentBlock", "ifBlock", 
		"whileBlock", "doWhileBlock", "doWhileBody", "forBlock", "forExpression", 
		"classicFor", "forEach", "switchBlock", "switchBody", "switchInstruction", 
		"primaryExpression", "controlStructureBody", "assignment", "properAssignment", 
		"expression", "expression2", "callSomething", "callFunction", "functionArguments", 
		"value", "accessOp", "accessBrackets", "binOp", "assignmentOp", "unOp1", 
		"unOp2", "increaseOp", "main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'namespace'", "'{'", "'}'", "'using'", "'::'", "'*'", "'&&'", 
		"'&'", "'/'", "'typedef'", "'const'", "'<'", "','", "'>'", "'unsigned'", 
		"'template'", "'class'", "'typename'", "'inline'", "'void'", "'('", "')'", 
		"'struct'", "':'", "'private'", "'protected'", "'public'", "'char'", "'short'", 
		"'int'", "'long'", "'float'", "'double'", "'bool'", "'break'", "'continue'", 
		"'return'", "'static'", "'['", "']'", "'if'", "'else'", "'while'", "'do'", 
		"'for'", "'auto'", "'switch'", "'default'", "'case'", "'?'", "'sizeof'", 
		"'.'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+'", "'-'", "'%'", "'>>'", 
		"'<<'", "'|'", "'^'", "'and'", "'or'", "'xor'", "'||'", "'='", "'+='", 
		"'-='", "'/='", "'*='", "'%='", "'&='", "'|='", "'^='", "'>>='", "'<<='", 
		"'!'", "'~'", "'--'", "'++'", "'main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "COMMENT", "LINE_COMMENT", "WS", "INT", "LONG", "LONGLONG", 
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CPPParser.EOF, 0); }
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public CppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cpp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterCpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitCpp(this);
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
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					global();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(126);
			main();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ID - 86)) | (1L << (MULTILINEMACRO - 86)) | (1L << (DIRECTIVE - 86)))) != 0)) {
				{
				{
				setState(127);
				global();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitGlobal(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				typedef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				structClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				assignmentBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				declarationBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				namespace();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				using();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				match(MULTILINEMACRO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__1);
			setState(148);
			match(ID);
			setState(149);
			match(T__2);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ID - 86)) | (1L << (MULTILINEMACRO - 86)) | (1L << (DIRECTIVE - 86)))) != 0)) {
				{
				{
				setState(150);
				global();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitUsing(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__4);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(159);
				match(T__1);
				}
			}

			setState(162);
			nestedNamespace();
			setState(163);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterNestedNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitNestedNamespace(this);
		}
	}

	public final NestedNamespaceContext nestedNamespace() throws RecognitionException {
		NestedNamespaceContext _localctx = new NestedNamespaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nestedNamespace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					match(T__5);
					setState(167);
					match(ID);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(173);
				match(T__6);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(182);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(185);
				match(T__9);
				setState(186);
				match(ID);
				}
				}
				setState(191);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__10);
			setState(193);
			datatype();
			setState(194);
			match(ID);
			setState(195);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(197);
				match(T__11);
				}
			}

			setState(200);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterDatatypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitDatatypeDefinition(this);
		}
	}

	public final DatatypeDefinitionContext datatypeDefinition() throws RecognitionException {
		DatatypeDefinitionContext _localctx = new DatatypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_datatypeDefinition);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				nestedNamespace();
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(203);
					match(T__12);
					setState(204);
					datatype();
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(205);
						match(T__13);
						setState(206);
						datatype();
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(212);
					match(T__14);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(216);
					match(T__15);
					}
				}

				setState(219);
				integerType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				floatType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitTemplate(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__16);
			setState(225);
			match(T__12);
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			match(ID);
			setState(228);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FunctionRemContext functionRem() {
			return getRuleContext(FunctionRemContext.class,0);
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
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(230);
				template();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(233);
				match(T__19);
				}
			}

			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__15:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case ID:
				{
				setState(236);
				datatype();
				}
				break;
			case T__20:
				{
				setState(237);
				match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
			id();
			setState(241);
			match(T__21);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__15) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || _la==ID) {
				{
				setState(242);
				parameters();
				}
			}

			setState(245);
			match(T__22);
			setState(246);
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

	public static class FunctionRemContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionRemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionRem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFunctionRem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFunctionRem(this);
		}
	}

	public final FunctionRemContext functionRem() throws RecognitionException {
		FunctionRemContext _localctx = new FunctionRemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionRem);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				functionBody();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__2);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				{
				setState(253);
				instruction();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			datatype();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==ID) {
				{
				setState(262);
				properDeclaration();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(265);
				match(T__13);
				setState(266);
				datatype();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==ID) {
					{
					setState(267);
					properDeclaration();
					}
				}

				}
				}
				setState(274);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterStructClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitStructClass(this);
		}
	}

	public final StructClassContext structClass() throws RecognitionException {
		StructClassContext _localctx = new StructClassContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(275);
				template();
				}
			}

			setState(278);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(279);
			match(ID);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(280);
				inheritance();
				}
			}

			setState(283);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitInheritance(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inheritance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__24);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				setState(286);
				encapsulation();
				}
			}

			setState(289);
			match(ID);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(290);
				match(T__12);
				setState(291);
				datatype();
				setState(292);
				match(T__14);
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(296);
				match(T__13);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
					{
					setState(297);
					encapsulation();
					}
				}

				setState(300);
				match(ID);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(301);
					match(T__12);
					setState(302);
					datatype();
					setState(303);
					match(T__14);
					}
				}

				}
				}
				setState(311);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterEncapsulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitEncapsulation(this);
		}
	}

	public final EncapsulationContext encapsulation() throws RecognitionException {
		EncapsulationContext _localctx = new EncapsulationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_encapsulation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterStructClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitStructClassBody(this);
		}
	}

	public final StructClassBodyContext structClassBody() throws RecognitionException {
		StructClassBodyContext _localctx = new StructClassBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structClassBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__2);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (ID - 86)) | (1L << (MULTILINEMACRO - 86)) | (1L << (DIRECTIVE - 86)))) != 0)) {
				{
				{
				setState(315);
				globalClass();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(T__3);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==ID) {
				{
				setState(322);
				properDeclaration();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(323);
					match(T__13);
					setState(324);
					properDeclaration();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(332);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterGlobalClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitGlobalClass(this);
		}
	}

	public final GlobalClassContext globalClass() throws RecognitionException {
		GlobalClassContext _localctx = new GlobalClassContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_globalClass);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				encapsulation();
				setState(335);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				classConstructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterClassConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitClassConstructor(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ID);
			setState(342);
			match(T__21);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__15) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || _la==ID) {
				{
				setState(343);
				parameters();
				}
			}

			setState(346);
			match(T__22);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(347);
				match(T__24);
				setState(348);
				match(ID);
				setState(349);
				match(T__21);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(350);
					expression(0);
					}
				}

				setState(353);
				match(T__22);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(354);
					match(T__13);
					setState(355);
					match(ID);
					setState(356);
					match(T__21);
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
						{
						setState(357);
						expression(0);
						}
					}

					setState(360);
					match(T__22);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(368);
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

	public static class IntegerTypeContext extends ParserRuleContext {
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitIntegerType(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_integerType);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(T__29);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				match(T__30);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(T__31);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(374);
				match(T__31);
				setState(375);
				match(T__31);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFloatType(this);
		}
	}

	public final FloatTypeContext floatType() throws RecognitionException {
		FloatTypeContext _localctx = new FloatTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_floatType);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(T__33);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(T__31);
				setState(381);
				match(T__33);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitBoolType(this);
		}
	}

	public final BoolTypeContext boolType() throws RecognitionException {
		BoolTypeContext _localctx = new BoolTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instruction);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				declarationBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				assignmentBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				ifBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				whileBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				doWhileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				forBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				switchBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(393);
				callSomething();
				setState(394);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(396);
				scope();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(397);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(398);
				match(T__35);
				setState(399);
				match(T__0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(400);
				match(T__36);
				setState(401);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(402);
				match(T__37);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(403);
					expression(0);
					}
				}

				setState(406);
				match(T__0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(407);
				expression(0);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(408);
					match(T__13);
					setState(409);
					expression(0);
					}
					}
					setState(414);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__2);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				{
				setState(418);
				instruction();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitDeclarationBlock(this);
		}
	}

	public final DeclarationBlockContext declarationBlock() throws RecognitionException {
		DeclarationBlockContext _localctx = new DeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(426);
				match(T__11);
				}
				break;
			}
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(429);
				match(T__38);
				}
			}

			setState(432);
			declaration();
			setState(433);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			datatype();
			setState(436);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterProperDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitProperDeclaration(this);
		}
	}

	public final ProperDeclarationContext properDeclaration() throws RecognitionException {
		ProperDeclarationContext _localctx = new ProperDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_properDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			id();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__39 - 22)) | (1L << (T__69 - 22)) | (1L << (T__70 - 22)) | (1L << (T__71 - 22)) | (1L << (T__72 - 22)) | (1L << (T__73 - 22)) | (1L << (T__74 - 22)) | (1L << (T__75 - 22)) | (1L << (T__76 - 22)) | (1L << (T__77 - 22)) | (1L << (T__78 - 22)) | (1L << (T__79 - 22)))) != 0)) {
				{
				setState(439);
				declarationType();
				}
			}

			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					match(T__13);
					setState(443);
					id();
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__39 - 22)) | (1L << (T__69 - 22)) | (1L << (T__70 - 22)) | (1L << (T__71 - 22)) | (1L << (T__72 - 22)) | (1L << (T__73 - 22)) | (1L << (T__74 - 22)) | (1L << (T__75 - 22)) | (1L << (T__76 - 22)) | (1L << (T__77 - 22)) | (1L << (T__78 - 22)) | (1L << (T__79 - 22)))) != 0)) {
						{
						setState(444);
						declarationType();
						}
					}

					}
					} 
				}
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclarationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterDeclarationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitDeclarationType(this);
		}
	}

	public final DeclarationTypeContext declarationType() throws RecognitionException {
		DeclarationTypeContext _localctx = new DeclarationTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declarationType);
		int _la;
		try {
			setState(473);
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
				setState(452);
				properAssignment();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(T__21);
				setState(454);
				expression(0);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(455);
					match(T__13);
					setState(456);
					expression(0);
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
				match(T__22);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(464);
					match(T__39);
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
						{
						setState(465);
						expression(0);
						}
					}

					setState(468);
					match(T__40);
					}
					}
					setState(471); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__39 );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterAssignmentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitAssignmentBlock(this);
		}
	}

	public final AssignmentBlockContext assignmentBlock() throws RecognitionException {
		AssignmentBlockContext _localctx = new AssignmentBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignmentBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			assignment();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(476);
				match(T__13);
				setState(477);
				assignment();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitIfBlock(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__41);
			setState(486);
			match(T__21);
			setState(487);
			expression(0);
			setState(488);
			match(T__22);
			setState(489);
			controlStructureBody();
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(490);
				match(T__42);
				setState(491);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitWhileBlock(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__43);
			setState(495);
			match(T__21);
			setState(496);
			expression(0);
			setState(497);
			match(T__22);
			setState(498);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterDoWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitDoWhileBlock(this);
		}
	}

	public final DoWhileBlockContext doWhileBlock() throws RecognitionException {
		DoWhileBlockContext _localctx = new DoWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__44);
			setState(501);
			doWhileBody();
			setState(502);
			match(T__43);
			setState(503);
			match(T__21);
			setState(504);
			expression(0);
			setState(505);
			match(T__22);
			setState(506);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterDoWhileBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitDoWhileBody(this);
		}
	}

	public final DoWhileBodyContext doWhileBody() throws RecognitionException {
		DoWhileBodyContext _localctx = new DoWhileBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_doWhileBody);
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitForBlock(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(T__45);
			setState(513);
			match(T__21);
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(514);
				classicFor();
				}
				break;
			case 2:
				{
				setState(515);
				forEach();
				}
				break;
			}
			setState(518);
			match(T__22);
			setState(519);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitForExpression(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			primaryExpression();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(522);
				match(T__13);
				setState(523);
				primaryExpression();
				}
				}
				setState(528);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterClassicFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitClassicFor(this);
		}
	}

	public final ClassicForContext classicFor() throws RecognitionException {
		ClassicForContext _localctx = new ClassicForContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_classicFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(529);
				forExpression();
				}
			}

			setState(532);
			match(T__0);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(533);
				expression(0);
				}
			}

			setState(536);
			match(T__0);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(537);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitForEach(this);
		}
	}

	public final ForEachContext forEach() throws RecognitionException {
		ForEachContext _localctx = new ForEachContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(540);
				match(T__11);
				}
				break;
			}
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				{
				setState(543);
				match(T__46);
				}
				break;
			case T__11:
			case T__15:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case ID:
				{
				setState(544);
				datatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(547);
			id();
			setState(548);
			match(T__24);
			setState(549);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__47);
			setState(552);
			match(T__21);
			setState(553);
			primaryExpression();
			setState(554);
			match(T__22);
			setState(555);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitSwitchBody(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_switchBody);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(T__2);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__49) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					{
					setState(559);
					switchInstruction();
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(565);
					match(T__48);
					setState(566);
					match(T__24);
					setState(568); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(567);
						instruction();
						}
						}
						setState(570); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__47) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0) );
					}
				}

				setState(574);
				match(T__3);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterSwitchInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitSwitchInstruction(this);
		}
	}

	public final SwitchInstructionContext switchInstruction() throws RecognitionException {
		SwitchInstructionContext _localctx = new SwitchInstructionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_switchInstruction);
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(T__49);
				setState(579);
				primaryExpression();
				setState(580);
				match(T__24);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				match(T__35);
				setState(583);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primaryExpression);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterControlStructureBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitControlStructureBody(this);
		}
	}

	public final ControlStructureBodyContext controlStructureBody() throws RecognitionException {
		ControlStructureBodyContext _localctx = new ControlStructureBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_controlStructureBody);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			callSomething();
			setState(597);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterProperAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitProperAssignment(this);
		}
	}

	public final ProperAssignmentContext properAssignment() throws RecognitionException {
		ProperAssignmentContext _localctx = new ProperAssignmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_properAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(599);
					assignmentOp();
					setState(600);
					callSomething();
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(607);
			assignmentOp();
			setState(608);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitExpression(this);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(611);
				assignment();
				}
				break;
			case 2:
				{
				setState(612);
				unOp1();
				setState(613);
				expression(4);
				}
				break;
			case 3:
				{
				setState(615);
				unOp2();
				setState(616);
				expression2();
				}
				break;
			case 4:
				{
				setState(618);
				expression2();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(621);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(622);
						binOp();
						setState(623);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(625);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(626);
						match(T__50);
						setState(627);
						expression(0);
						setState(628);
						match(T__24);
						setState(629);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CallSomethingContext callSomething() {
			return getRuleContext(CallSomethingContext.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitExpression2(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_expression2);
		int _la;
		try {
			int _alt;
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				match(T__21);
				setState(637);
				expression(0);
				setState(638);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				datatype();
				setState(646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(641);
					match(T__21);
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
						{
						setState(642);
						functionArguments();
						}
					}

					setState(645);
					match(T__22);
					}
					break;
				}
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(648);
						match(T__39);
						setState(649);
						expression(0);
						setState(650);
						match(T__40);
						}
						} 
					}
					setState(656);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(658);
				callSomething();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(659);
				match(T__51);
				setState(660);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(661);
				match(T__21);
				setState(662);
				datatype();
				setState(663);
				match(T__22);
				setState(664);
				expression(0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterCallSomething(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitCallSomething(this);
		}
	}

	public final CallSomethingContext callSomething() throws RecognitionException {
		CallSomethingContext _localctx = new CallSomethingContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_callSomething);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			id();
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(669);
				callFunction();
				}
				break;
			}
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(672);
					accessBrackets();
					}
				}

				setState(675);
				accessOp();
				setState(676);
				callSomething();
				}
				break;
			}
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(680);
				accessBrackets();
				}
				break;
			}
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(683);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitCallFunction(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T__21);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(687);
				functionArguments();
				}
			}

			setState(690);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFunctionArguments(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			expression(0);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(693);
				match(T__13);
				setState(694);
				expression(0);
				}
				}
				setState(699);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (INT - 90)) | (1L << (LONG - 90)) | (1L << (LONGLONG - 90)) | (1L << (CHAR - 90)) | (1L << (DOUBLE - 90)) | (1L << (BOOL - 90)) | (1L << (STRING - 90)))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterAccessOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitAccessOp(this);
		}
	}

	public final AccessOpContext accessOp() throws RecognitionException {
		AccessOpContext _localctx = new AccessOpContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_accessOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterAccessBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitAccessBrackets(this);
		}
	}

	public final AccessBracketsContext accessBrackets() throws RecognitionException {
		AccessBracketsContext _localctx = new AccessBracketsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_accessBrackets);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(704);
					match(T__39);
					setState(705);
					expression(0);
					setState(706);
					match(T__40);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(710); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitBinOp(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_la = _input.LA(1);
			if ( !(((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (T__6 - 7)) | (1L << (T__7 - 7)) | (1L << (T__8 - 7)) | (1L << (T__9 - 7)) | (1L << (T__12 - 7)) | (1L << (T__14 - 7)) | (1L << (T__54 - 7)) | (1L << (T__55 - 7)) | (1L << (T__56 - 7)) | (1L << (T__57 - 7)) | (1L << (T__58 - 7)) | (1L << (T__59 - 7)) | (1L << (T__60 - 7)) | (1L << (T__61 - 7)) | (1L << (T__62 - 7)) | (1L << (T__63 - 7)) | (1L << (T__64 - 7)) | (1L << (T__65 - 7)) | (1L << (T__66 - 7)) | (1L << (T__67 - 7)) | (1L << (T__68 - 7)))) != 0)) ) {
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

	public static class AssignmentOpContext extends ParserRuleContext {
		public AssignmentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterAssignmentOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitAssignmentOp(this);
		}
	}

	public final AssignmentOpContext assignmentOp() throws RecognitionException {
		AssignmentOpContext _localctx = new AssignmentOpContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterUnOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitUnOp1(this);
		}
	}

	public final UnOp1Context unOp1() throws RecognitionException {
		UnOp1Context _localctx = new UnOp1Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_unOp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterUnOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitUnOp2(this);
		}
	}

	public final UnOp2Context unOp2() throws RecognitionException {
		UnOp2Context _localctx = new UnOp2Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_unOp2);
		try {
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				match(T__59);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				match(T__58);
				}
				break;
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterIncreaseOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitIncreaseOp(this);
		}
	}

	public final IncreaseOpContext increaseOp() throws RecognitionException {
		IncreaseOpContext _localctx = new IncreaseOpContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_increaseOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
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

	public static class MainContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(725);
				match(T__30);
				}
			}

			setState(728);
			match(T__84);
			setState(729);
			match(T__21);
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__15) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || _la==ID) {
				{
				setState(730);
				parameters();
				}
			}

			setState(733);
			match(T__22);
			setState(734);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 46:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3d\u02e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\7\2|\n\2\f\2\16\2\177\13\2\3\2\3\2\7\2\u0083\n\2\f\2\16\2\u0086\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0094\n\3\3\4\3"+
		"\4\3\4\3\4\7\4\u009a\n\4\f\4\16\4\u009d\13\4\3\4\3\4\3\5\3\5\5\5\u00a3"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\u00ab\n\6\f\6\16\6\u00ae\13\6\3\7\7\7"+
		"\u00b1\n\7\f\7\16\7\u00b4\13\7\3\7\5\7\u00b7\n\7\3\7\3\7\3\b\3\b\3\b\7"+
		"\b\u00be\n\b\f\b\16\b\u00c1\13\b\3\t\3\t\3\t\3\t\3\t\3\n\5\n\u00c9\n\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00d2\n\13\f\13\16\13\u00d5\13"+
		"\13\3\13\3\13\5\13\u00d9\n\13\3\13\5\13\u00dc\n\13\3\13\3\13\3\13\5\13"+
		"\u00e1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\5\r\u00ea\n\r\3\r\5\r\u00ed\n"+
		"\r\3\r\3\r\5\r\u00f1\n\r\3\r\3\r\3\r\5\r\u00f6\n\r\3\r\3\r\3\r\3\16\3"+
		"\16\5\16\u00fd\n\16\3\17\3\17\7\17\u0101\n\17\f\17\16\17\u0104\13\17\3"+
		"\17\3\17\3\20\3\20\5\20\u010a\n\20\3\20\3\20\3\20\5\20\u010f\n\20\7\20"+
		"\u0111\n\20\f\20\16\20\u0114\13\20\3\21\5\21\u0117\n\21\3\21\3\21\3\21"+
		"\5\21\u011c\n\21\3\21\3\21\3\22\3\22\5\22\u0122\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0129\n\22\3\22\3\22\5\22\u012d\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0134\n\22\7\22\u0136\n\22\f\22\16\22\u0139\13\22\3\23\3\23"+
		"\3\24\3\24\7\24\u013f\n\24\f\24\16\24\u0142\13\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0148\n\24\f\24\16\24\u014b\13\24\5\24\u014d\n\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0156\n\25\3\26\3\26\3\26\5\26\u015b\n\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0162\n\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0169\n\26\3\26\7\26\u016c\n\26\f\26\16\26\u016f\13\26\5\26\u0171\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u017b\n\27\3\30\3\30\3\30"+
		"\3\30\5\30\u0181\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0197\n\32\3\32"+
		"\3\32\3\32\3\32\7\32\u019d\n\32\f\32\16\32\u01a0\13\32\5\32\u01a2\n\32"+
		"\3\33\3\33\7\33\u01a6\n\33\f\33\16\33\u01a9\13\33\3\33\3\33\3\34\5\34"+
		"\u01ae\n\34\3\34\5\34\u01b1\n\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\5\36\u01bb\n\36\3\36\3\36\3\36\5\36\u01c0\n\36\7\36\u01c2\n\36\f\36"+
		"\16\36\u01c5\13\36\3\37\3\37\3\37\3\37\3\37\7\37\u01cc\n\37\f\37\16\37"+
		"\u01cf\13\37\3\37\3\37\3\37\3\37\5\37\u01d5\n\37\3\37\6\37\u01d8\n\37"+
		"\r\37\16\37\u01d9\5\37\u01dc\n\37\3 \3 \3 \7 \u01e1\n \f \16 \u01e4\13"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u01ef\n!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\5$\u0201\n$\3%\3%\3%\3%\5%\u0207\n%\3%\3%\3"+
		"%\3&\3&\3&\7&\u020f\n&\f&\16&\u0212\13&\3\'\5\'\u0215\n\'\3\'\3\'\5\'"+
		"\u0219\n\'\3\'\3\'\5\'\u021d\n\'\3(\5(\u0220\n(\3(\3(\5(\u0224\n(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\7*\u0233\n*\f*\16*\u0236\13*\3*\3*"+
		"\3*\6*\u023b\n*\r*\16*\u023c\5*\u023f\n*\3*\5*\u0242\n*\3+\3+\3+\3+\3"+
		"+\3+\3+\5+\u024b\n+\3,\3,\3,\5,\u0250\n,\3-\3-\3-\5-\u0255\n-\3.\3.\3"+
		".\3/\3/\3/\7/\u025d\n/\f/\16/\u0260\13/\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u026e\n\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\7\60\u027a\n\60\f\60\16\60\u027d\13\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u0286\n\61\3\61\5\61\u0289\n\61\3\61\3"+
		"\61\3\61\3\61\7\61\u028f\n\61\f\61\16\61\u0292\13\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u029d\n\61\3\62\3\62\5\62\u02a1\n\62"+
		"\3\62\5\62\u02a4\n\62\3\62\3\62\3\62\5\62\u02a9\n\62\3\62\5\62\u02ac\n"+
		"\62\3\62\5\62\u02af\n\62\3\63\3\63\5\63\u02b3\n\63\3\63\3\63\3\64\3\64"+
		"\3\64\7\64\u02ba\n\64\f\64\16\64\u02bd\13\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\6\67\u02c7\n\67\r\67\16\67\u02c8\38\38\39\39\3:\3:\3;"+
		"\3;\3;\5;\u02d4\n;\3<\3<\3=\5=\u02d9\n=\3=\3=\3=\5=\u02de\n=\3=\3=\3="+
		"\3=\2\3^>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\f\3\2\n\13\3\2\24\25\4\2\24\24\32"+
		"\32\3\2\34\36\3\2\\b\3\2\678\6\2\t\f\17\17\21\219G\3\2HR\3\2ST\3\2UV\u0326"+
		"\2}\3\2\2\2\4\u0093\3\2\2\2\6\u0095\3\2\2\2\b\u00a0\3\2\2\2\n\u00a7\3"+
		"\2\2\2\f\u00b2\3\2\2\2\16\u00ba\3\2\2\2\20\u00c2\3\2\2\2\22\u00c8\3\2"+
		"\2\2\24\u00e0\3\2\2\2\26\u00e2\3\2\2\2\30\u00e9\3\2\2\2\32\u00fc\3\2\2"+
		"\2\34\u00fe\3\2\2\2\36\u0107\3\2\2\2 \u0116\3\2\2\2\"\u011f\3\2\2\2$\u013a"+
		"\3\2\2\2&\u013c\3\2\2\2(\u0155\3\2\2\2*\u0157\3\2\2\2,\u017a\3\2\2\2."+
		"\u0180\3\2\2\2\60\u0182\3\2\2\2\62\u01a1\3\2\2\2\64\u01a3\3\2\2\2\66\u01ad"+
		"\3\2\2\28\u01b5\3\2\2\2:\u01b8\3\2\2\2<\u01db\3\2\2\2>\u01dd\3\2\2\2@"+
		"\u01e7\3\2\2\2B\u01f0\3\2\2\2D\u01f6\3\2\2\2F\u0200\3\2\2\2H\u0202\3\2"+
		"\2\2J\u020b\3\2\2\2L\u0214\3\2\2\2N\u021f\3\2\2\2P\u0229\3\2\2\2R\u0241"+
		"\3\2\2\2T\u024a\3\2\2\2V\u024f\3\2\2\2X\u0254\3\2\2\2Z\u0256\3\2\2\2\\"+
		"\u025e\3\2\2\2^\u026d\3\2\2\2`\u029c\3\2\2\2b\u029e\3\2\2\2d\u02b0\3\2"+
		"\2\2f\u02b6\3\2\2\2h\u02be\3\2\2\2j\u02c0\3\2\2\2l\u02c6\3\2\2\2n\u02ca"+
		"\3\2\2\2p\u02cc\3\2\2\2r\u02ce\3\2\2\2t\u02d3\3\2\2\2v\u02d5\3\2\2\2x"+
		"\u02d8\3\2\2\2z|\5\4\3\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0084\5x=\2\u0081\u0083\5\4\3\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\2\2\3\u0088\3\3\2\2\2"+
		"\u0089\u0094\5\20\t\2\u008a\u0094\5 \21\2\u008b\u0094\5> \2\u008c\u0094"+
		"\5\66\34\2\u008d\u0094\5\30\r\2\u008e\u0094\5\6\4\2\u008f\u0094\5\b\5"+
		"\2\u0090\u0094\7\3\2\2\u0091\u0094\7c\2\2\u0092\u0094\7d\2\2\u0093\u0089"+
		"\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093"+
		"\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\5\3\2\2\2\u0095\u0096"+
		"\7\4\2\2\u0096\u0097\7X\2\2\u0097\u009b\7\5\2\2\u0098\u009a\5\4\3\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\6\2\2\u009f"+
		"\7\3\2\2\2\u00a0\u00a2\7\7\2\2\u00a1\u00a3\7\4\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6"+
		"\7\3\2\2\u00a6\t\3\2\2\2\u00a7\u00ac\7X\2\2\u00a8\u00a9\7\b\2\2\u00a9"+
		"\u00ab\7X\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\13\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1"+
		"\7\t\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\t\2"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\5\n\6\2\u00b9\r\3\2\2\2\u00ba\u00bf\7X\2\2\u00bb\u00bc\7\f\2\2"+
		"\u00bc\u00be\7X\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\17\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7\r\2\2\u00c3\u00c4\5\22\n\2\u00c4\u00c5\7X\2\2\u00c5\u00c6\7\3"+
		"\2\2\u00c6\21\3\2\2\2\u00c7\u00c9\7\16\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5\24\13\2\u00cb\23\3\2\2\2\u00cc"+
		"\u00d8\5\n\6\2\u00cd\u00ce\7\17\2\2\u00ce\u00d3\5\22\n\2\u00cf\u00d0\7"+
		"\20\2\2\u00d0\u00d2\5\22\n\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00e1\3\2\2\2\u00da\u00dc\7\22\2\2\u00db\u00da\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e1\5,\27\2\u00de"+
		"\u00e1\5.\30\2\u00df\u00e1\5\60\31\2\u00e0\u00cc\3\2\2\2\u00e0\u00db\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\25\3\2\2\2\u00e2"+
		"\u00e3\7\23\2\2\u00e3\u00e4\7\17\2\2\u00e4\u00e5\t\3\2\2\u00e5\u00e6\7"+
		"X\2\2\u00e6\u00e7\7\21\2\2\u00e7\27\3\2\2\2\u00e8\u00ea\5\26\f\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00ed\7\26"+
		"\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00f1\5\22\n\2\u00ef\u00f1\7\27\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\5\f\7\2\u00f3\u00f5\7\30\2\2\u00f4"+
		"\u00f6\5\36\20\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f8\7\31\2\2\u00f8\u00f9\5\32\16\2\u00f9\31\3\2\2\2\u00fa"+
		"\u00fd\5\34\17\2\u00fb\u00fd\7\3\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3"+
		"\2\2\2\u00fd\33\3\2\2\2\u00fe\u0102\7\5\2\2\u00ff\u0101\5\62\32\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\6\2\2\u0106"+
		"\35\3\2\2\2\u0107\u0109\5\22\n\2\u0108\u010a\5:\36\2\u0109\u0108\3\2\2"+
		"\2\u0109\u010a\3\2\2\2\u010a\u0112\3\2\2\2\u010b\u010c\7\20\2\2\u010c"+
		"\u010e\5\22\n\2\u010d\u010f\5:\36\2\u010e\u010d\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f\u0111\3\2\2\2\u0110\u010b\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\37\3\2\2\2\u0114\u0112\3\2\2"+
		"\2\u0115\u0117\5\26\f\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\t\4\2\2\u0119\u011b\7X\2\2\u011a\u011c\5\""+
		"\22\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\5&\24\2\u011e!\3\2\2\2\u011f\u0121\7\33\2\2\u0120\u0122\5$\23\2"+
		"\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0128"+
		"\7X\2\2\u0124\u0125\7\17\2\2\u0125\u0126\5\22\n\2\u0126\u0127\7\21\2\2"+
		"\u0127\u0129\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0137"+
		"\3\2\2\2\u012a\u012c\7\20\2\2\u012b\u012d\5$\23\2\u012c\u012b\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0133\7X\2\2\u012f\u0130"+
		"\7\17\2\2\u0130\u0131\5\22\n\2\u0131\u0132\7\21\2\2\u0132\u0134\3\2\2"+
		"\2\u0133\u012f\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u012a"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"#\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\t\5\2\2\u013b%\3\2\2\2\u013c"+
		"\u0140\7\5\2\2\u013d\u013f\5(\25\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u014c\7\6\2\2\u0144\u0149\5:\36\2\u0145\u0146\7\20"+
		"\2\2\u0146\u0148\5:\36\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u0144\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\7\3\2\2\u014f\'\3\2\2\2\u0150\u0151\5$\23\2\u0151\u0152\7\33\2"+
		"\2\u0152\u0156\3\2\2\2\u0153\u0156\5*\26\2\u0154\u0156\5\4\3\2\u0155\u0150"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156)\3\2\2\2\u0157"+
		"\u0158\7X\2\2\u0158\u015a\7\30\2\2\u0159\u015b\5\36\20\2\u015a\u0159\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u0170\7\31\2\2\u015d"+
		"\u015e\7\33\2\2\u015e\u015f\7X\2\2\u015f\u0161\7\30\2\2\u0160\u0162\5"+
		"^\60\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u016d\7\31\2\2\u0164\u0165\7\20\2\2\u0165\u0166\7X\2\2\u0166\u0168\7"+
		"\30\2\2\u0167\u0169\5^\60\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\7\31\2\2\u016b\u0164\3\2\2\2\u016c\u016f\3"+
		"\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u015d\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0173\5\64\33\2\u0173+\3\2\2\2\u0174\u017b\7\37\2\2\u0175\u017b"+
		"\7 \2\2\u0176\u017b\7!\2\2\u0177\u017b\7\"\2\2\u0178\u0179\7\"\2\2\u0179"+
		"\u017b\7\"\2\2\u017a\u0174\3\2\2\2\u017a\u0175\3\2\2\2\u017a\u0176\3\2"+
		"\2\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017b-\3\2\2\2\u017c\u0181"+
		"\7#\2\2\u017d\u0181\7$\2\2\u017e\u017f\7\"\2\2\u017f\u0181\7$\2\2\u0180"+
		"\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0181/\3\2\2\2"+
		"\u0182\u0183\7%\2\2\u0183\61\3\2\2\2\u0184\u01a2\5\66\34\2\u0185\u01a2"+
		"\5> \2\u0186\u01a2\5@!\2\u0187\u01a2\5B\"\2\u0188\u01a2\5D#\2\u0189\u01a2"+
		"\5H%\2\u018a\u01a2\5P)\2\u018b\u018c\5b\62\2\u018c\u018d\7\3\2\2\u018d"+
		"\u01a2\3\2\2\2\u018e\u01a2\5\64\33\2\u018f\u01a2\7\3\2\2\u0190\u0191\7"+
		"&\2\2\u0191\u01a2\7\3\2\2\u0192\u0193\7\'\2\2\u0193\u01a2\7\3\2\2\u0194"+
		"\u0196\7(\2\2\u0195\u0197\5^\60\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u01a2\7\3\2\2\u0199\u019e\5^\60\2\u019a"+
		"\u019b\7\20\2\2\u019b\u019d\5^\60\2\u019c\u019a\3\2\2\2\u019d\u01a0\3"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u0184\3\2\2\2\u01a1\u0185\3\2\2\2\u01a1\u0186\3\2"+
		"\2\2\u01a1\u0187\3\2\2\2\u01a1\u0188\3\2\2\2\u01a1\u0189\3\2\2\2\u01a1"+
		"\u018a\3\2\2\2\u01a1\u018b\3\2\2\2\u01a1\u018e\3\2\2\2\u01a1\u018f\3\2"+
		"\2\2\u01a1\u0190\3\2\2\2\u01a1\u0192\3\2\2\2\u01a1\u0194\3\2\2\2\u01a1"+
		"\u0199\3\2\2\2\u01a2\63\3\2\2\2\u01a3\u01a7\7\5\2\2\u01a4\u01a6\5\62\32"+
		"\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7\6\2\2\u01ab"+
		"\65\3\2\2\2\u01ac\u01ae\7\16\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2"+
		"\2\u01ae\u01b0\3\2\2\2\u01af\u01b1\7)\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\58\35\2\u01b3\u01b4\7\3\2\2\u01b4"+
		"\67\3\2\2\2\u01b5\u01b6\5\22\n\2\u01b6\u01b7\5:\36\2\u01b79\3\2\2\2\u01b8"+
		"\u01ba\5\f\7\2\u01b9\u01bb\5<\37\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01c3\3\2\2\2\u01bc\u01bd\7\20\2\2\u01bd\u01bf\5\f\7\2\u01be"+
		"\u01c0\5<\37\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2"+
		"\2\2\u01c1\u01bc\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4;\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01dc\5\\/\2\u01c7"+
		"\u01c8\7\30\2\2\u01c8\u01cd\5^\60\2\u01c9\u01ca\7\20\2\2\u01ca\u01cc\5"+
		"^\60\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\7\31"+
		"\2\2\u01d1\u01dc\3\2\2\2\u01d2\u01d4\7*\2\2\u01d3\u01d5\5^\60\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\7+"+
		"\2\2\u01d7\u01d2\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01c6\3\2\2\2\u01db\u01c7\3\2"+
		"\2\2\u01db\u01d7\3\2\2\2\u01dc=\3\2\2\2\u01dd\u01e2\5Z.\2\u01de\u01df"+
		"\7\20\2\2\u01df\u01e1\5Z.\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e5\u01e6\7\3\2\2\u01e6?\3\2\2\2\u01e7\u01e8\7,\2\2\u01e8\u01e9"+
		"\7\30\2\2\u01e9\u01ea\5^\60\2\u01ea\u01eb\7\31\2\2\u01eb\u01ee\5X-\2\u01ec"+
		"\u01ed\7-\2\2\u01ed\u01ef\5X-\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2"+
		"\2\u01efA\3\2\2\2\u01f0\u01f1\7.\2\2\u01f1\u01f2\7\30\2\2\u01f2\u01f3"+
		"\5^\60\2\u01f3\u01f4\7\31\2\2\u01f4\u01f5\5X-\2\u01f5C\3\2\2\2\u01f6\u01f7"+
		"\7/\2\2\u01f7\u01f8\5F$\2\u01f8\u01f9\7.\2\2\u01f9\u01fa\7\30\2\2\u01fa"+
		"\u01fb\5^\60\2\u01fb\u01fc\7\31\2\2\u01fc\u01fd\7\3\2\2\u01fdE\3\2\2\2"+
		"\u01fe\u0201\5\64\33\2\u01ff\u0201\5\62\32\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201G\3\2\2\2\u0202\u0203\7\60\2\2\u0203\u0206\7\30\2"+
		"\2\u0204\u0207\5L\'\2\u0205\u0207\5N(\2\u0206\u0204\3\2\2\2\u0206\u0205"+
		"\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7\31\2\2\u0209\u020a\5X-\2\u020a"+
		"I\3\2\2\2\u020b\u0210\5V,\2\u020c\u020d\7\20\2\2\u020d\u020f\5V,\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211K\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0215\5J&\2\u0214\u0213"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\7\3\2\2\u0217"+
		"\u0219\5^\60\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021c\7\3\2\2\u021b\u021d\5J&\2\u021c\u021b\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021dM\3\2\2\2\u021e\u0220\7\16\2\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u0224\7\61\2\2\u0222\u0224\5"+
		"\22\n\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0226\5\f\7\2\u0226\u0227\7\33\2\2\u0227\u0228\5b\62\2\u0228O\3\2\2\2"+
		"\u0229\u022a\7\62\2\2\u022a\u022b\7\30\2\2\u022b\u022c\5V,\2\u022c\u022d"+
		"\7\31\2\2\u022d\u022e\5R*\2\u022eQ\3\2\2\2\u022f\u0242\5\62\32\2\u0230"+
		"\u0234\7\5\2\2\u0231\u0233\5T+\2\u0232\u0231\3\2\2\2\u0233\u0236\3\2\2"+
		"\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u023e\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0237\u0238\7\63\2\2\u0238\u023a\7\33\2\2\u0239\u023b\5\62\32"+
		"\2\u023a\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u0237\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0242\7\6\2\2\u0241\u022f\3\2\2\2\u0241\u0230\3\2"+
		"\2\2\u0242S\3\2\2\2\u0243\u024b\5\62\32\2\u0244\u0245\7\64\2\2\u0245\u0246"+
		"\5V,\2\u0246\u0247\7\33\2\2\u0247\u024b\3\2\2\2\u0248\u0249\7&\2\2\u0249"+
		"\u024b\7\3\2\2\u024a\u0243\3\2\2\2\u024a\u0244\3\2\2\2\u024a\u0248\3\2"+
		"\2\2\u024bU\3\2\2\2\u024c\u0250\5^\60\2\u024d\u0250\5Z.\2\u024e\u0250"+
		"\58\35\2\u024f\u024c\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u024e\3\2\2\2\u0250"+
		"W\3\2\2\2\u0251\u0255\5\64\33\2\u0252\u0255\5\62\32\2\u0253\u0255\7\3"+
		"\2\2\u0254\u0251\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255"+
		"Y\3\2\2\2\u0256\u0257\5b\62\2\u0257\u0258\5\\/\2\u0258[\3\2\2\2\u0259"+
		"\u025a\5p9\2\u025a\u025b\5b\62\2\u025b\u025d\3\2\2\2\u025c\u0259\3\2\2"+
		"\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261"+
		"\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\5p9\2\u0262\u0263\5^\60\2\u0263"+
		"]\3\2\2\2\u0264\u0265\b\60\1\2\u0265\u026e\5Z.\2\u0266\u0267\5r:\2\u0267"+
		"\u0268\5^\60\6\u0268\u026e\3\2\2\2\u0269\u026a\5t;\2\u026a\u026b\5`\61"+
		"\2\u026b\u026e\3\2\2\2\u026c\u026e\5`\61\2\u026d\u0264\3\2\2\2\u026d\u0266"+
		"\3\2\2\2\u026d\u0269\3\2\2\2\u026d\u026c\3\2\2\2\u026e\u027b\3\2\2\2\u026f"+
		"\u0270\f\b\2\2\u0270\u0271\5n8\2\u0271\u0272\5^\60\t\u0272\u027a\3\2\2"+
		"\2\u0273\u0274\f\3\2\2\u0274\u0275\7\65\2\2\u0275\u0276\5^\60\2\u0276"+
		"\u0277\7\33\2\2\u0277\u0278\5^\60\4\u0278\u027a\3\2\2\2\u0279\u026f\3"+
		"\2\2\2\u0279\u0273\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c_\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\7\30\2\2"+
		"\u027f\u0280\5^\60\2\u0280\u0281\7\31\2\2\u0281\u029d\3\2\2\2\u0282\u0288"+
		"\5\22\n\2\u0283\u0285\7\30\2\2\u0284\u0286\5f\64\2\u0285\u0284\3\2\2\2"+
		"\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\7\31\2\2\u0288\u0283"+
		"\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0290\3\2\2\2\u028a\u028b\7*\2\2\u028b"+
		"\u028c\5^\60\2\u028c\u028d\7+\2\2\u028d\u028f\3\2\2\2\u028e\u028a\3\2"+
		"\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u029d\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u029d\5h\65\2\u0294\u029d\5b"+
		"\62\2\u0295\u0296\7\66\2\2\u0296\u029d\5^\60\2\u0297\u0298\7\30\2\2\u0298"+
		"\u0299\5\22\n\2\u0299\u029a\7\31\2\2\u029a\u029b\5^\60\2\u029b\u029d\3"+
		"\2\2\2\u029c\u027e\3\2\2\2\u029c\u0282\3\2\2\2\u029c\u0293\3\2\2\2\u029c"+
		"\u0294\3\2\2\2\u029c\u0295\3\2\2\2\u029c\u0297\3\2\2\2\u029da\3\2\2\2"+
		"\u029e\u02a0\5\f\7\2\u029f\u02a1\5d\63\2\u02a0\u029f\3\2\2\2\u02a0\u02a1"+
		"\3\2\2\2\u02a1\u02a8\3\2\2\2\u02a2\u02a4\5l\67\2\u02a3\u02a2\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\5j\66\2\u02a6\u02a7\5b"+
		"\62\2\u02a7\u02a9\3\2\2\2\u02a8\u02a3\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02ab\3\2\2\2\u02aa\u02ac\5l\67\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02af\5v<\2\u02ae\u02ad\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02afc\3\2\2\2\u02b0\u02b2\7\30\2\2\u02b1\u02b3\5f\64\2\u02b2"+
		"\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\7\31"+
		"\2\2\u02b5e\3\2\2\2\u02b6\u02bb\5^\60\2\u02b7\u02b8\7\20\2\2\u02b8\u02ba"+
		"\5^\60\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb"+
		"\u02bc\3\2\2\2\u02bcg\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\t\6\2\2"+
		"\u02bfi\3\2\2\2\u02c0\u02c1\t\7\2\2\u02c1k\3\2\2\2\u02c2\u02c3\7*\2\2"+
		"\u02c3\u02c4\5^\60\2\u02c4\u02c5\7+\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c2"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"m\3\2\2\2\u02ca\u02cb\t\b\2\2\u02cbo\3\2\2\2\u02cc\u02cd\t\t\2\2\u02cd"+
		"q\3\2\2\2\u02ce\u02cf\t\n\2\2\u02cfs\3\2\2\2\u02d0\u02d4\7>\2\2\u02d1"+
		"\u02d4\7=\2\2\u02d2\u02d4\5v<\2\u02d3\u02d0\3\2\2\2\u02d3\u02d1\3\2\2"+
		"\2\u02d3\u02d2\3\2\2\2\u02d4u\3\2\2\2\u02d5\u02d6\t\13\2\2\u02d6w\3\2"+
		"\2\2\u02d7\u02d9\7!\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02da\3\2\2\2\u02da\u02db\7W\2\2\u02db\u02dd\7\30\2\2\u02dc\u02de\5\36"+
		"\20\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e0\7\31\2\2\u02e0\u02e1\5\34\17\2\u02e1y\3\2\2\2\\}\u0084\u0093\u009b"+
		"\u00a2\u00ac\u00b2\u00b6\u00bf\u00c8\u00d3\u00d8\u00db\u00e0\u00e9\u00ec"+
		"\u00f0\u00f5\u00fc\u0102\u0109\u010e\u0112\u0116\u011b\u0121\u0128\u012c"+
		"\u0133\u0137\u0140\u0149\u014c\u0155\u015a\u0161\u0168\u016d\u0170\u017a"+
		"\u0180\u0196\u019e\u01a1\u01a7\u01ad\u01b0\u01ba\u01bf\u01c3\u01cd\u01d4"+
		"\u01d9\u01db\u01e2\u01ee\u0200\u0206\u0210\u0214\u0218\u021c\u021f\u0223"+
		"\u0234\u023c\u023e\u0241\u024a\u024f\u0254\u025e\u026d\u0279\u027b\u0285"+
		"\u0288\u0290\u029c\u02a0\u02a3\u02a8\u02ab\u02ae\u02b2\u02bb\u02c8\u02d3"+
		"\u02d8\u02dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}