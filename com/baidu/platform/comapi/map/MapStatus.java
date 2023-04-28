package com.baidu.platform.comapi.map;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MapStatus implements Serializable {
    public int animationTime;
    public int animationType;
    public boolean bOverlookSpringback;
    public boolean bfpp;
    public double centerPtX;
    public double centerPtY;
    public double centerPtZ;
    public GeoBound geoRound;
    public int hasAnimation;
    public boolean isBirdEye;
    public float level;
    public int minOverlooking;
    public int overlooking;
    public String panoId;
    public float roadOffsetX;
    public float roadOffsetY;
    public int rotation;
    public int streetExt;
    public float streetIndicateAngle;
    public WinRound winRound;
    public float xOffset;
    public float yOffset;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class GeoBound implements Serializable {
        public long bottom;
        public long left;
        public long right;

        /* renamed from: top  reason: collision with root package name */
        public long f2573top;

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class WinRound implements Serializable {
        public int bottom;
        public int left;
        public int right;

        /* renamed from: top  reason: collision with root package name */
        public int f2574top;

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }
    }

    public MapStatus() {
    }

    public boolean equals(Object obj) {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public MapStatus(MapStatus mapStatus) {
    }
}
