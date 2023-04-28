package com.baidu.mapapi.animation;

import android.view.animation.Interpolator;
import com.baidu.mapapi.animation.Animation;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class SingleScaleAnimation extends Animation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ScaleType {
        public static final ScaleType SCALE_X = null;
        public static final ScaleType SCALE_Y = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ ScaleType[] f1489a = null;

        private ScaleType(String str, int i2) {
        }

        public static ScaleType valueOf(String str) {
        }

        public static ScaleType[] values() {
        }
    }

    public SingleScaleAnimation(ScaleType scaleType, float... fArr) {
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void cancel() {
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setAnimationListener(Animation.AnimationListener animationListener) {
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setDuration(long j2) {
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setInterpolator(Interpolator interpolator) {
    }

    public void setRepeatCount(int i2) {
    }

    public void setRepeatMode(Animation.RepeatMode repeatMode) {
    }
}
