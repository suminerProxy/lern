package com.baidu.mapapi.map;

import android.view.View;
import com.baidu.mapapi.model.LatLng;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class InfoWindow {

    /* renamed from: a  reason: collision with root package name */
    public String f1635a;
    public BitmapDescriptor b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public LatLng f1636d;

    /* renamed from: e  reason: collision with root package name */
    public OnInfoWindowClickListener f1637e;

    /* renamed from: f  reason: collision with root package name */
    public a f1638f;

    /* renamed from: g  reason: collision with root package name */
    public int f1639g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1640h;

    /* renamed from: i  reason: collision with root package name */
    public int f1641i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1642j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1643k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1644l;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnInfoWindowClickListener {
        void onInfoWindowClick();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a {
        void a(InfoWindow infoWindow);

        void b(InfoWindow infoWindow);
    }

    public InfoWindow(View view, LatLng latLng, int i2) {
    }

    public BitmapDescriptor getBitmapDescriptor() {
    }

    public LatLng getPosition() {
    }

    public String getTag() {
    }

    public View getView() {
    }

    public int getYOffset() {
    }

    public void setBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
    }

    public void setPosition(LatLng latLng) {
    }

    public void setTag(String str) {
    }

    public void setView(View view) {
    }

    public void setYOffset(int i2) {
    }

    public InfoWindow(BitmapDescriptor bitmapDescriptor, LatLng latLng, int i2, OnInfoWindowClickListener onInfoWindowClickListener) {
    }

    public InfoWindow(View view, LatLng latLng, int i2, boolean z, int i3) {
    }
}
