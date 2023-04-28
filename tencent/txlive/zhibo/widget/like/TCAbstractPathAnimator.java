package tencent.txlive.zhibo.widget.like;

import android.content.res.TypedArray;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class TCAbstractPathAnimator {
    public final Config mConfig;
    private final Random mRandom;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Config {
        public int animDuration;
        public int animLength;
        public int animLengthRand;
        public int bezierFactor;
        public int heartHeight;
        public int heartWidth;
        public int initX;
        public int initY;
        public int xPointFactor;
        public int xRand;

        public static Config fromTypeArray(TypedArray typedArray, float f2, float f3, int i2, int i3, int i4) {
        }
    }

    public TCAbstractPathAnimator(Config config) {
    }

    public Path createPath(AtomicInteger atomicInteger, View view, int i2) {
    }

    public float randomRotation() {
    }

    public abstract void start(View view, ViewGroup viewGroup);
}
