package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;
    @LazyInit
    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    /* renamed from: com.google.common.base.Converter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Iterable<B> {
        public final /* synthetic */ Converter this$0;
        public final /* synthetic */ Iterable val$fromIterable;

        /* renamed from: com.google.common.base.Converter$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00611 implements Iterator<B> {
            private final Iterator<? extends A> fromIterator;
            public final /* synthetic */ AnonymousClass1 this$1;

            public C00611(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
            }

            @Override // java.util.Iterator
            public B next() {
            }

            @Override // java.util.Iterator
            public void remove() {
            }
        }

        public AnonymousClass1(Converter converter, Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<B> iterator() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Converter<A, B> first;
        public final Converter<B, C> second;

        public ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
        }

        @Override // com.google.common.base.Converter
        @NullableDecl
        public A correctedDoBackward(@NullableDecl C c) {
        }

        @Override // com.google.common.base.Converter
        @NullableDecl
        public C correctedDoForward(@NullableDecl A a2) {
        }

        @Override // com.google.common.base.Converter
        public A doBackward(C c) {
        }

        @Override // com.google.common.base.Converter
        public C doForward(A a2) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super B, ? extends A> backwardFunction;
        private final Function<? super A, ? extends B> forwardFunction;

        public /* synthetic */ FunctionBasedConverter(Function function, Function function2, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b) {
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a2) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        private FunctionBasedConverter(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        public static final IdentityConverter INSTANCE = null;
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
        }

        @Override // com.google.common.base.Converter
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
        }

        @Override // com.google.common.base.Converter
        public T doBackward(T t) {
        }

        @Override // com.google.common.base.Converter
        public T doForward(T t) {
        }

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ Converter reverse() {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Converter<A, B> original;

        public ReverseConverter(Converter<A, B> converter) {
        }

        @Override // com.google.common.base.Converter
        @NullableDecl
        public B correctedDoBackward(@NullableDecl A a2) {
        }

        @Override // com.google.common.base.Converter
        @NullableDecl
        public A correctedDoForward(@NullableDecl B b) {
        }

        @Override // com.google.common.base.Converter
        public B doBackward(A a2) {
        }

        @Override // com.google.common.base.Converter
        public A doForward(B b) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
        }

        public String toString() {
        }
    }

    public Converter() {
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
    }

    public static <T> Converter<T, T> identity() {
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
    }

    @Override // com.google.common.base.Function
    @CanIgnoreReturnValue
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a2) {
    }

    @CanIgnoreReturnValue
    @NullableDecl
    public final B convert(@NullableDecl A a2) {
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(Iterable<? extends A> iterable) {
    }

    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b) {
    }

    @NullableDecl
    public B correctedDoForward(@NullableDecl A a2) {
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
    }

    @ForOverride
    public abstract A doBackward(B b);

    @ForOverride
    public abstract B doForward(A a2);

    @Override // com.google.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
    }

    @CanIgnoreReturnValue
    public Converter<B, A> reverse() {
    }

    public Converter(boolean z) {
    }
}
