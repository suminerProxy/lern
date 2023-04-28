package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Sets;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Set;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DummyTrackingInUseBitmapPool implements BitmapPool {
    private final Set<Bitmap> mInUseValues = Sets.newIdentityHashSet();

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(MemoryTrimType trimType) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.common.memory.Pool
    public Bitmap get(int size) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(size / 2.0d), Bitmap.Config.RGB_565);
        this.mInUseValues.add(createBitmap);
        return createBitmap;
    }

    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    public void release(Bitmap value) {
        Preconditions.checkNotNull(value);
        this.mInUseValues.remove(value);
        value.recycle();
    }
}
