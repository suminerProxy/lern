package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class WebvttCssStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    private int backgroundColor;
    private int bold;
    private boolean combineUpright;
    @ColorInt
    private int fontColor;
    @Nullable
    private String fontFamily;
    private float fontSize;
    private int fontSizeUnit;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;
    private int italic;
    private int linethrough;
    private int rubyPosition;
    private Set<String> targetClasses;
    private String targetId;
    private String targetTag;
    private String targetVoice;
    private int underline;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface StyleFlags {
    }

    private static int updateScoreForMatch(int currentScore, String target, @Nullable String actual, int score) {
    }

    public int getBackgroundColor() {
    }

    public boolean getCombineUpright() {
    }

    public int getFontColor() {
    }

    @Nullable
    public String getFontFamily() {
    }

    public float getFontSize() {
    }

    public int getFontSizeUnit() {
    }

    public int getRubyPosition() {
    }

    public int getSpecificityScore(@Nullable String id, @Nullable String tag, Set<String> classes, @Nullable String voice) {
    }

    public int getStyle() {
    }

    public boolean hasBackgroundColor() {
    }

    public boolean hasFontColor() {
    }

    public boolean isLinethrough() {
    }

    public boolean isUnderline() {
    }

    public WebvttCssStyle setBackgroundColor(int backgroundColor) {
    }

    public WebvttCssStyle setBold(boolean bold) {
    }

    public WebvttCssStyle setCombineUpright(boolean enabled) {
    }

    public WebvttCssStyle setFontColor(int color) {
    }

    public WebvttCssStyle setFontFamily(@Nullable String fontFamily) {
    }

    public WebvttCssStyle setFontSize(float fontSize) {
    }

    public WebvttCssStyle setFontSizeUnit(int unit) {
    }

    public WebvttCssStyle setItalic(boolean italic) {
    }

    public WebvttCssStyle setLinethrough(boolean linethrough) {
    }

    public WebvttCssStyle setRubyPosition(int rubyPosition) {
    }

    public void setTargetClasses(String[] targetClasses) {
    }

    public void setTargetId(String targetId) {
    }

    public void setTargetTagName(String targetTag) {
    }

    public void setTargetVoice(String targetVoice) {
    }

    public WebvttCssStyle setUnderline(boolean underline) {
    }
}
