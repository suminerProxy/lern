package com.facebook.imagepipeline.animated.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedDrawableUtil {
    private static final int FRAME_DURATION_MS_FOR_MIN = 100;
    private static final int MIN_FRAME_DURATION_MS = 11;

    public static boolean isOutsideRange(int startFrame, int endFrame, int frameNumber) {
        if (startFrame == -1 || endFrame == -1) {
            return true;
        }
        if (startFrame <= endFrame) {
            if (frameNumber < startFrame || frameNumber > endFrame) {
                return true;
            }
        } else if (frameNumber < startFrame && frameNumber > endFrame) {
            return true;
        }
        return false;
    }

    public void fixFrameDurations(int[] frameDurationMs) {
        for (int i2 = 0; i2 < frameDurationMs.length; i2++) {
            if (frameDurationMs[i2] < 11) {
                frameDurationMs[i2] = 100;
            }
        }
    }

    public int getFrameForTimestampMs(int[] frameTimestampsMs, int timestampMs) {
        int binarySearch = Arrays.binarySearch(frameTimestampsMs, timestampMs);
        return binarySearch < 0 ? ((-binarySearch) - 1) - 1 : binarySearch;
    }

    public int[] getFrameTimeStampsFromDurations(int[] frameDurationsMs) {
        int[] iArr = new int[frameDurationsMs.length];
        int i2 = 0;
        for (int i3 = 0; i3 < frameDurationsMs.length; i3++) {
            iArr[i3] = i2;
            i2 += frameDurationsMs[i3];
        }
        return iArr;
    }

    @SuppressLint({"NewApi"})
    public int getSizeOfBitmap(Bitmap bitmap) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (i2 >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getWidth() * bitmap.getHeight() * 4;
    }

    public int getTotalDurationFromFrameDurations(int[] frameDurationMs) {
        int i2 = 0;
        for (int i3 : frameDurationMs) {
            i2 += i3;
        }
        return i2;
    }
}
