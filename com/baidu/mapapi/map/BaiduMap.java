package com.baidu.mapapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.map.track.TraceAnimationListener;
import com.baidu.mapapi.map.track.TraceOptions;
import com.baidu.mapapi.map.track.TraceOverlay;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.MapTextureView;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BaiduMap {
    public static final int MAP_TYPE_NONE = 3;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final float REAL_MAX_ZOOM_LEVEL = 21.0f;
    public static final float REAL_MIN_ZOOM_LEVEL = 4.0f;

    /* renamed from: e  reason: collision with root package name */
    private static final String f1542e = "BaiduMap";
    public static int mapStatusReason = 256;
    private OnMarkerDragListener A;
    private OnMyLocationClickListener B;
    private SnapshotReadyCallback C;
    private OnMapDrawFrameCallback D;
    private OnBaseIndoorMapListener E;
    private OnMapRenderValidDataListener F;
    private OnSynchronizationListener G;
    private TileOverlay H;
    private HeatMap I;
    private Lock J;
    private Lock K;
    private Map<String, InfoWindow> L;
    private Map<InfoWindow, Marker> M;
    private Marker N;
    private MyLocationData O;
    private MyLocationConfiguration P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private Point U;
    private volatile boolean V;
    private com.baidu.mapsdkplatform.comapi.map.a.c W;

    /* renamed from: a  reason: collision with root package name */
    public MapView f1543a;
    public TextureMapView b;
    public WearMapView c;

    /* renamed from: d  reason: collision with root package name */
    public com.baidu.mapsdkplatform.comapi.map.v f1544d;

    /* renamed from: f  reason: collision with root package name */
    private Projection f1545f;

    /* renamed from: g  reason: collision with root package name */
    private UiSettings f1546g;

    /* renamed from: h  reason: collision with root package name */
    private MapSurfaceView f1547h;

    /* renamed from: i  reason: collision with root package name */
    private MapTextureView f1548i;

    /* renamed from: j  reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.c f1549j;

    /* renamed from: k  reason: collision with root package name */
    private List<Overlay> f1550k;

    /* renamed from: l  reason: collision with root package name */
    private List<Marker> f1551l;

    /* renamed from: m  reason: collision with root package name */
    private List<Marker> f1552m;

    /* renamed from: n  reason: collision with root package name */
    private List<InfoWindow> f1553n;

    /* renamed from: o  reason: collision with root package name */
    private Overlay.a f1554o;

    /* renamed from: p  reason: collision with root package name */
    private InfoWindow.a f1555p;
    private OnMapStatusChangeListener q;
    private OnMapTouchListener r;
    private OnMapClickListener s;
    private OnMapLoadedCallback t;
    private OnMapRenderCallback u;
    private OnMapDoubleClickListener v;
    private OnMapLongClickListener w;
    private CopyOnWriteArrayList<OnMarkerClickListener> x;
    private CopyOnWriteArrayList<OnPolylineClickListener> y;
    private CopyOnWriteArrayList<OnMultiPointClickListener> z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnBaseIndoorMapListener {
        void onBaseIndoorMapMode(boolean z, MapBaseIndoorMapInfo mapBaseIndoorMapInfo);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);

        void onMapPoiClick(MapPoi mapPoi);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapDoubleClickListener {
        void onMapDoubleClick(LatLng latLng);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapDrawFrameCallback {
        void onMapDrawFrame(MapStatus mapStatus);

        @Deprecated
        void onMapDrawFrame(GL10 gl10, MapStatus mapStatus);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapRenderCallback {
        void onMapRenderFinished();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapRenderValidDataListener {
        void onMapRenderValidData(boolean z, int i2, String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapStatusChangeListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onMapStatusChange(MapStatus mapStatus);

        void onMapStatusChangeFinish(MapStatus mapStatus);

        void onMapStatusChangeStart(MapStatus mapStatus);

        void onMapStatusChangeStart(MapStatus mapStatus, int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMapTouchListener {
        void onTouch(MotionEvent motionEvent);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMultiPointClickListener {
        boolean onMultiPointClick(MultiPoint multiPoint, MultiPointItem multiPointItem);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnMyLocationClickListener {
        boolean onMyLocationClick();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnPolylineClickListener {
        boolean onPolylineClick(Polyline polyline);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnSynchronizationListener {
        void onMapStatusChangeReason(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    public BaiduMap(Context context, MapTextureView mapTextureView, com.baidu.mapsdkplatform.comapi.map.u uVar) {
    }

    public static /* synthetic */ Lock A(BaiduMap baiduMap) {
    }

    public static /* synthetic */ TileOverlay B(BaiduMap baiduMap) {
    }

    public static /* synthetic */ SnapshotReadyCallback C(BaiduMap baiduMap) {
    }

    public static /* synthetic */ Marker a(BaiduMap baiduMap, Marker marker) {
    }

    private String a(int i2) {
    }

    public static /* synthetic */ List b(BaiduMap baiduMap) {
    }

    public static /* synthetic */ com.baidu.mapsdkplatform.comapi.map.c c(BaiduMap baiduMap) {
    }

    public static /* synthetic */ List d(BaiduMap baiduMap) {
    }

    public static /* synthetic */ List e(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapStatusChangeListener f(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnSynchronizationListener g(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapTouchListener h(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapClickListener i(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapDoubleClickListener j(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapLongClickListener k(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapLoadedCallback l(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapRenderCallback m(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMyLocationClickListener n(BaiduMap baiduMap) {
    }

    public static /* synthetic */ Map o(BaiduMap baiduMap) {
    }

    public static /* synthetic */ CopyOnWriteArrayList p(BaiduMap baiduMap) {
    }

    public static /* synthetic */ CopyOnWriteArrayList q(BaiduMap baiduMap) {
    }

    public static /* synthetic */ CopyOnWriteArrayList r(BaiduMap baiduMap) {
    }

    public static /* synthetic */ Marker s(BaiduMap baiduMap) {
    }

    public static /* synthetic */ Projection t(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMarkerDragListener u(BaiduMap baiduMap) {
    }

    public static /* synthetic */ Lock v(BaiduMap baiduMap) {
    }

    public static /* synthetic */ HeatMap w(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapDrawFrameCallback x(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnBaseIndoorMapListener y(BaiduMap baiduMap) {
    }

    public static /* synthetic */ OnMapRenderValidDataListener z(BaiduMap baiduMap) {
    }

    public void addHeatMap(HeatMap heatMap) {
    }

    public final Overlay addOverlay(OverlayOptions overlayOptions) {
    }

    public final List<Overlay> addOverlays(List<OverlayOptions> list) {
    }

    public TileOverlay addTileLayer(TileOverlayOptions tileOverlayOptions) {
    }

    public final TraceOverlay addTraceOverlay(TraceOptions traceOptions, TraceAnimationListener traceAnimationListener) {
    }

    public final void animateMapStatus(MapStatusUpdate mapStatusUpdate, int i2) {
    }

    public void changeLocationLayerOrder(boolean z) {
    }

    public void cleanCache(int i2) {
    }

    public final void clear() {
    }

    public List<InfoWindow> getAllInfoWindows() {
    }

    public final Point getCompassPosition() {
    }

    public MapBaseIndoorMapInfo getFocusedBaseIndoorMapInfo() {
    }

    public final int getFontSizeLevel() {
    }

    public MapSurfaceView getGLMapView() {
    }

    @Deprecated
    public final MyLocationConfiguration getLocationConfigeration() {
    }

    public final MyLocationConfiguration getLocationConfiguration() {
    }

    public final MyLocationData getLocationData() {
    }

    public final String getMapApprovalNumber() {
    }

    public MapLanguage getMapLanguage() {
    }

    public final MapStatus getMapStatus() {
    }

    public final LatLngBounds getMapStatusLimit() {
    }

    public MapTextureView getMapTextureView() {
    }

    public final int getMapType() {
    }

    public List<Marker> getMarkersInBounds(LatLngBounds latLngBounds) {
    }

    public final float getMaxZoomLevel() {
    }

    public final float getMinZoomLevel() {
    }

    public final Projection getProjection() {
    }

    public float[] getProjectionMatrix() {
    }

    public final UiSettings getUiSettings() {
    }

    public float[] getViewMatrix() {
    }

    public float getZoomToBound(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    @Deprecated
    public MapSurfaceView getmGLMapView() {
    }

    public void hideInfoWindow() {
    }

    public void hideSDKLayer() {
    }

    public final boolean isBaiduHeatMapEnabled() {
    }

    public boolean isBaseIndoorMapMode() {
    }

    public final boolean isBuildingsEnabled() {
    }

    public final boolean isMyLocationEnabled() {
    }

    public final boolean isShowMapPoi() {
    }

    public final boolean isSupportBaiduHeatMap() {
    }

    public final boolean isTrafficEnabled() {
    }

    public final void removeMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
    }

    public void removeOverLays(List<Overlay> list) {
    }

    public final void setBaiduHeatMapEnabled(boolean z) {
    }

    public final void setBuildingsEnabled(boolean z) {
    }

    public void setCompassEnable(boolean z) {
    }

    public void setCompassIcon(Bitmap bitmap) {
    }

    public void setCompassPosition(Point point) {
    }

    @Deprecated
    public boolean setCustomTrafficColor(String str, String str2, String str3, String str4) {
    }

    public final void setFontSizeLevel(int i2) {
    }

    public final void setIndoorEnable(boolean z) {
    }

    public void setLayerClickable(MapLayer mapLayer, boolean z) {
    }

    public final void setMapLanguage(MapLanguage mapLanguage) {
    }

    public final void setMapStatus(MapStatusUpdate mapStatusUpdate) {
    }

    public final void setMapStatusLimits(LatLngBounds latLngBounds) {
    }

    public final void setMapType(int i2) {
    }

    public final void setMaxAndMinZoomLevel(float f2, float f3) {
    }

    @Deprecated
    public final void setMyLocationConfigeration(MyLocationConfiguration myLocationConfiguration) {
    }

    public final void setMyLocationConfiguration(MyLocationConfiguration myLocationConfiguration) {
    }

    public final void setMyLocationData(MyLocationData myLocationData) {
    }

    public final void setMyLocationEnabled(boolean z) {
    }

    public final void setOnBaseIndoorMapListener(OnBaseIndoorMapListener onBaseIndoorMapListener) {
    }

    public final void setOnMapClickListener(OnMapClickListener onMapClickListener) {
    }

    public final void setOnMapDoubleClickListener(OnMapDoubleClickListener onMapDoubleClickListener) {
    }

    public final void setOnMapDrawFrameCallback(OnMapDrawFrameCallback onMapDrawFrameCallback) {
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onMapLoadedCallback) {
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
    }

    public void setOnMapRenderCallbadk(OnMapRenderCallback onMapRenderCallback) {
    }

    public final void setOnMapRenderValidDataListener(OnMapRenderValidDataListener onMapRenderValidDataListener) {
    }

    public final void setOnMapStatusChangeListener(OnMapStatusChangeListener onMapStatusChangeListener) {
    }

    public final void setOnMapTouchListener(OnMapTouchListener onMapTouchListener) {
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
    }

    public final void setOnMultiPointClickListener(OnMultiPointClickListener onMultiPointClickListener) {
    }

    public final void setOnMyLocationClickListener(OnMyLocationClickListener onMyLocationClickListener) {
    }

    public final void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
    }

    public final void setOnSynchronizationListener(OnSynchronizationListener onSynchronizationListener) {
    }

    public void setOverlayUnderPoi(boolean z) {
    }

    @Deprecated
    public final void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPixelFormatTransparent(boolean z) {
    }

    public final void setTrafficEnabled(boolean z) {
    }

    public final void setViewPadding(int i2, int i3, int i4, int i5) {
    }

    public void showInfoWindow(InfoWindow infoWindow) {
    }

    public void showInfoWindows(List<InfoWindow> list) {
    }

    public final void showMapIndoorPoi(boolean z) {
    }

    public final void showMapPoi(boolean z) {
    }

    public void showOperateLayer(boolean z) {
    }

    public void showSDKLayer() {
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
    }

    public final void snapshotScope(Rect rect, SnapshotReadyCallback snapshotReadyCallback) {
    }

    public MapBaseIndoorMapInfo.SwitchFloorError switchBaseIndoorMapFloor(String str, String str2) {
    }

    public void switchLayerOrder(MapLayer mapLayer, MapLayer mapLayer2) {
    }

    public static /* synthetic */ Projection a(BaiduMap baiduMap, Projection projection) {
    }

    private BitmapDescriptor b(InfoWindow infoWindow) {
    }

    private void d() {
    }

    public void c() {
    }

    public void showInfoWindow(InfoWindow infoWindow, boolean z) {
    }

    public static /* synthetic */ String a(BaiduMap baiduMap, int i2) {
    }

    public static /* synthetic */ void a(BaiduMap baiduMap, InfoWindow infoWindow) {
    }

    public static /* synthetic */ boolean a(BaiduMap baiduMap) {
    }

    public static /* synthetic */ boolean a(BaiduMap baiduMap, boolean z) {
    }

    private com.baidu.mapsdkplatform.comapi.map.w a(MapStatusUpdate mapStatusUpdate) {
    }

    public final void animateMapStatus(MapStatusUpdate mapStatusUpdate) {
    }

    public boolean b() {
    }

    private final void a(MyLocationData myLocationData, MyLocationConfiguration myLocationConfiguration) {
    }

    public BaiduMap(Context context, MapSurfaceView mapSurfaceView, com.baidu.mapsdkplatform.comapi.map.u uVar) {
    }

    public void hideInfoWindow(InfoWindow infoWindow) {
    }

    public void a(HeatMap heatMap) {
    }

    public void a() {
    }

    private Point a(String str) {
    }

    private void a(InfoWindow infoWindow) {
    }

    public void a(TileOverlay tileOverlay) {
    }
}
