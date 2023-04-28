package com.baidu.platform.comapi.map;

import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.List;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface MapViewListener {
    void onClickPolymericMapObj(List<MapObj> list);

    void onClickSdkMapObj(int i2, JSONObject jSONObject);

    void onClickStreetArrow(MapObj mapObj);

    void onClickStreetSurface(MapObj mapObj);

    void onClickedBackground(int i2, int i3);

    void onClickedItem(int i2, int i3, GeoPoint geoPoint, long j2);

    void onClickedItem(int i2, GeoPoint geoPoint, long j2);

    void onClickedItsMapObj(List<ItsMapObj> list);

    void onClickedMapObj(List<MapObj> list);

    @Deprecated
    void onClickedOPPoiEventMapObj(MapObj mapObj);

    void onClickedParticleEventMapObj(List<MapObj> list);

    void onClickedPoiObj(List<MapObj> list);

    void onClickedPopup(int i2);

    void onClickedRouteLabelObj(List<MapObj> list);

    void onClickedRouteObj(List<MapObj> list);

    void onClickedStreetIndoorPoi(MapObj mapObj);

    void onClickedStreetPopup(String str);

    void onClickedTrafficUgcEventMapObj(MapObj mapObj, boolean z);

    void onClickedUniversalLayerPoiEventMapObj(List<MapObj> list);

    void onMapAnimationFinish();
}
