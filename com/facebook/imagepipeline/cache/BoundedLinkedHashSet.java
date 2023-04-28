package com.facebook.imagepipeline.cache;

import com.facebook.infer.annotation.Nullsafe;
import java.util.LinkedHashSet;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BoundedLinkedHashSet<E> {
    private LinkedHashSet<E> mLinkedHashSet;
    private int mMaxSize;

    public BoundedLinkedHashSet(final int maxSize) {
        this.mLinkedHashSet = new LinkedHashSet<>(maxSize);
        this.mMaxSize = maxSize;
    }

    public synchronized boolean add(E key) {
        if (this.mLinkedHashSet.size() == this.mMaxSize) {
            LinkedHashSet<E> linkedHashSet = this.mLinkedHashSet;
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        this.mLinkedHashSet.remove(key);
        return this.mLinkedHashSet.add(key);
    }

    public synchronized boolean contains(E o2) {
        return this.mLinkedHashSet.contains(o2);
    }
}
