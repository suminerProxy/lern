package com.baidu.mapapi.animation;

import android.view.animation.Interpolator;
import com.baidu.mapsdkplatform.comapi.a.c;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class Animation {
    public c bdAnimation;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface AnimationListener {
        void onAnimationCancel();

        void onAnimationEnd();

        void onAnimationRepeat();

        void onAnimationStart();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class RepeatMode {
        public static final RepeatMode RESTART = null;
        public static final RepeatMode REVERSE = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ RepeatMode[] f1488a = null;

        private RepeatMode(String str, int i2) {
        }

        public static RepeatMode valueOf(String str) {
        }

        public static RepeatMode[] values() {
        }
    }

    public abstract void cancel();

    public abstract void setAnimationListener(AnimationListener animationListener);

    public abstract void setDuration(long j2);

    public abstract void setInterpolator(Interpolator interpolator);
}
