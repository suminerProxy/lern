package com.tencent.ugc.videoprocessor.videoeffect.filter;

import com.tencent.liteav.videobase.a.b;
import com.tencent.liteav.videobase.frame.d;
import com.tencent.liteav.videobase.frame.e;
import java.nio.FloatBuffer;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXCSavePreFrameFilter {
    private b mDrawFilter;
    private e mGLTexturePool;
    private ArrayList<d> mPreTextureBuffers;
    private ArrayList<d> mRecyclerTextureBuffers;
    private int mSavePreFrameNumber;
    private int mVideoHeight;
    private int mVideoWidth;

    public void destroy() {
    }

    public void initFilter(e eVar) {
    }

    public void onDrawToTexture(int i2, d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
    }

    public void onOutputSizeChanged(int i2, int i3) {
    }

    public void setSavePreFrameNumber(int i2) {
    }
}
