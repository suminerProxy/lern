package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.image.QualityInfo;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface ProgressiveJpegConfig {
    int getNextScanNumberToDecode(int scanNumber);

    QualityInfo getQualityInfo(int scanNumber);
}
