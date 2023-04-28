package com.aliyun.identity.platform.camera;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CameraData {
    public static final int MODE_BGR = 2;
    public static final int MODE_BGRA = 1;
    public static final int MODE_DEPTH_100UM = 51;
    public static final int MODE_DEPTH_1_MM = 50;
    public static final int MODE_GRAY_16 = 6;
    public static final int MODE_GRAY_8 = 5;
    public static final int MODE_IR_GRAY_16 = 6;
    public static final int MODE_IR_GRAY_8 = 5;
    public static final int MODE_NV21 = 0;
    public static final int MODE_RGB = 4;
    public static final int MODE_RGBA = 3;
    public ByteBuffer mColorData;
    public int mColorFrameMode;
    public int mColorHeight;
    public int mColorWidth;
    public ByteBuffer mDepthData;
    public int mDepthFrameMode;
    public int mDepthHeight;
    public int mDepthWidth;
    public ByteBuffer mIRData;
    public int mIRFrameMode;
    public int mIRHeight;
    public int mIRWidth;
    public boolean mMirror;
    public int mPreviewHeight;
    public int mPreviewWidth;

    public CameraData() {
    }

    public CameraData deepClone() {
    }

    public ByteBuffer getColorData() {
    }

    public int getColorFrameMode() {
    }

    public int getColorHeight() {
    }

    public int getColorWidth() {
    }

    public ByteBuffer getDepthData() {
    }

    public int getDepthFrameMode() {
    }

    public int getDepthHeight() {
    }

    public int getDepthWidth() {
    }

    public ByteBuffer getIRData() {
    }

    public int getIRFrameMode() {
    }

    public int getIRHeight() {
    }

    public int getIRWidth() {
    }

    public boolean getMirror() {
    }

    public int getPreviewHeight() {
    }

    public int getPreviewWidth() {
    }

    public void recycle() {
    }

    public void setColorData(ByteBuffer byteBuffer) {
    }

    public void setColorFrameMode(int i2) {
    }

    public void setColorHeight(int i2) {
    }

    public void setColorWidth(int i2) {
    }

    public void setDepthData(ByteBuffer byteBuffer) {
    }

    public void setDepthFrameMode(int i2) {
    }

    public void setDepthHeight(int i2) {
    }

    public void setDepthWidth(int i2) {
    }

    public void setIRData(ByteBuffer byteBuffer) {
    }

    public void setIRFrameMode(int i2) {
    }

    public void setIRHeight(int i2) {
    }

    public void setIRWidth(int i2) {
    }

    public void setMirror(boolean z) {
    }

    public void setPreviewHeight(int i2) {
    }

    public void setPreviewWidth(int i2) {
    }

    public String toString() {
    }

    public CameraData(ByteBuffer byteBuffer, int i2, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, int i7, int i8) {
    }

    public CameraData(ByteBuffer byteBuffer, int i2, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, int i7, int i8, boolean z) {
    }

    public CameraData(ByteBuffer byteBuffer, int i2, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, int i7, ByteBuffer byteBuffer3, int i8, int i9, int i10, int i11, int i12, boolean z) {
    }
}
