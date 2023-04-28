package com.tencent.qcloud.tuikit.tuicontact.model;

import android.util.Pair;
import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMFriendApplication;
import com.tencent.imsdk.v2.V2TIMFriendApplicationResult;
import com.tencent.imsdk.v2.V2TIMFriendInfo;
import com.tencent.imsdk.v2.V2TIMFriendOperationResult;
import com.tencent.imsdk.v2.V2TIMGroupInfo;
import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfoResult;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.imsdk.v2.V2TIMReceiveMessageOptInfo;
import com.tencent.imsdk.v2.V2TIMSendCallback;
import com.tencent.imsdk.v2.V2TIMUserFullInfo;
import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactGroupApplyInfo;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ContactProvider {
    private static final String TAG = "ContactProvider";
    private long mNextSeq;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02261 implements V2TIMValueCallback<List<V2TIMFriendInfo>> {
            public final /* synthetic */ AnonymousClass1 this$1;

            public C02261(AnonymousClass1 anonymousClass1) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMValueCallback
            public void onError(int i2, String str) {
            }

            @Override // com.tencent.imsdk.v2.V2TIMValueCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendInfo> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<V2TIMFriendInfo> list) {
            }
        }

        public AnonymousClass1(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 implements V2TIMValueCallback<List<V2TIMReceiveMessageOptInfo>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass10(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMReceiveMessageOptInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMReceiveMessageOptInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 implements V2TIMCallback {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass11(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements V2TIMValueCallback<List<V2TIMGroupInfoResult>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass12(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 implements V2TIMValueCallback<List<V2TIMUserFullInfo>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass13(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMUserFullInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMUserFullInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements V2TIMValueCallback<List<V2TIMFriendInfo>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ String val$id;

        public AnonymousClass14(ContactProvider contactProvider, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 implements V2TIMValueCallback<List<V2TIMFriendInfo>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ ContactItemBean val$bean;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ String val$id;

        public AnonymousClass15(ContactProvider contactProvider, IUIKitCallback iUIKitCallback, String str, ContactItemBean contactItemBean) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements V2TIMValueCallback<List<V2TIMFriendOperationResult>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass16(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 implements V2TIMValueCallback<List<V2TIMFriendOperationResult>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass17(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 implements V2TIMCallback {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ String val$remark;

        public AnonymousClass18(ContactProvider contactProvider, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 implements V2TIMValueCallback<List<V2TIMFriendOperationResult>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass19(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements V2TIMValueCallback<List<V2TIMFriendInfo>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass2(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass20 implements V2TIMValueCallback<V2TIMFriendOperationResult> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass20(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMFriendOperationResult v2TIMFriendOperationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMFriendOperationResult v2TIMFriendOperationResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass21 implements V2TIMValueCallback<String> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass21(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String str) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass22 implements V2TIMSendCallback<V2TIMMessage> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ String val$groupId;

        public AnonymousClass22(ContactProvider contactProvider, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMSendCallback
        public void onProgress(int i2) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }

        public void onSuccess(V2TIMMessage v2TIMMessage) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass23 implements V2TIMCallback {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass23(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass24 implements V2TIMCallback {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass24(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass25 implements V2TIMCallback {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass25(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass26 implements V2TIMValueCallback<List<V2TIMUserStatus>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ HashMap val$dataSourceMap;

        public AnonymousClass26(ContactProvider contactProvider, HashMap hashMap, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMUserStatus> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMUserStatus> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements V2TIMValueCallback<List<V2TIMGroupInfo>> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass3(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMGroupInfo> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements V2TIMValueCallback<V2TIMGroupMemberInfoResult> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass4(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements V2TIMValueCallback<V2TIMFriendOperationResult> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass5(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMFriendOperationResult v2TIMFriendOperationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMFriendOperationResult v2TIMFriendOperationResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements V2TIMCallback {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass6(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements V2TIMValueCallback<V2TIMFriendApplicationResult> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass7(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMFriendApplicationResult v2TIMFriendApplicationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMFriendApplicationResult v2TIMFriendApplicationResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 implements V2TIMValueCallback<V2TIMFriendApplicationResult> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass8(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMFriendApplicationResult v2TIMFriendApplicationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMFriendApplicationResult v2TIMFriendApplicationResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 implements V2TIMValueCallback<V2TIMFriendOperationResult> {
        public final /* synthetic */ ContactProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass9(ContactProvider contactProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMFriendOperationResult v2TIMFriendOperationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMFriendOperationResult v2TIMFriendOperationResult) {
        }
    }

    private void acceptFriendApplication(V2TIMFriendApplication v2TIMFriendApplication, int i2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ long access$102(ContactProvider contactProvider, long j2) {
    }

    public void acceptJoinGroupApply(ContactGroupApplyInfo contactGroupApplyInfo, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void addFriend(String str, String str2, IUIKitCallback<Pair<Integer, String>> iUIKitCallback) {
    }

    public void addToBlackList(List<String> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void createGroupChat(GroupInfo groupInfo, IUIKitCallback<String> iUIKitCallback) {
    }

    public void deleteFriend(List<String> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void deleteFromBlackList(List<String> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void getC2CReceiveMessageOpt(List<String> list, IUIKitCallback<Boolean> iUIKitCallback) {
    }

    public void getFriendApplicationListUnreadCount(IUIKitCallback<Integer> iUIKitCallback) {
    }

    public void getGroupInfo(List<String> list, IUIKitCallback<List<GroupInfo>> iUIKitCallback) {
    }

    public long getNextSeq() {
    }

    public void getUserInfo(List<String> list, IUIKitCallback<List<ContactItemBean>> iUIKitCallback) {
    }

    public void isFriend(String str, ContactItemBean contactItemBean, IUIKitCallback<Boolean> iUIKitCallback) {
    }

    public void isInBlackList(String str, IUIKitCallback<Boolean> iUIKitCallback) {
    }

    public void joinGroup(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void loadBlackListData(IUIKitCallback<List<ContactItemBean>> iUIKitCallback) {
    }

    public void loadContactUserStatus(List<ContactItemBean> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void loadFriendApplicationList(IUIKitCallback<List<FriendApplicationBean>> iUIKitCallback) {
    }

    public void loadFriendListDataAsync(IUIKitCallback<List<ContactItemBean>> iUIKitCallback) {
    }

    public void loadGroupListData(IUIKitCallback<List<ContactItemBean>> iUIKitCallback) {
    }

    public void loadGroupMembers(String str, IUIKitCallback<List<ContactItemBean>> iUIKitCallback) {
    }

    public void modifyRemark(String str, String str2, IUIKitCallback<String> iUIKitCallback) {
    }

    public void refuseFriendApplication(FriendApplicationBean friendApplicationBean, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void refuseJoinGroupApply(ContactGroupApplyInfo contactGroupApplyInfo, String str, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void sendGroupTipsMessage(String str, String str2, IUIKitCallback<String> iUIKitCallback) {
    }

    public void setC2CReceiveMessageOpt(List<String> list, boolean z, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setGroupApplicationRead(IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setNextSeq(long j2) {
    }

    public void acceptFriendApplication(FriendApplicationBean friendApplicationBean, int i2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void addFriend(String str, String str2, String str3, String str4, IUIKitCallback<Pair<Integer, String>> iUIKitCallback) {
    }
}
