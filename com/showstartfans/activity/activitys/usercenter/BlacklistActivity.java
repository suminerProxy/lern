package com.showstartfans.activity.activitys.usercenter;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.showstartfans.activity.eventmodel.RefreshBlackEvent;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.c.n0.o9.v;
import h.y.a.m.n;
import kotlin.Unit;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BlacklistActivity extends BaseNewActivity {
    private PullRefreshLayout b;
    private ListView c;

    /* renamed from: d  reason: collision with root package name */
    private v f6301d;

    /* renamed from: e  reason: collision with root package name */
    private int f6302e;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BlacklistActivity f6303a;

        public a(BlacklistActivity blacklistActivity) {
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

    private /* synthetic */ void C(AdapterView adapterView, View view, int i2, long j2) {
    }

    private /* synthetic */ Unit E() {
    }

    public static /* synthetic */ int w(BlacklistActivity blacklistActivity, int i2) {
    }

    public static /* synthetic */ int x(BlacklistActivity blacklistActivity) {
    }

    public static /* synthetic */ void y(BlacklistActivity blacklistActivity, boolean z) {
    }

    private void z(boolean z) {
    }

    public /* synthetic */ void B(n nVar) {
    }

    public /* synthetic */ void D(AdapterView adapterView, View view, int i2, long j2) {
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
    public void onEvent(RefreshBlackEvent refreshBlackEvent) {
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
}
