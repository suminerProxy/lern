package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class Collector {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Accumulator implements NodeVisitor {
        private final Elements elements;
        private final Evaluator eval;
        private final Element root;

        public Accumulator(Element element, Elements elements, Evaluator evaluator) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i2) {
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class FirstFinder implements NodeFilter {
        private final Evaluator eval;
        private Element match;
        private final Element root;

        public FirstFinder(Element element, Evaluator evaluator) {
        }

        public static /* synthetic */ Element access$000(FirstFinder firstFinder) {
        }

        @Override // org.jsoup.select.NodeFilter
        public NodeFilter.FilterResult head(Node node, int i2) {
        }

        @Override // org.jsoup.select.NodeFilter
        public NodeFilter.FilterResult tail(Node node, int i2) {
        }
    }

    private Collector() {
    }

    public static Elements collect(Evaluator evaluator, Element element) {
    }

    public static Element findFirst(Evaluator evaluator, Element element) {
    }
}
