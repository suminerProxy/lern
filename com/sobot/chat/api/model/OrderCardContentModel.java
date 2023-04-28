package com.sobot.chat.api.model;

import java.io.Serializable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderCardContentModel implements Serializable {
    private static final long serialVersionUID = 1;
    private String createTime;
    private List<Goods> goods;
    private String goodsCount;
    private boolean isAutoSend;
    private boolean isEveryTimeAutoSend;
    private String orderCode;
    private int orderStatus;
    private String orderUrl;
    private String statusCustom;
    private int totalFee;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class Goods implements Serializable {
        private String name;
        private String pictureUrl;

        public Goods() {
        }

        public String getName() {
        }

        public String getPictureUrl() {
        }

        public void setName(String str) {
        }

        public void setPictureUrl(String str) {
        }

        public String toString() {
        }

        public Goods(String str, String str2) {
        }
    }

    public OrderCardContentModel() {
    }

    public String getCreateTime() {
    }

    public List<Goods> getGoods() {
    }

    public String getGoodsCount() {
    }

    public String getOrderCode() {
    }

    public int getOrderStatus() {
    }

    public String getOrderUrl() {
    }

    public String getStatusCustom() {
    }

    public int getTotalFee() {
    }

    public boolean isAutoSend() {
    }

    public boolean isEveryTimeAutoSend() {
    }

    public void setAutoSend(boolean z) {
    }

    public void setCreateTime(String str) {
    }

    public void setEveryTimeAutoSend(boolean z) {
    }

    public void setGoods(List<Goods> list) {
    }

    public void setGoodsCount(String str) {
    }

    public void setOrderCode(String str) {
    }

    public void setOrderStatus(int i2) {
    }

    public void setOrderUrl(String str) {
    }

    public void setStatusCustom(String str) {
    }

    public void setTotalFee(int i2) {
    }

    public String toString() {
    }

    public OrderCardContentModel(int i2, String str, String str2, String str3, String str4, int i3, List<Goods> list, boolean z, boolean z2, String str5) {
    }
}
