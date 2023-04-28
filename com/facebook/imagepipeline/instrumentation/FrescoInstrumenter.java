package com.facebook.imagepipeline.instrumentation;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.PropagatesNullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class FrescoInstrumenter {
    @Nullable
    private static volatile Instrumenter sInstance;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Instrumenter {
        @Nullable
        Runnable decorateRunnable(Runnable runnable, String tag);

        boolean isTracing();

        void markFailure(Object token, Throwable th);

        @Nullable
        Object onBeforeSubmitWork(String tag);

        @Nullable
        Object onBeginWork(Object token, @Nullable String tag);

        @Nullable
        void onEndWork(Object token);
    }

    @Nullable
    public static Runnable decorateRunnable(@Nullable @PropagatesNullable Runnable runnable, @Nullable String tag) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || runnable == null) {
            return runnable;
        }
        if (tag == null) {
            tag = "";
        }
        return instrumenter.decorateRunnable(runnable, tag);
    }

    public static boolean isTracing() {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null) {
            return false;
        }
        return instrumenter.isTracing();
    }

    public static void markFailure(@Nullable Object token, Throwable th) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || token == null) {
            return;
        }
        instrumenter.markFailure(token, th);
    }

    @Nullable
    public static Object onBeforeSubmitWork(@Nullable String tag) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || tag == null) {
            return null;
        }
        return instrumenter.onBeforeSubmitWork(tag);
    }

    @Nullable
    public static Object onBeginWork(@Nullable Object token, @Nullable String tag) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || token == null) {
            return null;
        }
        return instrumenter.onBeginWork(token, tag);
    }

    public static void onEndWork(@Nullable Object token) {
        Instrumenter instrumenter = sInstance;
        if (instrumenter == null || token == null) {
            return;
        }
        instrumenter.onEndWork(token);
    }

    public static void provide(@Nullable Instrumenter instrumenter) {
        sInstance = instrumenter;
    }
}
