package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ChatMessageRichListModel;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.listener.NoDoubleClickListener;
import com.sobot.chat.viewHolder.base.MessageHolderBase;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RichTextMessageHolder extends MessageHolderBase implements View.OnClickListener {
    private LinearLayout answersList;
    private TextView msg;
    public int msgMaxWidth;
    private LinearLayout sobot_chat_more_action;
    private LinearLayout sobot_ll_content;
    private LinearLayout sobot_ll_dislikeBtn;
    private LinearLayout sobot_ll_likeBtn;
    private LinearLayout sobot_ll_switch;
    private LinearLayout sobot_ll_transferBtn;
    private TextView sobot_msgStripe;
    private LinearLayout sobot_rich_ll;
    private RelativeLayout sobot_right_empty_rl;
    private TextView sobot_tv_dislikeBtn;
    private TextView sobot_tv_likeBtn;
    private TextView sobot_tv_switch;
    private TextView sobot_tv_transferBtn;
    private View sobot_view_split;
    private TextView stripe;

    /* renamed from: com.sobot.chat.viewHolder.RichTextMessageHolder$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnLongClickListener {
        public final /* synthetic */ RichTextMessageHolder this$0;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ ZhiChiMessageBase val$message;

        public AnonymousClass1(RichTextMessageHolder richTextMessageHolder, ZhiChiMessageBase zhiChiMessageBase, Context context) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RichTextMessageHolder$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends NoDoubleClickListener {
        public final /* synthetic */ RichTextMessageHolder this$0;

        public AnonymousClass2(RichTextMessageHolder richTextMessageHolder) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RichTextMessageHolder$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends NoDoubleClickListener {
        public final /* synthetic */ RichTextMessageHolder this$0;

        public AnonymousClass3(RichTextMessageHolder richTextMessageHolder) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RichTextMessageHolder$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends NoDoubleClickListener {
        public final /* synthetic */ RichTextMessageHolder this$0;

        public AnonymousClass4(RichTextMessageHolder richTextMessageHolder) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RichTextMessageHolder$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ RichTextMessageHolder this$0;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ ChatMessageRichListModel val$richListModel;

        public AnonymousClass5(RichTextMessageHolder richTextMessageHolder, ChatMessageRichListModel chatMessageRichListModel, Context context) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RichTextMessageHolder$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ RichTextMessageHolder this$0;
        public final /* synthetic */ ZhiChiMessageBase val$message;
        public final /* synthetic */ ChatMessageRichListModel val$richListModel;

        public AnonymousClass6(RichTextMessageHolder richTextMessageHolder, ChatMessageRichListModel chatMessageRichListModel, ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RichTextMessageHolder$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ RichTextMessageHolder this$0;
        public final /* synthetic */ ZhiChiMessageBase val$message;
        public final /* synthetic */ ChatMessageRichListModel val$richListModel;

        public AnonymousClass7(RichTextMessageHolder richTextMessageHolder, ChatMessageRichListModel chatMessageRichListModel, ZhiChiMessageBase zhiChiMessageBase) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnsWerClickLisenter implements View.OnClickListener {
        private Context context;
        private String docId;
        private String id;
        private ImageView img;
        private SobotMsgAdapter.SobotMsgCallBack mMsgCallBack;
        private String msgContent;

        public AnsWerClickLisenter(Context context, String str, String str2, ImageView imageView, String str3, SobotMsgAdapter.SobotMsgCallBack sobotMsgCallBack) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ReadAllTextLisenter implements View.OnClickListener {
        private Context context;
        private String mUrlContent;

        public ReadAllTextLisenter(Context context, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public RichTextMessageHolder(Context context, View view) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$000(RichTextMessageHolder richTextMessageHolder) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$100(RichTextMessageHolder richTextMessageHolder) {
    }

    public static /* synthetic */ void access$200(RichTextMessageHolder richTextMessageHolder, boolean z) {
    }

    public static /* synthetic */ Context access$300(RichTextMessageHolder richTextMessageHolder) {
    }

    public static /* synthetic */ Context access$400(RichTextMessageHolder richTextMessageHolder) {
    }

    public static /* synthetic */ Context access$500(RichTextMessageHolder richTextMessageHolder) {
    }

    public static /* synthetic */ Context access$600(RichTextMessageHolder richTextMessageHolder) {
    }

    public static /* synthetic */ Context access$700(RichTextMessageHolder richTextMessageHolder) {
    }

    private void checkShowTransferBtn() {
    }

    private void doRevaluate(boolean z) {
    }

    private void hideContainer() {
    }

    private String processPrefix(ZhiChiMessageBase zhiChiMessageBase, int i2) {
    }

    private void resetAnswersList() {
    }

    private void resetMaxWidth() {
    }

    private void resetMinWidth() {
    }

    private void setupMsgContent(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public int getTextSize(TextView textView) {
    }

    public void hideRevaluateBtn() {
    }

    public void hideTransferBtn() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public void refreshItem() {
    }

    public void showDislikeWordView() {
    }

    public void showLikeWordView() {
    }

    public void showRevaluateBtn() {
    }

    public void showTransferBtn() {
    }
}
