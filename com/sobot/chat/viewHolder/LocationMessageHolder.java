package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.SobotLocationModel;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.chat.widget.image.SobotRCImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class LocationMessageHolder extends MessageHolderBase implements View.OnClickListener {
    private SobotLocationModel mLocationData;
    private ZhiChiMessageBase mMessage;
    private int sobot_bg_default_map;
    private ProgressBar sobot_msgProgressBar;
    private ImageView sobot_msgStatus;
    private LinearLayout sobot_msg_container;
    private TextView st_localLabel;
    private TextView st_localName;
    private SobotRCImageView st_snapshot;

    /* renamed from: com.sobot.chat.viewHolder.LocationMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements MessageHolderBase.ReSendListener {
        public final /* synthetic */ LocationMessageHolder this$0;

        public AnonymousClass1(LocationMessageHolder locationMessageHolder) {
        }

        @Override // com.sobot.chat.viewHolder.base.MessageHolderBase.ReSendListener
        public void onReSend() {
        }
    }

    public LocationMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$000(LocationMessageHolder locationMessageHolder) {
    }

    public static /* synthetic */ ZhiChiMessageBase access$100(LocationMessageHolder locationMessageHolder) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$200(LocationMessageHolder locationMessageHolder) {
    }

    private void refreshUi() {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
