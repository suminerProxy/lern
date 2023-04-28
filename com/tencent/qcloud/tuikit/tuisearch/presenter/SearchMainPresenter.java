package com.tencent.qcloud.tuikit.tuisearch.presenter;

import android.util.Pair;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuisearch.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchMessageBean;
import com.tencent.qcloud.tuikit.tuisearch.bean.TUISearchGroupResult;
import com.tencent.qcloud.tuikit.tuisearch.model.SearchDataProvider;
import com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchResultAdapter;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SearchMainPresenter {
    private static final String TAG = "SearchMainPresenter";
    private ISearchResultAdapter contactAdapter;
    private final SearchDataProvider contactProvider;
    private ISearchResultAdapter conversationAdapter;
    private final SearchDataProvider conversationProvider;
    private final List<SearchDataBean> conversationSearchDataBeans;
    private final Set<String> conversationSearchIdSet;
    private ISearchResultAdapter groupAdapter;
    private final SearchDataProvider groupProvider;
    private final Map<String, SearchMessageBean> msgCountInConversationMap;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.presenter.SearchMainPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<List<SearchDataBean>> {
        public final /* synthetic */ SearchMainPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ List val$contactSearchDataList;

        public AnonymousClass1(SearchMainPresenter searchMainPresenter, List list, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<SearchDataBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<SearchDataBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.presenter.SearchMainPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<List<TUISearchGroupResult>> {
        public final /* synthetic */ SearchMainPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ List val$groupSearchDataList;

        public AnonymousClass2(SearchMainPresenter searchMainPresenter, List list, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TUISearchGroupResult> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TUISearchGroupResult> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.presenter.SearchMainPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<Pair<Integer, List<SearchMessageBean>>> {
        public final /* synthetic */ SearchMainPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ int val$pageIndex;

        /* renamed from: com.tencent.qcloud.tuikit.tuisearch.presenter.SearchMainPresenter$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 extends IUIKitCallback<List<ConversationInfo>> {
            public final /* synthetic */ AnonymousClass3 this$1;

            public AnonymousClass1(AnonymousClass3 anonymousClass3) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<ConversationInfo> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<ConversationInfo> list) {
            }
        }

        public AnonymousClass3(SearchMainPresenter searchMainPresenter, int i2, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Pair<Integer, List<SearchMessageBean>> pair) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Pair<Integer, List<SearchMessageBean>> pair) {
        }
    }

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ ISearchResultAdapter access$100(SearchMainPresenter searchMainPresenter) {
    }

    public static /* synthetic */ ISearchResultAdapter access$200(SearchMainPresenter searchMainPresenter) {
    }

    public static /* synthetic */ Set access$300(SearchMainPresenter searchMainPresenter) {
    }

    public static /* synthetic */ List access$400(SearchMainPresenter searchMainPresenter) {
    }

    public static /* synthetic */ Map access$500(SearchMainPresenter searchMainPresenter) {
    }

    public static /* synthetic */ ISearchResultAdapter access$600(SearchMainPresenter searchMainPresenter) {
    }

    public static /* synthetic */ SearchDataProvider access$700(SearchMainPresenter searchMainPresenter) {
    }

    public void searchContact(List<String> list, IUIKitCallback<List<SearchDataBean>> iUIKitCallback) {
    }

    public void searchConversation(List<String> list, int i2, IUIKitCallback<List<SearchDataBean>> iUIKitCallback) {
    }

    public void searchGroup(List<String> list, IUIKitCallback<List<SearchDataBean>> iUIKitCallback) {
    }

    public void setContactAdapter(ISearchResultAdapter iSearchResultAdapter) {
    }

    public void setConversationAdapter(ISearchResultAdapter iSearchResultAdapter) {
    }

    public void setGroupAdapter(ISearchResultAdapter iSearchResultAdapter) {
    }
}
