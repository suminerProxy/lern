package com.tencent.qcloud.tuikit.tuicontact.presenter;

import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener;
import com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactListView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ContactPresenter {
    private static final String TAG = "ContactPresenter";
    private ContactEventListener blackListListener;
    private IContactListView contactListView;
    private final List<ContactItemBean> dataSource;
    private ContactEventListener friendListListener;
    private IUIKitCallback<Void> getUserStatusCallback;
    private boolean isSelectForCall;
    private final ContactProvider provider;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends ContactEventListener {
        public final /* synthetic */ ContactPresenter this$0;

        public AnonymousClass1(ContactPresenter contactPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendApplicationListAdded(List<FriendApplicationBean> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendApplicationListDeleted(List<String> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendInfoChanged(List<ContactItemBean> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendListAdded(List<ContactItemBean> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendListDeleted(List<String> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onFriendRemarkChanged(String str, String str2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onUserStatusChanged(List<V2TIMUserStatus> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void refreshUserStatusFragmentUI() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends ContactEventListener {
        public final /* synthetic */ ContactPresenter this$0;

        public AnonymousClass2(ContactPresenter contactPresenter) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onBlackListAdd(List<ContactItemBean> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onBlackListDeleted(List<String> list) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<List<ContactItemBean>> {
        public final /* synthetic */ ContactPresenter this$0;
        public final /* synthetic */ int val$dataSourceType;

        public AnonymousClass3(ContactPresenter contactPresenter, int i2) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<List<ContactItemBean>> {
        public final /* synthetic */ ContactPresenter this$0;

        public AnonymousClass4(ContactPresenter contactPresenter) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<Void> {
        public final /* synthetic */ ContactPresenter this$0;

        public AnonymousClass5(ContactPresenter contactPresenter) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<List<FriendApplicationBean>> {
        public final /* synthetic */ ContactPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass6(ContactPresenter contactPresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback<String> {
        public final /* synthetic */ ContactPresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ GroupInfo val$groupInfo;

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$7$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass7 this$1;
            public final /* synthetic */ String val$data;
            public final /* synthetic */ String val$groupId;

            /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$7$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02271 extends IUIKitCallback<String> {
                public final /* synthetic */ AnonymousClass1 this$2;

                /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$7$1$1$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
                public class RunnableC02281 implements Runnable {
                    public final /* synthetic */ C02271 this$3;
                    public final /* synthetic */ String val$result;

                    public RunnableC02281(C02271 c02271, String str) {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                }

                /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.ContactPresenter$7$1$1$2  reason: invalid class name */
                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
                public class AnonymousClass2 implements Runnable {
                    public final /* synthetic */ C02271 this$3;
                    public final /* synthetic */ int val$errCode;
                    public final /* synthetic */ String val$errMsg;
                    public final /* synthetic */ String val$module;

                    public AnonymousClass2(C02271 c02271, String str, int i2, String str2) {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                }

                public C02271(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public void onError(String str, int i2, String str2) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public /* bridge */ /* synthetic */ void onSuccess(String str) {
                }

                /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
                public void onSuccess2(String str) {
                }
            }

            public AnonymousClass1(AnonymousClass7 anonymousClass7, String str, String str2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass7(ContactPresenter contactPresenter, GroupInfo groupInfo, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(String str) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(String str) {
        }
    }

    public static /* synthetic */ void access$000(ContactPresenter contactPresenter, List list) {
    }

    public static /* synthetic */ void access$100(ContactPresenter contactPresenter, List list) {
    }

    public static /* synthetic */ IContactListView access$200(ContactPresenter contactPresenter) {
    }

    public static /* synthetic */ void access$300(ContactPresenter contactPresenter) {
    }

    public static /* synthetic */ String access$400() {
    }

    public static /* synthetic */ void access$500(ContactPresenter contactPresenter, List list, int i2) {
    }

    private void loadContactUserStatus(List<ContactItemBean> list) {
    }

    private void notifyDataSourceChanged() {
    }

    private void onDataListAdd(List<ContactItemBean> list) {
    }

    private void onDataListDeleted(List<String> list) {
    }

    private void onDataLoaded(List<ContactItemBean> list, int i2) {
    }

    public void createGroupChat(GroupInfo groupInfo, IUIKitCallback<String> iUIKitCallback) {
    }

    public void getFriendApplicationUnreadCount(IUIKitCallback<Integer> iUIKitCallback) {
    }

    public long getNextSeq() {
    }

    public void loadDataSource(int i2) {
    }

    public void loadFriendApplicationList(IUIKitCallback<Integer> iUIKitCallback) {
    }

    public void loadGroupMemberList(String str) {
    }

    public void onFriendInfoChanged(List<ContactItemBean> list) {
    }

    public void onFriendRemarkChanged(String str, String str2) {
    }

    public void onUserStatusChanged(List<V2TIMUserStatus> list) {
    }

    public void sendGroupTipsMessage(String str, String str2, IUIKitCallback<String> iUIKitCallback) {
    }

    public void setBlackListListener() {
    }

    public void setContactListView(IContactListView iContactListView) {
    }

    public void setFriendListListener() {
    }

    public void setIsForCall(boolean z) {
    }
}
