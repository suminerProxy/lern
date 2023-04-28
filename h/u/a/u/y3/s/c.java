package h.u.a.u.y3.s;

import android.util.Pair;
import com.tencent.imsdk.v2.V2TIMGroupMemberFullInfo;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupApplyInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupMemberInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageReceiptInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* compiled from: CustomGroupChatPresenter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c extends ChatPresenter {

    /* renamed from: e  reason: collision with root package name */
    private static final String f24950e = null;

    /* renamed from: a  reason: collision with root package name */
    private GroupInfo f24951a;
    private List<GroupApplyInfo> b;
    private List<GroupMemberInfo> c;

    /* renamed from: d  reason: collision with root package name */
    private GroupChatEventListener f24952d;

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends GroupChatEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24953a;

        public a(c cVar) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void addMessage(TUIMessageBean tUIMessageBean, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void clearGroupMessage(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void exitGroupChat(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void handleRevoke(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onApplied(int i2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onGroupForceExit(String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onGroupNameChanged(String str, String str2) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onMessageChanged(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onReadReport(List<MessageReceiptInfo> list) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onRecvMessageModified(TUIMessageBean tUIMessageBean) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.interfaces.GroupChatEventListener
        public void onRecvNewMessage(TUIMessageBean tUIMessageBean) {
        }
    }

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends IUIKitCallback<List<TUIMessageBean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUIMessageBean f24954a;
        public final /* synthetic */ int b;
        public final /* synthetic */ IUIKitCallback c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f24955d;

        public b(c cVar, TUIMessageBean tUIMessageBean, int i2, IUIKitCallback iUIKitCallback) {
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

    /* compiled from: CustomGroupChatPresenter.java */
    /* renamed from: h.u.a.u.y3.s.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0385c implements V2TIMValueCallback<List<V2TIMGroupMemberFullInfo>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f24956a;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f24957d;

        public C0385c(c cVar, ArrayList arrayList, List list, int i2) {
        }

        private /* synthetic */ Unit a(List list, int i2, List list2) {
        }

        public /* synthetic */ Unit b(List list, int i2, List list2) {
        }

        public void c(List<V2TIMGroupMemberFullInfo> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<V2TIMGroupMemberFullInfo> list) {
        }
    }

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends IUIKitCallback<TUIMessageBean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IUIKitCallback f24958a;
        public final /* synthetic */ String b;
        public final /* synthetic */ c c;

        public d(c cVar, IUIKitCallback iUIKitCallback, String str) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(TUIMessageBean tUIMessageBean) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(TUIMessageBean tUIMessageBean) {
        }
    }

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends IUIKitCallback<List<GroupMemberInfo>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24959a;

        public e(c cVar) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<GroupMemberInfo> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<GroupMemberInfo> list) {
        }
    }

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f extends IUIKitCallback<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24960a;

        public f(c cVar) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(List<String> list) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(List<String> list) {
        }
    }

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g extends IUIKitCallback<Pair<Integer, String>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24961a;

        public g(c cVar) {
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

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class h implements j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24962a;
        public final /* synthetic */ List b;
        public final /* synthetic */ c c;

        public h(c cVar, int i2, List list) {
        }

        @Override // h.u.a.u.y3.s.c.j
        public void a(ArrayList<TUIMessageBean> arrayList) {
        }
    }

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class i implements h.y.a.m.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUIMessageBean f24963a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j f24964d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f24965e;

        public i(c cVar, TUIMessageBean tUIMessageBean, ArrayList arrayList, int i2, j jVar) {
        }

        @Override // h.y.a.m.g
        public void a(n nVar) {
        }
    }

    /* compiled from: CustomGroupChatPresenter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface j {
        void a(ArrayList<TUIMessageBean> arrayList);
    }

    private void a(int i2, List<TUIMessageBean> list) {
    }

    public static /* synthetic */ String access$100() {
    }

    private void addGroupMessage(TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ GroupInfo b(c cVar) {
    }

    public static /* synthetic */ void c(c cVar, List list, int i2) {
    }

    public static /* synthetic */ List d(c cVar) {
    }

    public static /* synthetic */ ChatPresenter.ChatNotifyHandler e(c cVar) {
    }

    public static /* synthetic */ ChatPresenter.ChatNotifyHandler f(c cVar) {
    }

    public static /* synthetic */ void g(c cVar, int i2, int i3) {
    }

    public static /* synthetic */ void h(c cVar, ArrayList arrayList, int i2, j jVar) {
    }

    public static /* synthetic */ void i(c cVar, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ void j(c cVar, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ void k(c cVar, TUIMessageBean tUIMessageBean) {
    }

    public static /* synthetic */ boolean l(c cVar, boolean z) {
    }

    public static /* synthetic */ boolean m(c cVar, boolean z) {
    }

    public static /* synthetic */ void n(c cVar, String str) {
    }

    public static /* synthetic */ void o(c cVar, List list, int i2) {
    }

    public static /* synthetic */ void p(c cVar, String str) {
    }

    private void q(ArrayList<TUIMessageBean> arrayList, int i2, j jVar) {
    }

    private void sendGroupTipsMessage(String str, String str2, IUIKitCallback<String> iUIKitCallback) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void addMessageInfo(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void assembleGroupMessage(TUIMessageBean tUIMessageBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public ChatInfo getChatInfo() {
    }

    public void initListener() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void loadMessage(int i2, TUIMessageBean tUIMessageBean, IUIKitCallback<List<TUIMessageBean>> iUIKitCallback) {
    }

    public void onApplied(int i2) {
    }

    public void onGroupForceExit(String str) {
    }

    public void onGroupNameChanged(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void onLoadedMessageProcessed(List<TUIMessageBean> list, int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter
    public void onMessageLoadCompleted(List<TUIMessageBean> list, int i2) {
    }

    public void onReadReport(List<MessageReceiptInfo> list) {
    }

    public void setGroupInfo(GroupInfo groupInfo) {
    }
}
