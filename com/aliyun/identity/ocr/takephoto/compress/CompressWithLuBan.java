package com.aliyun.identity.ocr.takephoto.compress;

import android.content.Context;
import com.aliyun.identity.ocr.takephoto.compress.CompressImage;
import com.aliyun.identity.ocr.takephoto.model.LubanOptions;
import com.aliyun.identity.ocr.takephoto.model.TImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.shaohui.advancedluban.OnCompressListener;
import me.shaohui.advancedluban.OnMultiCompressListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CompressWithLuBan implements CompressImage {
    private Context context;
    private ArrayList<File> files;
    private ArrayList<TImage> images;
    private CompressImage.CompressListener listener;
    private LubanOptions options;

    /* renamed from: com.aliyun.identity.ocr.takephoto.compress.CompressWithLuBan$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements OnCompressListener {
        public final /* synthetic */ CompressWithLuBan this$0;

        public AnonymousClass1(CompressWithLuBan compressWithLuBan) {
        }

        public void onError(Throwable th) {
        }

        public void onStart() {
        }

        public void onSuccess(File file) {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.takephoto.compress.CompressWithLuBan$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements OnMultiCompressListener {
        public final /* synthetic */ CompressWithLuBan this$0;

        public AnonymousClass2(CompressWithLuBan compressWithLuBan) {
        }

        public void onError(Throwable th) {
        }

        public void onStart() {
        }

        public void onSuccess(List<File> list) {
        }
    }

    public CompressWithLuBan(Context context, CompressConfig compressConfig, ArrayList<TImage> arrayList, CompressImage.CompressListener compressListener) {
    }

    public static /* synthetic */ ArrayList access$000(CompressWithLuBan compressWithLuBan) {
    }

    public static /* synthetic */ CompressImage.CompressListener access$100(CompressWithLuBan compressWithLuBan) {
    }

    public static /* synthetic */ void access$200(CompressWithLuBan compressWithLuBan, List list) {
    }

    private void compressMulti() {
    }

    private void compressOne() {
    }

    private void handleCompressCallBack(List<File> list) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.compress.CompressImage
    public void compress() {
    }
}
