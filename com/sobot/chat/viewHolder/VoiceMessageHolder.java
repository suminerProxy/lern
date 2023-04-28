package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.viewHolder.base.MessageHolderBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class VoiceMessageHolder extends MessageHolderBase {
    public LinearLayout ll_voice_layout;
    public ZhiChiMessageBase message;
    public ImageView voicePlay;
    public TextView voiceTimeLong;

    /* renamed from: com.sobot.chat.viewHolder.VoiceMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ VoiceMessageHolder this$0;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        public AnonymousClass1(VoiceMessageHolder voiceMessageHolder, ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class RetrySendVoiceLisenter implements View.OnClickListener {
        private Context context;
        private String duration;
        private String id;
        private ImageView img;
        private SobotMsgAdapter.SobotMsgCallBack msgCallBack;
        private String voicePath;

        /* renamed from: com.sobot.chat.viewHolder.VoiceMessageHolder$RetrySendVoiceLisenter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements MessageHolderBase.ReSendListener {
            public final /* synthetic */ RetrySendVoiceLisenter this$0;
            public final /* synthetic */ Context val$context;
            public final /* synthetic */ String val$mduration;
            public final /* synthetic */ String val$mid;
            public final /* synthetic */ String val$mvoicePath;

            public AnonymousClass1(RetrySendVoiceLisenter retrySendVoiceLisenter, Context context, String str, String str2, String str3) {
            }

            @Override // com.sobot.chat.viewHolder.base.MessageHolderBase.ReSendListener
            public void onReSend() {
            }
        }

        public RetrySendVoiceLisenter(Context context, String str, String str2, String str3, ImageView imageView, SobotMsgAdapter.SobotMsgCallBack sobotMsgCallBack) {
        }

        public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$200(RetrySendVoiceLisenter retrySendVoiceLisenter) {
        }

        private void showReSendVoiceDialog(Context context, String str, String str2, String str3, ImageView imageView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public VoiceMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$000(VoiceMessageHolder voiceMessageHolder) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$100(VoiceMessageHolder voiceMessageHolder) {
    }

    private void checkBackground() {
    }

    private void resetAnim() {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void startAnim() {
    }

    public void stopAnim() {
    }
}
