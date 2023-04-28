package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class WeatherResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<WeatherResult> CREATOR = null;

    /* renamed from: a  reason: collision with root package name */
    private WeatherSearchRealTime f2139a;
    private WeatherSearchLocation b;
    private List<WeatherSearchForecasts> c;

    /* renamed from: d  reason: collision with root package name */
    private List<WeatherSearchForecastForHours> f2140d;

    /* renamed from: e  reason: collision with root package name */
    private List<WeatherLifeIndexes> f2141e;

    /* renamed from: f  reason: collision with root package name */
    private List<WeatherSearchAlerts> f2142f;

    public WeatherResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
    }

    public List<WeatherSearchForecastForHours> getForecastHours() {
    }

    public List<WeatherSearchForecasts> getForecasts() {
    }

    public List<WeatherLifeIndexes> getLifeIndexes() {
    }

    public WeatherSearchLocation getLocation() {
    }

    public WeatherSearchRealTime getRealTimeWeather() {
    }

    public List<WeatherSearchAlerts> getWeatherAlerts() {
    }

    public void setForecastHours(List<WeatherSearchForecastForHours> list) {
    }

    public void setForecasts(List<WeatherSearchForecasts> list) {
    }

    public void setLifeIndexes(List<WeatherLifeIndexes> list) {
    }

    public void setLocation(WeatherSearchLocation weatherSearchLocation) {
    }

    public void setRealTimeWeather(WeatherSearchRealTime weatherSearchRealTime) {
    }

    public void setWeatherAlerts(List<WeatherSearchAlerts> list) {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
    }

    public WeatherResult(Parcel parcel) {
    }
}
