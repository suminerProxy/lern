package skin.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import skin.support.content.res.SkinCompatResources;
import skin.support.design.R;
import skin.support.widget.SkinCompatHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinMaterialTabLayout extends TabLayout implements SkinCompatSupportable {
    private int mTabIndicatorColorResId;
    private int mTabSelectedTextColorResId;
    private int mTabTextColorsResId;

    public SkinMaterialTabLayout(Context context) {
        this(context, null);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mTabIndicatorColorResId);
        this.mTabIndicatorColorResId = checkResourceId;
        if (checkResourceId != 0) {
            setSelectedTabIndicatorColor(SkinCompatResources.getColor(getContext(), this.mTabIndicatorColorResId));
        }
        int checkResourceId2 = SkinCompatHelper.checkResourceId(this.mTabTextColorsResId);
        this.mTabTextColorsResId = checkResourceId2;
        if (checkResourceId2 != 0) {
            setTabTextColors(SkinCompatResources.getColorStateList(getContext(), this.mTabTextColorsResId));
        }
        int checkResourceId3 = SkinCompatHelper.checkResourceId(this.mTabSelectedTextColorResId);
        this.mTabSelectedTextColorResId = checkResourceId3;
        if (checkResourceId3 != 0) {
            int color = SkinCompatResources.getColor(getContext(), this.mTabSelectedTextColorResId);
            if (getTabTextColors() != null) {
                setTabTextColors(getTabTextColors().getDefaultColor(), color);
            }
        }
    }

    public SkinMaterialTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mTabIndicatorColorResId = 0;
        this.mTabTextColorsResId = 0;
        this.mTabSelectedTextColorResId = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TabLayout, i2, 0);
        this.mTabIndicatorColorResId = obtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabIndicatorColor, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(obtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab), R.styleable.SkinTextAppearance);
        try {
            this.mTabTextColorsResId = obtainStyledAttributes2.getResourceId(R.styleable.SkinTextAppearance_android_textColor, 0);
            obtainStyledAttributes2.recycle();
            int i3 = R.styleable.TabLayout_tabTextColor;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.mTabTextColorsResId = obtainStyledAttributes.getResourceId(i3, 0);
            }
            int i4 = R.styleable.TabLayout_tabSelectedTextColor;
            if (obtainStyledAttributes.hasValue(i4)) {
                this.mTabSelectedTextColorResId = obtainStyledAttributes.getResourceId(i4, 0);
            }
            obtainStyledAttributes.recycle();
            applySkin();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }
}
