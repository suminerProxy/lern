package com.baidu.mapapi.map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MyLocationConfiguration {
    public int accuracyCircleFillColor;
    public int accuracyCircleStrokeColor;
    public final BitmapDescriptor customMarker;
    public final boolean enableDirection;
    public final LocationMode locationMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LocationMode {
        public static final LocationMode COMPASS = null;
        public static final LocationMode FOLLOWING = null;
        public static final LocationMode NORMAL = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ LocationMode[] f1741a = null;

        private LocationMode(String str, int i2) {
        }

        public static LocationMode valueOf(String str) {
        }

        public static LocationMode[] values() {
        }
    }

    public MyLocationConfiguration(LocationMode locationMode, boolean z, BitmapDescriptor bitmapDescriptor, int i2, int i3) {
    }

    private int a(int i2) {
    }

    public MyLocationConfiguration(LocationMode locationMode, boolean z, BitmapDescriptor bitmapDescriptor) {
    }
}
