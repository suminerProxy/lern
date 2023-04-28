package h.u.a.c.n0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: UserMyFriendFragment.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class m9 extends h.y.a.f.o.e {

    /* renamed from: o  reason: collision with root package name */
    public static final int f19708o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f19709p = 1;
    private static final String[] q = null;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    public static final /* synthetic */ boolean v = false;
    private PullRefreshLayout b;
    private ListView c;

    /* renamed from: d  reason: collision with root package name */
    private View f19710d;

    /* renamed from: e  reason: collision with root package name */
    private View f19711e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f19712f;

    /* renamed from: g  reason: collision with root package name */
    private View f19713g;

    /* renamed from: h  reason: collision with root package name */
    private View f19714h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f19715i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f19716j;

    /* renamed from: k  reason: collision with root package name */
    private n8 f19717k;

    /* renamed from: l  reason: collision with root package name */
    private int f19718l;

    /* renamed from: m  reason: collision with root package name */
    private int f19719m;

    /* renamed from: n  reason: collision with root package name */
    private String f19720n;

    /* compiled from: UserMyFriendFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m9 f19721a;

        public a(m9 m9Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: UserMyFriendFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ m9 c;

        public b(m9 m9Var, boolean z) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: UserMyFriendFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Serializable {
        private String addressName;
        private String telephone;
        public final /* synthetic */ m9 this$0;

        public c(m9 m9Var, String str, String str2) {
        }

        public String getAddressName() {
        }

        public String getTelephone() {
        }

        public void setAddressName(String str) {
        }

        public void setTelephone(String str) {
        }
    }

    private /* synthetic */ void B(View view) {
    }

    private /* synthetic */ void D(Boolean bool) throws Exception {
    }

    private /* synthetic */ void F(boolean z, View view) {
    }

    private /* synthetic */ Unit H() {
    }

    private /* synthetic */ Unit J() {
    }

    public static m9 L(String str, int i2, String str2) {
    }

    public static /* synthetic */ int g(m9 m9Var, int i2) {
    }

    public static /* synthetic */ int h(m9 m9Var) {
    }

    public static /* synthetic */ int i(m9 m9Var) {
    }

    public static /* synthetic */ void j(m9 m9Var, boolean z) {
    }

    public static /* synthetic */ void k(m9 m9Var, boolean z) {
    }

    private List<c> l() {
    }

    private void m(boolean z) {
    }

    private void n(boolean z) {
    }

    private /* synthetic */ void q(boolean z, h.y.a.m.n nVar) {
    }

    private /* synthetic */ void s(boolean z, h.y.a.m.n nVar) {
    }

    private /* synthetic */ void v(View view) {
    }

    private /* synthetic */ void x(AdapterView adapterView, View view, int i2, long j2) {
    }

    private /* synthetic */ void z(View view) {
    }

    public /* synthetic */ void A(View view) {
    }

    public /* synthetic */ void C(View view) {
    }

    public /* synthetic */ void E(Boolean bool) {
    }

    public /* synthetic */ void G(boolean z, View view) {
    }

    public /* synthetic */ Unit I() {
    }

    public /* synthetic */ Unit K() {
    }

    @Override // h.y.a.f.o.e
    public int getContentView() {
    }

    @Override // h.y.a.f.o.e
    public void initData() {
    }

    @Override // h.y.a.f.o.e
    public void initListener() {
    }

    @Override // h.y.a.f.o.e
    public void initView() {
    }

    @Override // h.y.a.f.o.e, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(VideoListUserFollowEvent videoListUserFollowEvent) {
    }

    public /* synthetic */ void r(boolean z, h.y.a.m.n nVar) {
    }

    public /* synthetic */ void u(boolean z, h.y.a.m.n nVar) {
    }

    public /* synthetic */ void w(View view) {
    }

    public /* synthetic */ void y(AdapterView adapterView, View view, int i2, long j2) {
    }
}
