package com.baidu.mapapi.search.route;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DrivingRoutePlanOption {
    public String mCityName;
    public PlanNode mFrom;
    public DrivingPolicy mPolicy;
    public PlanNode mTo;
    public List<PlanNode> mWayPoints;
    public DrivingTrafficPolicy mtrafficPolicy;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class DrivingPolicy {
        public static final DrivingPolicy ECAR_AVOID_JAM = null;
        public static final DrivingPolicy ECAR_DIS_FIRST = null;
        public static final DrivingPolicy ECAR_FEE_FIRST = null;
        public static final DrivingPolicy ECAR_TIME_FIRST = null;
        private static final /* synthetic */ DrivingPolicy[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f2075a;

        private DrivingPolicy(String str, int i2, int i3) {
        }

        public static DrivingPolicy valueOf(String str) {
        }

        public static DrivingPolicy[] values() {
        }

        public int getInt() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class DrivingTrafficPolicy {
        public static final DrivingTrafficPolicy ROUTE_PATH = null;
        public static final DrivingTrafficPolicy ROUTE_PATH_AND_TRAFFIC = null;
        private static final /* synthetic */ DrivingTrafficPolicy[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f2076a;

        private DrivingTrafficPolicy(String str, int i2, int i3) {
        }

        public static DrivingTrafficPolicy valueOf(String str) {
        }

        public static DrivingTrafficPolicy[] values() {
        }

        public int getInt() {
        }
    }

    public DrivingRoutePlanOption currentCity(String str) {
    }

    public DrivingRoutePlanOption from(PlanNode planNode) {
    }

    public DrivingRoutePlanOption passBy(List<PlanNode> list) {
    }

    public DrivingRoutePlanOption policy(DrivingPolicy drivingPolicy) {
    }

    public DrivingRoutePlanOption to(PlanNode planNode) {
    }

    public DrivingRoutePlanOption trafficPolicy(DrivingTrafficPolicy drivingTrafficPolicy) {
    }
}
