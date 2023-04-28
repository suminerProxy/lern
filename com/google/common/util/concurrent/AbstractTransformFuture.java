package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.util.concurrent.FluentFuture;
import com.google.errorprone.annotations.ForOverride;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {
    @NullableDecl
    public F function;
    @NullableDecl
    public ListenableFuture<? extends I> inputFuture;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        public AsyncTransformFuture(ListenableFuture<? extends I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction) {
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public /* bridge */ /* synthetic */ Object doTransform(Object obj, @NullableDecl Object obj2) throws Exception {
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public /* bridge */ /* synthetic */ void setResult(Object obj) {
        }

        public ListenableFuture<? extends O> doTransform(AsyncFunction<? super I, ? extends O> asyncFunction, @NullableDecl I i2) throws Exception {
        }

        public void setResult(ListenableFuture<? extends O> listenableFuture) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        public TransformFuture(ListenableFuture<? extends I> listenableFuture, Function<? super I, ? extends O> function) {
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        @NullableDecl
        public /* bridge */ /* synthetic */ Object doTransform(Object obj, @NullableDecl Object obj2) throws Exception {
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        public void setResult(@NullableDecl O o2) {
        }

        @NullableDecl
        public O doTransform(Function<? super I, ? extends O> function, @NullableDecl I i2) {
        }
    }

    public AbstractTransformFuture(ListenableFuture<? extends I> listenableFuture, F f2) {
    }

    public static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
    }

    @NullableDecl
    @ForOverride
    public abstract T doTransform(F f2, @NullableDecl I i2) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    @ForOverride
    public abstract void setResult(@NullableDecl T t);

    public static <I, O> ListenableFuture<O> create(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
    }
}
