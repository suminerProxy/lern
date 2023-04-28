package com.jakewharton.rxbinding2.internal;

import androidx.annotation.RestrictTo;
import i.a.x0.r;
import java.util.concurrent.Callable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Functions {
    private static final Always ALWAYS_TRUE = null;
    public static final Callable<Boolean> CALLABLE_ALWAYS_TRUE = null;
    public static final r<Object> PREDICATE_ALWAYS_TRUE = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Always implements Callable<Boolean>, r<Object> {
        private final Boolean value;

        public Always(Boolean bool) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Boolean call() throws Exception {
        }

        @Override // i.a.x0.r
        public boolean test(Object obj) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
        }
    }

    private Functions() {
    }
}
