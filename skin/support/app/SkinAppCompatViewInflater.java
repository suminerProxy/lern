package skin.support.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.core.view.ViewCompat;
import skin.support.appcompat.R;
import skin.support.content.res.SkinCompatVectorResources;
import skin.support.utils.Slog;
import skin.support.widget.SkinCompatAutoCompleteTextView;
import skin.support.widget.SkinCompatButton;
import skin.support.widget.SkinCompatCheckBox;
import skin.support.widget.SkinCompatCheckedTextView;
import skin.support.widget.SkinCompatEditText;
import skin.support.widget.SkinCompatFrameLayout;
import skin.support.widget.SkinCompatImageButton;
import skin.support.widget.SkinCompatImageView;
import skin.support.widget.SkinCompatLinearLayout;
import skin.support.widget.SkinCompatMultiAutoCompleteTextView;
import skin.support.widget.SkinCompatProgressBar;
import skin.support.widget.SkinCompatRadioButton;
import skin.support.widget.SkinCompatRadioGroup;
import skin.support.widget.SkinCompatRatingBar;
import skin.support.widget.SkinCompatRelativeLayout;
import skin.support.widget.SkinCompatScrollView;
import skin.support.widget.SkinCompatSeekBar;
import skin.support.widget.SkinCompatSpinner;
import skin.support.widget.SkinCompatTextView;
import skin.support.widget.SkinCompatToolbar;
import skin.support.widget.SkinCompatView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinAppCompatViewInflater implements SkinLayoutInflater, SkinWrapper {
    private static final String LOG_TAG = "SkinAppCompatViewInflater";

    public SkinAppCompatViewInflater() {
        SkinCompatVectorResources.getInstance();
    }

    private View createViewFromFV(Context context, String str, AttributeSet attributeSet) {
        if (str.contains(".")) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1495589242:
                if (str.equals("ProgressBar")) {
                    c = 1;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 3;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 4;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 6;
                    break;
                }
                break;
            case -443652810:
                if (str.equals("RelativeLayout")) {
                    c = 7;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = '\b';
                    break;
                }
                break;
            case 2666181:
                if (str.equals("View")) {
                    c = '\t';
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = '\n';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 11;
                    break;
                }
                break;
            case 1127291599:
                if (str.equals("LinearLayout")) {
                    c = '\f';
                    break;
                }
                break;
            case 1310765783:
                if (str.equals("FrameLayout")) {
                    c = '\r';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 14;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 15;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 16;
                    break;
                }
                break;
            case 1969230692:
                if (str.equals("RadioGroup")) {
                    c = 17;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 18;
                    break;
                }
                break;
            case 2059813682:
                if (str.equals("ScrollView")) {
                    c = 19;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new SkinCompatRatingBar(context, attributeSet);
            case 1:
                return new SkinCompatProgressBar(context, attributeSet);
            case 2:
                return new SkinCompatCheckedTextView(context, attributeSet);
            case 3:
                return new SkinCompatMultiAutoCompleteTextView(context, attributeSet);
            case 4:
                return new SkinCompatTextView(context, attributeSet);
            case 5:
                return new SkinCompatImageButton(context, attributeSet);
            case 6:
                return new SkinCompatSeekBar(context, attributeSet);
            case 7:
                return new SkinCompatRelativeLayout(context, attributeSet);
            case '\b':
                return new SkinCompatSpinner(context, attributeSet);
            case '\t':
                return new SkinCompatView(context, attributeSet);
            case '\n':
                return new SkinCompatRadioButton(context, attributeSet);
            case 11:
                return new SkinCompatImageView(context, attributeSet);
            case '\f':
                return new SkinCompatLinearLayout(context, attributeSet);
            case '\r':
                return new SkinCompatFrameLayout(context, attributeSet);
            case 14:
                return new SkinCompatAutoCompleteTextView(context, attributeSet);
            case 15:
                return new SkinCompatCheckBox(context, attributeSet);
            case 16:
                return new SkinCompatEditText(context, attributeSet);
            case 17:
                return new SkinCompatRadioGroup(context, attributeSet);
            case 18:
                return new SkinCompatButton(context, attributeSet);
            case 19:
                return new SkinCompatScrollView(context, attributeSet);
            default:
                return null;
        }
    }

    private View createViewFromV7(Context context, String str, AttributeSet attributeSet) {
        str.hashCode();
        if (str.equals("androidx.appcompat.widget.Toolbar")) {
            return new SkinCompatToolbar(context, attributeSet);
        }
        return null;
    }

    private boolean shouldInheritContext(Context context, ViewParent viewParent) {
        if (viewParent != null && (context instanceof Activity)) {
            View decorView = ((Activity) context).getWindow().getDecorView();
            while (viewParent != null) {
                if (viewParent != decorView && (viewParent instanceof View) && !ViewCompat.isAttachedToWindow((View) viewParent)) {
                    viewParent = viewParent.getParent();
                }
            }
            return true;
        }
        return false;
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(R.styleable.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(R.styleable.View_theme, 0)) != 0) {
            Slog.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == resourceId) ? context : new ContextThemeWrapper(context, resourceId) : context;
    }

    @Override // skin.support.app.SkinLayoutInflater
    public View createView(Context context, String str, AttributeSet attributeSet) {
        View createViewFromFV = createViewFromFV(context, str, attributeSet);
        return createViewFromFV == null ? createViewFromV7(context, str, attributeSet) : createViewFromFV;
    }

    @Override // skin.support.app.SkinWrapper
    public Context wrapContext(Context context, View view, AttributeSet attributeSet) {
        boolean z = false;
        boolean z2 = Build.VERSION.SDK_INT < 21;
        if (z2 && shouldInheritContext(context, (ViewParent) view)) {
            z = true;
        }
        if (z && view != null) {
            context = view.getContext();
        }
        boolean shouldBeUsed = VectorEnabledTintResources.shouldBeUsed();
        if (z && view != null) {
            context = view.getContext();
        }
        Context themifyContext = themifyContext(context, attributeSet, z2, true);
        return shouldBeUsed ? TintContextWrapper.wrap(themifyContext) : themifyContext;
    }
}
