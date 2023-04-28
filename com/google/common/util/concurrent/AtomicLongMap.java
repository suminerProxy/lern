package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AtomicLongMap<K> implements Serializable {
    @MonotonicNonNullDecl
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    /* renamed from: com.google.common.util.concurrent.AtomicLongMap$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Function<AtomicLong, Long> {
        public final /* synthetic */ AtomicLongMap this$0;

        public AnonymousClass1(AtomicLongMap atomicLongMap) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ Long apply(AtomicLong atomicLong) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public Long apply2(AtomicLong atomicLong) {
        }
    }

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
    }

    public static <K> AtomicLongMap<K> create() {
    }

    private Map<K, Long> createAsMap() {
    }

    @CanIgnoreReturnValue
    public long addAndGet(K k2, long j2) {
    }

    public Map<K, Long> asMap() {
    }

    public void clear() {
    }

    public boolean containsKey(Object obj) {
    }

    @CanIgnoreReturnValue
    public long decrementAndGet(K k2) {
    }

    public long get(K k2) {
    }

    @CanIgnoreReturnValue
    public long getAndAdd(K k2, long j2) {
    }

    @CanIgnoreReturnValue
    public long getAndDecrement(K k2) {
    }

    @CanIgnoreReturnValue
    public long getAndIncrement(K k2) {
    }

    @CanIgnoreReturnValue
    public long incrementAndGet(K k2) {
    }

    public boolean isEmpty() {
    }

    @CanIgnoreReturnValue
    public long put(K k2, long j2) {
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
    }

    public long putIfAbsent(K k2, long j2) {
    }

    @CanIgnoreReturnValue
    public long remove(K k2) {
    }

    public void removeAllZeros() {
    }

    @CanIgnoreReturnValue
    @Beta
    public boolean removeIfZero(K k2) {
    }

    public boolean replace(K k2, long j2, long j3) {
    }

    public int size() {
    }

    public long sum() {
    }

    public String toString() {
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
    }

    public boolean remove(K k2, long j2) {
    }
}
