package com.tencent.qcloud.tuikit.tuiconversation.ui.page;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.fragments.BaseFragment;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuiconversation.ui.view.ForwardConversationSelectorAdapter;
import com.tencent.qcloud.tuikit.tuiconversation.ui.view.ForwardSelectLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIForwardSelectFragment extends BaseFragment {
    private static final String TAG = null;
    private ForwardConversationSelectorAdapter mAdapter;
    private List<ConversationInfo> mAllSelectedConversations;
    private View mBaseView;
    private List<ConversationInfo> mContactDataSource;
    private List<ConversationInfo> mDataSource;
    private ForwardSelectLayout mForwardLayout;
    private RecyclerView mForwardSelectlistView;
    private RelativeLayout mForwardSelectlistViewLayout;
    private TextView mSureView;
    private TitleBarLayout mTitleBarLayout;
    private ConversationPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIForwardSelectFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements OnItemClickListener {
        public final /* synthetic */ TUIForwardSelectFragment this$0;

        public AnonymousClass1(TUIForwardSelectFragment tUIForwardSelectFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener
        public void onItemClick(View view, int i2, ConversationInfo conversationInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIForwardSelectFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements ForwardConversationSelectorAdapter.OnItemClickListener {
        public final /* synthetic */ TUIForwardSelectFragment this$0;

        public AnonymousClass2(TUIForwardSelectFragment tUIForwardSelectFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.view.ForwardConversationSelectorAdapter.OnItemClickListener
        public void onClick(View view, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIForwardSelectFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ TUIForwardSelectFragment this$0;

        public AnonymousClass3(TUIForwardSelectFragment tUIForwardSelectFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIForwardSelectFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements DialogInterface.OnClickListener {
        public final /* synthetic */ TUIForwardSelectFragment this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;

        public AnonymousClass4(TUIForwardSelectFragment tUIForwardSelectFragment, ConversationInfo conversationInfo) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIForwardSelectFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements DialogInterface.OnClickListener {
        public final /* synthetic */ TUIForwardSelectFragment this$0;

        public AnonymousClass5(TUIForwardSelectFragment tUIForwardSelectFragment) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIForwardSelectFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public final /* synthetic */ TUIForwardSelectFragment this$0;

        public AnonymousClass6(TUIForwardSelectFragment tUIForwardSelectFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIForwardSelectFragment$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public final /* synthetic */ TUIForwardSelectFragment this$0;

        public AnonymousClass7(TUIForwardSelectFragment tUIForwardSelectFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static /* synthetic */ TitleBarLayout access$000(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    public static /* synthetic */ String access$100() {
    }

    public static /* synthetic */ List access$1000(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    public static /* synthetic */ List access$200(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    public static /* synthetic */ List access$202(TUIForwardSelectFragment tUIForwardSelectFragment, List list) {
    }

    public static /* synthetic */ ForwardSelectLayout access$300(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    public static /* synthetic */ void access$400(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    public static /* synthetic */ void access$500(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    public static /* synthetic */ void access$600(TUIForwardSelectFragment tUIForwardSelectFragment, ConversationInfo conversationInfo) {
    }

    public static /* synthetic */ List access$700(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    public static /* synthetic */ RelativeLayout access$800(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    public static /* synthetic */ ForwardConversationSelectorAdapter access$900(TUIForwardSelectFragment tUIForwardSelectFragment) {
    }

    private void checkRepeat() {
    }

    private void customizeConversation() {
    }

    private void forwardMessages(ConversationInfo conversationInfo) {
    }

    private void initTitleAction() {
    }

    private void refreshSelectConversations() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
    }
}
