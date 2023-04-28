package com.tencent.qcloud.tuikit.tuigroup.presenter;

import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuigroup.interfaces.GroupEventListener;
import com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupMemberLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfoPresenter {
    public static final String TAG = "GroupInfoPresenter";
    private GroupEventListener groupEventListener;
    private GroupInfo groupInfo;
    private final IGroupMemberLayout layout;
    private final GroupInfoProvider provider;
    private GroupMemberInfo selfGroupMemberInfo;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements GroupEventListener {
        public final /* synthetic */ GroupInfoPresenter this$0;

        public AnonymousClass1(GroupInfoPresenter groupInfoPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuigroup.interfaces.GroupEventListener
        public void onGroupInfoChanged(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends IUIKitCallback {
        public final /* synthetic */ GroupInfoPresenter this$0;

        public AnonymousClass10(GroupInfoPresenter groupInfoPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 extends IUIKitCallback<GroupInfo> {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ List val$addMembers;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass11(GroupInfoPresenter groupInfoPresenter, List list, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(GroupInfo groupInfo) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(GroupInfo groupInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 extends IUIKitCallback<Object> {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass12(GroupInfoPresenter groupInfoPresenter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 extends IUIKitCallback<List<String>> {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ GroupInfo val$groupInfo;

        public AnonymousClass13(GroupInfoPresenter groupInfoPresenter, GroupInfo groupInfo, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 extends IUIKitCallback {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ GroupInfo val$groupInfo;
        public final /* synthetic */ boolean val$isChecked;

        public AnonymousClass14(GroupInfoPresenter groupInfoPresenter, GroupInfo groupInfo, boolean z, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 extends IUIKitCallback {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ GroupInfo val$groupInfo;
        public final /* synthetic */ boolean val$isChecked;

        public AnonymousClass15(GroupInfoPresenter groupInfoPresenter, GroupInfo groupInfo, boolean z, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 extends IUIKitCallback<Void> {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass16(GroupInfoPresenter groupInfoPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<GroupInfo> {
        public final /* synthetic */ GroupInfoPresenter this$0;

        public AnonymousClass2(GroupInfoPresenter groupInfoPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(GroupInfo groupInfo) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(GroupInfo groupInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<GroupInfo> {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass3(GroupInfoPresenter groupInfoPresenter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(GroupInfo groupInfo) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(GroupInfo groupInfo) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ String val$name;

        public AnonymousClass4(GroupInfoPresenter groupInfoPresenter, String str) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ String val$notice;

        public AnonymousClass5(GroupInfoPresenter groupInfoPresenter, String str) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ String val$nickname;

        public AnonymousClass6(GroupInfoPresenter groupInfoPresenter, String str) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass7(GroupInfoPresenter groupInfoPresenter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onSuccess(Object obj) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends IUIKitCallback<Void> {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ boolean val$isSetTop;

        public AnonymousClass8(GroupInfoPresenter groupInfoPresenter, boolean z, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupInfoPresenter$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends IUIKitCallback<Void> {
        public final /* synthetic */ GroupInfoPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass9(GroupInfoPresenter groupInfoPresenter, IUIKitCallback iUIKitCallback) {
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

    public GroupInfoPresenter(IGroupMemberLayout iGroupMemberLayout) {
    }

    public static /* synthetic */ void access$000(GroupInfoPresenter groupInfoPresenter, String str) {
    }

    public static /* synthetic */ GroupInfo access$100(GroupInfoPresenter groupInfoPresenter) {
    }

    public static /* synthetic */ GroupInfo access$102(GroupInfoPresenter groupInfoPresenter, GroupInfo groupInfo) {
    }

    public static /* synthetic */ IGroupMemberLayout access$200(GroupInfoPresenter groupInfoPresenter) {
    }

    public static /* synthetic */ void access$300(GroupInfoPresenter groupInfoPresenter, List list, IUIKitCallback iUIKitCallback) {
    }

    private void onGroupInfoChanged(String str) {
    }

    public void deleteGroup(IUIKitCallback<Void> iUIKitCallback) {
    }

    public void deleteGroupMembers(String str, List<String> list, IUIKitCallback<List<String>> iUIKitCallback) {
    }

    public void getGroupMembers(GroupInfo groupInfo, IUIKitCallback<GroupInfo> iUIKitCallback) {
    }

    public String getNickName() {
    }

    public GroupMemberInfo getSelfGroupMemberInfo() {
    }

    public void inviteGroupMembers(String str, List<String> list, IUIKitCallback<Object> iUIKitCallback) {
    }

    public boolean isAdmin(int i2) {
    }

    public boolean isSelf(String str) {
    }

    public void loadGroupInfo(String str) {
    }

    public void modifyGroupFaceUrl(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void modifyGroupInfo(int i2, int i3) {
    }

    public void modifyGroupName(String str) {
    }

    public void modifyGroupNotice(String str) {
    }

    public void modifyMyGroupNickname(String str) {
    }

    public void quitGroup(IUIKitCallback<Void> iUIKitCallback) {
    }

    public void removeGroupMembers(GroupInfo groupInfo, List<GroupMemberInfo> list, IUIKitCallback iUIKitCallback) {
    }

    public void setGroupEventListener() {
    }

    public void setGroupFold(GroupInfo groupInfo, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setGroupInfo(GroupInfo groupInfo) {
    }

    public void setGroupNotDisturb(GroupInfo groupInfo, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setTopConversation(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void transferGroupOwner(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    private void inviteGroupMembers(List<String> list, IUIKitCallback<Object> iUIKitCallback) {
    }

    public void loadGroupInfo(String str, int i2) {
    }
}
