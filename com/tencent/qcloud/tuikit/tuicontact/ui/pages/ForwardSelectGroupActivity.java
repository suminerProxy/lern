package com.tencent.qcloud.tuikit.tuicontact.ui.pages;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.LineControllerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.activities.SelectionActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.ForwardContactSelectorAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ForwardSelectGroupActivity extends BaseLightActivity {
    private static final String TAG = null;
    private boolean isCreateNewChat;
    private ForwardContactSelectorAdapter mAdapter;
    private List<ConversationInfo> mContactDataSource;
    private ContactListView mContactListView;
    private boolean mCreating;
    private RecyclerView mForwardSelectlistView;
    private RelativeLayout mForwardSelectlistViewLayout;
    private int mGroupType;
    private ArrayList<String> mGroupTypeValue;
    private LineControllerView mJoinType;
    private int mJoinTypeIndex;
    private ArrayList<String> mJoinTypes;
    private ArrayList<GroupMemberInfo> mMembers;
    private List<String> mSelectConversationIcons;
    private TextView mSureView;
    private TitleBarLayout mTitleBar;
    private ContactPresenter presenter;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.ForwardSelectGroupActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ ForwardSelectGroupActivity this$0;

        public AnonymousClass1(ForwardSelectGroupActivity forwardSelectGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.ForwardSelectGroupActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ ForwardSelectGroupActivity this$0;

        public AnonymousClass2(ForwardSelectGroupActivity forwardSelectGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.ForwardSelectGroupActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements ContactListView.OnSelectChangedListener {
        public final /* synthetic */ ForwardSelectGroupActivity this$0;

        public AnonymousClass3(ForwardSelectGroupActivity forwardSelectGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView.OnSelectChangedListener
        public void onSelectChanged(ContactItemBean contactItemBean, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.ForwardSelectGroupActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ ForwardSelectGroupActivity this$0;

        public AnonymousClass4(ForwardSelectGroupActivity forwardSelectGroupActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.ForwardSelectGroupActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements SelectionActivity.OnResultReturnListener {
        public final /* synthetic */ ForwardSelectGroupActivity this$0;

        public AnonymousClass5(ForwardSelectGroupActivity forwardSelectGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.activities.SelectionActivity.OnResultReturnListener
        public void onReturn(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.ForwardSelectGroupActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<String> {
        public final /* synthetic */ ForwardSelectGroupActivity this$0;

        public AnonymousClass6(ForwardSelectGroupActivity forwardSelectGroupActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String str) {
        }
    }

    public static /* synthetic */ void access$000(ForwardSelectGroupActivity forwardSelectGroupActivity) {
    }

    public static /* synthetic */ ArrayList access$100(ForwardSelectGroupActivity forwardSelectGroupActivity) {
    }

    public static /* synthetic */ void access$200(ForwardSelectGroupActivity forwardSelectGroupActivity) {
    }

    public static /* synthetic */ boolean access$300(ForwardSelectGroupActivity forwardSelectGroupActivity) {
    }

    public static /* synthetic */ void access$400(ForwardSelectGroupActivity forwardSelectGroupActivity) {
    }

    public static /* synthetic */ ArrayList access$500(ForwardSelectGroupActivity forwardSelectGroupActivity) {
    }

    public static /* synthetic */ LineControllerView access$600(ForwardSelectGroupActivity forwardSelectGroupActivity) {
    }

    public static /* synthetic */ int access$702(ForwardSelectGroupActivity forwardSelectGroupActivity, int i2) {
    }

    public static /* synthetic */ boolean access$802(ForwardSelectGroupActivity forwardSelectGroupActivity, boolean z) {
    }

    private void createGroupChat() {
    }

    private String getMembersUserId() {
    }

    private void init() {
    }

    private void refreshMembers() {
    }

    private void refreshSelectConversations() {
    }

    private void showJoinTypePickerView() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    public void setGroupType(int i2) {
    }
}
