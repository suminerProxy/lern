package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(serializable = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.base.Optional$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements Iterable<T> {
        public final /* synthetic */ Iterable val$optionals;

        /* renamed from: com.google.common.base.Optional$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C00621 extends AbstractIterator<T> {
            private final Iterator<? extends Optional<? extends T>> iterator;
            public final /* synthetic */ AnonymousClass1 this$0;

            public C00621(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.google.common.base.AbstractIterator
            public T computeNext() {
            }
        }

        public AnonymousClass1(Iterable iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
        }
    }

    public static <T> Optional<T> absent() {
    }

    public static <T> Optional<T> fromNullable(@NullableDecl T t) {
    }

    public static <T> Optional<T> of(T t) {
    }

    @Beta
    public static <T> Iterable<T> presentInstances(Iterable<? extends Optional<? extends T>> iterable) {
    }

    public abstract Set<T> asSet();

    public abstract boolean equals(@NullableDecl Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    @Beta
    public abstract T or(Supplier<? extends T> supplier);

    public abstract T or(T t);

    @NullableDecl
    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(Function<? super T, V> function);
}
