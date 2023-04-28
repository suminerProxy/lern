package com.baidu.mapapi.map;

import android.graphics.Point;
import android.view.ViewGroup;
import com.baidu.mapapi.model.LatLng;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MapViewLayoutParams extends ViewGroup.LayoutParams {
    public static final int ALIGN_BOTTOM = 16;
    public static final int ALIGN_CENTER_HORIZONTAL = 4;
    public static final int ALIGN_CENTER_VERTICAL = 32;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_TOP = 8;

    /* renamed from: a  reason: collision with root package name */
    public LatLng f1692a;
    public Point b;
    public ELayoutMode c;

    /* renamed from: d  reason: collision with root package name */
    public float f1693d;

    /* renamed from: e  reason: collision with root package name */
    public float f1694e;

    /* renamed from: f  reason: collision with root package name */
    public int f1695f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private int f1696a;
        private int b;
        private LatLng c;

        /* renamed from: d  reason: collision with root package name */
        private Point f1697d;

        /* renamed from: e  reason: collision with root package name */
        private ELayoutMode f1698e;

        /* renamed from: f  reason: collision with root package name */
        private int f1699f;

        /* renamed from: g  reason: collision with root package name */
        private int f1700g;

        /* renamed from: h  reason: collision with root package name */
        private int f1701h;

        public Builder align(int i2, int i3) {
        }

        public MapViewLayoutParams build() {
        }

        public Builder height(int i2) {
        }

        public Builder layoutMode(ELayoutMode eLayoutMode) {
        }

        public Builder point(Point point) {
        }

        public Builder position(LatLng latLng) {
        }

        public Builder width(int i2) {
        }

        public Builder yOffset(int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ELayoutMode {
        private static final /* synthetic */ ELayoutMode[] $VALUES = null;
        public static final ELayoutMode absoluteMode = null;
        public static final ELayoutMode mapMode = null;

        private ELayoutMode(String str, int i2) {
        }

        public static ELayoutMode valueOf(String str) {
        }

        public static ELayoutMode[] values() {
        }
    }

    public MapViewLayoutParams(int i2, int i3, LatLng latLng, Point point, ELayoutMode eLayoutMode, int i4, int i5, int i6) {
    }
}
