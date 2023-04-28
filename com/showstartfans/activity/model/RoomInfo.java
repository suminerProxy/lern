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

/* compiled from: HotelOrderDetailBean.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0097\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jµ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u00106\u001a\u00020\tH\u0016J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\tHÖ\u0001J\t\u0010<\u001a\u00020\u0006HÖ\u0001J\u0018\u0010=\u001a\u00020>2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\tH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019¨\u0006A"}, d2 = {"Lcom/showstartfans/activity/model/RoomInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "area", "", "bedInfo", "capcity", "", "displays", "", "facilitiyies", "Lcom/showstartfans/activity/model/Facility;", "floor", InnerShareParams.IMAGE_URL, InnerShareParams.LATITUDE, InnerShareParams.LONGITUDE, "name", "originRoomId", "ratePlans", "Lcom/showstartfans/activity/model/RatePlans;", "windowType", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getArea", "()Ljava/lang/String;", "getBedInfo", "getCapcity", "()I", "getDisplays", "()Ljava/util/List;", "getFacilitiyies", "getFloor", "getImageUrl", "getLatitude", "getLongitude", "getName", "getOriginRoomId", "getRatePlans", "getWindowType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RoomInfo implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @Nullable
    private final String area;
    @Nullable
    private final String bedInfo;
    private final int capcity;
    @Nullable
    private final List<String> displays;
    @Nullable
    private final List<Facility> facilitiyies;
    @Nullable
    private final String floor;
    @Nullable
    private final String imageUrl;
    @Nullable
    private final String latitude;
    @Nullable
    private final String longitude;
    @Nullable
    private final String name;
    @Nullable
    private final String originRoomId;
    @Nullable
    private final List<RatePlans> ratePlans;
    @Nullable
    private final String windowType;

    /* compiled from: HotelOrderDetailBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/RoomInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/RoomInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/RoomInfo;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<RoomInfo> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public RoomInfo a(@NotNull Parcel parcel) {
        }

        @NotNull
        public RoomInfo[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RoomInfo createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RoomInfo[] newArray(int i2) {
        }
    }

    public RoomInfo(@Nullable String str, @Nullable String str2, int i2, @Nullable List<String> list, @Nullable List<Facility> list2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable List<RatePlans> list3, @Nullable String str9) {
    }

    public static /* synthetic */ RoomInfo copy$default(RoomInfo roomInfo, String str, String str2, int i2, List list, List list2, String str3, String str4, String str5, String str6, String str7, String str8, List list3, String str9, int i3, Object obj) {
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
    public final List<RatePlans> component12() {
    }

    @Nullable
    public final String component13() {
    }

    @Nullable
    public final String component2() {
    }

    public final int component3() {
    }

    @Nullable
    public final List<String> component4() {
    }

    @Nullable
    public final List<Facility> component5() {
    }

    @Nullable
    public final String component6() {
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
    public final RoomInfo copy(@Nullable String str, @Nullable String str2, int i2, @Nullable List<String> list, @Nullable List<Facility> list2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable List<RatePlans> list3, @Nullable String str9) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @Nullable
    public final String getArea() {
    }

    @Nullable
    public final String getBedInfo() {
    }

    public final int getCapcity() {
    }

    @Nullable
    public final List<String> getDisplays() {
    }

    @Nullable
    public final List<Facility> getFacilitiyies() {
    }

    @Nullable
    public final String getFloor() {
    }

    @Nullable
    public final String getImageUrl() {
    }

    @Nullable
    public final String getLatitude() {
    }

    @Nullable
    public final String getLongitude() {
    }

    @Nullable
    public final String getName() {
    }

    @Nullable
    public final String getOriginRoomId() {
    }

    @Nullable
    public final List<RatePlans> getRatePlans() {
    }

    @Nullable
    public final String getWindowType() {
    }

    public int hashCode() {
    }

    @NotNull
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public RoomInfo(@NotNull Parcel parcel) {
    }
}
