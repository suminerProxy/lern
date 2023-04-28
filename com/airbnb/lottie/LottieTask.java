package com.airbnb.lottie;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LottieTask<T> {
    public static Executor EXECUTOR;
    private final Set<LottieListener<Throwable>> failureListeners;
    private final Handler handler;
    @Nullable
    private volatile LottieResult<T> result;
    private final Set<LottieListener<T>> successListeners;

    /* renamed from: com.airbnb.lottie.LottieTask$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ LottieTask this$0;

        public AnonymousClass1(LottieTask lottieTask) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class LottieFutureTask extends FutureTask<LottieResult<T>> {
        public final /* synthetic */ LottieTask this$0;

        public LottieFutureTask(LottieTask lottieTask, Callable<LottieResult<T>> callable) {
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable) {
    }

    public static /* synthetic */ LottieResult access$000(LottieTask lottieTask) {
    }

    public static /* synthetic */ void access$100(LottieTask lottieTask, Object obj) {
    }

    public static /* synthetic */ void access$200(LottieTask lottieTask, Throwable th) {
    }

    public static /* synthetic */ void access$300(LottieTask lottieTask, LottieResult lottieResult) {
    }

    private synchronized void notifyFailureListeners(Throwable th) {
    }

    private void notifyListeners() {
    }

    private synchronized void notifySuccessListeners(T t) {
    }

    private void setResult(@Nullable LottieResult<T> lottieResult) {
    }

    public synchronized LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
    }

    public synchronized LottieTask<T> addListener(LottieListener<T> lottieListener) {
    }

    public synchronized LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
    }

    public synchronized LottieTask<T> removeListener(LottieListener<T> lottieListener) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable, boolean z) {
    }
}
