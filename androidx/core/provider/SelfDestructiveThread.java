package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private Handler.Callback mCallback;
    private final int mDestructAfterMillisec;
    @GuardedBy("mLock")
    private int mGeneration;
    @GuardedBy("mLock")
    private Handler mHandler;
    private final Object mLock;
    private final int mPriority;
    @GuardedBy("mLock")
    private HandlerThread mThread;
    private final String mThreadName;

    /* renamed from: androidx.core.provider.SelfDestructiveThread$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Handler.Callback {
        public final /* synthetic */ SelfDestructiveThread this$0;

        public AnonymousClass1(SelfDestructiveThread selfDestructiveThread) {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ SelfDestructiveThread this$0;
        public final /* synthetic */ Callable val$callable;
        public final /* synthetic */ Handler val$callingHandler;
        public final /* synthetic */ ReplyCallback val$reply;

        /* renamed from: androidx.core.provider.SelfDestructiveThread$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ Object val$result;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, Object obj) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(SelfDestructiveThread selfDestructiveThread, Callable callable, Handler handler, ReplyCallback replyCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ SelfDestructiveThread this$0;
        public final /* synthetic */ Callable val$callable;
        public final /* synthetic */ Condition val$cond;
        public final /* synthetic */ AtomicReference val$holder;
        public final /* synthetic */ ReentrantLock val$lock;
        public final /* synthetic */ AtomicBoolean val$running;

        public AnonymousClass3(SelfDestructiveThread selfDestructiveThread, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    public SelfDestructiveThread(String str, int i2, int i3) {
    }

    private void post(Runnable runnable) {
    }

    @VisibleForTesting
    public int getGeneration() {
    }

    @VisibleForTesting
    public boolean isRunning() {
    }

    public void onDestruction() {
    }

    public void onInvokeRunnable(Runnable runnable) {
    }

    public <T> void postAndReply(Callable<T> callable, ReplyCallback<T> replyCallback) {
    }

    public <T> T postAndWait(Callable<T> callable, int i2) throws InterruptedException {
    }
}
