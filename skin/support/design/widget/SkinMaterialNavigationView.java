package skin.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.StyleRes;
import com.google.android.material.navigation.NavigationView;
import skin.support.content.res.SkinCompatResources;
import skin.support.content.res.SkinCompatThemeUtils;
import skin.support.content.res.SkinCompatV7ThemeUtils;
import skin.support.content.res.SkinCompatVectorResources;
import skin.support.design.R;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinMaterialNavigationView extends NavigationView implements SkinCompatSupportable {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mDefaultTintResId;
    private int mIconTintResId;
    private int mItemBackgroundResId;
    private int mTextColorResId;

    public SkinMaterialNavigationView(Context context) {
        this(context, null);
    }

    private void applyItemBackgroundResource() {
        Drawable drawableCompat;
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mItemBackgroundResId);
        this.mItemBackgroundResId = checkResourceId;
        if (checkResourceId == 0 || (drawableCompat = SkinCompatVectorResources.getDrawableCompat(getContext(), this.mItemBackgroundResId)) == null) {
            return;
        }
        setItemBackground(drawableCompat);
    }

    private void applyItemIconTintResource() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mIconTintResId);
        this.mIconTintResId = checkResourceId;
        if (checkResourceId != 0) {
            setItemIconTintList(SkinCompatResources.getColorStateList(getContext(), this.mIconTintResId));
            return;
        }
        int checkResourceId2 = SkinCompatHelper.checkResourceId(this.mDefaultTintResId);
        this.mDefaultTintResId = checkResourceId2;
        if (checkResourceId2 != 0) {
            setItemIconTintList(createDefaultColorStateList(16842808));
        }
    }

    private void applyItemTextColorResource() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mTextColorResId);
        this.mTextColorResId = checkResourceId;
        if (checkResourceId != 0) {
            setItemTextColor(SkinCompatResources.getColorStateList(getContext(), this.mTextColorResId));
            return;
        }
        int checkResourceId2 = SkinCompatHelper.checkResourceId(this.mDefaultTintResId);
        this.mDefaultTintResId = checkResourceId2;
        if (checkResourceId2 != 0) {
            setItemTextColor(createDefaultColorStateList(16842806));
        }
    }

    private ColorStateList createDefaultColorStateList(int i2) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            ColorStateList colorStateList = SkinCompatResources.getColorStateList(getContext(), typedValue.resourceId);
            int color = SkinCompatResources.getColor(getContext(), this.mDefaultTintResId);
            int defaultColor = colorStateList.getDefaultColor();
            int[] iArr = DISABLED_STATE_SET;
            return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), color, defaultColor});
        }
        return null;
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        applyItemIconTintResource();
        applyItemTextColorResource();
        applyItemBackgroundResource();
    }

    @Override // com.google.android.material.navigation.NavigationView
    public void setItemBackgroundResource(@DrawableRes int i2) {
        super.setItemBackgroundResource(i2);
        this.mItemBackgroundResId = i2;
        applyItemBackgroundResource();
    }

    @Override // com.google.android.material.navigation.NavigationView
    public void setItemTextAppearance(@StyleRes int i2) {
        super.setItemTextAppearance(i2);
        if (i2 != 0) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i2, R.styleable.SkinTextAppearance);
            int i3 = R.styleable.SkinTextAppearance_android_textColor;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.mTextColorResId = obtainStyledAttributes.getResourceId(i3, 0);
            }
            obtainStyledAttributes.recycle();
            applyItemTextColorResource();
        }
    }

    public SkinMaterialNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialNavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int resourceId;
        this.mItemBackgroundResId = 0;
        this.mTextColorResId = 0;
        this.mDefaultTintResId = 0;
        this.mIconTintResId = 0;
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = new SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NavigationView, i2, R.style.Widget_Design_NavigationView);
        int i3 = R.styleable.NavigationView_itemIconTint;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mIconTintResId = obtainStyledAttributes.getResourceId(i3, 0);
        } else {
            this.mDefaultTintResId = SkinCompatV7ThemeUtils.getColorPrimaryResId(context);
        }
        int i4 = R.styleable.NavigationView_itemTextAppearance;
        if (obtainStyledAttributes.hasValue(i4) && (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, R.styleable.SkinTextAppearance);
            int i5 = R.styleable.SkinTextAppearance_android_textColor;
            if (obtainStyledAttributes2.hasValue(i5)) {
                this.mTextColorResId = obtainStyledAttributes2.getResourceId(i5, 0);
            }
            obtainStyledAttributes2.recycle();
        }
        int i6 = R.styleable.NavigationView_itemTextColor;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.mTextColorResId = obtainStyledAttributes.getResourceId(i6, 0);
        } else {
            this.mDefaultTintResId = SkinCompatV7ThemeUtils.getColorPrimaryResId(context);
        }
        if (this.mTextColorResId == 0) {
            this.mTextColorResId = SkinCompatThemeUtils.getTextColorPrimaryResId(context);
        }
        this.mItemBackgroundResId = obtainStyledAttributes.getResourceId(R.styleable.NavigationView_itemBackground, 0);
        obtainStyledAttributes.recycle();
        applyItemIconTintResource();
        applyItemTextColorResource();
        applyItemBackgroundResource();
    }
}
