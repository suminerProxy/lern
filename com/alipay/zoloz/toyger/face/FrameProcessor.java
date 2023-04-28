package com.alipay.zoloz.toyger.face;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import java.io.File;
import java.io.FilenameFilter;
import java.io.OutputStream;
import java.text.SimpleDateFormat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FrameProcessor {
    public static final SimpleDateFormat DATE_FORMAT2 = null;
    private static final boolean SAVE_BITMAP = false;
    private static final String TAG = "FrameProcessor";
    private TGDepthFrame mTgDepthFrame;
    private TGFrame mTgFrame;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class LogFileNameFilter implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
        }
    }

    public static void bitmap2File(Bitmap bitmap, File file) {
    }

    @TargetApi(9)
    public static void clearOldBinFiles() {
    }

    public static void close(OutputStream outputStream) {
    }

    public static String getDetailDateFormat(long j2) {
    }

    public static synchronized boolean save(File file, byte[] bArr) {
    }

    public static void saveBitmap(TGFrame tGFrame, TGDepthFrame tGDepthFrame, ToygerFaceAttr toygerFaceAttr, boolean z, String str) {
    }

    public void clearFrame() {
    }

    public TGDepthFrame getTgDepthFrame() {
    }

    public TGFrame getTgFrame() {
    }

    public void initFame(TGFrame tGFrame, TGDepthFrame tGDepthFrame) {
    }

    public void saveBitmap(ToygerFaceAttr toygerFaceAttr, boolean z, String str) {
    }

    public void saveTgDepthFrame(String str) {
    }

    public void saveTgFrame(String str) {
    }

    public static void saveBitmap(Bitmap bitmap, String str) {
    }
}
