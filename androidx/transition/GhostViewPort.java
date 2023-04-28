package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GhostViewPort extends ViewGroup implements GhostView {
    @Nullable
    private Matrix mMatrix;
    private final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    public int mReferences;
    public ViewGroup mStartParent;
    public View mStartView;
    public final View mView;

    /* renamed from: androidx.transition.GhostViewPort$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ GhostViewPort this$0;

        public AnonymousClass1(GhostViewPort ghostViewPort) {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
        }
    }

    public GhostViewPort(View view) {
    }

    public static GhostViewPort addGhost(View view, ViewGroup viewGroup, Matrix matrix) {
    }

    public static void calculateMatrix(View view, ViewGroup viewGroup, Matrix matrix) {
    }

    public static void copySize(View view, View view2) {
    }

    public static GhostViewPort getGhostView(View view) {
    }

    public static void removeGhost(View view) {
    }

    public static void setGhostView(@NonNull View view, @Nullable GhostViewPort ghostViewPort) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
    }

    public void setMatrix(@NonNull Matrix matrix) {
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int i2) {
    }
}
