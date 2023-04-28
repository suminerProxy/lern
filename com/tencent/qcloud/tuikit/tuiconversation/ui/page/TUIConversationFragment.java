package com.tencent.qcloud.tuikit.tuiconversation.ui.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.action.PopActionClickListener;
import com.tencent.qcloud.tuicore.component.action.PopDialogAdapter;
import com.tencent.qcloud.tuicore.component.action.PopMenuAction;
import com.tencent.qcloud.tuicore.component.fragments.BaseFragment;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener;
import com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemLongClickListener;
import com.tencent.qcloud.tuikit.tuiconversation.ui.view.ConversationLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIConversationFragment extends BaseFragment {
    private View mBaseView;
    private ConversationLayout mConversationLayout;
    private List<PopMenuAction> mConversationPopActions;
    private PopDialogAdapter mConversationPopAdapter;
    private ListView mConversationPopList;
    private PopupWindow mConversationPopWindow;
    private ConversationPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIConversationFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements OnItemClickListener {
        public final /* synthetic */ TUIConversationFragment this$0;

        public AnonymousClass1(TUIConversationFragment tUIConversationFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemClickListener
        public void onItemClick(View view, int i2, ConversationInfo conversationInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIConversationFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements OnItemLongClickListener {
        public final /* synthetic */ TUIConversationFragment this$0;

        public AnonymousClass2(TUIConversationFragment tUIConversationFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuiconversation.ui.interfaces.OnItemLongClickListener
        public void OnItemLongClick(View view, ConversationInfo conversationInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIConversationFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements PopActionClickListener {
        public final /* synthetic */ TUIConversationFragment this$0;

        public AnonymousClass3(TUIConversationFragment tUIConversationFragment) {
        }

        @Override // com.tencent.qcloud.tuicore.component.action.PopActionClickListener
        public void onActionClick(int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIConversationFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements PopActionClickListener {
        public final /* synthetic */ TUIConversationFragment this$0;
        public final /* synthetic */ boolean val$markUnread;

        public AnonymousClass4(TUIConversationFragment tUIConversationFragment, boolean z) {
        }

        @Override // com.tencent.qcloud.tuicore.component.action.PopActionClickListener
        public void onActionClick(int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIConversationFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements PopActionClickListener {
        public final /* synthetic */ TUIConversationFragment this$0;

        public AnonymousClass5(TUIConversationFragment tUIConversationFragment) {
        }

        @Override // com.tencent.qcloud.tuicore.component.action.PopActionClickListener
        public void onActionClick(int i2, Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIConversationFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements AdapterView.OnItemClickListener {
        public final /* synthetic */ TUIConversationFragment this$0;
        public final /* synthetic */ ConversationInfo val$conversationInfo;

        public AnonymousClass6(TUIConversationFragment tUIConversationFragment, ConversationInfo conversationInfo) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuiconversation.ui.page.TUIConversationFragment$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements PopupWindow.OnDismissListener {
        public final /* synthetic */ TUIConversationFragment this$0;

        public AnonymousClass7(TUIConversationFragment tUIConversationFragment) {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    public static /* synthetic */ ConversationLayout access$000(TUIConversationFragment tUIConversationFragment) {
    }

    public static /* synthetic */ void access$100(TUIConversationFragment tUIConversationFragment) {
    }

    public static /* synthetic */ void access$200(TUIConversationFragment tUIConversationFragment, View view, ConversationInfo conversationInfo) {
    }

    public static /* synthetic */ List access$300(TUIConversationFragment tUIConversationFragment) {
    }

    public static /* synthetic */ PopupWindow access$400(TUIConversationFragment tUIConversationFragment) {
    }

    private void addDeletePopMenuAction() {
    }

    private void addMarkUnreadPopMenuAction(boolean z) {
    }

    private void initPopMenuAction() {
    }

    private void initView() {
    }

    private void showItemPopMenu(View view, ConversationInfo conversationInfo) {
    }

    private void startFoldedConversationActivity() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
    }

    public void restoreConversationItemBackground() {
    }
}
