package h.u.a.c.y;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.eventmodel.ArticlePublishEvent;
import com.showstartfans.activity.model.PostArticleData;
import com.taihebase.activity.view.LoadMoreRecyclerView;
import h.u.a.c.l0.t3;
import java.util.Map;
import k.b.v0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommunityRecordPopup.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0006H\u0014J\b\u0010*\u001a\u00020(H\u0014J\b\u0010+\u001a\u00020(H\u0014J\u001a\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0012\u00100\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00101\u001a\u00020(2\u0006\u00102\u001a\u000203H\u0016J\u0012\u00104\u001a\u00020(2\b\u00105\u001a\u0004\u0018\u000106H\u0007J\u0010\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020/H\u0016J\b\u00109\u001a\u00020(H\u0002J\u0010\u0010:\u001a\u00020(2\u0006\u0010;\u001a\u00020<H\u0002J.\u0010=\u001a\u00020(2\u0006\u0010>\u001a\u00020?2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010@\u001a\u00020(H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b#\u0010\u000bR\u000e\u0010%\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/showstartfans/activity/activitys/community/CommunityRecordPopup;", "Lcom/taihebase/activity/view/bottomsheet/BaseSheetFragment;", "()V", "desc", "Landroid/widget/TextView;", "expPushedNum", "", "expSessionNum", "hideAnimation", "Landroid/view/animation/TranslateAnimation;", "getHideAnimation", "()Landroid/view/animation/TranslateAnimation;", "hideAnimation$delegate", "Lkotlin/Lazy;", "list", "Lcom/taihebase/activity/view/LoadMoreRecyclerView;", "loadMoreAction", "Lcom/soli/pullupdownrefresh/ListLoadMoreAction;", "name", "", "noData", "pageNo", "record", "Landroid/view/View;", "sceneShowAdapter", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "getSceneShowAdapter", "()Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "sceneShowAdapter$delegate", "showAdapter", "Lcom/showstartfans/activity/activitys/community/ShowListAdapter;", "getShowAdapter", "()Lcom/showstartfans/activity/activitys/community/ShowListAdapter;", "showAdapter$delegate", "showAnimation", "getShowAnimation", "showAnimation$delegate", "siteId", "title", "cannotRecord", "", "getContentView", "initData", "initListener", "initView", "view", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/ArticlePublishEvent;", "onSaveInstanceState", "outState", "post", "requestPostData", "showProgress", "", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "showListShow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class b0 extends h.y.a.o.y.b {
    @NotNull
    public Map<Integer, View> b;
    private TextView c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f20060d;

    /* renamed from: e  reason: collision with root package name */
    private LoadMoreRecyclerView f20061e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f20062f;

    /* renamed from: g  reason: collision with root package name */
    private View f20063g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final h.v.a.d f20064h;

    /* renamed from: i  reason: collision with root package name */
    private int f20065i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f20066j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f20067k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f20068l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private final Lazy f20069m;

    /* renamed from: n  reason: collision with root package name */
    private int f20070n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private String f20071o;

    /* renamed from: p  reason: collision with root package name */
    private int f20072p;
    private int q;

    /* compiled from: CommunityRecordPopup.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/TranslateAnimation;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a extends Lambda implements Function0<TranslateAnimation> {
        public final /* synthetic */ b0 this$0;

        /* compiled from: CommunityRecordPopup.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/showstartfans/activity/activitys/community/CommunityRecordPopup$hideAnimation$2$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: h.u.a.c.y.b0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class animation.Animation$AnimationListenerC0351a implements Animation.AnimationListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b0 f20073a;

            public animation.Animation$AnimationListenerC0351a(b0 b0Var) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation) {
            }
        }

        public a(b0 b0Var) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ TranslateAnimation invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TranslateAnimation invoke() {
        }
    }

    /* compiled from: CommunityRecordPopup.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/community/CommunityRecordPopup$initData$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b0 f20074a;

        public b(b0 b0Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: CommunityRecordPopup.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/PostArticleData;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c extends Lambda implements Function1<PostArticleData, Unit> {
        public final /* synthetic */ b0 this$0;

        public c(b0 b0Var) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PostArticleData postArticleData) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable PostArticleData postArticleData) {
        }
    }

    /* compiled from: CommunityRecordPopup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "com.showstartfans.activity.activitys.community.CommunityRecordPopup$requestPostData$articleMinId$1", f = "CommunityRecordPopup.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d extends SuspendLambda implements Function2<v0, Continuation<? super String>, Object> {
        public int label;
        public final /* synthetic */ b0 this$0;

        public d(b0 b0Var, Continuation<? super d> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Continuation<? super String> continuation) {
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull v0 v0Var, @Nullable Continuation<? super String> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* compiled from: CommunityRecordPopup.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e extends Lambda implements Function0<t3> {
        public final /* synthetic */ b0 this$0;

        public e(b0 b0Var) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final t3 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ t3 invoke() {
        }
    }

    /* compiled from: CommunityRecordPopup.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/community/ShowListAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class f extends Lambda implements Function0<c0> {
        public final /* synthetic */ b0 this$0;

        public f(b0 b0Var) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final c0 invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ c0 invoke() {
        }
    }

    /* compiled from: CommunityRecordPopup.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/TranslateAnimation;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class g extends Lambda implements Function0<TranslateAnimation> {
        public static final g INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ TranslateAnimation invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final TranslateAnimation invoke() {
        }
    }

    public static /* synthetic */ void A(b0 b0Var, boolean z) {
    }

    private final void B() {
    }

    private static final void C(b0 b0Var, View view) {
    }

    private static final void D(b0 b0Var, boolean z) {
    }

    private final void E(boolean z) {
    }

    private final void G() {
    }

    private static final void H(b0 b0Var, boolean z) {
    }

    public static final /* synthetic */ int e(b0 b0Var) {
    }

    public static final /* synthetic */ int f(b0 b0Var) {
    }

    public static final /* synthetic */ TranslateAnimation g(b0 b0Var) {
    }

    public static final /* synthetic */ LoadMoreRecyclerView h(b0 b0Var) {
    }

    public static final /* synthetic */ h.v.a.d i(b0 b0Var) {
    }

    public static final /* synthetic */ TextView j(b0 b0Var) {
    }

    public static final /* synthetic */ int k(b0 b0Var) {
    }

    public static final /* synthetic */ View l(b0 b0Var) {
    }

    public static final /* synthetic */ t3 m(b0 b0Var) {
    }

    public static final /* synthetic */ TranslateAnimation n(b0 b0Var) {
    }

    /* renamed from: onEvent$lambda-0  reason: not valid java name */
    private static final void m46onEvent$lambda0(b0 b0Var) {
    }

    public static final /* synthetic */ void q(b0 b0Var, int i2) {
    }

    private final void r() {
    }

    private final TranslateAnimation s() {
    }

    private final t3 u() {
    }

    private final c0 v() {
    }

    private final TranslateAnimation w() {
    }

    public static /* synthetic */ void x(b0 b0Var) {
    }

    public static /* synthetic */ void y(b0 b0Var, View view) {
    }

    public static /* synthetic */ void z(b0 b0Var, boolean z) {
    }

    public final void F(@NotNull FragmentManager fragmentManager, int i2, @NotNull String str, int i3, int i4) {
    }

    @Override // h.y.a.o.y.b
    public void _$_clearFindViewByIdCache() {
    }

    @Override // h.y.a.o.y.b
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.o.y.b
    public int getContentView() {
    }

    @Override // h.y.a.o.y.b
    public void initData() {
    }

    @Override // h.y.a.o.y.b
    public void initListener() {
    }

    @Override // h.y.a.o.y.b
    public void initView(@NotNull View view, @Nullable Bundle bundle) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // h.y.a.o.y.b, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable ArticlePublishEvent articlePublishEvent) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle bundle) {
    }
}
