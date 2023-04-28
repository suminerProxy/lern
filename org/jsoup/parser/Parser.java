package org.jsoup.parser;

import java.io.Reader;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Parser {
    private static final int DEFAULT_MAX_ERRORS = 0;
    private ParseErrorList errors;
    private int maxErrors;
    private ParseSettings settings;
    private TreeBuilder treeBuilder;

    public Parser(TreeBuilder treeBuilder) {
    }

    public static Parser htmlParser() {
    }

    public static Document parse(String str, String str2) {
    }

    public static Document parseBodyFragment(String str, String str2) {
    }

    public static Document parseBodyFragmentRelaxed(String str, String str2) {
    }

    public static List<Node> parseFragment(String str, Element element, String str2) {
    }

    public static List<Node> parseXmlFragment(String str, String str2) {
    }

    public static String unescapeEntities(String str, boolean z) {
    }

    public static Parser xmlParser() {
    }

    public List<ParseError> getErrors() {
    }

    public TreeBuilder getTreeBuilder() {
    }

    public boolean isTrackErrors() {
    }

    public Document parseInput(String str, String str2) {
    }

    public Parser setTrackErrors(int i2) {
    }

    public Parser setTreeBuilder(TreeBuilder treeBuilder) {
    }

    public Parser settings(ParseSettings parseSettings) {
    }

    public ParseSettings settings() {
    }

    public static List<Node> parseFragment(String str, Element element, String str2, ParseErrorList parseErrorList) {
    }

    public Document parseInput(Reader reader, String str) {
    }
}
