package com.baidu.mapapi.search.route;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MassTransitRoutePlanOption {
    public String mCoordType;
    public PlanNode mFrom;
    public int mPageIndex;
    public int mPageSize;
    public TacticsIncity mTacticsIncity;
    public TacticsIntercity mTacticsIntercity;
    public PlanNode mTo;
    public TransTypeIntercity mTransTypeIntercity;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TacticsIncity {
        public static final TacticsIncity ETRANS_LEAST_TIME = null;
        public static final TacticsIncity ETRANS_LEAST_TRANSFER = null;
        public static final TacticsIncity ETRANS_LEAST_WALK = null;
        public static final TacticsIncity ETRANS_NO_SUBWAY = null;
        public static final TacticsIncity ETRANS_SUBWAY_FIRST = null;
        public static final TacticsIncity ETRANS_SUGGEST = null;
        private static final /* synthetic */ TacticsIncity[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f2104a;

        private TacticsIncity(String str, int i2, int i3) {
        }

        public static TacticsIncity valueOf(String str) {
        }

        public static TacticsIncity[] values() {
        }

        public int getInt() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TacticsIntercity {
        public static final TacticsIntercity ETRANS_LEAST_PRICE = null;
        public static final TacticsIntercity ETRANS_LEAST_TIME = null;
        public static final TacticsIntercity ETRANS_START_EARLY = null;
        private static final /* synthetic */ TacticsIntercity[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f2105a;

        private TacticsIntercity(String str, int i2, int i3) {
        }

        public static TacticsIntercity valueOf(String str) {
        }

        public static TacticsIntercity[] values() {
        }

        public int getInt() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TransTypeIntercity {
        public static final TransTypeIntercity ETRANS_COACH_FIRST = null;
        public static final TransTypeIntercity ETRANS_PLANE_FIRST = null;
        public static final TransTypeIntercity ETRANS_TRAIN_FIRST = null;
        private static final /* synthetic */ TransTypeIntercity[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f2106a;

        private TransTypeIntercity(String str, int i2, int i3) {
        }

        public static TransTypeIntercity valueOf(String str) {
        }

        public static TransTypeIntercity[] values() {
        }

        public int getInt() {
        }
    }

    @Deprecated
    public MassTransitRoutePlanOption coordType(String str) {
    }

    public MassTransitRoutePlanOption from(PlanNode planNode) {
    }

    public MassTransitRoutePlanOption pageIndex(int i2) {
    }

    public MassTransitRoutePlanOption pageSize(int i2) {
    }

    public MassTransitRoutePlanOption tacticsIncity(TacticsIncity tacticsIncity) {
    }

    public MassTransitRoutePlanOption tacticsIntercity(TacticsIntercity tacticsIntercity) {
    }

    public MassTransitRoutePlanOption to(PlanNode planNode) {
    }

    public MassTransitRoutePlanOption transtypeintercity(TransTypeIntercity transTypeIntercity) {
    }
}
