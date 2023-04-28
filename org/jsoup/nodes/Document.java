package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.nodes.Entities;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Document extends Element {
    private String location;
    private OutputSettings outputSettings;
    private QuirksMode quirksMode;
    private boolean updateMetaCharset;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class OutputSettings implements Cloneable {
        private Charset charset;
        public Entities.CoreCharset coreCharset;
        private ThreadLocal<CharsetEncoder> encoderThreadLocal;
        private Entities.EscapeMode escapeMode;
        private int indentAmount;
        private boolean outline;
        private boolean prettyPrint;
        private Syntax syntax;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class Syntax {
            private static final /* synthetic */ Syntax[] $VALUES = null;
            public static final Syntax html = null;
            public static final Syntax xml = null;

            private Syntax(String str, int i2) {
            }

            public static Syntax valueOf(String str) {
            }

            public static Syntax[] values() {
            }
        }

        public Charset charset() {
        }

        public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        }

        public CharsetEncoder encoder() {
        }

        public Entities.EscapeMode escapeMode() {
        }

        public int indentAmount() {
        }

        public boolean outline() {
        }

        public CharsetEncoder prepareEncoder() {
        }

        public boolean prettyPrint() {
        }

        public Syntax syntax() {
        }

        public OutputSettings charset(Charset charset) {
        }

        /* renamed from: clone  reason: collision with other method in class */
        public OutputSettings m1634clone() {
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
        }

        public OutputSettings indentAmount(int i2) {
        }

        public OutputSettings outline(boolean z) {
        }

        public OutputSettings prettyPrint(boolean z) {
        }

        public OutputSettings syntax(Syntax syntax) {
        }

        public OutputSettings charset(String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class QuirksMode {
        private static final /* synthetic */ QuirksMode[] $VALUES = null;
        public static final QuirksMode limitedQuirks = null;
        public static final QuirksMode noQuirks = null;
        public static final QuirksMode quirks = null;

        private QuirksMode(String str, int i2) {
        }

        public static QuirksMode valueOf(String str) {
        }

        public static QuirksMode[] values() {
        }
    }

    public Document(String str) {
    }

    public static Document createShell(String str) {
    }

    private void ensureMetaCharsetElement() {
    }

    private Element findFirstElementByTagName(String str, Node node) {
    }

    private void normaliseStructure(String str, Element element) {
    }

    private void normaliseTextNodes(Element element) {
    }

    public Element body() {
    }

    public void charset(Charset charset) {
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
    }

    public Element createElement(String str) {
    }

    public Element head() {
    }

    public String location() {
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public String nodeName() {
    }

    public Document normalise() {
    }

    @Override // org.jsoup.nodes.Node
    public String outerHtml() {
    }

    public OutputSettings outputSettings() {
    }

    public QuirksMode quirksMode() {
    }

    @Override // org.jsoup.nodes.Element
    public Element text(String str) {
    }

    public String title() {
    }

    public void updateMetaCharsetElement(boolean z) {
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public /* bridge */ /* synthetic */ Element clone() {
    }

    public Document outputSettings(OutputSettings outputSettings) {
    }

    public Document quirksMode(QuirksMode quirksMode) {
    }

    public boolean updateMetaCharsetElement() {
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: clone  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Node mo1633clone() {
    }

    public void title(String str) {
    }

    public Charset charset() {
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public Document clone() {
    }
}
