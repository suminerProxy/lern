package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelBean.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 R2\u00020\u0001:\u0001RB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BÕ\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001cJ\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jÿ\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010E\u001a\u00020FH\u0016J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\u0006\u0010K\u001a\u00020FJ\u0006\u0010L\u001a\u00020\u0006J\t\u0010M\u001a\u00020FHÖ\u0001J\t\u0010N\u001a\u00020\u0006HÖ\u0001J\u0018\u0010O\u001a\u00020P2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020FH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001e¨\u0006S"}, d2 = {"Lcom/showstartfans/activity/model/HotelBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", InnerShareParams.ADDRESS, "", "distance", "establishmentDate", "facilities", "", "Lcom/showstartfans/activity/model/Facility;", "facilityTag", "displays", "Lcom/showstartfans/activity/model/DisplayBean;", "hotelCityCode", "isPreferred", "lowestPrice", "name", "originHotelId", "picUrl", "starRate", "userScore", "renovationDate", InnerShareParams.LONGITUDE, InnerShareParams.LATITUDE, "introduce", "phone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getDisplays", "()Ljava/util/List;", "getDistance", "getEstablishmentDate", "getFacilities", "getFacilityTag", "getHotelCityCode", "getIntroduce", "getLatitude", "getLongitude", "getLowestPrice", "getName", "getOriginHotelId", "getPhone", "getPicUrl", "getRenovationDate", "getStarRate", "getUserScore", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "getFacilitiesCount", "getFirstFacilities", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @Nullable
    private final String address;
    @Nullable
    private final List<DisplayBean> displays;
    @Nullable
    private final String distance;
    @Nullable
    private final String establishmentDate;
    @Nullable
    private final List<Facility> facilities;
    @Nullable
    private final List<String> facilityTag;
    @Nullable
    private final String hotelCityCode;
    @Nullable
    private final String introduce;
    @Nullable
    private final String isPreferred;
    @Nullable
    private final String latitude;
    @Nullable
    private final String longitude;
    @Nullable
    private final String lowestPrice;
    @Nullable
    private final String name;
    @Nullable
    private final String originHotelId;
    @Nullable
    private final String phone;
    @Nullable
    private final String picUrl;
    @Nullable
    private final String renovationDate;
    @Nullable
    private final String starRate;
    @Nullable
    private final String userScore;

    /* compiled from: HotelBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/HotelBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/HotelBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/HotelBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<HotelBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public HotelBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public HotelBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HotelBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HotelBean[] newArray(int i2) {
        }
    }

    public HotelBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<Facility> list, @Nullable List<String> list2, @Nullable List<DisplayBean> list3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
    }

    public static /* synthetic */ HotelBean copy$default(HotelBean hotelBean, String str, String str2, String str3, List list, List list2, List list3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i2, Object obj) {
    }

    @Nullable
    public final String component1() {
    }

    @Nullable
    public final String component10() {
    }

    @Nullable
    public final String component11() {
    }

    @Nullable
    public final String component12() {
    }

    @Nullable
    public final String component13() {
    }

    @Nullable
    public final String component14() {
    }

    @Nullable
    public final String component15() {
    }

    @Nullable
    public final String component16() {
    }

    @Nullable
    public final String component17() {
    }

    @Nullable
    public final String component18() {
    }

    @Nullable
    public final String component19() {
    }

    @Nullable
    public final String component2() {
    }

    @Nullable
    public final String component3() {
    }

    @Nullable
    public final List<Facility> component4() {
    }

    @Nullable
    public final List<String> component5() {
    }

    @Nullable
    public final List<DisplayBean> component6() {
    }

    @Nullable
    public final String component7() {
    }

    @Nullable
    public final String component8() {
    }

    @Nullable
    public final String component9() {
    }

    @NotNull
    public final HotelBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<Facility> list, @Nullable List<String> list2, @Nullable List<DisplayBean> list3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @Nullable
    public final String getAddress() {
    }

    @Nullable
    public final List<DisplayBean> getDisplays() {
    }

    @Nullable
    public final String getDistance() {
    }

    @Nullable
    public final String getEstablishmentDate() {
    }

    @Nullable
    public final List<Facility> getFacilities() {
    }

    public final int getFacilitiesCount() {
    }

    @Nullable
    public final List<String> getFacilityTag() {
    }

    @NotNull
    public final String getFirstFacilities() {
    }

    @Nullable
    public final String getHotelCityCode() {
    }

    @Nullable
    public final String getIntroduce() {
    }

    @Nullable
    public final String getLatitude() {
    }

    @Nullable
    public final String getLongitude() {
    }

    @Nullable
    public final String getLowestPrice() {
    }

    @Nullable
    public final String getName() {
    }

    @Nullable
    public final String getOriginHotelId() {
    }

    @Nullable
    public final String getPhone() {
    }

    @Nullable
    public final String getPicUrl() {
    }

    @Nullable
    public final String getRenovationDate() {
    }

    @Nullable
    public final String getStarRate() {
    }

    @Nullable
    public final String getUserScore() {
    }

    public int hashCode() {
    }

    @Nullable
    public final String isPreferred() {
    }

    @NotNull
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public HotelBean(@NotNull Parcel parcel) {
    }
}
