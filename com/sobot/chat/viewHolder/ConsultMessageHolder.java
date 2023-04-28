package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ConsultMessageHolder extends MessageHolderBase implements View.OnClickListener {
    private Button btn_sendBtn;
    private int defaultPicResId;
    private ImageView iv_pic;
    private ZhiChiMessageBase mData;
    private View sobot_container;
    private TextView tv_des;
    private TextView tv_lable;
    private TextView tv_title;

    /* renamed from: com.sobot.chat.viewHolder.ConsultMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ ConsultMessageHolder this$0;
        public final /* synthetic */ String val$url;

        public AnonymousClass1(ConsultMessageHolder consultMessageHolder, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public ConsultMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$000(ConsultMessageHolder consultMessageHolder) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$100(ConsultMessageHolder consultMessageHolder) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
