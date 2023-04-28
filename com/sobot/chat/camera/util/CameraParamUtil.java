package com.sobot.chat.camera.util;

import android.content.Context;
import android.hardware.Camera;
import java.util.Comparator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CameraParamUtil {
    private static final String TAG = "JCameraView";
    private static CameraParamUtil cameraParamUtil;
    private CameraSizeComparator sizeComparator;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class CameraSizeComparator implements Comparator<Camera.Size> {
        public final /* synthetic */ CameraParamUtil this$0;

        private CameraSizeComparator(CameraParamUtil cameraParamUtil) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Camera.Size size, Camera.Size size2) {
        }

        public /* synthetic */ CameraSizeComparator(CameraParamUtil cameraParamUtil, AnonymousClass1 anonymousClass1) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(Camera.Size size, Camera.Size size2) {
        }
    }

    private CameraParamUtil() {
    }

    private boolean equalRate(Camera.Size size, float f2) {
    }

    private Camera.Size getBestSize(List<Camera.Size> list, float f2) {
    }

    public static CameraParamUtil getInstance() {
    }

    public int getCameraDisplayOrientation(Context context, int i2) {
    }

    public Camera.Size getPictureSize(List<Camera.Size> list, int i2, float f2) {
    }

    public Camera.Size getPreviewSize(List<Camera.Size> list, int i2, float f2) {
    }

    public Camera.Size getSmallPictureSize(Camera camera) {
    }

    public boolean isSupportedFocusMode(List<String> list, String str) {
    }

    public boolean isSupportedPictureFormats(List<Integer> list, int i2) {
    }
}
