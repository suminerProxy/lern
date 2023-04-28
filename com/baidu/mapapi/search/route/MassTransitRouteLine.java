package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.BusInfo;
import com.baidu.mapapi.search.core.CoachInfo;
import com.baidu.mapapi.search.core.PlaneInfo;
import com.baidu.mapapi.search.core.PriceInfo;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.TrainInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class MassTransitRouteLine extends RouteLine<TransitStep> implements Parcelable {
    public static final Parcelable.Creator<MassTransitRouteLine> CREATOR = null;
    private String b;
    private double c;

    /* renamed from: d  reason: collision with root package name */
    private List<PriceInfo> f2090d;

    /* renamed from: e  reason: collision with root package name */
    private List<List<TransitStep>> f2091e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class TransitStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<TransitStep> CREATOR = null;

        /* renamed from: d  reason: collision with root package name */
        private List<TrafficCondition> f2092d;

        /* renamed from: e  reason: collision with root package name */
        private LatLng f2093e;

        /* renamed from: f  reason: collision with root package name */
        private LatLng f2094f;

        /* renamed from: g  reason: collision with root package name */
        private TrainInfo f2095g;

        /* renamed from: h  reason: collision with root package name */
        private PlaneInfo f2096h;

        /* renamed from: i  reason: collision with root package name */
        private CoachInfo f2097i;

        /* renamed from: j  reason: collision with root package name */
        private BusInfo f2098j;

        /* renamed from: k  reason: collision with root package name */
        private StepVehicleInfoType f2099k;

        /* renamed from: l  reason: collision with root package name */
        private String f2100l;

        /* renamed from: m  reason: collision with root package name */
        private String f2101m;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class StepVehicleInfoType {
            private static final /* synthetic */ StepVehicleInfoType[] $VALUES = null;
            public static final StepVehicleInfoType ESTEP_BUS = null;
            public static final StepVehicleInfoType ESTEP_COACH = null;
            public static final StepVehicleInfoType ESTEP_DRIVING = null;
            public static final StepVehicleInfoType ESTEP_PLANE = null;
            public static final StepVehicleInfoType ESTEP_TRAIN = null;
            public static final StepVehicleInfoType ESTEP_WALK = null;

            /* renamed from: a  reason: collision with root package name */
            private int f2102a;

            private StepVehicleInfoType(String str, int i2, int i3) {
            }

            public static StepVehicleInfoType valueOf(String str) {
            }

            public static StepVehicleInfoType[] values() {
            }

            public int getInt() {
            }
        }

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class TrafficCondition implements Parcelable {
            public static final Parcelable.Creator<TrafficCondition> CREATOR = null;

            /* renamed from: a  reason: collision with root package name */
            private int f2103a;
            private int b;

            public TrafficCondition() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
            }

            public int getTrafficGeoCnt() {
            }

            public int getTrafficStatus() {
            }

            public void setTrafficGeoCnt(int i2) {
            }

            public void setTrafficStatus(int i2) {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
            }

            public TrafficCondition(Parcel parcel) {
            }
        }

        public TransitStep() {
        }

        private List<LatLng> a(String str) {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
        }

        public BusInfo getBusInfo() {
        }

        public CoachInfo getCoachInfo() {
        }

        public LatLng getEndLocation() {
        }

        public String getInstructions() {
        }

        public PlaneInfo getPlaneInfo() {
        }

        public LatLng getStartLocation() {
        }

        public List<TrafficCondition> getTrafficConditions() {
        }

        public TrainInfo getTrainInfo() {
        }

        public StepVehicleInfoType getVehileType() {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
        }

        public void setBusInfo(BusInfo busInfo) {
        }

        public void setCoachInfo(CoachInfo coachInfo) {
        }

        public void setEndLocation(LatLng latLng) {
        }

        public void setInstructions(String str) {
        }

        public void setPathString(String str) {
        }

        public void setPlaneInfo(PlaneInfo planeInfo) {
        }

        public void setStartLocation(LatLng latLng) {
        }

        public void setTrafficConditions(List<TrafficCondition> list) {
        }

        public void setTrainInfo(TrainInfo trainInfo) {
        }

        public void setVehileType(StepVehicleInfoType stepVehicleInfoType) {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public TransitStep(Parcel parcel) {
        }
    }

    public MassTransitRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
    }

    public String getArriveTime() {
    }

    public List<List<TransitStep>> getNewSteps() {
    }

    public double getPrice() {
    }

    public List<PriceInfo> getPriceInfo() {
    }

    public void setArriveTime(String str) {
    }

    public void setNewSteps(List<List<TransitStep>> list) {
    }

    public void setPrice(double d2) {
    }

    public void setPriceInfo(List<PriceInfo> list) {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public MassTransitRouteLine(Parcel parcel) {
    }
}
