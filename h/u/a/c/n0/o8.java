package h.u.a.c.n0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import kotlin.Unit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: AttentionFragment.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class o8 extends h.y.a.f.o.e {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ boolean f19742i = false;
    private PullRefreshLayout b;
    private ListView c;

    /* renamed from: d  reason: collision with root package name */
    private m8 f19743d;

    /* renamed from: e  reason: collision with root package name */
    private int f19744e;

    /* renamed from: f  reason: collision with root package name */
    private int f19745f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19746g;

    /* renamed from: h  reason: collision with root package name */
    private String f19747h;

    /* compiled from: AttentionFragment.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o8 f19748a;

        public a(o8 o8Var) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    public static o8 A(int i2, String str, boolean z, String str2) {
    }

    public static /* synthetic */ int g(o8 o8Var, int i2) {
    }

    public static /* synthetic */ int h(o8 o8Var) {
    }

    public static /* synthetic */ boolean i(o8 o8Var) {
    }

    public static /* synthetic */ void j(o8 o8Var, boolean z) {
    }

    public static /* synthetic */ void k(o8 o8Var, boolean z) {
    }

    private void l(boolean z) {
    }

    private void m(boolean z) {
    }

    private /* synthetic */ void n(h.y.a.m.n nVar) {
    }

    private /* synthetic */ void r(h.y.a.m.n nVar) {
    }

    private /* synthetic */ void u(AdapterView adapterView, View view, int i2, long j2) {
    }

    private /* synthetic */ Unit w() {
    }

    private /* synthetic */ Unit y() {
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

    public /* synthetic */ void q(h.y.a.m.n nVar) {
    }

    public /* synthetic */ void s(h.y.a.m.n nVar) {
    }

    public /* synthetic */ void v(AdapterView adapterView, View view, int i2, long j2) {
    }

    public /* synthetic */ Unit x() {
    }

    public /* synthetic */ Unit z() {
    }
}
