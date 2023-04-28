package h.u.a.u.y3.s;

import com.tencent.imsdk.v2.V2TIMUserStatus;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.FriendApplicationBean;
import com.tencent.qcloud.tuikit.tuicontact.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener;
import com.tencent.qcloud.tuikit.tuicontact.model.ContactProvider;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactListView;
import java.util.List;

/* compiled from: CustomContactPresenter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class b {

    /* renamed from: h  reason: collision with root package name */
    private static final String f24933h = null;

    /* renamed from: a  reason: collision with root package name */
    private final ContactProvider f24934a;
    private IContactListView b;
    private final List<ContactItemBean> c;

    /* renamed from: d  reason: collision with root package name */
    private ContactEventListener f24935d;

    /* renamed from: e  reason: collision with root package name */
    private ContactEventListener f24936e;

    /* renamed from: f  reason: collision with root package name */
    private IUIKitCallback<Void> f24937f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f24938g;

    /* compiled from: CustomContactPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends ContactEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f24939a;

        public a(b bVar) {
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

    /* compiled from: CustomContactPresenter.java */
    /* renamed from: h.u.a.u.y3.s.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0381b extends ContactEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f24940a;

        public C0381b(b bVar) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onBlackListAdd(List<ContactItemBean> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuicontact.interfaces.ContactEventListener
        public void onBlackListDeleted(List<String> list) {
        }
    }

    /* compiled from: CustomContactPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends IUIKitCallback<List<ContactItemBean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24941a;
        public final /* synthetic */ b b;

        public c(b bVar, int i2) {
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

    /* compiled from: CustomContactPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends IUIKitCallback<List<ContactItemBean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f24942a;

        public d(b bVar) {
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

    /* compiled from: CustomContactPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends IUIKitCallback<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f24943a;

        public e(b bVar) {
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

    /* compiled from: CustomContactPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f extends IUIKitCallback<List<FriendApplicationBean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IUIKitCallback f24944a;
        public final /* synthetic */ b b;

        public f(b bVar, IUIKitCallback iUIKitCallback) {
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

    /* compiled from: CustomContactPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g extends IUIKitCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ GroupInfo f24945a;
        public final /* synthetic */ IUIKitCallback b;
        public final /* synthetic */ b c;

        /* compiled from: CustomContactPresenter.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements Runnable {
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ g f24946d;

            /* compiled from: CustomContactPresenter.java */
            /* renamed from: h.u.a.u.y3.s.b$g$a$a  reason: collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
            public class C0382a extends IUIKitCallback<String> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ a f24947a;

                /* compiled from: CustomContactPresenter.java */
                /* renamed from: h.u.a.u.y3.s.b$g$a$a$a  reason: collision with other inner class name */
                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
                public class RunnableC0383a implements Runnable {
                    public final /* synthetic */ String b;
                    public final /* synthetic */ C0382a c;

                    public RunnableC0383a(C0382a c0382a, String str) {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                }

                /* compiled from: CustomContactPresenter.java */
                /* renamed from: h.u.a.u.y3.s.b$g$a$a$b  reason: collision with other inner class name */
                /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
                public class RunnableC0384b implements Runnable {
                    public final /* synthetic */ String b;
                    public final /* synthetic */ int c;

                    /* renamed from: d  reason: collision with root package name */
                    public final /* synthetic */ String f24948d;

                    /* renamed from: e  reason: collision with root package name */
                    public final /* synthetic */ C0382a f24949e;

                    public RunnableC0384b(C0382a c0382a, String str, int i2, String str2) {
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }
                }

                public C0382a(a aVar) {
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

            public a(g gVar, String str, String str2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public g(b bVar, GroupInfo groupInfo, IUIKitCallback iUIKitCallback) {
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

    public static /* synthetic */ void a(b bVar, List list) {
    }

    public static /* synthetic */ void b(b bVar, List list) {
    }

    public static /* synthetic */ IContactListView c(b bVar) {
    }

    public static /* synthetic */ void d(b bVar) {
    }

    public static /* synthetic */ String e() {
    }

    public static /* synthetic */ void f(b bVar, List list, int i2) {
    }

    private void j(List<ContactItemBean> list) {
    }

    private void n() {
    }

    private void o(List<ContactItemBean> list) {
    }

    private void p(List<String> list) {
    }

    private void q(List<ContactItemBean> list, int i2) {
    }

    public void g(GroupInfo groupInfo, IUIKitCallback<String> iUIKitCallback) {
    }

    public void h(IUIKitCallback<Integer> iUIKitCallback) {
    }

    public long i() {
    }

    public void k(int i2) {
    }

    public void l(IUIKitCallback<Integer> iUIKitCallback) {
    }

    public void m(String str, boolean z) {
    }

    public void r(List<ContactItemBean> list) {
    }

    public void s(String str, String str2) {
    }

    public void t(List<V2TIMUserStatus> list) {
    }

    public void u(String str, String str2, IUIKitCallback<String> iUIKitCallback) {
    }

    public void v() {
    }

    public void w(IContactListView iContactListView) {
    }

    public void x() {
    }

    public void y(boolean z) {
    }
}
