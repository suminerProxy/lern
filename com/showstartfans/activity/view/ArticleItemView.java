package com.showstartfans.activity.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.AuthorInfo;
import com.showstartfans.activity.view.superplayer.THScenePlayerView;
import com.showstartfans.activity.widget.FollowTextView;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.widget.indicator.recycleindicator.RecycleViewCircleIndicator;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.u.a.c.l0.i3;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArticleItemView.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ,\u0010q\u001a\u00020r2\u0006\u0010:\u001a\u00020\t2\b\u0010s\u001a\u0004\u0018\u0001002\u0006\u0010t\u001a\u00020\f2\b\u0010u\u001a\u0004\u0018\u00010*H\u0002Jb\u0010v\u001a\u00020r2\b\u0010s\u001a\u0004\u0018\u0001002\u0006\u0010V\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\u0006\u0010T\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\\\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010^\u001a\u00020F2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010o\u001a\u00020\f2\u0006\u0010I\u001a\u00020\fH\u0002J\u001a\u0010w\u001a\u00020r2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010x\u001a\u00020\tH\u0002J\b\u0010y\u001a\u00020rH\u0002J*\u0010z\u001a\u00020r2\u0006\u0010x\u001a\u00020\t2\u0006\u0010{\u001a\u00020\t2\u0006\u0010|\u001a\u00020\u001a2\b\u0010s\u001a\u0004\u0018\u000100H\u0002J\u0006\u0010}\u001a\u00020rJ!\u0010~\u001a\u00020r2\u0006\u0010\u007f\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0007\u0010\u0080\u0001\u001a\u00020\tH\u0002J\u001c\u0010\u0081\u0001\u001a\u00020r2\t\u0010\u0082\u0001\u001a\u0004\u0018\u0001002\b\b\u0002\u0010:\u001a\u00020\tJ\u001a\u0010\u0083\u0001\u001a\u00020(2\u0007\u0010\u0084\u0001\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020*H\u0002J\u001b\u0010\u0085\u0001\u001a\u00020(2\u0007\u0010\u0084\u0001\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020*H\u0002J\u0019\u0010\u0087\u0001\u001a\u00020r2\u0006\u0010s\u001a\u0002002\u0006\u0010X\u001a\u00020YH\u0002J\u001c\u0010\u0088\u0001\u001a\u00020r2\u0007\u0010\u0089\u0001\u001a\u00020\f2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001Jh\u0010\u008c\u0001\u001a\u00020r2\u0007\u0010\u008d\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0007\u0010\u008e\u0001\u001a\u00020F2\u0007\u0010\u008f\u0001\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0007\u0010\u0090\u0001\u001a\u00020<2\u0006\u0010s\u001a\u0002002\b\u0010`\u001a\u0004\u0018\u00010a2\u0007\u0010\u0091\u0001\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0003J,\u0010\u0092\u0001\u001a\u00020r2\u0006\u0010\u007f\u001a\u00020\t2\u0006\u0010{\u001a\u00020\t2\u0007\u0010\u0093\u0001\u001a\u00020\u001a2\b\u0010s\u001a\u0004\u0018\u000100H\u0002J\u0011\u0010\u0094\u0001\u001a\u00020r2\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001J!\u0010\u0097\u0001\u001a\u00020r2\u0006\u0010\u007f\u001a\u00020\t2\u0007\u0010\u0098\u0001\u001a\u00020\t2\u0007\u0010\u0099\u0001\u001a\u00020\tJ\u0018\u0010\u009a\u0001\u001a\u00020r2\u0006\u0010x\u001a\u00020\t2\u0007\u0010\u009b\u0001\u001a\u00020\tJ*\u0010\u009c\u0001\u001a\u00020r2\u0006\u0010s\u001a\u0002002\u0006\u0010:\u001a\u00020\t2\u0007\u0010\u009d\u0001\u001a\u00020(2\u0006\u0010t\u001a\u00020\fH\u0002R\u0019\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R#\u0010\u0019\u001a\n \r*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001f\u001a\n \r*\u0004\u0018\u00010 0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010#\u001a\n \r*\u0004\u0018\u00010$0$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010)\u001a\n \r*\u0004\u0018\u00010*0*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010-\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u000fR\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u00101\u001a\n \r*\u0004\u0018\u00010\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u00104\u001a\n \r*\u0004\u0018\u00010*0*¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0019\u00106\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000fR\u0019\u00108\u001a\n \r*\u0004\u0018\u00010*0*¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u000e\u0010:\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010;\u001a\n \r*\u0004\u0018\u00010<0<¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0019\u0010?\u001a\n \r*\u0004\u0018\u00010@0@¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0019\u0010C\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u000fR\u0019\u0010E\u001a\n \r*\u0004\u0018\u00010F0F¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0019\u0010I\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u000fR\u0019\u0010K\u001a\n \r*\u0004\u0018\u00010<0<¢\u0006\b\n\u0000\u001a\u0004\bL\u0010>R\u0019\u0010M\u001a\n \r*\u0004\u0018\u00010N0N¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0013\"\u0004\bS\u0010\u0015R\u0019\u0010T\u001a\n \r*\u0004\u0018\u00010<0<¢\u0006\b\n\u0000\u001a\u0004\bU\u0010>R\u0019\u0010V\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u000fR\u0019\u0010X\u001a\n \r*\u0004\u0018\u00010Y0Y¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0019\u0010\\\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\u000fR\u0019\u0010^\u001a\n \r*\u0004\u0018\u00010F0F¢\u0006\b\n\u0000\u001a\u0004\b_\u0010HR\u0019\u0010`\u001a\n \r*\u0004\u0018\u00010a0a¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0019\u0010d\u001a\n \r*\u0004\u0018\u00010e0e¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0019\u0010h\u001a\n \r*\u0004\u0018\u00010i0i¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u001b\u0010l\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010\u001e\u001a\u0004\bm\u0010\u0013R\u0019\u0010o\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\u000f¨\u0006\u009e\u0001"}, d2 = {"Lcom/showstartfans/activity/view/ArticleItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commNum", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getCommNum", "()Landroid/widget/TextView;", "ctx", "currentPlayPosition", "getCurrentPlayPosition", "()I", "setCurrentPlayPosition", "(I)V", "currentPosition", "getCurrentPosition", "setCurrentPosition", "currentUserId", "", "getCurrentUserId", "()Ljava/lang/String;", "currentUserId$delegate", "Lkotlin/Lazy;", "followBtn", "Lcom/showstartfans/activity/widget/FollowTextView;", "getFollowBtn", "()Lcom/showstartfans/activity/widget/FollowTextView;", "indicator", "Lcom/taihebase/activity/widget/indicator/recycleindicator/RecycleViewCircleIndicator;", "getIndicator", "()Lcom/taihebase/activity/widget/indicator/recycleindicator/RecycleViewCircleIndicator;", "isMeData", "", "layout_center", "Landroid/widget/RelativeLayout;", "getLayout_center", "()Landroid/widget/RelativeLayout;", "locMsg", "getLocMsg", "mData", "Lcom/showstartfans/activity/model/Article;", "moreMenuP", "getMoreMenuP", "()Landroid/widget/FrameLayout;", "photoItemP", "getPhotoItemP", "photoNum", "getPhotoNum", "photoVp", "getPhotoVp", h.a.a.a.a.i.g.C, "post", "Lcom/taihebase/activity/view/LoadImageView;", "getPost", "()Lcom/taihebase/activity/view/LoadImageView;", "rootP", "Landroid/widget/LinearLayout;", "getRootP", "()Landroid/widget/LinearLayout;", "sendTime", "getSendTime", "shareP", "Landroid/widget/ImageView;", "getShareP", "()Landroid/widget/ImageView;", "showType", "getShowType", "show_activity_conver", "getShow_activity_conver", "show_activity_name", "Lcom/showstartfans/activity/view/AutoScrollTextView;", "getShow_activity_name", "()Lcom/showstartfans/activity/view/AutoScrollTextView;", MessageKey.MSG_SOURCE, "getSource", "setSource", "studioLogo", "getStudioLogo", "studioName", "getStudioName", "tagP", "Landroidx/recyclerview/widget/RecyclerView;", "getTagP", "()Landroidx/recyclerview/widget/RecyclerView;", "titles", "getTitles", "userType", "getUserType", "videoP", "Landroidx/cardview/widget/CardView;", "getVideoP", "()Landroidx/cardview/widget/CardView;", "videoPlayer", "Lcom/showstartfans/activity/view/superplayer/THScenePlayerView;", "getVideoPlayer", "()Lcom/showstartfans/activity/view/superplayer/THScenePlayerView;", "vp", "Lcom/showstartfans/activity/view/RecyclerViewAtViewPager2;", "getVp", "()Lcom/showstartfans/activity/view/RecyclerViewAtViewPager2;", "widthDP", "getWidthDP", "widthDP$delegate", "zanNum", "getZanNum", "addZanLottieAnimation", "", "bean", "zanView", "parent", "bindPublicData", "displayFollowBtn", TUIConstants.TUILive.USER_ID, "initData", "reportDialog", "commId", "commContent", "resetListPlayer", "scenePrivateDialog", "id", "sceneType", "setData", "data", "setParentViewCon", "postUrl", "setParentViewPhoto", "img", "setTagView", "setText", "textView", "text", "", "setViewOnCLickCall", "locView", "shareView", "moreView", "logo", "typeCla", "showReportPop", "contentStr", "upDateView", "concernSiteBean", "Lcom/showstartfans/activity/model/AuthorInfo;", "updateSceneOnePrivate", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "privateType", "updateUserFollowStatusByList", "relationship", "zanPost", "isCollect", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ArticleItemView extends FrameLayout {
    private final CardView A;
    private final THScenePlayerView B;
    private final RelativeLayout C;
    private final AutoScrollTextView D;
    private final LoadImageView E;
    @Nullable
    private Article F;
    @Nullable
    private Context G;
    private int H;
    private int I;
    private int J;
    @NotNull
    public Map<Integer, View> b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private int f6580d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f6581e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f6582f;

    /* renamed from: g  reason: collision with root package name */
    private final LinearLayout f6583g;

    /* renamed from: h  reason: collision with root package name */
    private final ImageView f6584h;

    /* renamed from: i  reason: collision with root package name */
    private final LoadImageView f6585i;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f6586j;

    /* renamed from: k  reason: collision with root package name */
    private final TextView f6587k;

    /* renamed from: l  reason: collision with root package name */
    private final FollowTextView f6588l;

    /* renamed from: m  reason: collision with root package name */
    private final TextView f6589m;

    /* renamed from: n  reason: collision with root package name */
    private final TextView f6590n;

    /* renamed from: o  reason: collision with root package name */
    private final RecyclerView f6591o;

    /* renamed from: p  reason: collision with root package name */
    private final RelativeLayout f6592p;
    private final TextView q;
    private final TextView r;
    private final ImageView s;
    private final FrameLayout t;
    private final RecyclerViewAtViewPager2 u;
    private final TextView v;
    private final TextView w;
    private final RecycleViewCircleIndicator x;
    private final RelativeLayout y;
    private final LoadImageView z;

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function0<String> {
        public static final a INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final String invoke2() {
        }
    }

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/ArticleItemView$initData$4", "Lcom/showstartfans/activity/activitys/profile/OnRecycleItemDoubleClick;", "onItemDoubleClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements i3 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArticleItemView f6593a;

        public b(ArticleItemView articleItemView) {
        }

        @Override // h.u.a.c.l0.i3
        public void a() {
        }
    }

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "isDouble", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function2<View, Boolean, Unit> {
        public final /* synthetic */ ArticleItemView this$0;

        public c(ArticleItemView articleItemView) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
        }

        public final void invoke(@NotNull View view, boolean z) {
        }
    }

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function1<Boolean, Unit> {
        public static final d INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "path", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ Article $bean;
        public final /* synthetic */ ArticleItemView this$0;

        public e(ArticleItemView articleItemView, Article article) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ AuthorInfo $it;
        public final /* synthetic */ ArticleItemView this$0;

        public f(ArticleItemView articleItemView, AuthorInfo authorInfo) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function0<Integer> {
        public final /* synthetic */ ArticleItemView this$0;

        public g(ArticleItemView articleItemView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }
    }

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h extends Lambda implements Function1<Boolean, Unit> {
        public static final h INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: ArticleItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i extends Lambda implements Function1<Boolean, Unit> {
        public static final i INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public ArticleItemView(@NotNull Context context) {
    }

    public static /* synthetic */ void A(ArticleItemView articleItemView, int i2, Article article, View view) {
    }

    public static /* synthetic */ void B(ArticleItemView articleItemView) {
    }

    public static /* synthetic */ void C(ArticleItemView articleItemView, int i2, Article article, View view) {
    }

    public static /* synthetic */ void D(ArticleItemView articleItemView) {
    }

    public static /* synthetic */ void E(ArticleItemView articleItemView, int i2, Article article, TextView textView, View view) {
    }

    public static /* synthetic */ void F(ArticleItemView articleItemView, int i2, Article article, View view) {
    }

    public static /* synthetic */ void G(ArticleItemView articleItemView, Article article, Boolean bool) {
    }

    private final void H(int i2, int i3, String str, Article article) {
    }

    private static final void I(ArticleItemView articleItemView, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    private final void K(int i2, int i3, int i4) {
    }

    private static final void L(ArticleItemView articleItemView, int i2, int i3, View view, String str, int i4) {
    }

    public static /* synthetic */ void N(ArticleItemView articleItemView, Article article, int i2, int i3, Object obj) {
    }

    private final boolean O(String str, RelativeLayout relativeLayout) {
    }

    private final boolean P(String str, RelativeLayout relativeLayout) {
    }

    private final void Q(Article article, RecyclerView recyclerView) {
    }

    @SuppressLint({"CheckResult"})
    private final void S(TextView textView, TextView textView2, TextView textView3, ImageView imageView, FrameLayout frameLayout, FollowTextView followTextView, LoadImageView loadImageView, Article article, CardView cardView, int i2, int i3) {
    }

    private static final void T(ArticleItemView articleItemView, int i2, int i3, Article article, CardView cardView, View view) {
    }

    private static final void U(ArticleItemView articleItemView, int i2, Article article, View view) {
    }

    private static final void V(ArticleItemView articleItemView, Article article, Boolean bool) {
    }

    private static final void W(ArticleItemView articleItemView, int i2, Article article, View view) {
    }

    private static final void X(ArticleItemView articleItemView, int i2, Article article, FollowTextView followTextView, View view) {
    }

    private static final void Y(ArticleItemView articleItemView, int i2, Article article, View view) {
    }

    private static final void Z(ArticleItemView articleItemView, int i2, Article article, View view) {
    }

    private static final void a0(ArticleItemView articleItemView, int i2, Article article, TextView textView, View view) {
    }

    private final void b0(int i2, int i3, String str, Article article) {
    }

    public static final /* synthetic */ void c(ArticleItemView articleItemView, int i2, Article article, TextView textView, RelativeLayout relativeLayout) {
    }

    private static final void c0(ArticleItemView articleItemView, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    public static final /* synthetic */ Context d(ArticleItemView articleItemView) {
    }

    public static final /* synthetic */ Article e(ArticleItemView articleItemView) {
    }

    public static final /* synthetic */ int f(ArticleItemView articleItemView) {
    }

    private final void g(int i2, Article article, TextView textView, RelativeLayout relativeLayout) {
    }

    private final void g0(Article article, int i2, boolean z, TextView textView) {
    }

    private final String getCurrentUserId() {
    }

    private final int getWidthDP() {
    }

    private static final void h(LottieAnimationView lottieAnimationView, RelativeLayout relativeLayout, ValueAnimator valueAnimator) {
    }

    private final void i(Article article, TextView textView, TextView textView2, LoadImageView loadImageView, FollowTextView followTextView, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, TextView textView6, TextView textView7) {
    }

    private final void j(TextView textView, int i2) {
    }

    private final void k() {
    }

    private static final void l(ArticleItemView articleItemView) {
    }

    private static final void m(ArticleItemView articleItemView) {
    }

    private static final void n(ArticleItemView articleItemView) {
    }

    private static final void o(ArticleItemView articleItemView, int i2, int i3) {
    }

    private static final void p(ArticleItemView articleItemView, Ref.IntRef intRef, View view) {
    }

    public static /* synthetic */ void q(ArticleItemView articleItemView, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    public static /* synthetic */ void r(ArticleItemView articleItemView, int i2, int i3, View view, String str, int i4) {
    }

    public static /* synthetic */ void s(ArticleItemView articleItemView, int i2, int i3, Article article, CardView cardView, View view) {
    }

    public static /* synthetic */ void t(ArticleItemView articleItemView, int i2, int i3) {
    }

    public static /* synthetic */ void u(LottieAnimationView lottieAnimationView, RelativeLayout relativeLayout, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void v(ArticleItemView articleItemView) {
    }

    public static /* synthetic */ void w(ArticleItemView articleItemView, int i2, Article article, View view) {
    }

    public static /* synthetic */ void x(ArticleItemView articleItemView, int i2, Article article, FollowTextView followTextView, View view) {
    }

    public static /* synthetic */ void y(ArticleItemView articleItemView, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    public static /* synthetic */ void z(ArticleItemView articleItemView, Ref.IntRef intRef, View view) {
    }

    public final void J() {
    }

    public final void M(@Nullable Article article, int i2) {
    }

    public final void R(@NotNull TextView textView, @Nullable CharSequence charSequence) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void d0(@NotNull AuthorInfo authorInfo) {
    }

    public final void e0(int i2, int i3, int i4) {
    }

    public final void f0(int i2, int i3) {
    }

    public final TextView getCommNum() {
    }

    public final int getCurrentPlayPosition() {
    }

    public final int getCurrentPosition() {
    }

    public final FollowTextView getFollowBtn() {
    }

    public final RecycleViewCircleIndicator getIndicator() {
    }

    public final RelativeLayout getLayout_center() {
    }

    public final TextView getLocMsg() {
    }

    public final FrameLayout getMoreMenuP() {
    }

    public final RelativeLayout getPhotoItemP() {
    }

    public final TextView getPhotoNum() {
    }

    public final RelativeLayout getPhotoVp() {
    }

    public final LoadImageView getPost() {
    }

    public final LinearLayout getRootP() {
    }

    public final TextView getSendTime() {
    }

    public final ImageView getShareP() {
    }

    public final TextView getShowType() {
    }

    public final LoadImageView getShow_activity_conver() {
    }

    public final AutoScrollTextView getShow_activity_name() {
    }

    public final int getSource() {
    }

    public final LoadImageView getStudioLogo() {
    }

    public final TextView getStudioName() {
    }

    public final RecyclerView getTagP() {
    }

    public final TextView getTitles() {
    }

    public final ImageView getUserType() {
    }

    public final CardView getVideoP() {
    }

    public final THScenePlayerView getVideoPlayer() {
    }

    public final RecyclerViewAtViewPager2 getVp() {
    }

    public final TextView getZanNum() {
    }

    public final void setCurrentPlayPosition(int i2) {
    }

    public final void setCurrentPosition(int i2) {
    }

    public final void setSource(int i2) {
    }

    public ArticleItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ArticleItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
