package h.u.a.u.y3.m;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.showstartfans.activity.model.AuthorInfo;
import com.tencent.imsdk.v2.V2TIMAdvancedMsgListener;
import com.tencent.imsdk.v2.V2TIMGroupListener;
import com.tencent.imsdk.v2.V2TIMGroupMemberChangeInfo;
import com.tencent.imsdk.v2.V2TIMGroupMemberInfo;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuikit.tuichat.bean.ChatInfo;
import com.tencent.qcloud.tuikit.tuichat.bean.GroupInfo;
import com.tencent.qcloud.tuikit.tuichat.presenter.ChatPresenter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomTUIGroupChatFragment.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class e extends h.u.a.u.y3.m.c {
    private static final String s = null;

    /* renamed from: m  reason: collision with root package name */
    private h.u.a.u.y3.s.c f24844m;

    /* renamed from: n  reason: collision with root package name */
    private GroupInfo f24845n;

    /* renamed from: o  reason: collision with root package name */
    private AuthorInfo f24846o;

    /* renamed from: p  reason: collision with root package name */
    private ArrayList<AuthorInfo> f24847p;
    private V2TIMAdvancedMsgListener q;
    private V2TIMGroupListener r;

    /* compiled from: CustomTUIGroupChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ e b;

        public a(e eVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomTUIGroupChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends V2TIMAdvancedMsgListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f24848a;

        /* compiled from: CustomTUIGroupChatFragment.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class a implements Runnable {
            public final /* synthetic */ b b;

            public a(b bVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public b(e eVar) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMAdvancedMsgListener
        public void onRecvNewMessage(V2TIMMessage v2TIMMessage) {
        }
    }

    /* compiled from: CustomTUIGroupChatFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends V2TIMGroupListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f24849a;

        public c(e eVar) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMGroupListener
        public void onMemberEnter(String str, List<V2TIMGroupMemberInfo> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMGroupListener
        public void onMemberInfoChanged(String str, List<V2TIMGroupMemberChangeInfo> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMGroupListener
        public void onMemberKicked(String str, V2TIMGroupMemberInfo v2TIMGroupMemberInfo, List<V2TIMGroupMemberInfo> list) {
        }

        @Override // com.tencent.imsdk.v2.V2TIMGroupListener
        public void onReceiveRESTCustomData(String str, byte[] bArr) {
        }
    }

    private void initListener() {
    }

    public static /* synthetic */ GroupInfo q(e eVar) {
    }

    @Override // h.u.a.u.y3.m.c
    public ChatInfo getChatInfo() {
    }

    @Override // h.u.a.u.y3.m.c
    public /* bridge */ /* synthetic */ ChatPresenter getPresenter() {
    }

    @Override // h.u.a.u.y3.m.c
    public void initView() {
    }

    @Override // h.u.a.u.y3.m.c
    public boolean l() {
    }

    @Override // h.u.a.u.y3.m.c
    public void m() {
    }

    @Override // h.u.a.u.y3.m.c, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
    }

    public h.u.a.u.y3.s.c r() {
    }

    public void s(AuthorInfo authorInfo, ArrayList<AuthorInfo> arrayList) {
    }

    public void u(h.u.a.u.y3.s.c cVar) {
    }
}
