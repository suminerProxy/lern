package org.jsoup.select;

import org.jsoup.nodes.Node;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface NodeFilter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class FilterResult {
        private static final /* synthetic */ FilterResult[] $VALUES = null;
        public static final FilterResult CONTINUE = null;
        public static final FilterResult REMOVE = null;
        public static final FilterResult SKIP_CHILDREN = null;
        public static final FilterResult SKIP_ENTIRELY = null;
        public static final FilterResult STOP = null;

        private FilterResult(String str, int i2) {
        }

        public static FilterResult valueOf(String str) {
        }

        public static FilterResult[] values() {
        }
    }

    FilterResult head(Node node, int i2);

    FilterResult tail(Node node, int i2);
}
