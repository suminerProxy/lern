package com.ant.phone.xmedia.algorithm;

import h.c.a.a.b.b.h;
import h.c.a.a.b.b.i;
import h.c.a.a.h.a;
import h.c.a.a.h.b;
import h.c.a.a.h.c;
import h.c.a.a.h.e;
import h.c.a.a.h.f;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import xnn.XNNResult;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GestureDetect {
    private static final String CASE_ID = "UC-XM-C11";
    private static final String TAG = "GestureDetect";
    private static final String XMEDIA_GESTURE_DETECT_COMPATIBLE = "XMEDIA_GESTURE_DETECT_COMPATIBLE";
    private ByteBuffer mBuffer;
    private long mCurrentTime;
    private i mEvents;
    private int mFormat;
    private int mFrameCount;
    private int mHeight;
    private long mNativeInstance;
    private Options mOptions;
    private h mTimeEvent;
    private int mWidth;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Options {
        public String algoConfig;
        public int sampling;
        public int timeInterval;
        public String xnnConfig;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Result {
        public List<c> algoResults;
        public e errorInfo;
    }

    private boolean checkInterval() {
    }

    public static boolean isSupported(String str) {
    }

    private native long nativeInit(String[] strArr, String str, String str2);

    private native void nativeRelease();

    private native XNNResult nativeRun(ByteBuffer byteBuffer, int i2, int i3, int i4, float[] fArr, int i5, boolean z);

    private void putBufferData(b bVar) {
    }

    private List<c> runInner(ByteBuffer byteBuffer, int i2, int i3, int i4, float[] fArr, int i5, boolean z) {
    }

    private void tracking() {
    }

    public boolean init(String str, String str2, String[] strArr, Options options) {
    }

    public void release() {
    }

    public Result run(a aVar, float[] fArr, int i2, Map<String, Object> map) {
    }

    private void putBufferData(f fVar) {
    }
}
