package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(@NonNull Context context) {
    }

    private static int getMeasuredDimension(int i2, int i3, int i4) {
    }

    private void loadFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public int getItemSpacing() {
    }

    public int getLineSpacing() {
    }

    public int getRowCount() {
    }

    public int getRowIndex(@NonNull View view) {
    }

    public boolean isSingleLine() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setItemSpacing(int i2) {
    }

    public void setLineSpacing(int i2) {
    }

    public void setSingleLine(boolean z) {
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }

    @TargetApi(21)
    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
    }
}
