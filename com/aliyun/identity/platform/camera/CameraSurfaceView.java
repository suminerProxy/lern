package com.aliyun.identity.platform.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.aliyun.identity.platform.config.DeviceSetting;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    public static ICameraInterface mCameraInterface;
    public ICameraCallback mCameraCallback;
    public Context mContext;
    public float mPreviewRate;
    public SurfaceHolder mSurfaceHolder;

    public CameraSurfaceView(Context context, AttributeSet attributeSet) {
    }

    public static String getCameraName() {
    }

    public ICameraInterface getCameraInterface() {
    }

    public SurfaceHolder getSurfaceHolder() {
    }

    public void init(Context context, boolean z) {
    }

    public void releaseCamera() {
    }

    public void setCameraCallback(ICameraCallback iCameraCallback) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void init(Context context, boolean z, boolean z2, DeviceSetting[] deviceSettingArr) {
    }
}
