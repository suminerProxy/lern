package com.baidu.platform.comjni.map.basemap;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AppBaseMap {

    /* renamed from: a  reason: collision with root package name */
    private long f2855a;
    private NABaseMap b;
    private final ReadWriteLock c;

    public static void renderClearShaderCache(String str) {
    }

    public void AddItemData(Bundle bundle) {
    }

    public long AddLayer(int i2, int i3, String str) {
    }

    public void AddPopupData(Bundle bundle) {
    }

    public void AddRtPopData(Bundle bundle) {
    }

    public void AddStreetCustomMarker(Bundle bundle, Bitmap bitmap) {
    }

    public void BeginLocationLayerAnimation() {
    }

    public boolean CleanCache(int i2) {
    }

    public void ClearLayer(long j2) {
    }

    public void ClearLocationLayerData(Bundle bundle) {
    }

    public void ClearMistmapLayer() {
    }

    public void ClearSDKLayer(long j2) {
    }

    public boolean CloseCache() {
    }

    public boolean Create() {
    }

    public boolean CreateByDuplicate(long j2) {
    }

    public long CreateDuplicate() {
    }

    public int Draw() {
    }

    public String GeoPtToScrPoint(int i2, int i3) {
    }

    public float GetAdapterZoomUnitsEx() {
    }

    public int GetCacheSize(int i2) {
    }

    public String GetCityInfoByID(int i2) {
    }

    public Bundle GetDrawingMapStatus() {
    }

    public float GetFZoomToBoundF(Bundle bundle, Bundle bundle2) {
    }

    public String GetFocusedBaseIndoorMapInfo() {
    }

    public long GetId() {
    }

    public int GetMapRenderType() {
    }

    public Bundle GetMapStatus(boolean z) {
    }

    public String GetNearlyObjID(long j2, int i2, int i3, int i4) {
    }

    public int GetVMPMapCityInfo(Bundle bundle) {
    }

    public float GetZoomToBound(Bundle bundle, int i2, int i3) {
    }

    public float GetZoomToBoundF(Bundle bundle) {
    }

    @Deprecated
    public boolean Init(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2) {
    }

    public boolean IsBaseIndoorMapMode() {
    }

    public boolean IsPointInFocusBarBorder(double d2, double d3, double d4) {
    }

    public boolean IsPointInFocusIDRBorder(double d2, double d3) {
    }

    public boolean IsStreetArrowShown() {
    }

    public boolean IsStreetCustomMarkerShown() {
    }

    public boolean IsStreetPOIMarkerShown() {
    }

    public boolean IsStreetRoadClickable() {
    }

    public boolean LayersIsShow(long j2) {
    }

    public void MoveToScrPoint(int i2, int i3) {
    }

    public void OnBackground() {
    }

    public void OnForeground() {
    }

    public String OnHotcityGet() {
    }

    public void OnPause() {
    }

    public boolean OnRecordAdd(int i2) {
    }

    public String OnRecordGetAll() {
    }

    public String OnRecordGetAt(int i2) {
    }

    public boolean OnRecordImport(boolean z, boolean z2) {
    }

    public boolean OnRecordReload(int i2, boolean z) {
    }

    public boolean OnRecordRemove(int i2, boolean z) {
    }

    public boolean OnRecordStart(int i2, boolean z, int i3) {
    }

    public boolean OnRecordSuspend(int i2, boolean z, int i3) {
    }

    public void OnResume() {
    }

    public String OnSchcityGet(String str) {
    }

    public boolean OnUsrcityMsgInterval(int i2) {
    }

    public int OnWifiRecordAdd(int i2) {
    }

    public boolean Release() {
    }

    public void Remo() {
    }

    public boolean RemoveItemData(Bundle bundle) {
    }

    public void RemoveLayer(long j2) {
    }

    public void RemoveStreetAllCustomMarker() {
    }

    public void RemoveStreetCustomMaker(String str) {
    }

    public void ResetImageRes() {
    }

    public boolean ResumeCache() {
    }

    public boolean SaveCache() {
    }

    public void SaveScreenToLocal(String str, String str2) {
    }

    public String ScrPtToGeoPoint(int i2, int i3) {
    }

    public void SetAllStreetCustomMarkerVisibility(boolean z) {
    }

    public boolean SetCallback(a aVar) {
    }

    public void SetFocus(long j2, long j3, boolean z, Bundle bundle) {
    }

    public boolean SetItsPreTime(int i2, int i3, int i4) {
    }

    public boolean SetLayerSceneMode(long j2, int i2) {
    }

    public void SetLayersClickable(long j2, boolean z) {
    }

    public void SetLocationLayerData(Bundle bundle) {
    }

    public int SetMapControlMode(int i2) {
    }

    public void SetMapStatus(Bundle bundle) {
    }

    public void SetNewMapStatus(Bundle bundle) {
    }

    public boolean SetSDKLayerCallback(com.baidu.mapsdkplatform.comjni.a.a.a aVar) {
    }

    public void SetStreetArrowShow(boolean z) {
    }

    public void SetStreetMarkerClickable(String str, boolean z) {
    }

    public void SetStreetRoadClickable(boolean z) {
    }

    public void SetStyleMode(int i2) {
    }

    public void SetTargetStreetCustomMarkerVisibility(boolean z, String str) {
    }

    public void ShowBaseIndoorMap(boolean z) {
    }

    public void ShowHotMap(boolean z, int i2) {
    }

    public void ShowLayers(long j2, boolean z) {
    }

    public void ShowMistMap(boolean z, String str) {
    }

    public void ShowSatelliteMap(boolean z) {
    }

    public void ShowStreetPOIMarker(boolean z) {
    }

    public void ShowStreetRoadMap(boolean z) {
    }

    public void ShowTrafficMap(boolean z) {
    }

    public void StartIndoorAnimation() {
    }

    public boolean SwitchBaseIndoorMapFloor(String str, String str2) {
    }

    public boolean SwitchLayer(long j2, long j3) {
    }

    public void UpdateLayers(long j2) {
    }

    public void addOneOverlayItem(Bundle bundle) {
    }

    public void addOverlayItems(Bundle[] bundleArr, int i2) {
    }

    public boolean addSDKTileData(Bundle bundle) {
    }

    public boolean cleanSDKTileDataCache(long j2) {
    }

    public void clearHeatMapLayerCache(long j2) {
    }

    public void clearUniversalLayer() {
    }

    public void closeParticleEffect(String str) {
    }

    public void enablePOIAnimation(boolean z) {
    }

    public void entryFeedTopic(int i2, String str, String str2) {
    }

    public void entrySearchTopic(int i2) {
    }

    public void exitSearchTopic() {
    }

    public void focusTrafficUGCLabel() {
    }

    public boolean getDEMEnable() {
    }

    public boolean getDrawHouseHeightEnable() {
    }

    public int getFontSizeLevel() {
    }

    public long getLayerIDByTag(String str) {
    }

    public boolean getMapBarData(Bundle bundle) {
    }

    public int getMapLanguage() {
    }

    public int getMapScene() {
    }

    public Bundle getMapStatusLimits() {
    }

    public boolean getMapStatusLimitsLevel(int[] iArr) {
    }

    public int getMapTheme() {
    }

    public float[] getProjectionMatrix() {
    }

    public String getProjectionPt(String str) {
    }

    public int getScaleLevel(int i2, int i3) {
    }

    public float[] getViewMatrix() {
    }

    public boolean importMapTheme(int i2) {
    }

    public boolean initCustomStyle(String str, String str2) {
    }

    public boolean initWithOptions(Bundle bundle, boolean z) {
    }

    public boolean isAnimationRunning() {
    }

    public boolean isNaviMode() {
    }

    public boolean moveLayerBelowTo(long j2, int i2) {
    }

    public boolean performAction(String str) {
    }

    public void recycleMemory(int i2) {
    }

    public boolean releaseFromOfflineMap() {
    }

    public void removeOneOverlayItem(Bundle bundle) {
    }

    public void removeOverlayItems(Bundle[] bundleArr) {
    }

    public void renderDone() {
    }

    public void renderInit(int i2, int i3, Surface surface, int i4) {
    }

    public int renderRender() {
    }

    public void renderResize(int i2, int i3) {
    }

    public void resize(int i2, int i3) {
    }

    public void setCustomStyleEnable(boolean z) {
    }

    public void setDEMEnable(boolean z) {
    }

    public void setDrawHouseHeightEnable(boolean z) {
    }

    public void setFontSizeLevel(int i2) {
    }

    public void setMapLanguage(int i2) {
    }

    public void setMapScene(int i2) {
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

    public void setRecommendPOIScene(int i2) {
    }

    public boolean setTestSwitch(boolean z) {
    }

    public void setTrafficUGCData(String str) {
    }

    public void setUniversalFilter(String str) {
    }

    public void showFootMarkGrid(boolean z, String str) {
    }

    public boolean showParticleEffect(int i2) {
    }

    public boolean showParticleEffectByName(String str, boolean z) {
    }

    public boolean showParticleEffectByType(int i2) {
    }

    public void showTrafficUGCMap(boolean z) {
    }

    public void showUniversalLayer(Bundle bundle) {
    }

    public void surfaceDestroyed(Surface surface) {
    }

    public void unFocusTrafficUGCLabel() {
    }

    public void updateBaseLayers() {
    }

    public void updateDrawFPS() {
    }

    public void updateFootMarkGrid() {
    }

    public void updateOneOverlayItem(Bundle bundle) {
    }

    public boolean updateSDKTile(Bundle bundle) {
    }

    public String worldPointToScreenPoint(float f2, float f3, float f4) {
    }

    public void AddItemData(Bundle bundle, boolean z) {
    }

    public Bundle GetMapStatus() {
    }

    public void ShowHotMap(boolean z, int i2, String str) {
    }
}
