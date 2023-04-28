package com.showstartfans.activity.activitys.products;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import h.u.a.c.k0.k2;
import h.y.a.m.n;
import kotlin.Unit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class MorePhotoActivity extends BaseNewActivity {

    /* renamed from: h  reason: collision with root package name */
    public static final String f6169h = "performerIds";
    private PullRefreshLayout b;
    private LoadMoreRecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    private k2 f6170d;

    /* renamed from: e  reason: collision with root package name */
    private String f6171e;

    /* renamed from: f  reason: collision with root package name */
    private int f6172f;

    /* renamed from: g  reason: collision with root package name */
    private StaggeredGridLayoutManager f6173g;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MorePhotoActivity f6174a;

        public a(MorePhotoActivity morePhotoActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MorePhotoActivity f6175a;

        public b(MorePhotoActivity morePhotoActivity) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
        }
    }

    private void A(boolean z) {
    }

    private /* synthetic */ void B(boolean z, n nVar) {
    }

    private /* synthetic */ Unit D(boolean z) {
    }

    public static /* synthetic */ int w(MorePhotoActivity morePhotoActivity, int i2) {
    }

    public static /* synthetic */ int x(MorePhotoActivity morePhotoActivity) {
    }

    public static /* synthetic */ void y(MorePhotoActivity morePhotoActivity, boolean z) {
    }

    public static /* synthetic */ StaggeredGridLayoutManager z(MorePhotoActivity morePhotoActivity) {
    }

    public /* synthetic */ void C(boolean z, n nVar) {
    }

    public /* synthetic */ Unit E(boolean z) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
