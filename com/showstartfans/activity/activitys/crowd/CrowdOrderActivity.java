package com.showstartfans.activity.activitys.crowd;

import android.view.View;
import com.showstartfans.activity.eventmodel.CrowdPayEvent;
import com.showstartfans.activity.model.CrowdOrderMainBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import h.u.a.c.z.q0;
import h.y.a.m.n;
import kotlin.Unit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CrowdOrderActivity extends BaseNewActivity {
    private LoadMoreRecyclerView b;
    private PullRefreshLayout c;

    /* renamed from: d  reason: collision with root package name */
    private int f5418d;

    /* renamed from: e  reason: collision with root package name */
    private q0 f5419e;

    /* renamed from: f  reason: collision with root package name */
    private CrowdOrderMainBean f5420f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CrowdOrderActivity f5421a;

        public a(CrowdOrderActivity crowdOrderActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    private /* synthetic */ void A(n nVar) {
    }

    private /* synthetic */ void C(int i2, View view) {
    }

    private /* synthetic */ Unit E() {
    }

    public static /* synthetic */ int x(CrowdOrderActivity crowdOrderActivity) {
    }

    public static /* synthetic */ void y(CrowdOrderActivity crowdOrderActivity, boolean z) {
    }

    private void z(boolean z) {
    }

    public /* synthetic */ void B(n nVar) {
    }

    public /* synthetic */ void D(int i2, View view) {
    }

    public /* synthetic */ Unit F() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initData() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initListener() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public void initView() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(CrowdPayEvent crowdPayEvent) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    public void w() {
    }
}
