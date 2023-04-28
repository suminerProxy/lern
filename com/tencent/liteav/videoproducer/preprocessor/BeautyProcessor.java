package com.tencent.liteav.videoproducer.preprocessor;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.beauty.b.l;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import java.util.Map;

@JNINamespace("liteav::video")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class BeautyProcessor extends com.tencent.liteav.videobase.a.h {
    private static final String TAG = "TXCBeautyManager";
    private final SparseArray<com.tencent.liteav.videobase.a.b> mBeautyFilters;
    private float mBeautyLevel;
    private a mBeautyManagerStatusListener;
    private final Map<String, String> mBeautyStats;
    private int mBeautyStyle;
    private final boolean mIsEnterPriseProEnabled;
    private boolean mIsPerformanceMode;
    private final com.tencent.liteav.beauty.b.l mMotionFilter;
    @NonNull
    private final IVideoReporter mReporter;
    private float mRuddyLevel;
    private float mSharpnessLevel;
    private float mUserSetSharpnessLevel;
    private float mWhitenessLevel;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void onBeautyStatsChanged(String str);
    }

    public BeautyProcessor(@NonNull Context context, boolean z, @NonNull IVideoReporter iVideoReporter) {
    }

    private float getSharpnessLevel() {
    }

    public static /* synthetic */ void lambda$setBeautyLevel$1(BeautyProcessor beautyProcessor, float f2) {
    }

    public static /* synthetic */ void lambda$setBeautyStyle$0(BeautyProcessor beautyProcessor, int i2) {
    }

    public static /* synthetic */ void lambda$setPerformanceMode$6(BeautyProcessor beautyProcessor, boolean z) {
    }

    public static /* synthetic */ void lambda$setRuddyLevel$4(BeautyProcessor beautyProcessor, float f2) {
    }

    public static /* synthetic */ void lambda$setSharpenLevel$3(BeautyProcessor beautyProcessor, float f2) {
    }

    public static /* synthetic */ void lambda$setWhitenessLevel$2(BeautyProcessor beautyProcessor, float f2) {
    }

    public static /* synthetic */ void lambda$updateStatsOnDraw$5(BeautyProcessor beautyProcessor, String str, int i2) {
    }

    private void setScalableCosmeticTypeLevel(l.a aVar, int i2) {
    }

    private void updateBeautyInternal(int i2, float f2, float f3, float f4, float f5) {
    }

    private void updateSharpenLevelInternal() {
    }

    private void updateStatsInternal(String str, float f2) {
    }

    @Override // com.tencent.liteav.videobase.a.h, com.tencent.liteav.videobase.a.b
    public void onInit(com.tencent.liteav.videobase.frame.e eVar) {
    }

    @Override // com.tencent.liteav.videobase.a.h, com.tencent.liteav.videobase.a.b
    public void onOutputSizeChanged(int i2, int i3) {
    }

    @Override // com.tencent.liteav.videobase.a.h, com.tencent.liteav.videobase.a.b
    public void onUninit() {
    }

    public void setAIDetectListener(com.tencent.liteav.videobase.base.a aVar) {
    }

    @CalledByNative
    public void setBeautyLevel(float f2) {
    }

    public void setBeautyManagerStatusListener(a aVar) {
    }

    @CalledByNative
    public void setBeautyStyle(int i2) {
    }

    @CalledByNative
    public void setChinLevel(int i2) {
    }

    @CalledByNative
    public void setEyeAngleLevel(int i2) {
    }

    @CalledByNative
    public void setEyeDistanceLevel(int i2) {
    }

    @CalledByNative
    public void setEyeLightenLevel(int i2) {
    }

    @CalledByNative
    public void setEyeScaleLevel(int i2) {
    }

    @CalledByNative
    public void setFaceBeautyLevel(int i2) {
    }

    @CalledByNative
    public void setFaceNarrowLevel(int i2) {
    }

    @CalledByNative
    public void setFaceShortLevel(int i2) {
    }

    @CalledByNative
    public void setFaceSlimLevel(int i2) {
    }

    @CalledByNative
    public void setFaceVLevel(int i2) {
    }

    @CalledByNative
    public void setForeheadLevel(int i2) {
    }

    public void setHomeOrientation(int i2) {
    }

    @CalledByNative
    public void setLipsThicknessLevel(int i2) {
    }

    @CalledByNative
    public void setMotionMute(boolean z) {
    }

    @CalledByNative
    public void setMotionTmpl(String str) {
    }

    @CalledByNative
    public void setMouthShapeLevel(int i2) {
    }

    @CalledByNative
    public void setNosePositionLevel(int i2) {
    }

    @CalledByNative
    public void setNoseSlimLevel(int i2) {
    }

    @CalledByNative
    public void setNoseWingLevel(int i2) {
    }

    public void setPerformanceMode(boolean z) {
    }

    @CalledByNative
    public void setPounchRemoveLevel(int i2) {
    }

    @CalledByNative
    public void setRuddyLevel(float f2) {
    }

    @CalledByNative
    public void setSharpenLevel(float f2) {
    }

    @CalledByNative
    public void setSmileLinesRemoveLevel(int i2) {
    }

    @CalledByNative
    public void setToothWhitenLevel(int i2) {
    }

    @CalledByNative
    public void setWhitenessLevel(float f2) {
    }

    @CalledByNative
    public void setWrinkleRemoveLevel(int i2) {
    }

    public void updateStatsOnDraw(String str, int i2) {
    }
}
