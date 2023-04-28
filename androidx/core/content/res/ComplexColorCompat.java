package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ComplexColorCompat {
    private static final String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final ColorStateList mColorStateList;
    private final Shader mShader;

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, @ColorInt int i2) {
    }

    @NonNull
    private static ComplexColorCompat createFromXml(@NonNull Resources resources, @ColorRes int i2, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
    }

    public static ComplexColorCompat from(@NonNull Shader shader) {
    }

    @Nullable
    public static ComplexColorCompat inflate(@NonNull Resources resources, @ColorRes int i2, @Nullable Resources.Theme theme) {
    }

    @ColorInt
    public int getColor() {
    }

    @Nullable
    public Shader getShader() {
    }

    public boolean isGradient() {
    }

    public boolean isStateful() {
    }

    public boolean onStateChanged(int[] iArr) {
    }

    public void setColor(@ColorInt int i2) {
    }

    public boolean willDraw() {
    }

    public static ComplexColorCompat from(@NonNull ColorStateList colorStateList) {
    }

    public static ComplexColorCompat from(@ColorInt int i2) {
    }
}
