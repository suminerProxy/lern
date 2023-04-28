package com.baidu.mapapi.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.platform.comapi.map.MapTextureView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TextureMapView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1838a = null;

    /* renamed from: i  reason: collision with root package name */
    private static String f1839i;

    /* renamed from: j  reason: collision with root package name */
    private static int f1840j;

    /* renamed from: k  reason: collision with root package name */
    private static int f1841k;
    private static final SparseArray<Integer> q = null;
    private int A;
    private boolean B;
    private MapTextureView b;
    private BaiduMap c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f1842d;

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f1843e;

    /* renamed from: f  reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.ac f1844f;

    /* renamed from: g  reason: collision with root package name */
    private Point f1845g;

    /* renamed from: h  reason: collision with root package name */
    private Point f1846h;

    /* renamed from: l  reason: collision with root package name */
    private RelativeLayout f1847l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f1848m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f1849n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f1850o;

    /* renamed from: p  reason: collision with root package name */
    private Context f1851p;
    private float r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public TextureMapView(Context context) {
    }

    public static /* synthetic */ float a(TextureMapView textureMapView, float f2) {
    }

    public static /* synthetic */ MapTextureView b(TextureMapView textureMapView) {
    }

    public static /* synthetic */ float c(TextureMapView textureMapView) {
    }

    public static /* synthetic */ ImageView d(TextureMapView textureMapView) {
    }

    public static /* synthetic */ TextView e(TextureMapView textureMapView) {
    }

    public static /* synthetic */ TextView f(TextureMapView textureMapView) {
    }

    public static /* synthetic */ void g(TextureMapView textureMapView) {
    }

    @Deprecated
    public static void setCustomMapStylePath(String str) {
    }

    @Deprecated
    public static void setIconCustom(int i2) {
    }

    @Deprecated
    public static void setLoadCustomMapStyleFileMode(int i2) {
    }

    @Deprecated
    public static void setMapCustomEnable(boolean z) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
    }

    public final LogoPosition getLogoPosition() {
    }

    public final BaiduMap getMap() {
    }

    public final int getMapLevel() {
    }

    public Point getScaleControlPosition() {
    }

    public int getScaleControlViewHeight() {
    }

    public int getScaleControlViewWidth() {
    }

    public void onCreate(Context context, Bundle bundle) {
    }

    public final void onDestroy() {
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"NewApi"})
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
    }

    public void setCustomStyleFilePathAndMode(String str, int i2) {
    }

    public final void setLogoPosition(LogoPosition logoPosition) {
    }

    public void setMapCustomStyle(MapCustomStyleOptions mapCustomStyleOptions, CustomMapStyleCallBack customMapStyleCallBack) {
    }

    public void setMapCustomStyleEnable(boolean z) {
    }

    public void setMapCustomStylePath(String str) {
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setScaleControlPosition(Point point) {
    }

    public void setZoomControlsPosition(Point point) {
    }

    public void showScaleControl(boolean z) {
    }

    public void showZoomControls(boolean z) {
    }

    public static /* synthetic */ SparseArray a() {
    }

    private void b(Context context) {
    }

    private void c(Context context) {
    }

    public static /* synthetic */ void a(TextureMapView textureMapView, String str, MapCustomStyleOptions mapCustomStyleOptions) {
    }

    public static /* synthetic */ void a(TextureMapView textureMapView, String str, String str2) {
    }

    public static /* synthetic */ boolean a(TextureMapView textureMapView) {
    }

    public static /* synthetic */ boolean a(TextureMapView textureMapView, boolean z) {
    }

    public TextureMapView(Context context, AttributeSet attributeSet) {
    }

    private void a(String str, MapCustomStyleOptions mapCustomStyleOptions) {
    }

    private void b() {
    }

    public TextureMapView(Context context, AttributeSet attributeSet, int i2) {
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
    }

    public TextureMapView(Context context, BaiduMapOptions baiduMapOptions) {
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str, int i2) {
    }

    private void a(Context context) {
    }

    private void a(View view) {
    }

    private void a(String str, String str2) {
    }
}
