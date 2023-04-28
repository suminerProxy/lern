package com.facebook.imagepipeline.memory;

import com.facebook.common.references.OOMSoftReference;
import com.facebook.infer.annotation.Nullsafe;
import java.util.LinkedList;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class OOMSoftReferenceBucket<V> extends Bucket<V> {
    private LinkedList<OOMSoftReference<V>> mSpareReferences;

    public OOMSoftReferenceBucket(int itemSize, int maxLength, int inUseLength) {
    }

    @Override // com.facebook.imagepipeline.memory.Bucket
    public void addToFreeList(V value) {
    }

    @Override // com.facebook.imagepipeline.memory.Bucket
    @Nullable
    public V pop() {
    }
}
