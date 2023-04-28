package com.google.android.exoplayer2.text.ttml;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TtmlRenderUtil {
    private static final String TAG = "TtmlRenderUtil";

    private TtmlRenderUtil() {
    }

    public static void applyStylesToSpan(Spannable builder, int start, int end, TtmlStyle style, @Nullable TtmlNode parent, Map<String, TtmlStyle> globalStyles, int verticalType) {
    }

    public static String applyTextElementSpacePolicy(String in) {
    }

    public static void endParagraph(SpannableStringBuilder builder) {
    }

    @Nullable
    private static TtmlNode findRubyContainerNode(@Nullable TtmlNode node, Map<String, TtmlStyle> globalStyles) {
    }

    @Nullable
    private static TtmlNode findRubyTextNode(TtmlNode rubyContainerNode, Map<String, TtmlStyle> globalStyles) {
    }

    @Nullable
    public static TtmlStyle resolveStyle(@Nullable TtmlStyle style, @Nullable String[] styleIds, Map<String, TtmlStyle> globalStyles) {
    }
}
