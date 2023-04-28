package com.showstartfans.activity.activitys.profile;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.showstartfans.activity.view.superplayer.THScenePlayerView;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.view.MultiTouchViewPager;
import com.taihebase.activity.widget.indicator.AutoHideInkPageIndicator2;
import com.tencent.qcloud.tuicore.TUIConstants;
import h.a.a.a.a.i.g;
import h.u.a.w.d0.d2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseScenePostDetailActivity.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000 T2\u00020\u0001:\u0001TB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010<\u001a\u00020=H$J\u0012\u0010>\u001a\u00020=2\b\u0010\u0003\u001a\u0004\u0018\u00010?H&J\u0018\u0010@\u001a\u00020=2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0016H&J\u0010\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020\u0016H\u0016J\u001e\u0010F\u001a\u00020=2\u0006\u0010G\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020=J\u0018\u0010L\u001a\u00020=2\u0006\u0010E\u001a\u00020\u00162\b\u0010M\u001a\u0004\u0018\u00010\"J\"\u0010N\u001a\u00020=2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010O\u001a\u00020\u00162\b\b\u0002\u0010P\u001a\u00020JJ \u0010Q\u001a\u00020=2\u0006\u0010E\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\u00162\u0006\u0010R\u001a\u00020JH\u0002J\u0010\u0010S\u001a\u00020=2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R\u001a\u00100\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010 ¨\u0006U"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/BaseScenePostDetailActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "bean", "Lcom/showstartfans/activity/model/Article;", "getBean", "()Lcom/showstartfans/activity/model/Article;", "setBean", "(Lcom/showstartfans/activity/model/Article;)V", "imgView", "Lcom/taihebase/activity/view/LoadImageView;", "getImgView", "()Lcom/taihebase/activity/view/LoadImageView;", "setImgView", "(Lcom/taihebase/activity/view/LoadImageView;)V", "indicator", "Lcom/taihebase/activity/widget/indicator/AutoHideInkPageIndicator2;", "getIndicator", "()Lcom/taihebase/activity/widget/indicator/AutoHideInkPageIndicator2;", "setIndicator", "(Lcom/taihebase/activity/widget/indicator/AutoHideInkPageIndicator2;)V", "listPoi", "", "getListPoi", "()I", "setListPoi", "(I)V", "oneCar", "Landroidx/cardview/widget/CardView;", "getOneCar", "()Landroidx/cardview/widget/CardView;", "setOneCar", "(Landroidx/cardview/widget/CardView;)V", "photoNumPager", "Landroid/widget/TextView;", "getPhotoNumPager", "()Landroid/widget/TextView;", "setPhotoNumPager", "(Landroid/widget/TextView;)V", "player", "Lcom/showstartfans/activity/view/superplayer/THScenePlayerView;", "getPlayer", "()Lcom/showstartfans/activity/view/superplayer/THScenePlayerView;", "setPlayer", "(Lcom/showstartfans/activity/view/superplayer/THScenePlayerView;)V", "playerParent", "getPlayerParent", "setPlayerParent", "sceneId", "getSceneId", "setSceneId", "viewPager", "Lcom/taihebase/activity/view/MultiTouchViewPager;", "getViewPager", "()Lcom/taihebase/activity/view/MultiTouchViewPager;", "setViewPager", "(Lcom/taihebase/activity/view/MultiTouchViewPager;)V", "vpParent", "getVpParent", "setVpParent", "OnAutoPullDown", "", "onAddNewComment", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "onChangeZanStatus", "isCollect", "", "zanNum", "onDeleteScene", "id", "reportDialog", TUIConstants.TUILive.USER_ID, "commId", "commContent", "", "resetInfo", "scenePrivateDialog", "txtView", "sendCommDialog", g.C, "hiht", "showReportPop", "contentStr", "zanPost", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class BaseScenePostDetailActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public static final a f6194n = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Article f6195d;

    /* renamed from: e  reason: collision with root package name */
    private int f6196e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private CardView f6197f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private THScenePlayerView f6198g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private AutoHideInkPageIndicator2 f6199h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private MultiTouchViewPager f6200i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private TextView f6201j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private CardView f6202k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private CardView f6203l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private LoadImageView f6204m;

    /* compiled from: BaseScenePostDetailActivity.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0007J@\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u0014"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/BaseScenePostDetailActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/app/Activity;", "id", "", "startPhoto", "typeCla", "", "bean", "Lcom/showstartfans/activity/model/Article;", "listPoi", "startVideo", "videoP", "Landroidx/cardview/widget/CardView;", "globalPlayer", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void c(a aVar, Activity activity, int i2, Article article, int i3, int i4, Object obj) {
        }

        public static /* synthetic */ void e(a aVar, Activity activity, int i2, Article article, int i3, CardView cardView, boolean z, int i4, Object obj) {
        }

        public final void a(@Nullable Activity activity, @NotNull String str) {
        }

        @JvmStatic
        public final void b(@Nullable Activity activity, int i2, @NotNull Article article, int i3) {
        }

        @JvmStatic
        public final void d(@Nullable Activity activity, int i2, @NotNull Article article, int i3, @Nullable CardView cardView, boolean z) {
        }
    }

    /* compiled from: BaseScenePostDetailActivity.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u000026\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001j\u0002`\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/profile/BaseScenePostDetailActivity$reportDialog$1", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "success", "", h.c.a.a.a.f16081l, "", "Lcom/showstartfans/activity/utils/OnReportDialogCallBack;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements Function2<Boolean, Integer, Unit> {
        public final /* synthetic */ BaseScenePostDetailActivity b;

        public b(BaseScenePostDetailActivity baseScenePostDetailActivity) {
        }

        public void a(boolean z, int i2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num) {
        }
    }

    /* compiled from: BaseScenePostDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ int $id;
        public final /* synthetic */ BaseScenePostDetailActivity this$0;

        public c(BaseScenePostDetailActivity baseScenePostDetailActivity, int i2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: BaseScenePostDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/profile/BaseScenePostDetailActivity$sendCommDialog$1", "Lcom/showstartfans/activity/widget/popupwindow/OnDanmuInputCall;", "onDanmuInputCall", "", "inputStr", "", "onDanmuInputDismiss", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements d2 {
        public final /* synthetic */ BaseScenePostDetailActivity b;
        public final /* synthetic */ Article c;

        /* compiled from: BaseScenePostDetailActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ Article $bean;
            public final /* synthetic */ String $inputStr;
            public final /* synthetic */ BaseScenePostDetailActivity this$0;

            public a(Article article, String str, BaseScenePostDetailActivity baseScenePostDetailActivity) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            }

            public final void invoke(int i2) {
            }
        }

        public d(BaseScenePostDetailActivity baseScenePostDetailActivity, Article article) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputCall(@NotNull String str) {
        }

        @Override // h.u.a.w.d0.d2
        public void onDanmuInputDismiss() {
        }
    }

    /* compiled from: BaseScenePostDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.IntRef $dingCount;
        public final /* synthetic */ boolean $isCollect;
        public final /* synthetic */ BaseScenePostDetailActivity this$0;

        public e(BaseScenePostDetailActivity baseScenePostDetailActivity, boolean z, Ref.IntRef intRef) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    /* compiled from: BaseScenePostDetailActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class f extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Ref.IntRef $dingCount;
        public final /* synthetic */ boolean $isCollect;
        public final /* synthetic */ BaseScenePostDetailActivity this$0;

        public f(BaseScenePostDetailActivity baseScenePostDetailActivity, boolean z, Ref.IntRef intRef) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }

        public final void invoke(boolean z) {
        }
    }

    public static /* synthetic */ void J(BaseScenePostDetailActivity baseScenePostDetailActivity, int i2, TextView textView, View view, String str, int i3) {
    }

    public static /* synthetic */ void K(BaseScenePostDetailActivity baseScenePostDetailActivity, int i2, int i3, View view, String str, int i4) {
    }

    private static final void R(BaseScenePostDetailActivity baseScenePostDetailActivity, int i2, TextView textView, View view, String str, int i3) {
    }

    public static /* synthetic */ void T(BaseScenePostDetailActivity baseScenePostDetailActivity, Article article, int i2, String str, int i3, Object obj) {
    }

    private final void f0(int i2, int i3, String str) {
    }

    private static final void g0(BaseScenePostDetailActivity baseScenePostDetailActivity, int i2, int i3, View view, String str, int i4) {
    }

    @JvmStatic
    public static final void h0(@Nullable Activity activity, int i2, @NotNull Article article, int i3) {
    }

    @JvmStatic
    public static final void i0(@Nullable Activity activity, int i2, @NotNull Article article, int i3, @Nullable CardView cardView, boolean z) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity x(BaseScenePostDetailActivity baseScenePostDetailActivity) {
    }

    @Nullable
    public final AutoHideInkPageIndicator2 A() {
    }

    public final int B() {
    }

    @Nullable
    public final CardView C() {
    }

    @Nullable
    public final TextView D() {
    }

    @Nullable
    public final THScenePlayerView E() {
    }

    @Nullable
    public final CardView F() {
    }

    public final int G() {
    }

    @Nullable
    public final MultiTouchViewPager H() {
    }

    @Nullable
    public final CardView I() {
    }

    public abstract void L(@Nullable SceneDetailCommBean sceneDetailCommBean);

    public abstract void M(boolean z, int i2);

    public void N(int i2) {
    }

    public final void O(int i2, int i3, @NotNull String str) {
    }

    public final void P() {
    }

    public final void Q(int i2, @Nullable TextView textView) {
    }

    public final void S(@Nullable Article article, int i2, @NotNull String str) {
    }

    public final void U(@Nullable Article article) {
    }

    public final void V(@Nullable LoadImageView loadImageView) {
    }

    public final void W(@Nullable AutoHideInkPageIndicator2 autoHideInkPageIndicator2) {
    }

    public final void X(int i2) {
    }

    public final void Y(@Nullable CardView cardView) {
    }

    public final void Z(@Nullable TextView textView) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void a0(@Nullable THScenePlayerView tHScenePlayerView) {
    }

    public final void b0(@Nullable CardView cardView) {
    }

    public final void c0(int i2) {
    }

    public final void d0(@Nullable MultiTouchViewPager multiTouchViewPager) {
    }

    public final void e0(@Nullable CardView cardView) {
    }

    public final void j0(@Nullable Article article) {
    }

    public abstract void w();

    @Nullable
    public final Article y() {
    }

    @Nullable
    public final LoadImageView z() {
    }
}
