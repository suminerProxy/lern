package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ViewOverlayApi14 implements ViewOverlayImpl {
    public OverlayViewGroup overlayViewGroup;

    public ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
    }

    public static ViewOverlayApi14 createFrom(View view) {
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@NonNull Drawable drawable) {
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@NonNull Drawable drawable) {
    }

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class OverlayViewGroup extends ViewGroup {
        public static Method invalidateChildInParentFastMethod;
        private boolean disposed;
        public ArrayList<Drawable> drawables;
        public ViewGroup hostView;
        public View requestingView;
        public ViewOverlayApi14 viewOverlay;

        public OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
        }

        private void assertNotDisposed() {
        }

        private void disposeIfEmpty() {
        }

        private void getOffset(int[] iArr) {
        }

        public void add(Drawable drawable) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public ViewParent invalidateChildInParentFast(int i2, int i3, Rect rect) {
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        public void remove(Drawable drawable) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(@NonNull Drawable drawable) {
        }

        public void remove(View view) {
        }

        public void add(View view) {
        }
    }
}
