package com.alipay.zoloz.image;

import android.graphics.Bitmap;
import com.alipay.zoloz.toyger.algorithm.TGFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ToygerImage {
    public static final String TAG = "TOYGER_FLOW_ANDROID::ToygerImage";

    Bitmap tgFrameToBitmap(TGFrame tGFrame, int i2, float f2, String str, boolean z);

    byte[] tgFrameToBlob(TGFrame tGFrame, int i2, float f2, String str, boolean z);
}
