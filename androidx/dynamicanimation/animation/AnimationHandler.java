package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimationHandler {
    private static final long FRAME_DELAY_MS = 10;
    public static final ThreadLocal<AnimationHandler> sAnimatorHandler = null;
    public final ArrayList<AnimationFrameCallback> mAnimationCallbacks;
    private final AnimationCallbackDispatcher mCallbackDispatcher;
    public long mCurrentFrameTime;
    private final SimpleArrayMap<AnimationFrameCallback, Long> mDelayedCallbackStartTime;
    private boolean mListDirty;
    private AnimationFrameCallbackProvider mProvider;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnimationCallbackDispatcher {
        public final /* synthetic */ AnimationHandler this$0;

        public AnimationCallbackDispatcher(AnimationHandler animationHandler) {
        }

        public void dispatchAnimationFrame() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface AnimationFrameCallback {
        boolean doAnimationFrame(long j2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class AnimationFrameCallbackProvider {
        public final AnimationCallbackDispatcher mDispatcher;

        public AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationCallbackDispatcher) {
        }

        public abstract void postFrameCallback();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {
        private final Handler mHandler;
        public long mLastFrameTime;
        private final Runnable mRunnable;

        /* renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ FrameCallbackProvider14 this$0;

            public AnonymousClass1(FrameCallbackProvider14 frameCallbackProvider14) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public FrameCallbackProvider14(AnimationCallbackDispatcher animationCallbackDispatcher) {
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        public void postFrameCallback() {
        }
    }

    @RequiresApi(16)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {
        private final Choreographer mChoreographer;
        private final Choreographer.FrameCallback mChoreographerCallback;

        /* renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider16$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Choreographer.FrameCallback {
            public final /* synthetic */ FrameCallbackProvider16 this$0;

            public AnonymousClass1(FrameCallbackProvider16 frameCallbackProvider16) {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j2) {
            }
        }

        public FrameCallbackProvider16(AnimationCallbackDispatcher animationCallbackDispatcher) {
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        public void postFrameCallback() {
        }
    }

    private void cleanUpList() {
    }

    public static long getFrameTime() {
    }

    public static AnimationHandler getInstance() {
    }

    private boolean isCallbackDue(AnimationFrameCallback animationFrameCallback, long j2) {
    }

    public void addAnimationFrameCallback(AnimationFrameCallback animationFrameCallback, long j2) {
    }

    public void doAnimationFrame(long j2) {
    }

    public AnimationFrameCallbackProvider getProvider() {
    }

    public void removeCallback(AnimationFrameCallback animationFrameCallback) {
    }

    public void setProvider(AnimationFrameCallbackProvider animationFrameCallbackProvider) {
    }
}
