package com.tencent.qcloud.tuikit.tuicontact.presenter;

import android.util.Pair;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactGroupApplyInfo;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IFriendProfileLayout;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class FriendProfilePresenter {
    private static final String TAG = "FriendProfilePresenter";
    private IFriendProfileLayout friendProfileLayout;
    private final ContactProvider provider;

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends IUIKitCallback<Boolean> {
        public final /* synthetic */ FriendProfilePresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass1(FriendProfilePresenter friendProfilePresenter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Boolean bool) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfilePresenter this$0;

        public AnonymousClass2(FriendProfilePresenter friendProfilePresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r1) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 extends IUIKitCallback<List<ContactItemBean>> {
        public final /* synthetic */ FriendProfilePresenter this$0;
        public final /* synthetic */ ContactItemBean val$bean;
        public final /* synthetic */ String val$id;

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$3$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass3 this$1;
            public final /* synthetic */ CountDownLatch val$latch;

            /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$3$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class C02291 extends IUIKitCallback<Boolean> {
                public final /* synthetic */ AnonymousClass1 this$2;

                public C02291(AnonymousClass1 anonymousClass1) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public void onError(String str, int i2, String str2) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
                }

                /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
                public void onSuccess2(Boolean bool) {
                }
            }

            public AnonymousClass1(AnonymousClass3 anonymousClass3, CountDownLatch countDownLatch) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$3$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ AnonymousClass3 this$1;
            public final /* synthetic */ CountDownLatch val$latch;

            /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$3$2$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class AnonymousClass1 extends IUIKitCallback<Boolean> {
                public final /* synthetic */ AnonymousClass2 this$2;

                public AnonymousClass1(AnonymousClass2 anonymousClass2) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public void onError(String str, int i2, String str2) {
                }

                @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
                public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
                }

                /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
                public void onSuccess2(Boolean bool) {
                }
            }

            public AnonymousClass2(AnonymousClass3 anonymousClass3, CountDownLatch countDownLatch) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$3$3  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public class RunnableC02303 implements Runnable {
            public final /* synthetic */ AnonymousClass3 this$1;
            public final /* synthetic */ CountDownLatch val$latch;

            /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$3$3$1  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
            public class AnonymousClass1 implements Runnable {
                public final /* synthetic */ RunnableC02303 this$2;

                public AnonymousClass1(RunnableC02303 runnableC02303) {
                }

                @Override // java.lang.Runnable
                public void run() {
                }
            }

            public RunnableC02303(AnonymousClass3 anonymousClass3, CountDownLatch countDownLatch) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass3(FriendProfilePresenter friendProfilePresenter, ContactItemBean contactItemBean, String str) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 extends IUIKitCallback<Boolean> {
        public final /* synthetic */ FriendProfilePresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass4(FriendProfilePresenter friendProfilePresenter, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Boolean bool) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Boolean bool) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfilePresenter this$0;

        public AnonymousClass5(FriendProfilePresenter friendProfilePresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r1) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfilePresenter this$0;

        public AnonymousClass6(FriendProfilePresenter friendProfilePresenter) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r1) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfilePresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;
        public final /* synthetic */ List val$idList;

        public AnonymousClass7(FriendProfilePresenter friendProfilePresenter, List list, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Void r5) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass8 extends IUIKitCallback<Pair<Integer, String>> {
        public final /* synthetic */ FriendProfilePresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass8(FriendProfilePresenter friendProfilePresenter, IUIKitCallback iUIKitCallback) {
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

    /* renamed from: com.tencent.qcloud.tuikit.tuicontact.presenter.FriendProfilePresenter$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass9 extends IUIKitCallback<Void> {
        public final /* synthetic */ FriendProfilePresenter this$0;
        public final /* synthetic */ IUIKitCallback val$callback;

        public AnonymousClass9(FriendProfilePresenter friendProfilePresenter, IUIKitCallback iUIKitCallback) {
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

    public static /* synthetic */ String access$000() {
    }

    public static /* synthetic */ IFriendProfileLayout access$100(FriendProfilePresenter friendProfilePresenter) {
    }

    public void acceptFriendApplication(FriendApplicationBean friendApplicationBean, int i2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void acceptJoinGroupApply(ContactGroupApplyInfo contactGroupApplyInfo, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void addFriend(String str, String str2, String str3, String str4, IUIKitCallback<Pair<Integer, String>> iUIKitCallback) {
    }

    public void addToBlackList(List<String> list) {
    }

    public void deleteFriend(List<String> list, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void deleteFromBlackList(List<String> list) {
    }

    public void getC2CReceiveMessageOpt(List<String> list, IUIKitCallback<Boolean> iUIKitCallback) {
    }

    public void getUsersInfo(String str, ContactItemBean contactItemBean) {
    }

    public void isFriend(String str, ContactItemBean contactItemBean, IUIKitCallback<Boolean> iUIKitCallback) {
    }

    public void isInBlackList(String str, IUIKitCallback<Boolean> iUIKitCallback) {
    }

    public boolean isTopConversation(String str) {
    }

    public void joinGroup(String str, String str2, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void modifyRemark(String str, String str2, IUIKitCallback<String> iUIKitCallback) {
    }

    public void refuseFriendApplication(FriendApplicationBean friendApplicationBean, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void refuseJoinGroupApply(ContactGroupApplyInfo contactGroupApplyInfo, String str, IUIKitCallback<Void> iUIKitCallback) {
    }

    public void setC2CReceiveMessageOpt(List<String> list, boolean z) {
    }

    public void setConversationTop(String str, boolean z) {
    }

    public void setFriendProfileLayout(IFriendProfileLayout iFriendProfileLayout) {
    }
}
