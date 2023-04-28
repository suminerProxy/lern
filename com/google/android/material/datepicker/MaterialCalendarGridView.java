package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.Calendar;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AccessibilityDelegateCompat {
        public final /* synthetic */ MaterialCalendarGridView this$0;

        public AnonymousClass1(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }
    }

    public MaterialCalendarGridView(Context context) {
    }

    private void gainFocus(int i2, Rect rect) {
    }

    private static int horizontalMidPoint(@NonNull View view) {
    }

    private static boolean skipMonth(@Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable Long l5) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public /* bridge */ /* synthetic */ ListAdapter getAdapter() {
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ ListAdapter getAdapter2() {
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public final void setAdapter2(ListAdapter listAdapter) {
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public ListAdapter getAdapter() {
    }
}
