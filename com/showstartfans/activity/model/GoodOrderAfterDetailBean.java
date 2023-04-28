package com.showstartfans.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import cn.sharesdk.framework.InnerShareParams;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.goodsmodel.ShoppingCartBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GoodOrderAfterDetailBean.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 Y2\u00020\u0001:\u0001YB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010U\u001a\u00020\u0016H\u0016J\u0018\u0010V\u001a\u00020W2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u0016H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR \u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR\u001a\u00104\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001a\u00107\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010\u000bR\u001a\u0010:\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\t\"\u0004\b<\u0010\u000bR \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\u001a\u0010@\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\t\"\u0004\bB\u0010\u000bR\u001a\u0010C\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\t\"\u0004\bE\u0010\u000bR\u001a\u0010F\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\t\"\u0004\bH\u0010\u000bR\u001a\u0010I\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\t\"\u0004\bK\u0010\u000bR\u001a\u0010L\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\t\"\u0004\bN\u0010\u000bR\u001c\u0010O\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010\u0011R\u001a\u0010R\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\t\"\u0004\bT\u0010\u000b¨\u0006Z"}, d2 = {"Lcom/showstartfans/activity/model/GoodOrderAfterDetailBean;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "additionalInstructions", "", "getAdditionalInstructions", "()Ljava/lang/String;", "setAdditionalInstructions", "(Ljava/lang/String;)V", InnerShareParams.ADDRESS, "Lcom/showstartfans/activity/model/AddressBean;", "getAddress", "()Lcom/showstartfans/activity/model/AddressBean;", "setAddress", "(Lcom/showstartfans/activity/model/AddressBean;)V", "backAddress", "getBackAddress", "setBackAddress", "canNum", "", "getCanNum", "()I", "setCanNum", "(I)V", "expressId", "getExpressId", "setExpressId", "expressNo", "getExpressNo", "setExpressNo", "goodsInfo", "Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "getGoodsInfo", "()Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;", "setGoodsInfo", "(Lcom/showstartfans/activity/model/goodsmodel/ShoppingCartBean;)V", "id", "getId", "setId", "logs", "", "Lcom/showstartfans/activity/model/GoodsOrderAfterSaleLog;", "getLogs", "()Ljava/util/List;", "setLogs", "(Ljava/util/List;)V", "orderDetailId", "getOrderDetailId", "setOrderDetailId", "orderId", "getOrderId", "setOrderId", "orderSn", "getOrderSn", "setOrderSn", "orderStatus", "getOrderStatus", "setOrderStatus", "photo", "getPhoto", "setPhoto", "reason", "getReason", "setReason", "remark", "getRemark", "setRemark", "status", "getStatus", "setStatus", "statusStr", "getStatusStr", "setStatusStr", "type", "getType", "setType", "updateAddress", "getUpdateAddress", "setUpdateAddress", "warmReminder", "getWarmReminder", "setWarmReminder", "describeContents", "writeToParcel", "", "flags", "CREATOR", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class GoodOrderAfterDetailBean implements Parcelable {
    @NotNull
    public static final a CREATOR = null;
    @NotNull
    private String additionalInstructions;
    @Nullable
    private AddressBean address;
    @Nullable
    private AddressBean backAddress;
    private int canNum;
    @NotNull
    private String expressId;
    @NotNull
    private String expressNo;
    @Nullable
    private ShoppingCartBean goodsInfo;
    private int id;
    @NotNull
    private List<GoodsOrderAfterSaleLog> logs;
    private int orderDetailId;
    private int orderId;
    @NotNull
    private String orderSn;
    @NotNull
    private String orderStatus;
    @NotNull
    private List<String> photo;
    @NotNull
    private String reason;
    @NotNull
    private String remark;
    @NotNull
    private String status;
    @NotNull
    private String statusStr;
    @NotNull
    private String type;
    @Nullable
    private AddressBean updateAddress;
    @NotNull
    private String warmReminder;

    /* compiled from: GoodOrderAfterDetailBean.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/model/GoodOrderAfterDetailBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/showstartfans/activity/model/GoodOrderAfterDetailBean;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "", "(I)[Lcom/showstartfans/activity/model/GoodOrderAfterDetailBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements Parcelable.Creator<GoodOrderAfterDetailBean> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public GoodOrderAfterDetailBean a(@NotNull Parcel parcel) {
        }

        @NotNull
        public GoodOrderAfterDetailBean[] b(int i2) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodOrderAfterDetailBean createFromParcel(Parcel parcel) {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ GoodOrderAfterDetailBean[] newArray(int i2) {
        }
    }

    public GoodOrderAfterDetailBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
    }

    @NotNull
    public final String getAdditionalInstructions() {
    }

    @Nullable
    public final AddressBean getAddress() {
    }

    @Nullable
    public final AddressBean getBackAddress() {
    }

    public final int getCanNum() {
    }

    @NotNull
    public final String getExpressId() {
    }

    @NotNull
    public final String getExpressNo() {
    }

    @Nullable
    public final ShoppingCartBean getGoodsInfo() {
    }

    public final int getId() {
    }

    @NotNull
    public final List<GoodsOrderAfterSaleLog> getLogs() {
    }

    public final int getOrderDetailId() {
    }

    public final int getOrderId() {
    }

    @NotNull
    public final String getOrderSn() {
    }

    @NotNull
    public final String getOrderStatus() {
    }

    @NotNull
    public final List<String> getPhoto() {
    }

    @NotNull
    public final String getReason() {
    }

    @NotNull
    public final String getRemark() {
    }

    @NotNull
    public final String getStatus() {
    }

    @NotNull
    public final String getStatusStr() {
    }

    @NotNull
    public final String getType() {
    }

    @Nullable
    public final AddressBean getUpdateAddress() {
    }

    @NotNull
    public final String getWarmReminder() {
    }

    public final void setAdditionalInstructions(@NotNull String str) {
    }

    public final void setAddress(@Nullable AddressBean addressBean) {
    }

    public final void setBackAddress(@Nullable AddressBean addressBean) {
    }

    public final void setCanNum(int i2) {
    }

    public final void setExpressId(@NotNull String str) {
    }

    public final void setExpressNo(@NotNull String str) {
    }

    public final void setGoodsInfo(@Nullable ShoppingCartBean shoppingCartBean) {
    }

    public final void setId(int i2) {
    }

    public final void setLogs(@NotNull List<GoodsOrderAfterSaleLog> list) {
    }

    public final void setOrderDetailId(int i2) {
    }

    public final void setOrderId(int i2) {
    }

    public final void setOrderSn(@NotNull String str) {
    }

    public final void setOrderStatus(@NotNull String str) {
    }

    public final void setPhoto(@NotNull List<String> list) {
    }

    public final void setReason(@NotNull String str) {
    }

    public final void setRemark(@NotNull String str) {
    }

    public final void setStatus(@NotNull String str) {
    }

    public final void setStatusStr(@NotNull String str) {
    }

    public final void setType(@NotNull String str) {
    }

    public final void setUpdateAddress(@Nullable AddressBean addressBean) {
    }

    public final void setWarmReminder(@NotNull String str) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
    }

    public GoodOrderAfterDetailBean(@NotNull Parcel parcel) {
    }
}
