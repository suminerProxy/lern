package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.Rotation;
import java.nio.ByteBuffer;
import java.util.Collection;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PixelFrame extends k {
    public ByteBuffer mBuffer;
    public byte[] mData;
    public Object mGLContext;
    public int mHeight;
    private boolean mIsMirrorHorizontal;
    private boolean mIsMirrorVertical;
    private float[] mMatrix;
    public GLConstants.PixelBufferType mPixelBufferType;
    public GLConstants.PixelFormatType mPixelFormatType;
    private Rotation mRotation;
    public int mTextureId;
    private long mTimestamp;
    public int mWidth;

    public PixelFrame() {
    }

    @CalledByNative
    private int getPixelBufferTypeValue() {
    }

    @CalledByNative
    private int getPixelFormatTypeValue() {
    }

    public static void releasePixelFrames(Collection<PixelFrame> collection) {
    }

    @CalledByNative
    public void copy(PixelFrame pixelFrame) {
    }

    @CalledByNative
    public ByteBuffer getBuffer() {
    }

    @CalledByNative
    public byte[] getData() {
    }

    public Object getGLContext() {
    }

    @CalledByNative
    public int getHeight() {
    }

    public float[] getMatrix() {
    }

    public GLConstants.PixelBufferType getPixelBufferType() {
    }

    public GLConstants.PixelFormatType getPixelFormatType() {
    }

    public Rotation getRotation() {
    }

    public int getTextureId() {
    }

    @CalledByNative
    public long getTimestamp() {
    }

    @CalledByNative
    public int getWidth() {
    }

    public boolean hasTransformParams() {
    }

    public boolean isFrameDataValid() {
    }

    public boolean isMirrorHorizontal() {
    }

    public boolean isMirrorVertical() {
    }

    public void postRotate(Rotation rotation) {
    }

    public void setBuffer(ByteBuffer byteBuffer) {
    }

    public void setData(byte[] bArr) {
    }

    public void setGLContext(Object obj) {
    }

    public void setHeight(int i2) {
    }

    public void setMatrix(float[] fArr) {
    }

    public void setMirrorHorizontal(boolean z) {
    }

    public void setMirrorVertical(boolean z) {
    }

    public void setPixelBufferType(GLConstants.PixelBufferType pixelBufferType) {
    }

    public void setPixelFormatType(GLConstants.PixelFormatType pixelFormatType) {
    }

    public void setRotation(Rotation rotation) {
    }

    public void setTextureId(int i2) {
    }

    public void setTimestamp(long j2) {
    }

    public void setWidth(int i2) {
    }

    public void swapWidthHeight() {
    }

    public PixelFrame(PixelFrame pixelFrame) {
    }

    @CalledByNative
    public PixelFrame(int i2, int i3, int i4, int i5) {
    }

    public PixelFrame(g<PixelFrame> gVar, int i2, int i3, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType) {
    }

    public PixelFrame(g<? extends PixelFrame> gVar) {
    }
}
