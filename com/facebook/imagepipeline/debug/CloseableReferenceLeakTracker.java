package com.facebook.imagepipeline.debug;

import com.facebook.common.references.SharedReference;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface CloseableReferenceLeakTracker {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Listener {
        void onCloseableReferenceLeak(SharedReference<Object> reference, @Nullable Throwable stacktrace);
    }

    boolean isSet();

    void setListener(@Nullable Listener listener);

    void trackCloseableReferenceLeak(SharedReference<Object> reference, @Nullable Throwable stacktrace);
}
