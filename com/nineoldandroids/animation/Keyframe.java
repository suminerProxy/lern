package com.nineoldandroids.animation;

import android.view.animation.Interpolator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Keyframe implements Cloneable {
    public float mFraction;
    public boolean mHasValue;
    private Interpolator mInterpolator;
    public Class mValueType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FloatKeyframe extends Keyframe {
        public float mValue;

        public FloatKeyframe(float f2, float f3) {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public /* bridge */ /* synthetic */ Keyframe clone() {
        }

        public float getFloatValue() {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public Object getValue() {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public void setValue(Object obj) {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo14clone() throws CloneNotSupportedException {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public FloatKeyframe clone() {
        }

        public FloatKeyframe(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class IntKeyframe extends Keyframe {
        public int mValue;

        public IntKeyframe(float f2, int i2) {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public /* bridge */ /* synthetic */ Keyframe clone() {
        }

        public int getIntValue() {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public Object getValue() {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public void setValue(Object obj) {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo14clone() throws CloneNotSupportedException {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public IntKeyframe clone() {
        }

        public IntKeyframe(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ObjectKeyframe extends Keyframe {
        public Object mValue;

        public ObjectKeyframe(float f2, Object obj) {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public /* bridge */ /* synthetic */ Keyframe clone() {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public Object getValue() {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public void setValue(Object obj) {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo14clone() throws CloneNotSupportedException {
        }

        @Override // com.nineoldandroids.animation.Keyframe
        public ObjectKeyframe clone() {
        }
    }

    public static Keyframe ofFloat(float f2, float f3) {
    }

    public static Keyframe ofInt(float f2, int i2) {
    }

    public static Keyframe ofObject(float f2, Object obj) {
    }

    public abstract Keyframe clone();

    /* renamed from: clone  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo14clone() throws CloneNotSupportedException {
    }

    public float getFraction() {
    }

    public Interpolator getInterpolator() {
    }

    public Class getType() {
    }

    public abstract Object getValue();

    public boolean hasValue() {
    }

    public void setFraction(float f2) {
    }

    public void setInterpolator(Interpolator interpolator) {
    }

    public abstract void setValue(Object obj);

    public static Keyframe ofFloat(float f2) {
    }

    public static Keyframe ofInt(float f2) {
    }

    public static Keyframe ofObject(float f2) {
    }
}
