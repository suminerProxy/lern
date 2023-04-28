package com.aliyun.identity.ocr.takephoto.compress;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CompressImageUtil {
    private CompressConfig config;
    private Context context;
    public Handler mhHandler;

    /* renamed from: com.aliyun.identity.ocr.takephoto.compress.CompressImageUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ CompressImageUtil this$0;
        public final /* synthetic */ Bitmap val$bitmap;
        public final /* synthetic */ String val$imgPath;
        public final /* synthetic */ CompressListener val$listener;

        public AnonymousClass1(CompressImageUtil compressImageUtil, Bitmap bitmap, String str, CompressListener compressListener) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.aliyun.identity.ocr.takephoto.compress.CompressImageUtil$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ CompressImageUtil this$0;
        public final /* synthetic */ String val$imagePath;
        public final /* synthetic */ boolean val$isSuccess;
        public final /* synthetic */ CompressListener val$listener;
        public final /* synthetic */ String val$message;

        public AnonymousClass2(CompressImageUtil compressImageUtil, boolean z, CompressListener compressListener, String str, String str2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface CompressListener {
        void onCompressFailed(String str, String str2);

        void onCompressSuccess(String str);
    }

    public CompressImageUtil(Context context, CompressConfig compressConfig) {
    }

    public static /* synthetic */ CompressConfig access$000(CompressImageUtil compressImageUtil) {
    }

    public static /* synthetic */ File access$100(CompressImageUtil compressImageUtil, File file) {
    }

    public static /* synthetic */ void access$200(CompressImageUtil compressImageUtil, boolean z, String str, String str2, CompressListener compressListener) {
    }

    private void compressImageByPixel(String str, CompressListener compressListener) throws FileNotFoundException {
    }

    private void compressImageByQuality(Bitmap bitmap, String str, CompressListener compressListener) {
    }

    private File getThumbnailFile(File file) {
    }

    private void sendMsg(boolean z, String str, String str2, CompressListener compressListener) {
    }

    public void compress(String str, CompressListener compressListener) {
    }
}
