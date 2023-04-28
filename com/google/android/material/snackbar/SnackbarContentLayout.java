package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private int maxInlineActionWidth;
    private int maxWidth;
    private TextView messageView;

    public SnackbarContentLayout(@NonNull Context context) {
    }

    private static void updateTopBottomPadding(@NonNull View view, int i2, int i3) {
    }

    private boolean updateViewsWithinLayout(int i2, int i3, int i4) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i2, int i3) {
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i2, int i3) {
    }

    public Button getActionView() {
    }

    public TextView getMessageView() {
    }

    @Override // android.view.View
    public void onFinishInflate() {
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setMaxInlineActionWidth(int i2) {
    }

    public void updateActionTextColorAlphaIfNeeded(float f2) {
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
