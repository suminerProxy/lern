package org.libpag;

import android.content.res.AssetManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGFile extends PAGComposition {
    public static PAGFile Load(String str) {
    }

    private static native PAGFile LoadFromAssets(AssetManager assetManager, String str);

    private static native PAGFile LoadFromBytes(byte[] bArr, int i2);

    private static native PAGFile LoadFromPath(String str);

    public static native int MaxSupportedTagLevel();

    private static final native void nativeInit();

    public native PAGFile copyOriginal();

    public native int[] getEditableIndices(int i2);

    public native PAGLayer[] getLayersByEditableIndex(int i2, int i3);

    public native PAGText getTextData(int i2);

    public native void nativeReplaceImage(int i2, long j2);

    public native void nativeReplaceImageByName(String str, long j2);

    public native int numImages();

    public native int numTexts();

    public native int numVideos();

    public native String path();

    public void replaceImage(int i2, PAGImage pAGImage) {
    }

    public void replaceImageByName(String str, PAGImage pAGImage) {
    }

    public native void replaceText(int i2, PAGText pAGText);

    public native void setDuration(long j2);

    public native void setTimeStretchMode(int i2);

    public native int tagLevel();

    public native int timeStretchMode();

    public static PAGFile Load(byte[] bArr) {
    }

    public static PAGFile Load(AssetManager assetManager, String str) {
    }
}
