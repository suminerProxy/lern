package h.u.a.c.l0;

import android.os.Bundle;
import android.view.View;
import com.showstartfans.activity.eventmodel.PlayMusicEvent;
import com.showstartfans.activity.model.ProfileDetailBean;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileDetailFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\fH\u0014J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\b\u0010\u0005\u001a\u00020\u0011H\u0014J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010\u0019\u001a\u00020\u0011J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0012\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ProfileDetailFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "detailBean", "Lcom/showstartfans/activity/model/ProfileDetailBean;", "initView", "", "musicAdapter", "Lcom/showstartfans/activity/activitys/products/MusicListAdapter;", "performerId", "", "performerType", "", "postData", "register", "umengFrom", "getArtistDetailData", "", "getContentView", "getLabelBrandDtailData", "getSiteDetailData", "initData", "initListener", "initViewData", com.alipay.sdk.util.l.c, "loadFirstData", "onClickBottom", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/PlayMusicEvent;", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class k3 extends h.y.a.f.o.e {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f19452k = null;
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private int f19453d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ProfileDetailBean f19454e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f19455f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19456g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19457h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f19458i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private h.u.a.c.k0.e2 f19459j;

    /* compiled from: ProfileDetailFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/ProfileDetailFragment$Companion;", "", "()V", "newInstance", "Lcom/showstartfans/activity/activitys/profile/ProfileDetailFragment;", "performerId", "", "performerType", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final k3 a(@NotNull String str, int i2) {
        }
    }

    private static final void B(k3 k3Var) {
    }

    private final void C() {
    }

    private final void g() {
    }

    private static final void h(k3 k3Var, h.y.a.m.n nVar) {
    }

    private final void i() {
    }

    private static final void j(k3 k3Var, h.y.a.m.n nVar) {
    }

    private final void k() {
    }

    private static final void l(k3 k3Var, h.y.a.m.n nVar) {
    }

    private static final void m(k3 k3Var, View view) {
    }

    private static final void n(k3 k3Var, View view) {
    }

    private final void q(String str) {
    }

    private static final void r(k3 k3Var, List list, View view) {
    }

    public static /* synthetic */ void s(k3 k3Var) {
    }

    public static /* synthetic */ void u(k3 k3Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void v(k3 k3Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void w(k3 k3Var, List list, View view) {
    }

    public static /* synthetic */ void x(k3 k3Var, h.y.a.m.n nVar) {
    }

    public static /* synthetic */ void y(k3 k3Var, View view) {
    }

    public static /* synthetic */ void z(k3 k3Var, View view) {
    }

    public final void A() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable PlayMusicEvent playMusicEvent) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle bundle) {
    }
}
