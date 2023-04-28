package org.jsoup.nodes;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Element extends Node {
    private static final List<Node> EMPTY_NODES = null;
    private static final Pattern classSplit = null;
    private Attributes attributes;
    private String baseUri;
    public List<Node> childNodes;
    private WeakReference<List<Element>> shadowChildrenRef;
    private Tag tag;

    /* renamed from: org.jsoup.nodes.Element$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements NodeVisitor {
        public final /* synthetic */ Element this$0;
        public final /* synthetic */ StringBuilder val$accum;

        public AnonymousClass1(Element element, StringBuilder sb) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i2) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i2) {
        }
    }

    /* renamed from: org.jsoup.nodes.Element$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass2 implements NodeVisitor {
        public final /* synthetic */ Element this$0;
        public final /* synthetic */ StringBuilder val$accum;

        public AnonymousClass2(Element element, StringBuilder sb) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i2) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class NodeList extends ChangeNotifyingArrayList<Node> {
        private final Element owner;

        public NodeList(Element element, int i2) {
        }

        @Override // org.jsoup.helper.ChangeNotifyingArrayList
        public void onContentsChanged() {
        }
    }

    public Element(String str) {
    }

    public static /* synthetic */ void access$000(StringBuilder sb, TextNode textNode) {
    }

    public static /* synthetic */ Tag access$100(Element element) {
    }

    private static void accumulateParents(Element element, Elements elements) {
    }

    private static void appendNormalisedText(StringBuilder sb, TextNode textNode) {
    }

    private static void appendWhitespaceIfBr(Element element, StringBuilder sb) {
    }

    private List<Element> childElementsList() {
    }

    private static <E extends Element> int indexInList(Element element, List<E> list) {
    }

    public static boolean preserveWhitespace(Node node) {
    }

    public Element addClass(String str) {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node after(String str) {
    }

    public Element append(String str) {
    }

    public Element appendChild(Node node) {
    }

    public Element appendElement(String str) {
    }

    public Element appendText(String str) {
    }

    public Element appendTo(Element element) {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node attr(String str, String str2) {
    }

    @Override // org.jsoup.nodes.Node
    public Attributes attributes() {
    }

    @Override // org.jsoup.nodes.Node
    public String baseUri() {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node before(String str) {
    }

    public Element child(int i2) {
    }

    @Override // org.jsoup.nodes.Node
    public int childNodeSize() {
    }

    public Elements children() {
    }

    public String className() {
    }

    public Set<String> classNames() {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
    }

    public String cssSelector() {
    }

    public String data() {
    }

    public List<DataNode> dataNodes() {
    }

    public Map<String, String> dataset() {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node doClone(Node node) {
    }

    @Override // org.jsoup.nodes.Node
    public void doSetBaseUri(String str) {
    }

    public int elementSiblingIndex() {
    }

    public Element empty() {
    }

    @Override // org.jsoup.nodes.Node
    public List<Node> ensureChildNodes() {
    }

    public Element firstElementSibling() {
    }

    public Elements getAllElements() {
    }

    public Element getElementById(String str) {
    }

    public Elements getElementsByAttribute(String str) {
    }

    public Elements getElementsByAttributeStarting(String str) {
    }

    public Elements getElementsByAttributeValue(String str, String str2) {
    }

    public Elements getElementsByAttributeValueContaining(String str, String str2) {
    }

    public Elements getElementsByAttributeValueEnding(String str, String str2) {
    }

    public Elements getElementsByAttributeValueMatching(String str, Pattern pattern) {
    }

    public Elements getElementsByAttributeValueNot(String str, String str2) {
    }

    public Elements getElementsByAttributeValueStarting(String str, String str2) {
    }

    public Elements getElementsByClass(String str) {
    }

    public Elements getElementsByIndexEquals(int i2) {
    }

    public Elements getElementsByIndexGreaterThan(int i2) {
    }

    public Elements getElementsByIndexLessThan(int i2) {
    }

    public Elements getElementsByTag(String str) {
    }

    public Elements getElementsContainingOwnText(String str) {
    }

    public Elements getElementsContainingText(String str) {
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
    }

    public Elements getElementsMatchingText(Pattern pattern) {
    }

    @Override // org.jsoup.nodes.Node
    public boolean hasAttributes() {
    }

    public boolean hasClass(String str) {
    }

    public boolean hasText() {
    }

    public String html() {
    }

    public String id() {
    }

    public Element insertChildren(int i2, Collection<? extends Node> collection) {
    }

    public boolean is(String str) {
    }

    public boolean isBlock() {
    }

    public Element lastElementSibling() {
    }

    public Element nextElementSibling() {
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
    }

    @Override // org.jsoup.nodes.Node
    public void nodelistChanged() {
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(Appendable appendable, int i2, Document.OutputSettings outputSettings) throws IOException {
    }

    public String ownText() {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node parent() {
    }

    public Elements parents() {
    }

    public Element prepend(String str) {
    }

    public Element prependChild(Node node) {
    }

    public Element prependElement(String str) {
    }

    public Element prependText(String str) {
    }

    public Element previousElementSibling() {
    }

    public Element removeClass(String str) {
    }

    public Elements select(String str) {
    }

    public Element selectFirst(String str) {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node shallowClone() {
    }

    public Elements siblingElements() {
    }

    public Tag tag() {
    }

    public String tagName() {
    }

    public String text() {
    }

    public List<TextNode> textNodes() {
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
    }

    public Element toggleClass(String str) {
    }

    public String val() {
    }

    public String wholeText() {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node wrap(String str) {
    }

    public Element(Tag tag, String str, Attributes attributes) {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node after(Node node) {
    }

    @Override // org.jsoup.nodes.Node
    public Element attr(String str, String str2) {
    }

    @Override // org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Node before(Node node) {
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Node mo1633clone() {
    }

    @Override // org.jsoup.nodes.Node
    public Element doClone(Node node) {
    }

    public Elements getElementsByAttributeValueMatching(String str, String str2) {
    }

    public Elements getElementsMatchingOwnText(String str) {
    }

    public Elements getElementsMatchingText(String str) {
    }

    public boolean is(Evaluator evaluator) {
    }

    @Override // org.jsoup.nodes.Node
    public final Element parent() {
    }

    @Override // org.jsoup.nodes.Node
    public Element shallowClone() {
    }

    public Element tagName(String str) {
    }

    @Override // org.jsoup.nodes.Node
    public Element wrap(String str) {
    }

    @Override // org.jsoup.nodes.Node
    public Element after(String str) {
    }

    public Element attr(String str, boolean z) {
    }

    @Override // org.jsoup.nodes.Node
    public Element before(String str) {
    }

    @Override // org.jsoup.nodes.Node
    public Element clone() {
    }

    private void html(StringBuilder sb) {
    }

    private void ownText(StringBuilder sb) {
    }

    @Override // org.jsoup.nodes.Node
    public Element after(Node node) {
    }

    @Override // org.jsoup.nodes.Node
    public Element before(Node node) {
    }

    public Element classNames(Set<String> set) {
    }

    public Element text(String str) {
    }

    public Element val(String str) {
    }

    @Override // org.jsoup.nodes.Node
    public <T extends Appendable> T html(T t) {
    }

    public Element insertChildren(int i2, Node... nodeArr) {
    }

    public Element html(String str) {
    }

    public Element(Tag tag, String str) {
    }
}
