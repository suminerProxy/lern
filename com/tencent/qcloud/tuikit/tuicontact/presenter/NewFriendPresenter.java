package com.tencent.qcloud.tuikit.tuicontact.presenter;

import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener;
import com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.INewFriendActivity;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class NewFriendPresenter {
    private static final String TAG = "NewFriendPresenter";
    private final List<FriendApplicationBean> dataSource;
    private INewFriendActivity friendActivity;
    private ContactEventListener friendApplicationListener;
    private final ContactProvider provider;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.NewFriendPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends ContactEventListener {
        public final /* synthetic */ NewFriendPresenter this$0;

        public AnonymousClass1(NewFriendPresenter newFriendPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendApplicationListAdded(List<FriendApplicationBean> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendApplicationListDeleted(List<String> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendApplicationListRead() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.NewFriendPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<List<FriendApplicationBean>> {
        public final /* synthetic */ NewFriendPresenter this$0;

        public AnonymousClass2(NewFriendPresenter newFriendPresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<FriendApplicationBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<FriendApplicationBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.NewFriendPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<Void> {
        public final /* synthetic */ NewFriendPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass3(NewFriendPresenter newFriendPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.NewFriendPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<Void> {
        public final /* synthetic */ NewFriendPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass4(NewFriendPresenter newFriendPresenter, IUIKitCallback iUIKitCallback) {
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

    public static /* synthetic */ List access$000(NewFriendPresenter newFriendPresenter) {
    }

    public static /* synthetic */ void access$100(NewFriendPresenter newFriendPresenter) {
    }

    public static /* synthetic */ String access$200() {
    }

    private void notifyDataSourceChanged() {
    }

    public void acceptFriendApplication(FriendApplicationBean friendApplicationBean, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void loadFriendApplicationList() {
    }

    public void refuseFriendApplication(FriendApplicationBean friendApplicationBean, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setFriendActivity(INewFriendActivity iNewFriendActivity) {
    }

    public void setFriendApplicationListAllRead(IUIKitCallback<Void> iUIKitCallback) {
    }
}
