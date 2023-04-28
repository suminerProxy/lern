package com.aliyun.identity.ocr.takephoto.compress;

import android.content.Context;
import com.aliyun.identity.ocr.takephoto.compress.CompressImage;
import com.aliyun.identity.ocr.takephoto.compress.CompressImageUtil;
import com.aliyun.identity.ocr.takephoto.model.TImage;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CompressImageImpl implements CompressImage {
    private CompressImageUtil compressImageUtil;
    private ArrayList<TImage> images;
    private CompressImage.CompressListener listener;

    /* renamed from: com.aliyun.identity.ocr.takephoto.compress.CompressImageImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements CompressImageUtil.CompressListener {
        public final /* synthetic */ CompressImageImpl this$0;
        public final /* synthetic */ TImage val$image;

        public AnonymousClass1(CompressImageImpl compressImageImpl, TImage tImage) {
        }

        @Override // com.aliyun.identity.ocr.takephoto.compress.CompressImageUtil.CompressListener
        public void onCompressFailed(String str, String str2) {
        }

        @Override // com.aliyun.identity.ocr.takephoto.compress.CompressImageUtil.CompressListener
        public void onCompressSuccess(String str) {
        }
    }

    private CompressImageImpl(Context context, CompressConfig compressConfig, ArrayList<TImage> arrayList, CompressImage.CompressListener compressListener) {
    }

    public static /* synthetic */ void access$000(CompressImageImpl compressImageImpl, TImage tImage, boolean z, String[] strArr) {
    }

    private void continueCompress(TImage tImage, boolean z, String... strArr) {
    }

    private void handleCompressCallBack(String... strArr) {
    }

    public static CompressImage of(Context context, CompressConfig compressConfig, ArrayList<TImage> arrayList, CompressImage.CompressListener compressListener) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.compress.CompressImage
    public void compress() {
    }

    private void compress(TImage tImage) {
    }
}
