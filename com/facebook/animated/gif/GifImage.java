package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.AnimatedImageFrame;
import com.facebook.imagepipeline.animated.factory.AnimatedImageDecoder;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.infer.annotation.Nullsafe;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@DoNotStrip
@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GifImage implements AnimatedImage, AnimatedImageDecoder {
    private static final int LOOP_COUNT_FOREVER = 0;
    private static final int LOOP_COUNT_MISSING = -1;
    private static volatile boolean sInitialized;
    @Nullable
    private Bitmap.Config mDecodeBitmapConfig;
    @DoNotStrip
    private long mNativeContext;

    @DoNotStrip
    public GifImage() {
    }

    public static GifImage createFromByteArray(byte[] source) {
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer) {
    }

    public static GifImage createFromFileDescriptor(int fileDescriptor, ImageDecodeOptions options) {
    }

    public static GifImage createFromNativeMemory(long nativePtr, int sizeInBytes, ImageDecodeOptions options) {
    }

    private static synchronized void ensure() {
    }

    private static AnimatedDrawableFrameInfo.DisposalMethod fromGifDisposalMethod(int disposalMode) {
    }

    @DoNotStrip
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer buffer, int maxDimension, boolean forceStatic);

    @DoNotStrip
    private static native GifImage nativeCreateFromFileDescriptor(int fileDescriptor, int maxDimension, boolean forceStatic);

    @DoNotStrip
    private static native GifImage nativeCreateFromNativeMemory(long nativePtr, int sizeInBytes, int maxDimension, boolean forceStatic);

    @DoNotStrip
    private native void nativeDispose();

    @DoNotStrip
    private native void nativeFinalize();

    @DoNotStrip
    private native int nativeGetDuration();

    @DoNotStrip
    private native GifFrame nativeGetFrame(int frameNumber);

    @DoNotStrip
    private native int nativeGetFrameCount();

    @DoNotStrip
    private native int[] nativeGetFrameDurations();

    @DoNotStrip
    private native int nativeGetHeight();

    @DoNotStrip
    private native int nativeGetLoopCount();

    @DoNotStrip
    private native int nativeGetSizeInBytes();

    @DoNotStrip
    private native int nativeGetWidth();

    @DoNotStrip
    private native boolean nativeIsAnimated();

    @Override // com.facebook.imagepipeline.animated.factory.AnimatedImageDecoder
    public AnimatedImage decodeFromByteBuffer(ByteBuffer byteBuffer, ImageDecodeOptions options) {
    }

    @Override // com.facebook.imagepipeline.animated.factory.AnimatedImageDecoder
    public AnimatedImage decodeFromNativeMemory(long nativePtr, int sizeInBytes, ImageDecodeOptions options) {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public void dispose() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public boolean doesRenderSupportScaling() {
    }

    public void finalize() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    @Nullable
    public Bitmap.Config getAnimatedBitmapConfig() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public int getDuration() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public /* bridge */ /* synthetic */ AnimatedImageFrame getFrame(int frameNumber) {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public int getFrameCount() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public int[] getFrameDurations() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public AnimatedDrawableFrameInfo getFrameInfo(int frameNumber) {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public int getHeight() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public int getLoopCount() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public int getSizeInBytes() {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public int getWidth() {
    }

    public boolean isAnimated() {
    }

    public static GifImage createFromByteBuffer(ByteBuffer byteBuffer, ImageDecodeOptions options) {
    }

    @Override // com.facebook.imagepipeline.animated.base.AnimatedImage
    public GifFrame getFrame(int frameNumber) {
    }

    @DoNotStrip
    public GifImage(long nativeContext) {
    }
}
