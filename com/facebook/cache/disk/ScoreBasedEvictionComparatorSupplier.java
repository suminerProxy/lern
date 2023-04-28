package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ScoreBasedEvictionComparatorSupplier implements EntryEvictionComparatorSupplier {
    private final float mAgeWeight;
    private final float mSizeWeight;

    /* renamed from: com.facebook.cache.disk.ScoreBasedEvictionComparatorSupplier$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements EntryEvictionComparator {
        public long now;
        public final /* synthetic */ ScoreBasedEvictionComparatorSupplier this$0;

        public AnonymousClass1(final ScoreBasedEvictionComparatorSupplier this$0) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(DiskStorage.Entry lhs, DiskStorage.Entry rhs) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(DiskStorage.Entry lhs, DiskStorage.Entry rhs) {
        }
    }

    public ScoreBasedEvictionComparatorSupplier(float ageWeight, float sizeWeight) {
    }

    @VisibleForTesting
    public float calculateScore(DiskStorage.Entry entry, long now) {
    }

    @Override // com.facebook.cache.disk.EntryEvictionComparatorSupplier
    public EntryEvictionComparator get() {
    }
}
