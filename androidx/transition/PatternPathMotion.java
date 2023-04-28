package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class PatternPathMotion extends PathMotion {
    private Path mOriginalPatternPath;
    private final Path mPatternPath;
    private final Matrix mTempMatrix;

    public PatternPathMotion() {
    }

    private static float distance(float f2, float f3) {
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f2, float f3, float f4, float f5) {
    }

    public Path getPatternPath() {
    }

    public void setPatternPath(Path path) {
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
    }

    public PatternPathMotion(Path path) {
    }
}
