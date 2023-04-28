package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapShowData.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0013H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000b¨\u0006!"}, d2 = {"Lcom/showstartfans/activity/model/MapShowSiteData;", "Lcom/showstartfans/activity/model/MapBaseData;", "Ljava/io/Serializable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "cityCode", "", "getCityCode", "()Ljava/lang/String;", "setCityCode", "(Ljava/lang/String;)V", "countryCode", "getCountryCode", "setCountryCode", "expPushedTime", "getExpPushedTime", "setExpPushedTime", "id", "", "getId", "()I", "setId", "(I)V", "provinceCode", "getProvinceCode", "setProvinceCode", "isScale", "", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class MapShowSiteData extends MapBaseData implements Serializable {
    @NotNull
    public static final a CREATOR = null;
    @NotNull
    private String cityCode;
    @NotNull
    private String countryCode;
    @NotNull
    private String expPushedTime;
    private int id;
    @NotNull
    private String provinceCode;

    /* compiled from: MapShowData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/MapShowSiteData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/MapShowSiteData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/MapShowSiteData;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<MapShowSiteData> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public MapShowSiteData a(@NotNull Parcel parcel) {
        }

        @NotNull
        public MapShowSiteData[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MapShowSiteData createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MapShowSiteData[] newArray(int i2) {
        }
    }

    public MapShowSiteData(@NotNull Parcel parcel) {
    }

    @NotNull
    public final String getCityCode() {
    }

    @NotNull
    public final String getCountryCode() {
    }

    @NotNull
    public final String getExpPushedTime() {
    }

    public final int getId() {
    }

    @NotNull
    public final String getProvinceCode() {
    }

    @Override // h.u.a.c.y.e0.b.b
    public boolean isScale() {
    }

    public final void setCityCode(@NotNull String str) {
    }

    public final void setCountryCode(@NotNull String str) {
    }

    public final void setExpPushedTime(@NotNull String str) {
    }

    public final void setId(int i2) {
    }

    public final void setProvinceCode(@NotNull String str) {
    }

    @Override // com.showstartfans.activity.model.MapBaseData, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }
}
