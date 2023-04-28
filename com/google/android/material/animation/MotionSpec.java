package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MotionSpec {
    private static final String TAG = "MotionSpec";
    private final SimpleArrayMap<String, PropertyValuesHolder[]> propertyValues;
    private final SimpleArrayMap<String, MotionTiming> timings;

    private static void addInfoFromAnimator(@NonNull MotionSpec motionSpec, Animator animator) {
    }

    @NonNull
    private PropertyValuesHolder[] clonePropertyValuesHolder(@NonNull PropertyValuesHolder[] propertyValuesHolderArr) {
    }

    @Nullable
    public static MotionSpec createFromAttribute(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i2) {
    }

    @Nullable
    public static MotionSpec createFromResource(@NonNull Context context, @AnimatorRes int i2) {
    }

    @NonNull
    private static MotionSpec createSpecFromAnimators(@NonNull List<Animator> list) {
    }

    public boolean equals(Object obj) {
    }

    @NonNull
    public <T> ObjectAnimator getAnimator(@NonNull String str, @NonNull T t, @NonNull Property<T, ?> property) {
    }

    @NonNull
    public PropertyValuesHolder[] getPropertyValues(String str) {
    }

    public MotionTiming getTiming(String str) {
    }

    public long getTotalDuration() {
    }

    public boolean hasPropertyValues(String str) {
    }

    public boolean hasTiming(String str) {
    }

    public int hashCode() {
    }

    public void setPropertyValues(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
    }

    public void setTiming(String str, @Nullable MotionTiming motionTiming) {
    }

    @NonNull
    public String toString() {
    }
}
