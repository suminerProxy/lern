package com.showstartfans.activity.activitys.profile;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.showstartfans.activity.eventmodel.SceneDetailCommEvent;
import com.showstartfans.activity.eventmodel.SceneDetailZanEvent;
import com.showstartfans.activity.eventmodel.SceneListVideoPlayerRollbackEvent;
import com.showstartfans.activity.eventmodel.SceneRemoveIndexEvent;
import com.showstartfans.activity.eventmodel.VideoListUserFollowEvent;
import com.showstartfans.activity.model.PostArticleData;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.u.a.c.l0.a3;
import h.u.a.g.t;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CityClassSceneActivity.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0014J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001bH\u0007J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001cH\u0007J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0007J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001eH\u0007J\u001a\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\tH\u0016J\b\u0010#\u001a\u00020\u0011H\u0014J\b\u0010$\u001a\u00020\u0011H\u0014J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020'H\u0014J\u0012\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/CityClassSceneActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "()V", "binding", "Lcom/showstartfans/activity/databinding/ActivityCityClassSceneLayoutBinding;", "canSendPost", "", "cityId", "", "fragments", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/activitys/profile/CityArticleGridFragment;", "Lkotlin/collections/ArrayList;", "isDownScroll", "pageNo", "getData", "", "showPro", "initData", "initFragment", "initListener", "initView", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/SceneDetailCommEvent;", "Lcom/showstartfans/activity/eventmodel/SceneDetailZanEvent;", "Lcom/showstartfans/activity/eventmodel/SceneListVideoPlayerRollbackEvent;", "Lcom/showstartfans/activity/eventmodel/SceneRemoveIndexEvent;", "Lcom/showstartfans/activity/eventmodel/VideoListUserFollowEvent;", "onOffsetChanged", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "onPause", "onResume", "scrollTop", "setContentViewResByViewBind", "Landroid/view/View;", "setViewData", "bean", "Lcom/showstartfans/activity/model/PostArticleData;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class CityClassSceneActivity extends BaseNoToolBarActivity implements AppBarLayout.OnOffsetChangedListener {
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f6205i = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f6206d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6207e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<a3> f6208f;

    /* renamed from: g  reason: collision with root package name */
    private t f6209g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6210h;

    /* compiled from: CityClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/CityClassSceneActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "cityCode", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, int i2) {
        }
    }

    /* compiled from: CityClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/PostArticleData;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<PostArticleData, Unit> {
        public final /* synthetic */ CityClassSceneActivity this$0;

        public b(CityClassSceneActivity cityClassSceneActivity) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PostArticleData postArticleData) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable PostArticleData postArticleData) {
        }
    }

    /* compiled from: CityClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0001j\u0002`\nJ!\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096\u0002¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/profile/CityClassSceneActivity$initFragment$1", "Lkotlin/Function3;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/ParameterName;", "name", "recyclerView", "", "dx", "dy", "", "Lcom/showstartfans/activity/activitys/profile/OnScrolledCallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements Function3<RecyclerView, Integer, Integer, Unit> {
        public final /* synthetic */ CityClassSceneActivity b;

        public c(CityClassSceneActivity cityClassSceneActivity) {
        }

        public void a(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RecyclerView recyclerView, Integer num, Integer num2) {
        }
    }

    /* compiled from: CityClassSceneActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/profile/CityClassSceneActivity$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CityClassSceneActivity f6211a;

        public d(CityClassSceneActivity cityClassSceneActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    public static final /* synthetic */ boolean A(CityClassSceneActivity cityClassSceneActivity) {
    }

    public static final /* synthetic */ void B(CityClassSceneActivity cityClassSceneActivity, boolean z) {
    }

    public static final /* synthetic */ void C(CityClassSceneActivity cityClassSceneActivity, int i2) {
    }

    public static final /* synthetic */ void D(CityClassSceneActivity cityClassSceneActivity, PostArticleData postArticleData) {
    }

    private final void E(boolean z) {
    }

    private final void F() {
    }

    private static final void G(CityClassSceneActivity cityClassSceneActivity, View view) {
    }

    private static final void H(CityClassSceneActivity cityClassSceneActivity, View view) {
    }

    public static /* synthetic */ void I(CityClassSceneActivity cityClassSceneActivity, View view) {
    }

    public static /* synthetic */ void J(CityClassSceneActivity cityClassSceneActivity, View view) {
    }

    private final void K() {
    }

    private final void L(PostArticleData postArticleData) {
    }

    public static final /* synthetic */ t w(CityClassSceneActivity cityClassSceneActivity) {
    }

    public static final /* synthetic */ boolean x(CityClassSceneActivity cityClassSceneActivity) {
    }

    public static final /* synthetic */ void y(CityClassSceneActivity cityClassSceneActivity, boolean z) {
    }

    public static final /* synthetic */ int z(CityClassSceneActivity cityClassSceneActivity) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
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
    public final void onEvent(@Nullable SceneDetailCommEvent sceneDetailCommEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneDetailZanEvent sceneDetailZanEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneListVideoPlayerRollbackEvent sceneListVideoPlayerRollbackEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneRemoveIndexEvent sceneRemoveIndexEvent) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable VideoListUserFollowEvent videoListUserFollowEvent) {
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public void onOffsetChanged(@Nullable AppBarLayout appBarLayout, int i2) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
