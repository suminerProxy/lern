package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.concurrent.GuardedBy;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BitmapCounter {
    @GuardedBy("this")
    private int mCount;
    private final int mMaxCount;
    private final int mMaxSize;
    @GuardedBy("this")
    private long mSize;
    private final ResourceReleaser<Bitmap> mUnpooledBitmapsReleaser;

    /* renamed from: com.facebook.imagepipeline.memory.BitmapCounter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements ResourceReleaser<Bitmap> {
        public final /* synthetic */ BitmapCounter this$0;

        public AnonymousClass1(final BitmapCounter this$0) {
        }

        @Override // com.facebook.common.references.ResourceReleaser
        public /* bridge */ /* synthetic */ void release(Bitmap value) {
        }

        /* renamed from: release  reason: avoid collision after fix types in other method */
        public void release2(Bitmap value) {
        }
    }

    public BitmapCounter(int maxCount, int maxSize) {
    }

    public synchronized void decrease(Bitmap bitmap) {
    }

    public synchronized int getCount() {
    }

    public synchronized int getMaxCount() {
    }

    public synchronized int getMaxSize() {
    }

    public ResourceReleaser<Bitmap> getReleaser() {
    }

    public synchronized long getSize() {
    }

    public synchronized boolean increase(Bitmap bitmap) {
    }
}
