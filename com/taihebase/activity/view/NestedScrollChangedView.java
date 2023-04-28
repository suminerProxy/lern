package com.taihebase.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class NestedScrollChangedView extends ScrollView {
    private a b;
    private float c;

    /* renamed from: d  reason: collision with root package name */
    private float f8011d;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a(int i2, int i3, int i4, int i5);
    }

    public NestedScrollChangedView(Context context) {
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
    }

    public void setScrollViewListener(a aVar) {
    }

    public NestedScrollChangedView(Context context, AttributeSet attributeSet) {
    }

    public NestedScrollChangedView(Context context, AttributeSet attributeSet, int i2) {
    }
}
