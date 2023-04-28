package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RouteStep;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class RouteLine<T extends RouteStep> implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public TYPE f1987a;
    private RouteNode b;
    private RouteNode c;

    /* renamed from: d  reason: collision with root package name */
    private String f1988d;

    /* renamed from: e  reason: collision with root package name */
    private List<T> f1989e;

    /* renamed from: f  reason: collision with root package name */
    private int f1990f;

    /* renamed from: g  reason: collision with root package name */
    private int f1991g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TYPE {
        public static final TYPE BIKINGSTEP = null;
        public static final TYPE DRIVESTEP = null;
        public static final TYPE TRANSITSTEP = null;
        public static final TYPE WALKSTEP = null;
        private static final /* synthetic */ TYPE[] b = null;

        /* renamed from: a  reason: collision with root package name */
        private int f1992a;

        private TYPE(String str, int i2, int i3) {
        }

        public static /* synthetic */ int a(TYPE type) {
        }

        public static TYPE valueOf(String str) {
        }

        public static TYPE[] values() {
        }

        private int a() {
        }
    }

    public RouteLine() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public List<T> getAllStep() {
    }

    public int getDistance() {
    }

    public int getDuration() {
    }

    public RouteNode getStarting() {
    }

    public RouteNode getTerminal() {
    }

    public String getTitle() {
    }

    public TYPE getType() {
    }

    public void setDistance(int i2) {
    }

    public void setDuration(int i2) {
    }

    public void setStarting(RouteNode routeNode) {
    }

    public void setSteps(List<T> list) {
    }

    public void setTerminal(RouteNode routeNode) {
    }

    public void setTitle(String str) {
    }

    public void setType(TYPE type) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public RouteLine(Parcel parcel) {
    }
}
