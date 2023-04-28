package com.tencent.ugc.videoprocessor;

import android.content.Context;
import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.ugc.videoprocessor.videoeffect.data.Motion;
import com.tencent.ugc.videoprocessor.videoeffect.data.MotionFilterConfig;
import java.nio.FloatBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class VideoEffectProcessor {
    private static final String TAG = "VideoEffectProcessor";
    private final Context mContext;
    private com.tencent.liteav.videobase.a.b mCurrentEffect;
    private int mCurrentEffectType;
    private final MotionFilterConfig mMotionFilterConfig;
    private boolean mReverse;

    public VideoEffectProcessor(Context context) {
    }

    @NonNull
    private com.tencent.liteav.videobase.a.b createEffect(int i2) {
    }

    private void destroyCurrentEffect() {
    }

    private Motion getCurrentMotion(long j2) {
    }

    private boolean isInMotionTime(Motion motion, long j2) {
    }

    public void deleteAllEffect() {
    }

    public void deleteLastEffect() {
    }

    public void destroy() {
    }

    public int getCurrentMotionType(long j2) {
    }

    public PixelFrame processFrame(PixelFrame pixelFrame, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, com.tencent.liteav.videobase.frame.e eVar) {
    }

    public void startEffect(int i2, long j2) {
    }

    public void stopEffect(int i2, long j2) {
    }
}
