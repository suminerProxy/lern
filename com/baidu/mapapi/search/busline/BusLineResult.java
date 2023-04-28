package com.baidu.mapapi.search.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.Date;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class BusLineResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<BusLineResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private String f1952a;
    private String b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private Date f1953d;

    /* renamed from: e  reason: collision with root package name */
    private Date f1954e;

    /* renamed from: f  reason: collision with root package name */
    private String f1955f;

    /* renamed from: g  reason: collision with root package name */
    private List<BusStation> f1956g;

    /* renamed from: h  reason: collision with root package name */
    private List<BusStep> f1957h;

    /* renamed from: i  reason: collision with root package name */
    private float f1958i;

    /* renamed from: j  reason: collision with root package name */
    private float f1959j;

    /* renamed from: k  reason: collision with root package name */
    private String f1960k;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BusStation extends RouteNode {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class BusStep extends RouteStep {
    }

    public BusLineResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public float getBasePrice() {
    }

    public String getBusCompany() {
    }

    public String getBusLineName() {
    }

    public Date getEndTime() {
    }

    public String getLineDirection() {
    }

    public float getMaxPrice() {
    }

    public Date getStartTime() {
    }

    public List<BusStation> getStations() {
    }

    public List<BusStep> getSteps() {
    }

    public String getUid() {
    }

    public boolean isMonthTicket() {
    }

    public void setBasePrice(float f2) {
    }

    public void setBusLineName(String str) {
    }

    public void setEndTime(Date date) {
    }

    public void setLineDirection(String str) {
    }

    public void setMaxPrice(float f2) {
    }

    public void setMonthTicket(boolean z) {
    }

    public void setStartTime(Date date) {
    }

    public void setStations(List<BusStation> list) {
    }

    public void setSteps(List<BusStep> list) {
    }

    public void setUid(String str) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public BusLineResult(Parcel parcel) {
    }
}
