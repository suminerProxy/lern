package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.Immutable;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Immutable
@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ElementOrder<T> {
    @NullableDecl
    private final Comparator<T> comparator;
    private final Type type;

    /* renamed from: com.google.common.graph.ElementOrder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type INSERTION = null;
        public static final Type SORTED = null;
        public static final Type UNORDERED = null;

        private Type(String str, int i2) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    private ElementOrder(Type type, @NullableDecl Comparator<T> comparator) {
    }

    public static <S> ElementOrder<S> insertion() {
    }

    public static <S extends Comparable<? super S>> ElementOrder<S> natural() {
    }

    public static <S> ElementOrder<S> sorted(Comparator<S> comparator) {
    }

    public static <S> ElementOrder<S> unordered() {
    }

    public <T1 extends T> ElementOrder<T1> cast() {
    }

    public Comparator<T> comparator() {
    }

    public <K extends T, V> Map<K, V> createMap(int i2) {
    }

    public boolean equals(@NullableDecl Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public Type type() {
    }
}
