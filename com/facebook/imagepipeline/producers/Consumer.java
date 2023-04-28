package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Consumer<T> {
    public static final int DO_NOT_CACHE_ENCODED = 2;
    public static final int IS_LAST = 1;
    public static final int IS_PARTIAL_RESULT = 8;
    public static final int IS_PLACEHOLDER = 4;
    public static final int IS_RESIZING_DONE = 16;
    public static final int NO_FLAGS = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Status {
    }

    void onCancellation();

    void onFailure(Throwable t);

    void onNewResult(@Nullable T newResult, int status);

    void onProgressUpdate(float progress);
}
