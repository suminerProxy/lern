package com.baidu.platform.comapi.map;

import android.view.MotionEvent;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.MapBound;
import com.baidu.platform.comapi.map.MapStatus;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface MapViewInterface {
    boolean addOverlay(Overlay overlay);

    boolean enable3D();

    MapController getController();

    MapStatus getCurrentMapStatus();

    float getCurrentZoomLevel();

    MapStatus.GeoBound getGeoRound();

    int getLatitudeSpan();

    int getLongitudeSpan();

    GeoPoint getMapCenter();

    int getMapRotation();

    MapStatus getMapStatus();

    List<Overlay> getOverlays();

    int getOverlooking();

    Projection getProjection();

    MapStatus.WinRound getWinRound();

    float getZoomLevel();

    float getZoomToBound(MapBound mapBound);

    float getZoomToBound(MapBound mapBound, int i2, int i3);

    float getZoomToBoundF(MapBound mapBound);

    float getZoomToBoundF(MapBound mapBound, int i2, int i3);

    boolean isBaseIndoorMap();

    boolean isSatellite();

    boolean isStreetRoad();

    boolean isTraffic();

    boolean onTouchEvent(MotionEvent motionEvent);

    void refresh(Overlay overlay);

    boolean removeOverlay(Overlay overlay);

    void saveScreenToLocal(String str);

    void setBaseIndoorMap(boolean z);

    void setGeoRound(MapStatus.GeoBound geoBound);

    void setMapCenter(GeoPoint geoPoint);

    void setMapStatus(MapStatus mapStatus);

    void setMapTo2D(boolean z);

    void setOverlooking(int i2);

    void setRotation(int i2);

    void setSatellite(boolean z);

    void setStreetRoad(boolean z);

    void setTraffic(boolean z);

    void setWinRound(MapStatus.WinRound winRound);

    void setZoomLevel(float f2);

    void setZoomLevel(int i2);

    boolean switchOverlay(Overlay overlay, Overlay overlay2);
}
