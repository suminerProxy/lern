package com.facebook.imagepipeline.animated.factory;

import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.infer.annotation.Nullsafe;
import java.nio.ByteBuffer;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface AnimatedImageDecoder {
    AnimatedImage decodeFromByteBuffer(ByteBuffer byteBuffer, ImageDecodeOptions options);

    AnimatedImage decodeFromNativeMemory(long nativePtr, int sizeInBytes, ImageDecodeOptions options);
}
