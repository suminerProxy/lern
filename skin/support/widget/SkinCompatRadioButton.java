package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatRadioButton;
import skin.support.appcompat.R;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatRadioButton extends AppCompatRadioButton implements SkinCompatSupportable {
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private SkinCompatCompoundButtonHelper mCompoundButtonHelper;
    private SkinCompatTextHelper mTextHelper;

    public SkinCompatRadioButton(Context context) {
        this(context, null);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        SkinCompatCompoundButtonHelper skinCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (skinCompatCompoundButtonHelper != null) {
            skinCompatCompoundButtonHelper.applySkin();
        }
        SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.applySkin();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatRadioButton, android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.onSetBackgroundResource(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatRadioButton, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i2) {
        super.setButtonDrawable(i2);
        SkinCompatCompoundButtonHelper skinCompatCompoundButtonHelper = this.mCompoundButtonHelper;
        if (skinCompatCompoundButtonHelper != null) {
            skinCompatCompoundButtonHelper.setButtonDrawable(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4, @DrawableRes int i5) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.onSetCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@DrawableRes int i2, @DrawableRes int i3, @DrawableRes int i4, @DrawableRes int i5) {
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.onSetCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public SkinCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.onSetTextAppearance(context, i2);
        }
    }

    public SkinCompatRadioButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        SkinCompatCompoundButtonHelper skinCompatCompoundButtonHelper = new SkinCompatCompoundButtonHelper(this);
        this.mCompoundButtonHelper = skinCompatCompoundButtonHelper;
        skinCompatCompoundButtonHelper.loadFromAttributes(attributeSet, i2);
        SkinCompatTextHelper create = SkinCompatTextHelper.create(this);
        this.mTextHelper = create;
        create.loadFromAttributes(attributeSet, i2);
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = new SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i2);
    }
}
