package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.listener.NoDoubleClickListener;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.chat.widget.horizontalgridpage.HorizontalGridPage;
import com.sobot.chat.widget.horizontalgridpage.PageBuilder;
import com.sobot.chat.widget.horizontalgridpage.PageCallBack;
import com.sobot.chat.widget.horizontalgridpage.PageGridAdapter;
import com.sobot.chat.widget.image.SobotRCImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RobotTemplateMessageHolder3 extends MessageHolderBase {
    private PageGridAdapter adapter;
    private Context mContext;
    public ZhiChiMessageBase message;
    private PageBuilder pageBuilder;
    private HorizontalGridPage pageView;
    private LinearLayout sobot_ll_content;
    private LinearLayout sobot_ll_transferBtn;
    private TextView sobot_msg;
    private TextView sobot_tv_transferBtn;

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder3$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements PageCallBack {
        public final /* synthetic */ RobotTemplateMessageHolder3 this$0;

        public AnonymousClass1(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.PageCallBack
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.PageCallBack
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.PageCallBack
        public void onItemClickListener(View view, int i2) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.PageCallBack
        public void onItemLongClickListener(View view, int i2) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder3$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder3 this$0;

        public AnonymousClass2(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder3$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder3 this$0;

        public AnonymousClass3(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder3$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder3 this$0;

        public AnonymousClass4(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Template3ViewHolder extends RecyclerView.ViewHolder {
        public TextView sobotLable;
        public LinearLayout sobotLayout;
        public TextView sobotOtherLable;
        public TextView sobotSummary;
        public SobotRCImageView sobotThumbnail;
        public TextView sobotTitle;
        public final /* synthetic */ RobotTemplateMessageHolder3 this$0;

        public Template3ViewHolder(RobotTemplateMessageHolder3 robotTemplateMessageHolder3, View view, Context context) {
        }
    }

    public RobotTemplateMessageHolder3(Context context, View view) {
    }

    public static /* synthetic */ PageGridAdapter access$000(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
    }

    public static /* synthetic */ Context access$100(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$200(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$300(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$400(RobotTemplateMessageHolder3 robotTemplateMessageHolder3) {
    }

    public static /* synthetic */ void access$500(RobotTemplateMessageHolder3 robotTemplateMessageHolder3, boolean z) {
    }

    private void checkShowTransferBtn() {
    }

    private void doRevaluate(boolean z) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void hideRevaluateBtn() {
    }

    public void hideTransferBtn() {
    }

    public void initView(int i2, int i3) {
    }

    public void refreshRevaluateItem() {
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
