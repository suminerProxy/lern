package com.aliyun.identity.ocr.takephoto.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.aliyun.identity.ocr.takephoto.app.TakePhoto;
import com.aliyun.identity.ocr.takephoto.model.InvokeParam;
import com.aliyun.identity.ocr.takephoto.model.TResult;
import com.aliyun.identity.ocr.takephoto.permission.InvokeListener;
import com.aliyun.identity.ocr.takephoto.permission.PermissionManager;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TakePhotoActivity extends Activity implements TakePhoto.TakeResultListener, InvokeListener {
    private static final String TAG = null;
    private InvokeParam invokeParam;
    private TakePhoto takePhoto;

    public TakePhoto getTakePhoto() {
    }

    @Override // com.aliyun.identity.ocr.takephoto.permission.InvokeListener
    public PermissionManager.TPermissionType invoke(InvokeParam invokeParam) {
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }

    public void takeCancel() {
    }

    public void takeFail(TResult tResult, String str) {
    }

    public void takeSuccess(TResult tResult) {
    }
}
