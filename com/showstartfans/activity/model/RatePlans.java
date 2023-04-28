package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HotelOrderDetailBean.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 S2\u00020\u0001:\u0001SB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B§\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0002\u0010\u001bJ\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0011HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003JÐ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020\u0011H\u0016J\u0013\u0010E\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020IJ\u0006\u0010K\u001a\u00020\u0006J\u0006\u0010L\u001a\u00020\u0006J\t\u0010M\u001a\u00020\u0011HÖ\u0001J\u0006\u0010N\u001a\u00020\fJ\t\u0010O\u001a\u00020\u0006HÖ\u0001J\u0018\u0010P\u001a\u00020Q2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u0011H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0011\u0010\u001a\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)¨\u0006T"}, d2 = {"Lcom/showstartfans/activity/model/RatePlans;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "bedType", "", "cancelRule", "Lcom/showstartfans/activity/model/CancelRule;", "currencyCode", "customerType", "instantConfirmation", "", "invoiceMode", "lastMinuteSale", "mark", "minAmount", "", "nightRates", "", "Lcom/showstartfans/activity/model/NightRate;", "paymentType", "price", "ratePlanId", "ratePlanName", "shoppingCode", "stock", "(Ljava/lang/String;Lcom/showstartfans/activity/model/CancelRule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBedType", "()Ljava/lang/String;", "getCancelRule", "()Lcom/showstartfans/activity/model/CancelRule;", "getCurrencyCode", "getCustomerType", "getInstantConfirmation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInvoiceMode", "getLastMinuteSale", "getMark", "getMinAmount", "()I", "getNightRates", "()Ljava/util/List;", "getPaymentType", "getPrice", "getRatePlanId", "getRatePlanName", "getShoppingCode", "getStock", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/showstartfans/activity/model/CancelRule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/showstartfans/activity/model/RatePlans;", "describeContents", "equals", "other", "", "getAllNightRatePrice", "", "getAverageNightRatePrice", "getBreakFastFormat", "getCancleStr", "hashCode", "isHaveBreakFast", "toString", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class RatePlans implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @Nullable
    private final String bedType;
    @Nullable
    private final CancelRule cancelRule;
    @Nullable
    private final String currencyCode;
    @Nullable
    private final String customerType;
    @Nullable
    private final Boolean instantConfirmation;
    @Nullable
    private final String invoiceMode;
    @Nullable
    private final Boolean lastMinuteSale;
    @Nullable
    private final String mark;
    private final int minAmount;
    @Nullable
    private final List<NightRate> nightRates;
    @Nullable
    private final String paymentType;
    @Nullable
    private final String price;
    @Nullable
    private final String ratePlanId;
    @Nullable
    private final String ratePlanName;
    @Nullable
    private final String shoppingCode;
    private final int stock;

    /* compiled from: HotelOrderDetailBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/RatePlans$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/RatePlans;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/RatePlans;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<RatePlans> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public RatePlans a(@NotNull Parcel parcel) {
        }

        @NotNull
        public RatePlans[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RatePlans createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RatePlans[] newArray(int i2) {
        }
    }

    public RatePlans(@Nullable String str, @Nullable CancelRule cancelRule, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable Boolean bool2, @Nullable String str5, int i2, @Nullable List<NightRate> list, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i3) {
    }

    public static /* synthetic */ RatePlans copy$default(RatePlans ratePlans, String str, CancelRule cancelRule, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, int i2, List list, String str6, String str7, String str8, String str9, String str10, int i3, int i4, Object obj) {
    }

    @Nullable
    public final String component1() {
    }

    @Nullable
    public final List<NightRate> component10() {
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

    public final int component16() {
    }

    @Nullable
    public final CancelRule component2() {
    }

    @Nullable
    public final String component3() {
    }

    @Nullable
    public final String component4() {
    }

    @Nullable
    public final Boolean component5() {
    }

    @Nullable
    public final String component6() {
    }

    @Nullable
    public final Boolean component7() {
    }

    @Nullable
    public final String component8() {
    }

    public final int component9() {
    }

    @NotNull
    public final RatePlans copy(@Nullable String str, @Nullable CancelRule cancelRule, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable Boolean bool2, @Nullable String str5, int i2, @Nullable List<NightRate> list, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i3) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public final double getAllNightRatePrice() {
    }

    public final double getAverageNightRatePrice() {
    }

    @Nullable
    public final String getBedType() {
    }

    @NotNull
    public final String getBreakFastFormat() {
    }

    @Nullable
    public final CancelRule getCancelRule() {
    }

    @NotNull
    public final String getCancleStr() {
    }

    @Nullable
    public final String getCurrencyCode() {
    }

    @Nullable
    public final String getCustomerType() {
    }

    @Nullable
    public final Boolean getInstantConfirmation() {
    }

    @Nullable
    public final String getInvoiceMode() {
    }

    @Nullable
    public final Boolean getLastMinuteSale() {
    }

    @Nullable
    public final String getMark() {
    }

    public final int getMinAmount() {
    }

    @Nullable
    public final List<NightRate> getNightRates() {
    }

    @Nullable
    public final String getPaymentType() {
    }

    @Nullable
    public final String getPrice() {
    }

    @Nullable
    public final String getRatePlanId() {
    }

    @Nullable
    public final String getRatePlanName() {
    }

    @Nullable
    public final String getShoppingCode() {
    }

    public final int getStock() {
    }

    public int hashCode() {
    }

    public final boolean isHaveBreakFast() {
    }

    @NotNull
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public RatePlans(@NotNull Parcel parcel) {
    }
}
