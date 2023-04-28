package skin.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.StyleRes;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import skin.support.content.res.SkinCompatResources;
import skin.support.design.R;
import skin.support.widget.SkinCompatBackgroundHelper;
import skin.support.widget.SkinCompatEditText;
import skin.support.widget.SkinCompatHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinMaterialTextInputLayout extends TextInputLayout implements SkinCompatSupportable {
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mCounterTextColorResId;
    private int mDefaultTextColorResId;
    private int mErrorTextColorResId;
    private int mFocusedTextColorResId;
    private int mPasswordToggleResId;

    public SkinMaterialTextInputLayout(Context context) {
        this(context, null);
    }

    private void applyCounterTextColorResource() {
        TextView counterView;
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mCounterTextColorResId);
        this.mCounterTextColorResId = checkResourceId;
        if (checkResourceId == 0 || (counterView = getCounterView()) == null) {
            return;
        }
        counterView.setTextColor(SkinCompatResources.getColor(getContext(), this.mCounterTextColorResId));
        updateEditTextBackgroundInternal();
    }

    private void applyErrorTextColorResource() {
        TextView errorView;
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mErrorTextColorResId);
        this.mErrorTextColorResId = checkResourceId;
        if (checkResourceId == 0 || checkResourceId == R.color.design_error || (errorView = getErrorView()) == null) {
            return;
        }
        errorView.setTextColor(SkinCompatResources.getColor(getContext(), this.mErrorTextColorResId));
        updateEditTextBackgroundInternal();
    }

    private void applyFocusedTextColorResource() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mFocusedTextColorResId);
        this.mFocusedTextColorResId = checkResourceId;
        if (checkResourceId != 0 && checkResourceId != R.color.abc_hint_foreground_material_light) {
            setFocusedTextColor(SkinCompatResources.getColorStateList(getContext(), this.mFocusedTextColorResId));
        } else if (getEditText() != null) {
            int i2 = 0;
            if (getEditText() instanceof SkinCompatEditText) {
                i2 = ((SkinCompatEditText) getEditText()).getTextColorResId();
            } else if (getEditText() instanceof SkinMaterialTextInputEditText) {
                i2 = ((SkinMaterialTextInputEditText) getEditText()).getTextColorResId();
            }
            int checkResourceId2 = SkinCompatHelper.checkResourceId(i2);
            if (checkResourceId2 != 0) {
                setFocusedTextColor(SkinCompatResources.getColorStateList(getContext(), checkResourceId2));
            }
        }
    }

    private TextView getCounterView() {
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("mCounterView");
            declaredField.setAccessible(true);
            return (TextView) declaredField.get(this);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private TextView getErrorView() {
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("mErrorView");
            declaredField.setAccessible(true);
            return (TextView) declaredField.get(this);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void loadCounterTextColorResFromAttributes(@StyleRes int i2) {
        if (i2 != 0) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i2, skin.support.R.styleable.SkinTextAppearance);
            int i3 = skin.support.R.styleable.SkinTextAppearance_android_textColor;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.mCounterTextColorResId = obtainStyledAttributes.getResourceId(i3, 0);
            }
            obtainStyledAttributes.recycle();
        }
        applyCounterTextColorResource();
    }

    private void loadErrorTextColorResFromAttributes(@StyleRes int i2) {
        if (i2 != 0) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i2, skin.support.R.styleable.SkinTextAppearance);
            int i3 = skin.support.R.styleable.SkinTextAppearance_android_textColor;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.mErrorTextColorResId = obtainStyledAttributes.getResourceId(i3, 0);
            }
            obtainStyledAttributes.recycle();
        }
        applyErrorTextColorResource();
    }

    private void setDefaultTextColor(ColorStateList colorStateList) {
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
            declaredField.setAccessible(true);
            declaredField.set(this, colorStateList);
            updateLabelState();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void setFocusedTextColor(ColorStateList colorStateList) {
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
            declaredField.setAccessible(true);
            declaredField.set(this, colorStateList);
            updateLabelState();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void updateEditTextBackgroundInternal() {
        try {
            Method declaredMethod = TextInputLayout.class.getDeclaredMethod("updateEditTextBackground", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void updateLabelState() {
        try {
            Method declaredMethod = TextInputLayout.class.getDeclaredMethod("updateLabelState", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, Boolean.FALSE);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        applyErrorTextColorResource();
        applyCounterTextColorResource();
        applyFocusedTextColorResource();
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setCounterEnabled(boolean z) {
        super.setCounterEnabled(z);
        if (z) {
            applyCounterTextColorResource();
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setErrorEnabled(boolean z) {
        super.setErrorEnabled(z);
        if (z) {
            applyErrorTextColorResource();
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setErrorTextAppearance(@StyleRes int i2) {
        super.setErrorTextAppearance(i2);
        loadErrorTextColorResFromAttributes(i2);
    }

    public SkinMaterialTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinMaterialTextInputLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mPasswordToggleResId = 0;
        this.mCounterTextColorResId = 0;
        this.mErrorTextColorResId = 0;
        this.mFocusedTextColorResId = 0;
        this.mDefaultTextColorResId = 0;
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = new SkinCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = skinCompatBackgroundHelper;
        skinCompatBackgroundHelper.loadFromAttributes(attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextInputLayout, i2, R.style.Widget_Design_TextInputLayout);
        int i3 = R.styleable.TextInputLayout_android_textColorHint;
        if (obtainStyledAttributes.hasValue(i3)) {
            int resourceId = obtainStyledAttributes.getResourceId(i3, 0);
            this.mFocusedTextColorResId = resourceId;
            this.mDefaultTextColorResId = resourceId;
            applyFocusedTextColorResource();
        }
        loadErrorTextColorResFromAttributes(obtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_errorTextAppearance, 0));
        loadCounterTextColorResFromAttributes(obtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_counterTextAppearance, 0));
        this.mPasswordToggleResId = obtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        obtainStyledAttributes.recycle();
    }
}
