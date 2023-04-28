package com.baidu.platform.comapi.map;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import java.lang.ref.SoftReference;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MapController {
    public static final String ANDROID_SDK_LAYER_TAG = "android_sdk";
    public static final String CITY_AREA_TAG = "cityarea";
    public static final String COMPASS_LAYER_TAG = "compass";
    public static final String DEFAULT_LAYER_TAG = "default";
    public static final String DYNAMIC_MAP_LAYER_TAG = "dynamicmap";
    public static final String FOOTSURFACE_LAYER_TAG = "footsurface";
    public static final String HEATMAP_LAYER_TAG = "heatmap";
    public static final String ITEM_LAYER_TAG = "item";
    public static final String ITSROUTE_LAYER_TAG = "itsroute";
    public static final String LOCAL_LIMIT_MAP_LAYER_TAG = "dynamiclimit";
    public static final String LOCATION_LAYER_TAG = "location";
    public static final int MSG_LONGLINK_CONNECT = 1;
    public static final int MSG_LONGLINK_DISCONNECT = 2;
    private static long O = 0;
    public static final String POISON_LAYER_TAG = "poison";
    public static final String POPUP_LAYER_TAG = "popup";
    public static final String RTPOPUP_LAYER_TAG = "rtpopup";
    public static final String RT_POPUP_LAYER_TAG = "rtpopup";
    public static final String SHARELOCATION_BUBBLE = "smshare";
    public static final String STREETPOPUP_LAYER_TAG = "streetpopup";
    public static final String STREETROUTE_LAYER_TAG = "streetroute";
    private static List<AppBaseMap> T = null;
    public static boolean isCompass = false;

    /* renamed from: j  reason: collision with root package name */
    private static final String f2548j = "MapController";
    public static boolean mLocIconOnScreen = true;
    public static boolean m_registered_SENSOR_ORIENTATION = false;
    private static boolean w = true;
    private static float x;
    private static float y;
    private static boolean z;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private a E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private float J;
    private float K;
    private float L;
    private long M;
    private boolean N;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private long U;
    private boolean V;
    private boolean W;
    private com.baidu.platform.comapi.map.b.b X;
    private MapControlMode Y;

    /* renamed from: a  reason: collision with root package name */
    public int f2549a;
    public MapViewListener b;
    public CaptureMapListener c;

    /* renamed from: d  reason: collision with root package name */
    public k f2550d;

    /* renamed from: e  reason: collision with root package name */
    public am f2551e;

    /* renamed from: f  reason: collision with root package name */
    public MapRenderModeChangeListener f2552f;

    /* renamed from: g  reason: collision with root package name */
    public EngineMsgListener f2553g;

    /* renamed from: h  reason: collision with root package name */
    public SoftReference<MapViewInterface> f2554h;

    /* renamed from: i  reason: collision with root package name */
    public NaviMapViewListener f2555i;

    /* renamed from: k  reason: collision with root package name */
    private com.baidu.platform.comapi.map.b.d f2556k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2557l;

    /* renamed from: m  reason: collision with root package name */
    private int f2558m;
    public boolean mHasMapObjDraging;
    public boolean mIsAnimating;
    public boolean mIsMapLoadFinish;
    public boolean mIsMoving;
    public List<ak> mListeners;
    public float mMaxZoomLevel;
    public float mMinZoomLevel;

    /* renamed from: n  reason: collision with root package name */
    private int f2559n;
    public int nearlyRadius;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2560o;

    /* renamed from: p  reason: collision with root package name */
    private MapFirstFrameCallback f2561p;
    private boolean q;
    private AppBaseMap r;
    private long s;
    private Handler t;
    private int u;
    private int v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class HeatMapType {
        public static final HeatMapType CEMETERY = null;
        public static final HeatMapType CITY = null;
        public static final HeatMapType SCENERY = null;
        private static final /* synthetic */ HeatMapType[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f2562a;

        private HeatMapType(String str, int i2, int i3) {
        }

        public static HeatMapType valueOf(String str) {
        }

        public static HeatMapType[] values() {
        }

        public int getId() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class MapControlMode {
        public static final MapControlMode DEFAULT = null;
        public static final MapControlMode INDOOR = null;
        public static final MapControlMode STREET = null;
        public static final MapControlMode STREET_WAITING = null;
        private static final /* synthetic */ MapControlMode[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f2563a;

        private MapControlMode(String str, int i2, int i3) {
        }

        public static /* synthetic */ int a(MapControlMode mapControlMode) {
        }

        public static MapControlMode valueOf(String str) {
        }

        public static MapControlMode[] values() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface MapFirstFrameCallback {
        void onFirstFrameDrawing(MapController mapController);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class MapLayerType {
        public static final MapLayerType DEFAULT = null;
        public static final MapLayerType INDOOR = null;
        public static final MapLayerType SATELLITE = null;
        public static final MapLayerType STREET = null;
        private static final /* synthetic */ MapLayerType[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f2564a;

        private MapLayerType(String str, int i2, int i3) {
        }

        public static /* synthetic */ int a(MapLayerType mapLayerType) {
        }

        public static MapLayerType valueOf(String str) {
        }

        public static MapLayerType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class MapSceneMode {
        public static final MapSceneMode DEFAULT = null;
        public static final MapSceneMode INDOOR = null;
        public static final MapSceneMode INTERNAL = null;
        public static final MapSceneMode POI = null;
        public static final MapSceneMode ROUTE = null;
        private static final /* synthetic */ MapSceneMode[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f2565a;

        private MapSceneMode(String str, int i2, int i3) {
        }

        public static MapSceneMode valueOf(String str) {
        }

        public static MapSceneMode[] values() {
        }

        public int getMode() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class MapStyleMode {
        public static final MapStyleMode DEFAULT = null;
        public static final MapStyleMode FOOT_PRINT = null;
        public static final MapStyleMode INTERNAL = null;
        public static final MapStyleMode INTERNAL_SPECIAL = null;
        public static final MapStyleMode NAV_DAY = null;
        public static final MapStyleMode NAV_NIGHT = null;
        public static final MapStyleMode SEARCH_POI = null;
        public static final MapStyleMode SEARCH_ROUTE = null;
        public static final MapStyleMode WALK_DAY = null;
        private static final /* synthetic */ MapStyleMode[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f2566a;

        private MapStyleMode(String str, int i2, int i3) {
        }

        public static MapStyleMode valueOf(String str) {
        }

        public static MapStyleMode[] values() {
        }

        public int getMode() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class RecommendPoiScene {
        public static final RecommendPoiScene BASE = null;
        public static final RecommendPoiScene INTERNATIONAL = null;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ RecommendPoiScene[] f2567a = null;
        public int value;

        private RecommendPoiScene(String str, int i2, int i3) {
        }

        public static RecommendPoiScene valueOf(String str) {
        }

        public static RecommendPoiScene[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class RecycleMemoryLevel {
        public static final RecycleMemoryLevel FULL = null;
        public static final RecycleMemoryLevel NORMAL = null;
        private static final /* synthetic */ RecycleMemoryLevel[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private final int f2568a;

        private RecycleMemoryLevel(String str, int i2, int i3) {
        }

        public static RecycleMemoryLevel valueOf(String str) {
        }

        public static RecycleMemoryLevel[] values() {
        }

        public int getLevel() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2569a;
        public float b;
        public GeoPoint c;

        /* renamed from: d  reason: collision with root package name */
        public Point f2570d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ MapController f2571e;

        public a(MapController mapController) {
        }

        public void a() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends com.baidu.platform.comapi.util.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MapController f2572a;

        public b(MapController mapController) {
        }

        @Override // com.baidu.platform.comapi.util.h
        public void a(Message message) {
        }
    }

    public static native int CleanAfterDBClick(long j2, float f2, float f3);

    public static int GetAdaptKeyCode(int i2) {
    }

    public static native int MapProc(long j2, int i2, int i3, int i4, int i5, int i6, double d2, double d3, double d4, double d5);

    public static /* synthetic */ long a(MapController mapController) {
    }

    public static /* synthetic */ boolean b(MapController mapController) {
    }

    public static /* synthetic */ MapFirstFrameCallback c(MapController mapController) {
    }

    public static /* synthetic */ int d(MapController mapController) {
    }

    public static /* synthetic */ int e(MapController mapController) {
    }

    public static int getScaleDis(int i2) {
    }

    public float GetFZoomToBoundF(Bundle bundle, Bundle bundle2) {
    }

    public int MapMsgProc(int i2, int i3, int i4) {
    }

    public void SetStyleMode(int i2) {
    }

    public void addOneOverlayItem(Bundle bundle) {
    }

    public void addStreetCustomMarker(Bundle bundle, Bitmap bitmap) {
    }

    public void animateTo(GeoPoint geoPoint, int i2) {
    }

    public boolean cleanCache(MapLayerType mapLayerType) {
    }

    public void clearUniversalLayer() {
    }

    public boolean createByDuplicateAppBaseMap(long j2) {
    }

    public void enablePOIAnimation(boolean z2) {
    }

    public void forceSetMapScene(int i2) {
    }

    public boolean forceSetMapThemeScene(int i2, int i3, Bundle bundle) {
    }

    public float getAdapterZoomUnitsEx() {
    }

    public AppBaseMap getBaseMap() {
    }

    public int getCacheSize(MapLayerType mapLayerType) {
    }

    public CaptureMapListener getCaptureMapListener() {
    }

    public String getCityInfoByID(int i2) {
    }

    public MapStatus getCurrentMapStatus() {
    }

    public float getCurrentZoomLevel() {
    }

    public IndoorMapInfo getFocusedBaseIndoorMapInfo() {
    }

    public com.baidu.platform.comapi.map.b.d getGestureMonitor() {
    }

    public Bundle getGestureOptInfoForLog() {
    }

    public k getHideIndoorPopupListener() {
    }

    public EngineMsgListener getIndoorMapListener() {
    }

    public boolean getMapBarData() {
    }

    public boolean getMapBarShowData() {
    }

    public boolean getMapClickEnable() {
    }

    public MapControlMode getMapControlMode() {
    }

    public long getMapId() {
    }

    public MapRenderModeChangeListener getMapRenderModeChangeListener() {
    }

    public int getMapScene() {
    }

    public MapStatus getMapStatus() {
    }

    public com.baidu.mapsdkplatform.comapi.map.w getMapStatusInner() {
    }

    public int getMapTheme() {
    }

    public MapViewInterface getMapView() {
    }

    public MapViewListener getMapViewListener() {
    }

    public NaviMapViewListener getNaviMapViewListener() {
    }

    public String getProjectionPt(String str) {
    }

    public int getScaleLevel(int i2, int i3) {
    }

    public int getSceneLayerScene() {
    }

    public int getSceneLayerTheme() {
    }

    public int getScreenHeight() {
    }

    public int getScreenWidth() {
    }

    public am getStreetArrowClickListener() {
    }

    public int getVMPMapCityCode() {
    }

    public int getVMPMapCityItsInfo() {
    }

    public int getVMPMapCityLevel() {
    }

    public int getVMPMapCitySatInfo() {
    }

    public float getZoomLevel() {
    }

    public float getZoomToBound(Bundle bundle, int i2, int i3) {
    }

    public float getZoomToBoundF(Bundle bundle) {
    }

    public double getZoomUnitsInMeter() {
    }

    public void handleClick(MotionEvent motionEvent) {
    }

    public void handleDoubleClickZoom(MotionEvent motionEvent) {
    }

    public void handleDoubleDownClick(MotionEvent motionEvent) {
    }

    public void handleDoubleTouch(MotionEvent motionEvent) {
    }

    @SuppressLint({"FloatMath"})
    public boolean handleFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
    }

    public boolean handleKeyEvent(int i2, KeyEvent keyEvent) {
    }

    public void handleLongClick(MotionEvent motionEvent) {
    }

    public int handleMapModeGet() {
    }

    public boolean handlePopupClick(int i2, int i3) {
    }

    public void handleRightClick() {
    }

    public void handleStreetscapeDoubleTouch(MotionEvent motionEvent) {
    }

    public boolean handleTouchEvent(MotionEvent motionEvent) {
    }

    public boolean handleTouchMove(MotionEvent motionEvent) {
    }

    public boolean handleTouchSingleClick(MotionEvent motionEvent) {
    }

    public boolean handleTouchUp(MotionEvent motionEvent) {
    }

    public boolean handleTrackballEvent(MotionEvent motionEvent) {
    }

    public boolean handleZoomTo(int i2) {
    }

    public boolean importMapTheme(int i2) {
    }

    public void initAppBaseMap() {
    }

    public void initBaseMap() {
    }

    public void initMapResources(Bundle bundle) {
    }

    public boolean is3DGestureEnable() {
    }

    public boolean isBaseIndoorMapMode() {
    }

    public boolean isCanTouchMove() {
    }

    public boolean isDoubleClickZoom() {
    }

    public boolean isDuplicate() {
    }

    public boolean isEnableDMoveZoom() {
    }

    public boolean isEnableZoom() {
    }

    public boolean isEnlargeCenterWithDoubleClickEnabled() {
    }

    public boolean isInFocusBarBorder(GeoPoint geoPoint, double d2) {
    }

    public boolean isInFocusIndoorBuilding(GeoPoint geoPoint) {
    }

    public boolean isMapAnimationRunning() {
    }

    public boolean isMovedMap() {
    }

    public boolean isNaviMode() {
    }

    public boolean isOverlookGestureEnable() {
    }

    public boolean isPressedOnPopup(int i2, int i3) {
    }

    public boolean isStreetArrowShown() {
    }

    public boolean isStreetCustomMarkerShown() {
    }

    public boolean isStreetPOIMarkerShown() {
    }

    public boolean isStreetRoadClickable() {
    }

    public boolean isTwoTouchClickZoomEnabled() {
    }

    public void mapStatusChangeStart() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void procGestureForLog(boolean z2, Point point) {
    }

    public void recycleMemory(RecycleMemoryLevel recycleMemoryLevel) {
    }

    public void registMapViewListener(ak akVar) {
    }

    public void removeOneOverlayItem(Bundle bundle) {
    }

    public void removeStreetAllCustomMarker() {
    }

    public void removeStreetCustomMarker(String str) {
    }

    public void saveScreenToLocal(String str, int i2, int i3, int i4, int i5) {
    }

    public void scrollBy(int i2, int i3) {
    }

    public void set3DGestureEnable(boolean z2) {
    }

    public void setAllStreetCustomMarkerVisibility(boolean z2) {
    }

    public void setCanTouchMove(boolean z2) {
    }

    public void setCaptureMapListener(CaptureMapListener captureMapListener) {
    }

    public void setDoubleClickZoom(boolean z2) {
    }

    public void setEnableZoom(boolean z2) {
    }

    public void setEngineMsgListener(EngineMsgListener engineMsgListener) {
    }

    public void setEnlargeCenterWithDoubleClickEnable(boolean z2) {
    }

    public void setHideIndoorPopupListener(k kVar) {
    }

    public boolean setLayerSceneMode(long j2, MapSceneMode mapSceneMode) {
    }

    public void setMapClickEnable(boolean z2) {
    }

    public int setMapControlMode(MapControlMode mapControlMode) {
    }

    public void setMapFirstFrameCallback(MapFirstFrameCallback mapFirstFrameCallback) {
    }

    public void setMapRenderModeChangeListener(MapRenderModeChangeListener mapRenderModeChangeListener) {
    }

    public void setMapScene(int i2) {
    }

    public void setMapStatus(MapStatus mapStatus, boolean z2) {
    }

    public void setMapStatusWithAnimation(MapStatus mapStatus, int i2, boolean z2) {
    }

    public boolean setMapTheme(int i2, Bundle bundle) {
    }

    public boolean setMapThemeScene(int i2, int i3, Bundle bundle) {
    }

    public void setMapViewInterface(MapViewInterface mapViewInterface) {
    }

    public void setMapViewListener(MapViewListener mapViewListener) {
    }

    public void setMaxAndMinZoomLevel(float f2, float f3) {
    }

    public void setNaviMapViewListener(NaviMapViewListener naviMapViewListener) {
    }

    public void setNetStatus(int i2) {
    }

    public void setOverlayMapCallBack(ae aeVar) {
    }

    public void setOverlookGestureEnable(boolean z2) {
    }

    public void setRecommendPOIScene(RecommendPoiScene recommendPoiScene) {
    }

    public void setScreenSize(int i2, int i3) {
    }

    public void setStreetArrowClickListener(am amVar) {
    }

    public void setStreetArrowShow(boolean z2) {
    }

    public void setStreetMarkerClickable(String str, boolean z2) {
    }

    public void setStreetRoadClickable(boolean z2) {
    }

    public void setStyleMode(MapStyleMode mapStyleMode) {
    }

    public void setTargetStreetCustomMarkerVisibility(boolean z2, String str) {
    }

    public void setTravelMode(boolean z2) {
    }

    public void setTwoTouchClickZoomEnabled(boolean z2) {
    }

    public void setUniversalFilter(String str) {
    }

    public void showBaseIndoorMap(boolean z2) {
    }

    public void showStreetPOIMarker(boolean z2) {
    }

    public void showUniversalLayer(Bundle bundle) {
    }

    public void startIndoorAnimation() {
    }

    public boolean switchBaseIndoorMapFloor(String str, String str2) {
    }

    public void unInit() {
    }

    public void unInitForMultiTextureView() {
    }

    public void updateDrawFPS() {
    }

    public void updateOneOverlayItem(Bundle bundle) {
    }

    public static /* synthetic */ boolean a(MapController mapController, boolean z2) {
    }

    public static /* synthetic */ boolean b(MapController mapController, boolean z2) {
    }

    private boolean c(int i2, int i3) {
    }

    private boolean d(int i2, int i3) {
    }

    public int MapMsgProc(int i2, int i3, int i4, int i5, int i6, double d2, double d3, double d4, double d5) {
    }

    private boolean a() {
    }

    private boolean b(int i2, int i3) {
    }

    public void a(int i2, int i3) {
    }

    private void a(MotionEvent motionEvent) {
    }

    public void saveScreenToLocal(String str) {
    }

    private boolean a(int i2, int i3, int i4) {
    }

    private void c() {
    }

    public void setMapStatus(Bundle bundle) {
    }

    public void setMapStatus(MapStatus mapStatus) {
    }

    public void setMapStatusWithAnimation(MapStatus mapStatus, int i2) {
    }

    private MapStatus a(boolean z2) {
    }

    public void setMapStatusWithAnimation(MapStatus mapStatus, int i2, int i3) {
    }

    private void d() {
    }

    private void b() {
    }
}
