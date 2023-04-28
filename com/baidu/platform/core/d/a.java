package com.baidu.platform.core.d;

import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiBoundSearchOption;
import com.baidu.mapapi.search.poi.PoiCitySearchOption;
import com.baidu.mapapi.search.poi.PoiDetailSearchOption;
import com.baidu.mapapi.search.poi.PoiIndoorOption;
import com.baidu.mapapi.search.poi.PoiNearbySearchOption;

/* compiled from: IPoiSearch.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface a {
    void a();

    void a(OnGetPoiSearchResultListener onGetPoiSearchResultListener);

    boolean a(PoiBoundSearchOption poiBoundSearchOption);

    boolean a(PoiCitySearchOption poiCitySearchOption);

    boolean a(PoiDetailSearchOption poiDetailSearchOption);

    boolean a(PoiIndoorOption poiIndoorOption);

    boolean a(PoiNearbySearchOption poiNearbySearchOption);
}
