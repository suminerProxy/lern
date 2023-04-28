package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class InterpolateOnScrollPositionChangeHelper {
    private final int[] containerLocation;
    private ScrollView containingScrollView;
    private MaterialShapeDrawable materialShapeDrawable;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final int[] scrollLocation;
    private View shapedView;

    /* renamed from: com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements ViewTreeObserver.OnScrollChangedListener {
        public final /* synthetic */ InterpolateOnScrollPositionChangeHelper this$0;

        public AnonymousClass1(InterpolateOnScrollPositionChangeHelper interpolateOnScrollPositionChangeHelper) {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
        }
    }

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
    }

    public void setContainingScrollView(ScrollView scrollView) {
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
    }

    public void updateInterpolationForScreenPosition() {
    }
}
