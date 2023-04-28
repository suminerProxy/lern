package com.baidu.mapapi.search.route;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TransitRoutePlanOption {
    public String mCityName;
    public PlanNode mFrom;
    public TransitPolicy mPolicy;
    public PlanNode mTo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TransitPolicy {
        public static final TransitPolicy EBUS_NO_SUBWAY = null;
        public static final TransitPolicy EBUS_TIME_FIRST = null;
        public static final TransitPolicy EBUS_TRANSFER_FIRST = null;
        public static final TransitPolicy EBUS_WALK_FIRST = null;
        private static final /* synthetic */ TransitPolicy[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f2123a;

        private TransitPolicy(String str, int i2, int i3) {
        }

        public static TransitPolicy valueOf(String str) {
        }

        public static TransitPolicy[] values() {
        }

        public int getInt() {
        }
    }

    public TransitRoutePlanOption city(String str) {
    }

    public TransitRoutePlanOption from(PlanNode planNode) {
    }

    public TransitRoutePlanOption policy(TransitPolicy transitPolicy) {
    }

    public TransitRoutePlanOption to(PlanNode planNode) {
    }
}
