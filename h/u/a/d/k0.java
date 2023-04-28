package h.u.a.d;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.showstartfans.activity.view.ArticleImmersionView;
import com.showstartfans.activity.view.BaseImmersionView;
import com.showstartfans.activity.view.CustomTextView;
import com.showstartfans.activity.view.PraiseImmersionView;
import com.showstartfans.activity.view.UserHeaderView;
import com.showstartfans.activity.view.UserLevelView;
import com.showstartfans.activity.widget.FollowViewNoBG;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.taihebase.activity.view.svg.SvgImageView;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.u.a.w.d0.d2;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticleImmersionAdapter.kt */
@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n*\u0001\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001AB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u001e\u0010\u0018\u001a\u00020\u00142\n\u0010\u0019\u001a\u00060\u000bR\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u001a\u001a\u00020\u00142\n\u0010\u0019\u001a\u00060\u000bR\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u0014J\u0006\u0010\u001f\u001a\u00020\u0014J\u0006\u0010 \u001a\u00020\u0014J\u0006\u0010!\u001a\u00020\u0014J&\u0010\"\u001a\u00020\u00142\n\u0010\u0019\u001a\u00060\u000bR\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0007H\u0002J\u0018\u0010%\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u0007J*\u0010&\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0014J\u0016\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/J\u001a\u00100\u001a\u00020(2\b\u0010\u0016\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u0007H\u0014J\u000e\u00103\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0007J2\u00104\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u0002082\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002J \u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0002J.\u0010<\u001a\u00020\u00142\n\u0010\u0019\u001a\u00060\u000bR\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u000208J\u001c\u0010>\u001a\u00020\u00142\n\u0010\u0019\u001a\u00060\u000bR\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J*\u0010?\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u0010@\u001a\u0002082\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u000bR\u00020\u00000\nj\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u000bR\u00020\u0000`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/showstartfans/activity/adapter/ArticleImmersionAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/Article;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contentMaxLine", "", "currentShowPosition", "holderMap", "Ljava/util/HashMap;", "Lcom/showstartfans/activity/adapter/ArticleImmersionAdapter$ViewHodler;", "Lkotlin/collections/HashMap;", "lastPosition", "onSeekBarListener", "com/showstartfans/activity/adapter/ArticleImmersionAdapter$onSeekBarListener$1", "Lcom/showstartfans/activity/adapter/ArticleImmersionAdapter$onSeekBarListener$1;", "seekBarIsTouch", "", "addZanLottieAnimation", "", "bean", "parent", "Landroid/widget/RelativeLayout;", "checkContent", "holder", "checkReviewCount", "getCurrentView", "Lcom/showstartfans/activity/view/ArticleImmersionView;", "onActivityFinish", "onActivityPause", "onActivityRestart", "onActivityResume", "onActivityStop", "onAddNewComment", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", h.a.a.a.a.i.g.C, "onAddReview", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "real_position", "onControlSeetTo", "progress", "touchMode", "Lcom/showstartfans/activity/view/BaseImmersionView$SeekBarMode;", "onCreateViewHolder_impl", "Landroid/view/ViewGroup;", "viewType", "onPageSelected", "reportDialog", TUIConstants.TUILive.USER_ID, "commId", "commContent", "", "scenePrivateDialog", "id", "sceneType", "sendCommDialog", "hiht", "setTagView", "showReportPop", "contentStr", "ViewHodler", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class k0 extends h.y.a.f.m<Article> {

    /* renamed from: n  reason: collision with root package name */
    private final int f20258n;

    /* renamed from: o  reason: collision with root package name */
    private int f20259o;

    /* renamed from: p  reason: collision with root package name */
    private int f20260p;
    @NotNull
    private HashMap<Integer, a> q;
    private boolean r;
    @NotNull
    private final h s;

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00170\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u001b0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u001f0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\n \u0007*\u0004\u0018\u00010#0#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0019\u0010&\u001a\n \u0007*\u0004\u0018\u00010'0'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010*\u001a\n \u0007*\u0004\u0018\u00010'0'¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0019\u0010,\u001a\n \u0007*\u0004\u0018\u00010-0-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u00100\u001a\n \u0007*\u0004\u0018\u00010-0-¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u0019\u00102\u001a\n \u0007*\u0004\u0018\u00010303¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u00106\u001a\n \u0007*\u0004\u0018\u00010-0-¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0019\u00108\u001a\n \u0007*\u0004\u0018\u00010-0-¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0019\u0010:\u001a\n \u0007*\u0004\u0018\u00010;0;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0019\u0010>\u001a\n \u0007*\u0004\u0018\u00010?0?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0019\u0010B\u001a\n \u0007*\u0004\u0018\u00010-0-¢\u0006\b\n\u0000\u001a\u0004\bC\u0010/R\u0019\u0010D\u001a\n \u0007*\u0004\u0018\u00010E0E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0019\u0010H\u001a\n \u0007*\u0004\u0018\u00010I0I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/showstartfans/activity/adapter/ArticleImmersionAdapter$ViewHodler;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/adapter/ArticleImmersionAdapter;Landroid/view/View;)V", "iv_More", "Lcom/taihebase/activity/view/svg/SvgImageView;", "kotlin.jvm.PlatformType", "getIv_More", "()Lcom/taihebase/activity/view/svg/SvgImageView;", "iv_back", "Landroid/widget/ImageView;", "getIv_back", "()Landroid/widget/ImageView;", "iv_comment", "getIv_comment", "iv_share", "getIv_share", "layout_SeekBar", "Landroid/widget/FrameLayout;", "getLayout_SeekBar", "()Landroid/widget/FrameLayout;", "layout_zan_animal_parent", "Landroid/widget/RelativeLayout;", "getLayout_zan_animal_parent", "()Landroid/widget/RelativeLayout;", "pv_praise_view", "Lcom/showstartfans/activity/view/PraiseImmersionView;", "getPv_praise_view", "()Lcom/showstartfans/activity/view/PraiseImmersionView;", "rv_bottom_container", "Landroid/widget/LinearLayout;", "getRv_bottom_container", "()Landroid/widget/LinearLayout;", "rv_list_topic", "Landroidx/recyclerview/widget/RecyclerView;", "getRv_list_topic", "()Landroidx/recyclerview/widget/RecyclerView;", "seekbar", "Landroid/widget/SeekBar;", "getSeekbar", "()Landroid/widget/SeekBar;", "seekbar_grey", "getSeekbar_grey", "tv_ReviewCount", "Landroid/widget/TextView;", "getTv_ReviewCount", "()Landroid/widget/TextView;", "tv_comment", "getTv_comment", "tv_content", "Lcom/showstartfans/activity/view/CustomTextView;", "getTv_content", "()Lcom/showstartfans/activity/view/CustomTextView;", "tv_info", "getTv_info", "tv_show_all", "getTv_show_all", "userHead", "Lcom/showstartfans/activity/view/UserHeaderView;", "getUserHead", "()Lcom/showstartfans/activity/view/UserHeaderView;", "userLevel", "Lcom/showstartfans/activity/view/UserLevelView;", "getUserLevel", "()Lcom/showstartfans/activity/view/UserLevelView;", Oauth2AccessToken.KEY_SCREEN_NAME, "getUserName", "view_follow", "Lcom/showstartfans/activity/widget/FollowViewNoBG;", "getView_follow", "()Lcom/showstartfans/activity/widget/FollowViewNoBG;", "view_item", "Lcom/showstartfans/activity/view/ArticleImmersionView;", "getView_item", "()Lcom/showstartfans/activity/view/ArticleImmersionView;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final ArticleImmersionView f20261a;
        private final PraiseImmersionView b;
        private final RecyclerView c;

        /* renamed from: d  reason: collision with root package name */
        private final ImageView f20262d;

        /* renamed from: e  reason: collision with root package name */
        private final UserHeaderView f20263e;

        /* renamed from: f  reason: collision with root package name */
        private final SvgImageView f20264f;

        /* renamed from: g  reason: collision with root package name */
        private final TextView f20265g;

        /* renamed from: h  reason: collision with root package name */
        private final ImageView f20266h;

        /* renamed from: i  reason: collision with root package name */
        private final ImageView f20267i;

        /* renamed from: j  reason: collision with root package name */
        private final SeekBar f20268j;

        /* renamed from: k  reason: collision with root package name */
        private final SeekBar f20269k;

        /* renamed from: l  reason: collision with root package name */
        private final RelativeLayout f20270l;

        /* renamed from: m  reason: collision with root package name */
        private final TextView f20271m;

        /* renamed from: n  reason: collision with root package name */
        private final TextView f20272n;

        /* renamed from: o  reason: collision with root package name */
        private final LinearLayout f20273o;

        /* renamed from: p  reason: collision with root package name */
        private final FollowViewNoBG f20274p;
        private final CustomTextView q;
        private final TextView r;
        private final TextView s;
        private final FrameLayout t;
        private final UserLevelView u;
        public final /* synthetic */ k0 v;

        public a(@NotNull k0 k0Var, View view) {
        }

        public final SvgImageView c() {
        }

        public final ImageView d() {
        }

        public final ImageView e() {
        }

        public final ImageView f() {
        }

        public final FrameLayout g() {
        }

        public final TextView getUserName() {
        }

        public final RelativeLayout h() {
        }

        public final PraiseImmersionView i() {
        }

        public final LinearLayout j() {
        }

        public final RecyclerView k() {
        }

        public final SeekBar l() {
        }

        public final SeekBar m() {
        }

        public final TextView n() {
        }

        public final TextView o() {
        }

        public final CustomTextView p() {
        }

        public final TextView q() {
        }

        public final TextView r() {
        }

        public final UserHeaderView s() {
        }

        public final UserLevelView t() {
        }

        public final FollowViewNoBG u() {
        }

        public final ArticleImmersionView v() {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ a $holder;

        public b(a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/adapter/ArticleImmersionAdapter$onBindViewHolder_impl$1", "Lcom/showstartfans/activity/view/ArticleImmersionView$ImmersionObserver;", "onDoubleClick", "", "onVideoPause", "onVideoPlayBegin", "onVideoProgress", "progress", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends ArticleImmersionView.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k0 f20275a;
        public final /* synthetic */ a b;
        public final /* synthetic */ Article c;

        public c(k0 k0Var, a aVar, Article article) {
        }

        @Override // com.showstartfans.activity.view.ArticleImmersionView.a
        public void a() {
        }

        @Override // com.showstartfans.activity.view.ArticleImmersionView.a
        public void b() {
        }

        @Override // com.showstartfans.activity.view.ArticleImmersionView.a
        public void c() {
        }

        @Override // com.showstartfans.activity.view.ArticleImmersionView.a
        public void d(int i2) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0001j\u0002`\nJ!\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¨\u0006\f"}, d2 = {"com/showstartfans/activity/adapter/ArticleImmersionAdapter$onBindViewHolder_impl$2", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "success", "isFollow", "", "newRelationship", "", "Lcom/showstartfans/activity/widget/OnFollowListener;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements Function3<Boolean, Boolean, Integer, Unit> {
        public final /* synthetic */ Article b;
        public final /* synthetic */ k0 c;

        public d(Article article, k0 k0Var) {
        }

        public void a(boolean z, boolean z2, int i2) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Integer num) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<SceneDetailCommBean, Unit> {
        public final /* synthetic */ a $holder;
        public final /* synthetic */ int $real_position;
        public final /* synthetic */ k0 this$0;

        public e(k0 k0Var, a aVar, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SceneDetailCommBean sceneDetailCommBean) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SceneDetailCommBean sceneDetailCommBean) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Article $bean;

        public f(Article article) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "path", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ Article $bean;
        public final /* synthetic */ k0 this$0;

        public g(k0 k0Var, Article article) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/adapter/ArticleImmersionAdapter$onSeekBarListener$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ k0 b;

        public h(k0 k0Var) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(@Nullable SeekBar seekBar, int i2, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u000026\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/adapter/ArticleImmersionAdapter$reportDialog$1", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "success", "", h.c.a.a.a.f16081l, "", "Lcom/showstartfans/activity/utils/OnReportDialogCallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i implements Function2<Boolean, Integer, Unit> {
        public final /* synthetic */ k0 b;
        public final /* synthetic */ int c;

        public i(k0 k0Var, int i2) {
        }

        private static final void b(k0 k0Var, int i2, Object obj) {
        }

        public static /* synthetic */ void c(k0 k0Var, int i2, Object obj) {
        }

        public void a(boolean z, int i2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends Lambda implements Function1<Boolean, Unit> {
        public static final j INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ArticleImmersionAdapter.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/adapter/ArticleImmersionAdapter$sendCommDialog$1", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "onDanmuInputCall", "", "inputStr", "", "onDanmuInputDismiss", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class k implements d2 {
        public final /* synthetic */ k0 b;
        public final /* synthetic */ Article c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f20276d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f20277e;

        /* compiled from: ArticleImmersionAdapter.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ Article $bean;
            public final /* synthetic */ a $holder;
            public final /* synthetic */ String $inputStr;
            public final /* synthetic */ int $position;
            public final /* synthetic */ k0 this$0;

            public a(Article article, String str, k0 k0Var, a aVar, int i2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            }

            public final void invoke(int i2) {
            }
        }

        public k(k0 k0Var, Article article, a aVar, int i2) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputCall(@NotNull String str) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputDismiss() {
        }
    }

    public k0(@NotNull Context context) {
    }

    private static final void A0(a aVar, k0 k0Var, Article article, View view) {
    }

    private static final void B0(k0 k0Var, Article article, Boolean bool) {
    }

    private final void E0(int i2, int i3, int i4, String str, Article article) {
    }

    private final void F0(int i2, int i3, int i4) {
    }

    private static final void G0(k0 k0Var, int i2, int i3, View view, String str, int i4) {
    }

    public static /* synthetic */ void I0(k0 k0Var, a aVar, Article article, int i2, String str, int i3, Object obj) {
    }

    private final void J0(a aVar, Article article) {
    }

    private final void K0(int i2, int i3, String str, Article article) {
    }

    private static final void L0(k0 k0Var, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    public static final /* synthetic */ void Q(k0 k0Var, Article article, RelativeLayout relativeLayout) {
    }

    public static final /* synthetic */ Context R(k0 k0Var) {
    }

    public static final /* synthetic */ boolean S(k0 k0Var) {
    }

    public static final /* synthetic */ void T(k0 k0Var, a aVar, SceneDetailCommBean sceneDetailCommBean, int i2) {
    }

    public static final /* synthetic */ void U(k0 k0Var, boolean z) {
    }

    private final void V(Article article, RelativeLayout relativeLayout) {
    }

    private static final void W(LottieAnimationView lottieAnimationView, RelativeLayout relativeLayout, ValueAnimator valueAnimator) {
    }

    private final void X(a aVar, Article article) {
    }

    private static final void Y(k0 k0Var, Article article, View view) {
    }

    private static final void Z(k0 k0Var, Article article, View view) {
    }

    private final void a0(a aVar, Article article) {
    }

    public static /* synthetic */ void c0(k0 k0Var, a aVar, Article article, int i2, View view) {
    }

    public static /* synthetic */ void d0(Article article, k0 k0Var, a aVar, int i2, View view) {
    }

    public static /* synthetic */ void e0(k0 k0Var, Article article, View view) {
    }

    public static /* synthetic */ void f0(LottieAnimationView lottieAnimationView, RelativeLayout relativeLayout, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void g0(k0 k0Var, View view) {
    }

    public static /* synthetic */ void h0(Article article, k0 k0Var, View view) {
    }

    public static /* synthetic */ void i0(Article article, k0 k0Var, int i2, View view) {
    }

    public static /* synthetic */ void j0(k0 k0Var, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    public static /* synthetic */ void k0(k0 k0Var, Article article, Boolean bool) {
    }

    public static /* synthetic */ void l0(k0 k0Var, Article article, View view) {
    }

    public static /* synthetic */ void m0(a aVar, k0 k0Var, Article article, View view) {
    }

    public static /* synthetic */ void n0(k0 k0Var, int i2, int i3, View view, String str, int i4) {
    }

    private final void t0(a aVar, SceneDetailCommBean sceneDetailCommBean, int i2) {
    }

    private static final void v0(k0 k0Var, View view) {
    }

    private static final void w0(Article article, k0 k0Var, View view) {
    }

    private static final void x0(Article article, k0 k0Var, int i2, View view) {
    }

    private static final void y0(k0 k0Var, a aVar, Article article, int i2, View view) {
    }

    private static final void z0(Article article, k0 k0Var, a aVar, int i2, View view) {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public final void C0(int i2, @NotNull BaseImmersionView.a aVar) {
    }

    public final void D0(int i2) {
    }

    public final void H0(@NotNull a aVar, @Nullable Article article, int i2, @NotNull String str) {
    }

    @Nullable
    public final ArticleImmersionView b0() {
    }

    public final void o0() {
    }

    public final void p0() {
    }

    public final void q0() {
    }

    public final void r0() {
    }

    public final void s0() {
    }

    public final void u0(@Nullable SceneDetailCommBean sceneDetailCommBean, int i2) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }
}
