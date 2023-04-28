package com.sobot.chat.viewHolder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.SobotMultiDiaRespInfo;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.listener.NoDoubleClickListener;
import com.sobot.chat.viewHolder.base.MessageHolderBase;
import com.sobot.chat.widget.horizontalgridpage.HorizontalGridPage;
import com.sobot.chat.widget.horizontalgridpage.PageBuilder;
import com.sobot.chat.widget.horizontalgridpage.PageCallBack;
import com.sobot.chat.widget.horizontalgridpage.PageGridAdapter;
import com.sobot.chat.widget.horizontalgridpage.PagerGridLayoutManager;
import com.sobot.chat.widget.lablesview.SobotLablesViewModel;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class RobotTemplateMessageHolder2 extends MessageHolderBase {
    private static final int PAGE_SIZE = 30;
    private PageGridAdapter adapter;
    private LinearLayout ll_sobot_template2_item_page;
    private Context mContext;
    public ZhiChiMessageBase message;
    private PageBuilder pageBuilder;
    private HorizontalGridPage pageView;
    private LinearLayout sobot_ll_transferBtn;
    private TextView sobot_template2_item_last_page;
    private TextView sobot_template2_item_previous_page;
    private TextView sobot_tv_transferBtn;
    private TextView tv_msg;

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder2$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements PageCallBack {
        public final /* synthetic */ RobotTemplateMessageHolder2 this$0;
        public final /* synthetic */ String val$type;

        public AnonymousClass1(RobotTemplateMessageHolder2 robotTemplateMessageHolder2, String str) {
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

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder2$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements PagerGridLayoutManager.PageListener {
        public final /* synthetic */ RobotTemplateMessageHolder2 this$0;
        public final /* synthetic */ Context val$context;

        public AnonymousClass2(RobotTemplateMessageHolder2 robotTemplateMessageHolder2, Context context) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.PagerGridLayoutManager.PageListener
        public void onPageSelect(int i2) {
        }

        @Override // com.sobot.chat.widget.horizontalgridpage.PagerGridLayoutManager.PageListener
        public void onPageSizeChanged(int i2) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder2$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder2 this$0;
        public final /* synthetic */ Context val$context;

        public AnonymousClass3(RobotTemplateMessageHolder2 robotTemplateMessageHolder2, Context context) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder2$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder2 this$0;
        public final /* synthetic */ Context val$context;

        public AnonymousClass4(RobotTemplateMessageHolder2 robotTemplateMessageHolder2, Context context) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder2$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder2 this$0;

        public AnonymousClass5(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder2$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder2 this$0;

        public AnonymousClass6(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.viewHolder.RobotTemplateMessageHolder2$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 extends NoDoubleClickListener {
        public final /* synthetic */ RobotTemplateMessageHolder2 this$0;

        public AnonymousClass7(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
        }

        @Override // com.sobot.chat.listener.NoDoubleClickListener
        public void onNoDoubleClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class Template2ViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout sobotTemplateItemLL;
        public TextView sobotTitle;
        public final /* synthetic */ RobotTemplateMessageHolder2 this$0;

        public Template2ViewHolder(RobotTemplateMessageHolder2 robotTemplateMessageHolder2, View view, Context context) {
        }
    }

    public RobotTemplateMessageHolder2(Context context, View view) {
    }

    public static /* synthetic */ PageGridAdapter access$000(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
    }

    public static /* synthetic */ Context access$100(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
    }

    public static /* synthetic */ void access$200(RobotTemplateMessageHolder2 robotTemplateMessageHolder2, SobotLablesViewModel sobotLablesViewModel, SobotMultiDiaRespInfo sobotMultiDiaRespInfo, int i2) {
    }

    public static /* synthetic */ HorizontalGridPage access$300(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
    }

    public static /* synthetic */ TextView access$400(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
    }

    public static /* synthetic */ TextView access$500(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$600(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
    }

    public static /* synthetic */ SobotMsgAdapter.SobotMsgCallBack access$700(RobotTemplateMessageHolder2 robotTemplateMessageHolder2) {
    }

    public static /* synthetic */ void access$800(RobotTemplateMessageHolder2 robotTemplateMessageHolder2, boolean z) {
    }

    private void checkShowTransferBtn() {
    }

    private void doRevaluate(boolean z) {
    }

    private int getDisplayNum(SobotMultiDiaRespInfo sobotMultiDiaRespInfo, int i2) {
    }

    private void sendMultiRoundQuestions(SobotLablesViewModel sobotLablesViewModel, SobotMultiDiaRespInfo sobotMultiDiaRespInfo, int i2) {
    }

    @Override // com.sobot.chat.viewHolder.base.MessageHolderBase
    public void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase) {
    }

    public void hideRevaluateBtn() {
    }

    public void hideTransferBtn() {
    }

    public void initView(int i2, int i3, String str) {
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

    public void updateLastBtn(Context context) {
    }

    public void updatePreBtn(Context context) {
    }
}
