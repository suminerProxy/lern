package skin.support.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import skin.support.cardview.R;
import skin.support.content.res.SkinCompatResources;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatCardView extends CardView implements SkinCompatSupportable {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private int mBackgroundColorResId;
    private int mThemeColorBackgroundResId;

    public SkinCompatCardView(Context context) {
        this(context, null);
    }

    private void applyBackgroundColorResource() {
        int color;
        this.mBackgroundColorResId = SkinCompatHelper.checkResourceId(this.mBackgroundColorResId);
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mThemeColorBackgroundResId);
        this.mThemeColorBackgroundResId = checkResourceId;
        if (this.mBackgroundColorResId != 0) {
            setCardBackgroundColor(SkinCompatResources.getColorStateList(getContext(), this.mBackgroundColorResId));
        } else if (checkResourceId != 0) {
            float[] fArr = new float[3];
            Color.colorToHSV(SkinCompatResources.getColor(getContext(), this.mThemeColorBackgroundResId), fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            setCardBackgroundColor(ColorStateList.valueOf(color));
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        applyBackgroundColorResource();
    }

    public SkinCompatCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SkinCompatCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mThemeColorBackgroundResId = 0;
        this.mBackgroundColorResId = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardView, i2, R.style.CardView);
        int i3 = R.styleable.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mBackgroundColorResId = obtainStyledAttributes.getResourceId(i3, 0);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            this.mThemeColorBackgroundResId = obtainStyledAttributes2.getResourceId(0, 0);
            obtainStyledAttributes2.recycle();
        }
        obtainStyledAttributes.recycle();
        applyBackgroundColorResource();
    }
}
