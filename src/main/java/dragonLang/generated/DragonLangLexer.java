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
		FALSE=9, LOOP=10, CONTINUE=11, BREAK=12, GREATER_EQUAL=13, LESS_EQUAL=14, 
		EQUAL_EQUAL=15, NOT_EUQAL=16, OR_SIGN=17, PLUS_ASSIGN=18, PLUS_ONE=19, 
		MINUS_ASSIGN=20, MINUS_ONE=21, WORD=22, GREATER_THAN=23, LESS_THAN=24, 
		PLUS_SIGN=25, MINUS_SIGN=26, MULTIPLICATION=27, DIVISION=28, PERCENT=29, 
		AND_SIGN=30, VERTICAL_BAR=31, EXCLAMATION=32, EQUAL=33, COLON=34, SEMICOLON=35, 
		POINT=36, COMMA=37, BRACKET_LEFT=38, BRACKET_RIGHT=39, BRACE_LEFT=40, 
		BRACE_RIGHT=41, SQUARE_LEFT=42, SQUARE_RIGHT=43, QUOTATION_LEFT=44, QUOTATION_RIGHT=45, 
		AT_SIGN=46, DOLLAR=47, WS=48, RT=49, COMMENT=50, LINE_COMMENT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUMBER", "STRING", "ANYCHAR", "NULL", "IF", "ELSEIF", "ELSE", "RETURN", 
		"TRUE", "FALSE", "LOOP", "CONTINUE", "BREAK", "GREATER_EQUAL", "LESS_EQUAL", 
		"EQUAL_EQUAL", "NOT_EUQAL", "OR_SIGN", "PLUS_ASSIGN", "PLUS_ONE", "MINUS_ASSIGN", 
		"MINUS_ONE", "WORD", "STARTCHAR", "NORMALCHAR", "GREATER_THAN", "LESS_THAN", 
		"PLUS_SIGN", "MINUS_SIGN", "MULTIPLICATION", "DIVISION", "PERCENT", "AND_SIGN", 
		"VERTICAL_BAR", "EXCLAMATION", "EQUAL", "COLON", "SEMICOLON", "POINT", 
		"COMMA", "BRACKET_LEFT", "BRACKET_RIGHT", "BRACE_LEFT", "BRACE_RIGHT", 
		"SQUARE_LEFT", "SQUARE_RIGHT", "QUOTATION_LEFT", "QUOTATION_RIGHT", "AT_SIGN", 
		"DOLLAR", "WS", "RT", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "STRING", "NULL", "IF", "ELSEIF", "ELSE", "RETURN", "TRUE", 
		"FALSE", "LOOP", "CONTINUE", "BREAK", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL_EQUAL", 
		"NOT_EUQAL", "OR_SIGN", "PLUS_ASSIGN", "PLUS_ONE", "MINUS_ASSIGN", "MINUS_ONE", 
		"WORD", "GREATER_THAN", "LESS_THAN", "PLUS_SIGN", "MINUS_SIGN", "MULTIPLICATION", 
		"DIVISION", "PERCENT", "AND_SIGN", "VERTICAL_BAR", "EXCLAMATION", "EQUAL", 
		"COLON", "SEMICOLON", "POINT", "COMMA", "BRACKET_LEFT", "BRACKET_RIGHT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0167\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\7\2r\n\2\f\2\16\2u\13\2\3"+
		"\2\3\2\6\2y\n\2\r\2\16\2z\3\2\3\2\6\2\177\n\2\r\2\16\2\u0080\5\2\u0083"+
		"\n\2\3\3\3\3\7\3\u0087\n\3\f\3\16\3\u008a\13\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\u0091\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u009a\n\5\3\6\3\6\3\6\3\6\5"+
		"\6\u00a0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00b4\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00be\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c5\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00cd\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00d4\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e0\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00e9\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\7\30\u0108\n\30\f\30\16\30\u010b\13\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\6\64\u0144\n\64\r\64\16\64\u0145\3\64\3\64\3\65\6\65\u014b\n\65\r\65"+
		"\16\65\u014c\3\66\3\66\3\66\3\66\7\66\u0153\n\66\f\66\16\66\u0156\13\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0161\n\67\f\67\16"+
		"\67\u0164\13\67\3\67\3\67\3\u0154\28\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21"+
		"\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27"+
		"/\30\61\2\63\2\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W"+
		"*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65\3\2#\3\2\63;\3\2\62;\3\2\60\60\7\2"+
		"\f\f\17\17\"\"$$\u201f\u201f\32\2\13\f\16\17\"$&(*@BB]]__}\177\u00d9\u00d9"+
		"\u00f9\u00f9\u201e\u201f\u3004\u3004\ufe66\ufe67\uff03\uff03\uff07\uff08"+
		"\uff0a\uff0b\uff0d\uff0f\uff1c\uff20\uff22\uff22\uff3d\uff3d\uff3f\uff3f"+
		"\uff5d\uff5f\uffe7\uffe7\33\2\13\f\16\17\"$&(*\61<@BB]]__}\177\u00d9\u00d9"+
		"\u00f9\u00f9\u201e\u201f\u3004\u3004\ufe66\ufe67\uff03\uff03\uff07\uff08"+
		"\uff0a\uff0b\uff0d\uff0f\uff1c\uff20\uff22\uff22\uff3d\uff3d\uff3f\uff3f"+
		"\uff5d\uff5f\uffe7\uffe7\5\2@@\ufe67\ufe67\uff20\uff20\5\2>>\ufe66\ufe66"+
		"\uff1e\uff1e\4\2--\uff0d\uff0d\4\2//\uff0f\uff0f\4\2,,\u00d9\u00d9\4\2"+
		"\61\61\u00f9\u00f9\4\2\'\'\uff07\uff07\4\2((\uff08\uff08\4\2~~\uff5e\uff5e"+
		"\4\2##\uff03\uff03\4\2??\uff1f\uff1f\4\2<<\uff1c\uff1c\4\2==\uff1d\uff1d"+
		"\4\2\60\60\u3004\u3004\4\2..\uff0e\uff0e\4\2**\uff0a\uff0a\4\2++\uff0b"+
		"\uff0b\4\2}}\uff5d\uff5d\4\2\177\177\uff5f\uff5f\4\2]]\uff3d\uff3d\4\2"+
		"__\uff3f\uff3f\4\2$$\u201e\u201e\4\2$$\u201f\u201f\4\2BB\uff22\uff22\4"+
		"\2&&\uffe7\uffe7\5\2\13\13\16\16\"\"\4\2\f\f\17\17\2\u0179\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\3\u0082\3\2\2\2\5\u0090\3\2\2\2\7\u0092\3\2\2\2"+
		"\t\u0099\3\2\2\2\13\u009f\3\2\2\2\r\u00ab\3\2\2\2\17\u00b3\3\2\2\2\21"+
		"\u00bd\3\2\2\2\23\u00c4\3\2\2\2\25\u00cc\3\2\2\2\27\u00d3\3\2\2\2\31\u00df"+
		"\3\2\2\2\33\u00e8\3\2\2\2\35\u00ea\3\2\2\2\37\u00ed\3\2\2\2!\u00f0\3\2"+
		"\2\2#\u00f3\3\2\2\2%\u00f6\3\2\2\2\'\u00f9\3\2\2\2)\u00fc\3\2\2\2+\u00ff"+
		"\3\2\2\2-\u0102\3\2\2\2/\u0105\3\2\2\2\61\u010c\3\2\2\2\63\u010e\3\2\2"+
		"\2\65\u0110\3\2\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0116\3\2\2\2=\u0118"+
		"\3\2\2\2?\u011a\3\2\2\2A\u011c\3\2\2\2C\u011e\3\2\2\2E\u0120\3\2\2\2G"+
		"\u0122\3\2\2\2I\u0124\3\2\2\2K\u0126\3\2\2\2M\u0128\3\2\2\2O\u012a\3\2"+
		"\2\2Q\u012c\3\2\2\2S\u012e\3\2\2\2U\u0130\3\2\2\2W\u0132\3\2\2\2Y\u0134"+
		"\3\2\2\2[\u0136\3\2\2\2]\u0138\3\2\2\2_\u013a\3\2\2\2a\u013c\3\2\2\2c"+
		"\u013e\3\2\2\2e\u0140\3\2\2\2g\u0143\3\2\2\2i\u014a\3\2\2\2k\u014e\3\2"+
		"\2\2m\u015c\3\2\2\2os\t\2\2\2pr\t\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2t\u0083\3\2\2\2us\3\2\2\2v\u0083\7\62\2\2wy\t\3\2\2xw\3\2\2"+
		"\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\t\4\2\2}\177\t\3\2\2~}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082o\3\2\2\2\u0082v\3\2\2\2\u0082x\3\2\2\2\u0083\4\3\2\2\2"+
		"\u0084\u0088\5_\60\2\u0085\u0087\5\7\4\2\u0086\u0085\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\5a\61\2\u008c\u0091\3\2\2\2\u008d\u008e\5c"+
		"\62\2\u008e\u008f\5/\30\2\u008f\u0091\3\2\2\2\u0090\u0084\3\2\2\2\u0090"+
		"\u008d\3\2\2\2\u0091\6\3\2\2\2\u0092\u0093\n\5\2\2\u0093\b\3\2\2\2\u0094"+
		"\u0095\7p\2\2\u0095\u0096\7w\2\2\u0096\u0097\7n\2\2\u0097\u009a\7n\2\2"+
		"\u0098\u009a\7\u7a7c\2\2\u0099\u0094\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\n\3\2\2\2\u009b\u009c\7k\2\2\u009c\u00a0\7h\2\2\u009d\u009e\7\u5984\2"+
		"\2\u009e\u00a0\7\u679e\2\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\f\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7k\2\2\u00a6\u00ac\7h\2\2\u00a7\u00a8\7\u5428"+
		"\2\2\u00a8\u00a9\7\u521b\2\2\u00a9\u00aa\7\u5984\2\2\u00aa\u00ac\7\u679e"+
		"\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\16\3\2\2\2\u00ad\u00ae"+
		"\7g\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b4\7g\2\2\u00b1"+
		"\u00b2\7\u5428\2\2\u00b2\u00b4\7\u521b\2\2\u00b3\u00ad\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7"+
		"\u00b8\7v\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7t\2\2\u00ba\u00be\7p\2\2"+
		"\u00bb\u00bc\7\u8fd6\2\2\u00bc\u00be\7\u56e0\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\22\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7t\2\2"+
		"\u00c1\u00c2\7w\2\2\u00c2\u00c5\7g\2\2\u00c3\u00c5\7\u6631\2\2\u00c4\u00bf"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\24\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cd\7g\2\2"+
		"\u00cb\u00cd\7\u5428\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\26\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d4\7t\2\2\u00d1"+
		"\u00d2\7\u5fac\2\2\u00d2\u00d4\7\u73b1\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\30\3\2\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7p\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2"+
		"\u00db\u00dc\7w\2\2\u00dc\u00e0\7g\2\2\u00dd\u00de\7\u8df5\2\2\u00de\u00e0"+
		"\7\u8fc9\2\2\u00df\u00d5\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\32\3\2\2\2"+
		"\u00e1\u00e2\7d\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e9\7m\2\2\u00e6\u00e7\7\u4e2f\2\2\u00e7\u00e9\7\u65af"+
		"\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\34\3\2\2\2\u00ea\u00eb"+
		"\5\65\33\2\u00eb\u00ec\5I%\2\u00ec\36\3\2\2\2\u00ed\u00ee\5\67\34\2\u00ee"+
		"\u00ef\5I%\2\u00ef \3\2\2\2\u00f0\u00f1\5I%\2\u00f1\u00f2\5I%\2\u00f2"+
		"\"\3\2\2\2\u00f3\u00f4\5G$\2\u00f4\u00f5\5I%\2\u00f5$\3\2\2\2\u00f6\u00f7"+
		"\5E#\2\u00f7\u00f8\5E#\2\u00f8&\3\2\2\2\u00f9\u00fa\59\35\2\u00fa\u00fb"+
		"\5I%\2\u00fb(\3\2\2\2\u00fc\u00fd\59\35\2\u00fd\u00fe\59\35\2\u00fe*\3"+
		"\2\2\2\u00ff\u0100\5;\36\2\u0100\u0101\5I%\2\u0101,\3\2\2\2\u0102\u0103"+
		"\5;\36\2\u0103\u0104\5;\36\2\u0104.\3\2\2\2\u0105\u0109\5\61\31\2\u0106"+
		"\u0108\5\63\32\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\60\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010d\n\6\2\2\u010d\62\3\2\2\2\u010e\u010f\n\7\2\2\u010f\64\3\2\2\2\u0110"+
		"\u0111\t\b\2\2\u0111\66\3\2\2\2\u0112\u0113\t\t\2\2\u01138\3\2\2\2\u0114"+
		"\u0115\t\n\2\2\u0115:\3\2\2\2\u0116\u0117\t\13\2\2\u0117<\3\2\2\2\u0118"+
		"\u0119\t\f\2\2\u0119>\3\2\2\2\u011a\u011b\t\r\2\2\u011b@\3\2\2\2\u011c"+
		"\u011d\t\16\2\2\u011dB\3\2\2\2\u011e\u011f\t\17\2\2\u011fD\3\2\2\2\u0120"+
		"\u0121\t\20\2\2\u0121F\3\2\2\2\u0122\u0123\t\21\2\2\u0123H\3\2\2\2\u0124"+
		"\u0125\t\22\2\2\u0125J\3\2\2\2\u0126\u0127\t\23\2\2\u0127L\3\2\2\2\u0128"+
		"\u0129\t\24\2\2\u0129N\3\2\2\2\u012a\u012b\t\25\2\2\u012bP\3\2\2\2\u012c"+
		"\u012d\t\26\2\2\u012dR\3\2\2\2\u012e\u012f\t\27\2\2\u012fT\3\2\2\2\u0130"+
		"\u0131\t\30\2\2\u0131V\3\2\2\2\u0132\u0133\t\31\2\2\u0133X\3\2\2\2\u0134"+
		"\u0135\t\32\2\2\u0135Z\3\2\2\2\u0136\u0137\t\33\2\2\u0137\\\3\2\2\2\u0138"+
		"\u0139\t\34\2\2\u0139^\3\2\2\2\u013a\u013b\t\35\2\2\u013b`\3\2\2\2\u013c"+
		"\u013d\t\36\2\2\u013db\3\2\2\2\u013e\u013f\t\37\2\2\u013fd\3\2\2\2\u0140"+
		"\u0141\t \2\2\u0141f\3\2\2\2\u0142\u0144\t!\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\b\64\2\2\u0148h\3\2\2\2\u0149\u014b\t\"\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"j\3\2\2\2\u014e\u014f\7\61\2\2\u014f\u0150\7,\2\2\u0150\u0154\3\2\2\2"+
		"\u0151\u0153\13\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\7,\2\2\u0158\u0159\7\61\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\66"+
		"\3\2\u015bl\3\2\2\2\u015c\u015d\7\61\2\2\u015d\u015e\7\61\2\2\u015e\u0162"+
		"\3\2\2\2\u015f\u0161\n\"\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0165\u0166\b\67\3\2\u0166n\3\2\2\2\30\2sz\u0080\u0082\u0088\u0090"+
		"\u0099\u009f\u00ab\u00b3\u00bd\u00c4\u00cc\u00d3\u00df\u00e8\u0109\u0145"+
		"\u014c\u0154\u0162\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}