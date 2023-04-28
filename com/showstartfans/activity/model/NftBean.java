package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NftBean.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 W2\u00020\u0001:\u0001WB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BË\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010 J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jó\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010L\u001a\u00020MH\u0016J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020MHÖ\u0001J\t\u0010S\u001a\u00020\u0006HÖ\u0001J\u0018\u0010T\u001a\u00020U2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010V\u001a\u00020MH\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010$¨\u0006X"}, d2 = {"Lcom/showstartfans/activity/model/NftBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "castTime", "", "id", "interests", "", "Lcom/showstartfans/activity/model/Interest;", "poster", "status", "title", "transferType", "authorInfo", "Lcom/showstartfans/activity/model/AuthorInfoBean;", "chain", "goodsInfo", "Lcom/showstartfans/activity/model/GoodsInfo;", "rightsList", "Lcom/showstartfans/activity/model/Rights;", "serviceTemplate", "Lcom/showstartfans/activity/model/ServiceTemplate;", "tradingDetails", "Lcom/showstartfans/activity/model/TradingDetail;", "tradingHash", "uniqueNumber", "userInfo", "Lcom/showstartfans/activity/model/UserInfo;", "videoUrl", "worksHash", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/showstartfans/activity/model/AuthorInfoBean;Ljava/lang/String;Lcom/showstartfans/activity/model/GoodsInfo;Ljava/util/List;Lcom/showstartfans/activity/model/ServiceTemplate;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/showstartfans/activity/model/UserInfo;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorInfo", "()Lcom/showstartfans/activity/model/AuthorInfoBean;", "getCastTime", "()Ljava/lang/String;", "getChain", "getGoodsInfo", "()Lcom/showstartfans/activity/model/GoodsInfo;", "getId", "getInterests", "()Ljava/util/List;", "getPoster", "getRightsList", "getServiceTemplate", "()Lcom/showstartfans/activity/model/ServiceTemplate;", "getStatus", "getTitle", "getTradingDetails", "getTradingHash", "getTransferType", "getUniqueNumber", "getUserInfo", "()Lcom/showstartfans/activity/model/UserInfo;", "getVideoUrl", "getWorksHash", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class NftBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @Nullable
    private final AuthorInfoBean authorInfo;
    @Nullable
    private final String castTime;
    @Nullable
    private final String chain;
    @Nullable
    private final GoodsInfo goodsInfo;
    @Nullable
    private final String id;
    @Nullable
    private final List<Interest> interests;
    @Nullable
    private final String poster;
    @Nullable
    private final List<Rights> rightsList;
    @Nullable
    private final ServiceTemplate serviceTemplate;
    @Nullable
    private final String status;
    @Nullable
    private final String title;
    @Nullable
    private final List<TradingDetail> tradingDetails;
    @Nullable
    private final String tradingHash;
    @Nullable
    private final String transferType;
    @Nullable
    private final String uniqueNumber;
    @Nullable
    private final UserInfo userInfo;
    @Nullable
    private final String videoUrl;
    @Nullable
    private final String worksHash;

    /* compiled from: NftBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/NftBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/NftBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/NftBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<NftBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public NftBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public NftBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NftBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NftBean[] newArray(int i2) {
        }
    }

    public NftBean(@Nullable String str, @Nullable String str2, @Nullable List<Interest> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable AuthorInfoBean authorInfoBean, @Nullable String str7, @Nullable GoodsInfo goodsInfo, @Nullable List<Rights> list2, @Nullable ServiceTemplate serviceTemplate, @Nullable List<TradingDetail> list3, @Nullable String str8, @Nullable String str9, @Nullable UserInfo userInfo, @Nullable String str10, @Nullable String str11) {
    }

    public static /* synthetic */ NftBean copy$default(NftBean nftBean, String str, String str2, List list, String str3, String str4, String str5, String str6, AuthorInfoBean authorInfoBean, String str7, GoodsInfo goodsInfo, List list2, ServiceTemplate serviceTemplate, List list3, String str8, String str9, UserInfo userInfo, String str10, String str11, int i2, Object obj) {
    }

    @Nullable
    public final String component1() {
    }

    @Nullable
    public final GoodsInfo component10() {
    }

    @Nullable
    public final List<Rights> component11() {
    }

    @Nullable
    public final ServiceTemplate component12() {
    }

    @Nullable
    public final List<TradingDetail> component13() {
    }

    @Nullable
    public final String component14() {
    }

    @Nullable
    public final String component15() {
    }

    @Nullable
    public final UserInfo component16() {
    }

    @Nullable
    public final String component17() {
    }

    @Nullable
    public final String component18() {
    }

    @Nullable
    public final String component2() {
    }

    @Nullable
    public final List<Interest> component3() {
    }

    @Nullable
    public final String component4() {
    }

    @Nullable
    public final String component5() {
    }

    @Nullable
    public final String component6() {
    }

    @Nullable
    public final String component7() {
    }

    @Nullable
    public final AuthorInfoBean component8() {
    }

    @Nullable
    public final String component9() {
    }

    @NotNull
    public final NftBean copy(@Nullable String str, @Nullable String str2, @Nullable List<Interest> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable AuthorInfoBean authorInfoBean, @Nullable String str7, @Nullable GoodsInfo goodsInfo, @Nullable List<Rights> list2, @Nullable ServiceTemplate serviceTemplate, @Nullable List<TradingDetail> list3, @Nullable String str8, @Nullable String str9, @Nullable UserInfo userInfo, @Nullable String str10, @Nullable String str11) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @Nullable
    public final AuthorInfoBean getAuthorInfo() {
    }

    @Nullable
    public final String getCastTime() {
    }

    @Nullable
    public final String getChain() {
    }

    @Nullable
    public final GoodsInfo getGoodsInfo() {
    }

    @Nullable
    public final String getId() {
    }

    @Nullable
    public final List<Interest> getInterests() {
    }

    @Nullable
    public final String getPoster() {
    }

    @Nullable
    public final List<Rights> getRightsList() {
    }

    @Nullable
    public final ServiceTemplate getServiceTemplate() {
    }

    @Nullable
    public final String getStatus() {
    }

    @Nullable
    public final String getTitle() {
    }

    @Nullable
    public final List<TradingDetail> getTradingDetails() {
    }

    @Nullable
    public final String getTradingHash() {
    }

    @Nullable
    public final String getTransferType() {
    }

    @Nullable
    public final String getUniqueNumber() {
    }

    @Nullable
    public final UserInfo getUserInfo() {
    }

    @Nullable
    public final String getVideoUrl() {
    }

    @Nullable
    public final String getWorksHash() {
    }

    public int hashCode() {
    }

    @NotNull
    public String toString() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public NftBean(@NotNull Parcel parcel) {
    }
}
