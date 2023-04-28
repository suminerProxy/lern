package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class TextDrawableHelper {
    @Nullable
    private WeakReference<TextDrawableDelegate> delegate;
    private final TextAppearanceFontCallback fontCallback;
    @Nullable
    private TextAppearance textAppearance;
    private final TextPaint textPaint;
    private float textWidth;
    private boolean textWidthDirty;

    /* renamed from: com.google.android.material.internal.TextDrawableHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends TextAppearanceFontCallback {
        public final /* synthetic */ TextDrawableHelper this$0;

        public AnonymousClass1(TextDrawableHelper textDrawableHelper) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i2) {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@NonNull Typeface typeface, boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface TextDrawableDelegate {
        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableDelegate) {
    }

    public static /* synthetic */ boolean access$002(TextDrawableHelper textDrawableHelper, boolean z) {
    }

    public static /* synthetic */ WeakReference access$100(TextDrawableHelper textDrawableHelper) {
    }

    private float calculateTextWidth(@Nullable CharSequence charSequence) {
    }

    @Nullable
    public TextAppearance getTextAppearance() {
    }

    @NonNull
    public TextPaint getTextPaint() {
    }

    public float getTextWidth(String str) {
    }

    public boolean isTextWidthDirty() {
    }

    public void setDelegate(@Nullable TextDrawableDelegate textDrawableDelegate) {
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance, Context context) {
    }

    public void setTextWidthDirty(boolean z) {
    }

    public void updateTextPaintDrawState(Context context) {
    }
}
