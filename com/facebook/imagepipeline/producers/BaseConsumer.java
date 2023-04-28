package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseConsumer<T> implements Consumer<T> {
    private boolean mIsFinished;

    public static boolean isLast(int status) {
    }

    public static boolean isNotLast(int status) {
    }

    public static int simpleStatusForIsLast(boolean isLast) {
    }

    public static boolean statusHasAnyFlag(int status, int flag) {
    }

    public static boolean statusHasFlag(int status, int flag) {
    }

    public static int turnOffStatusFlag(int status, int flag) {
    }

    public static int turnOnStatusFlag(int status, int flag) {
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void onCancellation() {
    }

    public abstract void onCancellationImpl();

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void onFailure(Throwable t) {
    }

    public abstract void onFailureImpl(Throwable t);

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void onNewResult(@Nullable T newResult, int status) {
    }

    public abstract void onNewResultImpl(@Nullable T newResult, int status);

    @Override // com.facebook.imagepipeline.producers.Consumer
    public synchronized void onProgressUpdate(float progress) {
    }

    public void onProgressUpdateImpl(float progress) {
    }

    public void onUnhandledException(Exception e2) {
    }
}
