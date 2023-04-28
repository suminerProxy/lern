package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class InstrumentedDrawable extends ForwardingDrawable {
    private boolean mIsChecked;
    private final Listener mListener;
    private final String mScaleType;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Listener {
        void track(int viewWidth, int viewHeight, int imageWidth, int imageHeight, int scaledWidth, int scaledHeight, String scaleType);
    }

    public InstrumentedDrawable(Drawable drawable, Listener listener) {
    }

    private String getScaleType(Drawable drawable) {
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }
}
