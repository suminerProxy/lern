package com.ant.phone.xmedia.algorithm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import h.c.a.a.b.b.g;
import h.c.a.a.b.b.h;
import h.c.a.a.b.b.i;
import h.c.a.a.h.a;
import h.c.a.a.h.b;
import h.c.a.a.h.f;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xnn.XNNResult;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class OCR {
    private static final String CASE_ID = "UC-XM-C07";
    public static final String EXTRA_DATA_IMAGE = "image";
    public static final String EXTRA_DATA_REC_FLAG = "recFlag";
    public static final String EXTRA_DATA_RESULT_IMAGE = "resultImage";
    public static final String EXTRA_DATA_ROI_IMAGE = "roiImage";
    private static final String TAG = "OCR";
    private ByteBuffer mBuffer;
    private Context mContext;
    private long mCurrentTime;
    private i mEvents;
    private HashMap<String, Object> mExtraData;
    private int mFormat;
    private int mFrameCount;
    private int mHeight;
    private List<Result> mLastResult;
    private long mNativeInstance;
    private Options mOptions;
    private g mShakeDetecotr;
    private h mTimeEvent;
    private int mWidth;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Options {
        public String algoConfig;
        public int imageOutput;
        public int resultImageOutput;
        public int roiImageOutput;
        public int sampling;
        public int shakingThreshold;
        public int timeInterval;
        public String xnnConfig;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Result {
        public float conf;
        public String label;
        public PointF[] points;
    }

    public OCR() {
    }

    private boolean checkInterval() {
    }

    public static boolean isSupported(String str) {
    }

    private native Bitmap nativeGetObjectImage();

    private native int nativeGetRecFlag();

    private native Bitmap nativeGetRoiImage();

    private native long nativeInit(String[] strArr, String str, String str2);

    private native void nativeRelease();

    private native XNNResult nativeRun(ByteBuffer byteBuffer, int i2, int i3, int i4, float[] fArr, int i5, boolean z);

    private native void nativeSetImageFlag(int i2);

    private native void nativeSetObjectFlag(int i2);

    private void putBufferData(b bVar) {
    }

    private List<Result> runInner(ByteBuffer byteBuffer, int i2, int i3, int i4, float[] fArr, int i5, Map<String, Object> map) {
    }

    private void tracking() {
    }

    public Object getExtraData(String str) {
    }

    public boolean init(String str, String str2, String[] strArr, Options options) {
    }

    public void release() {
    }

    public List<Result> run(Bitmap bitmap, float[] fArr, int i2, Map<String, Object> map) {
    }

    public OCR(Context context) {
    }

    private void putBufferData(f fVar) {
    }

    public List<Result> run(a aVar, float[] fArr, int i2, Map<String, Object> map) {
    }
}
