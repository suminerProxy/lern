package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BikingRouteLine extends RouteLine<BikingStep> implements Parcelable {
    public static final Parcelable.Creator<BikingRouteLine> CREATOR = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BikingStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<BikingStep> CREATOR = null;

        /* renamed from: d  reason: collision with root package name */
        private int f2051d;

        /* renamed from: e  reason: collision with root package name */
        private RouteNode f2052e;

        /* renamed from: f  reason: collision with root package name */
        private RouteNode f2053f;

        /* renamed from: g  reason: collision with root package name */
        private String f2054g;

        /* renamed from: h  reason: collision with root package name */
        private String f2055h;

        /* renamed from: i  reason: collision with root package name */
        private String f2056i;

        /* renamed from: j  reason: collision with root package name */
        private String f2057j;

        /* renamed from: k  reason: collision with root package name */
        private String f2058k;

        public BikingStep() {
        }

        private List<LatLng> a(String str) {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
        }

        public int getDirection() {
        }

        public RouteNode getEntrance() {
        }

        public String getEntranceInstructions() {
        }

        public RouteNode getExit() {
        }

        public String getExitInstructions() {
        }

        public String getInstructions() {
        }

        public String getTurnType() {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public List<LatLng> getWayPoints() {
        }

        public void setDirection(int i2) {
        }

        public void setEntrance(RouteNode routeNode) {
        }

        public void setEntranceInstructions(String str) {
        }

        public void setExit(RouteNode routeNode) {
        }

        public void setExitInstructions(String str) {
        }

        public void setInstructions(String str) {
        }

        public void setPathString(String str) {
        }

        public void setTurnType(String str) {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public BikingStep(Parcel parcel) {
        }
    }

    public BikingRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<BikingStep> getAllStep() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public BikingRouteLine(Parcel parcel) {
    }
}
