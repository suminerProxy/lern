package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    private boolean mHasTickMarkTint;
    private boolean mHasTickMarkTintMode;
    private Drawable mTickMark;
    private ColorStateList mTickMarkTintList;
    private PorterDuff.Mode mTickMarkTintMode;
    private final SeekBar mView;

    public AppCompatSeekBarHelper(SeekBar seekBar) {
    }

    private void applyTickMarkTint() {
    }

    public void drawTickMarks(Canvas canvas) {
    }

    public void drawableStateChanged() {
    }

    @Nullable
    public Drawable getTickMark() {
    }

    @Nullable
    public ColorStateList getTickMarkTintList() {
    }

    @Nullable
    public PorterDuff.Mode getTickMarkTintMode() {
    }

    public void jumpDrawablesToCurrentState() {
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    public void loadFromAttributes(AttributeSet attributeSet, int i2) {
    }

    public void setTickMark(@Nullable Drawable drawable) {
    }

    public void setTickMarkTintList(@Nullable ColorStateList colorStateList) {
    }

    public void setTickMarkTintMode(@Nullable PorterDuff.Mode mode) {
    }
}
