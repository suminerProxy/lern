package org.jsoup.helper;

import java.util.HashMap;
import java.util.Stack;
import javax.xml.parsers.DocumentBuilderFactory;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class W3CDom {
    public DocumentBuilderFactory factory;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class W3CBuilder implements NodeVisitor {
        private static final String xmlnsKey = "xmlns";
        private static final String xmlnsPrefix = "xmlns:";
        private Element dest;
        private final Document doc;
        private final Stack<HashMap<String, String>> namespacesStack;

        public W3CBuilder(Document document) {
        }

        private void copyAttributes(Node node, Element element) {
        }

        private String updateNamespaces(org.jsoup.nodes.Element element) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i2) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i2) {
        }
    }

    public String asString(Document document) {
    }

    public void convert(org.jsoup.nodes.Document document, Document document2) {
    }

    public Document fromJsoup(org.jsoup.nodes.Document document) {
    }
}
