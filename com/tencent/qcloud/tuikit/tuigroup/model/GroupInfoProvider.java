package com.tencent.qcloud.tuikit.tuigroup.model;

import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMConversationOperationResult;
import com.tencent.imsdk.v2.V2TIMGroupApplicationResult;
import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfoResult;
import com.tencent.imsdk.v2.V2TIMGroupMemberOperationResult;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuigroup.bean.GroupMemberInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GroupInfoProvider {
    private static final int PAGE = 50;
    private static final String TAG = "GroupInfoProvider";

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<V2TIMGroupInfoResult> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ int val$filter;
        public final /* synthetic */ String val$groupId;

        /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02341 implements V2TIMValueCallback<V2TIMConversation> {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ GroupInfo val$groupInfo;

            public C02341(AnonymousClass1 anonymousClass1, GroupInfo groupInfo) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMValueCallback
            public void onError(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMValueCallback
            public /* bridge */ /* synthetic */ void onSuccess(V2TIMConversation v2TIMConversation) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(V2TIMConversation v2TIMConversation) {
            }
        }

        public AnonymousClass1(GroupInfoProvider groupInfoProvider, String str, int i2, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupInfoResult v2TIMGroupInfoResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupInfoResult v2TIMGroupInfoResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements V2TIMValueCallback<List<V2TIMGroupMemberOperationResult>> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass10(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupMemberOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMGroupMemberOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 extends IUIKitCallback<List<GroupApplyInfo>> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ GroupInfo val$groupInfo;

        public AnonymousClass11(GroupInfoProvider groupInfoProvider, GroupInfo groupInfo, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements V2TIMValueCallback<V2TIMGroupApplicationResult> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ List val$applies;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass12(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback, List list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupApplicationResult v2TIMGroupApplicationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupApplicationResult v2TIMGroupApplicationResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass13(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass14(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass15(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements V2TIMValueCallback<List<V2TIMConversationOperationResult>> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass16(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMConversationOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMConversationOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass17(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass18(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 implements V2TIMValueCallback<V2TIMGroupMemberInfoResult> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ String val$groupId;
        public final /* synthetic */ List val$managerList;

        public AnonymousClass19(GroupInfoProvider groupInfoProvider, List list, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass2(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass20 implements V2TIMValueCallback<V2TIMGroupMemberInfoResult> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ String val$groupId;
        public final /* synthetic */ List val$managerList;

        public AnonymousClass20(GroupInfoProvider groupInfoProvider, List list, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass21 implements V2TIMValueCallback<V2TIMGroupMemberInfoResult> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass21(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass22 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass22(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass23 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass23(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass24 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass24(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass25 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass25(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass26 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass26(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass27 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ String val$value;

        public AnonymousClass27(GroupInfoProvider groupInfoProvider, String str, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements V2TIMValueCallback<List<V2TIMGroupInfoResult>> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass3(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupInfoResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMGroupInfoResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements V2TIMValueCallback<V2TIMGroupMemberInfoResult> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ GroupInfo val$groupInfo;

        public AnonymousClass4(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback, GroupInfo groupInfo) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMGroupMemberInfoResult v2TIMGroupMemberInfoResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ GroupInfo val$groupInfo;
        public final /* synthetic */ int val$type;
        public final /* synthetic */ Object val$value;

        public AnonymousClass5(GroupInfoProvider groupInfoProvider, Object obj, int i2, IUIKitCallback iUIKitCallback, GroupInfo groupInfo) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass6(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass7(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements V2TIMCallback {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass8(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuigroup.model.GroupInfoProvider$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements V2TIMValueCallback<List<V2TIMGroupMemberOperationResult>> {
        public final /* synthetic */ GroupInfoProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;
        public final /* synthetic */ GroupInfo val$groupInfo;

        public AnonymousClass9(GroupInfoProvider groupInfoProvider, IUIKitCallback iUIKitCallback, GroupInfo groupInfo) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupMemberOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMGroupMemberOperationResult> list) {
        }
    }

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ void access$100(GroupInfoProvider groupInfoProvider, String str, long j2, V2TIMValueCallback v2TIMValueCallback) {
    }

    public static /* synthetic */ void access$200(GroupInfoProvider groupInfoProvider, String str, long j2, V2TIMValueCallback v2TIMValueCallback) {
    }

    private void loadApplyInfo(IUIKitCallback<List<GroupApplyInfo>> iUIKitCallback) {
    }

    public void acceptApply(GroupApplyInfo groupApplyInfo, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void cancelMuteGroupMember(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void clearGroupManager(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void deleteGroup(String str, IUIKitCallback<Void> iUIKitCallback) {
    }

    public List<GroupApplyInfo> getApplyList() {
    }

    public GroupMemberInfo getSelfGroupMemberInfo(GroupInfo groupInfo) {
    }

    public void inviteGroupMembers(GroupInfo groupInfo, List<String> list, IUIKitCallback iUIKitCallback) {
    }

    public boolean isAdmin(int i2) {
    }

    public boolean isSelf(String str) {
    }

    public void loadGroupApplies(GroupInfo groupInfo, IUIKitCallback<List<GroupApplyInfo>> iUIKitCallback) {
    }

    public void loadGroupInfo(String str, IUIKitCallback<GroupInfo> iUIKitCallback) {
    }

    public void loadGroupManagers(String str, IUIKitCallback<List<GroupMemberInfo>> iUIKitCallback) {
    }

    public void loadGroupMembers(GroupInfo groupInfo, long j2, IUIKitCallback<GroupInfo> iUIKitCallback) {
    }

    public void loadGroupOwner(String str, IUIKitCallback<GroupMemberInfo> iUIKitCallback) {
    }

    public void loadGroupPublicInfo(String str, IUIKitCallback<V2TIMGroupInfoResult> iUIKitCallback) {
    }

    public void loadMutedMembers(String str, IUIKitCallback<List<GroupMemberInfo>> iUIKitCallback) {
    }

    public void modifyGroupFaceUrl(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void modifyGroupInfo(GroupInfo groupInfo, Object obj, int i2, IUIKitCallback iUIKitCallback) {
    }

    public void modifyGroupNotification(String str, String str2, IUIKitCallback iUIKitCallback) {
    }

    public void modifyMyGroupNickname(GroupInfo groupInfo, String str, IUIKitCallback iUIKitCallback) {
    }

    public void muteAll(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void muteGroupMember(String str, String str2, int i2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void quitGroup(String str, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void refuseApply(GroupApplyInfo groupApplyInfo, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void removeGroupMembers(String str, List<String> list, IUIKitCallback<List<String>> iUIKitCallback) {
    }

    public void setGroupFold(String str, boolean z, IUIKitCallback iUIKitCallback) {
    }

    public void setGroupManager(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setGroupReceiveMessageOpt(String str, boolean z, IUIKitCallback iUIKitCallback) {
    }

    public void setTopConversation(String str, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void transferGroupOwner(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void loadGroupInfo(String str, int i2, IUIKitCallback<GroupInfo> iUIKitCallback) {
    }

    public void loadGroupMembers(GroupInfo groupInfo, int i2, long j2, IUIKitCallback<GroupInfo> iUIKitCallback) {
    }

    private void loadGroupMembers(String str, long j2, V2TIMValueCallback<V2TIMGroupMemberInfoResult> v2TIMValueCallback) {
    }

    private void loadGroupManagers(String str, long j2, V2TIMValueCallback<V2TIMGroupMemberInfoResult> v2TIMValueCallback) {
    }
}
