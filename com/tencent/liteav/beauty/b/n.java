package com.tencent.liteav.beauty.b;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class n extends com.tencent.liteav.videobase.a.b {
    public static final short[] DRAW_ORDER = null;
    public static final ShortBuffer DRAW_ORDER_BUFFER = null;
    private static final String TAG = "TXCGPUWatermarkFilter";
    private static final float[] TEXTURE_COORDS = null;
    public static final FloatBuffer TEXTURE_COORDS_BUFFER = null;
    private static final float[] VERTICES_COORDS = null;
    private int mBaseMarkOffset;
    private a mBaseWaterMark;
    public boolean mDrawWaterMarkEnabled;
    public a[] mRenderObjects;
    public int mSrcBlendMode;
    public List<o> mWaterMarkList;
    private o mWatermark;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public FloatBuffer f11600a;
        public Bitmap b;
        public int c;

        public final void a() {
        }
    }

    public n() {
    }

    private boolean compareWaterMarkList(List<o> list, List<o> list2) {
    }

    private void releaseWaterMark() {
    }

    private void setWatermark(Bitmap bitmap, float f2, float f3, float f4, int i2) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void afterDrawArrays() {
    }

    public void calculateOffsetMatrix(int i2, int i3, float f2, float f3, float f4, int i4) {
    }

    public void enableWatermark(boolean z) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onInit(com.tencent.liteav.videobase.frame.e eVar) {
    }

    @Override // com.tencent.liteav.videobase.a.b
    public void onUninit() {
    }

    public void setWaterMarkList(List<o> list) {
    }

    public n(String str, String str2) {
    }

    public void setWatermark(Bitmap bitmap, float f2, float f3, float f4) {
    }
}
