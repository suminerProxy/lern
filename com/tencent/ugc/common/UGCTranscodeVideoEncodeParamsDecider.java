package com.tencent.ugc.common;

import android.media.MediaFormat;
import com.tencent.liteav.base.util.p;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import com.tencent.ugc.common.UGCConstants;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCTranscodeVideoEncodeParamsDecider {
    private static final String TAG = "UGCTranscodeVideoEncodeParamsDecider";
    private int mEncodeBitrate;
    private VideoEncoderDef.EncoderProfile mEncodeProfile;
    private Rotation mEncodeRotation;
    private final p mExpectSize;
    private boolean mFullIFrame;
    private p mGenerateSize;
    private UGCConstants.SourceType mSourceType;
    private int mVideoCompress;
    private List<MediaFormat> mVideoMediaFormatList;
    private p mVideoResolution;

    private p adjustPictureOutSize(p pVar, p pVar2) {
    }

    private p adjustVideoOutSize(p pVar, p pVar2) {
    }

    private int getDecidedGOP() {
    }

    private p getDecidedOutputSize() {
    }

    private int getDecidedVideoBitrate(p pVar) {
    }

    private int getDecidedVideoFPS() {
    }

    private int getNumberFromMediaFormat(MediaFormat mediaFormat, String str, int i2) {
    }

    private p getOutputSizeForMultipleSource(List<MediaFormat> list) {
    }

    private p getOutputSizeForSingleSource(MediaFormat mediaFormat) {
    }

    private p getSizeFromMediaFormat(MediaFormat mediaFormat) {
    }

    public VideoEncodeParams getDecidedEncodeParams() {
    }

    public void setEncodeBitrate(int i2) {
    }

    public void setEncodeOutputSize(p pVar) {
    }

    public void setEncodeProfile(int i2) {
    }

    public void setEncodeRotation(Rotation rotation) {
    }

    public void setFullIFrame(boolean z) {
    }

    public void setInputVideoMediaFormat(List<MediaFormat> list) {
    }

    public void setOutputResolution(int i2) {
    }

    public void setSourceType(UGCConstants.SourceType sourceType) {
    }
}
