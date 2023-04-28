package com.facebook.drawee.debug;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import com.facebook.drawee.debug.listener.ImageLoadingTimeListener;
import com.facebook.drawee.drawable.ScalingUtils;
import java.util.HashMap;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DebugControllerOverlayDrawable extends Drawable implements ImageLoadingTimeListener {
    private static final float IMAGE_SIZE_THRESHOLD_NOT_OK = 0.5f;
    private static final float IMAGE_SIZE_THRESHOLD_OK = 0.1f;
    private static final int MAX_LINE_WIDTH_EM = 8;
    private static final int MAX_NUMBER_OF_LINES = 9;
    private static final int MAX_TEXT_SIZE_PX = 40;
    private static final int MIN_TEXT_SIZE_PX = 10;
    private static final String NO_CONTROLLER_ID = "none";
    private static final int OUTLINE_COLOR = -26624;
    private static final int OUTLINE_STROKE_WIDTH_PX = 2;
    private static final int TEXT_BACKGROUND_COLOR = 1711276032;
    private static final int TEXT_COLOR = -1;
    @VisibleForTesting
    public static final int TEXT_COLOR_IMAGE_ALMOST_OK = -256;
    @VisibleForTesting
    public static final int TEXT_COLOR_IMAGE_NOT_OK = -65536;
    @VisibleForTesting
    public static final int TEXT_COLOR_IMAGE_OK = -16711936;
    private static final int TEXT_LINE_SPACING_PX = 8;
    private static final int TEXT_PADDING_PX = 10;
    private HashMap<String, String> mAdditionalData;
    private String mControllerId;
    private int mCurrentTextXPx;
    private int mCurrentTextYPx;
    private long mFinalImageTimeMs;
    private int mFrameCount;
    private int mHeightPx;
    @Nullable
    private String mImageFormat;
    @Nullable
    private String mImageId;
    private int mImageSizeBytes;
    private int mLineIncrementPx;
    private int mLoopCount;
    private final Matrix mMatrix;
    private int mOriginColor;
    @Nullable
    private String mOriginText;
    private int mOverlayColor;
    private final Paint mPaint;
    private final Rect mRect;
    private final RectF mRectF;
    @Nullable
    private ScalingUtils.ScaleType mScaleType;
    private int mStartTextXPx;
    private int mStartTextYPx;
    private int mTextGravity;
    private int mWidthPx;

    private void addDebugText(Canvas canvas, String label, Object value) {
    }

    private static String format(String text, @Nullable Object... args) {
    }

    private void prepareDebugTextParameters(Rect bounds, int numberOfLines, int maxLineLengthEm) {
    }

    public void addAdditionalData(String key, String value) {
    }

    @VisibleForTesting
    public int determineSizeHintColor(int imageWidth, int imageHeight, @Nullable ScalingUtils.ScaleType scaleType) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
    }

    @Override // com.facebook.drawee.debug.listener.ImageLoadingTimeListener
    public void onFinalImageSet(long finalImageTimeMs) {
    }

    public void reset() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    public void setAnimationInfo(int frameCount, int loopCount) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
    }

    public void setControllerId(@Nullable String controllerId) {
    }

    public void setDimensions(int widthPx, int heightPx) {
    }

    public void setFinalImageTimeMs(long finalImageTimeMs) {
    }

    public void setImageFormat(@Nullable String imageFormat) {
    }

    public void setImageId(@Nullable String imageId) {
    }

    public void setImageSize(int imageSizeBytes) {
    }

    public void setOrigin(String text, int color) {
    }

    public void setOverlayColor(int overlayColor) {
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
    }

    public void setTextGravity(int textGravity) {
    }

    private void addDebugText(Canvas canvas, String label, String value) {
    }

    private void addDebugText(Canvas canvas, String label, String value, int valueColor) {
    }
}
