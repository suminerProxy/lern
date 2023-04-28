package com.tencent.thumbplayer.core.subtitle;

import com.tencent.thumbplayer.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.core.common.TPSubtitleFrameWrapper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPSubtitleParser {
    public static final int TP_SUBTITLE_OUTPUT_RGBA = 1;
    public static final int TP_SUBTITLE_OUTPUT_TEXT = 0;
    private ITPSubtitleParserCallback mCallback;
    private boolean mInited;
    private boolean mIsLibLoaded;
    private long mNativeContext;
    private int mOutputType;
    private String mUrl;

    public TPSubtitleParser(String str, ITPSubtitleParserCallback iTPSubtitleParserCallback) {
    }

    public TPSubtitleParser(String str, ITPSubtitleParserCallback iTPSubtitleParserCallback, int i2) {
    }

    private native int _subtitleCreate(String str, Object obj, int i2);

    private native void _subtitleDelete();

    private native TPSubtitleFrameWrapper _subtitleGetFrame(long j2);

    private native String _subtitleGetText(long j2, int i2);

    private native int _subtitleGetTrackCount();

    private native String _subtitleGetTrackName(int i2);

    private native void _subtitleLoadAsync();

    private native void _subtitlePauseAsync();

    private native int _subtitleSelectTrackAsync(int i2, long j2);

    private native void _subtitleSetRenderParams(TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams);

    private native void _subtitleStartAsync();

    private native void _subtitleStop();

    private void loadLibrary() {
    }

    public TPSubtitleFrameWrapper getSubtitleFrame(long j2) {
    }

    public String getSubtitleText(long j2, int i2) {
    }

    public TPMediaTrackInfo[] getTrackInfo() {
    }

    public void init() {
    }

    public void loadAsync() {
    }

    public void pauseAsync() {
    }

    public int selectTrackAsync(int i2, long j2) {
    }

    public int selectTracksAsync(int[] iArr, long j2) {
    }

    public void setRenderParams(TPNativeSubtitleRenderParams tPNativeSubtitleRenderParams) {
    }

    public void startAsync() {
    }

    public void stop() {
    }

    public void unInit() {
    }
}
