// Generated from QueuingT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueuingTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABR_CC=1, CRR_CC=2, ABR_CR=3, CRR_CR=4, NOT=5, MULT=6, DIV=7, MOD=8, MAS=9, 
		MENOS=10, MENQ=11, MENIG=12, MAYQ=13, MAYIG=14, IGL=15, NIGL=16, AND=17, 
		OR=18, EQ=19, COMA=20, PYC=21, CML=22, EXP=23, UN=24, NODES=25, CUSIQ=26, 
		DESNODO=27, ATRSD=28, NSN=29, ATRQD=30, ARTID=31, CONEX=32, ATRIDS=33, 
		ATRIDE=34, PBB=35, SIM=36, ANLT=37, ACS=38, ACQ=39, TCS=40, TCQ=41, US=42, 
		INT=43, ID=44, STR=45, SIGINT=46, DOBL=47, LETRAS=48, CMT_MULTI=49, CMT_SIMPL=50, 
		WS=51;
	public static final String[] tokenNames = {
		"<INVALID>", "'['", "']'", "'('", "')'", "'not'", "'*'", "'/'", "'%'", 
		"'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", 
		"'='", "','", "';'", "'''", "'exponential'", "'uniform'", "'nodes'", "'customers_in_queue'", 
		"'describe_node'", "'server_distribution'", "'number_of_servers'", "'queue_distribution'", 
		"'id'", "'describe_connection'", "'id_start'", "'id_end'", "'probability'", 
		"'simulation_time'", "'analytics'", "'avg_customer_system'", "'avg_customer_queue'", 
		"'avgt_customer_system'", "'avgt_customer_queue'", "'use_of_servers'", 
		"INT", "ID", "STR", "SIGINT", "DOBL", "LETRAS", "CMT_MULTI", "CMT_SIMPL", 
		"WS"
	};
	public static final int
		RULE_codigo = 0, RULE_head = 1, RULE_network_description = 2, RULE_node_description = 3, 
		RULE_node_property = 4, RULE_propertyid = 5, RULE_propertyqd = 6, RULE_propertysd = 7, 
		RULE_propertynumberofservers = 8, RULE_propertycustinq = 9, RULE_dist = 10, 
		RULE_und = 11, RULE_expd = 12, RULE_connection = 13, RULE_id_con = 14, 
		RULE_prob = 15, RULE_propertyidstart = 16, RULE_propertyidend = 17, RULE_footer = 18, 
		RULE_stime = 19, RULE_analitics = 20;
	public static final String[] ruleNames = {
		"codigo", "head", "network_description", "node_description", "node_property", 
		"propertyid", "propertyqd", "propertysd", "propertynumberofservers", "propertycustinq", 
		"dist", "und", "expd", "connection", "id_con", "prob", "propertyidstart", 
		"propertyidend", "footer", "stime", "analitics"
	};

	@Override
	public String getGrammarFileName() { return "QueuingT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueuingTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodigoContext extends ParserRuleContext {
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public Network_descriptionContext network_description() {
			return getRuleContext(Network_descriptionContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); head();
			setState(43); network_description();
			setState(44); footer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode NODES() { return getToken(QueuingTParser.NODES, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(NODES);
			setState(47); match(EQ);
			setState(48); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Network_descriptionContext extends ParserRuleContext {
		public Node_descriptionContext node_description(int i) {
			return getRuleContext(Node_descriptionContext.class,i);
		}
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
		}
		public List<Node_descriptionContext> node_description() {
			return getRuleContexts(Node_descriptionContext.class);
		}
		public Network_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_network_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterNetwork_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitNetwork_description(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitNetwork_description(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Network_descriptionContext network_description() throws RecognitionException {
		Network_descriptionContext _localctx = new Network_descriptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_network_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DESNODO || _la==CONEX) {
				{
				setState(52);
				switch (_input.LA(1)) {
				case DESNODO:
					{
					setState(50); node_description();
					}
					break;
				case CONEX:
					{
					setState(51); connection();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(56);
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

	public static class Node_descriptionContext extends ParserRuleContext {
		public TerminalNode DESNODO() { return getToken(QueuingTParser.DESNODO, 0); }
		public List<Node_propertyContext> node_property() {
			return getRuleContexts(Node_propertyContext.class);
		}
		public TerminalNode CRR_CC() { return getToken(QueuingTParser.CRR_CC, 0); }
		public Node_propertyContext node_property(int i) {
			return getRuleContext(Node_propertyContext.class,i);
		}
		public TerminalNode ABR_CC() { return getToken(QueuingTParser.ABR_CC, 0); }
		public Node_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterNode_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitNode_description(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitNode_description(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_descriptionContext node_description() throws RecognitionException {
		Node_descriptionContext _localctx = new Node_descriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node_description);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(DESNODO);
			setState(58); match(ABR_CC);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUSIQ) | (1L << ATRSD) | (1L << NSN) | (1L << ATRQD) | (1L << ARTID))) != 0)) {
				{
				{
				setState(59); node_property();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(CRR_CC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_propertyContext extends ParserRuleContext {
		public PropertysdContext propertysd() {
			return getRuleContext(PropertysdContext.class,0);
		}
		public PropertynumberofserversContext propertynumberofservers() {
			return getRuleContext(PropertynumberofserversContext.class,0);
		}
		public PropertyqdContext propertyqd() {
			return getRuleContext(PropertyqdContext.class,0);
		}
		public PropertyidContext propertyid() {
			return getRuleContext(PropertyidContext.class,0);
		}
		public PropertycustinqContext propertycustinq() {
			return getRuleContext(PropertycustinqContext.class,0);
		}
		public Node_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterNode_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitNode_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitNode_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_propertyContext node_property() throws RecognitionException {
		Node_propertyContext _localctx = new Node_propertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_node_property);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case ARTID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); propertyid();
				}
				break;
			case ATRQD:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); propertyqd();
				}
				break;
			case ATRSD:
				enterOuterAlt(_localctx, 3);
				{
				setState(69); propertysd();
				}
				break;
			case NSN:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); propertynumberofservers();
				}
				break;
			case CUSIQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(71); propertycustinq();
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

	public static class PropertyidContext extends ParserRuleContext {
		public TerminalNode ARTID() { return getToken(QueuingTParser.ARTID, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public PropertyidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterPropertyid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitPropertyid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitPropertyid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyidContext propertyid() throws RecognitionException {
		PropertyidContext _localctx = new PropertyidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propertyid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(ARTID);
			setState(75); match(EQ);
			setState(76); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyqdContext extends ParserRuleContext {
		public TerminalNode ATRQD() { return getToken(QueuingTParser.ATRQD, 0); }
		public DistContext dist() {
			return getRuleContext(DistContext.class,0);
		}
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public PropertyqdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyqd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterPropertyqd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitPropertyqd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitPropertyqd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyqdContext propertyqd() throws RecognitionException {
		PropertyqdContext _localctx = new PropertyqdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_propertyqd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(ATRQD);
			setState(79); match(EQ);
			setState(80); dist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertysdContext extends ParserRuleContext {
		public TerminalNode ATRSD() { return getToken(QueuingTParser.ATRSD, 0); }
		public DistContext dist() {
			return getRuleContext(DistContext.class,0);
		}
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public PropertysdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertysd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterPropertysd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitPropertysd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitPropertysd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertysdContext propertysd() throws RecognitionException {
		PropertysdContext _localctx = new PropertysdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertysd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(ATRSD);
			setState(83); match(EQ);
			setState(84); dist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertynumberofserversContext extends ParserRuleContext {
		public TerminalNode NSN() { return getToken(QueuingTParser.NSN, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public PropertynumberofserversContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertynumberofservers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterPropertynumberofservers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitPropertynumberofservers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitPropertynumberofservers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertynumberofserversContext propertynumberofservers() throws RecognitionException {
		PropertynumberofserversContext _localctx = new PropertynumberofserversContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_propertynumberofservers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(NSN);
			setState(87); match(EQ);
			setState(88); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertycustinqContext extends ParserRuleContext {
		public TerminalNode CUSIQ() { return getToken(QueuingTParser.CUSIQ, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public PropertycustinqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertycustinq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterPropertycustinq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitPropertycustinq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitPropertycustinq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertycustinqContext propertycustinq() throws RecognitionException {
		PropertycustinqContext _localctx = new PropertycustinqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertycustinq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(CUSIQ);
			setState(91); match(EQ);
			setState(92); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistContext extends ParserRuleContext {
		public UndContext und() {
			return getRuleContext(UndContext.class,0);
		}
		public ExpdContext expd() {
			return getRuleContext(ExpdContext.class,0);
		}
		public DistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterDist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitDist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitDist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistContext dist() throws RecognitionException {
		DistContext _localctx = new DistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dist);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case UN:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); und();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); expd();
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

	public static class UndContext extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(QueuingTParser.INT, i);
		}
		public List<TerminalNode> DOBL() { return getTokens(QueuingTParser.DOBL); }
		public TerminalNode ABR_CR() { return getToken(QueuingTParser.ABR_CR, 0); }
		public TerminalNode DOBL(int i) {
			return getToken(QueuingTParser.DOBL, i);
		}
		public TerminalNode CRR_CR() { return getToken(QueuingTParser.CRR_CR, 0); }
		public List<TerminalNode> INT() { return getTokens(QueuingTParser.INT); }
		public TerminalNode COMA() { return getToken(QueuingTParser.COMA, 0); }
		public TerminalNode UN() { return getToken(QueuingTParser.UN, 0); }
		public UndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_und; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterUnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitUnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitUnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndContext und() throws RecognitionException {
		UndContext _localctx = new UndContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_und);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(UN);
			setState(99); match(ABR_CR);
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOBL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(101); match(COMA);
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOBL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(103); match(CRR_CR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpdContext extends ParserRuleContext {
		public TerminalNode DOBL() { return getToken(QueuingTParser.DOBL, 0); }
		public TerminalNode ABR_CR() { return getToken(QueuingTParser.ABR_CR, 0); }
		public TerminalNode EXP() { return getToken(QueuingTParser.EXP, 0); }
		public TerminalNode CRR_CR() { return getToken(QueuingTParser.CRR_CR, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public ExpdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterExpd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitExpd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitExpd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpdContext expd() throws RecognitionException {
		ExpdContext _localctx = new ExpdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(EXP);
			setState(106); match(ABR_CR);
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOBL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(108); match(CRR_CR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectionContext extends ParserRuleContext {
		public TerminalNode CONEX() { return getToken(QueuingTParser.CONEX, 0); }
		public TerminalNode CRR_CC() { return getToken(QueuingTParser.CRR_CC, 0); }
		public Id_conContext id_con(int i) {
			return getRuleContext(Id_conContext.class,i);
		}
		public List<Id_conContext> id_con() {
			return getRuleContexts(Id_conContext.class);
		}
		public TerminalNode ABR_CC() { return getToken(QueuingTParser.ABR_CC, 0); }
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(CONEX);
			setState(111); match(ABR_CC);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112); id_con();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATRIDS) | (1L << ATRIDE) | (1L << PBB))) != 0) );
			setState(117); match(CRR_CC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_conContext extends ParserRuleContext {
		public PropertyidstartContext propertyidstart() {
			return getRuleContext(PropertyidstartContext.class,0);
		}
		public PropertyidendContext propertyidend() {
			return getRuleContext(PropertyidendContext.class,0);
		}
		public ProbContext prob() {
			return getRuleContext(ProbContext.class,0);
		}
		public Id_conContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterId_con(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitId_con(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitId_con(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_conContext id_con() throws RecognitionException {
		Id_conContext _localctx = new Id_conContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_id_con);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case ATRIDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); propertyidstart();
				}
				break;
			case ATRIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); propertyidend();
				}
				break;
			case PBB:
				enterOuterAlt(_localctx, 3);
				{
				setState(121); prob();
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

	public static class ProbContext extends ParserRuleContext {
		public TerminalNode DOBL() { return getToken(QueuingTParser.DOBL, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode PBB() { return getToken(QueuingTParser.PBB, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public ProbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterProb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitProb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitProb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbContext prob() throws RecognitionException {
		ProbContext _localctx = new ProbContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_prob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(PBB);
			setState(125); match(EQ);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOBL) ) {
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

	public static class PropertyidstartContext extends ParserRuleContext {
		public TerminalNode ATRIDS() { return getToken(QueuingTParser.ATRIDS, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public PropertyidstartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyidstart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterPropertyidstart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitPropertyidstart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitPropertyidstart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyidstartContext propertyidstart() throws RecognitionException {
		PropertyidstartContext _localctx = new PropertyidstartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_propertyidstart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(ATRIDS);
			setState(129); match(EQ);
			setState(130); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyidendContext extends ParserRuleContext {
		public TerminalNode ATRIDE() { return getToken(QueuingTParser.ATRIDE, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public PropertyidendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyidend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterPropertyidend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitPropertyidend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitPropertyidend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyidendContext propertyidend() throws RecognitionException {
		PropertyidendContext _localctx = new PropertyidendContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_propertyidend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(ATRIDE);
			setState(133); match(EQ);
			setState(134); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FooterContext extends ParserRuleContext {
		public TerminalNode CRR_CC() { return getToken(QueuingTParser.CRR_CC, 0); }
		public List<AnaliticsContext> analitics() {
			return getRuleContexts(AnaliticsContext.class);
		}
		public TerminalNode ANLT() { return getToken(QueuingTParser.ANLT, 0); }
		public AnaliticsContext analitics(int i) {
			return getRuleContext(AnaliticsContext.class,i);
		}
		public StimeContext stime() {
			return getRuleContext(StimeContext.class,0);
		}
		public TerminalNode ABR_CC() { return getToken(QueuingTParser.ABR_CC, 0); }
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_footer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); stime();
			setState(146);
			_la = _input.LA(1);
			if (_la==ANLT) {
				{
				setState(137); match(ANLT);
				setState(138); match(ABR_CC);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACS) | (1L << ACQ) | (1L << TCS) | (1L << TCQ) | (1L << US))) != 0)) {
					{
					{
					setState(139); analitics();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145); match(CRR_CC);
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

	public static class StimeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QueuingTParser.ID, 0); }
		public TerminalNode EQ() { return getToken(QueuingTParser.EQ, 0); }
		public TerminalNode SIM() { return getToken(QueuingTParser.SIM, 0); }
		public TerminalNode INT() { return getToken(QueuingTParser.INT, 0); }
		public StimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterStime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitStime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitStime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StimeContext stime() throws RecognitionException {
		StimeContext _localctx = new StimeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(SIM);
			setState(149); match(EQ);
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
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

	public static class AnaliticsContext extends ParserRuleContext {
		public TerminalNode ACS() { return getToken(QueuingTParser.ACS, 0); }
		public TerminalNode TCQ() { return getToken(QueuingTParser.TCQ, 0); }
		public TerminalNode US() { return getToken(QueuingTParser.US, 0); }
		public TerminalNode ACQ() { return getToken(QueuingTParser.ACQ, 0); }
		public TerminalNode TCS() { return getToken(QueuingTParser.TCS, 0); }
		public AnaliticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analitics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).enterAnalitics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueuingTListener ) ((QueuingTListener)listener).exitAnalitics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueuingTVisitor ) return ((QueuingTVisitor<? extends T>)visitor).visitAnalitics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnaliticsContext analitics() throws RecognitionException {
		AnaliticsContext _localctx = new AnaliticsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_analitics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACS) | (1L << ACQ) | (1L << TCS) | (1L << TCQ) | (1L << US))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\fc\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\6\17t\n\17\r\17\16\17u\3\17\3\17\3\20\3\20\3\20\5\20}\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\7\24\u008f\n\24\f\24\16\24\u0092\13\24\3\24\5\24\u0095\n\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*\2\5\4\2--\61\61\3\2-.\3\2(,\u0094\2,\3\2\2\2\4\60\3\2\2\2\68\3"+
		"\2\2\2\b;\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16P\3\2\2\2\20T\3\2\2\2\22X\3"+
		"\2\2\2\24\\\3\2\2\2\26b\3\2\2\2\30d\3\2\2\2\32k\3\2\2\2\34p\3\2\2\2\36"+
		"|\3\2\2\2 ~\3\2\2\2\"\u0082\3\2\2\2$\u0086\3\2\2\2&\u008a\3\2\2\2(\u0096"+
		"\3\2\2\2*\u009a\3\2\2\2,-\5\4\3\2-.\5\6\4\2./\5&\24\2/\3\3\2\2\2\60\61"+
		"\7\33\2\2\61\62\7\25\2\2\62\63\7-\2\2\63\5\3\2\2\2\64\67\5\b\5\2\65\67"+
		"\5\34\17\2\66\64\3\2\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2"+
		"\29\7\3\2\2\2:8\3\2\2\2;<\7\35\2\2<@\7\3\2\2=?\5\n\6\2>=\3\2\2\2?B\3\2"+
		"\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\4\2\2D\t\3\2\2\2EK\5"+
		"\f\7\2FK\5\16\b\2GK\5\20\t\2HK\5\22\n\2IK\5\24\13\2JE\3\2\2\2JF\3\2\2"+
		"\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\13\3\2\2\2LM\7!\2\2MN\7\25\2\2NO\7-"+
		"\2\2O\r\3\2\2\2PQ\7 \2\2QR\7\25\2\2RS\5\26\f\2S\17\3\2\2\2TU\7\36\2\2"+
		"UV\7\25\2\2VW\5\26\f\2W\21\3\2\2\2XY\7\37\2\2YZ\7\25\2\2Z[\7-\2\2[\23"+
		"\3\2\2\2\\]\7\34\2\2]^\7\25\2\2^_\7-\2\2_\25\3\2\2\2`c\5\30\r\2ac\5\32"+
		"\16\2b`\3\2\2\2ba\3\2\2\2c\27\3\2\2\2de\7\32\2\2ef\7\5\2\2fg\t\2\2\2g"+
		"h\7\26\2\2hi\t\2\2\2ij\7\6\2\2j\31\3\2\2\2kl\7\31\2\2lm\7\5\2\2mn\t\2"+
		"\2\2no\7\6\2\2o\33\3\2\2\2pq\7\"\2\2qs\7\3\2\2rt\5\36\20\2sr\3\2\2\2t"+
		"u\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\4\2\2x\35\3\2\2\2y}\5\"\22"+
		"\2z}\5$\23\2{}\5 \21\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\37\3\2\2\2~\177"+
		"\7%\2\2\177\u0080\7\25\2\2\u0080\u0081\t\2\2\2\u0081!\3\2\2\2\u0082\u0083"+
		"\7#\2\2\u0083\u0084\7\25\2\2\u0084\u0085\7-\2\2\u0085#\3\2\2\2\u0086\u0087"+
		"\7$\2\2\u0087\u0088\7\25\2\2\u0088\u0089\7-\2\2\u0089%\3\2\2\2\u008a\u0094"+
		"\5(\25\2\u008b\u008c\7\'\2\2\u008c\u0090\7\3\2\2\u008d\u008f\5*\26\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\7\4\2\2\u0094"+
		"\u008b\3\2\2\2\u0094\u0095\3\2\2\2\u0095\'\3\2\2\2\u0096\u0097\7&\2\2"+
		"\u0097\u0098\7\25\2\2\u0098\u0099\t\3\2\2\u0099)\3\2\2\2\u009a\u009b\t"+
		"\4\2\2\u009b+\3\2\2\2\13\668@Jbu|\u0090\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}