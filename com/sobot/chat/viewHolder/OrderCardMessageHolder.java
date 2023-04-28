package com.sobot.chat.viewHolder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.sobot.chat.api.model.OrderCardContentModel;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.chat.widget.image.SobotRCImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class OrderCardMessageHolder extends MessageHolderBase implements View.OnClickListener {
    private int defaultPicResId;
    private View mContainer;
    private TextView mGoodsCount;
    private View mGoodsOrderSplit;
    private TextView mGoodsTotalMoney;
    private TextView mOrderCreatetime;
    private TextView mOrderNumber;
    private TextView mOrderStatus;
    private SobotRCImageView mPic;
    private TextView mTitle;
    private OrderCardContentModel orderCardContent;

    public OrderCardMessageHolder(Context context, View view) {
    }

    private String getMoney(int i2) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    @SuppressLint({"SetTextI18n"})
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
