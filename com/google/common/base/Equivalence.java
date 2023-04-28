package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Equivalence<T> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Equals extends Equivalence<Object> implements Serializable {
        public static final Equals INSTANCE = null;
        private static final long serialVersionUID = 1;

        private Object readResolve() {
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        @NullableDecl
        private final T target;

        public EquivalentToPredicate(Equivalence<T> equivalence, @NullableDecl T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Identity extends Equivalence<Object> implements Serializable {
        public static final Identity INSTANCE = null;
        private static final long serialVersionUID = 1;

        private Object readResolve() {
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        @NullableDecl
        private final T reference;

        public /* synthetic */ Wrapper(Equivalence equivalence, Object obj, AnonymousClass1 anonymousClass1) {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        @NullableDecl
        public T get() {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t) {
        }
    }

    public static Equivalence<Object> equals() {
    }

    public static Equivalence<Object> identity() {
    }

    @ForOverride
    public abstract boolean doEquivalent(T t, T t2);

    @ForOverride
    public abstract int doHash(T t);

    public final boolean equivalent(@NullableDecl T t, @NullableDecl T t2) {
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t) {
    }

    public final int hash(@NullableDecl T t) {
    }

    public final <F> Equivalence<F> onResultOf(Function<F, ? extends T> function) {
    }

    @GwtCompatible(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s) {
    }
}
