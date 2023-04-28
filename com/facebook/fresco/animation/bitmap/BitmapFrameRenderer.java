package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.Rect;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface BitmapFrameRenderer {
    int getIntrinsicHeight();

    int getIntrinsicWidth();

    boolean renderFrame(int frameNumber, Bitmap targetBitmap);

    void setBounds(@Nullable Rect bounds);
}
