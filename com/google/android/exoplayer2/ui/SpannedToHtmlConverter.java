package com.google.android.exoplayer2.ui;

import android.text.Spanned;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SpannedToHtmlConverter {
    private static final Pattern NEWLINE_PATTERN = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class HtmlAndCss {
        public final Map<String, String> cssRuleSets;
        public final String html;

        public /* synthetic */ HtmlAndCss(String str, Map map, AnonymousClass1 anonymousClass1) {
        }

        private HtmlAndCss(String html, Map<String, String> cssRuleSets) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SpanInfo {
        private static final Comparator<SpanInfo> FOR_CLOSING_TAGS = null;
        private static final Comparator<SpanInfo> FOR_OPENING_TAGS = null;
        public final String closingTag;
        public final int end;
        public final String openingTag;
        public final int start;

        public /* synthetic */ SpanInfo(int i2, int i3, String str, String str2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ int a(SpanInfo spanInfo, SpanInfo spanInfo2) {
        }

        public static /* synthetic */ Comparator access$200() {
        }

        public static /* synthetic */ Comparator access$400() {
        }

        public static /* synthetic */ int b(SpanInfo spanInfo, SpanInfo spanInfo2) {
        }

        private SpanInfo(int start, int end, String openingTag, String closingTag) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Transition {
        private final List<SpanInfo> spansAdded;
        private final List<SpanInfo> spansRemoved;

        public static /* synthetic */ List access$100(Transition transition) {
        }

        public static /* synthetic */ List access$300(Transition transition) {
        }
    }

    private SpannedToHtmlConverter() {
    }

    public static HtmlAndCss convert(@Nullable CharSequence text, float displayDensity) {
    }

    private static String escapeHtml(CharSequence text) {
    }

    private static SparseArray<Transition> findSpanTransitions(Spanned spanned, float displayDensity) {
    }

    @Nullable
    private static String getClosingTag(Object span) {
    }

    @Nullable
    private static String getOpeningTag(Object span, float displayDensity) {
    }

    private static Transition getOrCreate(SparseArray<Transition> transitions, int key) {
    }

    private static String getTextEmphasisPosition(int position) {
    }

    private static String getTextEmphasisStyle(int shape, int fill) {
    }
}
