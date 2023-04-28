package h.u.a.u.y3.q;

import android.content.SharedPreferences;
import com.tencent.imsdk.v2.V2TIMCallback;
import com.tencent.imsdk.v2.V2TIMConversationListener;
import com.tencent.imsdk.v2.V2TIMConversationResult;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuiconversation.bean.ConversationInfo;
import com.tencent.qcloud.tuikit.tuiconversation.presenter.ConversationPresenter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: DyConversationManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private static final String f24915g = "b";

    /* renamed from: h  reason: collision with root package name */
    private static final String f24916h = "_top_conversion_list";

    /* renamed from: i  reason: collision with root package name */
    private static final String f24917i = "_conversation_group_face";

    /* renamed from: j  reason: collision with root package name */
    private static final String f24918j = "top_list";

    /* renamed from: k  reason: collision with root package name */
    private static b f24919k;

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<ConversationInfo> f24920a;
    private ArrayList<ConversationPresenter> b;
    private List<d> c;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences f24921d;

    /* renamed from: e  reason: collision with root package name */
    private int f24922e;

    /* renamed from: f  reason: collision with root package name */
    private V2TIMConversationListener f24923f;

    /* compiled from: DyConversationManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends V2TIMConversationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f24924a;

        public a(b bVar) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMConversationListener
        public void onTotalUnreadMessageCountChanged(long j2) {
        }
    }

    /* compiled from: DyConversationManager.java */
    /* renamed from: h.u.a.u.y3.q.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0378b implements V2TIMCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IUIKitCallback f24925a;
        public final /* synthetic */ b b;

        public C0378b(b bVar, IUIKitCallback iUIKitCallback) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMCallback
        public void onSuccess() {
        }
    }

    /* compiled from: DyConversationManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements V2TIMValueCallback<V2TIMConversationResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IUIKitCallback f24926a;
        public final /* synthetic */ List b;
        public final /* synthetic */ b c;

        public c(b bVar, IUIKitCallback iUIKitCallback, List list) {
        }

        public void a(V2TIMConversationResult v2TIMConversationResult) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i2, String str) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public /* bridge */ /* synthetic */ void onSuccess(V2TIMConversationResult v2TIMConversationResult) {
        }
    }

    /* compiled from: DyConversationManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void g(int i2);
    }

    private void B(ConversationInfo conversationInfo) {
    }

    private void F() {
    }

    public static /* synthetic */ h.u.a.u.y3.j.d a(b bVar) {
    }

    public static /* synthetic */ String b() {
    }

    public static /* synthetic */ int c(b bVar) {
    }

    public static /* synthetic */ int d(b bVar, int i2) {
    }

    public static /* synthetic */ ArrayList e(b bVar) {
    }

    private h.u.a.u.y3.j.d p() {
    }

    private ArrayList<ConversationInfo> q() {
    }

    public static b s() {
    }

    private boolean v(String str) {
    }

    public void A(ConversationPresenter conversationPresenter) {
    }

    public void C(d dVar) {
    }

    public void D(ConversationInfo conversationInfo, boolean z) {
    }

    public void E(String str, int i2) {
    }

    public void G(long j2) {
    }

    public void f(ConversationInfo conversationInfo) {
    }

    public void g(ConversationPresenter conversationPresenter) {
    }

    public void h(d dVar) {
    }

    public void i(List<ConversationInfo> list) {
    }

    public void j(ConversationInfo conversationInfo) {
    }

    public void k() {
    }

    public void l() {
    }

    public void m(ConversationInfo conversationInfo, IUIKitCallback iUIKitCallback) {
    }

    public void n(String str, IUIKitCallback iUIKitCallback) {
    }

    public void o() {
    }

    public ConversationInfo r(String str) {
    }

    public int t() {
    }

    public void u(Boolean bool) {
    }

    public void w(IUIKitCallback<List<ConversationInfo>> iUIKitCallback) {
    }

    public void x(List<ConversationInfo> list, IUIKitCallback<List<ConversationInfo>> iUIKitCallback) {
    }

    public void y(ConversationInfo conversationInfo) {
    }

    public void z(ConversationInfo conversationInfo, Boolean bool) {
    }
}
