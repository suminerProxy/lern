package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ObjectArrays {
    private ObjectArrays() {
    }

    @CanIgnoreReturnValue
    public static Object checkElementNotNull(Object obj, int i2) {
    }

    @CanIgnoreReturnValue
    public static Object[] checkElementsNotNull(Object... objArr) {
    }

    @GwtIncompatible
    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
    }

    public static Object[] copyAsObjectArray(Object[] objArr, int i2, int i3) {
    }

    @CanIgnoreReturnValue
    private static Object[] fillArray(Iterable<?> iterable, Object[] objArr) {
    }

    @GwtIncompatible
    public static <T> T[] newArray(Class<T> cls, int i2) {
    }

    public static void swap(Object[] objArr, int i2, int i3) {
    }

    public static <T> T[] toArrayImpl(Collection<?> collection, T[] tArr) {
    }

    @CanIgnoreReturnValue
    public static Object[] checkElementsNotNull(Object[] objArr, int i2) {
    }

    public static <T> T[] newArray(T[] tArr, int i2) {
    }

    public static <T> T[] concat(@NullableDecl T t, T[] tArr) {
    }

    public static <T> T[] concat(T[] tArr, @NullableDecl T t) {
    }

    public static <T> T[] toArrayImpl(Object[] objArr, int i2, int i3, T[] tArr) {
    }

    public static Object[] toArrayImpl(Collection<?> collection) {
    }
}
