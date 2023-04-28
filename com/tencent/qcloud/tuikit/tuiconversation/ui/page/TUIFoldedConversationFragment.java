package com.tencent.qcloud.tuikit.tuiconversation.ui.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.action.PopActionClickListener;
import com.tencent.qcloud.tuicore.component.action.PopDialogAdapter;
import com.tencent.qcloud.tuicore.component.action.PopMenuAction;
import com.tencent.qcloud.tuicore.component.fragments.BaseFragment;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationFoldPresenter;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemLongClickListener;
import com.tencent.qcloud.tuikit.tuiconversation.ui.view.FoldedConversationLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIFoldedConversationFragment extends BaseFragment {
    private View mBaseView;
    private List<PopMenuAction> mConversationPopActions;
    private PopDialogAdapter mConversationPopAdapter;
    private ListView mConversationPopList;
    private PopupWindow mConversationPopWindow;
    private FoldedConversationLayout mFoldedLayout;
    private TitleBarLayout mTitleBarLayout;
    private ConversationFoldPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIFoldedConversationFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ TUIFoldedConversationFragment this$0;

        public AnonymousClass1(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIFoldedConversationFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements OnItemClickListener {
        public final /* synthetic */ TUIFoldedConversationFragment this$0;

        public AnonymousClass2(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener
        public void onItemClick(View view, int i2, ConversationInfo conversationInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIFoldedConversationFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements OnItemLongClickListener {
        public final /* synthetic */ TUIFoldedConversationFragment this$0;

        public AnonymousClass3(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemLongClickListener
        public void OnItemLongClick(View view, ConversationInfo conversationInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIFoldedConversationFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements PopActionClickListener {
        public final /* synthetic */ TUIFoldedConversationFragment this$0;

        public AnonymousClass4(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
        }

        @Override // com.tencent.qcloud.tuicore.component.action.PopActionClickListener
        public void onActionClick(int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIFoldedConversationFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements PopActionClickListener {
        public final /* synthetic */ TUIFoldedConversationFragment this$0;

        public AnonymousClass5(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
        }

        @Override // com.tencent.qcloud.tuicore.component.action.PopActionClickListener
        public void onActionClick(int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIFoldedConversationFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements PopActionClickListener {
        public final /* synthetic */ TUIFoldedConversationFragment this$0;
        public final /* synthetic */ boolean val$markUnread;

        public AnonymousClass6(TUIFoldedConversationFragment tUIFoldedConversationFragment, boolean z) {
        }

        @Override // com.tencent.qcloud.tuicore.component.action.PopActionClickListener
        public void onActionClick(int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIFoldedConversationFragment$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ TUIFoldedConversationFragment this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;

        public AnonymousClass7(TUIFoldedConversationFragment tUIFoldedConversationFragment, ConversationInfo conversationInfo) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIFoldedConversationFragment$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements PopupWindow.OnDismissListener {
        public final /* synthetic */ TUIFoldedConversationFragment this$0;

        public AnonymousClass8(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    public static /* synthetic */ void access$000(TUIFoldedConversationFragment tUIFoldedConversationFragment, View view, ConversationInfo conversationInfo) {
    }

    public static /* synthetic */ FoldedConversationLayout access$100(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
    }

    public static /* synthetic */ List access$200(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
    }

    public static /* synthetic */ PopupWindow access$300(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
    }

    public static /* synthetic */ void access$400(TUIFoldedConversationFragment tUIFoldedConversationFragment) {
    }

    private void addMarkUnreadPopMenuAction(boolean z) {
    }

    private void initPopMenuAction() {
    }

    private void initView() {
    }

    private void restoreConversationItemBackground() {
    }

    private void showItemPopMenu(View view, ConversationInfo conversationInfo) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }
}
