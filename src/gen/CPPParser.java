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
		RULE_cpp = 0, RULE_mainBlock = 1, RULE_global = 2, RULE_namespace = 3, 
		RULE_using = 4, RULE_nestedNamespace = 5, RULE_id = 6, RULE_path = 7, 
		RULE_typedef = 8, RULE_datatype = 9, RULE_datatypeDefinition = 10, RULE_template = 11, 
		RULE_function = 12, RULE_functionRem = 13, RULE_functionBody = 14, RULE_parameters = 15, 
		RULE_structClass = 16, RULE_inheritance = 17, RULE_encapsulation = 18, 
		RULE_structClassBody = 19, RULE_globalClass = 20, RULE_classConstructor = 21, 
		RULE_expressionList = 22, RULE_integerType = 23, RULE_floatType = 24, 
		RULE_boolType = 25, RULE_instruction = 26, RULE_scope = 27, RULE_declarationBlock = 28, 
		RULE_declaration = 29, RULE_properDeclaration = 30, RULE_declarationType = 31, 
		RULE_assignmentBlock = 32, RULE_ifBlock = 33, RULE_whileBlock = 34, RULE_doWhileBlock = 35, 
		RULE_doWhileBody = 36, RULE_forBlock = 37, RULE_forExpression = 38, RULE_classicFor = 39, 
		RULE_forEach = 40, RULE_switchBlock = 41, RULE_switchBody = 42, RULE_switchInstruction = 43, 
		RULE_primaryExpression = 44, RULE_controlStructureBody = 45, RULE_assignment = 46, 
		RULE_properAssignment = 47, RULE_expression = 48, RULE_expression2 = 49, 
		RULE_curlyBrackets = 50, RULE_callSomething = 51, RULE_callFunction = 52, 
		RULE_functionArguments = 53, RULE_value = 54, RULE_accessOp = 55, RULE_accessBrackets = 56, 
		RULE_binOp = 57, RULE_assignmentOp = 58, RULE_unOp1 = 59, RULE_unOp2 = 60, 
		RULE_increaseOp = 61, RULE_main = 62;
	public static final String[] ruleNames = {
		"cpp", "mainBlock", "global", "namespace", "using", "nestedNamespace", 
		"id", "path", "typedef", "datatype", "datatypeDefinition", "template", 
		"function", "functionRem", "functionBody", "parameters", "structClass", 
		"inheritance", "encapsulation", "structClassBody", "globalClass", "classConstructor", 
		"expressionList", "integerType", "floatType", "boolType", "instruction", 
		"scope", "declarationBlock", "declaration", "properDeclaration", "declarationType", 
		"assignmentBlock", "ifBlock", "whileBlock", "doWhileBlock", "doWhileBody", 
		"forBlock", "forExpression", "classicFor", "forEach", "switchBlock", "switchBody", 
		"switchInstruction", "primaryExpression", "controlStructureBody", "assignment", 
		"properAssignment", "expression", "expression2", "curlyBrackets", "callSomething", 
		"callFunction", "functionArguments", "value", "accessOp", "accessBrackets", 
		"binOp", "assignmentOp", "unOp1", "unOp2", "increaseOp", "main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'namespace'", "'{'", "'}'", "'using'", "'::'", "'*'", "'&&'", 
		"'&'", "'/'", "'typedef'", "'const'", "'<'", "','", "'>'", "'unsigned'", 
		"'template'", "'class'", "'typename'", "'inline'", "'void'", "'('", "')'", 
		"'struct'", "':'", "'private'", "'protected'", "'public'", "'char'", "'short'", 
		"'int'", "'long'", "'float'", "'double'", "'bool'", "'break'", "'continue'", 
		"'return'", "'static'", "'if'", "'else'", "'while'", "'do'", "'for'", 
		"'auto'", "'switch'", "'default'", "'case'", "'?'", "'['", "']'", "'sizeof'", 
		"'.'", "'->'", "'=='", "'!='", "'<='", "'>='", "'+'", "'-'", "'%'", "'<<'", 
		"'|'", "'^'", "'and'", "'or'", "'xor'", "'||'", "'='", "'+='", "'-='", 
		"'/='", "'*='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'!'", 
		"'~'", "'--'", "'++'", "'main'"
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
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
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
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					global();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==T__83) {
				{
				setState(132);
				mainBlock();
				}
			}

			setState(135);
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

	public static class MainBlockContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			main();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
				{
				{
				setState(138);
				global();
				}
				}
				setState(143);
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
		enterRule(_localctx, 4, RULE_global);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				typedef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				structClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				assignmentBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				declarationBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				namespace();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				using();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				match(MULTILINEMACRO);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__1);
			setState(157);
			match(ID);
			setState(158);
			match(T__2);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
				{
				{
				setState(159);
				global();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__4);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(168);
				match(T__1);
				}
			}

			setState(171);
			nestedNamespace();
			setState(172);
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
		enterRule(_localctx, 10, RULE_nestedNamespace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ID);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					match(T__5);
					setState(176);
					match(ID);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 12, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(182);
				match(T__6);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(188);
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

			setState(191);
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
		enterRule(_localctx, 14, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(194);
				match(T__9);
				setState(195);
				match(ID);
				}
				}
				setState(200);
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
		enterRule(_localctx, 16, RULE_typedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__10);
			setState(202);
			datatype();
			setState(203);
			match(ID);
			setState(204);
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
		enterRule(_localctx, 18, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(206);
				match(T__11);
				}
			}

			setState(209);
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
		enterRule(_localctx, 20, RULE_datatypeDefinition);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				nestedNamespace();
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(212);
					match(T__12);
					setState(213);
					datatype();
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__13) {
						{
						{
						setState(214);
						match(T__13);
						setState(215);
						datatype();
						}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(221);
					match(T__14);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(225);
					match(T__15);
					}
				}

				setState(228);
				integerType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				floatType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
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
		enterRule(_localctx, 22, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__16);
			setState(234);
			match(T__12);
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(236);
			match(ID);
			setState(237);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(239);
				template();
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(242);
				match(T__19);
				}
			}

			setState(247);
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
				setState(245);
				datatype();
				}
				break;
			case T__20:
				{
				setState(246);
				match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
			id();
			setState(250);
			match(T__21);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__15) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || _la==ID) {
				{
				setState(251);
				parameters();
				}
			}

			setState(254);
			match(T__22);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(255);
				match(T__11);
				}
			}

			setState(258);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunctionRem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionRemContext functionRem() throws RecognitionException {
		FunctionRemContext _localctx = new FunctionRemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionRem);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				functionBody();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
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
		enterRule(_localctx, 28, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__2);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
				{
				{
				setState(265);
				instruction();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			datatype();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==ID) {
				{
				setState(274);
				properDeclaration();
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(277);
				match(T__13);
				setState(278);
				datatype();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==ID) {
					{
					setState(279);
					properDeclaration();
					}
				}

				}
				}
				setState(286);
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
		enterRule(_localctx, 32, RULE_structClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(287);
				template();
				}
			}

			setState(290);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			match(ID);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(292);
				inheritance();
				}
			}

			setState(295);
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
		enterRule(_localctx, 34, RULE_inheritance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__24);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				setState(298);
				encapsulation();
				}
			}

			setState(301);
			match(ID);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(302);
				match(T__12);
				setState(303);
				datatype();
				setState(304);
				match(T__14);
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(308);
				match(T__13);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
					{
					setState(309);
					encapsulation();
					}
				}

				setState(312);
				match(ID);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(313);
					match(T__12);
					setState(314);
					datatype();
					setState(315);
					match(T__14);
					}
				}

				}
				}
				setState(323);
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
		enterRule(_localctx, 36, RULE_encapsulation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitStructClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructClassBodyContext structClassBody() throws RecognitionException {
		StructClassBodyContext _localctx = new StructClassBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_structClassBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__2);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__38))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (ID - 85)) | (1L << (MULTILINEMACRO - 85)) | (1L << (DIRECTIVE - 85)))) != 0)) {
				{
				{
				setState(327);
				globalClass();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			match(T__3);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==ID) {
				{
				setState(334);
				properDeclaration();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(335);
					match(T__13);
					setState(336);
					properDeclaration();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(344);
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
		enterRule(_localctx, 40, RULE_globalClass);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				encapsulation();
				setState(347);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				classConstructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
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
		enterRule(_localctx, 42, RULE_classConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ID);
			setState(354);
			match(T__21);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__15) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || _la==ID) {
				{
				setState(355);
				parameters();
				}
			}

			setState(358);
			match(T__22);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(359);
				match(T__24);
				setState(360);
				match(ID);
				setState(361);
				match(T__21);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(362);
					expressionList();
					}
				}

				setState(365);
				match(T__22);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(366);
					match(T__13);
					setState(367);
					match(ID);
					setState(368);
					match(T__21);
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
						{
						setState(369);
						expressionList();
						}
					}

					setState(372);
					match(T__22);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(380);
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
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			expression(0);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(383);
				match(T__13);
				setState(384);
				expression(0);
				}
				}
				setState(389);
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
		enterRule(_localctx, 46, RULE_integerType);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(T__29);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				match(T__30);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				match(T__31);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				match(T__31);
				setState(395);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatTypeContext floatType() throws RecognitionException {
		FloatTypeContext _localctx = new FloatTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_floatType);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(T__33);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				match(T__31);
				setState(401);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolTypeContext boolType() throws RecognitionException {
		BoolTypeContext _localctx = new BoolTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_boolType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_instruction);
		int _la;
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				declarationBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				assignmentBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				ifBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				whileBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				doWhileBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
				forBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(412);
				switchBlock();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(413);
				callSomething();
				setState(414);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(416);
				scope();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(417);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(418);
				match(T__35);
				setState(419);
				match(T__0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(420);
				match(T__36);
				setState(421);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(422);
				match(T__37);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(423);
					expression(0);
					}
				}

				setState(426);
				match(T__0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(427);
				expression(0);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(428);
					match(T__13);
					setState(429);
					expression(0);
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435);
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
		enterRule(_localctx, 54, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__2);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
				{
				{
				setState(440);
				instruction();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationBlockContext declarationBlock() throws RecognitionException {
		DeclarationBlockContext _localctx = new DeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(448);
				match(T__11);
				}
				break;
			}
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(451);
				match(T__38);
				}
			}

			setState(454);
			declaration();
			setState(455);
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
		enterRule(_localctx, 58, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			datatype();
			setState(458);
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
		enterRule(_localctx, 60, RULE_properDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			id();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__49 - 22)) | (1L << (T__68 - 22)) | (1L << (T__69 - 22)) | (1L << (T__70 - 22)) | (1L << (T__71 - 22)) | (1L << (T__72 - 22)) | (1L << (T__73 - 22)) | (1L << (T__74 - 22)) | (1L << (T__75 - 22)) | (1L << (T__76 - 22)) | (1L << (T__77 - 22)) | (1L << (T__78 - 22)))) != 0)) {
				{
				setState(461);
				declarationType();
				}
			}

			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(464);
					match(T__13);
					setState(465);
					id();
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__49 - 22)) | (1L << (T__68 - 22)) | (1L << (T__69 - 22)) | (1L << (T__70 - 22)) | (1L << (T__71 - 22)) | (1L << (T__72 - 22)) | (1L << (T__73 - 22)) | (1L << (T__74 - 22)) | (1L << (T__75 - 22)) | (1L << (T__76 - 22)) | (1L << (T__77 - 22)) | (1L << (T__78 - 22)))) != 0)) {
						{
						setState(466);
						declarationType();
						}
					}

					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 62, RULE_declarationType);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__68:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				properAssignment();
				}
				break;
			case T__21:
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(475);
					accessBrackets();
					}
					}
					setState(478); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__21 || _la==T__49 );
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
		enterRule(_localctx, 64, RULE_assignmentBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			assignment();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(483);
				match(T__13);
				setState(484);
				assignment();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
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
		enterRule(_localctx, 66, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__39);
			setState(493);
			match(T__21);
			setState(494);
			expression(0);
			setState(495);
			match(T__22);
			setState(496);
			controlStructureBody();
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(497);
				match(T__40);
				setState(498);
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
		enterRule(_localctx, 68, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__41);
			setState(502);
			match(T__21);
			setState(503);
			expression(0);
			setState(504);
			match(T__22);
			setState(505);
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
		enterRule(_localctx, 70, RULE_doWhileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T__42);
			setState(508);
			doWhileBody();
			setState(509);
			match(T__41);
			setState(510);
			match(T__21);
			setState(511);
			expression(0);
			setState(512);
			match(T__22);
			setState(513);
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
		enterRule(_localctx, 72, RULE_doWhileBody);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
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
		enterRule(_localctx, 74, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(T__43);
			setState(520);
			match(T__21);
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(521);
				classicFor();
				}
				break;
			case 2:
				{
				setState(522);
				forEach();
				}
				break;
			}
			setState(525);
			match(T__22);
			setState(526);
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
		enterRule(_localctx, 76, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			primaryExpression();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(529);
				match(T__13);
				setState(530);
				primaryExpression();
				}
				}
				setState(535);
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
		enterRule(_localctx, 78, RULE_classicFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
				{
				setState(536);
				forExpression();
				}
			}

			setState(539);
			match(T__0);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
				{
				setState(540);
				expression(0);
				}
			}

			setState(543);
			match(T__0);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
				{
				setState(544);
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
		enterRule(_localctx, 80, RULE_forEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(547);
				match(T__11);
				}
				break;
			}
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				{
				setState(550);
				match(T__44);
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
				setState(551);
				datatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(554);
			id();
			setState(555);
			match(T__24);
			setState(556);
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
		enterRule(_localctx, 82, RULE_switchBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(T__45);
			setState(559);
			match(T__21);
			setState(560);
			primaryExpression();
			setState(561);
			match(T__22);
			setState(562);
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
		enterRule(_localctx, 84, RULE_switchBody);
		int _la;
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(T__2);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__47) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					{
					setState(566);
					switchInstruction();
					}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__46) {
					{
					setState(572);
					match(T__46);
					setState(573);
					match(T__24);
					setState(575); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(574);
						instruction();
						}
						}
						setState(577); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0) );
					}
				}

				setState(581);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitSwitchInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchInstructionContext switchInstruction() throws RecognitionException {
		SwitchInstructionContext _localctx = new SwitchInstructionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_switchInstruction);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(T__47);
				setState(586);
				primaryExpression();
				setState(587);
				match(T__24);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(T__35);
				setState(590);
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
		enterRule(_localctx, 88, RULE_primaryExpression);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
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
		enterRule(_localctx, 90, RULE_controlStructureBody);
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
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
		enterRule(_localctx, 92, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			callSomething();
			setState(604);
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
		enterRule(_localctx, 94, RULE_properAssignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(606);
					assignmentOp();
					setState(607);
					callSomething();
					}
					} 
				}
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(614);
			assignmentOp();
			setState(615);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(618);
				assignment();
				}
				break;
			case 2:
				{
				setState(619);
				unOp1();
				setState(620);
				expression(4);
				}
				break;
			case 3:
				{
				setState(622);
				unOp2();
				setState(623);
				expression2();
				}
				break;
			case 4:
				{
				setState(625);
				expression2();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(628);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(629);
						binOp();
						setState(630);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(633);
						match(T__48);
						setState(634);
						expression(0);
						setState(635);
						match(T__24);
						setState(636);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 98, RULE_expression2);
		int _la;
		try {
			int _alt;
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(T__21);
				setState(644);
				expression(0);
				setState(645);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				callSomething();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				datatype();
				setState(654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(649);
					match(T__21);
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
						{
						setState(650);
						functionArguments();
						}
					}

					setState(653);
					match(T__22);
					}
					break;
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(656);
						match(T__49);
						setState(657);
						expression(0);
						setState(658);
						match(T__50);
						}
						} 
					}
					setState(664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(666);
				match(T__51);
				setState(667);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(668);
				match(T__21);
				setState(669);
				datatype();
				setState(670);
				match(T__22);
				setState(671);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(673);
				match(T__2);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(674);
					curlyBrackets();
					}
				}

				setState(677);
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
		enterRule(_localctx, 100, RULE_curlyBrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			expression(0);
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(681);
				match(T__13);
				setState(682);
				expression(0);
				}
				}
				setState(687);
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
		enterRule(_localctx, 102, RULE_callSomething);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			id();
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(689);
				callFunction();
				}
				break;
			}
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21 || _la==T__49) {
					{
					{
					setState(692);
					accessBrackets();
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				accessOp();
				setState(699);
				callSomething();
				}
				break;
			}
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(703);
					accessBrackets();
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(709);
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
		enterRule(_localctx, 104, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(T__21);
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__15) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__51) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)) | (1L << (T__82 - 80)) | (1L << (ID - 80)) | (1L << (INT - 80)) | (1L << (LONG - 80)) | (1L << (LONGLONG - 80)) | (1L << (CHAR - 80)) | (1L << (DOUBLE - 80)) | (1L << (BOOL - 80)) | (1L << (STRING - 80)))) != 0)) {
				{
				setState(713);
				functionArguments();
				}
			}

			setState(716);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			expression(0);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(719);
				match(T__13);
				setState(720);
				expression(0);
				}
				}
				setState(725);
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
		enterRule(_localctx, 108, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
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
		enterRule(_localctx, 110, RULE_accessOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitAccessBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessBracketsContext accessBrackets() throws RecognitionException {
		AccessBracketsContext _localctx = new AccessBracketsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_accessBrackets);
		int _la;
		try {
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				match(T__49);
				setState(731);
				expression(0);
				setState(732);
				match(T__50);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(T__21);
				setState(735);
				expression(0);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(736);
					match(T__13);
					setState(737);
					expression(0);
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
				match(T__22);
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
		enterRule(_localctx, 114, RULE_binOp);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(T__54);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				match(T__55);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				match(T__12);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				match(T__14);
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(751);
					match(T__14);
					}
				}

				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 5);
				{
				setState(754);
				match(T__56);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 6);
				{
				setState(755);
				match(T__57);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 7);
				{
				setState(756);
				match(T__58);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 8);
				{
				setState(757);
				match(T__59);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 9);
				{
				setState(758);
				match(T__6);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 10);
				{
				setState(759);
				match(T__9);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 11);
				{
				setState(760);
				match(T__60);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 12);
				{
				setState(761);
				match(T__61);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 13);
				{
				setState(762);
				match(T__8);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 14);
				{
				setState(763);
				match(T__62);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 15);
				{
				setState(764);
				match(T__63);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 16);
				{
				setState(765);
				match(T__64);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 17);
				{
				setState(766);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 18);
				{
				setState(767);
				match(T__66);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 19);
				{
				setState(768);
				match(T__7);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 20);
				{
				setState(769);
				match(T__67);
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
		enterRule(_localctx, 116, RULE_assignmentOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (T__73 - 69)) | (1L << (T__74 - 69)) | (1L << (T__75 - 69)) | (1L << (T__76 - 69)) | (1L << (T__77 - 69)) | (1L << (T__78 - 69)))) != 0)) ) {
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
		enterRule(_localctx, 118, RULE_unOp1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			_la = _input.LA(1);
			if ( !(_la==T__79 || _la==T__80) ) {
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
		enterRule(_localctx, 120, RULE_unOp2);
		try {
			setState(779);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__59:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(T__59);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				match(T__58);
				}
				break;
			case T__81:
			case T__82:
				enterOuterAlt(_localctx, 3);
				{
				setState(778);
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
		enterRule(_localctx, 122, RULE_increaseOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_la = _input.LA(1);
			if ( !(_la==T__81 || _la==T__82) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(783);
				match(T__30);
				}
			}

			setState(786);
			match(T__83);
			setState(787);
			match(T__21);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__15) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || _la==ID) {
				{
				setState(788);
				parameters();
				}
			}

			setState(791);
			match(T__22);
			setState(792);
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
		case 48:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3c\u031d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\7\2\u0082\n\2\f\2\16\2\u0085\13\2\3\2\5\2\u0088"+
		"\n\2\3\2\3\2\3\3\3\3\7\3\u008e\n\3\f\3\16\3\u0091\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009d\n\4\3\5\3\5\3\5\3\5\7\5\u00a3\n\5\f"+
		"\5\16\5\u00a6\13\5\3\5\3\5\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7\u00b4\n\7\f\7\16\7\u00b7\13\7\3\b\7\b\u00ba\n\b\f\b\16\b\u00bd"+
		"\13\b\3\b\5\b\u00c0\n\b\3\b\3\b\3\t\3\t\3\t\7\t\u00c7\n\t\f\t\16\t\u00ca"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\13\5\13\u00d2\n\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13\f\3\f\3\f\5\f\u00e2\n\f\3\f\5\f"+
		"\u00e5\n\f\3\f\3\f\3\f\5\f\u00ea\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\5\16"+
		"\u00f3\n\16\3\16\5\16\u00f6\n\16\3\16\3\16\5\16\u00fa\n\16\3\16\3\16\3"+
		"\16\5\16\u00ff\n\16\3\16\3\16\5\16\u0103\n\16\3\16\3\16\3\17\3\17\5\17"+
		"\u0109\n\17\3\20\3\20\7\20\u010d\n\20\f\20\16\20\u0110\13\20\3\20\3\20"+
		"\3\21\3\21\5\21\u0116\n\21\3\21\3\21\3\21\5\21\u011b\n\21\7\21\u011d\n"+
		"\21\f\21\16\21\u0120\13\21\3\22\5\22\u0123\n\22\3\22\3\22\3\22\5\22\u0128"+
		"\n\22\3\22\3\22\3\23\3\23\5\23\u012e\n\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0135\n\23\3\23\3\23\5\23\u0139\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0140"+
		"\n\23\7\23\u0142\n\23\f\23\16\23\u0145\13\23\3\24\3\24\3\25\3\25\7\25"+
		"\u014b\n\25\f\25\16\25\u014e\13\25\3\25\3\25\3\25\3\25\7\25\u0154\n\25"+
		"\f\25\16\25\u0157\13\25\5\25\u0159\n\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0162\n\26\3\27\3\27\3\27\5\27\u0167\n\27\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u016e\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0175\n\27\3\27"+
		"\7\27\u0178\n\27\f\27\16\27\u017b\13\27\5\27\u017d\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\7\30\u0184\n\30\f\30\16\30\u0187\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u018f\n\31\3\32\3\32\3\32\3\32\5\32\u0195\n\32\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u01ab\n\34\3\34\3\34\3\34\3\34\7\34\u01b1"+
		"\n\34\f\34\16\34\u01b4\13\34\3\34\3\34\5\34\u01b8\n\34\3\35\3\35\7\35"+
		"\u01bc\n\35\f\35\16\35\u01bf\13\35\3\35\3\35\3\36\5\36\u01c4\n\36\3\36"+
		"\5\36\u01c7\n\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \5 \u01d1\n \3 \3"+
		" \3 \5 \u01d6\n \7 \u01d8\n \f \16 \u01db\13 \3!\3!\6!\u01df\n!\r!\16"+
		"!\u01e0\5!\u01e3\n!\3\"\3\"\3\"\7\"\u01e8\n\"\f\"\16\"\u01eb\13\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u01f6\n#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\5&\u0208\n&\3\'\3\'\3\'\3\'\5\'\u020e\n\'\3\'\3\'\3\'"+
		"\3(\3(\3(\7(\u0216\n(\f(\16(\u0219\13(\3)\5)\u021c\n)\3)\3)\5)\u0220\n"+
		")\3)\3)\5)\u0224\n)\3*\5*\u0227\n*\3*\3*\5*\u022b\n*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\7,\u023a\n,\f,\16,\u023d\13,\3,\3,\3,\6,\u0242"+
		"\n,\r,\16,\u0243\5,\u0246\n,\3,\5,\u0249\n,\3-\3-\3-\3-\3-\3-\3-\5-\u0252"+
		"\n-\3.\3.\3.\5.\u0257\n.\3/\3/\3/\5/\u025c\n/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\7\61\u0264\n\61\f\61\16\61\u0267\13\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0275\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0281\n\62\f\62\16\62\u0284\13\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u028e\n\63\3\63\5\63\u0291"+
		"\n\63\3\63\3\63\3\63\3\63\7\63\u0297\n\63\f\63\16\63\u029a\13\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02a6\n\63\3\63\5\63"+
		"\u02a9\n\63\3\64\3\64\3\64\7\64\u02ae\n\64\f\64\16\64\u02b1\13\64\3\65"+
		"\3\65\5\65\u02b5\n\65\3\65\7\65\u02b8\n\65\f\65\16\65\u02bb\13\65\3\65"+
		"\3\65\3\65\5\65\u02c0\n\65\3\65\7\65\u02c3\n\65\f\65\16\65\u02c6\13\65"+
		"\3\65\5\65\u02c9\n\65\3\66\3\66\5\66\u02cd\n\66\3\66\3\66\3\67\3\67\3"+
		"\67\7\67\u02d4\n\67\f\67\16\67\u02d7\13\67\38\38\39\39\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\7:\u02e5\n:\f:\16:\u02e8\13:\3:\3:\5:\u02ec\n:\3;\3;\3;\3;\3"+
		";\5;\u02f3\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0305"+
		"\n;\3<\3<\3=\3=\3>\3>\3>\5>\u030e\n>\3?\3?\3@\5@\u0313\n@\3@\3@\3@\5@"+
		"\u0318\n@\3@\3@\3@\3@\2\3bA\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\13\3\2\n\13"+
		"\3\2\24\25\4\2\24\24\32\32\3\2\34\36\3\2[a\3\2\678\3\2GQ\3\2RS\3\2TU\u0375"+
		"\2\u0083\3\2\2\2\4\u008b\3\2\2\2\6\u009c\3\2\2\2\b\u009e\3\2\2\2\n\u00a9"+
		"\3\2\2\2\f\u00b0\3\2\2\2\16\u00bb\3\2\2\2\20\u00c3\3\2\2\2\22\u00cb\3"+
		"\2\2\2\24\u00d1\3\2\2\2\26\u00e9\3\2\2\2\30\u00eb\3\2\2\2\32\u00f2\3\2"+
		"\2\2\34\u0108\3\2\2\2\36\u010a\3\2\2\2 \u0113\3\2\2\2\"\u0122\3\2\2\2"+
		"$\u012b\3\2\2\2&\u0146\3\2\2\2(\u0148\3\2\2\2*\u0161\3\2\2\2,\u0163\3"+
		"\2\2\2.\u0180\3\2\2\2\60\u018e\3\2\2\2\62\u0194\3\2\2\2\64\u0196\3\2\2"+
		"\2\66\u01b7\3\2\2\28\u01b9\3\2\2\2:\u01c3\3\2\2\2<\u01cb\3\2\2\2>\u01ce"+
		"\3\2\2\2@\u01e2\3\2\2\2B\u01e4\3\2\2\2D\u01ee\3\2\2\2F\u01f7\3\2\2\2H"+
		"\u01fd\3\2\2\2J\u0207\3\2\2\2L\u0209\3\2\2\2N\u0212\3\2\2\2P\u021b\3\2"+
		"\2\2R\u0226\3\2\2\2T\u0230\3\2\2\2V\u0248\3\2\2\2X\u0251\3\2\2\2Z\u0256"+
		"\3\2\2\2\\\u025b\3\2\2\2^\u025d\3\2\2\2`\u0265\3\2\2\2b\u0274\3\2\2\2"+
		"d\u02a8\3\2\2\2f\u02aa\3\2\2\2h\u02b2\3\2\2\2j\u02ca\3\2\2\2l\u02d0\3"+
		"\2\2\2n\u02d8\3\2\2\2p\u02da\3\2\2\2r\u02eb\3\2\2\2t\u0304\3\2\2\2v\u0306"+
		"\3\2\2\2x\u0308\3\2\2\2z\u030d\3\2\2\2|\u030f\3\2\2\2~\u0312\3\2\2\2\u0080"+
		"\u0082\5\6\4\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\7\2\2\3\u008a\3\3\2\2\2\u008b\u008f\5~@\2\u008c\u008e"+
		"\5\6\4\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\5\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u009d\5\22\n"+
		"\2\u0093\u009d\5\"\22\2\u0094\u009d\5B\"\2\u0095\u009d\5:\36\2\u0096\u009d"+
		"\5\32\16\2\u0097\u009d\5\b\5\2\u0098\u009d\5\n\6\2\u0099\u009d\7\3\2\2"+
		"\u009a\u009d\7b\2\2\u009b\u009d\7c\2\2\u009c\u0092\3\2\2\2\u009c\u0093"+
		"\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c"+
		"\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\7\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0"+
		"\7W\2\2\u00a0\u00a4\7\5\2\2\u00a1\u00a3\5\6\4\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\6\2\2\u00a8\t\3\2\2\2\u00a9\u00ab"+
		"\7\7\2\2\u00aa\u00ac\7\4\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\7\3\2\2\u00af\13\3\2\2"+
		"\2\u00b0\u00b5\7W\2\2\u00b1\u00b2\7\b\2\2\u00b2\u00b4\7W\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\r\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\7\t\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5\f\7\2\u00c2\17\3\2\2"+
		"\2\u00c3\u00c8\7W\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c7\7W\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\21\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\5\24\13"+
		"\2\u00cd\u00ce\7W\2\2\u00ce\u00cf\7\3\2\2\u00cf\23\3\2\2\2\u00d0\u00d2"+
		"\7\16\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2"+
		"\u00d3\u00d4\5\26\f\2\u00d4\25\3\2\2\2\u00d5\u00e1\5\f\7\2\u00d6\u00d7"+
		"\7\17\2\2\u00d7\u00dc\5\24\13\2\u00d8\u00d9\7\20\2\2\u00d9\u00db\5\24"+
		"\13\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\21"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00ea\3\2\2\2\u00e3\u00e5\7\22\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ea\5\60\31\2\u00e7\u00ea\5\62\32\2"+
		"\u00e8\u00ea\5\64\33\2\u00e9\u00d5\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\27\3\2\2\2\u00eb\u00ec\7\23\2\2\u00ec"+
		"\u00ed\7\17\2\2\u00ed\u00ee\t\3\2\2\u00ee\u00ef\7W\2\2\u00ef\u00f0\7\21"+
		"\2\2\u00f0\31\3\2\2\2\u00f1\u00f3\5\30\r\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\7\26\2\2\u00f5\u00f4\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00fa\5\24\13\2\u00f8\u00fa"+
		"\7\27\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\u00fc\5\16\b\2\u00fc\u00fe\7\30\2\2\u00fd\u00ff\5 \21\2\u00fe\u00fd"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\7\31\2\2"+
		"\u0101\u0103\7\16\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\5\34\17\2\u0105\33\3\2\2\2\u0106\u0109\5\36\20\2"+
		"\u0107\u0109\7\3\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\35"+
		"\3\2\2\2\u010a\u010e\7\5\2\2\u010b\u010d\5\66\34\2\u010c\u010b\3\2\2\2"+
		"\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\6\2\2\u0112\37\3\2\2\2\u0113"+
		"\u0115\5\24\13\2\u0114\u0116\5> \2\u0115\u0114\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u011e\3\2\2\2\u0117\u0118\7\20\2\2\u0118\u011a\5\24\13\2\u0119"+
		"\u011b\5> \2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2"+
		"\2\u011c\u0117\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f!\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\5\30\r\2\u0122"+
		"\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\t\4"+
		"\2\2\u0125\u0127\7W\2\2\u0126\u0128\5$\23\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\5(\25\2\u012a#\3\2\2\2"+
		"\u012b\u012d\7\33\2\2\u012c\u012e\5&\24\2\u012d\u012c\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0134\7W\2\2\u0130\u0131\7\17\2\2\u0131"+
		"\u0132\5\24\13\2\u0132\u0133\7\21\2\2\u0133\u0135\3\2\2\2\u0134\u0130"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0143\3\2\2\2\u0136\u0138\7\20\2\2"+
		"\u0137\u0139\5&\24\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013f\7W\2\2\u013b\u013c\7\17\2\2\u013c\u013d\5\24\13\2"+
		"\u013d\u013e\7\21\2\2\u013e\u0140\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0136\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144%\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0146\u0147\t\5\2\2\u0147\'\3\2\2\2\u0148\u014c\7\5\2\2\u0149\u014b\5"+
		"*\26\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0158\7\6"+
		"\2\2\u0150\u0155\5> \2\u0151\u0152\7\20\2\2\u0152\u0154\5> \2\u0153\u0151"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0150\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\3\2\2\u015b)\3\2\2\2\u015c\u015d"+
		"\5&\24\2\u015d\u015e\7\33\2\2\u015e\u0162\3\2\2\2\u015f\u0162\5,\27\2"+
		"\u0160\u0162\5\6\4\2\u0161\u015c\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160"+
		"\3\2\2\2\u0162+\3\2\2\2\u0163\u0164\7W\2\2\u0164\u0166\7\30\2\2\u0165"+
		"\u0167\5 \21\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u017c\7\31\2\2\u0169\u016a\7\33\2\2\u016a\u016b\7W\2\2\u016b"+
		"\u016d\7\30\2\2\u016c\u016e\5.\30\2\u016d\u016c\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016f\u0179\7\31\2\2\u0170\u0171\7\20\2\2\u0171"+
		"\u0172\7W\2\2\u0172\u0174\7\30\2\2\u0173\u0175\5.\30\2\u0174\u0173\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\7\31\2\2\u0177"+
		"\u0170\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0169\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\58\35\2\u017f-\3\2\2\2"+
		"\u0180\u0185\5b\62\2\u0181\u0182\7\20\2\2\u0182\u0184\5b\62\2\u0183\u0181"+
		"\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"/\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018f\7\37\2\2\u0189\u018f\7 \2\2"+
		"\u018a\u018f\7!\2\2\u018b\u018f\7\"\2\2\u018c\u018d\7\"\2\2\u018d\u018f"+
		"\7\"\2\2\u018e\u0188\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018e"+
		"\u018b\3\2\2\2\u018e\u018c\3\2\2\2\u018f\61\3\2\2\2\u0190\u0195\7#\2\2"+
		"\u0191\u0195\7$\2\2\u0192\u0193\7\"\2\2\u0193\u0195\7$\2\2\u0194\u0190"+
		"\3\2\2\2\u0194\u0191\3\2\2\2\u0194\u0192\3\2\2\2\u0195\63\3\2\2\2\u0196"+
		"\u0197\7%\2\2\u0197\65\3\2\2\2\u0198\u01b8\5:\36\2\u0199\u01b8\5B\"\2"+
		"\u019a\u01b8\5D#\2\u019b\u01b8\5F$\2\u019c\u01b8\5H%\2\u019d\u01b8\5L"+
		"\'\2\u019e\u01b8\5T+\2\u019f\u01a0\5h\65\2\u01a0\u01a1\7\3\2\2\u01a1\u01b8"+
		"\3\2\2\2\u01a2\u01b8\58\35\2\u01a3\u01b8\7\3\2\2\u01a4\u01a5\7&\2\2\u01a5"+
		"\u01b8\7\3\2\2\u01a6\u01a7\7\'\2\2\u01a7\u01b8\7\3\2\2\u01a8\u01aa\7("+
		"\2\2\u01a9\u01ab\5b\62\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01b8\7\3\2\2\u01ad\u01b2\5b\62\2\u01ae\u01af\7\20"+
		"\2\2\u01af\u01b1\5b\62\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01b6\7\3\2\2\u01b6\u01b8\3\2\2\2\u01b7\u0198\3\2\2\2\u01b7"+
		"\u0199\3\2\2\2\u01b7\u019a\3\2\2\2\u01b7\u019b\3\2\2\2\u01b7\u019c\3\2"+
		"\2\2\u01b7\u019d\3\2\2\2\u01b7\u019e\3\2\2\2\u01b7\u019f\3\2\2\2\u01b7"+
		"\u01a2\3\2\2\2\u01b7\u01a3\3\2\2\2\u01b7\u01a4\3\2\2\2\u01b7\u01a6\3\2"+
		"\2\2\u01b7\u01a8\3\2\2\2\u01b7\u01ad\3\2\2\2\u01b8\67\3\2\2\2\u01b9\u01bd"+
		"\7\5\2\2\u01ba\u01bc\5\66\34\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2"+
		"\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01c0\u01c1\7\6\2\2\u01c19\3\2\2\2\u01c2\u01c4\7\16\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c7\7)"+
		"\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\5<\37\2\u01c9\u01ca\7\3\2\2\u01ca;\3\2\2\2\u01cb\u01cc\5\24\13"+
		"\2\u01cc\u01cd\5> \2\u01cd=\3\2\2\2\u01ce\u01d0\5\16\b\2\u01cf\u01d1\5"+
		"@!\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d9\3\2\2\2\u01d2"+
		"\u01d3\7\20\2\2\u01d3\u01d5\5\16\b\2\u01d4\u01d6\5@!\2\u01d5\u01d4\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d8"+
		"\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da?\3\2\2\2"+
		"\u01db\u01d9\3\2\2\2\u01dc\u01e3\5`\61\2\u01dd\u01df\5r:\2\u01de\u01dd"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01de\3\2\2\2\u01e3A\3\2\2\2"+
		"\u01e4\u01e9\5^\60\2\u01e5\u01e6\7\20\2\2\u01e6\u01e8\5^\60\2\u01e7\u01e5"+
		"\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7\3\2\2\u01edC\3\2\2\2"+
		"\u01ee\u01ef\7*\2\2\u01ef\u01f0\7\30\2\2\u01f0\u01f1\5b\62\2\u01f1\u01f2"+
		"\7\31\2\2\u01f2\u01f5\5\\/\2\u01f3\u01f4\7+\2\2\u01f4\u01f6\5\\/\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6E\3\2\2\2\u01f7\u01f8\7,\2\2\u01f8"+
		"\u01f9\7\30\2\2\u01f9\u01fa\5b\62\2\u01fa\u01fb\7\31\2\2\u01fb\u01fc\5"+
		"\\/\2\u01fcG\3\2\2\2\u01fd\u01fe\7-\2\2\u01fe\u01ff\5J&\2\u01ff\u0200"+
		"\7,\2\2\u0200\u0201\7\30\2\2\u0201\u0202\5b\62\2\u0202\u0203\7\31\2\2"+
		"\u0203\u0204\7\3\2\2\u0204I\3\2\2\2\u0205\u0208\58\35\2\u0206\u0208\5"+
		"\66\34\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208K\3\2\2\2\u0209"+
		"\u020a\7.\2\2\u020a\u020d\7\30\2\2\u020b\u020e\5P)\2\u020c\u020e\5R*\2"+
		"\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210"+
		"\7\31\2\2\u0210\u0211\5\\/\2\u0211M\3\2\2\2\u0212\u0217\5Z.\2\u0213\u0214"+
		"\7\20\2\2\u0214\u0216\5Z.\2\u0215\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218O\3\2\2\2\u0219\u0217\3\2\2\2"+
		"\u021a\u021c\5N(\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021f\7\3\2\2\u021e\u0220\5b\62\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\7\3\2\2\u0222\u0224\5N"+
		"(\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224Q\3\2\2\2\u0225\u0227"+
		"\7\16\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a\3\2\2\2"+
		"\u0228\u022b\7/\2\2\u0229\u022b\5\24\13\2\u022a\u0228\3\2\2\2\u022a\u0229"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\5\16\b\2\u022d\u022e\7\33\2\2"+
		"\u022e\u022f\5h\65\2\u022fS\3\2\2\2\u0230\u0231\7\60\2\2\u0231\u0232\7"+
		"\30\2\2\u0232\u0233\5Z.\2\u0233\u0234\7\31\2\2\u0234\u0235\5V,\2\u0235"+
		"U\3\2\2\2\u0236\u0249\5\66\34\2\u0237\u023b\7\5\2\2\u0238\u023a\5X-\2"+
		"\u0239\u0238\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u0245\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7\61\2\2"+
		"\u023f\u0241\7\33\2\2\u0240\u0242\5\66\34\2\u0241\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2"+
		"\2\2\u0245\u023e\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0249\7\6\2\2\u0248\u0236\3\2\2\2\u0248\u0237\3\2\2\2\u0249W\3\2\2\2"+
		"\u024a\u0252\5\66\34\2\u024b\u024c\7\62\2\2\u024c\u024d\5Z.\2\u024d\u024e"+
		"\7\33\2\2\u024e\u0252\3\2\2\2\u024f\u0250\7&\2\2\u0250\u0252\7\3\2\2\u0251"+
		"\u024a\3\2\2\2\u0251\u024b\3\2\2\2\u0251\u024f\3\2\2\2\u0252Y\3\2\2\2"+
		"\u0253\u0257\5b\62\2\u0254\u0257\5^\60\2\u0255\u0257\5<\37\2\u0256\u0253"+
		"\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0255\3\2\2\2\u0257[\3\2\2\2\u0258"+
		"\u025c\58\35\2\u0259\u025c\5\66\34\2\u025a\u025c\7\3\2\2\u025b\u0258\3"+
		"\2\2\2\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025c]\3\2\2\2\u025d\u025e"+
		"\5h\65\2\u025e\u025f\5`\61\2\u025f_\3\2\2\2\u0260\u0261\5v<\2\u0261\u0262"+
		"\5h\65\2\u0262\u0264\3\2\2\2\u0263\u0260\3\2\2\2\u0264\u0267\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2"+
		"\2\2\u0268\u0269\5v<\2\u0269\u026a\5b\62\2\u026aa\3\2\2\2\u026b\u026c"+
		"\b\62\1\2\u026c\u0275\5^\60\2\u026d\u026e\5x=\2\u026e\u026f\5b\62\6\u026f"+
		"\u0275\3\2\2\2\u0270\u0271\5z>\2\u0271\u0272\5d\63\2\u0272\u0275\3\2\2"+
		"\2\u0273\u0275\5d\63\2\u0274\u026b\3\2\2\2\u0274\u026d\3\2\2\2\u0274\u0270"+
		"\3\2\2\2\u0274\u0273\3\2\2\2\u0275\u0282\3\2\2\2\u0276\u0277\f\b\2\2\u0277"+
		"\u0278\5t;\2\u0278\u0279\5b\62\t\u0279\u0281\3\2\2\2\u027a\u027b\f\3\2"+
		"\2\u027b\u027c\7\63\2\2\u027c\u027d\5b\62\2\u027d\u027e\7\33\2\2\u027e"+
		"\u027f\5b\62\4\u027f\u0281\3\2\2\2\u0280\u0276\3\2\2\2\u0280\u027a\3\2"+
		"\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"c\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286\7\30\2\2\u0286\u0287\5b\62\2"+
		"\u0287\u0288\7\31\2\2\u0288\u02a9\3\2\2\2\u0289\u02a9\5h\65\2\u028a\u0290"+
		"\5\24\13\2\u028b\u028d\7\30\2\2\u028c\u028e\5l\67\2\u028d\u028c\3\2\2"+
		"\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\7\31\2\2\u0290"+
		"\u028b\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0298\3\2\2\2\u0292\u0293\7\64"+
		"\2\2\u0293\u0294\5b\62\2\u0294\u0295\7\65\2\2\u0295\u0297\3\2\2\2\u0296"+
		"\u0292\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u02a9\3\2\2\2\u029a\u0298\3\2\2\2\u029b\u02a9\5n8\2\u029c\u029d"+
		"\7\66\2\2\u029d\u02a9\5b\62\2\u029e\u029f\7\30\2\2\u029f\u02a0\5\24\13"+
		"\2\u02a0\u02a1\7\31\2\2\u02a1\u02a2\5b\62\2\u02a2\u02a9\3\2\2\2\u02a3"+
		"\u02a5\7\5\2\2\u02a4\u02a6\5f\64\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\7\6\2\2\u02a8\u0285\3\2\2\2\u02a8"+
		"\u0289\3\2\2\2\u02a8\u028a\3\2\2\2\u02a8\u029b\3\2\2\2\u02a8\u029c\3\2"+
		"\2\2\u02a8\u029e\3\2\2\2\u02a8\u02a3\3\2\2\2\u02a9e\3\2\2\2\u02aa\u02af"+
		"\5b\62\2\u02ab\u02ac\7\20\2\2\u02ac\u02ae\5b\62\2\u02ad\u02ab\3\2\2\2"+
		"\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0g\3"+
		"\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4\5\16\b\2\u02b3\u02b5\5j\66\2\u02b4"+
		"\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02bf\3\2\2\2\u02b6\u02b8\5r"+
		":\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\5p"+
		"9\2\u02bd\u02be\5h\65\2\u02be\u02c0\3\2\2\2\u02bf\u02b9\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c4\3\2\2\2\u02c1\u02c3\5r:\2\u02c2\u02c1\3\2\2"+
		"\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c8"+
		"\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\5|?\2\u02c8\u02c7\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9i\3\2\2\2\u02ca\u02cc\7\30\2\2\u02cb\u02cd\5l\67\2"+
		"\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf"+
		"\7\31\2\2\u02cfk\3\2\2\2\u02d0\u02d5\5b\62\2\u02d1\u02d2\7\20\2\2\u02d2"+
		"\u02d4\5b\62\2\u02d3\u02d1\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6m\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9"+
		"\t\6\2\2\u02d9o\3\2\2\2\u02da\u02db\t\7\2\2\u02dbq\3\2\2\2\u02dc\u02dd"+
		"\7\64\2\2\u02dd\u02de\5b\62\2\u02de\u02df\7\65\2\2\u02df\u02ec\3\2\2\2"+
		"\u02e0\u02e1\7\30\2\2\u02e1\u02e6\5b\62\2\u02e2\u02e3\7\20\2\2\u02e3\u02e5"+
		"\5b\62\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ea\7\31"+
		"\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02dc\3\2\2\2\u02eb\u02e0\3\2\2\2\u02ec"+
		"s\3\2\2\2\u02ed\u0305\79\2\2\u02ee\u0305\7:\2\2\u02ef\u0305\7\17\2\2\u02f0"+
		"\u02f2\7\21\2\2\u02f1\u02f3\7\21\2\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3"+
		"\2\2\2\u02f3\u0305\3\2\2\2\u02f4\u0305\7;\2\2\u02f5\u0305\7<\2\2\u02f6"+
		"\u0305\7=\2\2\u02f7\u0305\7>\2\2\u02f8\u0305\7\t\2\2\u02f9\u0305\7\f\2"+
		"\2\u02fa\u0305\7?\2\2\u02fb\u0305\7@\2\2\u02fc\u0305\7\13\2\2\u02fd\u0305"+
		"\7A\2\2\u02fe\u0305\7B\2\2\u02ff\u0305\7C\2\2\u0300\u0305\7D\2\2\u0301"+
		"\u0305\7E\2\2\u0302\u0305\7\n\2\2\u0303\u0305\7F\2\2\u0304\u02ed\3\2\2"+
		"\2\u0304\u02ee\3\2\2\2\u0304\u02ef\3\2\2\2\u0304\u02f0\3\2\2\2\u0304\u02f4"+
		"\3\2\2\2\u0304\u02f5\3\2\2\2\u0304\u02f6\3\2\2\2\u0304\u02f7\3\2\2\2\u0304"+
		"\u02f8\3\2\2\2\u0304\u02f9\3\2\2\2\u0304\u02fa\3\2\2\2\u0304\u02fb\3\2"+
		"\2\2\u0304\u02fc\3\2\2\2\u0304\u02fd\3\2\2\2\u0304\u02fe\3\2\2\2\u0304"+
		"\u02ff\3\2\2\2\u0304\u0300\3\2\2\2\u0304\u0301\3\2\2\2\u0304\u0302\3\2"+
		"\2\2\u0304\u0303\3\2\2\2\u0305u\3\2\2\2\u0306\u0307\t\b\2\2\u0307w\3\2"+
		"\2\2\u0308\u0309\t\t\2\2\u0309y\3\2\2\2\u030a\u030e\7>\2\2\u030b\u030e"+
		"\7=\2\2\u030c\u030e\5|?\2\u030d\u030a\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030c\3\2\2\2\u030e{\3\2\2\2\u030f\u0310\t\n\2\2\u0310}\3\2\2\2\u0311"+
		"\u0313\7!\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2"+
		"\2\2\u0314\u0315\7V\2\2\u0315\u0317\7\30\2\2\u0316\u0318\5 \21\2\u0317"+
		"\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\7\31"+
		"\2\2\u031a\u031b\5\36\20\2\u031b\177\3\2\2\2b\u0083\u0087\u008f\u009c"+
		"\u00a4\u00ab\u00b5\u00bb\u00bf\u00c8\u00d1\u00dc\u00e1\u00e4\u00e9\u00f2"+
		"\u00f5\u00f9\u00fe\u0102\u0108\u010e\u0115\u011a\u011e\u0122\u0127\u012d"+
		"\u0134\u0138\u013f\u0143\u014c\u0155\u0158\u0161\u0166\u016d\u0174\u0179"+
		"\u017c\u0185\u018e\u0194\u01aa\u01b2\u01b7\u01bd\u01c3\u01c6\u01d0\u01d5"+
		"\u01d9\u01e0\u01e2\u01e9\u01f5\u0207\u020d\u0217\u021b\u021f\u0223\u0226"+
		"\u022a\u023b\u0243\u0245\u0248\u0251\u0256\u025b\u0265\u0274\u0280\u0282"+
		"\u028d\u0290\u0298\u02a5\u02a8\u02af\u02b4\u02b9\u02bf\u02c4\u02c8\u02cc"+
		"\u02d5\u02e6\u02eb\u02f2\u0304\u030d\u0312\u0317";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}