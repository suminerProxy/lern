package com.taihebase.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AutoScrollRecyclerView extends RecyclerView {

    /* renamed from: f  reason: collision with root package name */
    private static final long f7977f = 16;
    public a b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7978d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7979e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Runnable {
        private final WeakReference<AutoScrollRecyclerView> b;

        public a(AutoScrollRecyclerView autoScrollRecyclerView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public AutoScrollRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public static /* synthetic */ boolean a(AutoScrollRecyclerView autoScrollRecyclerView) {
    }

    public void b() {
    }

    public void c() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
    }
}
