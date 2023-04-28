package com.facebook.drawee.gestures;

import android.content.Context;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class GestureDetector {
    @VisibleForTesting
    public long mActionDownTime;
    @VisibleForTesting
    public float mActionDownX;
    @VisibleForTesting
    public float mActionDownY;
    @Nullable
    @VisibleForTesting
    public ClickListener mClickListener;
    @VisibleForTesting
    public boolean mIsCapturingGesture;
    @VisibleForTesting
    public boolean mIsClickCandidate;
    @VisibleForTesting
    public final float mSingleTapSlopPx;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface ClickListener {
        boolean onClick();
    }

    public GestureDetector(Context context) {
    }

    public static GestureDetector newInstance(Context context) {
    }

    public void init() {
    }

    public boolean isCapturingGesture() {
    }

    public boolean onTouchEvent(MotionEvent event) {
    }

    public void reset() {
    }

    public void setClickListener(ClickListener clickListener) {
    }
}
