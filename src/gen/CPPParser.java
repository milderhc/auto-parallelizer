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
		RULE_boolType = 27, RULE_instruction = 28, RULE_returnBlock = 29, RULE_scope = 30, 
		RULE_declarationBlock = 31, RULE_declaration = 32, RULE_properDeclaration = 33, 
		RULE_declarationType = 34, RULE_assignmentBlock = 35, RULE_ifBlock = 36, 
		RULE_whileBlock = 37, RULE_doWhileBlock = 38, RULE_doWhileBody = 39, RULE_forBlock = 40, 
		RULE_forExpression = 41, RULE_classicFor = 42, RULE_forEach = 43, RULE_switchBlock = 44, 
		RULE_switchBody = 45, RULE_switchInstruction = 46, RULE_primaryExpression = 47, 
		RULE_controlStructureBody = 48, RULE_assignment = 49, RULE_properAssignment = 50, 
		RULE_expression = 51, RULE_expression2 = 52, RULE_curlyBrackets = 53, 
		RULE_callSomething = 54, RULE_callFunction = 55, RULE_functionArguments = 56, 
		RULE_value = 57, RULE_accessOp = 58, RULE_accessBrackets = 59, RULE_binOp = 60, 
		RULE_assignmentOp = 61, RULE_unOp1 = 62, RULE_unOp2 = 63, RULE_increaseOp = 64;
	public static final String[] ruleNames = {
		"cpp", "global", "main", "mainSign", "namespace", "using", "nestedNamespace", 
		"id", "path", "typedef", "datatype", "datatypeDefinition", "template", 
		"function", "functionSign", "functionRem", "functionBody", "parameters", 
		"structClass", "inheritance", "encapsulation", "structClassBody", "globalClass", 
		"classConstructor", "expressionList", "integerType", "floatType", "boolType", 
		"instruction", "returnBlock", "scope", "declarationBlock", "declaration", 
		"properDeclaration", "declarationType", "assignmentBlock", "ifBlock", 
		"whileBlock", "doWhileBlock", "doWhileBody", "forBlock", "forExpression", 
		"classicFor", "forEach", "switchBlock", "switchBody", "switchInstruction", 
		"primaryExpression", "controlStructureBody", "assignment", "properAssignment", 
		"expression", "expression2", "curlyBrackets", "callSomething", "callFunction", 
		"functionArguments", "value", "accessOp", "accessBrackets", "binOp", "assignmentOp", 
		"unOp1", "unOp2", "increaseOp"
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
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					global();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(136);
				main();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__39))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
					{
					{
					setState(137);
					global();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(145);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				typedef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				structClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				assignmentBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				declarationBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				namespace();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				using();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				match(MULTILINEMACRO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
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
			setState(159);
			mainSign();
			setState(160);
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(162);
				match(T__1);
				}
			}

			setState(165);
			match(T__2);
			setState(166);
			match(T__3);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) || _la==ID) {
				{
				setState(167);
				parameters();
				}
			}

			setState(170);
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
			setState(172);
			match(T__5);
			setState(173);
			match(ID);
			setState(174);
			match(T__6);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__39))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
				{
				{
				setState(175);
				global();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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
			setState(183);
			match(T__8);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(184);
				match(T__5);
				}
			}

			setState(187);
			nestedNamespace();
			setState(188);
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
			setState(190);
			match(ID);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					match(T__9);
					setState(192);
					match(ID);
					}
					} 
				}
				setState(197);
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
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(198);
				match(T__10);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(204);
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

			setState(207);
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
			setState(209);
			match(ID);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(210);
				match(T__13);
				setState(211);
				match(ID);
				}
				}
				setState(216);
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
			setState(217);
			match(T__14);
			setState(218);
			datatype();
			setState(219);
			match(ID);
			setState(220);
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
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(222);
				match(T__15);
				}
			}

			setState(225);
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				nestedNamespace();
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(228);
					match(T__16);
					setState(229);
					datatype();
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__17) {
						{
						{
						setState(230);
						match(T__17);
						setState(231);
						datatype();
						}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(237);
					match(T__18);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(241);
					match(T__19);
					}
				}

				setState(244);
				integerType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				floatType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
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
			setState(249);
			match(T__20);
			setState(250);
			match(T__16);
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
			match(ID);
			setState(253);
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
			setState(255);
			functionSign();
			setState(256);
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
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(258);
				template();
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(261);
				match(T__23);
				}
			}

			setState(266);
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
				setState(264);
				datatype();
				}
				break;
			case T__24:
				{
				setState(265);
				match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			id();
			setState(269);
			match(T__3);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) || _la==ID) {
				{
				setState(270);
				parameters();
				}
			}

			setState(273);
			match(T__4);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(274);
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
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				functionBody();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
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
			setState(281);
			match(T__6);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				{
				setState(282);
				instruction();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
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
			setState(290);
			datatype();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) || _la==ID) {
				{
				setState(291);
				properDeclaration();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(294);
				match(T__17);
				setState(295);
				datatype();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) || _la==ID) {
					{
					setState(296);
					properDeclaration();
					}
				}

				}
				}
				setState(303);
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
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(304);
				template();
				}
			}

			setState(307);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			match(ID);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(309);
				inheritance();
				}
			}

			setState(312);
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
			setState(314);
			match(T__26);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
				{
				setState(315);
				encapsulation();
				}
			}

			setState(318);
			match(ID);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(319);
				match(T__16);
				setState(320);
				datatype();
				setState(321);
				match(T__18);
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(325);
				match(T__17);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) {
					{
					setState(326);
					encapsulation();
					}
				}

				setState(329);
				match(ID);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(330);
					match(T__16);
					setState(331);
					datatype();
					setState(332);
					match(T__18);
					}
				}

				}
				}
				setState(340);
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
			setState(341);
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
			setState(343);
			match(T__6);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__39))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
				{
				{
				setState(344);
				globalClass();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(T__7);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) || _la==ID) {
				{
				setState(351);
				properDeclaration();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(352);
					match(T__17);
					setState(353);
					properDeclaration();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(361);
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
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				encapsulation();
				setState(364);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				classConstructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
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
			setState(370);
			match(ID);
			setState(371);
			match(T__3);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) || _la==ID) {
				{
				setState(372);
				parameters();
				}
			}

			setState(375);
			match(T__4);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(376);
				match(T__26);
				setState(377);
				match(ID);
				setState(378);
				match(T__3);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(379);
					expressionList();
					}
				}

				setState(382);
				match(T__4);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(383);
					match(T__17);
					setState(384);
					match(ID);
					setState(385);
					match(T__3);
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
						{
						setState(386);
						expressionList();
						}
					}

					setState(389);
					match(T__4);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(397);
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
			setState(399);
			expression(0);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(400);
				match(T__17);
				setState(401);
				expression(0);
				}
				}
				setState(406);
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
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(T__31);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(T__32);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(T__32);
				setState(412);
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
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(T__34);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(T__32);
				setState(418);
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
			setState(421);
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
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
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
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				declarationBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				assignmentBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				ifBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				whileBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				doWhileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(428);
				forBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(429);
				switchBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(430);
				callSomething();
				setState(431);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				scope();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(434);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(435);
				match(T__36);
				setState(436);
				match(T__0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(437);
				match(T__37);
				setState(438);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(439);
				returnBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(440);
				expression(0);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(441);
					match(T__17);
					setState(442);
					expression(0);
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
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

	public static class ReturnBlockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitReturnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__38);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(453);
				expression(0);
				}
			}

			setState(456);
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
		enterRule(_localctx, 60, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__6);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				{
				setState(459);
				instruction();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
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
		enterRule(_localctx, 62, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(467);
				match(T__15);
				}
				break;
			}
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(470);
				match(T__39);
				}
			}

			setState(473);
			declaration();
			setState(474);
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
		enterRule(_localctx, 64, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			datatype();
			setState(477);
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
		enterRule(_localctx, 66, RULE_properDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			id();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__50 || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__76 - 70)) | (1L << (T__77 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)))) != 0)) {
				{
				setState(480);
				declarationType();
				}
			}

			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(T__17);
					setState(484);
					id();
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3 || _la==T__50 || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__76 - 70)) | (1L << (T__77 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)))) != 0)) {
						{
						setState(485);
						declarationType();
						}
					}

					}
					} 
				}
				setState(492);
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
		enterRule(_localctx, 68, RULE_declarationType);
		int _la;
		try {
			setState(499);
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
				setState(493);
				properAssignment();
				}
				break;
			case T__3:
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(494);
					accessBrackets();
					}
					}
					setState(497); 
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
		enterRule(_localctx, 70, RULE_assignmentBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			assignment();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(502);
				match(T__17);
				setState(503);
				assignment();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
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
		enterRule(_localctx, 72, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(T__40);
			setState(512);
			match(T__3);
			setState(513);
			expression(0);
			setState(514);
			match(T__4);
			setState(515);
			controlStructureBody();
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(516);
				match(T__41);
				setState(517);
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
		enterRule(_localctx, 74, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(T__42);
			setState(521);
			match(T__3);
			setState(522);
			expression(0);
			setState(523);
			match(T__4);
			setState(524);
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
		enterRule(_localctx, 76, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__43);
			setState(527);
			doWhileBody();
			setState(528);
			match(T__42);
			setState(529);
			match(T__3);
			setState(530);
			expression(0);
			setState(531);
			match(T__4);
			setState(532);
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
		enterRule(_localctx, 78, RULE_doWhileBody);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
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
		enterRule(_localctx, 80, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(T__44);
			setState(539);
			match(T__3);
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(540);
				classicFor();
				}
				break;
			case 2:
				{
				setState(541);
				forEach();
				}
				break;
			}
			setState(544);
			match(T__4);
			setState(545);
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
		enterRule(_localctx, 82, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			primaryExpression();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(548);
				match(T__17);
				setState(549);
				primaryExpression();
				}
				}
				setState(554);
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
		enterRule(_localctx, 84, RULE_classicFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(555);
				forExpression();
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
				expression(0);
				}
			}

			setState(562);
			match(T__0);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(563);
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
		enterRule(_localctx, 86, RULE_forEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(566);
				match(T__15);
				}
				break;
			}
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				{
				setState(569);
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
				setState(570);
				datatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(573);
			id();
			setState(574);
			match(T__26);
			setState(575);
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
		enterRule(_localctx, 88, RULE_switchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__46);
			setState(578);
			match(T__3);
			setState(579);
			primaryExpression();
			setState(580);
			match(T__4);
			setState(581);
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
		enterRule(_localctx, 90, RULE_switchBody);
		int _la;
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(T__6);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__48) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					{
					setState(585);
					switchInstruction();
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__47) {
					{
					setState(591);
					match(T__47);
					setState(592);
					match(T__26);
					setState(594); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(593);
						instruction();
						}
						}
						setState(596); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0) );
					}
				}

				setState(600);
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
		enterRule(_localctx, 92, RULE_switchInstruction);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(T__48);
				setState(605);
				primaryExpression();
				setState(606);
				match(T__26);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				match(T__36);
				setState(609);
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
		enterRule(_localctx, 94, RULE_primaryExpression);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
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
		enterRule(_localctx, 96, RULE_controlStructureBody);
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
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
		enterRule(_localctx, 98, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			callSomething();
			setState(623);
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
		enterRule(_localctx, 100, RULE_properAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					assignmentOp();
					setState(626);
					callSomething();
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(633);
			assignmentOp();
			setState(634);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(637);
				assignment();
				}
				break;
			case 2:
				{
				setState(638);
				unOp1();
				setState(639);
				expression(4);
				}
				break;
			case 3:
				{
				setState(641);
				unOp2();
				setState(642);
				expression2();
				}
				break;
			case 4:
				{
				setState(644);
				expression2();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(657);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(647);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(648);
						binOp();
						setState(649);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(651);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(652);
						match(T__49);
						setState(653);
						expression(0);
						setState(654);
						match(T__26);
						setState(655);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(661);
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
		enterRule(_localctx, 104, RULE_expression2);
		int _la;
		try {
			int _alt;
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(T__3);
				setState(663);
				expression(0);
				setState(664);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				callSomething();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(667);
				datatype();
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(668);
					match(T__3);
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
						{
						setState(669);
						functionArguments();
						}
					}

					setState(672);
					match(T__4);
					}
					break;
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(675);
						match(T__50);
						setState(676);
						expression(0);
						setState(677);
						match(T__51);
						}
						} 
					}
					setState(683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(685);
				match(T__52);
				setState(686);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(687);
				match(T__3);
				setState(688);
				datatype();
				setState(689);
				match(T__4);
				setState(690);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(692);
				match(T__6);
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
					{
					setState(693);
					curlyBrackets();
					}
				}

				setState(696);
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
		enterRule(_localctx, 106, RULE_curlyBrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			expression(0);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(700);
				match(T__17);
				setState(701);
				expression(0);
				}
				}
				setState(706);
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
		enterRule(_localctx, 108, RULE_callSomething);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			id();
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(708);
				callFunction();
				}
				break;
			}
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3 || _la==T__50) {
					{
					{
					setState(711);
					accessBrackets();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717);
				accessOp();
				setState(718);
				callSomething();
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					accessBrackets();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(728);
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
		enterRule(_localctx, 110, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(T__3);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__52) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)) | (1L << (T__83 - 81)) | (1L << (ID - 81)) | (1L << (INT - 81)) | (1L << (LONG - 81)) | (1L << (LONGLONG - 81)) | (1L << (CHAR - 81)) | (1L << (DOUBLE - 81)) | (1L << (BOOL - 81)) | (1L << (STRING - 81)))) != 0)) {
				{
				setState(732);
				functionArguments();
				}
			}

			setState(735);
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
		enterRule(_localctx, 112, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			expression(0);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(738);
				match(T__17);
				setState(739);
				expression(0);
				}
				}
				setState(744);
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
		enterRule(_localctx, 114, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
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
		enterRule(_localctx, 116, RULE_accessOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
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
		enterRule(_localctx, 118, RULE_accessBrackets);
		int _la;
		try {
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				match(T__50);
				setState(750);
				expression(0);
				setState(751);
				match(T__51);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(T__3);
				setState(754);
				expression(0);
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(755);
					match(T__17);
					setState(756);
					expression(0);
					}
					}
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(762);
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
		enterRule(_localctx, 120, RULE_binOp);
		int _la;
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(T__55);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(T__56);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				match(T__16);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				match(T__18);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(770);
					match(T__18);
					}
				}

				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 5);
				{
				setState(773);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 6);
				{
				setState(774);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 7);
				{
				setState(775);
				match(T__59);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 8);
				{
				setState(776);
				match(T__60);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 9);
				{
				setState(777);
				match(T__10);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 10);
				{
				setState(778);
				match(T__13);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 11);
				{
				setState(779);
				match(T__61);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 12);
				{
				setState(780);
				match(T__62);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 13);
				{
				setState(781);
				match(T__12);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 14);
				{
				setState(782);
				match(T__63);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 15);
				{
				setState(783);
				match(T__64);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 16);
				{
				setState(784);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 17);
				{
				setState(785);
				match(T__66);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 18);
				{
				setState(786);
				match(T__67);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 19);
				{
				setState(787);
				match(T__11);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 20);
				{
				setState(788);
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
		enterRule(_localctx, 122, RULE_assignmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
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
		enterRule(_localctx, 124, RULE_unOp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
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
		enterRule(_localctx, 126, RULE_unOp2);
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(795);
				match(T__60);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(796);
				match(T__59);
				}
				break;
			case T__82:
			case T__83:
				enterOuterAlt(_localctx, 3);
				{
				setState(797);
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
		enterRule(_localctx, 128, RULE_increaseOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
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
		case 51:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3c\u0325\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\7\2\u0086\n\2\f\2\16\2\u0089\13\2\3"+
		"\2\3\2\7\2\u008d\n\2\f\2\16\2\u0090\13\2\5\2\u0092\n\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a0\n\3\3\4\3\4\3\4\3\5\5\5\u00a6"+
		"\n\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00b3\n\6\f"+
		"\6\16\6\u00b6\13\6\3\6\3\6\3\7\3\7\5\7\u00bc\n\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\7\b\u00c4\n\b\f\b\16\b\u00c7\13\b\3\t\7\t\u00ca\n\t\f\t\16\t\u00cd"+
		"\13\t\3\t\5\t\u00d0\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u00d7\n\n\f\n\16\n\u00da"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\f\5\f\u00e2\n\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00eb\n\r\f\r\16\r\u00ee\13\r\3\r\3\r\5\r\u00f2\n\r\3\r\5\r"+
		"\u00f5\n\r\3\r\3\r\3\r\5\r\u00fa\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\5\20\u0106\n\20\3\20\5\20\u0109\n\20\3\20\3\20\5\20\u010d"+
		"\n\20\3\20\3\20\3\20\5\20\u0112\n\20\3\20\3\20\5\20\u0116\n\20\3\21\3"+
		"\21\5\21\u011a\n\21\3\22\3\22\7\22\u011e\n\22\f\22\16\22\u0121\13\22\3"+
		"\22\3\22\3\23\3\23\5\23\u0127\n\23\3\23\3\23\3\23\5\23\u012c\n\23\7\23"+
		"\u012e\n\23\f\23\16\23\u0131\13\23\3\24\5\24\u0134\n\24\3\24\3\24\3\24"+
		"\5\24\u0139\n\24\3\24\3\24\3\25\3\25\5\25\u013f\n\25\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u0146\n\25\3\25\3\25\5\25\u014a\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0151\n\25\7\25\u0153\n\25\f\25\16\25\u0156\13\25\3\26\3\26"+
		"\3\27\3\27\7\27\u015c\n\27\f\27\16\27\u015f\13\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0165\n\27\f\27\16\27\u0168\13\27\5\27\u016a\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0173\n\30\3\31\3\31\3\31\5\31\u0178\n\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u017f\n\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0186\n\31\3\31\7\31\u0189\n\31\f\31\16\31\u018c\13\31\5\31\u018e\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\7\32\u0195\n\32\f\32\16\32\u0198\13\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01a0\n\33\3\34\3\34\3\34\3\34\5\34\u01a6"+
		"\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01be\n\36\f\36\16"+
		"\36\u01c1\13\36\3\36\3\36\5\36\u01c5\n\36\3\37\3\37\5\37\u01c9\n\37\3"+
		"\37\3\37\3 \3 \7 \u01cf\n \f \16 \u01d2\13 \3 \3 \3!\5!\u01d7\n!\3!\5"+
		"!\u01da\n!\3!\3!\3!\3\"\3\"\3\"\3#\3#\5#\u01e4\n#\3#\3#\3#\5#\u01e9\n"+
		"#\7#\u01eb\n#\f#\16#\u01ee\13#\3$\3$\6$\u01f2\n$\r$\16$\u01f3\5$\u01f6"+
		"\n$\3%\3%\3%\7%\u01fb\n%\f%\16%\u01fe\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\5"+
		"&\u0209\n&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\5)\u021b"+
		"\n)\3*\3*\3*\3*\5*\u0221\n*\3*\3*\3*\3+\3+\3+\7+\u0229\n+\f+\16+\u022c"+
		"\13+\3,\5,\u022f\n,\3,\3,\5,\u0233\n,\3,\3,\5,\u0237\n,\3-\5-\u023a\n"+
		"-\3-\3-\5-\u023e\n-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\7/\u024d\n"+
		"/\f/\16/\u0250\13/\3/\3/\3/\6/\u0255\n/\r/\16/\u0256\5/\u0259\n/\3/\5"+
		"/\u025c\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0265\n\60\3\61\3\61"+
		"\3\61\5\61\u026a\n\61\3\62\3\62\3\62\5\62\u026f\n\62\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\7\64\u0277\n\64\f\64\16\64\u027a\13\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0288\n\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0294\n\65\f\65\16\65\u0297"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02a1\n\66\3\66\5"+
		"\66\u02a4\n\66\3\66\3\66\3\66\3\66\7\66\u02aa\n\66\f\66\16\66\u02ad\13"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02b9\n\66"+
		"\3\66\5\66\u02bc\n\66\3\67\3\67\3\67\7\67\u02c1\n\67\f\67\16\67\u02c4"+
		"\13\67\38\38\58\u02c8\n8\38\78\u02cb\n8\f8\168\u02ce\138\38\38\38\58\u02d3"+
		"\n8\38\78\u02d6\n8\f8\168\u02d9\138\38\58\u02dc\n8\39\39\59\u02e0\n9\3"+
		"9\39\3:\3:\3:\7:\u02e7\n:\f:\16:\u02ea\13:\3;\3;\3<\3<\3=\3=\3=\3=\3="+
		"\3=\3=\3=\7=\u02f8\n=\f=\16=\u02fb\13=\3=\3=\5=\u02ff\n=\3>\3>\3>\3>\3"+
		">\5>\u0306\n>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0318"+
		"\n>\3?\3?\3@\3@\3A\3A\3A\5A\u0321\nA\3B\3B\3B\2\3hC\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\2\13\3\2\16\17\3\2\30\31\4\2\30\30\34\34\3\2\36"+
		" \3\2[a\3\289\3\2HR\3\2ST\3\2UV\u037b\2\u0087\3\2\2\2\4\u009f\3\2\2\2"+
		"\6\u00a1\3\2\2\2\b\u00a5\3\2\2\2\n\u00ae\3\2\2\2\f\u00b9\3\2\2\2\16\u00c0"+
		"\3\2\2\2\20\u00cb\3\2\2\2\22\u00d3\3\2\2\2\24\u00db\3\2\2\2\26\u00e1\3"+
		"\2\2\2\30\u00f9\3\2\2\2\32\u00fb\3\2\2\2\34\u0101\3\2\2\2\36\u0105\3\2"+
		"\2\2 \u0119\3\2\2\2\"\u011b\3\2\2\2$\u0124\3\2\2\2&\u0133\3\2\2\2(\u013c"+
		"\3\2\2\2*\u0157\3\2\2\2,\u0159\3\2\2\2.\u0172\3\2\2\2\60\u0174\3\2\2\2"+
		"\62\u0191\3\2\2\2\64\u019f\3\2\2\2\66\u01a5\3\2\2\28\u01a7\3\2\2\2:\u01c4"+
		"\3\2\2\2<\u01c6\3\2\2\2>\u01cc\3\2\2\2@\u01d6\3\2\2\2B\u01de\3\2\2\2D"+
		"\u01e1\3\2\2\2F\u01f5\3\2\2\2H\u01f7\3\2\2\2J\u0201\3\2\2\2L\u020a\3\2"+
		"\2\2N\u0210\3\2\2\2P\u021a\3\2\2\2R\u021c\3\2\2\2T\u0225\3\2\2\2V\u022e"+
		"\3\2\2\2X\u0239\3\2\2\2Z\u0243\3\2\2\2\\\u025b\3\2\2\2^\u0264\3\2\2\2"+
		"`\u0269\3\2\2\2b\u026e\3\2\2\2d\u0270\3\2\2\2f\u0278\3\2\2\2h\u0287\3"+
		"\2\2\2j\u02bb\3\2\2\2l\u02bd\3\2\2\2n\u02c5\3\2\2\2p\u02dd\3\2\2\2r\u02e3"+
		"\3\2\2\2t\u02eb\3\2\2\2v\u02ed\3\2\2\2x\u02fe\3\2\2\2z\u0317\3\2\2\2|"+
		"\u0319\3\2\2\2~\u031b\3\2\2\2\u0080\u0320\3\2\2\2\u0082\u0322\3\2\2\2"+
		"\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0091\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008e\5\6\4\2\u008b\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\7\2\2\3\u0094\3\3\2\2\2\u0095\u00a0\5\24\13\2\u0096\u00a0"+
		"\5&\24\2\u0097\u00a0\5H%\2\u0098\u00a0\5@!\2\u0099\u00a0\5\34\17\2\u009a"+
		"\u00a0\5\n\6\2\u009b\u00a0\5\f\7\2\u009c\u00a0\7\3\2\2\u009d\u00a0\7b"+
		"\2\2\u009e\u00a0\7c\2\2\u009f\u0095\3\2\2\2\u009f\u0096\3\2\2\2\u009f"+
		"\u0097\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009a\3\2"+
		"\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\5\3\2\2\2\u00a1\u00a2\5\b\5\2\u00a2\u00a3\5\"\22"+
		"\2\u00a3\7\3\2\2\2\u00a4\u00a6\7\4\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00aa\7\6\2\2\u00a9"+
		"\u00ab\5$\23\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\7\7\2\2\u00ad\t\3\2\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0"+
		"\7W\2\2\u00b0\u00b4\7\t\2\2\u00b1\u00b3\5\4\3\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\n\2\2\u00b8\13\3\2\2\2\u00b9\u00bb"+
		"\7\13\2\2\u00ba\u00bc\7\b\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\7\3\2\2\u00bf\r"+
		"\3\2\2\2\u00c0\u00c5\7W\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c4\7W\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\17\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7\r\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5\16\b\2\u00d2"+
		"\21\3\2\2\2\u00d3\u00d8\7W\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d7\7W\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\23\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\21\2\2\u00dc"+
		"\u00dd\5\26\f\2\u00dd\u00de\7W\2\2\u00de\u00df\7\3\2\2\u00df\25\3\2\2"+
		"\2\u00e0\u00e2\7\22\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\5\30\r\2\u00e4\27\3\2\2\2\u00e5\u00f1\5\16"+
		"\b\2\u00e6\u00e7\7\23\2\2\u00e7\u00ec\5\26\f\2\u00e8\u00e9\7\24\2\2\u00e9"+
		"\u00eb\5\26\f\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7\25\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00f2\3"+
		"\2\2\2\u00f2\u00fa\3\2\2\2\u00f3\u00f5\7\26\2\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\5\64\33\2\u00f7\u00fa\5"+
		"\66\34\2\u00f8\u00fa\58\35\2\u00f9\u00e5\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\31\3\2\2\2\u00fb\u00fc\7\27\2"+
		"\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\t\3\2\2\u00fe\u00ff\7W\2\2\u00ff\u0100"+
		"\7\25\2\2\u0100\33\3\2\2\2\u0101\u0102\5\36\20\2\u0102\u0103\5 \21\2\u0103"+
		"\35\3\2\2\2\u0104\u0106\5\32\16\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u0109\7\32\2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u010d\5\26\f\2\u010b\u010d\7"+
		"\33\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\5\20\t\2\u010f\u0111\7\6\2\2\u0110\u0112\5$\23\2\u0111\u0110\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7\7\2\2\u0114"+
		"\u0116\7\22\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\37\3\2\2"+
		"\2\u0117\u011a\5\"\22\2\u0118\u011a\7\3\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a!\3\2\2\2\u011b\u011f\7\t\2\2\u011c\u011e\5:\36\2"+
		"\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\n\2\2\u0123"+
		"#\3\2\2\2\u0124\u0126\5\26\f\2\u0125\u0127\5D#\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u012f\3\2\2\2\u0128\u0129\7\24\2\2\u0129\u012b\5"+
		"\26\f\2\u012a\u012c\5D#\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u0128\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130%\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134"+
		"\5\32\16\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0136\t\4\2\2\u0136\u0138\7W\2\2\u0137\u0139\5(\25\2\u0138\u0137"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\5,\27\2\u013b"+
		"\'\3\2\2\2\u013c\u013e\7\35\2\2\u013d\u013f\5*\26\2\u013e\u013d\3\2\2"+
		"\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0145\7W\2\2\u0141\u0142"+
		"\7\23\2\2\u0142\u0143\5\26\f\2\u0143\u0144\7\25\2\2\u0144\u0146\3\2\2"+
		"\2\u0145\u0141\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0154\3\2\2\2\u0147\u0149"+
		"\7\24\2\2\u0148\u014a\5*\26\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2"+
		"\u014a\u014b\3\2\2\2\u014b\u0150\7W\2\2\u014c\u014d\7\23\2\2\u014d\u014e"+
		"\5\26\f\2\u014e\u014f\7\25\2\2\u014f\u0151\3\2\2\2\u0150\u014c\3\2\2\2"+
		"\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0147\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155)\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0158\t\5\2\2\u0158+\3\2\2\2\u0159\u015d\7\t\2\2"+
		"\u015a\u015c\5.\30\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0169\7\n\2\2\u0161\u0166\5D#\2\u0162\u0163\7\24\2\2\u0163\u0165\5D#"+
		"\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u0161\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\3\2\2\u016c-\3\2\2\2"+
		"\u016d\u016e\5*\26\2\u016e\u016f\7\35\2\2\u016f\u0173\3\2\2\2\u0170\u0173"+
		"\5\60\31\2\u0171\u0173\5\4\3\2\u0172\u016d\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0172\u0171\3\2\2\2\u0173/\3\2\2\2\u0174\u0175\7W\2\2\u0175\u0177\7\6"+
		"\2\2\u0176\u0178\5$\23\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u018d\7\7\2\2\u017a\u017b\7\35\2\2\u017b\u017c\7"+
		"W\2\2\u017c\u017e\7\6\2\2\u017d\u017f\5\62\32\2\u017e\u017d\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u018a\7\7\2\2\u0181\u0182\7\24"+
		"\2\2\u0182\u0183\7W\2\2\u0183\u0185\7\6\2\2\u0184\u0186\5\62\32\2\u0185"+
		"\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\7\7"+
		"\2\2\u0188\u0181\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u017a\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\5> \2\u0190\61"+
		"\3\2\2\2\u0191\u0196\5h\65\2\u0192\u0193\7\24\2\2\u0193\u0195\5h\65\2"+
		"\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\63\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u01a0\7!\2\2\u019a"+
		"\u01a0\7\"\2\2\u019b\u01a0\7\4\2\2\u019c\u01a0\7#\2\2\u019d\u019e\7#\2"+
		"\2\u019e\u01a0\7#\2\2\u019f\u0199\3\2\2\2\u019f\u019a\3\2\2\2\u019f\u019b"+
		"\3\2\2\2\u019f\u019c\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\65\3\2\2\2\u01a1"+
		"\u01a6\7$\2\2\u01a2\u01a6\7%\2\2\u01a3\u01a4\7#\2\2\u01a4\u01a6\7%\2\2"+
		"\u01a5\u01a1\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\67"+
		"\3\2\2\2\u01a7\u01a8\7&\2\2\u01a89\3\2\2\2\u01a9\u01c5\5@!\2\u01aa\u01c5"+
		"\5H%\2\u01ab\u01c5\5J&\2\u01ac\u01c5\5L\'\2\u01ad\u01c5\5N(\2\u01ae\u01c5"+
		"\5R*\2\u01af\u01c5\5Z.\2\u01b0\u01b1\5n8\2\u01b1\u01b2\7\3\2\2\u01b2\u01c5"+
		"\3\2\2\2\u01b3\u01c5\5> \2\u01b4\u01c5\7\3\2\2\u01b5\u01b6\7\'\2\2\u01b6"+
		"\u01c5\7\3\2\2\u01b7\u01b8\7(\2\2\u01b8\u01c5\7\3\2\2\u01b9\u01c5\5<\37"+
		"\2\u01ba\u01bf\5h\65\2\u01bb\u01bc\7\24\2\2\u01bc\u01be\5h\65\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\3\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01a9\3\2\2\2\u01c4\u01aa\3\2\2\2\u01c4\u01ab\3\2"+
		"\2\2\u01c4\u01ac\3\2\2\2\u01c4\u01ad\3\2\2\2\u01c4\u01ae\3\2\2\2\u01c4"+
		"\u01af\3\2\2\2\u01c4\u01b0\3\2\2\2\u01c4\u01b3\3\2\2\2\u01c4\u01b4\3\2"+
		"\2\2\u01c4\u01b5\3\2\2\2\u01c4\u01b7\3\2\2\2\u01c4\u01b9\3\2\2\2\u01c4"+
		"\u01ba\3\2\2\2\u01c5;\3\2\2\2\u01c6\u01c8\7)\2\2\u01c7\u01c9\5h\65\2\u01c8"+
		"\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\7\3"+
		"\2\2\u01cb=\3\2\2\2\u01cc\u01d0\7\t\2\2\u01cd\u01cf\5:\36\2\u01ce\u01cd"+
		"\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7\n\2\2\u01d4?\3\2\2\2"+
		"\u01d5\u01d7\7\22\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9"+
		"\3\2\2\2\u01d8\u01da\7*\2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\5B\"\2\u01dc\u01dd\7\3\2\2\u01ddA\3\2\2\2\u01de"+
		"\u01df\5\26\f\2\u01df\u01e0\5D#\2\u01e0C\3\2\2\2\u01e1\u01e3\5\20\t\2"+
		"\u01e2\u01e4\5F$\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01ec"+
		"\3\2\2\2\u01e5\u01e6\7\24\2\2\u01e6\u01e8\5\20\t\2\u01e7\u01e9\5F$\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e5\3\2"+
		"\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"E\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f6\5f\64\2\u01f0\u01f2\5x=\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f6"+
		"G\3\2\2\2\u01f7\u01fc\5d\63\2\u01f8\u01f9\7\24\2\2\u01f9\u01fb\5d\63\2"+
		"\u01fa\u01f8\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd"+
		"\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7\3\2\2\u0200"+
		"I\3\2\2\2\u0201\u0202\7+\2\2\u0202\u0203\7\6\2\2\u0203\u0204\5h\65\2\u0204"+
		"\u0205\7\7\2\2\u0205\u0208\5b\62\2\u0206\u0207\7,\2\2\u0207\u0209\5b\62"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209K\3\2\2\2\u020a\u020b"+
		"\7-\2\2\u020b\u020c\7\6\2\2\u020c\u020d\5h\65\2\u020d\u020e\7\7\2\2\u020e"+
		"\u020f\5b\62\2\u020fM\3\2\2\2\u0210\u0211\7.\2\2\u0211\u0212\5P)\2\u0212"+
		"\u0213\7-\2\2\u0213\u0214\7\6\2\2\u0214\u0215\5h\65\2\u0215\u0216\7\7"+
		"\2\2\u0216\u0217\7\3\2\2\u0217O\3\2\2\2\u0218\u021b\5> \2\u0219\u021b"+
		"\5:\36\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021bQ\3\2\2\2\u021c"+
		"\u021d\7/\2\2\u021d\u0220\7\6\2\2\u021e\u0221\5V,\2\u021f\u0221\5X-\2"+
		"\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223"+
		"\7\7\2\2\u0223\u0224\5b\62\2\u0224S\3\2\2\2\u0225\u022a\5`\61\2\u0226"+
		"\u0227\7\24\2\2\u0227\u0229\5`\61\2\u0228\u0226\3\2\2\2\u0229\u022c\3"+
		"\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bU\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022d\u022f\5T+\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0232\7\3\2\2\u0231\u0233\5h\65\2\u0232\u0231\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\7\3\2\2\u0235"+
		"\u0237\5T+\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2\u0237W\3\2\2\2\u0238"+
		"\u023a\7\22\2\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023d\3"+
		"\2\2\2\u023b\u023e\7\60\2\2\u023c\u023e\5\26\f\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\5\20\t\2\u0240\u0241\7"+
		"\35\2\2\u0241\u0242\5n8\2\u0242Y\3\2\2\2\u0243\u0244\7\61\2\2\u0244\u0245"+
		"\7\6\2\2\u0245\u0246\5`\61\2\u0246\u0247\7\7\2\2\u0247\u0248\5\\/\2\u0248"+
		"[\3\2\2\2\u0249\u025c\5:\36\2\u024a\u024e\7\t\2\2\u024b\u024d\5^\60\2"+
		"\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0258\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\7\62\2\2"+
		"\u0252\u0254\7\35\2\2\u0253\u0255\5:\36\2\u0254\u0253\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258"+
		"\u0251\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\7\n"+
		"\2\2\u025b\u0249\3\2\2\2\u025b\u024a\3\2\2\2\u025c]\3\2\2\2\u025d\u0265"+
		"\5:\36\2\u025e\u025f\7\63\2\2\u025f\u0260\5`\61\2\u0260\u0261\7\35\2\2"+
		"\u0261\u0265\3\2\2\2\u0262\u0263\7\'\2\2\u0263\u0265\7\3\2\2\u0264\u025d"+
		"\3\2\2\2\u0264\u025e\3\2\2\2\u0264\u0262\3\2\2\2\u0265_\3\2\2\2\u0266"+
		"\u026a\5h\65\2\u0267\u026a\5d\63\2\u0268\u026a\5B\"\2\u0269\u0266\3\2"+
		"\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026aa\3\2\2\2\u026b\u026f"+
		"\5> \2\u026c\u026f\5:\36\2\u026d\u026f\7\3\2\2\u026e\u026b\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026fc\3\2\2\2\u0270\u0271\5n8\2\u0271"+
		"\u0272\5f\64\2\u0272e\3\2\2\2\u0273\u0274\5|?\2\u0274\u0275\5n8\2\u0275"+
		"\u0277\3\2\2\2\u0276\u0273\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u027c\5|?\2\u027c\u027d\5h\65\2\u027dg\3\2\2\2\u027e\u027f\b\65\1\2\u027f"+
		"\u0288\5d\63\2\u0280\u0281\5~@\2\u0281\u0282\5h\65\6\u0282\u0288\3\2\2"+
		"\2\u0283\u0284\5\u0080A\2\u0284\u0285\5j\66\2\u0285\u0288\3\2\2\2\u0286"+
		"\u0288\5j\66\2\u0287\u027e\3\2\2\2\u0287\u0280\3\2\2\2\u0287\u0283\3\2"+
		"\2\2\u0287\u0286\3\2\2\2\u0288\u0295\3\2\2\2\u0289\u028a\f\b\2\2\u028a"+
		"\u028b\5z>\2\u028b\u028c\5h\65\t\u028c\u0294\3\2\2\2\u028d\u028e\f\3\2"+
		"\2\u028e\u028f\7\64\2\2\u028f\u0290\5h\65\2\u0290\u0291\7\35\2\2\u0291"+
		"\u0292\5h\65\4\u0292\u0294\3\2\2\2\u0293\u0289\3\2\2\2\u0293\u028d\3\2"+
		"\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"i\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u0299\7\6\2\2\u0299\u029a\5h\65\2"+
		"\u029a\u029b\7\7\2\2\u029b\u02bc\3\2\2\2\u029c\u02bc\5n8\2\u029d\u02a3"+
		"\5\26\f\2\u029e\u02a0\7\6\2\2\u029f\u02a1\5r:\2\u02a0\u029f\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\7\7\2\2\u02a3\u029e\3\2"+
		"\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02ab\3\2\2\2\u02a5\u02a6\7\65\2\2\u02a6"+
		"\u02a7\5h\65\2\u02a7\u02a8\7\66\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a5\3"+
		"\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02bc\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02bc\5t;\2\u02af\u02b0\7\67"+
		"\2\2\u02b0\u02bc\5h\65\2\u02b1\u02b2\7\6\2\2\u02b2\u02b3\5\26\f\2\u02b3"+
		"\u02b4\7\7\2\2\u02b4\u02b5\5h\65\2\u02b5\u02bc\3\2\2\2\u02b6\u02b8\7\t"+
		"\2\2\u02b7\u02b9\5l\67\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bc\7\n\2\2\u02bb\u0298\3\2\2\2\u02bb\u029c\3\2"+
		"\2\2\u02bb\u029d\3\2\2\2\u02bb\u02ae\3\2\2\2\u02bb\u02af\3\2\2\2\u02bb"+
		"\u02b1\3\2\2\2\u02bb\u02b6\3\2\2\2\u02bck\3\2\2\2\u02bd\u02c2\5h\65\2"+
		"\u02be\u02bf\7\24\2\2\u02bf\u02c1\5h\65\2\u02c0\u02be\3\2\2\2\u02c1\u02c4"+
		"\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3m\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c5\u02c7\5\20\t\2\u02c6\u02c8\5p9\2\u02c7\u02c6\3\2"+
		"\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02d2\3\2\2\2\u02c9\u02cb\5x=\2\u02ca\u02c9"+
		"\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\5v<\2\u02d0\u02d1\5n8\2"+
		"\u02d1\u02d3\3\2\2\2\u02d2\u02cc\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d7"+
		"\3\2\2\2\u02d4\u02d6\5x=\2\u02d5\u02d4\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2"+
		"\2\2\u02da\u02dc\5\u0082B\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"o\3\2\2\2\u02dd\u02df\7\6\2\2\u02de\u02e0\5r:\2\u02df\u02de\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7\7\2\2\u02e2q\3\2\2\2"+
		"\u02e3\u02e8\5h\65\2\u02e4\u02e5\7\24\2\2\u02e5\u02e7\5h\65\2\u02e6\u02e4"+
		"\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"s\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ec\t\6\2\2\u02ecu\3\2\2\2\u02ed"+
		"\u02ee\t\7\2\2\u02eew\3\2\2\2\u02ef\u02f0\7\65\2\2\u02f0\u02f1\5h\65\2"+
		"\u02f1\u02f2\7\66\2\2\u02f2\u02ff\3\2\2\2\u02f3\u02f4\7\6\2\2\u02f4\u02f9"+
		"\5h\65\2\u02f5\u02f6\7\24\2\2\u02f6\u02f8\5h\65\2\u02f7\u02f5\3\2\2\2"+
		"\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc"+
		"\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fd\7\7\2\2\u02fd\u02ff\3\2\2\2\u02fe"+
		"\u02ef\3\2\2\2\u02fe\u02f3\3\2\2\2\u02ffy\3\2\2\2\u0300\u0318\7:\2\2\u0301"+
		"\u0318\7;\2\2\u0302\u0318\7\23\2\2\u0303\u0305\7\25\2\2\u0304\u0306\7"+
		"\25\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0318\3\2\2\2\u0307"+
		"\u0318\7<\2\2\u0308\u0318\7=\2\2\u0309\u0318\7>\2\2\u030a\u0318\7?\2\2"+
		"\u030b\u0318\7\r\2\2\u030c\u0318\7\20\2\2\u030d\u0318\7@\2\2\u030e\u0318"+
		"\7A\2\2\u030f\u0318\7\17\2\2\u0310\u0318\7B\2\2\u0311\u0318\7C\2\2\u0312"+
		"\u0318\7D\2\2\u0313\u0318\7E\2\2\u0314\u0318\7F\2\2\u0315\u0318\7\16\2"+
		"\2\u0316\u0318\7G\2\2\u0317\u0300\3\2\2\2\u0317\u0301\3\2\2\2\u0317\u0302"+
		"\3\2\2\2\u0317\u0303\3\2\2\2\u0317\u0307\3\2\2\2\u0317\u0308\3\2\2\2\u0317"+
		"\u0309\3\2\2\2\u0317\u030a\3\2\2\2\u0317\u030b\3\2\2\2\u0317\u030c\3\2"+
		"\2\2\u0317\u030d\3\2\2\2\u0317\u030e\3\2\2\2\u0317\u030f\3\2\2\2\u0317"+
		"\u0310\3\2\2\2\u0317\u0311\3\2\2\2\u0317\u0312\3\2\2\2\u0317\u0313\3\2"+
		"\2\2\u0317\u0314\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0316\3\2\2\2\u0318"+
		"{\3\2\2\2\u0319\u031a\t\b\2\2\u031a}\3\2\2\2\u031b\u031c\t\t\2\2\u031c"+
		"\177\3\2\2\2\u031d\u0321\7?\2\2\u031e\u0321\7>\2\2\u031f\u0321\5\u0082"+
		"B\2\u0320\u031d\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u031f\3\2\2\2\u0321"+
		"\u0081\3\2\2\2\u0322\u0323\t\n\2\2\u0323\u0083\3\2\2\2b\u0087\u008e\u0091"+
		"\u009f\u00a5\u00aa\u00b4\u00bb\u00c5\u00cb\u00cf\u00d8\u00e1\u00ec\u00f1"+
		"\u00f4\u00f9\u0105\u0108\u010c\u0111\u0115\u0119\u011f\u0126\u012b\u012f"+
		"\u0133\u0138\u013e\u0145\u0149\u0150\u0154\u015d\u0166\u0169\u0172\u0177"+
		"\u017e\u0185\u018a\u018d\u0196\u019f\u01a5\u01bf\u01c4\u01c8\u01d0\u01d6"+
		"\u01d9\u01e3\u01e8\u01ec\u01f3\u01f5\u01fc\u0208\u021a\u0220\u022a\u022e"+
		"\u0232\u0236\u0239\u023d\u024e\u0256\u0258\u025b\u0264\u0269\u026e\u0278"+
		"\u0287\u0293\u0295\u02a0\u02a3\u02ab\u02b8\u02bb\u02c2\u02c7\u02cc\u02d2"+
		"\u02d7\u02db\u02df\u02e8\u02f9\u02fe\u0305\u0317\u0320";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}