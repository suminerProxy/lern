package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class ComputableLiveData<T> {
    public final AtomicBoolean mComputing;
    public final Executor mExecutor;
    public final AtomicBoolean mInvalid;
    @VisibleForTesting
    public final Runnable mInvalidationRunnable;
    public final LiveData<T> mLiveData;
    @VisibleForTesting
    public final Runnable mRefreshRunnable;

    /* renamed from: androidx.lifecycle.ComputableLiveData$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends LiveData<T> {
        public final /* synthetic */ ComputableLiveData this$0;

        public AnonymousClass1(ComputableLiveData computableLiveData) {
        }

        @Override // androidx.lifecycle.LiveData
        public void onActive() {
        }
    }

    /* renamed from: androidx.lifecycle.ComputableLiveData$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ComputableLiveData this$0;

        public AnonymousClass2(ComputableLiveData computableLiveData) {
        }

        @Override // java.lang.Runnable
        @WorkerThread
        public void run() {
        }
    }

    /* renamed from: androidx.lifecycle.ComputableLiveData$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ ComputableLiveData this$0;

        public AnonymousClass3(ComputableLiveData computableLiveData) {
        }

        @Override // java.lang.Runnable
        @MainThread
        public void run() {
        }
    }

    public ComputableLiveData() {
    }

    @WorkerThread
    public abstract T compute();

    @NonNull
    public LiveData<T> getLiveData() {
    }

    public void invalidate() {
    }

    public ComputableLiveData(@NonNull Executor executor) {
    }
}
