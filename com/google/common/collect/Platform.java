package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;
import java.util.Set;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Platform {
    private Platform() {
    }

    public static <T> T[] copy(Object[] objArr, int i2, int i3, T[] tArr) {
    }

    public static <T> T[] newArray(T[] tArr, int i2) {
    }

    public static <K, V> Map<K, V> newHashMapWithExpectedSize(int i2) {
    }

    public static <E> Set<E> newHashSetWithExpectedSize(int i2) {
    }

    public static <K, V> Map<K, V> newLinkedHashMapWithExpectedSize(int i2) {
    }

    public static <E> Set<E> newLinkedHashSetWithExpectedSize(int i2) {
    }

    public static <E> Set<E> preservesInsertionOrderOnAddsSet() {
    }

    public static <K, V> Map<K, V> preservesInsertionOrderOnPutsMap() {
    }

    public static int reduceExponentIfGwt(int i2) {
    }

    public static int reduceIterationsIfGwt(int i2) {
    }

    public static MapMaker tryWeakKeys(MapMaker mapMaker) {
    }
}
