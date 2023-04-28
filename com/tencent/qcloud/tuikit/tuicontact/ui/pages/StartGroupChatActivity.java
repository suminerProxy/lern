package com.tencent.qcloud.tuikit.tuicontact.ui.pages;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.LineControllerView;
import com.tencent.qcloud.tuicore.component.TitleBarLayout;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.activities.SelectionActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter;
import com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupMemberSelectActivity;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class StartGroupChatActivity extends BaseLightActivity {
    private static final String TAG = null;
    private boolean communitySupportTopic;
    private TextView confirmButton;
    private int limit;
    private ContactListView mContactListView;
    private boolean mCreating;
    private int mGroupType;
    private ArrayList<String> mGroupTypeValue;
    private LineControllerView mJoinType;
    private int mJoinTypeIndex;
    private ArrayList<String> mJoinTypes;
    private ArrayList<GroupMemberInfo> mMembers;
    private TitleBarLayout mTitleBar;
    private ContactPresenter presenter;
    private RecyclerView selectedList;
    private StartGroupMemberSelectActivity.SelectedAdapter selectedListAdapter;
    private GroupMemberInfo selfInfo;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass1(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements View.OnClickListener {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass10(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass2(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass3(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements ContactListView.OnSelectChangedListener {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass4(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView.OnSelectChangedListener
        public void onSelectChanged(ContactItemBean contactItemBean, boolean z) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass5(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements SelectionActivity.OnResultReturnListener {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass6(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.activities.SelectionActivity.OnResultReturnListener
        public void onReturn(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback<String> {
        public final /* synthetic */ StartGroupChatActivity this$0;
        public final /* synthetic */ GroupInfo val$groupInfo;

        public AnonymousClass7(StartGroupChatActivity startGroupChatActivity, GroupInfo groupInfo) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends ClickableSpan {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass8(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.ui.pages.StartGroupChatActivity$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public final /* synthetic */ StartGroupChatActivity this$0;

        public AnonymousClass9(StartGroupChatActivity startGroupChatActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static /* synthetic */ void access$000(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ void access$100(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ GroupMemberInfo access$1000(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ void access$1100(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ void access$1200(StartGroupChatActivity startGroupChatActivity, String str) {
    }

    public static /* synthetic */ ArrayList access$200(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ StartGroupMemberSelectActivity.SelectedAdapter access$300(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ TextView access$400(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ ArrayList access$500(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ LineControllerView access$600(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ int access$702(StartGroupChatActivity startGroupChatActivity, int i2) {
    }

    public static /* synthetic */ boolean access$800(StartGroupChatActivity startGroupChatActivity) {
    }

    public static /* synthetic */ boolean access$902(StartGroupChatActivity startGroupChatActivity, boolean z) {
    }

    private void createGroupChat() {
    }

    private void init() {
    }

    private void openWebUrl(String str) {
    }

    private void showJoinTypePickerView() {
    }

    private void showNotSupportDialog() {
    }

    private void toCreateGroupChat() {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    public void setGroupType(int i2) {
    }
}
