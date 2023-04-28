package com.tencent.qcloud.tuikit.tuisearch.model;

import android.util.Pair;
import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMFriendInfoResult;
import com.tencent.imsdk.v2.V2TIMGroupInfo;
import com.tencent.imsdk.v2.V2TIMGroupInfoResult;
import com.tencent.imsdk.v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.v2.V2TIMMessageSearchResult;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuisearch.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuisearch.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuisearch.bean.MessageInfo;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchMessageBean;
import com.tencent.qcloud.tuikit.tuisearch.bean.TUISearchGroupParam;
import com.tencent.qcloud.tuikit.tuisearch.bean.TUISearchGroupResult;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SearchDataProvider {
    public static final int CONVERSATION_MESSAGE_PAGE_SIZE = 10;
    private static final String TAG = "SearchDataProvider";
    public boolean groupInfoFinish;
    public boolean groupMemberFullInfofinish;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.model.SearchDataProvider$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements V2TIMValueCallback<List<V2TIMGroupInfo>> {
        public final /* synthetic */ SearchDataProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ List val$groupInfos;
        public final /* synthetic */ HashMap val$groupMemberFullInfos;
        public final /* synthetic */ TUISearchGroupParam val$searchParam;

        public AnonymousClass1(SearchDataProvider searchDataProvider, List list, TUISearchGroupParam tUISearchGroupParam, HashMap hashMap, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.model.SearchDataProvider$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements V2TIMValueCallback<HashMap<String, List<V2TIMGroupMemberFullInfo>>> {
        public final /* synthetic */ SearchDataProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ List val$groupInfos;
        public final /* synthetic */ HashMap val$groupMemberFullInfos;
        public final /* synthetic */ TUISearchGroupParam val$searchParam;

        public AnonymousClass2(SearchDataProvider searchDataProvider, HashMap hashMap, TUISearchGroupParam tUISearchGroupParam, List list, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(HashMap<String, List<V2TIMGroupMemberFullInfo>> hashMap) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(HashMap<String, List<V2TIMGroupMemberFullInfo>> hashMap) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.model.SearchDataProvider$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements V2TIMValueCallback<List<V2TIMFriendInfoResult>> {
        public final /* synthetic */ SearchDataProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass3(SearchDataProvider searchDataProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMFriendInfoResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMFriendInfoResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.model.SearchDataProvider$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements V2TIMValueCallback<V2TIMMessageSearchResult> {
        public final /* synthetic */ SearchDataProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass4(SearchDataProvider searchDataProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMMessageSearchResult v2TIMMessageSearchResult) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(V2TIMMessageSearchResult v2TIMMessageSearchResult) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.model.SearchDataProvider$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements V2TIMValueCallback<List<V2TIMConversation>> {
        public final /* synthetic */ SearchDataProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callBack;

        public AnonymousClass5(SearchDataProvider searchDataProvider, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMConversation> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<V2TIMConversation> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.model.SearchDataProvider$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements V2TIMValueCallback<List<V2TIMGroupInfoResult>> {
        public final /* synthetic */ SearchDataProvider this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ HashMap val$searchGroupMemberResults;
        public final /* synthetic */ List val$searchGroupResults;

        public AnonymousClass6(SearchDataProvider searchDataProvider, IUIKitCallback iUIKitCallback, List list, HashMap hashMap) {
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

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ void access$100(SearchDataProvider searchDataProvider, List list, List list2, HashMap hashMap, IUIKitCallback iUIKitCallback) {
    }

    private static boolean matcherSearchText(String str, List<String> list) {
    }

    private void mergeGroupAndGroupMemberResult(List<String> list, List<V2TIMGroupInfo> list2, HashMap<String, List<V2TIMGroupMemberFullInfo>> hashMap, IUIKitCallback<List<TUISearchGroupResult>> iUIKitCallback) {
    }

    public ChatInfo generateChatInfo(SearchDataBean searchDataBean) {
    }

    public void getConversationList(List<String> list, IUIKitCallback<List<ConversationInfo>> iUIKitCallback) {
    }

    public String getMessageText(MessageInfo messageInfo) {
    }

    public void searchContact(List<String> list, IUIKitCallback<List<SearchDataBean>> iUIKitCallback) {
    }

    public void searchGroups(TUISearchGroupParam tUISearchGroupParam, IUIKitCallback<List<TUISearchGroupResult>> iUIKitCallback) {
    }

    public void searchMessages(List<String> list, String str, int i2, IUIKitCallback<Pair<Integer, List<SearchMessageBean>>> iUIKitCallback) {
    }
}
