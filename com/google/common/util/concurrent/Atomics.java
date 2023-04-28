package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Atomics {
    private Atomics() {
    }

    public static <V> AtomicReference<V> newReference() {
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(int i2) {
    }

    public static <V> AtomicReference<V> newReference(@NullableDecl V v) {
    }

    public static <E> AtomicReferenceArray<E> newReferenceArray(E[] eArr) {
    }
}
