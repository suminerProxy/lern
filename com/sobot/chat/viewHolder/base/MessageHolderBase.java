package com.sobot.chat.viewHolder.base;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sobot.chat.adapter.SobotMsgAdapter;
import com.sobot.chat.api.model.ZhiChiMessageBase;
import com.sobot.chat.widget.ReSendDialog;
import com.sobot.chat.widget.SobotImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class MessageHolderBase {
    public FrameLayout frameLayout;
    private SobotImageView imgHead;
    public boolean isRight;
    public Context mContext;
    public View mItemView;
    public ZhiChiMessageBase message;
    public SobotMsgAdapter.SobotMsgCallBack msgCallBack;
    private TextView msgContentTV;
    public ProgressBar msgProgressBar;
    public ImageView msgStatus;
    public TextView name;
    public TextView reminde_time_Text;
    public RelativeLayout rightEmptyRL;
    public int sobot_chat_file_bgColor;
    public View sobot_ll_content;
    public LinearLayout sobot_ll_dislikeBtn;
    public LinearLayout sobot_ll_hollow_container;
    public LinearLayout sobot_ll_likeBtn;
    public RelativeLayout sobot_rl_hollow_container;
    public TextView sobot_tv_dislikeBtn;
    public TextView sobot_tv_likeBtn;

    /* renamed from: com.sobot.chat.viewHolder.base.MessageHolderBase$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class AnonymousClass1 implements ReSendDialog.OnItemClick {
        public final /* synthetic */ ReSendDialog val$reSendDialog;
        public final /* synthetic */ ReSendListener val$reSendListener;

        public AnonymousClass1(ReSendListener reSendListener, ReSendDialog reSendDialog) {
        }

        @Override // com.sobot.chat.widget.ReSendDialog.OnItemClick
        public void OnClick(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface ReSendListener {
        void onReSend();
    }

    public MessageHolderBase(Context context, View view) {
    }

    private void applyCustomHeadUI() {
    }

    public static void showReSendDialog(Context context, ImageView imageView, ReSendListener reSendListener) {
    }

    public void applyCustomUI() {
    }

    public void applyTextViewUIConfig(TextView textView) {
    }

    public abstract void bindData(Context context, ZhiChiMessageBase zhiChiMessageBase);

    public void bindZhiChiMessageBase(ZhiChiMessageBase zhiChiMessageBase) {
    }

    public int getLinkTextColor() {
    }

    public void initNameAndFace(int i2) {
    }

    public boolean isRight() {
    }

    public void setMsgCallBack(SobotMsgAdapter.SobotMsgCallBack sobotMsgCallBack) {
    }

    public void setRight(boolean z) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class ImageClickLisenter implements View.OnClickListener {
        private Context context;
        private String imageUrl;
        private boolean isRight;

        public ImageClickLisenter(Context context, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        public ImageClickLisenter(Context context, String str, boolean z) {
        }
    }
}
