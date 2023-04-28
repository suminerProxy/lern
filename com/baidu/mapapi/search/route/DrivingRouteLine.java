package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DrivingRouteLine extends RouteLine<DrivingStep> implements Parcelable {
    public static final Parcelable.Creator<DrivingRouteLine> CREATOR = null;
    private boolean b;
    private List<RouteNode> c;

    /* renamed from: d  reason: collision with root package name */
    private int f2060d;

    /* renamed from: e  reason: collision with root package name */
    private int f2061e;

    /* renamed from: f  reason: collision with root package name */
    private int f2062f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DrivingStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<DrivingStep> CREATOR = null;

        /* renamed from: d  reason: collision with root package name */
        public List<LatLng> f2063d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f2064e;

        /* renamed from: f  reason: collision with root package name */
        private int f2065f;

        /* renamed from: g  reason: collision with root package name */
        private RouteNode f2066g;

        /* renamed from: h  reason: collision with root package name */
        private RouteNode f2067h;

        /* renamed from: i  reason: collision with root package name */
        private String f2068i;

        /* renamed from: j  reason: collision with root package name */
        private String f2069j;

        /* renamed from: k  reason: collision with root package name */
        private String f2070k;

        /* renamed from: l  reason: collision with root package name */
        private String f2071l;

        /* renamed from: m  reason: collision with root package name */
        private int f2072m;

        /* renamed from: n  reason: collision with root package name */
        private int f2073n;

        /* renamed from: o  reason: collision with root package name */
        private String f2074o;

        public DrivingStep() {
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

        public int getNumTurns() {
        }

        public int getRoadLevel() {
        }

        public String getRoadName() {
        }

        public int[] getTrafficList() {
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

        public void setNumTurns(int i2) {
        }

        public void setPathList(List<LatLng> list) {
        }

        public void setPathString(String str) {
        }

        public void setRoadLevel(int i2) {
        }

        public void setRoadName(String str) {
        }

        public void setTrafficList(int[] iArr) {
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public DrivingStep(Parcel parcel) {
        }
    }

    public DrivingRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
    }

    public int getCongestionDistance() {
    }

    public int getLightNum() {
    }

    public int getToll() {
    }

    public List<RouteNode> getWayPoints() {
    }

    @Deprecated
    public boolean isSupportTraffic() {
    }

    public void setCongestionDistance(int i2) {
    }

    public void setLightNum(int i2) {
    }

    public void setSupportTraffic(boolean z) {
    }

    public void setToll(int i2) {
    }

    public void setWayPoints(List<RouteNode> list) {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public DrivingRouteLine(Parcel parcel) {
    }
}
