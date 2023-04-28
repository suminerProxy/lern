package h.u.a.o;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LogisticsBean.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u00069"}, d2 = {"Lcom/showstartfans/activity/model/Goods;", "Ljava/io/Serializable;", "()V", "businessDiscountAmount", "", "getBusinessDiscountAmount", "()Ljava/lang/String;", "setBusinessDiscountAmount", "(Ljava/lang/String;)V", "discountAmount", "getDiscountAmount", "setDiscountAmount", "goodsId", "getGoodsId", "setGoodsId", "goodsName", "getGoodsName", "setGoodsName", "goodsType", "getGoodsType", "setGoodsType", "memberNum", "getMemberNum", "setMemberNum", "num", "getNum", "setNum", "orderDetailId", "getOrderDetailId", "setOrderDetailId", "price", "getPrice", "setPrice", "realName", "getRealName", "setRealName", "redoundTime", "getRedoundTime", "setRedoundTime", "sessionId", "getSessionId", "setSessionId", "skuDesc", "getSkuDesc", "setSkuDesc", "skuId", "getSkuId", "setSkuId", "skuImageUrl", "getSkuImageUrl", "setSkuImageUrl", "skuType", "", "getSkuType", "()I", "setSkuType", "(I)V", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class l implements Serializable {
    @NotNull
    private String businessDiscountAmount;
    @NotNull
    private String discountAmount;
    @NotNull
    private String goodsId;
    @NotNull
    private String goodsName;
    @NotNull
    private String goodsType;
    @NotNull
    private String memberNum;
    @NotNull
    private String num;
    @NotNull
    private String orderDetailId;
    @NotNull
    private String price;
    @NotNull
    private String realName;
    @NotNull
    private String redoundTime;
    @NotNull
    private String sessionId;
    @NotNull
    private String skuDesc;
    @NotNull
    private String skuId;
    @NotNull
    private String skuImageUrl;
    private int skuType;

    @NotNull
    public final String getBusinessDiscountAmount() {
    }

    @NotNull
    public final String getDiscountAmount() {
    }

    @NotNull
    public final String getGoodsId() {
    }

    @NotNull
    public final String getGoodsName() {
    }

    @NotNull
    public final String getGoodsType() {
    }

    @NotNull
    public final String getMemberNum() {
    }

    @NotNull
    public final String getNum() {
    }

    @NotNull
    public final String getOrderDetailId() {
    }

    @NotNull
    public final String getPrice() {
    }

    @NotNull
    public final String getRealName() {
    }

    @NotNull
    public final String getRedoundTime() {
    }

    @NotNull
    public final String getSessionId() {
    }

    @NotNull
    public final String getSkuDesc() {
    }

    @NotNull
    public final String getSkuId() {
    }

    @NotNull
    public final String getSkuImageUrl() {
    }

    public final int getSkuType() {
    }

    public final void setBusinessDiscountAmount(@NotNull String str) {
    }

    public final void setDiscountAmount(@NotNull String str) {
    }

    public final void setGoodsId(@NotNull String str) {
    }

    public final void setGoodsName(@NotNull String str) {
    }

    public final void setGoodsType(@NotNull String str) {
    }

    public final void setMemberNum(@NotNull String str) {
    }

    public final void setNum(@NotNull String str) {
    }

    public final void setOrderDetailId(@NotNull String str) {
    }

    public final void setPrice(@NotNull String str) {
    }

    public final void setRealName(@NotNull String str) {
    }

    public final void setRedoundTime(@NotNull String str) {
    }

    public final void setSessionId(@NotNull String str) {
    }

    public final void setSkuDesc(@NotNull String str) {
    }

    public final void setSkuId(@NotNull String str) {
    }

    public final void setSkuImageUrl(@NotNull String str) {
    }

    public final void setSkuType(int i2) {
    }
}
