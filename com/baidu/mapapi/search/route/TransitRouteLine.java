package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.core.VehicleInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class TransitRouteLine extends RouteLine<TransitStep> implements Parcelable {
    public static final Parcelable.Creator<TransitRouteLine> CREATOR = null;
    private TaxiInfo b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class TransitStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<TransitStep> CREATOR = null;

        /* renamed from: d  reason: collision with root package name */
        private VehicleInfo f2117d;

        /* renamed from: e  reason: collision with root package name */
        private RouteNode f2118e;

        /* renamed from: f  reason: collision with root package name */
        private RouteNode f2119f;

        /* renamed from: g  reason: collision with root package name */
        private TransitRouteStepType f2120g;

        /* renamed from: h  reason: collision with root package name */
        private String f2121h;

        /* renamed from: i  reason: collision with root package name */
        private String f2122i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unexpected branching in enum static init block */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class TransitRouteStepType {
            private static final /* synthetic */ TransitRouteStepType[] $VALUES = null;
            public static final TransitRouteStepType BUSLINE = null;
            public static final TransitRouteStepType SUBWAY = null;
            public static final TransitRouteStepType WAKLING = null;

            private TransitRouteStepType(String str, int i2) {
            }

            public static TransitRouteStepType valueOf(String str) {
            }

            public static TransitRouteStepType[] values() {
            }
        }

        public TransitStep() {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
        }

        public RouteNode getEntrance() {
        }

        public RouteNode getExit() {
        }

        public String getInstructions() {
        }

        public TransitRouteStepType getStepType() {
        }

        public VehicleInfo getVehicleInfo() {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
        }

        public void setEntrace(RouteNode routeNode) {
        }

        public void setExit(RouteNode routeNode) {
        }

        public void setInstructions(String str) {
        }

        public void setPathString(String str) {
        }

        public void setStepType(TransitRouteStepType transitRouteStepType) {
        }

        public void setVehicleInfo(VehicleInfo vehicleInfo) {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public TransitStep(Parcel parcel) {
        }
    }

    public TransitRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
    }

    @Deprecated
    public TaxiInfo getTaxitInfo() {
    }

    public void setTaxitInfo(TaxiInfo taxiInfo) {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public TransitRouteLine(Parcel parcel) {
    }
}
