package com.facebook.stetho.inspector.elements.android;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ViewHighlighter {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class NoopHighlighter extends ViewHighlighter {
        private NoopHighlighter() {
        }

        @Override // com.facebook.stetho.inspector.elements.android.ViewHighlighter
        public void clearHighlight() {
        }

        @Override // com.facebook.stetho.inspector.elements.android.ViewHighlighter
        public void setHighlightedView(View view, @Nullable Rect rect, int i2) {
        }

        public /* synthetic */ NoopHighlighter(AnonymousClass1 anonymousClass1) {
        }
    }

    @TargetApi(18)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class OverlayHighlighter extends ViewHighlighter {
        private AtomicReference<Rect> mBoundsToHighlight;
        private AtomicInteger mContentColor;
        private final Rect mEmptyRect;
        private final Handler mHandler;
        private final ViewHighlightOverlays mHighlightOverlays;
        private final Runnable mHighlightViewOnUiThreadRunnable;
        private final Rect mHighlightedBounds;
        private View mHighlightedView;
        private AtomicReference<View> mViewToHighlight;

        /* renamed from: com.facebook.stetho.inspector.elements.android.ViewHighlighter$OverlayHighlighter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ OverlayHighlighter this$0;

            public AnonymousClass1(OverlayHighlighter overlayHighlighter) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public static /* synthetic */ void access$100(OverlayHighlighter overlayHighlighter) {
        }

        private void highlightViewOnUiThread() {
        }

        private void setHighlightedViewImpl(@Nullable View view, @Nullable Rect rect, int i2) {
        }

        @Override // com.facebook.stetho.inspector.elements.android.ViewHighlighter
        public void clearHighlight() {
        }

        @Override // com.facebook.stetho.inspector.elements.android.ViewHighlighter
        public void setHighlightedView(View view, @Nullable Rect rect, int i2) {
        }
    }

    public static ViewHighlighter newInstance() {
    }

    public abstract void clearHighlight();

    public abstract void setHighlightedView(View view, @Nullable Rect rect, int i2);
}
