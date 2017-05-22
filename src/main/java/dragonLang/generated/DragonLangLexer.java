// Generated from /Users/julien/IdeaProjects/dragonLang/src/main/resources/DragonLang.g4 by ANTLR 4.7
package dragonLang.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DragonLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, STRING=2, NULL=3, IF=4, ELSEIF=5, ELSE=6, RETURN=7, TRUE=8, 
		FALSE=9, LOOP=10, CONTINUE=11, BREAK=12, ARROW=13, GREATER_EQUAL=14, LESS_EQUAL=15, 
		EQUAL_EQUAL=16, NOT_EUQAL=17, OR_SIGN=18, PLUS_ASSIGN=19, PLUS_ONE=20, 
		MINUS_ASSIGN=21, MINUS_ONE=22, WORD=23, GREATER_THAN=24, LESS_THAN=25, 
		PLUS_SIGN=26, MINUS_SIGN=27, MULTIPLICATION=28, DIVISION=29, PERCENT=30, 
		AND_SIGN=31, VERTICAL_BAR=32, EXCLAMATION=33, EQUAL=34, COLON=35, SEMICOLON=36, 
		POINT=37, COMMA=38, BRACKET_LEFT=39, BRACKET_RIGHT=40, BRACE_LEFT=41, 
		BRACE_RIGHT=42, SQUARE_LEFT=43, SQUARE_RIGHT=44, QUOTATION_LEFT=45, QUOTATION_RIGHT=46, 
		AT_SIGN=47, DOLLAR=48, WS=49, RT=50, COMMENT=51, LINE_COMMENT=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUMBER", "STRING", "ANYCHAR1", "ANYCHAR2", "NULL", "IF", "ELSEIF", "ELSE", 
		"RETURN", "TRUE", "FALSE", "LOOP", "CONTINUE", "BREAK", "ARROW", "GREATER_EQUAL", 
		"LESS_EQUAL", "EQUAL_EQUAL", "NOT_EUQAL", "OR_SIGN", "PLUS_ASSIGN", "PLUS_ONE", 
		"MINUS_ASSIGN", "MINUS_ONE", "WORD", "STARTCHAR", "NORMALCHAR", "GREATER_THAN", 
		"LESS_THAN", "PLUS_SIGN", "MINUS_SIGN", "MULTIPLICATION", "DIVISION", 
		"PERCENT", "AND_SIGN", "VERTICAL_BAR", "EXCLAMATION", "EQUAL", "COLON", 
		"SEMICOLON", "POINT", "COMMA", "BRACKET_LEFT", "BRACKET_RIGHT", "BRACE_LEFT", 
		"BRACE_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "QUOTATION_LEFT", "QUOTATION_RIGHT", 
		"AT_SIGN", "DOLLAR", "WS", "RT", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "STRING", "NULL", "IF", "ELSEIF", "ELSE", "RETURN", "TRUE", 
		"FALSE", "LOOP", "CONTINUE", "BREAK", "ARROW", "GREATER_EQUAL", "LESS_EQUAL", 
		"EQUAL_EQUAL", "NOT_EUQAL", "OR_SIGN", "PLUS_ASSIGN", "PLUS_ONE", "MINUS_ASSIGN", 
		"MINUS_ONE", "WORD", "GREATER_THAN", "LESS_THAN", "PLUS_SIGN", "MINUS_SIGN", 
		"MULTIPLICATION", "DIVISION", "PERCENT", "AND_SIGN", "VERTICAL_BAR", "EXCLAMATION", 
		"EQUAL", "COLON", "SEMICOLON", "POINT", "COMMA", "BRACKET_LEFT", "BRACKET_RIGHT", 
		"BRACE_LEFT", "BRACE_RIGHT", "SQUARE_LEFT", "SQUARE_RIGHT", "QUOTATION_LEFT", 
		"QUOTATION_RIGHT", "AT_SIGN", "DOLLAR", "WS", "RT", "COMMENT", "LINE_COMMENT"
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


	public DragonLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DragonLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u017a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\7\2v\n\2\f\2\16"+
		"\2y\13\2\3\2\3\2\6\2}\n\2\r\2\16\2~\3\2\3\2\6\2\u0083\n\2\r\2\16\2\u0084"+
		"\5\2\u0087\n\2\3\3\3\3\7\3\u008b\n\3\f\3\16\3\u008e\13\3\3\3\3\3\3\3\7"+
		"\3\u0093\n\3\f\3\16\3\u0096\13\3\3\3\3\3\3\3\3\3\5\3\u009c\n\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u00a7\n\6\3\7\3\7\3\7\3\7\5\7\u00ad\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b9\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00c1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cb\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00d2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00da\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00e1\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00ed\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00f6\n\17\3\20\3\20\3\20\3\20\5\20\u00fc\n\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\7\32\u011b"+
		"\n\32\f\32\16\32\u011e\13\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u0157\n\66\r\66\16\66\u0158\3"+
		"\66\3\66\3\67\6\67\u015e\n\67\r\67\16\67\u015f\38\38\38\38\78\u0166\n"+
		"8\f8\168\u0169\138\38\38\38\38\38\39\39\39\39\79\u0174\n9\f9\169\u0177"+
		"\139\39\39\3\u0167\2:\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\23\t\25\n\27"+
		"\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31"+
		"\65\2\67\29\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e"+
		"\60g\61i\62k\63m\64o\65q\66\3\2$\3\2\63;\3\2\62;\3\2\60\60\5\2\f\f\17"+
		"\17$$\5\2\f\f\17\17\u201e\u201f\34\2\13\f\16\17\"$&(*@BB]]__}\177\u00d9"+
		"\u00d9\u00f9\u00f9\u201e\u201f\u3004\u3004\u300c\u300d\u3012\u3013\ufe66"+
		"\ufe67\uff03\uff03\uff07\uff08\uff0a\uff0b\uff0d\uff0f\uff1c\uff20\uff22"+
		"\uff22\uff3d\uff3d\uff3f\uff3f\uff5d\uff5f\uffe7\uffe7\35\2\13\f\16\17"+
		"\"$&(*\61<@BB]]__}\177\u00d9\u00d9\u00f9\u00f9\u201e\u201f\u3004\u3004"+
		"\u300c\u300d\u3012\u3013\ufe66\ufe67\uff03\uff03\uff07\uff08\uff0a\uff0b"+
		"\uff0d\uff0f\uff1c\uff20\uff22\uff22\uff3d\uff3d\uff3f\uff3f\uff5d\uff5f"+
		"\uffe7\uffe7\5\2@@\ufe67\ufe67\uff20\uff20\5\2>>\ufe66\ufe66\uff1e\uff1e"+
		"\4\2--\uff0d\uff0d\4\2//\uff0f\uff0f\4\2,,\u00d9\u00d9\4\2\61\61\u00f9"+
		"\u00f9\4\2\'\'\uff07\uff07\4\2((\uff08\uff08\4\2~~\uff5e\uff5e\4\2##\uff03"+
		"\uff03\4\2??\uff1f\uff1f\4\2<<\uff1c\uff1c\4\2==\uff1d\uff1d\4\2\60\60"+
		"\u3004\u3004\4\2..\uff0e\uff0e\4\2**\uff0a\uff0a\4\2++\uff0b\uff0b\4\2"+
		"}}\uff5d\uff5d\4\2\177\177\uff5f\uff5f\5\2]]\u3012\u3012\uff3d\uff3d\5"+
		"\2__\u3013\u3013\uff3f\uff3f\4\2$$\u201e\u201e\4\2$$\u201f\u201f\4\2B"+
		"B\uff22\uff22\4\2&&\uffe7\uffe7\5\2\13\13\16\16\"\"\4\2\f\f\17\17\2\u018e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3\u0086\3\2\2\2\5\u009b\3"+
		"\2\2\2\7\u009d\3\2\2\2\t\u009f\3\2\2\2\13\u00a6\3\2\2\2\r\u00ac\3\2\2"+
		"\2\17\u00b8\3\2\2\2\21\u00c0\3\2\2\2\23\u00ca\3\2\2\2\25\u00d1\3\2\2\2"+
		"\27\u00d9\3\2\2\2\31\u00e0\3\2\2\2\33\u00ec\3\2\2\2\35\u00f5\3\2\2\2\37"+
		"\u00fb\3\2\2\2!\u00fd\3\2\2\2#\u0100\3\2\2\2%\u0103\3\2\2\2\'\u0106\3"+
		"\2\2\2)\u0109\3\2\2\2+\u010c\3\2\2\2-\u010f\3\2\2\2/\u0112\3\2\2\2\61"+
		"\u0115\3\2\2\2\63\u0118\3\2\2\2\65\u011f\3\2\2\2\67\u0121\3\2\2\29\u0123"+
		"\3\2\2\2;\u0125\3\2\2\2=\u0127\3\2\2\2?\u0129\3\2\2\2A\u012b\3\2\2\2C"+
		"\u012d\3\2\2\2E\u012f\3\2\2\2G\u0131\3\2\2\2I\u0133\3\2\2\2K\u0135\3\2"+
		"\2\2M\u0137\3\2\2\2O\u0139\3\2\2\2Q\u013b\3\2\2\2S\u013d\3\2\2\2U\u013f"+
		"\3\2\2\2W\u0141\3\2\2\2Y\u0143\3\2\2\2[\u0145\3\2\2\2]\u0147\3\2\2\2_"+
		"\u0149\3\2\2\2a\u014b\3\2\2\2c\u014d\3\2\2\2e\u014f\3\2\2\2g\u0151\3\2"+
		"\2\2i\u0153\3\2\2\2k\u0156\3\2\2\2m\u015d\3\2\2\2o\u0161\3\2\2\2q\u016f"+
		"\3\2\2\2sw\t\2\2\2tv\t\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x"+
		"\u0087\3\2\2\2yw\3\2\2\2z\u0087\7\62\2\2{}\t\3\2\2|{\3\2\2\2}~\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\t\4\2\2\u0081\u0083"+
		"\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086s\3\2\2\2\u0086z\3\2\2\2\u0086"+
		"|\3\2\2\2\u0087\4\3\2\2\2\u0088\u008c\7$\2\2\u0089\u008b\5\7\4\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u009c\7$\2\2\u0090"+
		"\u0094\7\u201e\2\2\u0091\u0093\5\t\5\2\u0092\u0091\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u009c\7\u201f\2\2\u0098\u0099\5g\64\2\u0099\u009a"+
		"\5\63\32\2\u009a\u009c\3\2\2\2\u009b\u0088\3\2\2\2\u009b\u0090\3\2\2\2"+
		"\u009b\u0098\3\2\2\2\u009c\6\3\2\2\2\u009d\u009e\n\5\2\2\u009e\b\3\2\2"+
		"\2\u009f\u00a0\n\6\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3"+
		"\7w\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a7\7n\2\2\u00a5\u00a7\7\u7a7c\2\2"+
		"\u00a6\u00a1\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\f\3\2\2\2\u00a8\u00a9\7"+
		"k\2\2\u00a9\u00ad\7h\2\2\u00aa\u00ab\7\u5984\2\2\u00ab\u00ad\7\u679e\2"+
		"\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\16\3\2\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b9\7h\2\2\u00b4\u00b5\7\u5428\2\2\u00b5\u00b6\7"+
		"\u521b\2\2\u00b6\u00b7\7\u5984\2\2\u00b7\u00b9\7\u679e\2\2\u00b8\u00ae"+
		"\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\20\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd\u00c1\7g\2\2\u00be\u00bf\7\u5428"+
		"\2\2\u00bf\u00c1\7\u521b\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\22\3\2\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7w\2\2\u00c6\u00c7\7t\2\2\u00c7\u00cb\7p\2\2\u00c8\u00c9\7\u8fd6"+
		"\2\2\u00c9\u00cb\7\u56e0\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\24\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf"+
		"\u00d2\7g\2\2\u00d0\u00d2\7\u6631\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7c\2\2\u00d5"+
		"\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00da\7g\2\2\u00d8\u00da\7\u5428"+
		"\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\30\3\2\2\2\u00db\u00dc"+
		"\7h\2\2\u00dc\u00dd\7q\2\2\u00dd\u00e1\7t\2\2\u00de\u00df\7\u5fac\2\2"+
		"\u00df\u00e1\7\u73b1\2\2\u00e0\u00db\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\32\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7p\2\2\u00e5"+
		"\u00e6\7v\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7w\2\2"+
		"\u00e9\u00ed\7g\2\2\u00ea\u00eb\7\u8df5\2\2\u00eb\u00ed\7\u8fc9\2\2\u00ec"+
		"\u00e2\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\34\3\2\2\2\u00ee\u00ef\7d\2\2"+
		"\u00ef\u00f0\7t\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f6"+
		"\7m\2\2\u00f3\u00f4\7\u4e2f\2\2\u00f4\u00f6\7\u65af\2\2\u00f5\u00ee\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\36\3\2\2\2\u00f7\u00f8\59\35\2\u00f8"+
		"\u00f9\59\35\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc\7\u300d\2\2\u00fb\u00f7"+
		"\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc \3\2\2\2\u00fd\u00fe\59\35\2\u00fe"+
		"\u00ff\5M\'\2\u00ff\"\3\2\2\2\u0100\u0101\5;\36\2\u0101\u0102\5M\'\2\u0102"+
		"$\3\2\2\2\u0103\u0104\5M\'\2\u0104\u0105\5M\'\2\u0105&\3\2\2\2\u0106\u0107"+
		"\5K&\2\u0107\u0108\5M\'\2\u0108(\3\2\2\2\u0109\u010a\5I%\2\u010a\u010b"+
		"\5I%\2\u010b*\3\2\2\2\u010c\u010d\5=\37\2\u010d\u010e\5M\'\2\u010e,\3"+
		"\2\2\2\u010f\u0110\5=\37\2\u0110\u0111\5=\37\2\u0111.\3\2\2\2\u0112\u0113"+
		"\5? \2\u0113\u0114\5M\'\2\u0114\60\3\2\2\2\u0115\u0116\5? \2\u0116\u0117"+
		"\5? \2\u0117\62\3\2\2\2\u0118\u011c\5\65\33\2\u0119\u011b\5\67\34\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\64\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\n\7\2\2\u0120\66"+
		"\3\2\2\2\u0121\u0122\n\b\2\2\u01228\3\2\2\2\u0123\u0124\t\t\2\2\u0124"+
		":\3\2\2\2\u0125\u0126\t\n\2\2\u0126<\3\2\2\2\u0127\u0128\t\13\2\2\u0128"+
		">\3\2\2\2\u0129\u012a\t\f\2\2\u012a@\3\2\2\2\u012b\u012c\t\r\2\2\u012c"+
		"B\3\2\2\2\u012d\u012e\t\16\2\2\u012eD\3\2\2\2\u012f\u0130\t\17\2\2\u0130"+
		"F\3\2\2\2\u0131\u0132\t\20\2\2\u0132H\3\2\2\2\u0133\u0134\t\21\2\2\u0134"+
		"J\3\2\2\2\u0135\u0136\t\22\2\2\u0136L\3\2\2\2\u0137\u0138\t\23\2\2\u0138"+
		"N\3\2\2\2\u0139\u013a\t\24\2\2\u013aP\3\2\2\2\u013b\u013c\t\25\2\2\u013c"+
		"R\3\2\2\2\u013d\u013e\t\26\2\2\u013eT\3\2\2\2\u013f\u0140\t\27\2\2\u0140"+
		"V\3\2\2\2\u0141\u0142\t\30\2\2\u0142X\3\2\2\2\u0143\u0144\t\31\2\2\u0144"+
		"Z\3\2\2\2\u0145\u0146\t\32\2\2\u0146\\\3\2\2\2\u0147\u0148\t\33\2\2\u0148"+
		"^\3\2\2\2\u0149\u014a\t\34\2\2\u014a`\3\2\2\2\u014b\u014c\t\35\2\2\u014c"+
		"b\3\2\2\2\u014d\u014e\t\36\2\2\u014ed\3\2\2\2\u014f\u0150\t\37\2\2\u0150"+
		"f\3\2\2\2\u0151\u0152\t \2\2\u0152h\3\2\2\2\u0153\u0154\t!\2\2\u0154j"+
		"\3\2\2\2\u0155\u0157\t\"\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\66"+
		"\2\2\u015bl\3\2\2\2\u015c\u015e\t#\2\2\u015d\u015c\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160n\3\2\2\2\u0161"+
		"\u0162\7\61\2\2\u0162\u0163\7,\2\2\u0163\u0167\3\2\2\2\u0164\u0166\13"+
		"\2\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\7,"+
		"\2\2\u016b\u016c\7\61\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b8\3\2\u016e"+
		"p\3\2\2\2\u016f\u0170\7\61\2\2\u0170\u0171\7\61\2\2\u0171\u0175\3\2\2"+
		"\2\u0172\u0174\n#\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0179\b9\3\2\u0179r\3\2\2\2\32\2w~\u0084\u0086\u008c\u0094\u009b\u00a6"+
		"\u00ac\u00b8\u00c0\u00ca\u00d1\u00d9\u00e0\u00ec\u00f5\u00fb\u011c\u0158"+
		"\u015f\u0167\u0175\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}