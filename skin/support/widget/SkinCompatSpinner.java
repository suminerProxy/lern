package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatSpinner;
import skin.support.appcompat.R;
import skin.support.content.res.SkinCompatVectorResources;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatSpinner extends AppCompatSpinner implements SkinCompatSupportable {
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private SkinCompatBackgroundHelper mBackgroundTintHelper;
    private int mPopupBackgroundResId;
    private static final String TAG = SkinCompatSpinner.class.getSimpleName();
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {16843505};

    public SkinCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    private void applyPopupBackground() {
        int checkResourceId = SkinCompatHelper.checkResourceId(this.mPopupBackgroundResId);
        this.mPopupBackgroundResId = checkResourceId;
        if (checkResourceId != 0) {
            setPopupBackgroundDrawable(SkinCompatVectorResources.getDrawableCompat(getContext(), this.mPopupBackgroundResId));
        }
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatBackgroundHelper skinCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (skinCompatBackgroundHelper != null) {
            skinCompatBackgroundHelper.applySkin();
        }
        applyPopupBackground();
    }

    @Override // androidx.appcompat.widget.AppCompatSpinner, android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i2) {
        super.setPopupBackgroundResource(i2);
        this.mPopupBackgroundResId = i2;
        applyPopupBackground();
    }

    public SkinCompatSpinner(Context context, int i2) {
        this(context, null, R.attr.spinnerStyle, i2);
    }

    public SkinCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public SkinCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public SkinCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SkinCompatSpinner(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8, android.content.res.Resources.Theme r9) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7, r8, r9)
            r9 = 0
            r4.mPopupBackgroundResId = r9
            int[] r0 = skin.support.appcompat.R.styleable.Spinner
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r7, r9)
            android.content.Context r1 = r4.getPopupContext()
            if (r1 == 0) goto L55
            r1 = -1
            r2 = 1
            if (r8 != r1) goto L3e
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r1 < r3) goto L3d
            r1 = 0
            int[] r3 = skin.support.widget.SkinCompatSpinner.ATTRS_ANDROID_SPINNERMODE     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L3a
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r3, r7, r9)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L3a
            boolean r5 = r1.hasValue(r9)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L3a
            if (r5 == 0) goto L2d
            int r8 = r1.getInt(r9, r9)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L3a
        L2d:
            if (r1 == 0) goto L3e
        L2f:
            r1.recycle()
            goto L3e
        L33:
            r5 = move-exception
            if (r1 == 0) goto L39
            r1.recycle()
        L39:
            throw r5
        L3a:
            if (r1 == 0) goto L3e
            goto L2f
        L3d:
            r8 = r2
        L3e:
            if (r8 != r2) goto L55
            android.content.Context r5 = r4.getPopupContext()
            int[] r8 = skin.support.appcompat.R.styleable.Spinner
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r8, r7, r9)
            int r8 = skin.support.appcompat.R.styleable.Spinner_android_popupBackground
            int r8 = r5.getResourceId(r8, r9)
            r4.mPopupBackgroundResId = r8
            r5.recycle()
        L55:
            r0.recycle()
            skin.support.widget.SkinCompatBackgroundHelper r5 = new skin.support.widget.SkinCompatBackgroundHelper
            r5.<init>(r4)
            r4.mBackgroundTintHelper = r5
            r5.loadFromAttributes(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: skin.support.widget.SkinCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
