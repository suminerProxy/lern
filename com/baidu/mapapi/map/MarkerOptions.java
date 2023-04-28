package com.baidu.mapapi.map;

import android.graphics.Point;
import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MarkerOptions extends OverlayOptions {

    /* renamed from: a  reason: collision with root package name */
    public int f1716a;
    public boolean b;
    public Bundle c;

    /* renamed from: d  reason: collision with root package name */
    private LatLng f1717d;

    /* renamed from: e  reason: collision with root package name */
    private BitmapDescriptor f1718e;

    /* renamed from: f  reason: collision with root package name */
    private float f1719f;

    /* renamed from: g  reason: collision with root package name */
    private float f1720g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1721h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1722i;

    /* renamed from: j  reason: collision with root package name */
    private float f1723j;

    /* renamed from: k  reason: collision with root package name */
    private String f1724k;

    /* renamed from: l  reason: collision with root package name */
    private int f1725l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1726m;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<BitmapDescriptor> f1727n;

    /* renamed from: o  reason: collision with root package name */
    private int f1728o;

    /* renamed from: p  reason: collision with root package name */
    private float f1729p;
    private float q;
    private float r;
    private int s;
    private boolean t;
    private Point u;
    private boolean v;
    private InfoWindow w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class MarkerAnimateType {

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ MarkerAnimateType[] f1730a = null;
        public static final MarkerAnimateType drop = null;
        public static final MarkerAnimateType grow = null;
        public static final MarkerAnimateType jump = null;
        public static final MarkerAnimateType none = null;

        private MarkerAnimateType(String str, int i2) {
        }

        public static MarkerAnimateType valueOf(String str) {
        }

        public static MarkerAnimateType[] values() {
        }
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay a() {
    }

    public MarkerOptions alpha(float f2) {
    }

    public MarkerOptions anchor(float f2, float f3) {
    }

    public MarkerOptions animateType(MarkerAnimateType markerAnimateType) {
    }

    public MarkerOptions clickable(boolean z) {
    }

    public MarkerOptions draggable(boolean z) {
    }

    public MarkerOptions extraInfo(Bundle bundle) {
    }

    public MarkerOptions fixedScreenPosition(Point point) {
    }

    public MarkerOptions flat(boolean z) {
    }

    public float getAlpha() {
    }

    public float getAnchorX() {
    }

    public float getAnchorY() {
    }

    public MarkerAnimateType getAnimateType() {
    }

    public Bundle getExtraInfo() {
    }

    public BitmapDescriptor getIcon() {
    }

    public ArrayList<BitmapDescriptor> getIcons() {
    }

    public int getPeriod() {
    }

    public LatLng getPosition() {
    }

    public float getRotate() {
    }

    @Deprecated
    public String getTitle() {
    }

    public int getZIndex() {
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
    }

    public MarkerOptions icons(ArrayList<BitmapDescriptor> arrayList) {
    }

    public MarkerOptions infoWindow(InfoWindow infoWindow) {
    }

    public boolean isDraggable() {
    }

    public boolean isFlat() {
    }

    public boolean isPerspective() {
    }

    public boolean isVisible() {
    }

    public MarkerOptions period(int i2) {
    }

    public MarkerOptions perspective(boolean z) {
    }

    public MarkerOptions position(LatLng latLng) {
    }

    public MarkerOptions rotate(float f2) {
    }

    public MarkerOptions scaleX(float f2) {
    }

    public MarkerOptions scaleY(float f2) {
    }

    @Deprecated
    public MarkerOptions title(String str) {
    }

    public MarkerOptions visible(boolean z) {
    }

    public MarkerOptions yOffset(int i2) {
    }

    public MarkerOptions zIndex(int i2) {
    }
}
