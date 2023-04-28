package com.tencent.qcloud.tuikit.tuichat.ui.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.presenter.GroupChatPresenter;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIGroupChatFragment extends TUIBaseChatFragment {
    private static final String TAG = null;
    private GroupInfo groupInfo;
    private GroupChatPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIGroupChatFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends OnItemClickListener {
        public final /* synthetic */ TUIGroupChatFragment this$0;

        public AnonymousClass1(TUIGroupChatFragment tUIGroupChatFragment) {
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
        public void onTextSelected(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.ui.interfaces.OnItemClickListener
        public void onUserIconLongClick(View view, int i2, TUIMessageBean tUIMessageBean) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.ui.page.TUIGroupChatFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ TUIGroupChatFragment this$0;

        public AnonymousClass2(TUIGroupChatFragment tUIGroupChatFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ GroupInfo access$100(TUIGroupChatFragment tUIGroupChatFragment) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment
    public ChatInfo getChatInfo() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment
    public /* bridge */ /* synthetic */ ChatPresenter getPresenter() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment
    public void initView() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
    }

    public void setPresenter(GroupChatPresenter groupChatPresenter) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.page.TUIBaseChatFragment
    public GroupChatPresenter getPresenter() {
    }
}
