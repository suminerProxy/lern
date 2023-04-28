package skin.support.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import skin.support.appcompat.R;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatSeekBar extends AppCompatSeekBar implements SkinCompatSupportable {
    private SkinCompatSeekBarHelper mSkinCompatSeekBarHelper;

    public SkinCompatSeekBar(Context context) {
        this(context, null);
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
        SkinCompatSeekBarHelper skinCompatSeekBarHelper = this.mSkinCompatSeekBarHelper;
        if (skinCompatSeekBarHelper != null) {
            skinCompatSeekBarHelper.applySkin();
        }
    }

    public SkinCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public SkinCompatSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        SkinCompatSeekBarHelper skinCompatSeekBarHelper = new SkinCompatSeekBarHelper(this);
        this.mSkinCompatSeekBarHelper = skinCompatSeekBarHelper;
        skinCompatSeekBarHelper.loadFromAttributes(attributeSet, i2);
    }
}
