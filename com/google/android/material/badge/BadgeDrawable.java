package com.google.android.material.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    private static final int BADGE_NUMBER_NONE = -1;
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    public static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    @StyleRes
    private static final int DEFAULT_STYLE = 0;
    @AttrRes
    private static final int DEFAULT_THEME_ATTR = 0;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    @Nullable
    private WeakReference<View> anchorViewRef;
    @NonNull
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final float badgeRadius;
    private final float badgeWidePadding;
    private final float badgeWithTextRadius;
    @NonNull
    private final WeakReference<Context> contextRef;
    private float cornerRadius;
    @Nullable
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    @NonNull
    private final SavedState savedState;
    @NonNull
    private final MaterialShapeDrawable shapeDrawable;
    @NonNull
    private final TextDrawableHelper textDrawableHelper;

    /* renamed from: com.google.android.material.badge.BadgeDrawable$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ BadgeDrawable this$0;
        public final /* synthetic */ View val$anchorView;
        public final /* synthetic */ FrameLayout val$frameLayout;

        public AnonymousClass1(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface BadgeGravity {
    }

    private BadgeDrawable(@NonNull Context context) {
    }

    private void calculateCenterAndBounds(@NonNull Context context, @NonNull Rect rect, @NonNull View view) {
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
    }

    @NonNull
    private static BadgeDrawable createFromAttributes(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i2) {
    }

    @NonNull
    public static BadgeDrawable createFromSavedState(@NonNull Context context, @NonNull SavedState savedState) {
    }

    private void drawText(Canvas canvas) {
    }

    @NonNull
    private String getBadgeText() {
    }

    private void loadDefaultStateFromAttributes(Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
    }

    private static int readColorFromAttributes(Context context, @NonNull TypedArray typedArray, @StyleableRes int i2) {
    }

    private void restoreFromSavedState(@NonNull SavedState savedState) {
    }

    private void setTextAppearance(@Nullable TextAppearance textAppearance) {
    }

    private void setTextAppearanceResource(@StyleRes int i2) {
    }

    private void tryWrapAnchorInCompatParent(View view) {
    }

    private static void updateAnchorParentToNotClip(View view) {
    }

    private void updateCenterAndBounds() {
    }

    private void updateMaxBadgeNumber() {
    }

    public void clearNumber() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
    }

    @ColorInt
    public int getBackgroundColor() {
    }

    public int getBadgeGravity() {
    }

    @ColorInt
    public int getBadgeTextColor() {
    }

    @Nullable
    public CharSequence getContentDescription() {
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
    }

    public int getHorizontalOffset() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    public int getMaxCharacterCount() {
    }

    public int getNumber() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @NonNull
    public SavedState getSavedState() {
    }

    public int getVerticalOffset() {
    }

    public boolean hasNumber() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setBackgroundColor(@ColorInt int i2) {
    }

    public void setBadgeGravity(int i2) {
    }

    public void setBadgeTextColor(@ColorInt int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i2) {
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i2) {
    }

    public void setHorizontalOffset(int i2) {
    }

    public void setMaxCharacterCount(int i2) {
    }

    public void setNumber(int i2) {
    }

    public void setVerticalOffset(int i2) {
    }

    public void setVisible(boolean z) {
    }

    @Deprecated
    public void updateBadgeCoordinates(@NonNull View view, @Nullable ViewGroup viewGroup) {
    }

    public void updateBadgeCoordinates(@NonNull View view) {
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable FrameLayout frameLayout) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        private int alpha;
        @ColorInt
        private int backgroundColor;
        private int badgeGravity;
        @ColorInt
        private int badgeTextColor;
        @StringRes
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        @Nullable
        private CharSequence contentDescriptionNumberless;
        @PluralsRes
        private int contentDescriptionQuantityStrings;
        @Dimension(unit = 1)
        private int horizontalOffset;
        private boolean isVisible;
        private int maxCharacterCount;
        private int number;
        @Dimension(unit = 1)
        private int verticalOffset;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public /* bridge */ /* synthetic */ SavedState createFromParcel(@NonNull Parcel parcel) {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i2) {
            }
        }

        public SavedState(@NonNull Context context) {
        }

        public static /* synthetic */ boolean access$000(SavedState savedState) {
        }

        public static /* synthetic */ boolean access$002(SavedState savedState, boolean z) {
        }

        public static /* synthetic */ int access$100(SavedState savedState) {
        }

        public static /* synthetic */ int access$1000(SavedState savedState) {
        }

        public static /* synthetic */ int access$1002(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$102(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$1100(SavedState savedState) {
        }

        public static /* synthetic */ int access$1102(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$200(SavedState savedState) {
        }

        public static /* synthetic */ int access$202(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$300(SavedState savedState) {
        }

        public static /* synthetic */ int access$302(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$400(SavedState savedState) {
        }

        public static /* synthetic */ int access$402(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$500(SavedState savedState) {
        }

        public static /* synthetic */ int access$502(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$600(SavedState savedState) {
        }

        public static /* synthetic */ int access$602(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$700(SavedState savedState) {
        }

        public static /* synthetic */ int access$702(SavedState savedState, int i2) {
        }

        public static /* synthetic */ int access$800(SavedState savedState) {
        }

        public static /* synthetic */ int access$802(SavedState savedState, int i2) {
        }

        public static /* synthetic */ CharSequence access$900(SavedState savedState) {
        }

        public static /* synthetic */ CharSequence access$902(SavedState savedState, CharSequence charSequence) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
        }

        public SavedState(@NonNull Parcel parcel) {
        }
    }
}
