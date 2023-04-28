package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Palette {
    public static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
    public static final Filter DEFAULT_FILTER = null;
    public static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
    public static final String LOG_TAG = "Palette";
    public static final boolean LOG_TIMINGS = false;
    public static final float MIN_CONTRAST_BODY_TEXT = 4.5f;
    public static final float MIN_CONTRAST_TITLE_TEXT = 3.0f;
    @Nullable
    private final Swatch mDominantSwatch;
    private final Map<Target, Swatch> mSelectedSwatches;
    private final List<Swatch> mSwatches;
    private final List<Target> mTargets;
    private final SparseBooleanArray mUsedColors;

    /* renamed from: androidx.palette.graphics.Palette$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AnonymousClass1 implements Filter {
        private static final float BLACK_MAX_LIGHTNESS = 0.05f;
        private static final float WHITE_MIN_LIGHTNESS = 0.95f;

        private boolean isBlack(float[] fArr) {
        }

        private boolean isNearRedILine(float[] fArr) {
        }

        private boolean isWhite(float[] fArr) {
        }

        @Override // androidx.palette.graphics.Palette.Filter
        public boolean isAllowed(int i2, float[] fArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Filter {
        boolean isAllowed(@ColorInt int i2, @NonNull float[] fArr);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface PaletteAsyncListener {
        void onGenerated(@Nullable Palette palette);
    }

    public Palette(List<Swatch> list, List<Target> list2) {
    }

    @Nullable
    private Swatch findDominantSwatch() {
    }

    @NonNull
    public static Builder from(@NonNull Bitmap bitmap) {
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap) {
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, PaletteAsyncListener paletteAsyncListener) {
    }

    private float generateScore(Swatch swatch, Target target) {
    }

    @Nullable
    private Swatch generateScoredTarget(Target target) {
    }

    @Nullable
    private Swatch getMaxScoredSwatchForTarget(Target target) {
    }

    private boolean shouldBeScoredForTarget(Swatch swatch, Target target) {
    }

    @ColorInt
    public int getColorForTarget(@NonNull Target target, @ColorInt int i2) {
    }

    @ColorInt
    public int getDarkMutedColor(@ColorInt int i2) {
    }

    @Nullable
    public Swatch getDarkMutedSwatch() {
    }

    @ColorInt
    public int getDarkVibrantColor(@ColorInt int i2) {
    }

    @Nullable
    public Swatch getDarkVibrantSwatch() {
    }

    @ColorInt
    public int getDominantColor(@ColorInt int i2) {
    }

    @Nullable
    public Swatch getDominantSwatch() {
    }

    @ColorInt
    public int getLightMutedColor(@ColorInt int i2) {
    }

    @Nullable
    public Swatch getLightMutedSwatch() {
    }

    @ColorInt
    public int getLightVibrantColor(@ColorInt int i2) {
    }

    @Nullable
    public Swatch getLightVibrantSwatch() {
    }

    @ColorInt
    public int getMutedColor(@ColorInt int i2) {
    }

    @Nullable
    public Swatch getMutedSwatch() {
    }

    @Nullable
    public Swatch getSwatchForTarget(@NonNull Target target) {
    }

    @NonNull
    public List<Swatch> getSwatches() {
    }

    @NonNull
    public List<Target> getTargets() {
    }

    @ColorInt
    public int getVibrantColor(@ColorInt int i2) {
    }

    @Nullable
    public Swatch getVibrantSwatch() {
    }

    @NonNull
    public static Palette from(@NonNull List<Swatch> list) {
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap, int i2) {
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, int i2, PaletteAsyncListener paletteAsyncListener) {
    }

    public void generate() {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Swatch {
        private final int mBlue;
        private int mBodyTextColor;
        private boolean mGeneratedTextColors;
        private final int mGreen;
        @Nullable
        private float[] mHsl;
        private final int mPopulation;
        private final int mRed;
        private final int mRgb;
        private int mTitleTextColor;

        public Swatch(@ColorInt int i2, int i3) {
        }

        private void ensureTextColorsGenerated() {
        }

        public boolean equals(Object obj) {
        }

        @ColorInt
        public int getBodyTextColor() {
        }

        @NonNull
        public float[] getHsl() {
        }

        public int getPopulation() {
        }

        @ColorInt
        public int getRgb() {
        }

        @ColorInt
        public int getTitleTextColor() {
        }

        public int hashCode() {
        }

        public String toString() {
        }

        public Swatch(int i2, int i3, int i4, int i5) {
        }

        public Swatch(float[] fArr, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {
        @Nullable
        private final Bitmap mBitmap;
        private final List<Filter> mFilters;
        private int mMaxColors;
        @Nullable
        private Rect mRegion;
        private int mResizeArea;
        private int mResizeMaxDimension;
        @Nullable
        private final List<Swatch> mSwatches;
        private final List<Target> mTargets;

        /* renamed from: androidx.palette.graphics.Palette$Builder$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 extends AsyncTask<Bitmap, Void, Palette> {
            public final /* synthetic */ Builder this$0;
            public final /* synthetic */ PaletteAsyncListener val$listener;

            public AnonymousClass1(Builder builder, PaletteAsyncListener paletteAsyncListener) {
            }

            @Override // android.os.AsyncTask
            @Nullable
            public /* bridge */ /* synthetic */ Palette doInBackground(Bitmap[] bitmapArr) {
            }

            @Override // android.os.AsyncTask
            public /* bridge */ /* synthetic */ void onPostExecute(@Nullable Palette palette) {
            }

            @Nullable
            /* renamed from: doInBackground  reason: avoid collision after fix types in other method */
            public Palette doInBackground2(Bitmap... bitmapArr) {
            }

            /* renamed from: onPostExecute  reason: avoid collision after fix types in other method */
            public void onPostExecute2(@Nullable Palette palette) {
            }
        }

        public Builder(@NonNull Bitmap bitmap) {
        }

        private int[] getPixelsFromBitmap(Bitmap bitmap) {
        }

        private Bitmap scaleBitmapDown(Bitmap bitmap) {
        }

        @NonNull
        public Builder addFilter(Filter filter) {
        }

        @NonNull
        public Builder addTarget(@NonNull Target target) {
        }

        @NonNull
        public Builder clearFilters() {
        }

        @NonNull
        public Builder clearRegion() {
        }

        @NonNull
        public Builder clearTargets() {
        }

        @NonNull
        public Palette generate() {
        }

        @NonNull
        public Builder maximumColorCount(int i2) {
        }

        @NonNull
        public Builder resizeBitmapArea(int i2) {
        }

        @NonNull
        @Deprecated
        public Builder resizeBitmapSize(int i2) {
        }

        @NonNull
        public Builder setRegion(@Px int i2, @Px int i3, @Px int i4, @Px int i5) {
        }

        public Builder(@NonNull List<Swatch> list) {
        }

        @NonNull
        public AsyncTask<Bitmap, Void, Palette> generate(@NonNull PaletteAsyncListener paletteAsyncListener) {
        }
    }
}
