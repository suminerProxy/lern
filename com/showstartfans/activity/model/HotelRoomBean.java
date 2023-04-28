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

/* compiled from: HotelRoomBean.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u00016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B£\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\u0002\u0010\u0016J\b\u0010-\u001a\u00020\u001dH\u0016J\b\u0010.\u001a\u0004\u0018\u00010\u0012J\u0006\u0010/\u001a\u00020\u0006J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001dJ\u0018\u00104\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u001dH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018¨\u00067"}, d2 = {"Lcom/showstartfans/activity/model/HotelRoomBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "area", "", "areaFormat", "bedInfo", "capcity", "facilityTag", "", "floor", "floorFormat", InnerShareParams.IMAGE_URL, "name", "originRoomId", "ratePlans", "Lcom/showstartfans/activity/model/RatePlans;", "windowType", "windowTypeFormat", "displays", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getArea", "()Ljava/lang/String;", "getAreaFormat", "getBedInfo", "getCapcity", "checkRatePlansIndex", "", "getCheckRatePlansIndex", "()I", "setCheckRatePlansIndex", "(I)V", "getDisplays", "()Ljava/util/List;", "getFacilityTag", "getFloor", "getFloorFormat", "getImageUrl", "getName", "getOriginRoomId", "getRatePlans", "getWindowType", "getWindowTypeFormat", "describeContents", "getCheckRatePlans", "getInfoStr", "getShowPhotoList", "setCheckRatePlans", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "writeToParcel", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelRoomBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @Nullable
    private final String area;
    @Nullable
    private final String areaFormat;
    @Nullable
    private final String bedInfo;
    @Nullable
    private final String capcity;
    private int checkRatePlansIndex;
    @Nullable
    private final List<String> displays;
    @Nullable
    private final List<String> facilityTag;
    @Nullable
    private final String floor;
    @Nullable
    private final String floorFormat;
    @Nullable
    private final String imageUrl;
    @Nullable
    private final String name;
    @Nullable
    private final String originRoomId;
    @Nullable
    private final List<RatePlans> ratePlans;
    @Nullable
    private final String windowType;
    @Nullable
    private final String windowTypeFormat;

    /* compiled from: HotelRoomBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/HotelRoomBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/HotelRoomBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/HotelRoomBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<HotelRoomBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public HotelRoomBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public HotelRoomBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HotelRoomBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HotelRoomBean[] newArray(int i2) {
        }
    }

    public HotelRoomBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<RatePlans> list2, @Nullable String str10, @Nullable String str11, @Nullable List<String> list3) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @Nullable
    public final String getArea() {
    }

    @Nullable
    public final String getAreaFormat() {
    }

    @Nullable
    public final String getBedInfo() {
    }

    @Nullable
    public final String getCapcity() {
    }

    @Nullable
    public final RatePlans getCheckRatePlans() {
    }

    public final int getCheckRatePlansIndex() {
    }

    @Nullable
    public final List<String> getDisplays() {
    }

    @Nullable
    public final List<String> getFacilityTag() {
    }

    @Nullable
    public final String getFloor() {
    }

    @Nullable
    public final String getFloorFormat() {
    }

    @Nullable
    public final String getImageUrl() {
    }

    @NotNull
    public final String getInfoStr() {
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

    @NotNull
    public final List<String> getShowPhotoList() {
    }

    @Nullable
    public final String getWindowType() {
    }

    @Nullable
    public final String getWindowTypeFormat() {
    }

    public final void setCheckRatePlans(int i2) {
    }

    public final void setCheckRatePlansIndex(int i2) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public HotelRoomBean(@NotNull Parcel parcel) {
    }
}
