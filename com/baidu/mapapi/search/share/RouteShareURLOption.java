package com.baidu.mapapi.search.share;

import com.baidu.mapapi.search.route.PlanNode;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RouteShareURLOption {
    public int mCityCode;
    public PlanNode mFrom;
    public RouteShareMode mMode;
    public int mPn;
    public PlanNode mTo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class RouteShareMode {
        public static final RouteShareMode BUS_ROUTE_SHARE_MODE = null;
        public static final RouteShareMode CAR_ROUTE_SHARE_MODE = null;
        public static final RouteShareMode CYCLE_ROUTE_SHARE_MODE = null;
        public static final RouteShareMode FOOT_ROUTE_SHARE_MODE = null;
        private static final /* synthetic */ RouteShareMode[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f2133a;

        private RouteShareMode(String str, int i2, int i3) {
        }

        public static RouteShareMode valueOf(String str) {
        }

        public static RouteShareMode[] values() {
        }

        public int getRouteShareMode() {
        }
    }

    public RouteShareURLOption cityCode(int i2) {
    }

    public RouteShareURLOption from(PlanNode planNode) {
    }

    public RouteShareMode getmMode() {
    }

    public RouteShareURLOption pn(int i2) {
    }

    public RouteShareURLOption routMode(RouteShareMode routeShareMode) {
    }

    public RouteShareURLOption to(PlanNode planNode) {
    }
}
