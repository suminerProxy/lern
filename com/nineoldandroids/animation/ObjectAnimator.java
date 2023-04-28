package com.nineoldandroids.animation;

import com.nineoldandroids.util.Property;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ObjectAnimator extends ValueAnimator {
    private static final boolean DBG = false;
    private static final Map<String, Property> PROXY_PROPERTIES = null;
    private Property mProperty;
    private String mPropertyName;
    private Object mTarget;

    public ObjectAnimator() {
    }

    public static ObjectAnimator ofFloat(Object obj, String str, float... fArr) {
    }

    public static ObjectAnimator ofInt(Object obj, String str, int... iArr) {
    }

    public static ObjectAnimator ofObject(Object obj, String str, TypeEvaluator typeEvaluator, Object... objArr) {
    }

    public static ObjectAnimator ofPropertyValuesHolder(Object obj, PropertyValuesHolder... propertyValuesHolderArr) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void animateValue(float f2) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public /* bridge */ /* synthetic */ Animator clone() {
    }

    public String getPropertyName() {
    }

    public Object getTarget() {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void initAnimation() {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public /* bridge */ /* synthetic */ Animator setDuration(long j2) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setFloatValues(float... fArr) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setIntValues(int... iArr) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public void setObjectValues(Object... objArr) {
    }

    public void setProperty(Property property) {
    }

    public void setPropertyName(String str) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setTarget(Object obj) {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupEndValues() {
    }

    @Override // com.nineoldandroids.animation.Animator
    public void setupStartValues() {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public void start() {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator
    public String toString() {
    }

    private ObjectAnimator(Object obj, String str) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public /* bridge */ /* synthetic */ ValueAnimator clone() {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public /* bridge */ /* synthetic */ ValueAnimator setDuration(long j2) {
    }

    public static <T> ObjectAnimator ofFloat(T t, Property<T, Float> property, float... fArr) {
    }

    public static <T> ObjectAnimator ofInt(T t, Property<T, Integer> property, int... iArr) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo11clone() throws CloneNotSupportedException {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public ObjectAnimator setDuration(long j2) {
    }

    public static <T, V> ObjectAnimator ofObject(T t, Property<T, V> property, TypeEvaluator<V> typeEvaluator, V... vArr) {
    }

    @Override // com.nineoldandroids.animation.ValueAnimator, com.nineoldandroids.animation.Animator
    public ObjectAnimator clone() {
    }

    private <T> ObjectAnimator(T t, Property<T, ?> property) {
    }
}
