package com.tencent.liteav.videobase.utils;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.p;
import com.tencent.liteav.videobase.base.GLConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class OpenGlUtils {
    private static final String TAG = "OpenGlUtils";

    /* renamed from: com.tencent.liteav.videobase.utils.OpenGlUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11991a = null;
    }

    public static void attachTextureToFrameBuffer(int i2, int i3) {
    }

    public static void bindFramebuffer(int i2, int i3) {
    }

    public static void bindTexture(int i2, int i3) {
    }

    public static void checkGlError(String str) {
    }

    public static void convertYuvFormat(GLConstants.PixelFormatType pixelFormatType, Object obj, GLConstants.PixelFormatType pixelFormatType2, Object obj2, int i2, int i3) {
    }

    public static FloatBuffer createNormalCubeVerticesBuffer() {
    }

    public static int createTexture(int i2, int i3, int i4, int i5) {
    }

    public static FloatBuffer createTextureCoordsBuffer(Rotation rotation, boolean z, boolean z2) {
    }

    public static void deleteFrameBuffer(int i2) {
    }

    public static void deleteShaderId(int i2) {
    }

    public static void deleteTexture(int i2) {
    }

    public static void detachTextureFromFrameBuffer(int i2) {
    }

    private static float flip(float f2) {
    }

    public static int generateFrameBufferId() {
    }

    public static int generateTextureOES() {
    }

    public static Object getCurrentContext() {
    }

    public static void glViewport(int i2, int i3, int i4, int i5) {
    }

    public static void initTextureCoordsBuffer(float[] fArr, Rotation rotation, boolean z, boolean z2) {
    }

    public static int loadTexture(Bitmap bitmap, int i2, boolean z) {
    }

    public static void loadYuv420DataToTextures(ByteBuffer byteBuffer, int i2, int i3, int i4, int[] iArr) {
    }

    private static native boolean nativeConvertYuvFormatArrayToArray(int i2, byte[] bArr, int i3, byte[] bArr2, int i4, int i5);

    private static native boolean nativeConvertYuvFormatArrayToBuffer(int i2, byte[] bArr, int i3, ByteBuffer byteBuffer, int i4, int i5);

    private static native boolean nativeConvertYuvFormatBufferToArray(int i2, ByteBuffer byteBuffer, int i3, byte[] bArr, int i4, int i5);

    private static native boolean nativeConvertYuvFormatBufferToBuffer(int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, int i5);

    public static native void nativeCopyDataFromByteArrayToByteBuffer(byte[] bArr, ByteBuffer byteBuffer, int i2);

    public static native void nativeCopyDataFromByteBufferToByteArray(ByteBuffer byteBuffer, byte[] bArr, int i2);

    public static native void nativeCopyDataFromByteBufferToByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i2);

    private static native void nativeLoadYuv420ByteArrayToTextures(byte[] bArr, int i2, int i3, int i4, int[] iArr);

    private static native void nativeLoadYuv420ByteBufferToTextures(ByteBuffer byteBuffer, int i2, int i3, int i4, int[] iArr);

    public static void readPixels(int i2, int i3, int i4, int i5, Object obj) {
    }

    public static Point reverseMappingPoint(GLConstants.GLScaleType gLScaleType, Rotation rotation, Point point, p pVar, p pVar2) {
    }

    public static int loadTexture(int i2, Buffer buffer, int i3, int i4, int i5) {
    }
}
