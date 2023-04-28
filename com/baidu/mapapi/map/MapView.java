package com.baidu.mapapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.platform.comapi.map.MapSurfaceView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MapView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1678a = null;
    private static String b;
    private static int c;

    /* renamed from: d  reason: collision with root package name */
    private static int f1679d;
    private static final SparseIntArray q = null;
    private int A;
    private boolean B;

    /* renamed from: e  reason: collision with root package name */
    private MapSurfaceView f1680e;

    /* renamed from: f  reason: collision with root package name */
    private BaiduMap f1681f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f1682g;

    /* renamed from: h  reason: collision with root package name */
    private Bitmap f1683h;

    /* renamed from: i  reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.ac f1684i;

    /* renamed from: j  reason: collision with root package name */
    private Point f1685j;

    /* renamed from: k  reason: collision with root package name */
    private Point f1686k;

    /* renamed from: l  reason: collision with root package name */
    private RelativeLayout f1687l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f1688m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f1689n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f1690o;

    /* renamed from: p  reason: collision with root package name */
    private Context f1691p;
    private int r;
    private boolean s;
    private boolean t;
    private float u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public MapView(Context context) {
    }

    public static /* synthetic */ float a(MapView mapView, float f2) {
    }

    public static /* synthetic */ MapSurfaceView b(MapView mapView) {
    }

    public static /* synthetic */ float c(MapView mapView) {
    }

    public static /* synthetic */ ImageView d(MapView mapView) {
    }

    public static /* synthetic */ TextView e(MapView mapView) {
    }

    public static /* synthetic */ TextView f(MapView mapView) {
    }

    public static /* synthetic */ void g(MapView mapView) {
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

    public void cancelRenderMap() {
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

    public Point getZoomControlsPosition() {
    }

    public boolean handleMultiTouch(float f2, float f3, float f4, float f5) {
    }

    public void handleTouchDown(float f2, float f3) {
    }

    public boolean handleTouchMove(float f2, float f3) {
    }

    public boolean handleTouchUp(float f2, float f3) {
    }

    public boolean inRangeOfView(float f2, float f3) {
    }

    public boolean isShowScaleControl() {
    }

    public void onCreate(Context context, Bundle bundle) {
    }

    public final void onDestroy() {
    }

    @Override // android.view.ViewGroup, android.view.View
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

    public void renderMap() {
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

    public void setUpViewEventToMapView(MotionEvent motionEvent) {
    }

    public final void setZOrderMediaOverlay(boolean z) {
    }

    public void setZoomControlsPosition(Point point) {
    }

    public void showScaleControl(boolean z) {
    }

    public void showZoomControls(boolean z) {
    }

    public static /* synthetic */ SparseIntArray a() {
    }

    private void b(Context context) {
    }

    private void c(Context context) {
    }

    public static /* synthetic */ void a(MapView mapView, String str, MapCustomStyleOptions mapCustomStyleOptions) {
    }

    public static /* synthetic */ void a(MapView mapView, String str, String str2) {
    }

    public static /* synthetic */ boolean a(MapView mapView) {
    }

    public static /* synthetic */ boolean a(MapView mapView, boolean z) {
    }

    public MapView(Context context, AttributeSet attributeSet) {
    }

    private void a(String str, MapCustomStyleOptions mapCustomStyleOptions) {
    }

    private void b() {
    }

    public MapView(Context context, AttributeSet attributeSet, int i2) {
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions) {
    }

    public MapView(Context context, BaiduMapOptions baiduMapOptions) {
    }

    private void a(Context context, BaiduMapOptions baiduMapOptions, String str, int i2) {
    }

    private void a(Context context) {
    }

    private boolean c() {
    }

    private void a(View view) {
    }

    private void a(String str, String str2) {
    }
}
