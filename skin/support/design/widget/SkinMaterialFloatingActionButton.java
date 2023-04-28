package skin.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import skin.support.content.res.SkinCompatResources;
import skin.support.design.R;
import skin.support.widget.SkinCompatHelper;
import skin.support.widget.SkinCompatImageHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinMaterialFloatingActionButton extends FloatingActionButton implements SkinCompatSupportable {
    private int mBackgroundTintResId;
    private SkinCompatImageHelper mImageHelper;
    private int mRippleColorResId;

    public SkinMaterialFloatingActionButton(Context context) {
        this(context, null);
    }

    private void applyBackgroundTintResource() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mBackgroundTintResId);
        this.mBackgroundTintResId = checkResourceId;
        if (checkResourceId != 0) {
            setBackgroundTintList(SkinCompatResources.getColorStateList(getContext(), this.mBackgroundTintResId));
        }
    }

    private void applyRippleColorResource() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mRippleColorResId);
        this.mRippleColorResId = checkResourceId;
        if (checkResourceId != 0) {
            setRippleColor(SkinCompatResources.getColor(getContext(), this.mRippleColorResId));
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        applyBackgroundTintResource();
        applyRippleColorResource();
        SkinCompatImageHelper skinCompatImageHelper = this.mImageHelper;
        if (skinCompatImageHelper != null) {
            skinCompatImageHelper.applySkin();
        }
    }

    public SkinMaterialFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialFloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mRippleColorResId = 0;
        this.mBackgroundTintResId = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton, i2, R.style.Widget_Design_FloatingActionButton);
        this.mBackgroundTintResId = obtainStyledAttributes.getResourceId(R.styleable.FloatingActionButton_backgroundTint, 0);
        this.mRippleColorResId = obtainStyledAttributes.getResourceId(R.styleable.FloatingActionButton_rippleColor, 0);
        obtainStyledAttributes.recycle();
        applyBackgroundTintResource();
        applyRippleColorResource();
        SkinCompatImageHelper skinCompatImageHelper = new SkinCompatImageHelper(this);
        this.mImageHelper = skinCompatImageHelper;
        skinCompatImageHelper.loadFromAttributes(attributeSet, i2);
    }
}
