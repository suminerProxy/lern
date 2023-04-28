package com.tencent.qcloud.tuikit.tuisearch.presenter;

import android.util.Pair;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuisearch.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchDataBean;
import com.tencent.qcloud.tuikit.tuisearch.bean.SearchMessageBean;
import com.tencent.qcloud.tuikit.tuisearch.model.SearchDataProvider;
import com.tencent.qcloud.tuikit.tuisearch.ui.interfaces.ISearchMoreMsgAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SearchMoreMsgPresenter {
    private static final String TAG = "SearchMoreMsgPresenter";
    private ISearchMoreMsgAdapter adapter;
    private boolean isLoad;
    private final SearchDataProvider provider;
    private final List<SearchDataBean> searchDataBeanList;

    /* renamed from: com.tencent.qcloud.tuikit.tuisearch.presenter.SearchMoreMsgPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<Pair<Integer, List<SearchMessageBean>>> {
        public final /* synthetic */ SearchMoreMsgPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ boolean val$isGetByPage;

        public AnonymousClass1(SearchMoreMsgPresenter searchMoreMsgPresenter, boolean z, IUIKitCallback iUIKitCallback) {
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

    public static /* synthetic */ List access$000(SearchMoreMsgPresenter searchMoreMsgPresenter) {
    }

    public static /* synthetic */ String access$100() {
    }

    public static /* synthetic */ ISearchMoreMsgAdapter access$200(SearchMoreMsgPresenter searchMoreMsgPresenter) {
    }

    public static /* synthetic */ boolean access$302(SearchMoreMsgPresenter searchMoreMsgPresenter, boolean z) {
    }

    public static /* synthetic */ SearchDataProvider access$400(SearchMoreMsgPresenter searchMoreMsgPresenter) {
    }

    public ChatInfo generateChatInfo(SearchDataBean searchDataBean) {
    }

    public void searchMessage(List<String> list, String str, int i2, IUIKitCallback<List<SearchDataBean>> iUIKitCallback) {
    }

    public void setAdapter(ISearchMoreMsgAdapter iSearchMoreMsgAdapter) {
    }
}
