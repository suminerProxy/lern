package com.facebook.drawee.interfaces;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface DraweeHierarchy {
    Rect getBounds();

    Drawable getTopLevelDrawable();
}
