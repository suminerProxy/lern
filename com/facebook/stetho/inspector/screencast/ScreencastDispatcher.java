package com.facebook.stetho.inspector.screencast;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.stetho.inspector.elements.android.ActivityTracker;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.protocol.module.Page;
import java.io.ByteArrayOutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ScreencastDispatcher {
    private static final long FRAME_DELAY = 200;
    private final ActivityTracker mActivityTracker;
    private Handler mBackgroundHandler;
    private Bitmap mBitmap;
    private final BitmapFetchRunnable mBitmapFetchRunnable;
    private Canvas mCanvas;
    private Page.ScreencastFrameEvent mEvent;
    private final EventDispatchRunnable mEventDispatchRunnable;
    private HandlerThread mHandlerThread;
    private boolean mIsRunning;
    private final Handler mMainHandler;
    private Page.ScreencastFrameEventMetadata mMetadata;
    private JsonRpcPeer mPeer;
    private Page.StartScreencastRequest mRequest;
    private ByteArrayOutputStream mStream;
    private final RectF mTempDst;
    private final RectF mTempSrc;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class BitmapFetchRunnable implements Runnable {
        public final /* synthetic */ ScreencastDispatcher this$0;

        private BitmapFetchRunnable(ScreencastDispatcher screencastDispatcher) {
        }

        private void updateScreenBitmap() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ BitmapFetchRunnable(ScreencastDispatcher screencastDispatcher, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class CancellationRunnable implements Runnable {
        public final /* synthetic */ ScreencastDispatcher this$0;

        private CancellationRunnable(ScreencastDispatcher screencastDispatcher) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ CancellationRunnable(ScreencastDispatcher screencastDispatcher, AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class EventDispatchRunnable implements Runnable {
        private Runnable mEndAction;
        public final /* synthetic */ ScreencastDispatcher this$0;

        private EventDispatchRunnable(ScreencastDispatcher screencastDispatcher) {
        }

        public static /* synthetic */ EventDispatchRunnable access$400(EventDispatchRunnable eventDispatchRunnable, Runnable runnable) {
        }

        private EventDispatchRunnable withEndAction(Runnable runnable) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public /* synthetic */ EventDispatchRunnable(ScreencastDispatcher screencastDispatcher, AnonymousClass1 anonymousClass1) {
        }
    }

    public static /* synthetic */ Canvas access$1000(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ Canvas access$1002(ScreencastDispatcher screencastDispatcher, Canvas canvas) {
    }

    public static /* synthetic */ RectF access$1100(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ RectF access$1200(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ ByteArrayOutputStream access$1300(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ ByteArrayOutputStream access$1302(ScreencastDispatcher screencastDispatcher, ByteArrayOutputStream byteArrayOutputStream) {
    }

    public static /* synthetic */ Page.ScreencastFrameEvent access$1400(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ Page.ScreencastFrameEventMetadata access$1500(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ JsonRpcPeer access$1600(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ Handler access$1700(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ HandlerThread access$1800(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ HandlerThread access$1802(ScreencastDispatcher screencastDispatcher, HandlerThread handlerThread) {
    }

    public static /* synthetic */ BitmapFetchRunnable access$1900(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ EventDispatchRunnable access$300(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ Handler access$500(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ boolean access$600(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ boolean access$602(ScreencastDispatcher screencastDispatcher, boolean z) {
    }

    public static /* synthetic */ ActivityTracker access$700(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ Bitmap access$800(ScreencastDispatcher screencastDispatcher) {
    }

    public static /* synthetic */ Bitmap access$802(ScreencastDispatcher screencastDispatcher, Bitmap bitmap) {
    }

    public static /* synthetic */ Page.StartScreencastRequest access$900(ScreencastDispatcher screencastDispatcher) {
    }

    public void startScreencast(JsonRpcPeer jsonRpcPeer, Page.StartScreencastRequest startScreencastRequest) {
    }

    public void stopScreencast() {
    }
}
