package com.tencent.thumbplayer.core.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.tencent.thumbplayer.h.b;

@RequiresApi(api = 16)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPMediaCodecAudioDecoder extends TPBaseMediaCodecDecoder {
    private static final String TAG = "TPMediaCodecAudioDecoder";
    private int mAudioFormat;
    private int mChannelCount;
    private byte[] mCsd0Data;
    private boolean mEnableAudioPassThrough;
    private boolean mIsAdts;
    private String mMimeType;
    private int mSampleRate;

    public TPMediaCodecAudioDecoder(int i2) {
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
    public boolean setParamBool(int i2, boolean z) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i2, byte[] bArr) {
    }

    @Override // com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder, com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i2, Object obj) {
    }
}
