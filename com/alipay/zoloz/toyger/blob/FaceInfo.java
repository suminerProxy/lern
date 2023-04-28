package com.alipay.zoloz.toyger.blob;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FaceInfo {
    public float confidence;
    public String feaVersion;
    public String feature;
    public List<Point> points;
    public float quality;
    public Rect rect;

    public FaceInfo() {
    }

    public FaceInfo(Rect rect, List<Point> list, float f2, float f3, String str, String str2) {
    }
}
