package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;
    @Nullable
    public final String fontFamily;
    @FontRes
    private final int fontFamilyResourceId;
    private boolean fontResolved;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    @Nullable
    public final ColorStateList textColor;
    @Nullable
    public final ColorStateList textColorHint;
    @Nullable
    public final ColorStateList textColorLink;
    public float textSize;
    public final int textStyle;
    public final int typeface;

    /* renamed from: com.google.android.material.resources.TextAppearance$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends ResourcesCompat.FontCallback {
        public final /* synthetic */ TextAppearance this$0;
        public final /* synthetic */ TextAppearanceFontCallback val$callback;

        public AnonymousClass1(TextAppearance textAppearance, TextAppearanceFontCallback textAppearanceFontCallback) {
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrievalFailed(int i2) {
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrieved(@NonNull Typeface typeface) {
        }
    }

    /* renamed from: com.google.android.material.resources.TextAppearance$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass2 extends TextAppearanceFontCallback {
        public final /* synthetic */ TextAppearance this$0;
        public final /* synthetic */ TextAppearanceFontCallback val$callback;
        public final /* synthetic */ TextPaint val$textPaint;

        public AnonymousClass2(TextAppearance textAppearance, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i2) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@NonNull Typeface typeface, boolean z) {
        }
    }

    public TextAppearance(@NonNull Context context, @StyleRes int i2) {
    }

    public static /* synthetic */ Typeface access$000(TextAppearance textAppearance) {
    }

    public static /* synthetic */ Typeface access$002(TextAppearance textAppearance, Typeface typeface) {
    }

    public static /* synthetic */ boolean access$102(TextAppearance textAppearance, boolean z) {
    }

    private void createFallbackFont() {
    }

    private boolean shouldLoadFontSynchronously(Context context) {
    }

    public Typeface getFallbackFont() {
    }

    @NonNull
    @VisibleForTesting
    public Typeface getFont(@NonNull Context context) {
    }

    public void getFontAsync(@NonNull Context context, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
    }

    public void updateDrawState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
    }

    public void updateMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
    }

    public void updateTextPaintMeasureState(@NonNull TextPaint textPaint, @NonNull Typeface typeface) {
    }

    public void getFontAsync(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
    }
}
