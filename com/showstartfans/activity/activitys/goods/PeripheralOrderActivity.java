package com.showstartfans.activity.activitys.goods;

import android.view.View;
import android.widget.TextView;
import com.showstartfans.activity.eventmodel.RefreshPeripheralOrderEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import h.u.a.c.b0.g4;
import h.y.a.m.n;
import kotlin.Unit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PeripheralOrderActivity extends BaseNewActivity {
    private PullRefreshLayout b;
    private LoadMoreRecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f5503d;

    /* renamed from: e  reason: collision with root package name */
    private View f5504e;

    /* renamed from: f  reason: collision with root package name */
    private View f5505f;

    /* renamed from: g  reason: collision with root package name */
    private g4 f5506g;

    /* renamed from: h  reason: collision with root package name */
    private int f5507h;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PeripheralOrderActivity f5508a;

        public a(PeripheralOrderActivity peripheralOrderActivity) {
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

    private /* synthetic */ void C(View view) {
    }

    private /* synthetic */ Unit E() {
    }

    public static /* synthetic */ int x(PeripheralOrderActivity peripheralOrderActivity) {
    }

    public static /* synthetic */ void y(PeripheralOrderActivity peripheralOrderActivity, boolean z) {
    }

    private void z(boolean z) {
    }

    public /* synthetic */ void B(n nVar) {
    }

    public /* synthetic */ void D(View view) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(RefreshPeripheralOrderEvent refreshPeripheralOrderEvent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, android.app.Activity
    public void onRestart() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }

    public void w() {
    }
}
