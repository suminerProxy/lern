package org.jsoup.nodes;

import java.io.IOException;
import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class Node implements Cloneable {
    public static final String EmptyString = "";
    public Node parentNode;
    public int siblingIndex;

    /* renamed from: org.jsoup.nodes.Node$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements NodeVisitor {
        public final /* synthetic */ Node this$0;
        public final /* synthetic */ String val$baseUri;

        public AnonymousClass1(Node node, String str) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i2) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class OuterHtmlVisitor implements NodeVisitor {
        private Appendable accum;
        private Document.OutputSettings out;

        public OuterHtmlVisitor(Appendable appendable, Document.OutputSettings outputSettings) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i2) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i2) {
        }
    }

    private void addSiblingHtml(int i2, String str) {
    }

    private Element getDeepChild(Element element) {
    }

    private void reindexChildren(int i2) {
    }

    public String absUrl(String str) {
    }

    public void addChildren(Node... nodeArr) {
    }

    public Node after(String str) {
    }

    public String attr(String str) {
    }

    public abstract Attributes attributes();

    public abstract String baseUri();

    public Node before(String str) {
    }

    public Node childNode(int i2) {
    }

    public abstract int childNodeSize();

    public List<Node> childNodes() {
    }

    public Node[] childNodesAsArray() {
    }

    public List<Node> childNodesCopy() {
    }

    public Node clearAttributes() {
    }

    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
    }

    public Node doClone(Node node) {
    }

    public abstract void doSetBaseUri(String str);

    public abstract List<Node> ensureChildNodes();

    public boolean equals(Object obj) {
    }

    public Node filter(NodeFilter nodeFilter) {
    }

    public Document.OutputSettings getOutputSettings() {
    }

    public boolean hasAttr(String str) {
    }

    public abstract boolean hasAttributes();

    public boolean hasParent() {
    }

    public boolean hasSameValue(Object obj) {
    }

    public <T extends Appendable> T html(T t) {
    }

    public void indent(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
    }

    public Node nextSibling() {
    }

    public abstract String nodeName();

    public void nodelistChanged() {
    }

    public String outerHtml() {
    }

    public abstract void outerHtmlHead(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException;

    public abstract void outerHtmlTail(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException;

    public Document ownerDocument() {
    }

    public Node parent() {
    }

    public final Node parentNode() {
    }

    public Node previousSibling() {
    }

    public void remove() {
    }

    public Node removeAttr(String str) {
    }

    public void removeChild(Node node) {
    }

    public void reparentChild(Node node) {
    }

    public void replaceChild(Node node, Node node2) {
    }

    public void replaceWith(Node node) {
    }

    public Node root() {
    }

    public void setBaseUri(String str) {
    }

    public void setParentNode(Node node) {
    }

    public void setSiblingIndex(int i2) {
    }

    public Node shallowClone() {
    }

    public int siblingIndex() {
    }

    public List<Node> siblingNodes() {
    }

    public String toString() {
    }

    public Node traverse(NodeVisitor nodeVisitor) {
    }

    public Node unwrap() {
    }

    public Node wrap(String str) {
    }

    public Node after(Node node) {
    }

    public Node before(Node node) {
    }

    /* renamed from: clone */
    public Node mo1633clone() {
    }

    public void outerHtml(Appendable appendable) {
    }

    public void addChildren(int i2, Node... nodeArr) {
    }

    public Node attr(String str, String str2) {
    }
}
