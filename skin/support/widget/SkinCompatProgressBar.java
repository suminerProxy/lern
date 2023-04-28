package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatProgressBar extends ProgressBar implements SkinCompatSupportable {
    private SkinCompatProgressBarHelper mSkinCompatProgressBarHelper;

    public SkinCompatProgressBar(Context context) {
        this(context, null);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatProgressBarHelper skinCompatProgressBarHelper = this.mSkinCompatProgressBarHelper;
        if (skinCompatProgressBarHelper != null) {
            skinCompatProgressBarHelper.applySkin();
        }
    }

    public SkinCompatProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842871);
    }

    public SkinCompatProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        SkinCompatProgressBarHelper skinCompatProgressBarHelper = new SkinCompatProgressBarHelper(this);
        this.mSkinCompatProgressBarHelper = skinCompatProgressBarHelper;
        skinCompatProgressBarHelper.loadFromAttributes(attributeSet, i2);
    }
}
