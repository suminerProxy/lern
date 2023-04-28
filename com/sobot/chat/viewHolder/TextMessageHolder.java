package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.CommonModel;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.listener.NoDoubleClickListener;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.network.http.callback.StringResultCallBack;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class TextMessageHolder extends MessageHolderBase {
    public TextView msg;
    public RelativeLayout sobot_ll_yinsi;
    public TextView sobot_msg_temp;
    public TextView sobot_msg_temp_see_all;
    public TextView sobot_sentisiveExplain;
    public Button sobot_sentisive_cancle_send;
    public TextView sobot_sentisive_cancle_tip;
    public Button sobot_sentisive_ok_send;
    public TextView sobot_tv_icon;

    /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ TextMessageHolder this$0;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        public AnonymousClass1(TextMessageHolder textMessageHolder, ZhiChiMessageBase zhiChiMessageBase, Context context) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ TextMessageHolder this$0;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        public AnonymousClass2(TextMessageHolder textMessageHolder, Context context, ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ TextMessageHolder this$0;
        public final /* synthetic */ String val$content;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements StringResultCallBack<CommonModel> {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.sobot.network.http.callback.StringResultCallBack
            public void onFailure(Exception exc, String str) {
            }

            @Override // com.sobot.network.http.callback.StringResultCallBack
            public /* bridge */ /* synthetic */ void onSuccess(CommonModel commonModel) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(CommonModel commonModel) {
            }
        }

        public AnonymousClass3(TextMessageHolder textMessageHolder, Context context, ZhiChiMessageBase zhiChiMessageBase, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ TextMessageHolder this$0;
        public final /* synthetic */ String val$content;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements StringResultCallBack<CommonModel> {
            public final /* synthetic */ AnonymousClass4 this$1;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // com.sobot.network.http.callback.StringResultCallBack
            public void onFailure(Exception exc, String str) {
            }

            @Override // com.sobot.network.http.callback.StringResultCallBack
            public /* bridge */ /* synthetic */ void onSuccess(CommonModel commonModel) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(CommonModel commonModel) {
            }
        }

        public AnonymousClass4(TextMessageHolder textMessageHolder, Context context, String str, ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements View.OnLongClickListener {
        public final /* synthetic */ TextMessageHolder this$0;
        public final /* synthetic */ Context val$context;

        public AnonymousClass5(TextMessageHolder textMessageHolder, Context context) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 extends NoDoubleClickListener {
        public final /* synthetic */ TextMessageHolder this$0;

        public AnonymousClass6(TextMessageHolder textMessageHolder) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 extends NoDoubleClickListener {
        public final /* synthetic */ TextMessageHolder this$0;

        public AnonymousClass7(TextMessageHolder textMessageHolder) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ReSendTextLisenter implements View.OnClickListener {
        private Context context;
        private String id;
        private SobotMsgAdapter.SobotMsgCallBack msgCallBack;
        private String msgContext;
        private ImageView msgStatus;

        /* renamed from: com.sobot.chat.viewHolder.TextMessageHolder$ReSendTextLisenter$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements MessageHolderBase.ReSendListener {
            public final /* synthetic */ ReSendTextLisenter this$0;
            public final /* synthetic */ Context val$context;
            public final /* synthetic */ String val$mid;
            public final /* synthetic */ String val$mmsgContext;

            public AnonymousClass1(ReSendTextLisenter reSendTextLisenter, Context context, String str, String str2) {
            }

            @Override // com.sobot.chat.viewHolder.base.MessageHolderBase.ReSendListener
            public void onReSend() {
            }
        }

        public ReSendTextLisenter(Context context, String str, String str2, ImageView imageView, SobotMsgAdapter.SobotMsgCallBack sobotMsgCallBack) {
        }

        public static /* synthetic */ void access$300(ReSendTextLisenter reSendTextLisenter, Context context, String str, String str2) {
        }

        private void sendTextBrocast(Context context, String str, String str2) {
        }

        private void showReSendTextDialog(Context context, String str, String str2, ImageView imageView) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public TextMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$000(TextMessageHolder textMessageHolder) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$100(TextMessageHolder textMessageHolder) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$200(TextMessageHolder textMessageHolder) {
    }

    public static /* synthetic */ void access$400(TextMessageHolder textMessageHolder, boolean z) {
    }

    private void doRevaluate(boolean z) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void hideRevaluateBtn() {
    }

    public void refreshRevaluateItem() {
    }

    public void showDislikeWordView() {
    }

    public void showLikeWordView() {
    }

    public void showRevaluateBtn() {
    }
}
