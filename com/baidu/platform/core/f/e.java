package com.baidu.platform.core.f;

import com.baidu.mapapi.search.route.BikingRoutePlanOption;
import com.baidu.mapapi.search.route.DrivingRoutePlanOption;
import com.baidu.mapapi.search.route.IndoorRoutePlanOption;
import com.baidu.mapapi.search.route.MassTransitRoutePlanOption;
import com.baidu.mapapi.search.route.OnGetRoutePlanResultListener;
import com.baidu.mapapi.search.route.TransitRoutePlanOption;
import com.baidu.mapapi.search.route.WalkingRoutePlanOption;

/* compiled from: IRoutePlanSearch.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface e {
    void a();

    void a(OnGetRoutePlanResultListener onGetRoutePlanResultListener);

    boolean a(BikingRoutePlanOption bikingRoutePlanOption);

    boolean a(DrivingRoutePlanOption drivingRoutePlanOption);

    boolean a(IndoorRoutePlanOption indoorRoutePlanOption);

    boolean a(MassTransitRoutePlanOption massTransitRoutePlanOption);

    boolean a(TransitRoutePlanOption transitRoutePlanOption);

    boolean a(WalkingRoutePlanOption walkingRoutePlanOption);
}
