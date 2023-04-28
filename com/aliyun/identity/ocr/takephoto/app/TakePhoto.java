package com.aliyun.identity.ocr.takephoto.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.aliyun.identity.ocr.takephoto.compress.CompressConfig;
import com.aliyun.identity.ocr.takephoto.model.CropOptions;
import com.aliyun.identity.ocr.takephoto.model.MultipleCrop;
import com.aliyun.identity.ocr.takephoto.model.TException;
import com.aliyun.identity.ocr.takephoto.model.TResult;
import com.aliyun.identity.ocr.takephoto.model.TakePhotoOptions;
import com.aliyun.identity.ocr.takephoto.permission.PermissionManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface TakePhoto {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface TakeResultListener {
        void takeCancel();

        void takeFail(TResult tResult, String str);

        void takeSuccess(TResult tResult);
    }

    void onActivityResult(int i2, int i3, Intent intent);

    void onCreate(Bundle bundle);

    void onCrop(Uri uri, Uri uri2, CropOptions cropOptions) throws TException;

    void onCrop(MultipleCrop multipleCrop, CropOptions cropOptions) throws TException;

    void onEnableCompress(CompressConfig compressConfig, boolean z);

    void onPickFromCapture(Uri uri);

    void onPickFromCaptureWithCrop(Uri uri, CropOptions cropOptions);

    void onPickFromDocuments();

    void onPickFromDocumentsWithCrop(Uri uri, CropOptions cropOptions);

    void onPickFromGallery();

    void onPickFromGalleryWithCrop(Uri uri, CropOptions cropOptions);

    void onPickMultiple(int i2);

    void onPickMultipleWithCrop(int i2, CropOptions cropOptions);

    void onSaveInstanceState(Bundle bundle);

    void permissionNotify(PermissionManager.TPermissionType tPermissionType);

    void setTakePhotoOptions(TakePhotoOptions takePhotoOptions);
}
