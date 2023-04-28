package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DocumentData {
    public final float baselineShift;
    @ColorInt
    public final int color;
    public final String fontName;
    public final Justification justification;
    public final float lineHeight;
    public final float size;
    @ColorInt
    public final int strokeColor;
    public final boolean strokeOverFill;
    public final float strokeWidth;
    public final String text;
    public final int tracking;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Justification {
        private static final /* synthetic */ Justification[] $VALUES = null;
        public static final Justification CENTER = null;
        public static final Justification LEFT_ALIGN = null;
        public static final Justification RIGHT_ALIGN = null;

        private Justification(String str, int i2) {
        }

        public static Justification valueOf(String str) {
        }

        public static Justification[] values() {
        }
    }

    public DocumentData(String str, String str2, float f2, Justification justification, int i2, float f3, float f4, @ColorInt int i3, @ColorInt int i4, float f5, boolean z) {
    }

    public int hashCode() {
    }
}
