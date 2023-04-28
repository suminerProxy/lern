package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealWidget;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 0;
    private boolean buildingCircularRevealCache;
    private Paint debugPaint;
    private final Delegate delegate;
    private boolean hasCircularRevealCache;
    @Nullable
    private Drawable overlayDrawable;
    @Nullable
    private CircularRevealWidget.RevealInfo revealInfo;
    @NonNull
    private final Paint revealPaint;
    @NonNull
    private final Path revealPath;
    @NonNull
    private final Paint scrimPaint;
    @NonNull
    private final View view;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Strategy {
    }

    public CircularRevealHelper(Delegate delegate) {
    }

    private void drawDebugCircle(@NonNull Canvas canvas, int i2, float f2) {
    }

    private void drawDebugMode(@NonNull Canvas canvas) {
    }

    private void drawOverlayDrawable(@NonNull Canvas canvas) {
    }

    private float getDistanceToFurthestCorner(@NonNull CircularRevealWidget.RevealInfo revealInfo) {
    }

    private void invalidateRevealInfo() {
    }

    private boolean shouldDrawCircularReveal() {
    }

    private boolean shouldDrawOverlayDrawable() {
    }

    private boolean shouldDrawScrim() {
    }

    public void buildCircularRevealCache() {
    }

    public void destroyCircularRevealCache() {
    }

    public void draw(@NonNull Canvas canvas) {
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
    }

    public boolean isOpaque() {
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
    }

    public void setCircularRevealScrimColor(@ColorInt int i2) {
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
    }
}
