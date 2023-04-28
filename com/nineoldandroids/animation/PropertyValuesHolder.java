package com.nineoldandroids.animation;

import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.util.Property;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PropertyValuesHolder implements Cloneable {
    private static Class[] DOUBLE_VARIANTS;
    private static Class[] FLOAT_VARIANTS;
    private static Class[] INTEGER_VARIANTS;
    private static final TypeEvaluator sFloatEvaluator = null;
    private static final HashMap<Class, HashMap<String, Method>> sGetterPropertyMap = null;
    private static final TypeEvaluator sIntEvaluator = null;
    private static final HashMap<Class, HashMap<String, Method>> sSetterPropertyMap = null;
    private Object mAnimatedValue;
    private TypeEvaluator mEvaluator;
    private Method mGetter;
    public KeyframeSet mKeyframeSet;
    public Property mProperty;
    public final ReentrantReadWriteLock mPropertyMapLock;
    public String mPropertyName;
    public Method mSetter;
    public final Object[] mTmpValueArray;
    public Class mValueType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FloatPropertyValuesHolder extends PropertyValuesHolder {
        public float mFloatAnimatedValue;
        public FloatKeyframeSet mFloatKeyframeSet;
        private FloatProperty mFloatProperty;

        public FloatPropertyValuesHolder(String str, FloatKeyframeSet floatKeyframeSet) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void calculateValue(float f2) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public /* bridge */ /* synthetic */ PropertyValuesHolder clone() {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public Object getAnimatedValue() {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void setAnimatedValue(Object obj) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void setFloatValues(float... fArr) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void setupSetter(Class cls) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo15clone() throws CloneNotSupportedException {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public FloatPropertyValuesHolder clone() {
        }

        public FloatPropertyValuesHolder(Property property, FloatKeyframeSet floatKeyframeSet) {
        }

        public FloatPropertyValuesHolder(String str, float... fArr) {
        }

        public FloatPropertyValuesHolder(Property property, float... fArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class IntPropertyValuesHolder extends PropertyValuesHolder {
        public int mIntAnimatedValue;
        public IntKeyframeSet mIntKeyframeSet;
        private IntProperty mIntProperty;

        public IntPropertyValuesHolder(String str, IntKeyframeSet intKeyframeSet) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void calculateValue(float f2) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public /* bridge */ /* synthetic */ PropertyValuesHolder clone() {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public Object getAnimatedValue() {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void setAnimatedValue(Object obj) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void setIntValues(int... iArr) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public void setupSetter(Class cls) {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo15clone() throws CloneNotSupportedException {
        }

        @Override // com.nineoldandroids.animation.PropertyValuesHolder
        public IntPropertyValuesHolder clone() {
        }

        public IntPropertyValuesHolder(Property property, IntKeyframeSet intKeyframeSet) {
        }

        public IntPropertyValuesHolder(String str, int... iArr) {
        }

        public IntPropertyValuesHolder(Property property, int... iArr) {
        }
    }

    public /* synthetic */ PropertyValuesHolder(Property property, AnonymousClass1 anonymousClass1) {
    }

    public static String getMethodName(String str, String str2) {
    }

    private Method getPropertyFunction(Class cls, String str, Class cls2) {
    }

    public static PropertyValuesHolder ofFloat(String str, float... fArr) {
    }

    public static PropertyValuesHolder ofInt(String str, int... iArr) {
    }

    public static PropertyValuesHolder ofKeyframe(String str, Keyframe... keyframeArr) {
    }

    public static PropertyValuesHolder ofObject(String str, TypeEvaluator typeEvaluator, Object... objArr) {
    }

    private void setupGetter(Class cls) {
    }

    private Method setupSetterOrGetter(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
    }

    private void setupValue(Object obj, Keyframe keyframe) {
    }

    public void calculateValue(float f2) {
    }

    /* renamed from: clone  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo15clone() throws CloneNotSupportedException {
    }

    public Object getAnimatedValue() {
    }

    public String getPropertyName() {
    }

    public void init() {
    }

    public void setAnimatedValue(Object obj) {
    }

    public void setEvaluator(TypeEvaluator typeEvaluator) {
    }

    public void setFloatValues(float... fArr) {
    }

    public void setIntValues(int... iArr) {
    }

    public void setKeyframes(Keyframe... keyframeArr) {
    }

    public void setObjectValues(Object... objArr) {
    }

    public void setProperty(Property property) {
    }

    public void setPropertyName(String str) {
    }

    public void setupEndValue(Object obj) {
    }

    public void setupSetter(Class cls) {
    }

    public void setupSetterAndGetter(Object obj) {
    }

    public void setupStartValue(Object obj) {
    }

    public String toString() {
    }

    public /* synthetic */ PropertyValuesHolder(String str, AnonymousClass1 anonymousClass1) {
    }

    public static PropertyValuesHolder ofFloat(Property<?, Float> property, float... fArr) {
    }

    public static PropertyValuesHolder ofInt(Property<?, Integer> property, int... iArr) {
    }

    public PropertyValuesHolder clone() {
    }

    private PropertyValuesHolder(String str) {
    }

    public static <V> PropertyValuesHolder ofObject(Property property, TypeEvaluator<V> typeEvaluator, V... vArr) {
    }

    public static PropertyValuesHolder ofKeyframe(Property property, Keyframe... keyframeArr) {
    }

    private PropertyValuesHolder(Property property) {
    }
}
