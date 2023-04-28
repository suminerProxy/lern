package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class PolylineOptions extends OverlayOptions {

    /* renamed from: a  reason: collision with root package name */
    public int f1775a;
    public boolean b;
    public Bundle c;

    /* renamed from: d  reason: collision with root package name */
    private int f1776d;

    /* renamed from: e  reason: collision with root package name */
    private List<LatLng> f1777e;

    /* renamed from: f  reason: collision with root package name */
    private List<Integer> f1778f;

    /* renamed from: g  reason: collision with root package name */
    private List<Integer> f1779g;

    /* renamed from: h  reason: collision with root package name */
    private int f1780h;

    /* renamed from: i  reason: collision with root package name */
    private BitmapDescriptor f1781i;

    /* renamed from: j  reason: collision with root package name */
    private List<BitmapDescriptor> f1782j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1783k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1784l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1785m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1786n;

    /* renamed from: o  reason: collision with root package name */
    private int f1787o;

    /* renamed from: p  reason: collision with root package name */
    private LineJoinType f1788p;
    private LineCapType q;
    private boolean r;
    private boolean s;
    private boolean t;
    private LineDirectionCross180 u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LineCapType {
        public static final LineCapType LineCapButt = null;
        public static final LineCapType LineCapRound = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ LineCapType[] f1789a = null;

        private LineCapType(String str, int i2) {
        }

        public static LineCapType valueOf(String str) {
        }

        public static LineCapType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LineDirectionCross180 {
        public static final LineDirectionCross180 FROM_EAST_TO_WEST = null;
        public static final LineDirectionCross180 FROM_WEST_TO_EAST = null;
        public static final LineDirectionCross180 NONE = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ LineDirectionCross180[] f1790a = null;

        private LineDirectionCross180(String str, int i2) {
        }

        public static LineDirectionCross180 valueOf(String str) {
        }

        public static LineDirectionCross180[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LineJoinType {
        public static final LineJoinType LineJoinBerzier = null;
        public static final LineJoinType LineJoinBevel = null;
        public static final LineJoinType LineJoinMiter = null;
        public static final LineJoinType LineJoinRound = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ LineJoinType[] f1791a = null;

        private LineJoinType(String str, int i2) {
        }

        public static LineJoinType valueOf(String str) {
        }

        public static LineJoinType[] values() {
        }
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
    }

    public PolylineOptions clickable(boolean z) {
    }

    public PolylineOptions color(int i2) {
    }

    public PolylineOptions colorsValues(List<Integer> list) {
    }

    public PolylineOptions customTexture(BitmapDescriptor bitmapDescriptor) {
    }

    public PolylineOptions customTextureList(List<BitmapDescriptor> list) {
    }

    public PolylineOptions dottedLine(boolean z) {
    }

    public PolylineOptions dottedLineType(PolylineDottedLineType polylineDottedLineType) {
    }

    public PolylineOptions extraInfo(Bundle bundle) {
    }

    public PolylineOptions focus(boolean z) {
    }

    public int getColor() {
    }

    public BitmapDescriptor getCustomTexture() {
    }

    public List<BitmapDescriptor> getCustomTextureList() {
    }

    public Bundle getExtraInfo() {
    }

    public List<LatLng> getPoints() {
    }

    public List<Integer> getTextureIndexs() {
    }

    public int getWidth() {
    }

    public int getZIndex() {
    }

    public boolean isDottedLine() {
    }

    public boolean isFocus() {
    }

    public PolylineOptions isGeodesic(boolean z) {
    }

    public PolylineOptions isGradient(boolean z) {
    }

    public PolylineOptions isThined(boolean z) {
    }

    public boolean isVisible() {
    }

    public PolylineOptions keepScale(boolean z) {
    }

    public PolylineOptions lineCapType(LineCapType lineCapType) {
    }

    public PolylineOptions lineDirectionCross180(LineDirectionCross180 lineDirectionCross180) {
    }

    public PolylineOptions lineJoinType(LineJoinType lineJoinType) {
    }

    public PolylineOptions points(List<LatLng> list) {
    }

    public PolylineOptions textureIndex(List<Integer> list) {
    }

    public PolylineOptions visible(boolean z) {
    }

    public PolylineOptions width(int i2) {
    }

    public PolylineOptions zIndex(int i2) {
    }

    private Polyline a(Polyline polyline) {
    }
}
