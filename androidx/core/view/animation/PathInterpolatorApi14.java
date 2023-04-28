package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;
    private final float[] mX;
    private final float[] mY;

    public PathInterpolatorApi14(Path path) {
    }

    private static Path createCubic(float f2, float f3, float f4, float f5) {
    }

    private static Path createQuad(float f2, float f3) {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
    }

    public PathInterpolatorApi14(float f2, float f3) {
    }

    public PathInterpolatorApi14(float f2, float f3, float f4, float f5) {
    }
}
