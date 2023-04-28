package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.actdes.AnnouncementBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GoodsDetailBean.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000  \u00012\u00020\u0001:\u0002 \u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\t\u0010\u009c\u0001\u001a\u00020\u0013H\u0016J\u001b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0007\u0010\u009f\u0001\u001a\u00020\u0013H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001c\u0010!\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001c\u0010-\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u001c\u00100\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR\u001a\u00103\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017R\u001a\u00105\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017R\"\u00107\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0015\"\u0004\bF\u0010\u0017R\u001c\u0010G\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\t\"\u0004\bI\u0010\u000bR\"\u0010J\u001a\n\u0012\u0004\u0012\u00020K\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010;\"\u0004\bM\u0010=R\u001c\u0010N\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\t\"\u0004\bP\u0010\u000bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\t\"\u0004\bS\u0010\u000bR\"\u0010T\u001a\n\u0012\u0004\u0012\u00020U\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010;\"\u0004\bW\u0010=R\u001c\u0010X\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\t\"\u0004\bZ\u0010\u000bR \u0010[\u001a\b\u0012\u0004\u0012\u00020\\08X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010;\"\u0004\b^\u0010=R\u001c\u0010_\u001a\u0004\u0018\u00010`X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001c\u0010e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\t\"\u0004\bg\u0010\u000bR\"\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010;\"\u0004\bj\u0010=R\u001c\u0010k\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\t\"\u0004\bm\u0010\u000bR\u001c\u0010n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\t\"\u0004\bp\u0010\u000bR\u001c\u0010q\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010\t\"\u0004\bs\u0010\u000bR\u001c\u0010t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\t\"\u0004\bv\u0010\u000bR\"\u0010w\u001a\n\u0012\u0004\u0012\u00020x\u0018\u000108X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010;\"\u0004\bz\u0010=R\u001a\u0010{\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0015\"\u0004\b}\u0010\u0017R\u001d\u0010~\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\t\"\u0005\b\u0080\u0001\u0010\u000bR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\t\"\u0005\b\u0083\u0001\u0010\u000bR\u001d\u0010\u0084\u0001\u001a\u00020?X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010A\"\u0005\b\u0086\u0001\u0010CR\u001d\u0010\u0087\u0001\u001a\u00020\u0013X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0015\"\u0005\b\u0089\u0001\u0010\u0017R\u001d\u0010\u008a\u0001\u001a\u00020\u0013X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0015\"\u0005\b\u008c\u0001\u0010\u0017R\u001d\u0010\u008d\u0001\u001a\u00020\u0013X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0015\"\u0005\b\u008f\u0001\u0010\u0017R\"\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u0096\u0001\u001a\u00030\u0097\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/showstartfans/activity/model/GoodsDetailBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "banShipmentsCity", "", "getBanShipmentsCity", "()Ljava/lang/String;", "setBanShipmentsCity", "(Ljava/lang/String;)V", "bindItem", "Lcom/showstartfans/activity/model/ActivityInfo;", "getBindItem", "()Lcom/showstartfans/activity/model/ActivityInfo;", "setBindItem", "(Lcom/showstartfans/activity/model/ActivityInfo;)V", "buyGroupType", "", "getBuyGroupType", "()I", "setBuyGroupType", "(I)V", "buyNum", "getBuyNum", "setBuyNum", "canBuyNum", "getCanBuyNum", "setCanBuyNum", "deliveryType", "getDeliveryType", "setDeliveryType", "desc", "getDesc", "setDesc", "freight", "", "getFreight", "()D", "setFreight", "(D)V", "haveBuyPri", "getHaveBuyPri", "setHaveBuyPri", "id", "getId", "setId", InnerShareParams.IMAGE_URL, "getImageUrl", "setImageUrl", "isConfirmedStartTime", "setConfirmedStartTime", "isLogin", "setLogin", "labels", "", "Lcom/showstartfans/activity/model/ShowCouponLabel;", "getLabels", "()Ljava/util/List;", "setLabels", "(Ljava/util/List;)V", "leftTime", "", "getLeftTime", "()J", "setLeftTime", "(J)V", "limitNum", "getLimitNum", "setLimitNum", "name", "getName", "setName", "notices", "Lcom/showstartfans/activity/model/actdes/AnnouncementBean;", "getNotices", "setNotices", "originalPrice", "getOriginalPrice", "setOriginalPrice", "poster", "getPoster", "setPoster", "posters", "Lcom/showstartfans/activity/model/GoodPoster;", "getPosters", "setPosters", "price", "getPrice", "setPrice", "propertyList", "Lcom/showstartfans/activity/model/PropertyBean;", "getPropertyList", "setPropertyList", "relatedActivity", "Lcom/showstartfans/activity/model/ActivityBean;", "getRelatedActivity", "()Lcom/showstartfans/activity/model/ActivityBean;", "setRelatedActivity", "(Lcom/showstartfans/activity/model/ActivityBean;)V", "serviceTemplateContent", "getServiceTemplateContent", "setServiceTemplateContent", "serviceTemplates", "getServiceTemplates", "setServiceTemplates", "shipmentsCity", "getShipmentsCity", "setShipmentsCity", "shipmentsCityName", "getShipmentsCityName", "setShipmentsCityName", "skuDesc", "getSkuDesc", "setSkuDesc", "skuId", "getSkuId", "setSkuId", "skuList", "Lcom/showstartfans/activity/model/SKUBean;", "getSkuList", "setSkuList", "soldStock", "getSoldStock", "setSoldStock", "startDate", "getStartDate", "setStartDate", "startDateStr", "getStartDateStr", "setStartDateStr", "startDateTimestamp", "getStartDateTimestamp", "setStartDateTimestamp", "startSellNoticeStatus", "getStartSellNoticeStatus", "setStartSellNoticeStatus", "status", "getStatus", "setStatus", "stockStandard", "getStockStandard", "setStockStandard", "storeGoods", "Lcom/showstartfans/activity/model/StoreGood;", "getStoreGoods", "()Lcom/showstartfans/activity/model/StoreGood;", "setStoreGoods", "(Lcom/showstartfans/activity/model/StoreGood;)V", "whetherWantTo", "", "getWhetherWantTo", "()Z", "setWhetherWantTo", "(Z)V", "describeContents", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GoodsDetailBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @NotNull
    private String banShipmentsCity;
    @Nullable
    private ActivityInfo bindItem;
    private int buyGroupType;
    private int buyNum;
    private int canBuyNum;
    private int deliveryType;
    @Nullable
    private String desc;
    private double freight;
    private int haveBuyPri;
    @Nullable
    private String id;
    @Nullable
    private String imageUrl;
    private int isConfirmedStartTime;
    private int isLogin;
    @Nullable
    private List<? extends ShowCouponLabel> labels;
    private long leftTime;
    private int limitNum;
    @Nullable
    private String name;
    @Nullable
    private List<? extends AnnouncementBean> notices;
    @Nullable
    private String originalPrice;
    @Nullable
    private String poster;
    @Nullable
    private List<GoodPoster> posters;
    @Nullable
    private String price;
    @NotNull
    private List<? extends PropertyBean> propertyList;
    @Nullable
    private ActivityBean relatedActivity;
    @Nullable
    private String serviceTemplateContent;
    @Nullable
    private List<String> serviceTemplates;
    @Nullable
    private String shipmentsCity;
    @Nullable
    private String shipmentsCityName;
    @Nullable
    private String skuDesc;
    @Nullable
    private String skuId;
    @Nullable
    private List<? extends SKUBean> skuList;
    private int soldStock;
    @Nullable
    private String startDate;
    @Nullable
    private String startDateStr;
    private long startDateTimestamp;
    private int startSellNoticeStatus;
    private int status;
    private int stockStandard;
    @Nullable
    private StoreGood storeGoods;
    private boolean whetherWantTo;

    /* compiled from: GoodsDetailBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/GoodsDetailBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/GoodsDetailBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/GoodsDetailBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<GoodsDetailBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public GoodsDetailBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public GoodsDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodsDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodsDetailBean[] newArray(int i2) {
        }
    }

    public GoodsDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @NotNull
    public final String getBanShipmentsCity() {
    }

    @Nullable
    public final ActivityInfo getBindItem() {
    }

    public final int getBuyGroupType() {
    }

    public final int getBuyNum() {
    }

    public final int getCanBuyNum() {
    }

    public final int getDeliveryType() {
    }

    @Nullable
    public final String getDesc() {
    }

    public final double getFreight() {
    }

    public final int getHaveBuyPri() {
    }

    @Nullable
    public final String getId() {
    }

    @Nullable
    public final String getImageUrl() {
    }

    @Nullable
    public final List<ShowCouponLabel> getLabels() {
    }

    public final long getLeftTime() {
    }

    public final int getLimitNum() {
    }

    @Nullable
    public final String getName() {
    }

    @Nullable
    public final List<AnnouncementBean> getNotices() {
    }

    @Nullable
    public final String getOriginalPrice() {
    }

    @Nullable
    public final String getPoster() {
    }

    @Nullable
    public final List<GoodPoster> getPosters() {
    }

    @Nullable
    public final String getPrice() {
    }

    @NotNull
    public final List<PropertyBean> getPropertyList() {
    }

    @Nullable
    public final ActivityBean getRelatedActivity() {
    }

    @Nullable
    public final String getServiceTemplateContent() {
    }

    @Nullable
    public final List<String> getServiceTemplates() {
    }

    @Nullable
    public final String getShipmentsCity() {
    }

    @Nullable
    public final String getShipmentsCityName() {
    }

    @Nullable
    public final String getSkuDesc() {
    }

    @Nullable
    public final String getSkuId() {
    }

    @Nullable
    public final List<SKUBean> getSkuList() {
    }

    public final int getSoldStock() {
    }

    @Nullable
    public final String getStartDate() {
    }

    @Nullable
    public final String getStartDateStr() {
    }

    public final long getStartDateTimestamp() {
    }

    public final int getStartSellNoticeStatus() {
    }

    public final int getStatus() {
    }

    public final int getStockStandard() {
    }

    @Nullable
    public final StoreGood getStoreGoods() {
    }

    public final boolean getWhetherWantTo() {
    }

    public final int isConfirmedStartTime() {
    }

    public final int isLogin() {
    }

    public final void setBanShipmentsCity(@NotNull String str) {
    }

    public final void setBindItem(@Nullable ActivityInfo activityInfo) {
    }

    public final void setBuyGroupType(int i2) {
    }

    public final void setBuyNum(int i2) {
    }

    public final void setCanBuyNum(int i2) {
    }

    public final void setConfirmedStartTime(int i2) {
    }

    public final void setDeliveryType(int i2) {
    }

    public final void setDesc(@Nullable String str) {
    }

    public final void setFreight(double d2) {
    }

    public final void setHaveBuyPri(int i2) {
    }

    public final void setId(@Nullable String str) {
    }

    public final void setImageUrl(@Nullable String str) {
    }

    public final void setLabels(@Nullable List<? extends ShowCouponLabel> list) {
    }

    public final void setLeftTime(long j2) {
    }

    public final void setLimitNum(int i2) {
    }

    public final void setLogin(int i2) {
    }

    public final void setName(@Nullable String str) {
    }

    public final void setNotices(@Nullable List<? extends AnnouncementBean> list) {
    }

    public final void setOriginalPrice(@Nullable String str) {
    }

    public final void setPoster(@Nullable String str) {
    }

    public final void setPosters(@Nullable List<GoodPoster> list) {
    }

    public final void setPrice(@Nullable String str) {
    }

    public final void setPropertyList(@NotNull List<? extends PropertyBean> list) {
    }

    public final void setRelatedActivity(@Nullable ActivityBean activityBean) {
    }

    public final void setServiceTemplateContent(@Nullable String str) {
    }

    public final void setServiceTemplates(@Nullable List<String> list) {
    }

    public final void setShipmentsCity(@Nullable String str) {
    }

    public final void setShipmentsCityName(@Nullable String str) {
    }

    public final void setSkuDesc(@Nullable String str) {
    }

    public final void setSkuId(@Nullable String str) {
    }

    public final void setSkuList(@Nullable List<? extends SKUBean> list) {
    }

    public final void setSoldStock(int i2) {
    }

    public final void setStartDate(@Nullable String str) {
    }

    public final void setStartDateStr(@Nullable String str) {
    }

    public final void setStartDateTimestamp(long j2) {
    }

    public final void setStartSellNoticeStatus(int i2) {
    }

    public final void setStatus(int i2) {
    }

    public final void setStockStandard(int i2) {
    }

    public final void setStoreGoods(@Nullable StoreGood storeGood) {
    }

    public final void setWhetherWantTo(boolean z) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public GoodsDetailBean(@NotNull Parcel parcel) {
    }
}
