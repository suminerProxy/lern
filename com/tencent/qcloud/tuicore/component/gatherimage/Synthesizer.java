package com.tencent.qcloud.tuicore.component.gatherimage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface Synthesizer {
    boolean asyncLoadImageList(MultiImageData multiImageData);

    void drawDrawable(Canvas canvas, MultiImageData multiImageData);

    Bitmap synthesizeImageList(MultiImageData multiImageData);
}
