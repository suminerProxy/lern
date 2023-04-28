package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class TreeBuilder {
    public String baseUri;
    public Token currentToken;
    public Document doc;
    private Token.EndTag end;
    public ParseErrorList errors;
    public CharacterReader reader;
    public ParseSettings settings;
    public ArrayList<Element> stack;
    private Token.StartTag start;
    public Tokeniser tokeniser;

    public Element currentElement() {
    }

    public abstract ParseSettings defaultSettings();

    public void initialiseParse(Reader reader, String str, ParseErrorList parseErrorList, ParseSettings parseSettings) {
    }

    public Document parse(Reader reader, String str, ParseErrorList parseErrorList, ParseSettings parseSettings) {
    }

    public abstract boolean process(Token token);

    public boolean processEndTag(String str) {
    }

    public boolean processStartTag(String str) {
    }

    public void runParser() {
    }

    public boolean processStartTag(String str, Attributes attributes) {
    }
}
