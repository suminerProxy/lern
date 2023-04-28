package com.aliyun.identity.ocr.takephoto.compress;

import com.aliyun.identity.ocr.takephoto.model.TImage;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface CompressImage {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface CompressListener {
        void onCompressFailed(ArrayList<TImage> arrayList, String str);

        void onCompressSuccess(ArrayList<TImage> arrayList);
    }

    void compress();
}
