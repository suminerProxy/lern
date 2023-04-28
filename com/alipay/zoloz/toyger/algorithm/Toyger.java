package com.alipay.zoloz.toyger.algorithm;

import android.content.Context;
import com.alipay.zoloz.toyger.ToygerAttr;
import com.alipay.zoloz.toyger.doc.ToygerDocAlgorithmConfig;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Toyger {
    public static native ByteBuffer allocDepthFrameData(long j2);

    public static native ByteBuffer allocIRFrameData(long j2);

    public static native ByteBuffer allocRGBFrameData(long j2);

    public static native void config(IToygerDelegate iToygerDelegate, ToygerConfig toygerConfig);

    public static native boolean configDoc(IToygerDelegate iToygerDelegate, ToygerDocAlgorithmConfig toygerDocAlgorithmConfig);

    public static native void fetchDepthFrameData(ShortBuffer shortBuffer, long j2);

    public static native void fetchIRFrameData(ByteBuffer byteBuffer, long j2);

    public static native void fetchRGBFrameData(ByteBuffer byteBuffer, long j2);

    public static native String getVersion();

    public static native boolean init(Context context, byte[] bArr, String str, String str2, Map map);

    public static native void processImage(List<TGFrame> list, TGDepthFrame tGDepthFrame, ToygerAttr toygerAttr);

    public static native void processSensorData(float[] fArr, float[] fArr2, float[] fArr3, long j2);

    public static native void release();

    public static native void releaseDepthFrameData(ByteBuffer byteBuffer);

    public static native void releaseIRFrameData(ByteBuffer byteBuffer);

    public static native void releaseRGBFrameData(ByteBuffer byteBuffer);

    public static native void reset();
}
