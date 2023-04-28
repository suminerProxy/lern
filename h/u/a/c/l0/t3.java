package h.u.a.c.l0;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.facebook.drawee.view.SimpleDraweeView;
import com.showstartfans.activity.eventmodel.SceneRemoveIndexEvent;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.AuthorInfo;
import com.showstartfans.activity.view.ArticleShowLocalView;
import com.showstartfans.activity.view.CustomTextView;
import com.showstartfans.activity.view.ItemShunJianView;
import com.showstartfans.activity.view.UserLevelView;
import com.showstartfans.activity.widget.FollowView;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.view.svg.SvgImageView;
import com.taihebase.activity.widget.indicator.AutoHideInkPageIndicator2;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SceneShowAdapter.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0086\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010(\u001a\u00020)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+H\u0016J*\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002JZ\u00103\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010\u00022\u0006\u00104\u001a\u0002002\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u0002002\u0006\u0010=\u001a\u0002002\u0006\u0010>\u001a\u0002002\u0006\u0010-\u001a\u00020\u0007H\u0002J\u001e\u0010?\u001a\u00020)2\n\u0010@\u001a\u00060\u001eR\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u001a\u0010B\u001a\u00020)2\b\u00108\u001a\u0004\u0018\u0001002\u0006\u0010C\u001a\u00020\u0007H\u0002J\u0014\u0010D\u001a\b\u0018\u00010\u001eR\u00020\u00002\u0006\u0010-\u001a\u00020\u0007J\u0018\u0010E\u001a\u00020)2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0007H\u0002J\u000e\u0010G\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010H\u001a\u00020)2\u0006\u0010I\u001a\u00020JH\u0016J*\u0010K\u001a\u00020)2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0007H\u0014J\u001a\u0010P\u001a\u00020M2\b\u00101\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020\u0007H\u0014J\u0006\u0010S\u001a\u00020)J\u0012\u0010T\u001a\u00020)2\b\u0010U\u001a\u0004\u0018\u00010VH\u0007J\u0012\u0010T\u001a\u00020)2\b\u0010U\u001a\u0004\u0018\u00010WH\u0007J\u0012\u0010T\u001a\u00020)2\b\u0010U\u001a\u0004\u0018\u00010XH\u0007J\u0006\u0010Y\u001a\u00020)J\u0006\u0010Z\u001a\u00020)J\u0006\u0010[\u001a\u00020)J\u0006\u0010\\\u001a\u00020\u001bJ\u0016\u0010]\u001a\u00020)2\u0006\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0007J\u0010\u0010`\u001a\u00020)2\u0006\u0010_\u001a\u00020\u0007H\u0002J*\u0010a\u001a\u00020)2\u0006\u0010C\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010d\u001a\u00020)J\u0006\u0010e\u001a\u00020)J\u001e\u0010f\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007J \u0010g\u001a\u00020)2\u0006\u0010^\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u0007H\u0002J\u0018\u0010i\u001a\u00020)2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010j\u001a\u00020JH\u0002JJ\u0010k\u001a\u00020)2\u0006\u0010/\u001a\u0002002\u0006\u0010<\u001a\u0002002\u0006\u0010l\u001a\u00020;2\u0006\u0010m\u001a\u00020n2\u0006\u0010.\u001a\u00020\u00022\b\u0010o\u001a\u0004\u0018\u00010p2\u0006\u0010q\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0003J*\u0010r\u001a\u00020)2\u0006\u0010^\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u00072\u0006\u0010s\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010t\u001a\u00020)2\u0006\u0010u\u001a\u00020vJ\u0018\u0010w\u001a\u00020)2\u0006\u0010.\u001a\u00020\u00022\b\u0010x\u001a\u0004\u0018\u00010yJ \u0010z\u001a\u00020)2\u0006\u0010^\u001a\u00020\u00072\u0006\u0010{\u001a\u00020\u00072\b\u0010|\u001a\u0004\u0018\u00010\u0014J\u001e\u0010}\u001a\u00020)2\u0006\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u0007J \u0010\u007f\u001a\u00020)2\u0006\u0010^\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u00072\u0007\u0010\u0081\u0001\u001a\u00020\u0007J\u0018\u0010\u0082\u0001\u001a\u00020)2\u0006\u0010C\u001a\u00020\u00072\u0007\u0010\u0083\u0001\u001a\u00020\u0007J*\u0010\u0084\u0001\u001a\u00020)2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u001b2\u0006\u0010/\u001a\u000200H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR#\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\u001c\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u001eR\u00020\u00000\u001dj\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u001eR\u00020\u0000`\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000f¨\u0006\u0087\u0001"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter;", "Lcom/showstartfans/activity/model/Article;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TYPE_PHOTO", "", "TYPE_VIDEO", "TYPE_VP_PHOTO", "contentMaxLine", "currentPlayPosition", "getCurrentPlayPosition", "()I", "setCurrentPlayPosition", "(I)V", "currentPosition", "getCurrentPosition", "setCurrentPosition", "currentUserId", "", "kotlin.jvm.PlatformType", "getCurrentUserId", "()Ljava/lang/String;", "currentUserId$delegate", "Lkotlin/Lazy;", "isMeData", "", "itemMap", "Ljava/util/HashMap;", "Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter$ViewVHolder;", "Lkotlin/collections/HashMap;", "showFirstLine", "getShowFirstLine", "()Z", "setShowFirstLine", "(Z)V", MessageKey.MSG_SOURCE, "getSource", "setSource", "addAll", "", "newData", "", "addZanLottieAnimation", h.a.a.a.a.i.g.C, "bean", "zanView", "Landroid/widget/TextView;", "parent", "Landroid/widget/RelativeLayout;", "bindPublicData", "studioName", "sendTime", "studioLogo", "Lcom/taihebase/activity/view/LoadImageView;", "followBtn", "Lcom/showstartfans/activity/widget/FollowView;", "userType", "Landroid/widget/ImageView;", "commNum", "zanNum", "showType", "checkContent", "holder", "checkSunJianPlay", "displayFollowBtn", TUIConstants.TUILive.USER_ID, "getViewHolderByIndex", "gotoDetails", "real_position", "isMe", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder_impl", "mholder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemType", "original_position", "onCreateViewHolder_impl", "Landroid/view/ViewGroup;", "viewType", "onDestory", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/SceneRemoveIndexEvent;", "Lcom/showstartfans/activity/model/ArticleImmersinPraiseEvent;", "Lcom/showstartfans/activity/model/UserFollowStatusEvent;", "onPauseScene", "onResumeScene", "playerBackFullScreen", "playerIsFullScreen", "removeItemByIdIndex", "id", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "removeItemScene", "reportDialog", "commId", "commContent", "resetListPlayer", "resetPlayer", h.a.a.a.a.i.g.L, "scenePrivateDialog", "sceneType", "setTagView", "tagP", "setViewOnCLickCall", "shareView", "moreView", "Landroid/widget/FrameLayout;", "videoP", "Landroidx/cardview/widget/CardView;", "typeCla", "showReportPop", "contentStr", "upDateView", "concernSiteBean", "Lcom/showstartfans/activity/model/AuthorInfo;", "updateComm", "commP", "Landroid/widget/LinearLayout;", "updateSceneOneComm", "commNewId", "commNewContent", "updateSceneOnePrivate", "privateType", "updateSceneOneZanStatus", "ding", "dingCount", "updateUserFollowStatusByList", "relationship", "zanPost", "isCollect", "ViewVHolder", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class t3 extends h.y.a.f.m<Article> {

    /* renamed from: n  reason: collision with root package name */
    private final int f19499n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f19500o;

    /* renamed from: p  reason: collision with root package name */
    private final int f19501p;
    private final int q;
    private final int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    @NotNull
    private final HashMap<Integer, a> w;
    @NotNull
    private final Lazy x;

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010b\u001a\u00020cH\u0016J\b\u0010d\u001a\u00020cH\u0016R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u00130\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00170\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u001b0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n \u0007*\u0004\u0018\u00010\u001b0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010 \u001a\n \u0007*\u0004\u0018\u00010!0!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010$\u001a\n \u0007*\u0004\u0018\u00010%0%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010(\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\rR\u0019\u0010*\u001a\n \u0007*\u0004\u0018\u00010\u001b0\u001b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0019\u0010,\u001a\n \u0007*\u0004\u0018\u00010!0!¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0019\u0010.\u001a\n \u0007*\u0004\u0018\u00010/0/¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u00102\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\rR\u0019\u00104\u001a\n \u0007*\u0004\u0018\u00010505¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0019\u00108\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\rR\u0019\u0010:\u001a\n \u0007*\u0004\u0018\u00010;0;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0019\u0010>\u001a\n \u0007*\u0004\u0018\u00010?0?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0019\u0010B\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\rR\u0019\u0010D\u001a\n \u0007*\u0004\u0018\u00010E0E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0019\u0010H\u001a\n \u0007*\u0004\u0018\u00010I0I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0019\u0010L\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\rR\u0019\u0010N\u001a\n \u0007*\u0004\u0018\u00010O0O¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0019\u0010R\u001a\n \u0007*\u0004\u0018\u00010505¢\u0006\b\n\u0000\u001a\u0004\bS\u00107R\u0019\u0010T\u001a\n \u0007*\u0004\u0018\u00010U0U¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0019\u0010X\u001a\n \u0007*\u0004\u0018\u00010Y0Y¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0019\u0010\\\u001a\n \u0007*\u0004\u0018\u00010]0]¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0019\u0010`\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\ba\u0010\r¨\u0006e"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter$ViewVHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/taihebase/activity/view/itemTouch/ItemTouchHelperViewHolder;", "view", "Landroid/view/View;", "(Lcom/showstartfans/activity/activitys/profile/SceneShowAdapter;Landroid/view/View;)V", "VLine", "kotlin.jvm.PlatformType", "getVLine", "()Landroid/view/View;", "commNum", "Landroid/widget/TextView;", "getCommNum", "()Landroid/widget/TextView;", "followBtn", "Lcom/showstartfans/activity/widget/FollowView;", "getFollowBtn", "()Lcom/showstartfans/activity/widget/FollowView;", "indicator", "Lcom/taihebase/activity/widget/indicator/AutoHideInkPageIndicator2;", "getIndicator", "()Lcom/taihebase/activity/widget/indicator/AutoHideInkPageIndicator2;", "item_ShunJian", "Lcom/showstartfans/activity/view/ItemShunJianView;", "getItem_ShunJian", "()Lcom/showstartfans/activity/view/ItemShunJianView;", "layout_ShunJian", "Landroid/widget/RelativeLayout;", "getLayout_ShunJian", "()Landroid/widget/RelativeLayout;", "layout_center", "getLayout_center", "layout_show_all", "Landroid/widget/LinearLayout;", "getLayout_show_all", "()Landroid/widget/LinearLayout;", "moreMenuP", "Landroid/widget/FrameLayout;", "getMoreMenuP", "()Landroid/widget/FrameLayout;", "photoNum", "getPhotoNum", "photoVp", "getPhotoVp", "rootP", "getRootP", "sdv_video_conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "getSdv_video_conver", "()Lcom/facebook/drawee/view/SimpleDraweeView;", "sendTime", "getSendTime", "shareP", "Landroid/widget/ImageView;", "getShareP", "()Landroid/widget/ImageView;", "showType", "getShowType", "siv_arrow", "Lcom/taihebase/activity/view/svg/SvgImageView;", "getSiv_arrow", "()Lcom/taihebase/activity/view/svg/SvgImageView;", "studioLogo", "Lcom/taihebase/activity/view/LoadImageView;", "getStudioLogo", "()Lcom/taihebase/activity/view/LoadImageView;", "studioName", "getStudioName", "tagP", "Landroidx/recyclerview/widget/RecyclerView;", "getTagP", "()Landroidx/recyclerview/widget/RecyclerView;", "titles", "Lcom/showstartfans/activity/view/CustomTextView;", "getTitles", "()Lcom/showstartfans/activity/view/CustomTextView;", "tv_show_all", "getTv_show_all", "userLevel", "Lcom/showstartfans/activity/view/UserLevelView;", "getUserLevel", "()Lcom/showstartfans/activity/view/UserLevelView;", "userType", "getUserType", "videoP", "Landroidx/cardview/widget/CardView;", "getVideoP", "()Landroidx/cardview/widget/CardView;", "view_show_local", "Lcom/showstartfans/activity/view/ArticleShowLocalView;", "getView_show_local", "()Lcom/showstartfans/activity/view/ArticleShowLocalView;", "vp_img", "Landroidx/viewpager/widget/ViewPager;", "getVp_img", "()Landroidx/viewpager/widget/ViewPager;", "zanNum", "getZanNum", "onItemClear", "", "onItemSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends RecyclerView.ViewHolder implements h.y.a.o.z.b {
        private final View A;
        private final UserLevelView B;
        public final /* synthetic */ t3 C;

        /* renamed from: a  reason: collision with root package name */
        private final LinearLayout f19502a;
        private final ImageView b;
        private final LoadImageView c;

        /* renamed from: d  reason: collision with root package name */
        private final TextView f19503d;

        /* renamed from: e  reason: collision with root package name */
        private final TextView f19504e;

        /* renamed from: f  reason: collision with root package name */
        private final FollowView f19505f;

        /* renamed from: g  reason: collision with root package name */
        private final CustomTextView f19506g;

        /* renamed from: h  reason: collision with root package name */
        private final RecyclerView f19507h;

        /* renamed from: i  reason: collision with root package name */
        private final RelativeLayout f19508i;

        /* renamed from: j  reason: collision with root package name */
        private final TextView f19509j;

        /* renamed from: k  reason: collision with root package name */
        private final TextView f19510k;

        /* renamed from: l  reason: collision with root package name */
        private final ImageView f19511l;

        /* renamed from: m  reason: collision with root package name */
        private final FrameLayout f19512m;

        /* renamed from: n  reason: collision with root package name */
        private final ViewPager f19513n;

        /* renamed from: o  reason: collision with root package name */
        private final TextView f19514o;

        /* renamed from: p  reason: collision with root package name */
        private final TextView f19515p;
        private final AutoHideInkPageIndicator2 q;
        private final CardView r;
        private final SimpleDraweeView s;
        private final ArticleShowLocalView t;
        private final RelativeLayout u;
        private final ItemShunJianView v;
        private final RelativeLayout w;
        private final TextView x;
        private final LinearLayout y;
        private final SvgImageView z;

        public a(@NotNull t3 t3Var, View view) {
        }

        public final CardView A() {
        }

        public final ArticleShowLocalView B() {
        }

        public final ViewPager C() {
        }

        public final TextView D() {
        }

        @Override // h.y.a.o.z.b
        public void a() {
        }

        @Override // h.y.a.o.z.b
        public void b() {
        }

        public final TextView c() {
        }

        public final FollowView d() {
        }

        public final AutoHideInkPageIndicator2 e() {
        }

        public final ItemShunJianView f() {
        }

        public final RelativeLayout g() {
        }

        public final RelativeLayout h() {
        }

        public final LinearLayout i() {
        }

        public final FrameLayout j() {
        }

        public final TextView k() {
        }

        public final RelativeLayout l() {
        }

        public final LinearLayout m() {
        }

        public final SimpleDraweeView n() {
        }

        public final TextView o() {
        }

        public final ImageView p() {
        }

        public final TextView q() {
        }

        public final SvgImageView r() {
        }

        public final LoadImageView s() {
        }

        public final TextView t() {
        }

        public final RecyclerView u() {
        }

        public final CustomTextView v() {
        }

        public final TextView w() {
        }

        public final UserLevelView x() {
        }

        public final ImageView y() {
        }

        public final View z() {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0001j\u0002`\nJ!\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/profile/SceneShowAdapter$bindPublicData$1", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "success", "isFollow", "", "newRelationship", "", "Lcom/showstartfans/activity/widget/OnFollowListener;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements Function3<Boolean, Boolean, Integer, Unit> {
        public final /* synthetic */ Article b;
        public final /* synthetic */ t3 c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f19516d;

        public b(Article article, t3 t3Var, int i2) {
        }

        public void a(boolean z, boolean z2, int i2) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Integer num) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ a $holder;

        public c(a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends Lambda implements Function0<String> {
        public static final d INSTANCE = null;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final String invoke2() {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/profile/SceneShowAdapter$onAttachedToRecyclerView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t3 f19517a;

        public e(t3 t3Var) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ int $real_position;
        public final /* synthetic */ t3 this$0;

        public f(t3 t3Var, int i2) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class g extends Lambda implements Function1<Integer, Boolean> {
        public final /* synthetic */ Article $bean;
        public final /* synthetic */ t3 this$0;

        public g(t3 t3Var, Article article) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        }

        @NotNull
        public final Boolean invoke(int i2) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/profile/SceneShowAdapter$onBindViewHolder_impl$3", "Lcom/showstartfans/activity/activitys/profile/OnRecycleItemDoubleClick;", "onItemDoubleClick", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class h implements i3 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t3 f19518a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Article c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f19519d;

        public h(t3 t3Var, int i2, Article article, a aVar) {
        }

        @Override // h.u.a.c.l0.i3
        public void a() {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/profile/SceneShowAdapter$onBindViewHolder_impl$4", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", h.a.a.a.a.i.g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class i implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ a b;
        public final /* synthetic */ Integer c;

        public i(a aVar, Integer num) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "isDouble", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class j extends Lambda implements Function2<View, Boolean, Unit> {
        public final /* synthetic */ Article $bean;
        public final /* synthetic */ a $holder;
        public final /* synthetic */ int $real_position;
        public final /* synthetic */ t3 this$0;

        public j(t3 t3Var, int i2, Article article, a aVar) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
        }

        public final void invoke(@NotNull View view, boolean z) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class k extends Lambda implements Function1<Boolean, Unit> {
        public static final k INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "path", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class l extends Lambda implements Function1<String, Unit> {
        public final /* synthetic */ Article $bean;
        public final /* synthetic */ t3 this$0;

        public l(t3 t3Var, Article article) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String str) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class m extends Lambda implements Function1<Boolean, Unit> {
        public static final m INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: SceneShowAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class n extends Lambda implements Function1<Boolean, Unit> {
        public static final n INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public t3(@NotNull Context context) {
    }

    private final void G0(int i2) {
    }

    private final void H0(int i2, int i3, String str, Article article) {
    }

    private static final void I0(t3 t3Var, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    private final void M0(int i2, int i3, int i4) {
    }

    private static final void N0(t3 t3Var, int i2, int i3, View view, String str, int i4) {
    }

    public static final /* synthetic */ void Q(t3 t3Var, int i2, Article article, TextView textView, RelativeLayout relativeLayout) {
    }

    public static final /* synthetic */ void R(t3 t3Var) {
    }

    public static final /* synthetic */ Context S(t3 t3Var) {
    }

    private final void S0(Article article, RecyclerView recyclerView) {
    }

    private static final void T(t3 t3Var, Object obj) {
    }

    @SuppressLint({"CheckResult"})
    private final void T0(TextView textView, TextView textView2, ImageView imageView, FrameLayout frameLayout, Article article, CardView cardView, int i2, int i3) {
    }

    private final void U(int i2, Article article, TextView textView, RelativeLayout relativeLayout) {
    }

    private static final void U0(t3 t3Var, int i2, Article article, TextView textView, View view) {
    }

    private static final void V(LottieAnimationView lottieAnimationView, RelativeLayout relativeLayout, ValueAnimator valueAnimator) {
    }

    private static final void V0(t3 t3Var, int i2, Article article, View view) {
    }

    private final void W(Article article, TextView textView, TextView textView2, LoadImageView loadImageView, FollowView followView, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, int i2) {
    }

    private static final void W0(t3 t3Var, Article article, Boolean bool) {
    }

    private final void X(a aVar, Article article) {
    }

    private static final void X0(t3 t3Var, int i2, Article article, View view) {
    }

    private static final void Y(t3 t3Var, Article article, View view) {
    }

    private final void Y0(int i2, int i3, String str, Article article) {
    }

    private static final void Z(a aVar, t3 t3Var, Article article, View view) {
    }

    private static final void Z0(t3 t3Var, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    private final void a0() {
    }

    private final void b0(TextView textView, int i2) {
    }

    private final String d0() {
    }

    private final void g1(Article article, int i2, boolean z, TextView textView) {
    }

    private final void h0(Article article, int i2) {
    }

    public static /* synthetic */ void j0(t3 t3Var, int i2, Article article, a aVar, View view) {
    }

    public static /* synthetic */ void k0(t3 t3Var, int i2, int i3, View view, String str, int i4) {
    }

    public static /* synthetic */ void l0(t3 t3Var, Article article, Boolean bool) {
    }

    public static /* synthetic */ void m0(t3 t3Var, int i2, Article article, TextView textView, View view) {
    }

    public static /* synthetic */ void n0(t3 t3Var, int i2, Article article, View view) {
    }

    public static /* synthetic */ void o0(t3 t3Var, Article article, int i2, View view) {
    }

    public static /* synthetic */ void p0(t3 t3Var, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    public static /* synthetic */ void q0(LottieAnimationView lottieAnimationView, RelativeLayout relativeLayout, ValueAnimator valueAnimator) {
    }

    public static /* synthetic */ void r0(t3 t3Var, int i2, Article article, View view) {
    }

    public static /* synthetic */ void s0(a aVar, t3 t3Var, Article article, View view) {
    }

    public static /* synthetic */ void t0(t3 t3Var, int i2, int i3, String str, Article article, View view, String str2, int i4) {
    }

    public static /* synthetic */ void u0(t3 t3Var, Article article, View view) {
    }

    public static /* synthetic */ void v0(t3 t3Var, Object obj) {
    }

    public static /* synthetic */ void w0(t3 t3Var, Article article, int i2, View view) {
    }

    private static final void x0(t3 t3Var, int i2, Article article, a aVar, View view) {
    }

    private static final void y0(t3 t3Var, Article article, int i2, View view) {
    }

    private static final void z0(t3 t3Var, Article article, int i2, View view) {
    }

    public final void A0() {
    }

    public final void B0() {
    }

    @Override // h.y.a.f.m
    @NotNull
    public RecyclerView.ViewHolder C(@Nullable ViewGroup viewGroup, int i2) {
    }

    public final void C0() {
    }

    public final void D0() {
    }

    public final boolean E0() {
    }

    public final void F0(int i2, int i3) {
    }

    public final void J0() {
    }

    public final void K0() {
    }

    public final void L0(@NotNull Context context, int i2, int i3) {
    }

    public final void O0(int i2) {
    }

    public final void P0(int i2) {
    }

    public final void Q0(boolean z) {
    }

    public final void R0(int i2) {
    }

    public final void a1(@NotNull AuthorInfo authorInfo) {
    }

    @Override // h.y.a.f.m
    public void addAll(@Nullable List<? extends Article> list) {
    }

    public final void b1(@NotNull Article article, @Nullable LinearLayout linearLayout) {
    }

    public final int c0() {
    }

    public final void c1(int i2, int i3, @Nullable String str) {
    }

    public final void d1(int i2, int i3, int i4) {
    }

    public final boolean e0() {
    }

    public final void e1(int i2, int i3, int i4) {
    }

    public final int f0() {
    }

    public final void f1(int i2, int i3) {
    }

    @Nullable
    public final a g0(int i2) {
    }

    public final int getCurrentPosition() {
    }

    public final void i0(boolean z) {
    }

    @Override // h.y.a.f.m, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.a aVar) {
    }

    @Override // h.y.a.f.m
    public void z(@Nullable RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable h.u.a.o.d0 d0Var) {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable SceneRemoveIndexEvent sceneRemoveIndexEvent) {
    }
}
