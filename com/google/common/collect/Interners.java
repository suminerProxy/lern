package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.MapMaker;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Interners {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class InternerBuilder {
        private final MapMaker mapMaker;
        private boolean strong;

        public /* synthetic */ InternerBuilder(AnonymousClass1 anonymousClass1) {
        }

        public <E> Interner<E> build() {
        }

        public InternerBuilder concurrencyLevel(int i2) {
        }

        public InternerBuilder strong() {
        }

        @GwtIncompatible("java.lang.ref.WeakReference")
        public InternerBuilder weak() {
        }

        private InternerBuilder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class InternerFunction<E> implements Function<E, E> {
        private final Interner<E> interner;

        public InternerFunction(Interner<E> interner) {
        }

        @Override // com.google.common.base.Function
        public E apply(E e2) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InternerImpl<E> implements Interner<E> {
        @VisibleForTesting
        public final MapMakerInternalMap<E, MapMaker.Dummy, ?, ?> map;

        public /* synthetic */ InternerImpl(MapMaker mapMaker, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.collect.Interner
        public E intern(E e2) {
        }

        private InternerImpl(MapMaker mapMaker) {
        }
    }

    private Interners() {
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
    }

    public static InternerBuilder newBuilder() {
    }

    public static <E> Interner<E> newStrongInterner() {
    }

    @GwtIncompatible("java.lang.ref.WeakReference")
    public static <E> Interner<E> newWeakInterner() {
    }
}
