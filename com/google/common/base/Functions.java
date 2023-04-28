package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Functions {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        private static final long serialVersionUID = 0;
        @NullableDecl
        private final E value;

        public ConstantFunction(@NullableDecl E e2) {
        }

        @Override // com.google.common.base.Function
        public E apply(@NullableDecl Object obj) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        @NullableDecl
        public final V defaultValue;
        public final Map<K, ? extends V> map;

        public ForMapWithDefault(Map<K, ? extends V> map, @NullableDecl V v) {
        }

        @Override // com.google.common.base.Function
        public V apply(@NullableDecl K k2) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f  reason: collision with root package name */
        private final Function<A, ? extends B> f3357f;

        /* renamed from: g  reason: collision with root package name */
        private final Function<B, C> f3358g;

        public FunctionComposition(Function<B, C> function, Function<A, ? extends B> function2) {
        }

        @Override // com.google.common.base.Function
        public C apply(@NullableDecl A a2) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public final Map<K, V> map;

        public FunctionForMapNoDefault(Map<K, V> map) {
        }

        @Override // com.google.common.base.Function
        public V apply(@NullableDecl K k2) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class IdentityFunction implements Function<Object, Object> {
        private static final /* synthetic */ IdentityFunction[] $VALUES = null;
        public static final IdentityFunction INSTANCE = null;

        private IdentityFunction(String str, int i2) {
        }

        public static IdentityFunction valueOf(String str) {
        }

        public static IdentityFunction[] values() {
        }

        @Override // com.google.common.base.Function
        @NullableDecl
        public Object apply(@NullableDecl Object obj) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        private final Predicate<T> predicate;

        public /* synthetic */ PredicateFunction(Predicate predicate, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Boolean apply(@NullableDecl Object obj) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private PredicateFunction(Predicate<T> predicate) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public Boolean apply(@NullableDecl T t) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SupplierFunction<T> implements Function<Object, T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<T> supplier;

        public /* synthetic */ SupplierFunction(Supplier supplier, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Function
        public T apply(@NullableDecl Object obj) {
        }

        @Override // com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private SupplierFunction(Supplier<T> supplier) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ToStringFunction implements Function<Object, String> {
        private static final /* synthetic */ ToStringFunction[] $VALUES = null;
        public static final ToStringFunction INSTANCE = null;

        private ToStringFunction(String str, int i2) {
        }

        public static ToStringFunction valueOf(String str) {
        }

        public static ToStringFunction[] values() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ String apply(Object obj) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        @Override // com.google.common.base.Function
        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public String apply2(Object obj) {
        }
    }

    private Functions() {
    }

    public static <A, B, C> Function<A, C> compose(Function<B, C> function, Function<A, ? extends B> function2) {
    }

    public static <E> Function<Object, E> constant(@NullableDecl E e2) {
    }

    public static <K, V> Function<K, V> forMap(Map<K, V> map) {
    }

    public static <T> Function<T, Boolean> forPredicate(Predicate<T> predicate) {
    }

    public static <T> Function<Object, T> forSupplier(Supplier<T> supplier) {
    }

    public static <E> Function<E, E> identity() {
    }

    public static Function<Object, String> toStringFunction() {
    }

    public static <K, V> Function<K, V> forMap(Map<K, ? extends V> map, @NullableDecl V v) {
    }
}
