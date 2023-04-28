package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AppCompatImageHelper {
    private TintInfo mImageTint;
    private TintInfo mInternalImageTint;
    private TintInfo mTmpInfo;
    @NonNull
    private final ImageView mView;

    public AppCompatImageHelper(@NonNull ImageView imageView) {
    }

    private boolean applyFrameworkTintUsingColorFilter(@NonNull Drawable drawable) {
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
    }

    public void applySupportImageTint() {
    }

    public ColorStateList getSupportImageTintList() {
    }

    public PorterDuff.Mode getSupportImageTintMode() {
    }

    public boolean hasOverlappingRendering() {
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i2) {
    }

    public void setImageResource(int i2) {
    }

    public void setInternalImageTint(ColorStateList colorStateList) {
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
    }
}
