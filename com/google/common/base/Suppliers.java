package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Suppliers {

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> delegate;
        public final long durationNanos;
        public volatile transient long expirationNanos;
        @NullableDecl
        public volatile transient T value;

        public ExpiringMemoizingSupplier(Supplier<T> supplier, long j2, TimeUnit timeUnit) {
        }

        @Override // com.google.common.base.Supplier
        public T get() {
        }

        public String toString() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> delegate;
        public volatile transient boolean initialized;
        @NullableDecl
        public transient T value;

        public MemoizingSupplier(Supplier<T> supplier) {
        }

        @Override // com.google.common.base.Supplier
        public T get() {
        }

        public String toString() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
        public volatile Supplier<T> delegate;
        public volatile boolean initialized;
        @NullableDecl
        public T value;

        public NonSerializableMemoizingSupplier(Supplier<T> supplier) {
        }

        @Override // com.google.common.base.Supplier
        public T get() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Function<? super F, T> function;
        public final Supplier<F> supplier;

        public SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.base.Supplier
        public T get() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SupplierFunctionImpl implements SupplierFunction<Object> {
        private static final /* synthetic */ SupplierFunctionImpl[] $VALUES = null;
        public static final SupplierFunctionImpl INSTANCE = null;

        private SupplierFunctionImpl(String str, int i2) {
        }

        public static SupplierFunctionImpl valueOf(String str) {
        }

        public static SupplierFunctionImpl[] values() {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
        }

        @Override // java.lang.Enum
        public String toString() {
        }

        public Object apply(Supplier<Object> supplier) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        @NullableDecl
        public final T instance;

        public SupplierOfInstance(@NullableDecl T t) {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        @Override // com.google.common.base.Supplier
        public T get() {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> delegate;

        public ThreadSafeSupplier(Supplier<T> supplier) {
        }

        @Override // com.google.common.base.Supplier
        public T get() {
        }

        public String toString() {
        }
    }

    private Suppliers() {
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j2, TimeUnit timeUnit) {
    }

    public static <T> Supplier<T> ofInstance(@NullableDecl T t) {
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
    }

    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
    }
}
