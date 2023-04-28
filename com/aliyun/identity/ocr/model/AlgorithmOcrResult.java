package com.aliyun.identity.ocr.model;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AlgorithmOcrResult {
    public int cost;
    public List<AlgorithmOcrItem> results;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AlgorithmOcrItem {
        public float conf;
        public String label;
        public List<AlgorithmOcrItemPoint> points;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class AlgorithmOcrItemPoint {
        public float x;
        public float y;
    }
}
