package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TtmlStyle {
    public static final int FONT_SIZE_UNIT_EM = 2;
    public static final int FONT_SIZE_UNIT_PERCENT = 3;
    public static final int FONT_SIZE_UNIT_PIXEL = 1;
    private static final int OFF = 0;
    private static final int ON = 1;
    public static final int RUBY_TYPE_BASE = 2;
    public static final int RUBY_TYPE_CONTAINER = 1;
    public static final int RUBY_TYPE_DELIMITER = 4;
    public static final int RUBY_TYPE_TEXT = 3;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_BOLD_ITALIC = 3;
    public static final int STYLE_ITALIC = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int UNSPECIFIED = -1;
    public static final float UNSPECIFIED_SHEAR = Float.MAX_VALUE;
    private int backgroundColor;
    private int bold;
    private int fontColor;
    @Nullable
    private String fontFamily;
    private float fontSize;
    private int fontSizeUnit;
    private boolean hasBackgroundColor;
    private boolean hasFontColor;
    @Nullable
    private String id;
    private int italic;
    private int linethrough;
    @Nullable
    private Layout.Alignment multiRowAlign;
    private int rubyPosition;
    private int rubyType;
    private float shearPercentage;
    @Nullable
    private Layout.Alignment textAlign;
    private int textCombine;
    @Nullable
    private TextEmphasis textEmphasis;
    private int underline;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface RubyType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface StyleFlags {
    }

    public TtmlStyle chain(@Nullable TtmlStyle ancestor) {
    }

    public int getBackgroundColor() {
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

    @Nullable
    public String getId() {
    }

    @Nullable
    public Layout.Alignment getMultiRowAlign() {
    }

    public int getRubyPosition() {
    }

    public int getRubyType() {
    }

    public float getShearPercentage() {
    }

    public int getStyle() {
    }

    @Nullable
    public Layout.Alignment getTextAlign() {
    }

    public boolean getTextCombine() {
    }

    @Nullable
    public TextEmphasis getTextEmphasis() {
    }

    public boolean hasBackgroundColor() {
    }

    public boolean hasFontColor() {
    }

    public TtmlStyle inherit(@Nullable TtmlStyle ancestor) {
    }

    public boolean isLinethrough() {
    }

    public boolean isUnderline() {
    }

    public TtmlStyle setBackgroundColor(int backgroundColor) {
    }

    public TtmlStyle setBold(boolean bold) {
    }

    public TtmlStyle setFontColor(int fontColor) {
    }

    public TtmlStyle setFontFamily(@Nullable String fontFamily) {
    }

    public TtmlStyle setFontSize(float fontSize) {
    }

    public TtmlStyle setFontSizeUnit(int fontSizeUnit) {
    }

    public TtmlStyle setId(@Nullable String id) {
    }

    public TtmlStyle setItalic(boolean italic) {
    }

    public TtmlStyle setLinethrough(boolean linethrough) {
    }

    public TtmlStyle setMultiRowAlign(@Nullable Layout.Alignment multiRowAlign) {
    }

    public TtmlStyle setRubyPosition(int position) {
    }

    public TtmlStyle setRubyType(int rubyType) {
    }

    public TtmlStyle setShearPercentage(float shearPercentage) {
    }

    public TtmlStyle setTextAlign(@Nullable Layout.Alignment textAlign) {
    }

    public TtmlStyle setTextCombine(boolean combine) {
    }

    public TtmlStyle setTextEmphasis(@Nullable TextEmphasis textEmphasis) {
    }

    public TtmlStyle setUnderline(boolean underline) {
    }

    private TtmlStyle inherit(@Nullable TtmlStyle ancestor, boolean chaining) {
    }
}
