package skin.support.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import skin.support.appcompat.R;
import skin.support.content.res.SkinCompatVectorResources;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatMultiAutoCompleteTextView extends AppCompatMultiAutoCompleteTextView implements SkinCompatSupportable {
    private static final int[] TINT_ATTRS = {16843126};
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mDropDownBackgroundResId;
    private SkinCompatTextHelper mTextHelper;

    public SkinCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    private void applyDropDownBackgroundResource() {
        Drawable drawableCompat;
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mDropDownBackgroundResId);
        this.mDropDownBackgroundResId = checkResourceId;
        if (checkResourceId == 0 || (drawableCompat = SkinCompatVectorResources.getDrawableCompat(getContext(), this.mDropDownBackgroundResId)) == null) {
            return;
        }
        setDropDownBackgroundDrawable(drawableCompat);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.applySkin();
        }
        applyDropDownBackgroundResource();
    }

    @Override // androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView, android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.onSetBackgroundResource(i2);
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

    @Override // androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView, android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i2) {
        super.setDropDownBackgroundResource(i2);
        this.mDropDownBackgroundResId = i2;
        applyDropDownBackgroundResource();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public SkinCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        SkinCompatTextHelper skinCompatTextHelper = this.mTextHelper;
        if (skinCompatTextHelper != null) {
            skinCompatTextHelper.onSetTextAppearance(context, i2);
        }
    }

    public SkinCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mDropDownBackgroundResId = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TINT_ATTRS, i2, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.mDropDownBackgroundResId = obtainStyledAttributes.getResourceId(0, 0);
        }
        obtainStyledAttributes.recycle();
        applyDropDownBackgroundResource();
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = new SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i2);
        SkinCompatTextHelper create = SkinCompatTextHelper.create(this);
        this.mTextHelper = create;
        create.loadFromAttributes(attributeSet, i2);
    }
}
