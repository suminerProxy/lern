package com.tencent.qcloud.tuikit.tuigroup.ui.page;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.component.fragments.BaseFragment;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberListener;
import com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfoFragment extends BaseFragment {
    private static final int CHOOSE_AVATAR_REQUEST_CODE = 101;
    private View baseView;
    private String groupId;
    private GroupInfoLayout groupInfoLayout;
    private GroupInfoPresenter groupInfoPresenter;
    private String mChatBackgroundThumbnailUrl;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupInfoFragment$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements OnModifyGroupAvatarListener {
        public final /* synthetic */ GroupInfoFragment this$0;

        public AnonymousClass1(GroupInfoFragment groupInfoFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupInfoFragment.OnModifyGroupAvatarListener
        public void onModifyGroupAvatar(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupInfoFragment$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements IGroupMemberListener {
        public final /* synthetic */ GroupInfoFragment this$0;

        public AnonymousClass2(GroupInfoFragment groupInfoFragment) {
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
        public /* synthetic */ void setSelectedMember(ArrayList arrayList) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupInfoFragment$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements GroupInfoLayout.OnButtonClickListener {
        public final /* synthetic */ GroupInfoFragment this$0;

        public AnonymousClass3(GroupInfoFragment groupInfoFragment) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.ui.view.GroupInfoLayout.OnButtonClickListener
        public void onSetChatBackground() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupInfoFragment$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<List<String>> {
        public final /* synthetic */ GroupInfoFragment this$0;

        public AnonymousClass4(GroupInfoFragment groupInfoFragment) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupInfoFragment$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<Object> {
        public final /* synthetic */ GroupInfoFragment this$0;

        public AnonymousClass5(GroupInfoFragment groupInfoFragment) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.ui.page.GroupInfoFragment$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<Void> {
        public final /* synthetic */ GroupInfoFragment this$0;

        public AnonymousClass6(GroupInfoFragment groupInfoFragment) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnModifyGroupAvatarListener {
        void onModifyGroupAvatar(String str);
    }

    public static /* synthetic */ String access$000(GroupInfoFragment groupInfoFragment) {
    }

    public static /* synthetic */ String access$100(GroupInfoFragment groupInfoFragment) {
    }

    public static /* synthetic */ GroupInfoPresenter access$200(GroupInfoFragment groupInfoFragment) {
    }

    public static /* synthetic */ GroupInfoLayout access$300(GroupInfoFragment groupInfoFragment) {
    }

    private void deleteGroupMembers(List<String> list) {
    }

    private void initView() {
    }

    private void inviteGroupMembers(List<String> list) {
    }

    private void modifyGroupAvatar(String str) {
    }

    public void changeGroupOwner(String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
    }
}
