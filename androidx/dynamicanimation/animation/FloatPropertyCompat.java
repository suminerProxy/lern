package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class FloatPropertyCompat<T> {
    public final String mPropertyName;

    /* renamed from: androidx.dynamicanimation.animation.FloatPropertyCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 extends FloatPropertyCompat<T> {
        public final /* synthetic */ FloatProperty val$property;

        public AnonymousClass1(String str, FloatProperty floatProperty) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(T t) {
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(T t, float f2) {
        }
    }

    public FloatPropertyCompat(String str) {
    }

    @RequiresApi(24)
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f2);
}
