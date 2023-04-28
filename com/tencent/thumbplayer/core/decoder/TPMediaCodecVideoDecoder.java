package com.tencent.thumbplayer.core.decoder;

import android.annotation.TargetApi;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.tencent.thumbplayer.h.b;

@RequiresApi(api = 16)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPMediaCodecVideoDecoder extends TPBaseMediaCodecDecoder {
    private static final String DEVICE_NAME_VIVO_X5L = "vivo X5L";
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int PIXEL_STRIDE_CONTINUOUS = 1;
    private static final String TAG = "TPMediaCodecVideoDecode";
    private static final int YUV420P_PLANAR_COUNT = 3;
    private int mCropBottom;
    private int mCropLeft;
    private int mCropRight;
    private int mCropTop;
    private byte[] mCsd0Data;
    private byte[] mCsd1Data;
    private byte[] mCsd2Data;
    private boolean mEnableMediaCodecOutputData;
    private String mMimeType;
    private int mRotation;
    private int mVideoHeight;
    private int mVideoWidth;

    public TPMediaCodecVideoDecoder(int i2) {
    }

    @RequiresApi(api = 21)
    private void copyVideoDataFromImage(@NonNull Image image, @NonNull TPFrameInfo tPFrameInfo) {
    }

    @RequiresApi(api = 21)
    private void copyVideoDataFromPlane(@NonNull Image.Plane plane, int i2, int i3, @IntRange(from = 0) int i4, @NonNull TPFrameInfo tPFrameInfo) {
    }

    @TargetApi(21)
    private void processOutputData(@NonNull b bVar, int i2, @NonNull MediaCodec.BufferInfo bufferInfo, @NonNull TPFrameInfo tPFrameInfo) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void configCodec(@NonNull b bVar) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public String getLogTag() {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public String getMimeType() {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i2, int i3, int i4, int i5) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean initDecoder(String str, int i2, int i3, int i4, Surface surface, int i5, int i6, int i7) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processMediaCodecException(Exception exc) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputBuffer(@NonNull b bVar, int i2, @NonNull MediaCodec.BufferInfo bufferInfo, @NonNull TPFrameInfo tPFrameInfo) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputConfigData(@NonNull b bVar, int i2, @NonNull MediaCodec.BufferInfo bufferInfo, @NonNull TPFrameInfo tPFrameInfo) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder
    public void processOutputFormatChanged(@NonNull MediaFormat mediaFormat) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f2) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOutputSurface(Surface surface) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i2, boolean z) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i2, byte[] bArr) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i2, Object obj) {
    }
}
