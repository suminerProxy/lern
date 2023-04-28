package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.umeng.analytics.pro.am;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelOrderDetailBean.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 d2\u00020\u0001:\u0001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bí\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010#J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\u0015HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0015HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0015HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010T\u001a\u00020\tHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003J¡\u0002\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010Z\u001a\u00020\u0015H\u0016J\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020\u0015HÖ\u0001J\t\u0010`\u001a\u00020\u0006HÖ\u0001J\u0018\u0010a\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u0015H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0013\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0017\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0011\u0010\u001b\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%¨\u0006e"}, d2 = {"Lcom/showstartfans/activity/model/HotelOrderDetailBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "cancelTime", "", "checkInDate", "checkInDateTimestamp", "", "checkOutDate", "checkOutDateTimestamp", "createTime", "expiredTime", "customers", "", "Lcom/showstartfans/activity/model/OrderHotelCustomer;", "hotelName", "id", "leftTime", "num", "", am.aU, "orderStatus", "orderStatusView", "paidTime", "payPlatform", "paymentStatus", "price", "refundTime", "roomInfo", "Lcom/showstartfans/activity/model/RoomInfo;", TUIConstants.TUILive.ROOM_NAME, "contacterMobile", "sn", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JJILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/showstartfans/activity/model/RoomInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCancelTime", "()Ljava/lang/String;", "getCheckInDate", "getCheckInDateTimestamp", "()J", "getCheckOutDate", "getCheckOutDateTimestamp", "getContacterMobile", "getCreateTime", "getCustomers", "()Ljava/util/List;", "getExpiredTime", "getHotelName", "getId", "getInterval", "getLeftTime", "getNum", "()I", "getOrderStatus", "getOrderStatusView", "getPaidTime", "getPayPlatform", "getPaymentStatus", "getPrice", "getRefundTime", "getRoomInfo", "()Lcom/showstartfans/activity/model/RoomInfo;", "getRoomName", "getSn", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HotelOrderDetailBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @Nullable
    private final String cancelTime;
    @Nullable
    private final String checkInDate;
    private final long checkInDateTimestamp;
    @Nullable
    private final String checkOutDate;
    private final long checkOutDateTimestamp;
    @Nullable
    private final String contacterMobile;
    @Nullable
    private final String createTime;
    @Nullable
    private final List<OrderHotelCustomer> customers;
    @Nullable
    private final String expiredTime;
    @Nullable
    private final String hotelName;
    private final long id;
    @Nullable
    private final String interval;
    private final long leftTime;
    private final int num;
    private final int orderStatus;
    @Nullable
    private final String orderStatusView;
    @Nullable
    private final String paidTime;
    @Nullable
    private final String payPlatform;
    private final int paymentStatus;
    @Nullable
    private final String price;
    @Nullable
    private final String refundTime;
    @Nullable
    private final RoomInfo roomInfo;
    @Nullable
    private final String roomName;
    @Nullable
    private final String sn;

    /* compiled from: HotelOrderDetailBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/HotelOrderDetailBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/HotelOrderDetailBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/HotelOrderDetailBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<HotelOrderDetailBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public HotelOrderDetailBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public HotelOrderDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HotelOrderDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ HotelOrderDetailBean[] newArray(int i2) {
        }
    }

    public HotelOrderDetailBean(@Nullable String str, @Nullable String str2, long j2, @Nullable String str3, long j3, @Nullable String str4, @Nullable String str5, @Nullable List<OrderHotelCustomer> list, @Nullable String str6, long j4, long j5, int i2, @Nullable String str7, int i3, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i4, @Nullable String str11, @Nullable String str12, @Nullable RoomInfo roomInfo, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
    }

    public static /* synthetic */ HotelOrderDetailBean copy$default(HotelOrderDetailBean hotelOrderDetailBean, String str, String str2, long j2, String str3, long j3, String str4, String str5, List list, String str6, long j4, long j5, int i2, String str7, int i3, String str8, String str9, String str10, int i4, String str11, String str12, RoomInfo roomInfo, String str13, String str14, String str15, int i5, Object obj) {
    }

    @Nullable
    public final String component1() {
    }

    public final long component10() {
    }

    public final long component11() {
    }

    public final int component12() {
    }

    @Nullable
    public final String component13() {
    }

    public final int component14() {
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

    public final int component18() {
    }

    @Nullable
    public final String component19() {
    }

    @Nullable
    public final String component2() {
    }

    @Nullable
    public final String component20() {
    }

    @Nullable
    public final RoomInfo component21() {
    }

    @Nullable
    public final String component22() {
    }

    @Nullable
    public final String component23() {
    }

    @Nullable
    public final String component24() {
    }

    public final long component3() {
    }

    @Nullable
    public final String component4() {
    }

    public final long component5() {
    }

    @Nullable
    public final String component6() {
    }

    @Nullable
    public final String component7() {
    }

    @Nullable
    public final List<OrderHotelCustomer> component8() {
    }

    @Nullable
    public final String component9() {
    }

    @NotNull
    public final HotelOrderDetailBean copy(@Nullable String str, @Nullable String str2, long j2, @Nullable String str3, long j3, @Nullable String str4, @Nullable String str5, @Nullable List<OrderHotelCustomer> list, @Nullable String str6, long j4, long j5, int i2, @Nullable String str7, int i3, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i4, @Nullable String str11, @Nullable String str12, @Nullable RoomInfo roomInfo, @Nullable String str13, @Nullable String str14, @Nullable String str15) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @Nullable
    public final String getCancelTime() {
    }

    @Nullable
    public final String getCheckInDate() {
    }

    public final long getCheckInDateTimestamp() {
    }

    @Nullable
    public final String getCheckOutDate() {
    }

    public final long getCheckOutDateTimestamp() {
    }

    @Nullable
    public final String getContacterMobile() {
    }

    @Nullable
    public final String getCreateTime() {
    }

    @Nullable
    public final List<OrderHotelCustomer> getCustomers() {
    }

    @Nullable
    public final String getExpiredTime() {
    }

    @Nullable
    public final String getHotelName() {
    }

    public final long getId() {
    }

    @Nullable
    public final String getInterval() {
    }

    public final long getLeftTime() {
    }

    public final int getNum() {
    }

    public final int getOrderStatus() {
    }

    @Nullable
    public final String getOrderStatusView() {
    }

    @Nullable
    public final String getPaidTime() {
    }

    @Nullable
    public final String getPayPlatform() {
    }

    public final int getPaymentStatus() {
    }

    @Nullable
    public final String getPrice() {
    }

    @Nullable
    public final String getRefundTime() {
    }

    @Nullable
    public final RoomInfo getRoomInfo() {
    }

    @Nullable
    public final String getRoomName() {
    }

    @Nullable
    public final String getSn() {
    }

    public int hashCode() {
    }

    @NotNull
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public HotelOrderDetailBean(@NotNull Parcel parcel) {
    }
}
