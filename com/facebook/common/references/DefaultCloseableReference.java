package com.facebook.common.references;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultCloseableReference<T> extends CloseableReference<T> {
    private static final String TAG = "DefaultCloseableReference";

    private DefaultCloseableReference(SharedReference<T> sharedReference, CloseableReference.LeakHandler leakHandler, @Nullable Throwable stacktrace) {
        super(sharedReference, leakHandler, stacktrace);
    }

    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.mIsClosed) {
                    return;
                }
                T t = this.mSharedReference.get();
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(System.identityHashCode(this));
                objArr[1] = Integer.valueOf(System.identityHashCode(this.mSharedReference));
                objArr[2] = t == null ? null : t.getClass().getName();
                FLog.w(TAG, "Finalized without closing: %x %x (type = %s)", objArr);
                this.mLeakHandler.reportLeak(this.mSharedReference, this.mStacktrace);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public DefaultCloseableReference(T t, ResourceReleaser<T> resourceReleaser, CloseableReference.LeakHandler leakHandler, @Nullable Throwable stacktrace) {
        super(t, resourceReleaser, leakHandler, stacktrace);
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: clone */
    public CloseableReference<T> mo8clone() {
        Preconditions.checkState(isValid());
        return new DefaultCloseableReference(this.mSharedReference, this.mLeakHandler, this.mStacktrace != null ? new Throwable(this.mStacktrace) : null);
    }
}
