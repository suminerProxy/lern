package com.facebook.imagepipeline.platform;

import android.os.Build;
import androidx.core.util.Pools;
import com.facebook.imagepipeline.core.NativeCodeSetup;
import com.facebook.imagepipeline.memory.FlexByteArrayPool;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.infer.annotation.Nullsafe;
import java.lang.reflect.InvocationTargetException;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PlatformDecoderFactory {
    public static PlatformDecoder buildPlatformDecoder(PoolFactory poolFactory, boolean gingerbreadDecoderEnabled) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            int flexByteArrayPoolMaxNumThreads = poolFactory.getFlexByteArrayPoolMaxNumThreads();
            return new OreoDecoder(poolFactory.getBitmapPool(), flexByteArrayPoolMaxNumThreads, new Pools.SynchronizedPool(flexByteArrayPoolMaxNumThreads));
        } else if (i2 < 21 && NativeCodeSetup.getUseNativeCode()) {
            try {
                return (!gingerbreadDecoderEnabled || i2 >= 19) ? (PlatformDecoder) Class.forName("com.facebook.imagepipeline.platform.KitKatPurgeableDecoder").getConstructor(FlexByteArrayPool.class).newInstance(poolFactory.getFlexByteArrayPool()) : (PlatformDecoder) Class.forName("com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e6);
            }
        } else {
            int flexByteArrayPoolMaxNumThreads2 = poolFactory.getFlexByteArrayPoolMaxNumThreads();
            return new ArtDecoder(poolFactory.getBitmapPool(), flexByteArrayPoolMaxNumThreads2, new Pools.SynchronizedPool(flexByteArrayPoolMaxNumThreads2));
        }
    }
}
