package org.jsoup.safety;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Cleaner {
    private Whitelist whitelist;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class CleaningVisitor implements NodeVisitor {
        private Element destination;
        private int numDiscarded;
        private final Element root;
        public final /* synthetic */ Cleaner this$0;

        public /* synthetic */ CleaningVisitor(Cleaner cleaner, Element element, Element element2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ int access$300(CleaningVisitor cleaningVisitor) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i2) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i2) {
        }

        private CleaningVisitor(Cleaner cleaner, Element element, Element element2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class ElementMeta {
        public Element el;
        public int numAttribsDiscarded;

        public ElementMeta(Element element, int i2) {
        }
    }

    public Cleaner(Whitelist whitelist) {
    }

    public static /* synthetic */ Whitelist access$000(Cleaner cleaner) {
    }

    public static /* synthetic */ ElementMeta access$100(Cleaner cleaner, Element element) {
    }

    private int copySafeNodes(Element element, Element element2) {
    }

    private ElementMeta createSafeElement(Element element) {
    }

    public Document clean(Document document) {
    }

    public boolean isValid(Document document) {
    }

    public boolean isValidBodyHtml(String str) {
    }
}
