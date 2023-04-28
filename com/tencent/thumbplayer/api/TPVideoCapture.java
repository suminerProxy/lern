package com.tencent.thumbplayer.api;

import android.graphics.Bitmap;
import com.tencent.thumbplayer.core.common.TPVideoFrame;
import com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback;
import com.tencent.thumbplayer.core.imagegenerator.TPImageGenerator;
import com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPVideoCapture implements ITPImageGeneratorCallback {
    private static final String TAG = "TPThumbPlayer[TPVideoCapture.java]";
    private Map<String, TPVideoCaptureCallBack> mCallBackMap;
    private int mHeight;
    private long mOpaque;
    private long mRequestedTimeMsToleranceAfter;
    private long mRequestedTimeMsToleranceBefore;
    private TPImageGenerator mTpImageGenerator;
    private int mWidth;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface TPVideoCaptureCallBack {
        void onCaptureError(int i2);

        void onCaptureSuccess(Bitmap[] bitmapArr);
    }

    public TPVideoCapture(String str) {
    }

    private String generateOpaqueKey(long j2, long j3) {
    }

    private TPImageGeneratorParams getParameters() {
    }

    public void generateImageAsyncAtTime(long j2, TPVideoCaptureCallBack tPVideoCaptureCallBack) {
    }

    public void generateImagesAsyncForTimes(long[] jArr, TPVideoCaptureCallBack tPVideoCaptureCallBack) {
    }

    @Override // com.tencent.thumbplayer.core.imagegenerator.ITPImageGeneratorCallback
    public void onImageGenerationCompleted(int i2, long j2, long j3, long j4, TPVideoFrame tPVideoFrame) {
    }

    public void release() {
    }

    public void setSize(int i2, int i3) {
    }

    public void setTimeMsTolerance(long j2, long j3) {
    }
}
