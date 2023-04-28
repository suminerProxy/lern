package com.tencent.qcloud.tuikit.tuigroup.presenter;

import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider;
import com.tencent.qcloud.tuikit.tuigroup.ui.interfaces.IGroupApplyLayout;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupApplyPresenter {
    private GroupInfo groupInfo;
    private final IGroupApplyLayout layout;
    private final GroupInfoProvider provider;

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupApplyPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<List<GroupApplyInfo>> {
        public final /* synthetic */ GroupApplyPresenter this$0;

        public AnonymousClass1(GroupApplyPresenter groupApplyPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupApplyInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupApplyInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupApplyPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<Void> {
        public final /* synthetic */ GroupApplyPresenter this$0;
        public final /* synthetic */ GroupApplyInfo val$item;

        public AnonymousClass2(GroupApplyPresenter groupApplyPresenter, GroupApplyInfo groupApplyInfo) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.presenter.GroupApplyPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<Void> {
        public final /* synthetic */ GroupApplyPresenter this$0;
        public final /* synthetic */ GroupApplyInfo val$item;

        public AnonymousClass3(GroupApplyPresenter groupApplyPresenter, GroupApplyInfo groupApplyInfo) {
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

    public GroupApplyPresenter(IGroupApplyLayout iGroupApplyLayout) {
    }

    public static /* synthetic */ IGroupApplyLayout access$000(GroupApplyPresenter groupApplyPresenter) {
    }

    public void acceptApply(GroupApplyInfo groupApplyInfo) {
    }

    public void loadGroupApplies() {
    }

    public void refuseApply(GroupApplyInfo groupApplyInfo) {
    }

    public void setGroupInfo(GroupInfo groupInfo) {
    }
}
