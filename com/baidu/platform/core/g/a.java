package com.baidu.platform.core.g;

import com.baidu.mapapi.search.share.LocationShareURLOption;
import com.baidu.mapapi.search.share.OnGetShareUrlResultListener;
import com.baidu.mapapi.search.share.PoiDetailShareURLOption;
import com.baidu.mapapi.search.share.RouteShareURLOption;

/* compiled from: IShareUrlSearch.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface a {
    void a();

    void a(OnGetShareUrlResultListener onGetShareUrlResultListener);

    boolean a(LocationShareURLOption locationShareURLOption);

    boolean a(PoiDetailShareURLOption poiDetailShareURLOption);

    boolean a(RouteShareURLOption routeShareURLOption);
}
