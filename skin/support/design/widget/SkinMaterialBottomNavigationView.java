package skin.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import skin.support.content.res.SkinCompatResources;
import skin.support.design.R;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinMaterialBottomNavigationView extends BottomNavigationView implements SkinCompatSupportable {
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mDefaultTintResId;
    private int mIconTintResId;
    private int mTextColorResId;
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int[] CHECKED_STATE_SET = {16842912};

    public SkinMaterialBottomNavigationView(@NonNull Context context) {
        this(context, null);
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
            setItemTextColor(createDefaultColorStateList(16842808));
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

    private int resolveColorPrimary() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        applyItemIconTintResource();
        applyItemTextColorResource();
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.onSetBackgroundResource(i2);
        }
    }

    public SkinMaterialBottomNavigationView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialBottomNavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mTextColorResId = 0;
        this.mIconTintResId = 0;
        this.mDefaultTintResId = 0;
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = new SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomNavigationView, i2, R.style.Widget_Design_BottomNavigationView);
        int i3 = R.styleable.BottomNavigationView_itemIconTint;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mIconTintResId = obtainStyledAttributes.getResourceId(i3, 0);
        } else {
            this.mDefaultTintResId = resolveColorPrimary();
        }
        int i4 = R.styleable.BottomNavigationView_itemTextColor;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.mTextColorResId = obtainStyledAttributes.getResourceId(i4, 0);
        } else {
            this.mDefaultTintResId = resolveColorPrimary();
        }
        obtainStyledAttributes.recycle();
        applyItemIconTintResource();
        applyItemTextColorResource();
    }
}
