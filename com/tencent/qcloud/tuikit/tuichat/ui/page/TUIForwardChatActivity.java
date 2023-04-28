package com.tencent.qcloud.tuikit.tuichat.ui.page;

import android.os.Bundle;
import android.view.View;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.MergeMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ForwardPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageAdapter;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIForwardChatActivity extends BaseLightActivity {
    private static final String TAG = null;
    private ChatInfo chatInfo;
    private MessageAdapter mForwardChatAdapter;
    private MessageRecyclerView mFowardChatMessageRecyclerView;
    private MergeMessageBean mMessageInfo;
    private String mTitle;
    private TitleBarLayout mTitleBar;
    private ForwardPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIForwardChatActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ TUIForwardChatActivity this$0;

        public AnonymousClass1(TUIForwardChatActivity tUIForwardChatActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIForwardChatActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends OnItemClickListener {
        public final /* synthetic */ TUIForwardChatActivity this$0;

        public AnonymousClass2(TUIForwardChatActivity tUIForwardChatActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onMessageLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onReEditRevokeMessage(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onRecallClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }
    }

    private void init() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }
}
