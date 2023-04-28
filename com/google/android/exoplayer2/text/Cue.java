package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Cue implements Bundleable {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final Bundleable.Creator<Cue> CREATOR = null;
    public static final float DIMEN_UNSET = -3.4028235E38f;
    public static final Cue EMPTY = null;
    private static final int FIELD_BITMAP = 3;
    private static final int FIELD_BITMAP_HEIGHT = 12;
    private static final int FIELD_LINE = 4;
    private static final int FIELD_LINE_ANCHOR = 6;
    private static final int FIELD_LINE_TYPE = 5;
    private static final int FIELD_MULTI_ROW_ALIGNMENT = 2;
    private static final int FIELD_POSITION = 7;
    private static final int FIELD_POSITION_ANCHOR = 8;
    private static final int FIELD_SHEAR_DEGREES = 16;
    private static final int FIELD_SIZE = 11;
    private static final int FIELD_TEXT = 0;
    private static final int FIELD_TEXT_ALIGNMENT = 1;
    private static final int FIELD_TEXT_SIZE = 10;
    private static final int FIELD_TEXT_SIZE_TYPE = 9;
    private static final int FIELD_VERTICAL_TYPE = 15;
    private static final int FIELD_WINDOW_COLOR = 13;
    private static final int FIELD_WINDOW_COLOR_SET = 14;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public static final int VERTICAL_TYPE_LR = 2;
    public static final int VERTICAL_TYPE_RL = 1;
    @Nullable
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    @Nullable
    public final Layout.Alignment multiRowAlignment;
    public final float position;
    public final int positionAnchor;
    public final float shearDegrees;
    public final float size;
    @Nullable
    public final CharSequence text;
    @Nullable
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final int windowColor;
    public final boolean windowColorSet;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface AnchorType {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        @Nullable
        private Bitmap bitmap;
        private float bitmapHeight;
        private float line;
        private int lineAnchor;
        private int lineType;
        @Nullable
        private Layout.Alignment multiRowAlignment;
        private float position;
        private int positionAnchor;
        private float shearDegrees;
        private float size;
        @Nullable
        private CharSequence text;
        @Nullable
        private Layout.Alignment textAlignment;
        private float textSize;
        private int textSizeType;
        private int verticalType;
        @ColorInt
        private int windowColor;
        private boolean windowColorSet;

        public /* synthetic */ Builder(Cue cue, AnonymousClass1 anonymousClass1) {
        }

        public Cue build() {
        }

        public Builder clearWindowColor() {
        }

        @Nullable
        @Pure
        public Bitmap getBitmap() {
        }

        @Pure
        public float getBitmapHeight() {
        }

        @Pure
        public float getLine() {
        }

        @Pure
        public int getLineAnchor() {
        }

        @Pure
        public int getLineType() {
        }

        @Pure
        public float getPosition() {
        }

        @Pure
        public int getPositionAnchor() {
        }

        @Pure
        public float getSize() {
        }

        @Nullable
        @Pure
        public CharSequence getText() {
        }

        @Nullable
        @Pure
        public Layout.Alignment getTextAlignment() {
        }

        @Pure
        public float getTextSize() {
        }

        @Pure
        public int getTextSizeType() {
        }

        @Pure
        public int getVerticalType() {
        }

        @ColorInt
        @Pure
        public int getWindowColor() {
        }

        public boolean isWindowColorSet() {
        }

        public Builder setBitmap(Bitmap bitmap) {
        }

        public Builder setBitmapHeight(float bitmapHeight) {
        }

        public Builder setLine(float line, int lineType) {
        }

        public Builder setLineAnchor(int lineAnchor) {
        }

        public Builder setMultiRowAlignment(@Nullable Layout.Alignment multiRowAlignment) {
        }

        public Builder setPosition(float position) {
        }

        public Builder setPositionAnchor(int positionAnchor) {
        }

        public Builder setShearDegrees(float shearDegrees) {
        }

        public Builder setSize(float size) {
        }

        public Builder setText(CharSequence text) {
        }

        public Builder setTextAlignment(@Nullable Layout.Alignment textAlignment) {
        }

        public Builder setTextSize(float textSize, int textSizeType) {
        }

        public Builder setVerticalType(int verticalType) {
        }

        public Builder setWindowColor(@ColorInt int windowColor) {
        }

        public Builder() {
        }

        private Builder(Cue cue) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface LineType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface TextSizeType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface VerticalType {
    }

    public /* synthetic */ Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Cue a(Bundle bundle) {
    }

    private static final Cue fromBundle(Bundle bundle) {
    }

    private static String keyForField(int field) {
    }

    public Builder buildUpon() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    @Deprecated
    public Cue(CharSequence text) {
    }

    @Deprecated
    public Cue(CharSequence text, @Nullable Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size) {
    }

    @Deprecated
    public Cue(CharSequence text, @Nullable Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size, int textSizeType, float textSize) {
    }

    @Deprecated
    public Cue(CharSequence text, @Nullable Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size, boolean windowColorSet, int windowColor) {
    }

    private Cue(@Nullable CharSequence text, @Nullable Layout.Alignment textAlignment, @Nullable Layout.Alignment multiRowAlignment, @Nullable Bitmap bitmap, float line, int lineType, int lineAnchor, float position, int positionAnchor, int textSizeType, float textSize, float size, float bitmapHeight, boolean windowColorSet, int windowColor, int verticalType, float shearDegrees) {
    }
}
