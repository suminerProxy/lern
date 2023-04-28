package com.aliyun.identity.ocr.takephoto.uitl;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import com.aliyun.identity.ocr.takephoto.model.CropOptions;
import com.aliyun.identity.ocr.takephoto.model.TContextWrap;
import com.aliyun.identity.ocr.takephoto.model.TException;
import com.aliyun.identity.ocr.takephoto.model.TImage;
import com.aliyun.identity.ocr.takephoto.model.TIntentWap;
import com.darsh.multipleimageselect.models.Image;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TUtils {
    private static final String TAG = null;

    public static void captureBySafely(TContextWrap tContextWrap, TIntentWap tIntentWap) throws TException {
    }

    public static ArrayList<Uri> convertImageToUri(Context context, ArrayList<Image> arrayList) throws TException {
    }

    public static void cropWithOtherAppBySafely(TContextWrap tContextWrap, Uri uri, Uri uri2, CropOptions cropOptions) {
    }

    public static void cropWithOwnApp(TContextWrap tContextWrap, Uri uri, Uri uri2, CropOptions cropOptions) {
    }

    public static ArrayList<TImage> getTImagesWithImages(ArrayList<Image> arrayList, TImage.FromType fromType) {
    }

    public static ArrayList<TImage> getTImagesWithUris(ArrayList<Uri> arrayList, TImage.FromType fromType) {
    }

    public static boolean isReturnData() {
    }

    public static void sendIntentBySafely(TContextWrap tContextWrap, List<TIntentWap> list, int i2, boolean z) throws TException {
    }

    public static ProgressDialog showProgressDialog(Activity activity, String... strArr) {
    }

    public static void startActivityForResult(TContextWrap tContextWrap, TIntentWap tIntentWap) {
    }
}
