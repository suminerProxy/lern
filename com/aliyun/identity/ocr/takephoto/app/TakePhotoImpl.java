package com.aliyun.identity.ocr.takephoto.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.aliyun.identity.ocr.takephoto.app.TakePhoto;
import com.aliyun.identity.ocr.takephoto.compress.CompressConfig;
import com.aliyun.identity.ocr.takephoto.compress.CompressImage;
import com.aliyun.identity.ocr.takephoto.model.CropOptions;
import com.aliyun.identity.ocr.takephoto.model.MultipleCrop;
import com.aliyun.identity.ocr.takephoto.model.TContextWrap;
import com.aliyun.identity.ocr.takephoto.model.TException;
import com.aliyun.identity.ocr.takephoto.model.TImage;
import com.aliyun.identity.ocr.takephoto.model.TResult;
import com.aliyun.identity.ocr.takephoto.model.TakePhotoOptions;
import com.aliyun.identity.ocr.takephoto.permission.PermissionManager;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TakePhotoImpl implements TakePhoto {
    private static final String TAG = null;
    private CompressConfig compressConfig;
    private TContextWrap contextWrap;
    private CropOptions cropOptions;
    private TImage.FromType fromType;
    private TakePhoto.TakeResultListener listener;
    private MultipleCrop multipleCrop;
    private Uri outPutUri;
    private PermissionManager.TPermissionType permissionType;
    private boolean showCompressDialog;
    private TakePhotoOptions takePhotoOptions;
    private Uri tempUri;
    private ProgressDialog wailLoadDialog;

    /* renamed from: com.aliyun.identity.ocr.takephoto.app.TakePhotoImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements CompressImage.CompressListener {
        public final /* synthetic */ TakePhotoImpl this$0;
        public final /* synthetic */ String[] val$message;
        public final /* synthetic */ TResult val$result;

        public AnonymousClass1(TakePhotoImpl takePhotoImpl, TResult tResult, String[] strArr) {
        }

        @Override // com.aliyun.identity.ocr.takephoto.compress.CompressImage.CompressListener
        public void onCompressFailed(ArrayList<TImage> arrayList, String str) {
        }

        @Override // com.aliyun.identity.ocr.takephoto.compress.CompressImage.CompressListener
        public void onCompressSuccess(ArrayList<TImage> arrayList) {
        }
    }

    public TakePhotoImpl(Activity activity, TakePhoto.TakeResultListener takeResultListener) {
    }

    public static /* synthetic */ CompressConfig access$000(TakePhotoImpl takePhotoImpl) {
    }

    public static /* synthetic */ void access$100(TakePhotoImpl takePhotoImpl, ArrayList arrayList) {
    }

    public static /* synthetic */ void access$200(TakePhotoImpl takePhotoImpl, TResult tResult, String[] strArr) {
    }

    public static /* synthetic */ ProgressDialog access$300(TakePhotoImpl takePhotoImpl) {
    }

    public static /* synthetic */ TContextWrap access$400(TakePhotoImpl takePhotoImpl) {
    }

    private void clearParams() {
    }

    private void cropContinue(boolean z) {
    }

    private void cropWithNonException(Uri uri, Uri uri2, CropOptions cropOptions) {
    }

    private void deleteRawFile(ArrayList<TImage> arrayList) {
    }

    private void handleTakeCallBack(TResult tResult, String... strArr) {
    }

    private void selectPicture(int i2, boolean z) {
    }

    private void takeResult(TResult tResult, String... strArr) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onCreate(Bundle bundle) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onCrop(Uri uri, Uri uri2, CropOptions cropOptions) throws TException {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onEnableCompress(CompressConfig compressConfig, boolean z) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onPickFromCapture(Uri uri) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onPickFromCaptureWithCrop(Uri uri, CropOptions cropOptions) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onPickFromDocuments() {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onPickFromDocumentsWithCrop(Uri uri, CropOptions cropOptions) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onPickFromGallery() {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onPickFromGalleryWithCrop(Uri uri, CropOptions cropOptions) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onPickMultiple(int i2) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onPickMultipleWithCrop(int i2, CropOptions cropOptions) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void permissionNotify(PermissionManager.TPermissionType tPermissionType) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void setTakePhotoOptions(TakePhotoOptions takePhotoOptions) {
    }

    public TakePhotoImpl(Fragment fragment, TakePhoto.TakeResultListener takeResultListener) {
    }

    @Override // com.aliyun.identity.ocr.takephoto.app.TakePhoto
    public void onCrop(MultipleCrop multipleCrop, CropOptions cropOptions) throws TException {
    }
}
