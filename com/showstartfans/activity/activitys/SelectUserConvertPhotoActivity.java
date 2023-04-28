package com.showstartfans.activity.activitys;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.activitys.article.SelectPhotoActivity;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihe.photoselector.model.PhotoModel;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.c.w.y1;
import h.u.a.d.m1;
import h.u.a.g.u4;
import h.y.a.m.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectUserConvertPhotoActivity.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0014J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\"\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020 H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/showstartfans/activity/activitys/SelectUserConvertPhotoActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "Lcom/showstartfans/activity/adapter/SelectUserConverPhotoAdapter;", "binding", "Lcom/showstartfans/activity/databinding/ActivitySelectUserConverPhotoBinding;", "builder", "Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;", "fansId", "", "localPhotoRequestCode", "", "mPage", "OnClickNext", "", "checkBottom", "doResult", "datas", "", "Lcom/taihe/photoselector/model/PhotoModel;", "getData", "page", "initData", "initListener", "initView", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "data", "Landroid/content/Intent;", "setContentViewResByViewBind", "Landroid/view/View;", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SelectUserConvertPhotoActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f5254i = null;
    @NotNull
    public Map<Integer, View> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private int f5255d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f5256e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private m1 f5257f;

    /* renamed from: g  reason: collision with root package name */
    private u4 f5258g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final SelectPhotoActivity.a f5259h;

    /* compiled from: SelectUserConvertPhotoActivity.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007¨\u0006\u0011"}, d2 = {"Lcom/showstartfans/activity/activitys/SelectUserConvertPhotoActivity$Companion;", "", "()V", "onActivityResult", "", "Lcom/taihe/photoselector/model/PhotoModel;", "resultCode", "", "data", "Landroid/content/Intent;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "act", "Landroid/app/Activity;", "fansId", "", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Nullable
        public final List<PhotoModel> a(int i2, @Nullable Intent intent) {
        }

        public final void b(@NotNull Activity activity, @NotNull String str, int i2) {
        }
    }

    /* compiled from: SelectUserConvertPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/SelectUserConvertPhotoActivity$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SelectUserConvertPhotoActivity f5260a;

        public b(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    /* compiled from: SelectUserConvertPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SelectUserConvertPhotoActivity this$0;

        public c(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: SelectUserConvertPhotoActivity.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/SelectUserConvertPhotoActivity$initListener$4", "Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter$OnCheckChangeListener;", "OnCheckChange", "", "checkMap", "Ljava/util/LinkedHashMap;", "", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/collections/LinkedHashMap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d implements y1.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SelectUserConvertPhotoActivity f5261a;

        public d(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity) {
        }

        @Override // h.u.a.c.w.y1.b
        public void a(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap) {
        }
    }

    public static final /* synthetic */ void A(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity, int i2) {
    }

    public static final /* synthetic */ int B(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity) {
    }

    public static final /* synthetic */ int C(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity) {
    }

    private final void D() {
    }

    private final void E(List<? extends PhotoModel> list) {
    }

    private final void F(int i2) {
    }

    private static final void G(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity, int i2, n nVar) {
    }

    private static final void H(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity, View view) {
    }

    public static /* synthetic */ void I(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity, View view) {
    }

    public static /* synthetic */ void J(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity, int i2, n nVar) {
    }

    public static final /* synthetic */ void x(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity) {
    }

    public static final /* synthetic */ SelectPhotoActivity.a y(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity z(SelectUserConvertPhotoActivity selectUserConvertPhotoActivity) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    public final void w() {
    }
}
