package com.facebook.common.references;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RefCountCloseableReference<T> extends CloseableReference<T> {
    private RefCountCloseableReference(SharedReference<T> sharedReference, CloseableReference.LeakHandler leakHandler, @Nullable Throwable stacktrace) {
        super(sharedReference, leakHandler, stacktrace);
    }

    public RefCountCloseableReference(T t, ResourceReleaser<T> resourceReleaser, CloseableReference.LeakHandler leakHandler, @Nullable Throwable stacktrace) {
        super(t, resourceReleaser, leakHandler, stacktrace);
    }

    @Override // com.facebook.common.references.CloseableReference
    /* renamed from: clone */
    public CloseableReference<T> mo8clone() {
        Preconditions.checkState(isValid());
        return new RefCountCloseableReference(this.mSharedReference, this.mLeakHandler, this.mStacktrace);
    }
}
