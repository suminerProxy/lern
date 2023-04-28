package org.jsoup.parser;

import java.io.Reader;
import java.util.List;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class XmlTreeBuilder extends TreeBuilder {

    /* renamed from: org.jsoup.parser.XmlTreeBuilder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$jsoup$parser$Token$TokenType = null;
    }

    private void insertNode(Node node) {
    }

    private void popStackToClose(Token.EndTag endTag) {
    }

    @Override // org.jsoup.parser.TreeBuilder
    public ParseSettings defaultSettings() {
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void initialiseParse(Reader reader, String str, ParseErrorList parseErrorList, ParseSettings parseSettings) {
    }

    public Element insert(Token.StartTag startTag) {
    }

    public Document parse(Reader reader, String str) {
    }

    public List<Node> parseFragment(String str, String str2, ParseErrorList parseErrorList, ParseSettings parseSettings) {
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean process(Token token) {
    }

    @Override // org.jsoup.parser.TreeBuilder
    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
    }

    public Document parse(String str, String str2) {
    }

    public void insert(Token.Comment comment) {
    }

    public void insert(Token.Character character) {
    }

    public void insert(Token.Doctype doctype) {
    }
}
