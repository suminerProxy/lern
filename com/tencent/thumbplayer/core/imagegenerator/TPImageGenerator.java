package com.tencent.thumbplayer.core.imagegenerator;

import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPImageGenerator {
    private ITPImageGeneratorCallback mCallback;
    private int mFd;
    private long mFdLength;
    private long mFdOffset;
    private Map<String, String> mHttpHeader;
    private boolean mInited;
    private boolean mIsLibLoaded;
    private long mNativeContext;
    private String mUrl;

    public TPImageGenerator(int i2, long j2, long j3, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
    }

    public TPImageGenerator(String str, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
    }

    public TPImageGenerator(String str, Map<String, String> map, ITPImageGeneratorCallback iTPImageGeneratorCallback) {
    }

    private native void _cancelAllImageGenerations();

    private native int _createWithFd(int i2, long j2, long j3, Object obj);

    private native int _createWithUrl(String str, Object obj);

    private native void _generateImageAsyncAtTime(long j2, long j3, Object obj);

    private native void _generateImagesAsyncForTimes(long[] jArr, long j2, Object obj);

    private native void _release();

    private void loadLibrary() {
    }

    public void cancelAllImageGenerations() {
    }

    public void generateImageAsyncAtTime(long j2, long j3, TPImageGeneratorParams tPImageGeneratorParams) {
    }

    public void generateImagesAsyncForTimes(long[] jArr, long j2, TPImageGeneratorParams tPImageGeneratorParams) {
    }

    public void init() {
    }

    public void unInit() {
    }
}
