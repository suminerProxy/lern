package com.tencent.qcloud.tuikit.tuichat.presenter;

import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.MergeMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.model.ChatProvider;
import com.tencent.qcloud.tuikit.tuichat.ui.interfaces.IMessageAdapter;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ForwardPresenter extends ChatPresenter {
    public static final String TAG = "ForwardPresenter";
    private ChatInfo chatInfo;
    public List<TUIMessageBean> loadedData;
    private IMessageAdapter messageListAdapter;
    private final ChatProvider provider;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ForwardPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<List<TUIMessageBean>> {
        public final /* synthetic */ ForwardPresenter this$0;

        /* renamed from: com.tencent.qcloud.tuikit.tuichat.presenter.ForwardPresenter$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class C02151 extends IUIKitCallback<List<TUIMessageBean>> {
            public final /* synthetic */ AnonymousClass1 this$1;
            public final /* synthetic */ List val$mergeMessageData;

            public C02151(AnonymousClass1 anonymousClass1, List list) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public void onError(String str, int i2, String str2) {
            }

            @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
            public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
            }

            /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
            public void onSuccess2(List<TUIMessageBean> list) {
            }
        }

        public AnonymousClass1(ForwardPresenter forwardPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<TUIMessageBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<TUIMessageBean> list) {
        }
    }

    public static /* synthetic */ void access$000(ForwardPresenter forwardPresenter, List list) {
    }

    private void onMergeMessageDownloaded(List<TUIMessageBean> list) {
    }

    public void downloadMergerMessage(MergeMessageBean mergeMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public ChatInfo getChatInfo() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void locateMessage(String str, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setChatInfo(ChatInfo chatInfo) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void setMessageListAdapter(IMessageAdapter iMessageAdapter) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void updateAdapter(int i2, TUIMessageBean tUIMessageBean) {
    }
}
