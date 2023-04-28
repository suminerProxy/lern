package tencent.txlive.zhibo.audience;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import h.v.a.d;
import h.y.a.f.o.e;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tencent.txlive.zhibo.ui.LiveTopBDAdapter;

/* compiled from: LiveContributionFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\b\u0010\r\u001a\u00020\u001cH\u0014J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Ltencent/txlive/zhibo/audience/LiveContributionFragment;", "Lcom/taihebase/activity/base/fragment/BaseNewFragment;", "()V", "adapter", "Ltencent/txlive/zhibo/ui/LiveTopBDAdapter;", "call", "Ltencent/txlive/zhibo/audience/OnAudienceBanCall;", "getCall", "()Ltencent/txlive/zhibo/audience/OnAudienceBanCall;", "setCall", "(Ltencent/txlive/zhibo/audience/OnAudienceBanCall;)V", "fragmentM", "Landroidx/fragment/app/FragmentManager;", "initView", "", "isManager", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "getLoadMoreAction", "()Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "loadMoreAction$delegate", "Lkotlin/Lazy;", "mRoomId", "", "pageIndex", "", "getContentView", "getData", "", "initData", "initListener", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class LiveContributionFragment extends e {
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    @Nullable
    private LiveTopBDAdapter adapter;
    @Nullable
    private OnAudienceBanCall call;
    @Nullable
    private FragmentManager fragmentM;
    private boolean initView;
    private boolean isManager;
    @NotNull
    private final Lazy loadMoreAction$delegate;
    @Nullable
    private String mRoomId;
    private int pageIndex;

    /* compiled from: LiveContributionFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Ltencent/txlive/zhibo/audience/LiveContributionFragment$Companion;", "", "()V", "newInstance", "Ltencent/txlive/zhibo/audience/LiveContributionFragment;", "isManager", "", "mRoomId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final LiveContributionFragment newInstance(boolean z, @Nullable String str) {
        }
    }

    public static final /* synthetic */ LiveTopBDAdapter access$getAdapter$p(LiveContributionFragment liveContributionFragment) {
    }

    public static /* synthetic */ void g(LiveContributionFragment liveContributionFragment, boolean z) {
    }

    private final void getData(int i2) {
    }

    private final d getLoadMoreAction() {
    }

    /* renamed from: initListener$lambda-0  reason: not valid java name */
    private static final void m1684initListener$lambda0(LiveContributionFragment liveContributionFragment, boolean z) {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.f.o.e, h.y.a.f.o.d
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Nullable
    public final OnAudienceBanCall getCall() {
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

    @Override // h.y.a.f.o.e, h.y.a.f.o.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle bundle) {
    }

    public final void setCall(@Nullable OnAudienceBanCall onAudienceBanCall) {
    }
}
