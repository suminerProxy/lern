package skin.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import skin.support.content.res.SkinCompatVectorResources;
import skin.support.design.R;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinMaterialCollapsingToolbarLayout extends CollapsingToolbarLayout implements SkinCompatSupportable {
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mContentScrimResId;
    private int mStatusBarScrimResId;

    public SkinMaterialCollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    private void applyContentScrimResource() {
        Drawable drawableCompat;
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mContentScrimResId);
        this.mContentScrimResId = checkResourceId;
        if (checkResourceId == 0 || (drawableCompat = SkinCompatVectorResources.getDrawableCompat(getContext(), this.mContentScrimResId)) == null) {
            return;
        }
        setContentScrim(drawableCompat);
    }

    private void applyStatusBarScrimResource() {
        Drawable drawableCompat;
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mStatusBarScrimResId);
        this.mStatusBarScrimResId = checkResourceId;
        if (checkResourceId == 0 || (drawableCompat = SkinCompatVectorResources.getDrawableCompat(getContext(), this.mStatusBarScrimResId)) == null) {
            return;
        }
        setStatusBarScrim(drawableCompat);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        applyContentScrimResource();
        applyStatusBarScrimResource();
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
    }

    public SkinMaterialCollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialCollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mContentScrimResId = 0;
        this.mStatusBarScrimResId = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout, i2, R.style.Widget_Design_CollapsingToolbar);
        this.mContentScrimResId = obtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_contentScrim, 0);
        this.mStatusBarScrimResId = obtainStyledAttributes.getResourceId(R.styleable.CollapsingToolbarLayout_statusBarScrim, 0);
        obtainStyledAttributes.recycle();
        applyContentScrimResource();
        applyStatusBarScrimResource();
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = new SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, 0);
    }
}
