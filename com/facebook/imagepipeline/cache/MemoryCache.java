package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.HasDebugData;
import com.facebook.common.internal.Predicate;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface MemoryCache<K, V> extends MemoryTrimmable, HasDebugData {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface CacheTrimStrategy {
        double getTrimRatio(MemoryTrimType trimType);
    }

    @Nullable
    CloseableReference<V> cache(K key, CloseableReference<V> value);

    boolean contains(Predicate<K> predicate);

    boolean contains(K key);

    @Nullable
    CloseableReference<V> get(K key);

    int getCount();

    int getSizeInBytes();

    @Nullable
    V inspect(K key);

    void probe(K key);

    int removeAll(Predicate<K> predicate);
}
