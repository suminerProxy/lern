package com.facebook.imagepipeline.bitmaps;

import android.os.Build;
import com.facebook.imagepipeline.core.CloseableReferenceFactory;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PlatformBitmapFactoryProvider {
    public static PlatformBitmapFactory buildPlatformBitmapFactory(PoolFactory poolFactory, PlatformDecoder platformDecoder, CloseableReferenceFactory closeableReferenceFactory) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return new ArtBitmapFactory(poolFactory.getBitmapPool(), closeableReferenceFactory);
        }
        if (i2 >= 11) {
            return new HoneycombBitmapFactory(new EmptyJpegGenerator(poolFactory.getPooledByteBufferFactory()), platformDecoder, closeableReferenceFactory);
        }
        return new GingerbreadBitmapFactory();
    }
}
