package com.baidu.mapapi.utils.route;

import com.baidu.mapapi.model.LatLng;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RouteParaOption {

    /* renamed from: a  reason: collision with root package name */
    public LatLng f2206a;
    public LatLng b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f2207d;

    /* renamed from: e  reason: collision with root package name */
    public String f2208e;

    /* renamed from: f  reason: collision with root package name */
    public EBusStrategyType f2209f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class EBusStrategyType {

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ EBusStrategyType[] f2210a = null;
        public static final EBusStrategyType bus_no_subway = null;
        public static final EBusStrategyType bus_recommend_way = null;
        public static final EBusStrategyType bus_time_first = null;
        public static final EBusStrategyType bus_transfer_little = null;
        public static final EBusStrategyType bus_walk_little = null;

        private EBusStrategyType(String str, int i2) {
        }

        public static EBusStrategyType valueOf(String str) {
        }

        public static EBusStrategyType[] values() {
        }
    }

    public RouteParaOption busStrategyType(EBusStrategyType eBusStrategyType) {
    }

    public RouteParaOption cityName(String str) {
    }

    public RouteParaOption endName(String str) {
    }

    public RouteParaOption endPoint(LatLng latLng) {
    }

    public EBusStrategyType getBusStrategyType() {
    }

    public String getCityName() {
    }

    public String getEndName() {
    }

    public LatLng getEndPoint() {
    }

    public String getStartName() {
    }

    public LatLng getStartPoint() {
    }

    public RouteParaOption startName(String str) {
    }

    public RouteParaOption startPoint(LatLng latLng) {
    }
}
