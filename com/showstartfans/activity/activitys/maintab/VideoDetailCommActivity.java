package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.model.VideoDetailBean;
import com.soli.pullupdownrefresh.PullRefreshLayout;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.u.a.c.f0.q9;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoDetailCommActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bJ\b\u0010\u0017\u001a\u00020\u0013H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u000eH\u0014J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u000eR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "Lcom/mob/moblink/SceneRestorable;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommMsgAdapter;", "getAdapter", "()Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommMsgAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "hiStr", "", "mainCommId", "pageNo", "", "videoId", "videoInfo", "Lcom/showstartfans/activity/model/VideoDetailBean;", "getVideoComm", "", "showPro", "", "getVideoDetailInfo", "initData", "initListener", "initView", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "setContentViewRes", "setTitles", "totalCount", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class VideoDetailCommActivity extends BaseNewActivity implements SceneRestorable {
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final a f5925i = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f5926d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private String f5927e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private String f5928f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private VideoDetailBean f5929g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final Lazy f5930h;

    /* compiled from: VideoDetailCommActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "commID", "", "videoId", "videoBean", "Lcom/showstartfans/activity/model/VideoDetailBean;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final void a(@Nullable Context context, @NotNull String str, @Nullable String str2, @Nullable VideoDetailBean videoDetailBean) {
        }
    }

    /* compiled from: VideoDetailCommActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/VideoDetailCommMsgAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<q9> {
        public final /* synthetic */ VideoDetailCommActivity this$0;

        public b(VideoDetailCommActivity videoDetailCommActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ q9 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final q9 invoke() {
        }
    }

    /* compiled from: VideoDetailCommActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/VideoDetailCommActivity$initListener$1", "Lcom/soli/pullupdownrefresh/PullRefreshLayout$onRefrshListener;", "onPullDownRefresh", "", "onPullupRefresh", "actionFromClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements PullRefreshLayout.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoDetailCommActivity f5931a;

        public c(VideoDetailCommActivity videoDetailCommActivity) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void a(boolean z) {
        }

        @Override // com.soli.pullupdownrefresh.PullRefreshLayout.c
        public void b() {
        }
    }

    public static final /* synthetic */ VideoDetailBean A(VideoDetailCommActivity videoDetailCommActivity) {
    }

    public static final /* synthetic */ void B(VideoDetailCommActivity videoDetailCommActivity, int i2) {
    }

    private final q9 C() {
    }

    private final void D(boolean z) {
    }

    private static final void E(VideoDetailCommActivity videoDetailCommActivity, n nVar) {
    }

    private static final void G(VideoDetailCommActivity videoDetailCommActivity, n nVar) {
    }

    private static final void H(VideoDetailCommActivity videoDetailCommActivity, View view) {
    }

    public static /* synthetic */ void I(VideoDetailCommActivity videoDetailCommActivity, View view) {
    }

    public static /* synthetic */ void J(VideoDetailCommActivity videoDetailCommActivity, n nVar) {
    }

    public static /* synthetic */ void K(VideoDetailCommActivity videoDetailCommActivity, n nVar) {
    }

    @JvmStatic
    public static final void M(@Nullable Context context, @NotNull String str, @Nullable String str2, @Nullable VideoDetailBean videoDetailBean) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity w(VideoDetailCommActivity videoDetailCommActivity) {
    }

    public static final /* synthetic */ int x(VideoDetailCommActivity videoDetailCommActivity) {
    }

    public static final /* synthetic */ void y(VideoDetailCommActivity videoDetailCommActivity, boolean z) {
    }

    public static final /* synthetic */ String z(VideoDetailCommActivity videoDetailCommActivity) {
    }

    public final void F(@NotNull String str) {
    }

    public final void L(int i2) {
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@Nullable Scene scene) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
