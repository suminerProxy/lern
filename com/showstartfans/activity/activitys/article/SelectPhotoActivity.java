package com.showstartfans.activity.activitys.article;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.sdk.widget.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.gatewayauth.Constant;
import com.showstartfans.activity.model.PublishArticleBean;
import com.taihe.photoselector.model.PhotoModel;
import com.taihe.photoselector.ui.PhotoSelectorActivity;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.a.a.a.a.i.g;
import h.u.a.c.w.t1;
import h.u.a.c.w.y1;
import h.u.a.g.t4;
import h.u.a.u.f4.d;
import h.x.e.d.k;
import h.y.a.f.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectPhotoActivity.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002PQB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020.H\u0002J\u0006\u0010/\u001a\u00020.J\u0010\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020.H\u0002J\u0010\u00103\u001a\u00020.2\u0006\u00104\u001a\u00020\u0005H\u0002J\b\u00105\u001a\u00020.H\u0002J\u0018\u00106\u001a\u00020.2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002J\b\u00108\u001a\u00020.H\u0016J\b\u00109\u001a\u00020.H\u0014J\u0012\u00109\u001a\u00020.2\b\u0010:\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010;\u001a\u00020.H\u0014J\b\u0010<\u001a\u00020.H\u0014J.\u0010=\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u00010\f2\u001a\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0015H\u0002J\b\u0010@\u001a\u00020.H\u0003J\b\u0010A\u001a\u00020\u0017H\u0016J\"\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010EH\u0014J\b\u0010F\u001a\u00020.H\u0016J\b\u0010G\u001a\u00020.H\u0014J\b\u0010H\u001a\u00020IH\u0014J\u0010\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020\u0005H\u0002J\u0010\u0010L\u001a\u00020.2\u0006\u0010M\u001a\u00020\u0005H\u0002J\b\u0010N\u001a\u00020.H\u0002J\b\u0010O\u001a\u00020.H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0014j\b\u0012\u0004\u0012\u00020\f`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006R"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "Lcom/taihebase/activity/base/NewBaseRecycleAdapter$OnItemClickListener;", "()V", "PhotoMaxCount", "", "albumAdapter", "Lcom/showstartfans/activity/activitys/article/PhotoAlbumAdapter;", "albumListener", "Lcom/taihe/photoselector/ui/PhotoSelectorActivity$OnLocalAlbumListener;", "alreadyDatas", "", "Lcom/taihe/photoselector/model/PhotoModel;", "binding", "Lcom/showstartfans/activity/databinding/ActivitySelectPhotoBinding;", "checkAlbumName", "", "folderSelect", "Lcom/taihe/photoselector/ui/SlidedownView;", "goodPhotoList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "hasGood", "", "hasTake", "isFromAuto", "isSingle", "lastAlbumIndex", "lvAblum", "Landroidx/recyclerview/widget/RecyclerView;", "mBean", "Lcom/showstartfans/activity/model/PublishArticleBean;", "mBuilder", "Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;", "mMode", "mTabIndex", "maxSelectVideoTime", "photoAdapter", "Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter;", "photoSelectorDomain", "Lcom/taihe/photoselector/domain/PhotoSelectorDomain;", "reccentListener", "Lcom/taihe/photoselector/ui/PhotoSelectorActivity$OnLocalReccentListener;", "getReccentListener", "()Lcom/taihe/photoselector/ui/PhotoSelectorActivity$OnLocalReccentListener;", "InitFolderSelect", "", "OnClickNext", "OnItemClick", g.C, "checkBottom", "checkTab", "tabIndex", "dismisInsideProgress", "doResult", "datas", "finish", "initData", "data", "initListener", "initView", "isGoodRes", "model", "logs", "loadData", "needTopToolbar", "onActivityResult", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "onBackPressed", "onDestroy", "setContentViewResByViewBind", "Landroid/view/View;", "setCustomArrow", "isUp", "setMode", h.c.a.a.a.f16081l, "setNextNoData", "showInsideProgress", "Builder", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SelectPhotoActivity extends BaseNewActivity implements m.b {
    @NotNull
    public static final b y = null;
    @Nullable
    private static Function1<? super Boolean, Unit> z;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5328d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5329e;

    /* renamed from: f  reason: collision with root package name */
    private h.x.e.b.b f5330f;

    /* renamed from: g  reason: collision with root package name */
    private y1 f5331g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private k f5332h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private RecyclerView f5333i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private t1 f5334j;

    /* renamed from: k  reason: collision with root package name */
    private t4 f5335k;

    /* renamed from: l  reason: collision with root package name */
    private int f5336l;

    /* renamed from: m  reason: collision with root package name */
    private int f5337m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private String f5338n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private List<? extends PhotoModel> f5339o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private PublishArticleBean f5340p;
    private boolean q;
    @NotNull
    private final ArrayList<PhotoModel> r;
    private boolean s;
    @Nullable
    private a t;
    private boolean u;
    @NotNull
    private final PhotoSelectorActivity.d v;
    @NotNull
    private final PhotoSelectorActivity.e w;
    private int x;

    /* compiled from: SelectPhotoActivity.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010(\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001b¨\u0006*"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;", "", "()V", "PhotoMaxCount", "", "getPhotoMaxCount", "()I", "setPhotoMaxCount", "(I)V", "alreadyDatas", "", "Lcom/taihe/photoselector/model/PhotoModel;", "getAlreadyDatas", "()Ljava/util/List;", "setAlreadyDatas", "(Ljava/util/List;)V", "bean", "Lcom/showstartfans/activity/model/PublishArticleBean;", "getBean", "()Lcom/showstartfans/activity/model/PublishArticleBean;", "setBean", "(Lcom/showstartfans/activity/model/PublishArticleBean;)V", "canCheck", "", "getCanCheck", "()Z", "setCanCheck", "(Z)V", "enterBtnText", "", "getEnterBtnText", "()Ljava/lang/String;", "setEnterBtnText", "(Ljava/lang/String;)V", "hasTake", "getHasTake", "setHasTake", "ignoreVideo", "getIgnoreVideo", "setIgnoreVideo", "isFromAuto", "setFromAuto", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        private List<? extends PhotoModel> f5341a;
        @Nullable
        private PublishArticleBean b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5342d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private String f5343e;

        /* renamed from: f  reason: collision with root package name */
        private int f5344f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f5345g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f5346h;

        @Nullable
        public final List<PhotoModel> a() {
        }

        @Nullable
        public final PublishArticleBean b() {
        }

        public final boolean c() {
        }

        @NotNull
        public final String d() {
        }

        public final boolean e() {
        }

        public final boolean f() {
        }

        public final int g() {
        }

        public final boolean h() {
        }

        public final void i(@Nullable List<? extends PhotoModel> list) {
        }

        public final void j(@Nullable PublishArticleBean publishArticleBean) {
        }

        public final void k(boolean z) {
        }

        public final void l(@NotNull String str) {
        }

        public final void m(boolean z) {
        }

        public final void n(boolean z) {
        }

        public final void o(boolean z) {
        }

        public final void p(int i2) {
        }
    }

    /* compiled from: SelectPhotoActivity.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jg\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\b\u001a\u00020\u00052+\b\u0002\u0010\u0003\u001a%\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004j\u0004\u0018\u0001`\nJK\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182+\b\u0002\u0010\u0003\u001a%\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004j\u0004\u0018\u0001`\nR=\u0010\u0003\u001a%\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004j\u0004\u0018\u0001`\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Companion;", "", "()V", j.c, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isFromAuto", "", "Lcom/showstartfans/activity/activitys/article/OnBack;", "getOnBack", "()Lkotlin/jvm/functions/Function1;", "setOnBack", "(Lkotlin/jvm/functions/Function1;)V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "act", "Landroid/app/Activity;", "alreadyDatas", "", "Lcom/taihe/photoselector/model/PhotoModel;", "bean", "Lcom/showstartfans/activity/model/PublishArticleBean;", Constant.LOGIN_ACTIVITY_REQUEST_CODE, "", "openByBuilder", "builder", "Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void c(b bVar, Activity activity, List list, PublishArticleBean publishArticleBean, int i2, boolean z, Function1 function1, int i3, Object obj) {
        }

        public static /* synthetic */ void e(b bVar, Activity activity, a aVar, int i2, Function1 function1, int i3, Object obj) {
        }

        @Nullable
        public final Function1<Boolean, Unit> a() {
        }

        public final void b(@NotNull Activity activity, @Nullable List<? extends PhotoModel> list, @Nullable PublishArticleBean publishArticleBean, int i2, boolean z, @Nullable Function1<? super Boolean, Unit> function1) {
        }

        public final void d(@NotNull Activity activity, @NotNull a aVar, int i2, @Nullable Function1<? super Boolean, Unit> function1) {
        }

        public final void f(@Nullable Function1<? super Boolean, Unit> function1) {
        }
    }

    /* compiled from: SelectPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/article/SelectPhotoActivity$InitFolderSelect$1", "Lcom/taihe/photoselector/ui/SlidedownView$onLifecallBack;", "isDisplay", "", "isShow", "", "start", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c implements k.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SelectPhotoActivity f5347a;

        public c(SelectPhotoActivity selectPhotoActivity) {
        }

        @Override // h.x.e.d.k.c
        public void isDisplay(boolean z) {
        }

        @Override // h.x.e.d.k.c
        public void start(boolean z) {
        }
    }

    /* compiled from: SelectPhotoActivity.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH\u0016¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/article/SelectPhotoActivity$initListener$4", "Lcom/showstartfans/activity/activitys/article/SelectPhotoAdapter$OnCheckChangeListener;", "OnCheckChange", "", "checkMap", "Ljava/util/LinkedHashMap;", "", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/collections/LinkedHashMap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class d implements y1.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SelectPhotoActivity f5348a;

        public d(SelectPhotoActivity selectPhotoActivity) {
        }

        @Override // h.u.a.c.w.y1.b
        public void a(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap) {
        }
    }

    /* compiled from: SelectPhotoActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/article/SelectPhotoActivity$reccentListener$1$1", "Lcom/showstartfans/activity/view/videocut/BackgroundExecutor$Task;", "execute", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e extends d.a {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ SelectPhotoActivity f5349i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ List<PhotoModel> f5350j;

        public e(SelectPhotoActivity selectPhotoActivity, List<PhotoModel> list) {
        }

        private static final void l(SelectPhotoActivity selectPhotoActivity, Ref.ObjectRef objectRef) {
        }

        public static /* synthetic */ void m(SelectPhotoActivity selectPhotoActivity, Ref.ObjectRef objectRef) {
        }

        @Override // h.u.a.u.f4.d.a
        public void j() {
        }
    }

    public static final /* synthetic */ void A(SelectPhotoActivity selectPhotoActivity) {
    }

    public static final /* synthetic */ t4 B(SelectPhotoActivity selectPhotoActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity C(SelectPhotoActivity selectPhotoActivity) {
    }

    public static final /* synthetic */ ArrayList D(SelectPhotoActivity selectPhotoActivity) {
    }

    public static final /* synthetic */ boolean E(SelectPhotoActivity selectPhotoActivity) {
    }

    public static final /* synthetic */ PublishArticleBean F(SelectPhotoActivity selectPhotoActivity) {
    }

    public static final /* synthetic */ Function1 G() {
    }

    public static final /* synthetic */ y1 H(SelectPhotoActivity selectPhotoActivity) {
    }

    public static final /* synthetic */ boolean I(SelectPhotoActivity selectPhotoActivity, PhotoModel photoModel, ArrayList arrayList) {
    }

    public static final /* synthetic */ void J(SelectPhotoActivity selectPhotoActivity, int i2) {
    }

    public static final /* synthetic */ void K(SelectPhotoActivity selectPhotoActivity, boolean z2) {
    }

    public static final /* synthetic */ void L(SelectPhotoActivity selectPhotoActivity, int i2) {
    }

    public static final /* synthetic */ void M(Function1 function1) {
    }

    private static final void N(SelectPhotoActivity selectPhotoActivity, List list) {
    }

    private final void O() {
    }

    private final void P(int i2) {
    }

    private final void Q() {
    }

    private final void R(List<? extends PhotoModel> list) {
    }

    private final void T(PublishArticleBean publishArticleBean) {
    }

    private static final void U(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    private static final void V(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    private static final void W(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    private static final void X(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    private static final void Y(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    private final boolean Z(PhotoModel photoModel, ArrayList<String> arrayList) {
    }

    public static /* synthetic */ void a0(SelectPhotoActivity selectPhotoActivity, List list) {
    }

    public static /* synthetic */ void b0(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    public static /* synthetic */ void c0(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    public static /* synthetic */ void d0(SelectPhotoActivity selectPhotoActivity, List list) {
    }

    public static /* synthetic */ void e0(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    public static /* synthetic */ void f0(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    public static /* synthetic */ void g0(SelectPhotoActivity selectPhotoActivity, h.x.e.c.a aVar) {
    }

    public static /* synthetic */ void h0(List list, SelectPhotoActivity selectPhotoActivity) {
    }

    public static /* synthetic */ void i0(SelectPhotoActivity selectPhotoActivity, Boolean bool) {
    }

    public static /* synthetic */ void j0(SelectPhotoActivity selectPhotoActivity) {
    }

    public static /* synthetic */ void k0(SelectPhotoActivity selectPhotoActivity, ArrayList arrayList) {
    }

    public static /* synthetic */ void l0(SelectPhotoActivity selectPhotoActivity, View view) {
    }

    @SuppressLint({"CheckResult"})
    private final void m0() {
    }

    private static final void n0(SelectPhotoActivity selectPhotoActivity, Boolean bool) {
    }

    private static final void o0(SelectPhotoActivity selectPhotoActivity, List list) {
    }

    private static final void p0(List list, SelectPhotoActivity selectPhotoActivity) {
    }

    private static final void q0(SelectPhotoActivity selectPhotoActivity, ArrayList arrayList) {
    }

    private final void r0(int i2) {
    }

    private final void s0(int i2) {
    }

    private final void t0() {
    }

    private final void u0() {
    }

    private final void w() {
    }

    private static final void y(SelectPhotoActivity selectPhotoActivity) {
    }

    private static final void z(SelectPhotoActivity selectPhotoActivity, h.x.e.c.a aVar) {
    }

    @NotNull
    public final PhotoSelectorActivity.e S() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // h.y.a.f.m.b
    public void c(int i2) {
    }

    @Override // android.app.Activity
    public void finish() {
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
    public boolean needTopToolbar() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    public final void x() {
    }
}
