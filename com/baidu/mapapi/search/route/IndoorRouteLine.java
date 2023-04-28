package com.baidu.mapapi.search.route;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.List;

@SuppressLint({"ParcelCreator"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IndoorRouteLine extends RouteLine<IndoorRouteStep> {
    public static final Parcelable.Creator<IndoorRouteLine> CREATOR = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class IndoorRouteStep extends RouteStep {

        /* renamed from: d  reason: collision with root package name */
        private RouteNode f2080d;

        /* renamed from: e  reason: collision with root package name */
        private RouteNode f2081e;

        /* renamed from: f  reason: collision with root package name */
        private String f2082f;

        /* renamed from: g  reason: collision with root package name */
        private String f2083g;

        /* renamed from: h  reason: collision with root package name */
        private String f2084h;

        /* renamed from: i  reason: collision with root package name */
        private List<IndoorStepNode> f2085i;

        /* renamed from: j  reason: collision with root package name */
        private List<Double> f2086j;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class IndoorStepNode {

            /* renamed from: a  reason: collision with root package name */
            private String f2087a;
            private int b;
            private LatLng c;

            /* renamed from: d  reason: collision with root package name */
            private String f2088d;

            public String getDetail() {
            }

            public LatLng getLocation() {
            }

            public String getName() {
            }

            public int getType() {
            }

            public void setDetail(String str) {
            }

            public void setLocation(LatLng latLng) {
            }

            public void setName(String str) {
            }

            public void setType(int i2) {
            }
        }

        private List<LatLng> a(List<Double> list) {
        }

        public String getBuildingId() {
        }

        public RouteNode getEntrace() {
        }

        public RouteNode getExit() {
        }

        public String getFloorId() {
        }

        public String getInstructions() {
        }

        public List<IndoorStepNode> getStepNodes() {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
        }

        public void setBuildingId(String str) {
        }

        public void setEntrace(RouteNode routeNode) {
        }

        public void setExit(RouteNode routeNode) {
        }

        public void setFloorId(String str) {
        }

        public void setInstructions(String str) {
        }

        public void setPath(List<Double> list) {
        }

        public void setStepNodes(List<IndoorStepNode> list) {
        }
    }

    public IndoorRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<IndoorRouteStep> getAllStep() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public IndoorRouteLine(Parcel parcel) {
    }
}
