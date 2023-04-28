package com.tencent.imsdk.v2;

import com.tencent.imsdk.common.IMCallback;
import com.tencent.imsdk.group.GroupApplicationResult;
import com.tencent.imsdk.group.GroupInfo;
import com.tencent.imsdk.group.GroupInfoGetResult;
import com.tencent.imsdk.group.GroupMemberInfo;
import com.tencent.imsdk.group.GroupMemberInfoResult;
import com.tencent.imsdk.group.GroupMemberOperationResult;
import com.tencent.imsdk.group.TopicInfo;
import com.tencent.imsdk.group.TopicOperationResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMGroupManagerImpl extends V2TIMGroupManager {
    private final String TAG;

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IMCallback<String> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass1(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(String str) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(String str) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass10 extends IMCallback<Map<String, String>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass10(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(Map<String, String> map) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(Map<String, String> map) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass11 extends IMCallback<Integer> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass11(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(Integer num) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(Integer num) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$12  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass12 implements V2TIMValueCallback<GroupMemberInfoResult> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass12(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(GroupMemberInfoResult groupMemberInfoResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(GroupMemberInfoResult groupMemberInfoResult) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$13  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass13 extends IMCallback<GroupMemberInfoResult> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass13(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(GroupMemberInfoResult groupMemberInfoResult) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(GroupMemberInfoResult groupMemberInfoResult) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$14  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass14 implements V2TIMValueCallback<List<GroupMemberInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass14(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupMemberInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupMemberInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$15  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass15 extends IMCallback<List<GroupMemberInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass15(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<GroupMemberInfo> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<GroupMemberInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$16  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass16 implements V2TIMValueCallback<HashMap<String, List<GroupMemberInfo>>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass16(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(HashMap<String, List<GroupMemberInfo>> hashMap) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(HashMap<String, List<GroupMemberInfo>> hashMap) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$17  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass17 extends IMCallback<HashMap<String, List<GroupMemberInfo>>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass17(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(HashMap<String, List<GroupMemberInfo>> hashMap) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(HashMap<String, List<GroupMemberInfo>> hashMap) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$18  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass18 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass18(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$19  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass19 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass19(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements V2TIMValueCallback<List<GroupInfoGetResult>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass2(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupInfoGetResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupInfoGetResult> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$20  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass20 implements V2TIMValueCallback<List<GroupMemberOperationResult>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass20(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupMemberOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupMemberOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$21  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass21 extends IMCallback<List<GroupMemberOperationResult>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass21(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<GroupMemberOperationResult> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<GroupMemberOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$22  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass22 implements V2TIMValueCallback<List<GroupMemberOperationResult>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass22(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupMemberOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupMemberOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$23  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass23 extends IMCallback<List<GroupMemberOperationResult>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass23(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<GroupMemberOperationResult> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<GroupMemberOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$24  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass24 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass24(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$25  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass25 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass25(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$26  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass26 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass26(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$27  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass27 implements V2TIMValueCallback<List<GroupInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass27(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$28  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass28 extends IMCallback<List<GroupInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass28(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<GroupInfo> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<GroupInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$29  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass29 implements V2TIMValueCallback<List<GroupInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass29(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IMCallback<List<GroupInfoGetResult>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass3(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<GroupInfoGetResult> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<GroupInfoGetResult> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$30  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass30 extends IMCallback<List<GroupInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass30(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<GroupInfo> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<GroupInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$31  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass31 implements V2TIMValueCallback<GroupApplicationResult> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass31(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(GroupApplicationResult groupApplicationResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(GroupApplicationResult groupApplicationResult) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$32  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass32 extends IMCallback<GroupApplicationResult> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass32(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(GroupApplicationResult groupApplicationResult) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(GroupApplicationResult groupApplicationResult) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$33  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass33 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass33(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$34  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass34 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass34(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$35  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass35 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass35(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$36  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass36 extends IMCallback<String> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass36(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(String str) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(String str) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$37  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass37 implements V2TIMValueCallback<List<TopicOperationResult>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass37(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TopicOperationResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TopicOperationResult> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$38  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass38 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass38(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$39  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass39 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass39(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements V2TIMValueCallback<List<GroupInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass4(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$40  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass40 implements V2TIMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass40(V2TIMGroupManagerImpl v2TIMGroupManagerImpl) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$41  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass41 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass41(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$42  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass42 implements V2TIMValueCallback<List<TopicInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;
        public final /* synthetic */ V2TIMValueCallback val$callback;

        public AnonymousClass42(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TopicInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TopicInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$43  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass43 extends IMCallback<List<TopicInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass43(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<TopicInfo> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<TopicInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IMCallback<List<GroupInfo>> {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass5(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMValueCallback v2TIMValueCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public /* bridge */ /* synthetic */ void success(List<GroupInfo> list) {
        }

        /* renamed from: success  reason: avoid collision after fix types in other method */
        public void success2(List<GroupInfo> list) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass6(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass7(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass8(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* renamed from: com.tencent.imsdk.v2.V2TIMGroupManagerImpl$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends IMCallback {
        public final /* synthetic */ V2TIMGroupManagerImpl this$0;

        public AnonymousClass9(V2TIMGroupManagerImpl v2TIMGroupManagerImpl, V2TIMCallback v2TIMCallback) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void fail(int i2, String str) {
        }

        @Override // com.tencent.imsdk.common.IMCallback
        public void success(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class V2TIMGroupManagerImplHolder {
        private static final V2TIMGroupManagerImpl v2TIMGroupManagerImpl = null;

        private V2TIMGroupManagerImplHolder() {
        }

        public static /* synthetic */ V2TIMGroupManagerImpl access$100() {
        }
    }

    public /* synthetic */ V2TIMGroupManagerImpl(AnonymousClass1 anonymousClass1) {
    }

    public static V2TIMGroupManagerImpl getInstance() {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void acceptGroupApplication(V2TIMGroupApplication v2TIMGroupApplication, String str, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void createGroup(V2TIMGroupInfo v2TIMGroupInfo, List<V2TIMCreateGroupMemberInfo> list, V2TIMValueCallback<String> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void createTopicInCommunity(String str, V2TIMTopicInfo v2TIMTopicInfo, V2TIMValueCallback<String> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void deleteGroupAttributes(String str, List<String> list, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void deleteTopicFromCommunity(String str, List<String> list, V2TIMValueCallback<List<V2TIMTopicOperationResult>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getGroupApplicationList(V2TIMValueCallback<V2TIMGroupApplicationResult> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getGroupAttributes(String str, List<String> list, V2TIMValueCallback<Map<String, String>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getGroupMemberList(String str, int i2, long j2, V2TIMValueCallback<V2TIMGroupMemberInfoResult> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getGroupMembersInfo(String str, List<String> list, V2TIMValueCallback<List<V2TIMGroupMemberFullInfo>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getGroupOnlineMemberCount(String str, V2TIMValueCallback<Integer> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getGroupsInfo(List<String> list, V2TIMValueCallback<List<V2TIMGroupInfoResult>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getJoinedCommunityList(V2TIMValueCallback<List<V2TIMGroupInfo>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getJoinedGroupList(V2TIMValueCallback<List<V2TIMGroupInfo>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void getTopicInfoList(String str, List<String> list, V2TIMValueCallback<List<V2TIMTopicInfoResult>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void initGroupAttributes(String str, HashMap<String, String> hashMap, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void inviteUserToGroup(String str, List<String> list, V2TIMValueCallback<List<V2TIMGroupMemberOperationResult>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void kickGroupMember(String str, List<String> list, String str2, V2TIMValueCallback<List<V2TIMGroupMemberOperationResult>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void markGroupMemberList(String str, List<String> list, int i2, boolean z, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void muteGroupMember(String str, String str2, int i2, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void refuseGroupApplication(V2TIMGroupApplication v2TIMGroupApplication, String str, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void searchGroupMembers(V2TIMGroupMemberSearchParam v2TIMGroupMemberSearchParam, V2TIMValueCallback<HashMap<String, List<V2TIMGroupMemberFullInfo>>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void searchGroups(V2TIMGroupSearchParam v2TIMGroupSearchParam, V2TIMValueCallback<List<V2TIMGroupInfo>> v2TIMValueCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void setGroupApplicationRead(V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void setGroupAttributes(String str, HashMap<String, String> hashMap, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void setGroupInfo(V2TIMGroupInfo v2TIMGroupInfo, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void setGroupMemberInfo(String str, V2TIMGroupMemberFullInfo v2TIMGroupMemberFullInfo, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void setGroupMemberRole(String str, String str2, int i2, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void setTopicInfo(V2TIMTopicInfo v2TIMTopicInfo, V2TIMCallback v2TIMCallback) {
    }

    @Override // com.tencent.imsdk.v2.V2TIMGroupManager
    public void transferGroupOwner(String str, String str2, V2TIMCallback v2TIMCallback) {
    }

    private V2TIMGroupManagerImpl() {
    }
}
