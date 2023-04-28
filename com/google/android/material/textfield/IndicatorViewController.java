package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class IndicatorViewController {
    private static final int CAPTION_OPACITY_FADE_ANIMATION_DURATION = 167;
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    private static final int CAPTION_TRANSLATE_Y_ANIMATION_DURATION = 217;
    public static final int COUNTER_INDEX = 2;
    public static final int ERROR_INDEX = 0;
    public static final int HELPER_INDEX = 1;
    @Nullable
    private Animator captionAnimator;
    private FrameLayout captionArea;
    private int captionDisplayed;
    private int captionToShow;
    private final float captionTranslationYPx;
    private final Context context;
    private boolean errorEnabled;
    @Nullable
    private CharSequence errorText;
    private int errorTextAppearance;
    @Nullable
    private TextView errorView;
    @Nullable
    private CharSequence errorViewContentDescription;
    @Nullable
    private ColorStateList errorViewTextColor;
    private CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    @Nullable
    private TextView helperTextView;
    @Nullable
    private ColorStateList helperTextViewTextColor;
    private LinearLayout indicatorArea;
    private int indicatorsAdded;
    @NonNull
    private final TextInputLayout textInputView;
    private Typeface typeface;

    /* renamed from: com.google.android.material.textfield.IndicatorViewController$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        public final /* synthetic */ IndicatorViewController this$0;
        public final /* synthetic */ int val$captionToHide;
        public final /* synthetic */ int val$captionToShow;
        public final /* synthetic */ TextView val$captionViewToHide;
        public final /* synthetic */ TextView val$captionViewToShow;

        public AnonymousClass1(IndicatorViewController indicatorViewController, int i2, TextView textView, int i3, TextView textView2) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public IndicatorViewController(@NonNull TextInputLayout textInputLayout) {
    }

    public static /* synthetic */ int access$002(IndicatorViewController indicatorViewController, int i2) {
    }

    public static /* synthetic */ Animator access$102(IndicatorViewController indicatorViewController, Animator animator) {
    }

    public static /* synthetic */ TextView access$200(IndicatorViewController indicatorViewController) {
    }

    private boolean canAdjustIndicatorPadding() {
    }

    private void createCaptionAnimators(@NonNull List<Animator> list, boolean z, @Nullable TextView textView, int i2, int i3, int i4) {
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean z) {
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
    }

    @Nullable
    private TextView getCaptionViewFromDisplayState(int i2) {
    }

    private int getIndicatorPadding(boolean z, @DimenRes int i2, int i3) {
    }

    private boolean isCaptionStateError(int i2) {
    }

    private boolean isCaptionStateHelperText(int i2) {
    }

    private void setCaptionViewVisibilities(int i2, int i3) {
    }

    private void setTextViewTypeface(@Nullable TextView textView, Typeface typeface) {
    }

    private void setViewGroupGoneIfEmpty(@NonNull ViewGroup viewGroup, int i2) {
    }

    private boolean shouldAnimateCaptionView(@Nullable TextView textView, @Nullable CharSequence charSequence) {
    }

    private void updateCaptionViewsVisibility(int i2, int i3, boolean z) {
    }

    public void addIndicator(TextView textView, int i2) {
    }

    public void adjustIndicatorPadding() {
    }

    public void cancelCaptionAnimator() {
    }

    public boolean errorIsDisplayed() {
    }

    public boolean errorShouldBeShown() {
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
    }

    @Nullable
    public CharSequence getErrorText() {
    }

    @ColorInt
    public int getErrorViewCurrentTextColor() {
    }

    @Nullable
    public ColorStateList getErrorViewTextColors() {
    }

    public CharSequence getHelperText() {
    }

    @Nullable
    public ColorStateList getHelperTextViewColors() {
    }

    @ColorInt
    public int getHelperTextViewCurrentTextColor() {
    }

    public boolean helperTextIsDisplayed() {
    }

    public boolean helperTextShouldBeShown() {
    }

    public void hideError() {
    }

    public void hideHelperText() {
    }

    public boolean isCaptionView(int i2) {
    }

    public boolean isErrorEnabled() {
    }

    public boolean isHelperTextEnabled() {
    }

    public void removeIndicator(TextView textView, int i2) {
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
    }

    public void setErrorEnabled(boolean z) {
    }

    public void setErrorTextAppearance(@StyleRes int i2) {
    }

    public void setErrorViewTextColor(@Nullable ColorStateList colorStateList) {
    }

    public void setHelperTextAppearance(@StyleRes int i2) {
    }

    public void setHelperTextEnabled(boolean z) {
    }

    public void setHelperTextViewTextColor(@Nullable ColorStateList colorStateList) {
    }

    public void setTypefaces(Typeface typeface) {
    }

    public void showError(CharSequence charSequence) {
    }

    public void showHelper(CharSequence charSequence) {
    }
}
