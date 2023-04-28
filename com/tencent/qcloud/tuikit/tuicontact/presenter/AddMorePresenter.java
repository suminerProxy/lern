package com.tencent.qcloud.tuikit.tuicontact.presenter;

import android.util.Pair;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IAddMoreActivity;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class AddMorePresenter {
    private static final String TAG = "AddMorePresenter";
    private IAddMoreActivity addMoreActivity;
    private ContactProvider provider;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.AddMorePresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<Pair<Integer, String>> {
        public final /* synthetic */ AddMorePresenter this$0;

        public AnonymousClass1(AddMorePresenter addMorePresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Pair<Integer, String> pair) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Pair<Integer, String> pair) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.AddMorePresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<Void> {
        public final /* synthetic */ AddMorePresenter this$0;

        public AnonymousClass2(AddMorePresenter addMorePresenter) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.AddMorePresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<List<ContactItemBean>> {
        public final /* synthetic */ AddMorePresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass3(AddMorePresenter addMorePresenter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<ContactItemBean> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<ContactItemBean> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.AddMorePresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<List<GroupInfo>> {
        public final /* synthetic */ AddMorePresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass4(AddMorePresenter addMorePresenter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupInfo> list) {
        }
    }

    public static /* synthetic */ IAddMoreActivity access$000(AddMorePresenter addMorePresenter) {
    }

    public void addFriend(String str, String str2) {
    }

    public void getGroupInfo(String str, IUIKitCallback<GroupInfo> iUIKitCallback) {
    }

    public void getUserInfo(String str, IUIKitCallback<ContactItemBean> iUIKitCallback) {
    }

    public void joinGroup(String str, String str2) {
    }

    public void setAddMoreActivity(IAddMoreActivity iAddMoreActivity) {
    }
}
