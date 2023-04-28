package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MapMaker {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public static final int UNSET_INT = -1;
    public int concurrencyLevel;
    public int initialCapacity;
    @MonotonicNonNullDecl
    public Equivalence<Object> keyEquivalence;
    @MonotonicNonNullDecl
    public MapMakerInternalMap.Strength keyStrength;
    public boolean useCustomMap;
    @MonotonicNonNullDecl
    public MapMakerInternalMap.Strength valueStrength;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Dummy {
        private static final /* synthetic */ Dummy[] $VALUES = null;
        public static final Dummy VALUE = null;

        private Dummy(String str, int i2) {
        }

        public static Dummy valueOf(String str) {
        }

        public static Dummy[] values() {
        }
    }

    @CanIgnoreReturnValue
    public MapMaker concurrencyLevel(int i2) {
    }

    public int getConcurrencyLevel() {
    }

    public int getInitialCapacity() {
    }

    public Equivalence<Object> getKeyEquivalence() {
    }

    public MapMakerInternalMap.Strength getKeyStrength() {
    }

    public MapMakerInternalMap.Strength getValueStrength() {
    }

    @CanIgnoreReturnValue
    public MapMaker initialCapacity(int i2) {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker keyEquivalence(Equivalence<Object> equivalence) {
    }

    public <K, V> ConcurrentMap<K, V> makeMap() {
    }

    public MapMaker setKeyStrength(MapMakerInternalMap.Strength strength) {
    }

    public MapMaker setValueStrength(MapMakerInternalMap.Strength strength) {
    }

    public String toString() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakKeys() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public MapMaker weakValues() {
    }
}
