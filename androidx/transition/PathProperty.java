package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PathProperty<T> extends Property<T, Float> {
    private float mCurrentFraction;
    private final float mPathLength;
    private final PathMeasure mPathMeasure;
    private final PointF mPointF;
    private final float[] mPosition;
    private final Property<T, PointF> mProperty;

    public PathProperty(Property<T, PointF> property, Path path) {
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Float get(Object obj) {
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Float f2) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t) {
    }

    /* renamed from: set  reason: avoid collision after fix types in other method */
    public void set2(T t, Float f2) {
    }
}
