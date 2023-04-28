package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Enums {
    @GwtIncompatible
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> enumConstantCache = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Class<T> enumClass;

        public StringConverter(Class<T> cls) {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doBackward(Object obj) {
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ Object doForward(String str) {
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public String doBackward(T t) {
        }

        /* renamed from: doForward  reason: avoid collision after fix types in other method */
        public T doForward2(String str) {
        }
    }

    private Enums() {
    }

    @GwtIncompatible
    public static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> getEnumConstants(Class<T> cls) {
    }

    @GwtIncompatible
    public static Field getField(Enum<?> r1) {
    }

    public static <T extends Enum<T>> Optional<T> getIfPresent(Class<T> cls, String str) {
    }

    @GwtIncompatible
    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> populateCache(Class<T> cls) {
    }

    public static <T extends Enum<T>> Converter<String, T> stringConverter(Class<T> cls) {
    }
}
