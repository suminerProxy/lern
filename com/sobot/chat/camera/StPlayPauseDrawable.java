package com.sobot.chat.camera;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StPlayPauseDrawable extends Drawable {
    private static final long PLAY_PAUSE_ANIMATION_DURATION = 250;
    private static final Property<StPlayPauseDrawable, Float> PROGRESS = null;
    private Animator animator;
    private float height;
    private boolean isPlay;
    private boolean isPlaySet;
    private final Path leftPauseBar;
    private final Paint paint;
    private final float pauseBarDistance;
    private final float pauseBarHeight;
    private final float pauseBarWidth;
    private float progress;
    private final Path rightPauseBar;
    private float width;

    /* renamed from: com.sobot.chat.camera.StPlayPauseDrawable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 extends Property<StPlayPauseDrawable, Float> {
        public AnonymousClass1(Class cls, String str) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Float get(@NonNull StPlayPauseDrawable stPlayPauseDrawable) {
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(@NonNull StPlayPauseDrawable stPlayPauseDrawable, Float f2) {
        }

        /* renamed from: get  reason: avoid collision after fix types in other method */
        public Float get2(@NonNull StPlayPauseDrawable stPlayPauseDrawable) {
        }

        /* renamed from: set  reason: avoid collision after fix types in other method */
        public void set2(@NonNull StPlayPauseDrawable stPlayPauseDrawable, Float f2) {
        }
    }

    /* renamed from: com.sobot.chat.camera.StPlayPauseDrawable$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        public final /* synthetic */ StPlayPauseDrawable this$0;

        public AnonymousClass2(StPlayPauseDrawable stPlayPauseDrawable) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public StPlayPauseDrawable(@NonNull Context context) {
    }

    public static /* synthetic */ float access$000(StPlayPauseDrawable stPlayPauseDrawable) {
    }

    public static /* synthetic */ void access$100(StPlayPauseDrawable stPlayPauseDrawable, float f2) {
    }

    public static /* synthetic */ boolean access$200(StPlayPauseDrawable stPlayPauseDrawable) {
    }

    public static /* synthetic */ boolean access$202(StPlayPauseDrawable stPlayPauseDrawable, boolean z) {
    }

    @NonNull
    private Animator getPausePlayAnimator() {
    }

    private float getProgress() {
    }

    private static float lerp(float f2, float f3, float f4) {
    }

    private void setProgress(float f2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public boolean isPlay() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setPause(boolean z) {
    }

    public void setPlay(boolean z) {
    }

    public void togglePlayPause() {
    }
}
