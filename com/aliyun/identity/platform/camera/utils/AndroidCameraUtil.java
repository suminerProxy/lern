package com.aliyun.identity.platform.camera.utils;

import android.hardware.Camera;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AndroidCameraUtil {
    private static AndroidCameraUtil myCamPara;
    private CameraSizeComparator sizeComparator;

    /* renamed from: com.aliyun.identity.platform.camera.utils.AndroidCameraUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Comparator<CameraSelectInfo> {
        public final /* synthetic */ AndroidCameraUtil this$0;

        public AnonymousClass1(AndroidCameraUtil androidCameraUtil) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(CameraSelectInfo cameraSelectInfo, CameraSelectInfo cameraSelectInfo2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(CameraSelectInfo cameraSelectInfo, CameraSelectInfo cameraSelectInfo2) {
        }
    }

    /* renamed from: com.aliyun.identity.platform.camera.utils.AndroidCameraUtil$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Comparator<Camera.Size> {
        public final /* synthetic */ AndroidCameraUtil this$0;
        public final /* synthetic */ float val$th;

        public AnonymousClass2(AndroidCameraUtil androidCameraUtil, float f2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Camera.Size size, Camera.Size size2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CameraSelectInfo {
        public Camera.Size cSize;
        public float rateDiff;

        private CameraSelectInfo() {
        }

        public /* synthetic */ CameraSelectInfo(AnonymousClass1 anonymousClass1) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class CameraSizeComparator implements Comparator<Camera.Size> {
        public final /* synthetic */ AndroidCameraUtil this$0;

        public CameraSizeComparator(AndroidCameraUtil androidCameraUtil) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Camera.Size size, Camera.Size size2) {
        }
    }

    private AndroidCameraUtil() {
    }

    public static int findBackFacingCamera() {
    }

    public static int findFrontFacingCamera() {
    }

    public static Map<String, String> getCameraResolution() {
    }

    private float getEqualRate(Camera.Size size, float f2) {
    }

    public static synchronized AndroidCameraUtil getInstance() {
    }

    public boolean equalRate(Camera.Size size, float f2) {
    }

    public Camera.Size getPropPictureSize(List<Camera.Size> list, float f2, int i2) {
    }

    public Camera.Size getPropPreviewSize(List<Camera.Size> list, float f2, int i2) {
    }

    public List<Camera.Size> getPropPreviewSizeList(List<Camera.Size> list, float f2, int i2) {
    }

    public void printSupportFocusMode(Camera.Parameters parameters) {
    }

    public void printSupportPictureSize(Camera.Parameters parameters) {
    }

    public void printSupportPreviewSize(Camera.Parameters parameters) {
    }

    public Camera.Size getPropPreviewSize(List<Camera.Size> list, int i2, int i3) {
    }
}
