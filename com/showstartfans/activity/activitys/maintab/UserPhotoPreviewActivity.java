package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.model.UserPhotoBean;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.a.a.a.a.i.g;
import h.u.a.g.f6;
import h.x.e.d.l.f;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserPhotoPreviewActivity.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\tH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\tH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001dH\u0014J\b\u0010'\u001a\u00020\u001dH\u0014J\b\u0010(\u001a\u00020\u001dH\u0014J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0002J\b\u0010-\u001a\u00020.H\u0014J\u0018\u0010/\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00062"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/UserPhotoPreviewActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "Datas", "", "Lcom/showstartfans/activity/model/UserPhotoBean;", "binding", "Lcom/showstartfans/activity/databinding/ActivityUserPhotoPreviewBinding;", "currentPosition", "", "fansId", "", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "lastPosition", "mPagerAdapter", "Landroidx/viewpager/widget/PagerAdapter;", "pointManxNum", "runnable", "Ljava/lang/Runnable;", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "OnDoubleClick", "", g.C, "OnLongClick", "Onefresh", "PostBrowse", "current", "backFinish", g.f15697i, "doMore", "initData", "initListener", "initView", "isMe", "", "needTopToolbar", "onViewPageSelected", "setContentViewResByViewBind", "Landroid/view/View;", "updateUserBg", "isCover", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UserPhotoPreviewActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public static final a f5900l = null;
    @NotNull
    public Map<Integer, View> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private f6 f5901d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private List<UserPhotoBean> f5902e;

    /* renamed from: f  reason: collision with root package name */
    private int f5903f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private String f5904g;

    /* renamed from: h  reason: collision with root package name */
    private int f5905h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private Handler f5906i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private Runnable f5907j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final PagerAdapter f5908k;

    /* compiled from: UserPhotoPreviewActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/UserPhotoPreviewActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", g.C, "", "fansId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@Nullable Context context, int i2, @Nullable String str) {
        }
    }

    /* compiled from: UserPhotoPreviewActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoPreviewActivity$initListener$3", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ UserPhotoPreviewActivity b;

        public b(UserPhotoPreviewActivity userPhotoPreviewActivity) {
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

    /* compiled from: UserPhotoPreviewActivity.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoPreviewActivity$mPagerAdapter$1", "Landroidx/viewpager/widget/PagerAdapter;", "destroyItem", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", g.C, "", "object", "", "getCount", "getImagePreviewView", "Landroid/view/View;", "instantiateItem", "isViewFromObject", "", "view", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserPhotoPreviewActivity f5909a;

        /* compiled from: UserPhotoPreviewActivity.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoPreviewActivity$mPagerAdapter$1$getImagePreviewView$1", "Lcom/taihe/photoselector/ui/photodrawee/OnDoubleTapInterceptListener;", "onDoubleTap", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ UserPhotoPreviewActivity f5910a;

            public a(UserPhotoPreviewActivity userPhotoPreviewActivity) {
            }

            @Override // h.x.e.d.l.f
            public boolean onDoubleTap() {
            }
        }

        public c(UserPhotoPreviewActivity userPhotoPreviewActivity) {
        }

        private final View c(ViewGroup viewGroup, int i2) {
        }

        private static final boolean d(UserPhotoPreviewActivity userPhotoPreviewActivity) {
        }

        private static final void e(UserPhotoPreviewActivity userPhotoPreviewActivity, View view, float f2, float f3) {
        }

        public static /* synthetic */ boolean g(UserPhotoPreviewActivity userPhotoPreviewActivity) {
        }

        public static /* synthetic */ void h(UserPhotoPreviewActivity userPhotoPreviewActivity, View view, float f2, float f3) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull ViewGroup viewGroup, int i2, @NotNull Object obj) {
        }

        @NotNull
        public View f(@NotNull ViewGroup viewGroup, int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public /* bridge */ /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
        }
    }

    /* compiled from: UserPhotoPreviewActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002!\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007J\u0011\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\t"}, d2 = {"com/showstartfans/activity/activitys/maintab/UserPhotoPreviewActivity$onViewPageSelected$1", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isPraise", "", "Lcom/showstartfans/activity/view/OnPraiseListener;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements Function1<Boolean, Unit> {
        public final /* synthetic */ UserPhotoBean b;
        public final /* synthetic */ UserPhotoPreviewActivity c;

        public d(UserPhotoBean userPhotoBean, UserPhotoPreviewActivity userPhotoPreviewActivity) {
        }

        public void a(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        }
    }

    private static final void A(n nVar) {
    }

    public static final /* synthetic */ void B(UserPhotoPreviewActivity userPhotoPreviewActivity, int i2) {
    }

    public static final /* synthetic */ void C(UserPhotoPreviewActivity userPhotoPreviewActivity, int i2) {
    }

    public static final /* synthetic */ void D(UserPhotoPreviewActivity userPhotoPreviewActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity E(UserPhotoPreviewActivity userPhotoPreviewActivity) {
    }

    public static final /* synthetic */ int F(UserPhotoPreviewActivity userPhotoPreviewActivity) {
    }

    public static final /* synthetic */ List G(UserPhotoPreviewActivity userPhotoPreviewActivity) {
    }

    public static final /* synthetic */ void H(UserPhotoPreviewActivity userPhotoPreviewActivity, int i2) {
    }

    private final void I() {
    }

    private final void J(int i2) {
    }

    private static final void K(UserPhotoPreviewActivity userPhotoPreviewActivity, int i2, n nVar) {
    }

    private final void L() {
    }

    private static final void M(UserPhotoPreviewActivity userPhotoPreviewActivity, UserPhotoBean userPhotoBean, View view, String str, int i2) {
    }

    private static final void N(h.y.a.p.w.a aVar, UserPhotoPreviewActivity userPhotoPreviewActivity, View view) {
    }

    private static final void O(UserPhotoPreviewActivity userPhotoPreviewActivity, View view, String str, int i2) {
    }

    private static final void R(UserPhotoPreviewActivity userPhotoPreviewActivity, View view) {
    }

    private static final void S(UserPhotoPreviewActivity userPhotoPreviewActivity, View view) {
    }

    private static final void T(UserPhotoPreviewActivity userPhotoPreviewActivity, ArrayList arrayList) {
    }

    private final boolean U() {
    }

    public static /* synthetic */ void V(UserPhotoPreviewActivity userPhotoPreviewActivity, View view) {
    }

    public static /* synthetic */ void W(UserPhotoPreviewActivity userPhotoPreviewActivity) {
    }

    public static /* synthetic */ void X(UserPhotoPreviewActivity userPhotoPreviewActivity, UserPhotoBean userPhotoBean, View view, String str, int i2) {
    }

    public static /* synthetic */ void Y(UserPhotoPreviewActivity userPhotoPreviewActivity, View view, String str, int i2) {
    }

    public static /* synthetic */ void Z(UserPhotoPreviewActivity userPhotoPreviewActivity, View view) {
    }

    public static /* synthetic */ void a0(UserPhotoPreviewActivity userPhotoPreviewActivity, int i2, n nVar) {
    }

    public static /* synthetic */ void b0(UserPhotoPreviewActivity userPhotoPreviewActivity, ArrayList arrayList) {
    }

    public static /* synthetic */ void c0(h.y.a.p.w.a aVar, UserPhotoPreviewActivity userPhotoPreviewActivity, View view) {
    }

    public static /* synthetic */ void d0(n nVar) {
    }

    public static /* synthetic */ void e0(UserPhotoPreviewActivity userPhotoPreviewActivity, int i2, UserPhotoBean userPhotoBean, n nVar) {
    }

    private final void f0(int i2) {
    }

    private static final void g0(UserPhotoPreviewActivity userPhotoPreviewActivity) {
    }

    private final void j0(int i2, int i3) {
    }

    private static final void k0(UserPhotoPreviewActivity userPhotoPreviewActivity, int i2, UserPhotoBean userPhotoBean, n nVar) {
    }

    private final void w(int i2) {
    }

    private final void x(int i2) {
    }

    private final void y() {
    }

    private final void z(int i2) {
    }

    @NotNull
    public final Handler P() {
    }

    @NotNull
    public final Runnable Q() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void h0(@NotNull Handler handler) {
    }

    public final void i0(@NotNull Runnable runnable) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
