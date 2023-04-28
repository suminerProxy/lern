package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;
    @Nullable
    private AspectRatioListener aspectRatioListener;
    private final AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface AspectRatioListener {
        void onAspectRatioUpdated(float targetAspectRatio, float naturalAspectRatio, boolean aspectRatioMismatch);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AspectRatioUpdateDispatcher implements Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;
        public final /* synthetic */ AspectRatioFrameLayout this$0;

        private AspectRatioUpdateDispatcher(final AspectRatioFrameLayout this$0) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void scheduleUpdate(float targetAspectRatio, float naturalAspectRatio, boolean aspectRatioMismatch) {
        }

        public /* synthetic */ AspectRatioUpdateDispatcher(AspectRatioFrameLayout aspectRatioFrameLayout, AnonymousClass1 anonymousClass1) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context) {
    }

    public static /* synthetic */ AspectRatioListener access$100(AspectRatioFrameLayout aspectRatioFrameLayout) {
    }

    public int getResizeMode() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }

    public void setAspectRatio(float widthHeightRatio) {
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener listener) {
    }

    public void setResizeMode(int resizeMode) {
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attrs) {
    }
}
