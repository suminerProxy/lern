package com.nineoldandroids.view.animation;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AnimatorProxy extends Animation {
    public static final boolean NEEDS_PROXY = false;
    private static final WeakHashMap<View, AnimatorProxy> PROXIES = null;
    private final RectF mAfter;
    private float mAlpha;
    private final RectF mBefore;
    private final Camera mCamera;
    private boolean mHasPivot;
    private float mPivotX;
    private float mPivotY;
    private float mRotationX;
    private float mRotationY;
    private float mRotationZ;
    private float mScaleX;
    private float mScaleY;
    private final Matrix mTempMatrix;
    private float mTranslationX;
    private float mTranslationY;
    private final WeakReference<View> mView;

    private AnimatorProxy(View view) {
    }

    private void computeRect(RectF rectF, View view) {
    }

    private void invalidateAfterUpdate() {
    }

    private void prepareForUpdate() {
    }

    private void transformMatrix(Matrix matrix, View view) {
    }

    public static AnimatorProxy wrap(View view) {
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f2, Transformation transformation) {
    }

    public float getAlpha() {
    }

    public float getPivotX() {
    }

    public float getPivotY() {
    }

    public float getRotation() {
    }

    public float getRotationX() {
    }

    public float getRotationY() {
    }

    public float getScaleX() {
    }

    public float getScaleY() {
    }

    public int getScrollX() {
    }

    public int getScrollY() {
    }

    public float getTranslationX() {
    }

    public float getTranslationY() {
    }

    public float getX() {
    }

    public float getY() {
    }

    public void setAlpha(float f2) {
    }

    public void setPivotX(float f2) {
    }

    public void setPivotY(float f2) {
    }

    public void setRotation(float f2) {
    }

    public void setRotationX(float f2) {
    }

    public void setRotationY(float f2) {
    }

    public void setScaleX(float f2) {
    }

    public void setScaleY(float f2) {
    }

    public void setScrollX(int i2) {
    }

    public void setScrollY(int i2) {
    }

    public void setTranslationX(float f2) {
    }

    public void setTranslationY(float f2) {
    }

    public void setX(float f2) {
    }

    public void setY(float f2) {
    }
}
