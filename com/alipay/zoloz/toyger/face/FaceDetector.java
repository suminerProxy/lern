package com.alipay.zoloz.toyger.face;

import android.content.Context;
import com.alipay.zoloz.toyger.algorithm.TGFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class FaceDetector {
    public abstract ToygerFaceAttr detect(TGFrame tGFrame);

    public abstract boolean init(Context context);

    public abstract void release();

    public abstract void reset();
}
