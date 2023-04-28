package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final Comparator<? super T> comparator;

    /* renamed from: k  reason: collision with root package name */
    private final int f3365k;
    @NullableDecl
    private T threshold;

    private TopKSelector(Comparator<? super T> comparator, int i2) {
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i2) {
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i2) {
    }

    private int partition(int i2, int i3, int i4) {
    }

    private void swap(int i2, int i3) {
    }

    private void trim() {
    }

    public void offer(@NullableDecl T t) {
    }

    public void offerAll(Iterable<? extends T> iterable) {
    }

    public List<T> topK() {
    }

    public static <T> TopKSelector<T> greatest(int i2, Comparator<? super T> comparator) {
    }

    public static <T> TopKSelector<T> least(int i2, Comparator<? super T> comparator) {
    }

    public void offerAll(Iterator<? extends T> it) {
    }
}
