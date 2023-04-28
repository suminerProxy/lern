package com.tencent.thumbplayer.core.decoder;

import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.tencent.thumbplayer.core.common.TPMethodCalledByNative;
import java.util.concurrent.atomic.AtomicInteger;

@RequiresApi(api = 16)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPMediaCodecManager {
    private static final String TAG = "TPMediaCodecManager";
    private static AtomicInteger codecNum;
    private static SparseArray<ITPMediaCodecDecoder> mCodecList;

    private static native void _onMediaCodecException(int i2, String str);

    private static native void _onMediaCodecReady(int i2, String str);

    private static native void _onMediaDrmInfo(int i2, Object obj);

    private static void addCodecToList(int i2, ITPMediaCodecDecoder iTPMediaCodecDecoder) {
    }

    @TPMethodCalledByNative
    public static int createMediaCodec(boolean z) {
    }

    @TPMethodCalledByNative
    public static int flushMediaCodec(int i2) {
    }

    private static ITPMediaCodecDecoder getCodecById(int i2) {
    }

    @TPMethodCalledByNative
    public static int getSDKVersion() {
    }

    @TPMethodCalledByNative
    public static boolean initAudioMediaCodec(int i2, String str, int i3, int i4, int i5, int i6) {
    }

    @TPMethodCalledByNative
    public static boolean initVideoMediaCodec(int i2, String str, int i3, int i4, int i5, Surface surface, int i6, int i7, int i8) {
    }

    public static void onMediaCodecException(int i2, String str) {
    }

    public static void onMediaCodecReady(int i2, String str) {
    }

    public static void onMediaDrmInfo(int i2, Object obj) {
    }

    @TPMethodCalledByNative
    public static TPFrameInfo receiveOneFrame(int i2) {
    }

    @TPMethodCalledByNative
    public static int releaseMediaCodec(int i2) {
    }

    @TPMethodCalledByNative
    public static int releaseVideoFrame(int i2, int i3, boolean z) {
    }

    private static void removeCodecFromList(int i2) {
    }

    @TPMethodCalledByNative
    public static int sendOnePacket(int i2, byte[] bArr, boolean z, long j2, boolean z2) {
    }

    @TPMethodCalledByNative
    public static void setCryptoInfo(int i2, int i3, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i4) {
    }

    @TPMethodCalledByNative
    public static int setMediaCodecOperateRate(int i2, float f2) {
    }

    @TPMethodCalledByNative
    public static boolean setMediaCodecParamBool(int i2, int i3, boolean z) {
    }

    @TPMethodCalledByNative
    public static boolean setMediaCodecParamBytes(int i2, int i3, byte[] bArr) {
    }

    @TPMethodCalledByNative
    public static boolean setMediaCodecParamInt(int i2, int i3, int i4) {
    }

    @TPMethodCalledByNative
    public static boolean setMediaCodecParamLong(int i2, int i3, long j2) {
    }

    @TPMethodCalledByNative
    public static boolean setMediaCodecParamObject(int i2, int i3, Object obj) {
    }

    @TPMethodCalledByNative
    public static boolean setMediaCodecParamString(int i2, int i3, String str) {
    }

    @TPMethodCalledByNative
    public static int setMediaCodecSurface(int i2, Surface surface) {
    }

    @TPMethodCalledByNative
    public static int signalEndOfStream(int i2) {
    }
}
