package skin.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import skin.support.appcompat.R;
import skin.support.content.res.SkinCompatResources;
import skin.support.content.res.SkinCompatVectorResources;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatToolbar extends Toolbar implements SkinCompatSupportable {
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mNavigationIconResId;
    private int mSubtitleTextColorResId;
    private int mTitleTextColorResId;

    public SkinCompatToolbar(Context context) {
        this(context, null);
    }

    private void applyNavigationIcon() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mNavigationIconResId);
        this.mNavigationIconResId = checkResourceId;
        if (checkResourceId != 0) {
            setNavigationIcon(SkinCompatVectorResources.getDrawableCompat(getContext(), this.mNavigationIconResId));
        }
    }

    private void applySubtitleTextColor() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mSubtitleTextColorResId);
        this.mSubtitleTextColorResId = checkResourceId;
        if (checkResourceId != 0) {
            setSubtitleTextColor(SkinCompatResources.getColor(getContext(), this.mSubtitleTextColorResId));
        }
    }

    private void applyTitleTextColor() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mTitleTextColorResId);
        this.mTitleTextColorResId = checkResourceId;
        if (checkResourceId != 0) {
            setTitleTextColor(SkinCompatResources.getColor(getContext(), this.mTitleTextColorResId));
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        applyTitleTextColor();
        applySubtitleTextColor();
        applyNavigationIcon();
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.onSetBackgroundResource(i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@DrawableRes int i2) {
        super.setNavigationIcon(i2);
        this.mNavigationIconResId = i2;
        applyNavigationIcon();
    }

    public SkinCompatToolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public SkinCompatToolbar(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mTitleTextColorResId = 0;
        this.mSubtitleTextColorResId = 0;
        this.mNavigationIconResId = 0;
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = new SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i2);
        int[] iArr = R.styleable.Toolbar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        this.mNavigationIconResId = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_navigationIcon, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_titleTextAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.Toolbar_subtitleTextAppearance, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, R.styleable.SkinTextAppearance);
            this.mTitleTextColorResId = obtainStyledAttributes2.getResourceId(R.styleable.SkinTextAppearance_android_textColor, 0);
            obtainStyledAttributes2.recycle();
        }
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId2, R.styleable.SkinTextAppearance);
            this.mSubtitleTextColorResId = obtainStyledAttributes3.getResourceId(R.styleable.SkinTextAppearance_android_textColor, 0);
            obtainStyledAttributes3.recycle();
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        int i3 = R.styleable.Toolbar_titleTextColor;
        if (obtainStyledAttributes4.hasValue(i3)) {
            this.mTitleTextColorResId = obtainStyledAttributes4.getResourceId(i3, 0);
        }
        int i4 = R.styleable.Toolbar_subtitleTextColor;
        if (obtainStyledAttributes4.hasValue(i4)) {
            this.mSubtitleTextColorResId = obtainStyledAttributes4.getResourceId(i4, 0);
        }
        obtainStyledAttributes4.recycle();
        applyTitleTextColor();
        applySubtitleTextColor();
        applyNavigationIcon();
    }
}
