package com.baidu.platform.comjni.map.basemap;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import com.baidu.platform.comapi.map.ae;
import com.baidu.platform.comjni.NativeComponent;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NABaseMap extends NativeComponent {

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f2857a;
    private long b;
    private volatile boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final ReadWriteLock f2858d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Long> f2859e;

    public static /* synthetic */ String a(NABaseMap nABaseMap, long j2, long j3, long j4, boolean z, Bundle bundle) {
    }

    public static /* synthetic */ int b(NABaseMap nABaseMap, long j2, long j3) {
    }

    public static /* synthetic */ Set c(NABaseMap nABaseMap) {
    }

    public static /* synthetic */ void d(NABaseMap nABaseMap, long j2, long j3) {
    }

    public static /* synthetic */ boolean e(NABaseMap nABaseMap) {
    }

    private native void nativeAddItemData(long j2, Bundle bundle, boolean z);

    private native long nativeAddLayer(long j2, int i2, int i3, String str);

    private native void nativeAddPopupData(long j2, Bundle bundle);

    private native void nativeAddRtPopData(long j2, Bundle bundle);

    private native void nativeAddStreetCustomMarker(long j2, Bundle bundle, Bitmap bitmap);

    private native void nativeAttachDC(long j2, long j3);

    private native boolean nativeBeginLocationLayerAnimation(long j2);

    private native boolean nativeCleanCache(long j2, int i2);

    private native void nativeClearHeatMapLayerCache(long j2, long j3);

    private native void nativeClearLayer(long j2, long j3);

    private native void nativeClearLocationLayerData(long j2, Bundle bundle);

    private native void nativeClearMistmapLayer(long j2);

    private native void nativeClearSDKLayer(long j2, long j3);

    private native void nativeClearUniversalLayer(long j2);

    private native boolean nativeCloseCache(long j2);

    private native void nativeCloseParticleEffect(long j2, String str);

    private native long nativeCreate();

    private native long nativeCreateDuplicate(long j2);

    private native int nativeDraw(long j2);

    private native void nativeEnablePOIAnimation(long j2, boolean z);

    private native void nativeEntrySearchTopic(long j2, int i2, String str, String str2);

    private native void nativeExitSearchTopic(long j2);

    private native void nativeFocusTrafficUGCLabel(long j2);

    private native String nativeGeoPtToScrPoint(long j2, int i2, int i3);

    private native float nativeGetAdapterZoomUnitsEx(long j2);

    private native int nativeGetCacheSize(long j2, int i2);

    private native String nativeGetCityInfoByID(long j2, int i2);

    private static native boolean nativeGetDEMEnable(long j2);

    private static native boolean nativeGetDrawHouseHeightEnable(long j2);

    private native Bundle nativeGetDrawingMapStatus(long j2);

    private native float nativeGetFZoomToBoundF(long j2, Bundle bundle, Bundle bundle2);

    private native String nativeGetFocusedBaseIndoorMapInfo(long j2);

    private native int nativeGetFontSizeLevel(long j2);

    private static native long nativeGetLayerIDByTag(long j2, String str);

    private native int nativeGetLayerPos(long j2, long j3);

    private native boolean nativeGetMapBarData(long j2, Bundle bundle);

    private native int nativeGetMapLanguage(long j2);

    private native int nativeGetMapRenderType(long j2);

    private native int nativeGetMapScene(long j2);

    private native Bundle nativeGetMapStatus(long j2, boolean z);

    private static native Bundle nativeGetMapStatusLimits(long j2);

    private native boolean nativeGetMapStatusLimitsLevel(long j2, int[] iArr);

    private native int nativeGetMapTheme(long j2);

    private native String nativeGetNearlyObjID(long j2, long j3, int i2, int i3, int i4);

    private static native void nativeGetProjectionMatrix(long j2, float[] fArr);

    private native String nativeGetProjectionPt(long j2, String str);

    private native int nativeGetScaleLevel(long j2, int i2, int i3);

    private native int nativeGetVMPMapCityInfo(long j2, Bundle bundle);

    private static native void nativeGetViewMatrix(long j2, float[] fArr);

    private native float nativeGetZoomToBound(long j2, Bundle bundle, int i2, int i3);

    private native float nativeGetZoomToBoundF(long j2, Bundle bundle);

    private native boolean nativeImportMapTheme(long j2, int i2);

    private native boolean nativeInit(long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2);

    private native boolean nativeInitCustomStyle(long j2, String str, String str2);

    private native int nativeInitLayerCallback(long j2);

    private native boolean nativeInitWithBundle(long j2, Bundle bundle, boolean z);

    private native long nativeInsertLayerAt(long j2, int i2, int i3, int i4, String str);

    private native boolean nativeIsAnimationRunning(long j2);

    private native boolean nativeIsBaseIndoorMapMode(long j2);

    private native boolean nativeIsNaviMode(long j2);

    private native boolean nativeIsPointInFocusBarBorder(long j2, double d2, double d3, double d4);

    private native boolean nativeIsPointInFocusIDRBorder(long j2, double d2, double d3);

    private native boolean nativeIsStreetArrowShown(long j2);

    private native boolean nativeIsStreetCustomMarkerShown(long j2);

    private native boolean nativeIsStreetPOIMarkerShown(long j2);

    private native boolean nativeIsStreetRoadClickable(long j2);

    private native boolean nativeLayersIsShow(long j2, long j3);

    private native boolean nativeMoveLayerBelowTo(long j2, long j3, int i2);

    private native void nativeMoveToScrPoint(long j2, int i2, int i3);

    private native void nativeNewSetMapStatus(long j2, Bundle bundle);

    private native void nativeOnBackground(long j2);

    private native void nativeOnForeground(long j2);

    private native String nativeOnHotcityGet(long j2);

    private native void nativeOnPause(long j2);

    private native boolean nativeOnRecordAdd(long j2, int i2);

    private native String nativeOnRecordGetAll(long j2);

    private native String nativeOnRecordGetAt(long j2, int i2);

    private native boolean nativeOnRecordImport(long j2, boolean z, boolean z2);

    private native boolean nativeOnRecordReload(long j2, int i2, boolean z);

    private native boolean nativeOnRecordRemove(long j2, int i2, boolean z);

    private native boolean nativeOnRecordStart(long j2, int i2, boolean z, int i3);

    private native boolean nativeOnRecordSuspend(long j2, int i2, boolean z, int i3);

    private native void nativeOnResume(long j2);

    private native String nativeOnSchcityGet(long j2, String str);

    private native boolean nativeOnUsrcityMsgInterval(long j2, int i2);

    private native int nativeOnWifiRecordAdd(long j2, int i2);

    private native boolean nativePerformAction(long j2, String str);

    private native int nativeQueryInterface(long j2);

    private native void nativeRecycleMemory(long j2, int i2);

    private native int nativeRelease(long j2);

    private native boolean nativeRemoveItemData(long j2, Bundle bundle);

    private native int nativeRemoveLayer(long j2, long j3);

    private native void nativeRemoveStreetAllCustomMarker(long j2);

    private native void nativeRemoveStreetCustomMaker(long j2, String str);

    private static native void nativeRenderClearShaderCache(String str);

    private static native void nativeRenderInit(long j2, int i2, int i3, Surface surface, int i4);

    private native void nativeRenderResize(long j2, int i2, int i3);

    private native void nativeResetImageRes(long j2);

    private native boolean nativeResumeCache(long j2);

    private native boolean nativeSaveCache(long j2);

    private native void nativeSaveScreenToLocal(long j2, String str, String str2);

    private native String nativeScrPtToGeoPoint(long j2, int i2, int i3);

    private native void nativeSetAllStreetCustomMarkerVisibility(long j2, boolean z);

    private native void nativeSetCustomStyleEnable(long j2, boolean z);

    private static native void nativeSetDEMEnable(long j2, boolean z);

    private native void nativeSetDpiScale(long j2, float f2);

    private static native void nativeSetDrawHouseHeightEnable(long j2, boolean z);

    private native String nativeSetFocus(long j2, long j3, long j4, boolean z, Bundle bundle);

    private native void nativeSetFontSizeLevel(long j2, int i2);

    private native boolean nativeSetItsPreTime(long j2, int i2, int i3, int i4);

    private native boolean nativeSetLayerSceneMode(long j2, long j3, int i2);

    private native void nativeSetLayersClickable(long j2, long j3, boolean z);

    private native void nativeSetLocationLayerData(long j2, Bundle bundle);

    private native int nativeSetMapControlMode(long j2, int i2);

    private native void nativeSetMapLanguage(long j2, int i2);

    private native boolean nativeSetMapScene(long j2, int i2);

    private native void nativeSetMapStatus(long j2, Bundle bundle);

    private static native void nativeSetMapStatusLimits(long j2, Bundle bundle);

    private native boolean nativeSetMapStatusLimitsLevel(long j2, int i2, int i3);

    private native boolean nativeSetMapTheme(long j2, int i2, Bundle bundle);

    private native boolean nativeSetMapThemeScene(long j2, int i2, int i3, Bundle bundle);

    private static native void nativeSetMaxAndMinZoomLevel(long j2, Bundle bundle);

    private native void nativeSetRecommendPOIScene(long j2, int i2);

    private native void nativeSetStreetArrowShow(long j2, boolean z);

    private native void nativeSetStreetMarkerClickable(long j2, String str, boolean z);

    private native void nativeSetStreetRoadClickable(long j2, boolean z);

    private native void nativeSetStyleMode(long j2, int i2);

    private native void nativeSetTargetStreetCustomMarkerVisibility(long j2, boolean z, String str);

    private native boolean nativeSetTestSwitch(long j2, boolean z);

    private native void nativeSetTrafficUGCData(long j2, String str);

    private native void nativeSetUniversalFilter(long j2, String str);

    private native void nativeShowBaseIndoorMap(long j2, boolean z);

    private native void nativeShowFootMarkGrid(long j2, boolean z, String str);

    private native void nativeShowHotMap(long j2, boolean z, int i2);

    private native void nativeShowHotMapWithUid(long j2, boolean z, int i2, String str);

    private native void nativeShowLayers(long j2, long j3, boolean z);

    private native void nativeShowMistMap(long j2, boolean z, String str);

    private native boolean nativeShowParticleEffect(long j2, int i2);

    private native boolean nativeShowParticleEffectByName(long j2, String str, boolean z);

    private native boolean nativeShowParticleEffectByType(long j2, int i2);

    private native void nativeShowSatelliteMap(long j2, boolean z);

    private native void nativeShowStreetPOIMarker(long j2, boolean z);

    private native void nativeShowStreetRoadMap(long j2, boolean z);

    private native void nativeShowTrafficMap(long j2, boolean z);

    private native void nativeShowTrafficUGCMap(long j2, boolean z);

    private native void nativeShowUniversalLayer(long j2, Bundle bundle);

    private native void nativeStartIndoorAnimation(long j2);

    private native void nativeSurfaceDestroyed(long j2, Surface surface);

    private native boolean nativeSwitchBaseIndoorMapFloor(long j2, String str, String str2);

    private native boolean nativeSwitchLayer(long j2, long j3, long j4);

    private native void nativeUnFocusTrafficUGCLabel(long j2);

    private native void nativeUpdateBaseLayers(long j2);

    private native void nativeUpdateDrawFPS(long j2);

    private native void nativeUpdateFootMarkGrid(long j2);

    private native void nativeUpdateLayers(long j2, long j3);

    private native String nativeworldPointToScreenPoint(long j2, float f2, float f3, float f4);

    public static void renderClearShaderCache(String str) {
    }

    public void addItemData(Bundle bundle, boolean z) {
    }

    public long addLayer(int i2, int i3, String str) {
    }

    public void addOneOverlayItem(Bundle bundle) {
    }

    public void addOverlayItems(Bundle[] bundleArr, int i2) {
    }

    public void addPopupData(Bundle bundle) {
    }

    public void addRtPopData(Bundle bundle) {
    }

    public void addStreetCustomMarker(Bundle bundle, Bitmap bitmap) {
    }

    public void beginLocationLayerAnimation() {
    }

    public boolean cleanCache(int i2) {
    }

    public void clearHeatMapLayerCache(long j2) {
    }

    public void clearLayer(long j2) {
    }

    public void clearLocationLayerData(Bundle bundle) {
    }

    public void clearMistmapLayer() {
    }

    public void clearSDKLayer(long j2) {
    }

    public void clearUniversalLayer() {
    }

    public boolean closeCache() {
    }

    public void closeParticleEffect(String str) {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
    }

    public long createByDuplicate(long j2) {
    }

    public long createDuplicate() {
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
    }

    public int draw() {
    }

    public void enablePOIAnimation(boolean z) {
    }

    public void entrySearchTopic(int i2, String str, String str2) {
    }

    public void exitSearchTopic() {
    }

    public void focusTrafficUGCLabel() {
    }

    public String geoPtToScrPoint(int i2, int i3) {
    }

    public float getAdapterZoomUnitsEx() {
    }

    public int getCacheSize(int i2) {
    }

    public String getCityInfoByID(int i2) {
    }

    public boolean getDEMEnable() {
    }

    public boolean getDrawHouseHeightEnable() {
    }

    public Bundle getDrawingMapStatus() {
    }

    public float getFZoomToBoundF(Bundle bundle, Bundle bundle2) {
    }

    public String getFocusedBaseIndoorMapInfo() {
    }

    public int getFontSizeLevel() {
    }

    public long getLayerIDByTag(String str) {
    }

    public boolean getMapBarData(Bundle bundle) {
    }

    public int getMapLanguage() {
    }

    public int getMapRenderType() {
    }

    public int getMapScene() {
    }

    public Bundle getMapStatus(boolean z) {
    }

    public Bundle getMapStatusLimits() {
    }

    public boolean getMapStatusLimitsLevel(int[] iArr) {
    }

    public int getMapTheme() {
    }

    public long getNativeMapPointer() {
    }

    public String getNearlyObjID(long j2, int i2, int i3, int i4) {
    }

    public void getProjectMatrix(float[] fArr) {
    }

    public String getProjectionPt(String str) {
    }

    public int getScaleLevel(int i2, int i3) {
    }

    public int getVMPMapCityInfo(Bundle bundle) {
    }

    public void getViewMatrix(float[] fArr) {
    }

    public float getZoomToBound(Bundle bundle, int i2, int i3) {
    }

    public float getZoomToBoundF(Bundle bundle) {
    }

    public boolean importMapTheme(int i2) {
    }

    public boolean init(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2) {
    }

    public boolean initCustomStyle(String str, String str2) {
    }

    public boolean initWithOptions(Bundle bundle, boolean z) {
    }

    public boolean isAnimationRunning() {
    }

    public boolean isBaseIndoorMapMode() {
    }

    public boolean isNaviMode() {
    }

    public boolean isPointInFocusBarBorder(double d2, double d3, double d4) {
    }

    public boolean isPointInFocusIDRBorder(double d2, double d3) {
    }

    public boolean isStreetArrowShown() {
    }

    public boolean isStreetCustomMarkerShown() {
    }

    public boolean isStreetPOIMarkerShown() {
    }

    public boolean isStreetRoadClickable() {
    }

    public boolean layersIsShow(long j2) {
    }

    public boolean moveLayerBelowTo(long j2, int i2) {
    }

    public void moveToScrPoint(int i2, int i3) {
    }

    public native void nativeAddOneOverlayItem(long j2, Bundle bundle);

    public native void nativeAddOverlayItems(long j2, Bundle[] bundleArr, int i2);

    public native boolean nativeAddTileOverlay(long j2, Bundle bundle);

    public native boolean nativeCleanSDKTileDataCache(long j2, long j3);

    public native void nativeRemoveOneOverlayItem(long j2, Bundle bundle);

    public native void nativeUpdateOneOverlayItem(long j2, Bundle bundle);

    public native boolean nativeUpdateSDKTile(long j2, Bundle bundle);

    public void onBackground() {
    }

    public void onForeground() {
    }

    public String onHotcityGet() {
    }

    public void onPause() {
    }

    public boolean onRecordAdd(int i2) {
    }

    public String onRecordGetAll() {
    }

    public String onRecordGetAt(int i2) {
    }

    public boolean onRecordImport(boolean z, boolean z2) {
    }

    public boolean onRecordReload(int i2, boolean z) {
    }

    public boolean onRecordRemove(int i2, boolean z) {
    }

    public boolean onRecordStart(int i2, boolean z, int i3) {
    }

    public boolean onRecordSuspend(int i2, boolean z, int i3) {
    }

    public void onResume() {
    }

    public String onSchcityGet(String str) {
    }

    public boolean onUsrcityMsgInterval(int i2) {
    }

    public int onWifiRecordAdd(int i2) {
    }

    public boolean performAction(String str) {
    }

    public void recycleMemory(int i2) {
    }

    public boolean removeItemData(Bundle bundle) {
    }

    public void removeLayer(long j2) {
    }

    public void removeOneOverlayItem(Bundle bundle) {
    }

    public void removeOneOverlayItems(Bundle[] bundleArr) {
    }

    public void removeStreetAllCustomMarker() {
    }

    public void removeStreetCustomMaker(String str) {
    }

    @Deprecated
    public void renderDone() {
    }

    public void renderInit(int i2, int i3, Surface surface, int i4) {
    }

    @Deprecated
    public int renderRender() {
    }

    public void renderResize(int i2, int i3) {
    }

    public void resetImageRes() {
    }

    public boolean resumeCache() {
    }

    public boolean saveCache() {
    }

    public void saveScreenToLocal(String str, String str2) {
    }

    public String scrPtToGeoPoint(int i2, int i3) {
    }

    public void setAllStreetCustomMarkerVisibility(boolean z) {
    }

    public void setCallback(ae aeVar) {
    }

    public void setCustomStyleEnable(boolean z) {
    }

    public void setDEMEnable(boolean z) {
    }

    public void setDrawHouseHeightEnable(boolean z) {
    }

    public void setFocus(long j2, long j3, boolean z, Bundle bundle) {
    }

    public void setFontSizeLevel(int i2) {
    }

    public boolean setItsPreTime(int i2, int i3, int i4) {
    }

    public boolean setLayerSceneMode(long j2, int i2) {
    }

    public void setLayersClickable(long j2, boolean z) {
    }

    public void setLocationLayerData(Bundle bundle) {
    }

    public int setMapControlMode(int i2) {
    }

    public void setMapLanguage(int i2) {
    }

    public void setMapScene(int i2) {
    }

    public void setMapStatus(Bundle bundle) {
    }

    public void setMapStatusLimits(Bundle bundle) {
    }

    public boolean setMapStatusLimitsLevel(int i2, int i3) {
    }

    public boolean setMapTheme(int i2, Bundle bundle) {
    }

    public boolean setMapThemeScene(int i2, int i3, Bundle bundle) {
    }

    public void setMaxAndMinZoomLevel(Bundle bundle) {
    }

    public void setNewMapStatus(Bundle bundle) {
    }

    public void setRecommendPOIScene(int i2) {
    }

    public void setStreetArrowShow(boolean z) {
    }

    public void setStreetMarkerClickable(String str, boolean z) {
    }

    public void setStreetRoadClickable(boolean z) {
    }

    public void setStyleMode(int i2) {
    }

    public void setTargetStreetCustomMarkerVisibility(boolean z, String str) {
    }

    public boolean setTestSwitch(boolean z) {
    }

    public void setTrafficUGCData(String str) {
    }

    public void setUniversalFilter(String str) {
    }

    public void showBaseIndoorMap(boolean z) {
    }

    public void showFootMarkGrid(boolean z, String str) {
    }

    public void showHotMap(boolean z, int i2) {
    }

    public void showLayers(long j2, boolean z) {
    }

    public void showMistMap(boolean z, String str) {
    }

    public boolean showParticleEffect(int i2) {
    }

    public boolean showParticleEffectByName(String str, boolean z) {
    }

    public boolean showParticleEffectByType(int i2) {
    }

    public void showSatelliteMap(boolean z) {
    }

    public void showStreetPOIMarker(boolean z) {
    }

    public void showStreetRoadMap(boolean z) {
    }

    public void showTrafficMap(boolean z) {
    }

    public void showTrafficUGCMap(boolean z) {
    }

    public void showUniversalLayer(Bundle bundle) {
    }

    public void startIndoorAnimation() {
    }

    public void surfaceDestroyed(Surface surface) {
    }

    public boolean switchBaseIndoorMapFloor(String str, String str2) {
    }

    public boolean switchLayer(long j2, long j3) {
    }

    public void unFocusTrafficUGCLabel() {
    }

    public void updateBaseLayers() {
    }

    public void updateDrawFPS() {
    }

    public void updateFootMarkGrid() {
    }

    public void updateLayers(long j2) {
    }

    public void updateOneOverlayItem(Bundle bundle) {
    }

    public String worldPointToScreenPoint(float f2, float f3, float f4) {
    }

    public static /* synthetic */ ReadWriteLock a(NABaseMap nABaseMap) {
    }

    public static /* synthetic */ long b(NABaseMap nABaseMap) {
    }

    public static /* synthetic */ void c(NABaseMap nABaseMap, long j2, long j3) {
    }

    public static /* synthetic */ boolean d(NABaseMap nABaseMap) {
    }

    public float getZoomToBound(long j2, Bundle bundle, int i2, int i3) {
    }

    public void showHotMap(boolean z, int i2, String str) {
    }

    public static /* synthetic */ void a(NABaseMap nABaseMap, long j2, long j3) {
    }

    public static /* synthetic */ void b(NABaseMap nABaseMap, long j2, long j3, boolean z) {
    }

    public static /* synthetic */ void a(NABaseMap nABaseMap, long j2, long j3, boolean z) {
    }

    private boolean b() {
    }

    public static /* synthetic */ void a(NABaseMap nABaseMap, long j2, Bundle bundle, boolean z) {
    }

    public static /* synthetic */ boolean a(NABaseMap nABaseMap, long j2) {
    }

    public static /* synthetic */ boolean a(NABaseMap nABaseMap, long j2, long j3, long j4) {
    }

    public static /* synthetic */ boolean a(NABaseMap nABaseMap, long j2, Bundle bundle) {
    }

    private void a() {
    }

    private boolean a(long j2) {
    }
}
