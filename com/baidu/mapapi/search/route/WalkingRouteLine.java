package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteLine;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WalkingRouteLine extends RouteLine<WalkingStep> implements Parcelable {
    public static final Parcelable.Creator<WalkingRouteLine> CREATOR = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class WalkingStep extends RouteStep implements Parcelable {
        public static final Parcelable.Creator<WalkingStep> CREATOR = null;

        /* renamed from: d  reason: collision with root package name */
        private int f2125d;

        /* renamed from: e  reason: collision with root package name */
        private RouteNode f2126e;

        /* renamed from: f  reason: collision with root package name */
        private RouteNode f2127f;

        /* renamed from: g  reason: collision with root package name */
        private String f2128g;

        /* renamed from: h  reason: collision with root package name */
        private String f2129h;

        /* renamed from: i  reason: collision with root package name */
        private String f2130i;

        /* renamed from: j  reason: collision with root package name */
        private String f2131j;

        public WalkingStep() {
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

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
        }

        public WalkingStep(Parcel parcel) {
        }
    }

    public WalkingRouteLine() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine
    public List<WalkingStep> getAllStep() {
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public WalkingRouteLine(Parcel parcel) {
    }
}
