package com.baidu.platform.comapi.map;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.OverlayItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ItemizedOverlay<Item extends OverlayItem> extends Overlay implements Comparator<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<OverlayItem> f2539a;
    public ArrayList<Integer> b;
    public Drawable c;

    /* renamed from: d  reason: collision with root package name */
    public MapSurfaceView f2540d;

    /* renamed from: e  reason: collision with root package name */
    public MapTextureView f2541e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2542f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f2543g;

    /* renamed from: h  reason: collision with root package name */
    public OverlayItem f2544h;

    /* renamed from: i  reason: collision with root package name */
    public int f2545i;

    /* renamed from: j  reason: collision with root package name */
    public int f2546j;

    public ItemizedOverlay(Drawable drawable, MapSurfaceView mapSurfaceView) {
    }

    private void a(List<OverlayItem> list, boolean z) {
    }

    private int b(boolean z) {
    }

    private int c() {
    }

    public void addItem(OverlayItem overlayItem) {
    }

    public void addItemsByReplace(List<OverlayItem> list) {
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Integer num, Integer num2) {
    }

    public ArrayList<OverlayItem> getAllItem() {
    }

    public GeoPoint getCenter() {
    }

    public final OverlayItem getItem(int i2) {
    }

    public int getLatSpanE6() {
    }

    public int getLonSpanE6() {
    }

    public int getUpdateType() {
    }

    public void initLayer() {
    }

    public boolean onTap(int i2) {
    }

    public boolean onTap(int i2, int i3, GeoPoint geoPoint) {
    }

    public boolean onTap(GeoPoint geoPoint, MapSurfaceView mapSurfaceView) {
    }

    public boolean removeAll() {
    }

    public boolean removeItem(OverlayItem overlayItem) {
    }

    public boolean removeOneItem(Iterator<OverlayItem> it, OverlayItem overlayItem) {
    }

    public void setFocus(int i2, boolean z) {
    }

    public void setFocusMarker(Drawable drawable) {
    }

    public void setUpdateType(int i2) {
    }

    public void setmMarker(Drawable drawable) {
    }

    public synchronized int size() {
    }

    public boolean updateItem(OverlayItem overlayItem) {
    }

    private void a(List<OverlayItem> list, boolean z, boolean z2) {
    }

    /* renamed from: compare  reason: avoid collision after fix types in other method */
    public int compare2(Integer num, Integer num2) {
    }

    public void addItem(List<OverlayItem> list) {
    }

    public void setFocusMarker(Drawable drawable, float f2, float f3) {
    }

    public ItemizedOverlay(Drawable drawable, MapTextureView mapTextureView) {
    }

    public boolean updateItem(List<OverlayItem> list) {
    }

    public boolean b() {
    }

    public String[] a(ArrayList<Bundle> arrayList) {
    }

    public int a(int i2) {
    }

    public void a() {
    }

    public synchronized void a(boolean z) {
    }

    public boolean a(OverlayItem overlayItem) {
    }
}
