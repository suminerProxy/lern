package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.chat.widget.RoundProgressBar;
import com.sobot.chat.widget.image.SobotRCImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ImageMessageHolder extends MessageHolderBase {
    public SobotRCImageView image;
    public TextView isGif;
    public ProgressBar pic_progress;
    public ImageView pic_send_status;
    public RelativeLayout sobot_pic_progress_rl;
    public RoundProgressBar sobot_pic_progress_round;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class RetrySendImageLisenter implements View.OnClickListener {
        private Context context;
        private String id;
        private String imageUrl;
        private ImageView img;
        public SobotMsgAdapter.SobotMsgCallBack mMsgCallBack;

        /* renamed from: com.sobot.chat.viewHolder.ImageMessageHolder$RetrySendImageLisenter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements MessageHolderBase.ReSendListener {
            public final /* synthetic */ RetrySendImageLisenter this$0;
            public final /* synthetic */ Context val$context;
            public final /* synthetic */ String val$mid;
            public final /* synthetic */ String val$mimageUrl;

            public AnonymousClass1(RetrySendImageLisenter retrySendImageLisenter, Context context, String str, String str2) {
            }

            @Override // com.sobot.chat.viewHolder.base.MessageHolderBase.ReSendListener
            public void onReSend() {
            }
        }

        public RetrySendImageLisenter(Context context, String str, String str2, ImageView imageView, SobotMsgAdapter.SobotMsgCallBack sobotMsgCallBack) {
        }

        private void showReSendPicDialog(Context context, String str, String str2, ImageView imageView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public ImageMessageHolder(Context context, View view) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }
}
