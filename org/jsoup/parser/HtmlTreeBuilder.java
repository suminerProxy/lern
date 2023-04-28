package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class HtmlTreeBuilder extends TreeBuilder {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int MaxScopeSearchDepth = 100;
    public static final String[] TagSearchButton = null;
    public static final String[] TagSearchEndTags = null;
    public static final String[] TagSearchList = null;
    public static final String[] TagSearchSelectScope = null;
    public static final String[] TagSearchSpecial = null;
    public static final String[] TagSearchTableScope = null;
    public static final String[] TagsSearchInScope = null;
    private boolean baseUriSetFromDoc;
    private Element contextElement;
    private Token.EndTag emptyEnd;
    private FormElement formElement;
    private ArrayList<Element> formattingElements;
    private boolean fosterInserts;
    private boolean fragmentParsing;
    private boolean framesetOk;
    private Element headElement;
    private HtmlTreeBuilderState originalState;
    private List<String> pendingTableCharacters;
    private String[] specificScopeTarget;
    private HtmlTreeBuilderState state;

    private void clearStackToContext(String... strArr) {
    }

    private boolean inSpecificScope(String str, String[] strArr, String[] strArr2) {
    }

    private void insertNode(Node node) {
    }

    private boolean isElementInQueue(ArrayList<Element> arrayList, Element element) {
    }

    private boolean isSameFormattingElement(Element element, Element element2) {
    }

    private void replaceInQueue(ArrayList<Element> arrayList, Element element, Element element2) {
    }

    public Element aboveOnStack(Element element) {
    }

    public void clearFormattingElementsToLastMarker() {
    }

    public void clearStackToTableBodyContext() {
    }

    public void clearStackToTableContext() {
    }

    public void clearStackToTableRowContext() {
    }

    @Override // org.jsoup.parser.TreeBuilder
    public ParseSettings defaultSettings() {
    }

    public void error(HtmlTreeBuilderState htmlTreeBuilderState) {
    }

    public void framesetOk(boolean z) {
    }

    public void generateImpliedEndTags(String str) {
    }

    public Element getActiveFormattingElement(String str) {
    }

    public String getBaseUri() {
    }

    public Document getDocument() {
    }

    public FormElement getFormElement() {
    }

    public Element getFromStack(String str) {
    }

    public Element getHeadElement() {
    }

    public List<String> getPendingTableCharacters() {
    }

    public ArrayList<Element> getStack() {
    }

    public boolean inButtonScope(String str) {
    }

    public boolean inListItemScope(String str) {
    }

    public boolean inScope(String[] strArr) {
    }

    public boolean inSelectScope(String str) {
    }

    public boolean inTableScope(String str) {
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void initialiseParse(Reader reader, String str, ParseErrorList parseErrorList, ParseSettings parseSettings) {
    }

    public Element insert(Token.StartTag startTag) {
    }

    public Element insertEmpty(Token.StartTag startTag) {
    }

    public FormElement insertForm(Token.StartTag startTag, boolean z) {
    }

    public void insertInFosterParent(Node node) {
    }

    public void insertMarkerToFormattingElements() {
    }

    public void insertOnStackAfter(Element element, Element element2) {
    }

    public Element insertStartTag(String str) {
    }

    public boolean isFosterInserts() {
    }

    public boolean isFragmentParsing() {
    }

    public boolean isInActiveFormattingElements(Element element) {
    }

    public boolean isSpecial(Element element) {
    }

    public Element lastFormattingElement() {
    }

    public void markInsertionMode() {
    }

    public void maybeSetBaseUri(Element element) {
    }

    public void newPendingTableCharacters() {
    }

    public boolean onStack(Element element) {
    }

    public HtmlTreeBuilderState originalState() {
    }

    public List<Node> parseFragment(String str, Element element, String str2, ParseErrorList parseErrorList, ParseSettings parseSettings) {
    }

    public Element pop() {
    }

    public void popStackToBefore(String str) {
    }

    public void popStackToClose(String str) {
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean process(Token token) {
    }

    @Override // org.jsoup.parser.TreeBuilder
    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
    }

    public void push(Element element) {
    }

    public void pushActiveFormattingElements(Element element) {
    }

    public void reconstructFormattingElements() {
    }

    public void removeFromActiveFormattingElements(Element element) {
    }

    public boolean removeFromStack(Element element) {
    }

    public Element removeLastFormattingElement() {
    }

    public void replaceActiveFormattingElement(Element element, Element element2) {
    }

    public void replaceOnStack(Element element, Element element2) {
    }

    public void resetInsertionMode() {
    }

    public void setFormElement(FormElement formElement) {
    }

    public void setFosterInserts(boolean z) {
    }

    public void setHeadElement(Element element) {
    }

    public void setPendingTableCharacters(List<String> list) {
    }

    public HtmlTreeBuilderState state() {
    }

    public String toString() {
    }

    public void transition(HtmlTreeBuilderState htmlTreeBuilderState) {
    }

    public boolean framesetOk() {
    }

    public boolean inScope(String str) {
    }

    private boolean inSpecificScope(String[] strArr, String[] strArr2, String[] strArr3) {
    }

    public boolean inScope(String str, String[] strArr) {
    }

    public boolean process(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
    }

    public void generateImpliedEndTags() {
    }

    public void popStackToClose(String... strArr) {
    }

    public void insert(Element element) {
    }

    public void insert(Token.Comment comment) {
    }

    public void insert(Token.Character character) {
    }
}
