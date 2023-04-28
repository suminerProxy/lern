package com.google.android.exoplayer2.text.ttml;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TextEmphasis {
    private static final ImmutableSet<String> MARK_FILL_VALUES = null;
    public static final int MARK_SHAPE_AUTO = -1;
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = null;
    public static final int POSITION_OUTSIDE = -2;
    private static final ImmutableSet<String> POSITION_VALUES = null;
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = null;
    private static final Pattern WHITESPACE_PATTERN = null;
    public final int markFill;
    public final int markShape;
    public final int position;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Position {
    }

    private TextEmphasis(int markShape, int markFill, int position) {
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String value) {
    }

    private static TextEmphasis parseWords(ImmutableSet<String> nodes) {
    }
}
