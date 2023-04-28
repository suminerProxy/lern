package com.tencent.qcloud.tuikit.tuigroup.ui.page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.activities.BaseLightActivity;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener;
import com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupMemberLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupMemberActivity extends BaseLightActivity {
    private ArrayList<String> alreadySelectedList;
    private ArrayList<String> excludeList;
    private String groupID;
    private boolean isSelectMode;
    private GroupMemberLayout mMemberLayout;
    private GroupInfoPresenter presenter;
    private String userData;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupMemberActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ GroupMemberActivity this$0;

        public AnonymousClass1(GroupMemberActivity groupMemberActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupMemberActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements IGroupMemberListener {
        public final /* synthetic */ GroupMemberActivity this$0;
        public final /* synthetic */ int val$limit;

        public AnonymousClass2(GroupMemberActivity groupMemberActivity, int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener
        public void forwardAddMember(GroupInfo groupInfo) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener
        public void forwardDeleteMember(GroupInfo groupInfo) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener
        public void forwardListMember(GroupInfo groupInfo) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener
        public void setSelectedMember(ArrayList<String> arrayList) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupMemberActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<List<String>> {
        public final /* synthetic */ GroupMemberActivity this$0;

        public AnonymousClass3(GroupMemberActivity groupMemberActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<String> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<String> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupMemberActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<Object> {
        public final /* synthetic */ GroupMemberActivity this$0;

        public AnonymousClass4(GroupMemberActivity groupMemberActivity) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    public static /* synthetic */ String access$000(GroupMemberActivity groupMemberActivity) {
    }

    public static /* synthetic */ String access$100(GroupMemberActivity groupMemberActivity) {
    }

    public static /* synthetic */ GroupInfoPresenter access$200(GroupMemberActivity groupMemberActivity) {
    }

    private void deleteGroupMembers(List<String> list) {
    }

    private void init() {
    }

    private void inviteGroupMembers(List<String> list) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.tencent.qcloud.tuicore.component.activities.BaseLightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }
}
