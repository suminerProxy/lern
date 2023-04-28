package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SubtitleView extends FrameLayout implements TextOutput {
    public static final float DEFAULT_BOTTOM_PADDING_FRACTION = 0.08f;
    public static final float DEFAULT_TEXT_SIZE_FRACTION = 0.0533f;
    public static final int VIEW_TYPE_CANVAS = 1;
    public static final int VIEW_TYPE_WEB = 2;
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private float bottomPaddingFraction;
    private List<Cue> cues;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private View innerSubtitleView;
    private Output output;
    private CaptionStyleCompat style;
    private int viewType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Output {
        void update(List<Cue> cues, CaptionStyleCompat style, float defaultTextSize, int defaultTextSizeType, float bottomPaddingFraction);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface ViewType {
    }

    public SubtitleView(Context context) {
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
    }

    private float getUserCaptionFontScale() {
    }

    private CaptionStyleCompat getUserCaptionStyle() {
    }

    private Cue removeEmbeddedStyling(Cue cue) {
    }

    private void setTextSize(int textSizeType, float textSize) {
    }

    private <T extends View & Output> void setView(T view) {
    }

    private void updateOutput() {
    }

    @Override // com.google.android.exoplayer2.text.TextOutput
    public void onCues(List<Cue> cues) {
    }

    public void setApplyEmbeddedFontSizes(boolean applyEmbeddedFontSizes) {
    }

    public void setApplyEmbeddedStyles(boolean applyEmbeddedStyles) {
    }

    public void setBottomPaddingFraction(float bottomPaddingFraction) {
    }

    public void setCues(@Nullable List<Cue> cues) {
    }

    public void setFixedTextSize(@Dimension int unit, float size) {
    }

    public void setFractionalTextSize(float fractionOfHeight) {
    }

    public void setStyle(CaptionStyleCompat style) {
    }

    public void setUserDefaultStyle() {
    }

    public void setUserDefaultTextSize() {
    }

    public void setViewType(int viewType) {
    }

    public SubtitleView(Context context, @Nullable AttributeSet attrs) {
    }

    public void setFractionalTextSize(float fractionOfHeight, boolean ignorePadding) {
    }
}
