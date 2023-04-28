package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DrawableAlphaProperty extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> DRAWABLE_ALPHA_COMPAT = null;
    private final WeakHashMap<Drawable, Integer> alphaCache;

    private DrawableAlphaProperty() {
    }

    @Override // android.util.Property
    @Nullable
    public /* bridge */ /* synthetic */ Integer get(@NonNull Drawable drawable) {
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(@NonNull Drawable drawable, @NonNull Integer num) {
    }

    @Nullable
    /* renamed from: get  reason: avoid collision after fix types in other method */
    public Integer get2(@NonNull Drawable drawable) {
    }

    /* renamed from: set  reason: avoid collision after fix types in other method */
    public void set2(@NonNull Drawable drawable, @NonNull Integer num) {
    }
}
