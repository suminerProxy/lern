package com.showstartfans.activity.activitys.photo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.manager.PhotoWallPhotoBean;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.a.a.a.a.i.g;
import h.u.a.g.r3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PhotoWallBrowingActivity.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001d\u001a\u00020\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0002J\u0010\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0002J\b\u0010#\u001a\u00020\u001bH\u0014J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\tH\u0016J \u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\tH\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\tH\u0016J\b\u0010,\u001a\u00020\u001bH\u0014J\b\u0010-\u001a\u00020\u001bH\u0014J\b\u0010.\u001a\u00020\u0018H\u0014J\b\u0010/\u001a\u00020 H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/showstartfans/activity/activitys/photo/PhotoWallBrowingActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "()V", "activityId", "", "binding", "Lcom/showstartfans/activity/databinding/ActivityPhotoWallBrowingBinding;", "currentPos", "", "datas", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "Lkotlin/collections/ArrayList;", "fromIndex", "mPagerAdapter", "Landroidx/viewpager/widget/PagerAdapter;", "screenHeight", "getScreenHeight", "()I", "screenHeight$delegate", "Lkotlin/Lazy;", "viewMap", "Ljava/util/HashMap;", "Landroid/view/View;", "Lkotlin/collections/HashMap;", "backFinish", "", "initData", "initListener", "initView", "isGreater200", "", "path", "isLoadAll", "onDestroy", "onPageScrollStateChanged", "state", "onPageScrolled", g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPause", "onResume", "setContentViewResByViewBind", "setStatusBarTextWhite", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class PhotoWallBrowingActivity extends BaseNoToolBarActivity implements ViewPager.OnPageChangeListener {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f6127k = null;
    @NotNull
    public Map<Integer, View> b;
    private r3 c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<PhotoWallPhotoBean> f6128d;

    /* renamed from: e  reason: collision with root package name */
    private int f6129e;

    /* renamed from: f  reason: collision with root package name */
    private int f6130f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<Integer, View> f6131g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f6132h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private final Lazy f6133i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final PagerAdapter f6134j;

    /* compiled from: PhotoWallBrowingActivity.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/showstartfans/activity/activitys/photo/PhotoWallBrowingActivity$Companion;", "", "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "activityId", "", "datas", "", "Lcom/showstartfans/activity/manager/PhotoWallPhotoBean;", "fromIndex", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void b(a aVar, Context context, String str, List list, int i2, int i3, Object obj) {
        }

        public final void a(@NotNull Context context, @Nullable String str, @Nullable List<PhotoWallPhotoBean> list, int i2) {
        }
    }

    /* compiled from: PhotoWallBrowingActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/photo/PhotoWallBrowingActivity$initListener$2", "Landroid/view/View$OnClickListener;", "onClick", "", "p0", "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements View.OnClickListener {
        public final /* synthetic */ PhotoWallBrowingActivity b;

        /* compiled from: PhotoWallBrowingActivity.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public static final class a extends Lambda implements Function1<Boolean, Unit> {
            public final /* synthetic */ Ref.ObjectRef<PhotoWallPhotoBean> $currentData;

            public a(Ref.ObjectRef<PhotoWallPhotoBean> objectRef) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            }

            public final void invoke(boolean z) {
            }
        }

        public b(PhotoWallBrowingActivity photoWallBrowingActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View view) {
        }
    }

    /* compiled from: PhotoWallBrowingActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/photo/PhotoWallBrowingActivity$initListener$3", "Landroid/view/View$OnClickListener;", "onClick", "", "p0", "Landroid/view/View;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements View.OnClickListener {
        public final /* synthetic */ PhotoWallBrowingActivity b;

        public c(PhotoWallBrowingActivity photoWallBrowingActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View view) {
        }
    }

    /* compiled from: PhotoWallBrowingActivity.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0011"}, d2 = {"com/showstartfans/activity/activitys/photo/PhotoWallBrowingActivity$mPagerAdapter$1", "Landroidx/viewpager/widget/PagerAdapter;", "destroyItem", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", g.C, "", "object", "", "getCount", "getImagePreviewView", "Landroid/view/View;", "instantiateItem", "isViewFromObject", "", "view", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhotoWallBrowingActivity f6135a;

        public d(PhotoWallBrowingActivity photoWallBrowingActivity) {
        }

        private final View c(ViewGroup viewGroup, int i2) {
        }

        private static final void d(PhotoWallBrowingActivity photoWallBrowingActivity, View view, float f2, float f3) {
        }

        public static /* synthetic */ void f(PhotoWallBrowingActivity photoWallBrowingActivity, View view, float f2, float f3) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull ViewGroup viewGroup, int i2, @NotNull Object obj) {
        }

        @NotNull
        public View e(@NotNull ViewGroup viewGroup, int i2) {
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

    /* compiled from: PhotoWallBrowingActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<Integer> {
        public final /* synthetic */ PhotoWallBrowingActivity this$0;

        public e(PhotoWallBrowingActivity photoWallBrowingActivity) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
        }
    }

    public static final /* synthetic */ ArrayList A(PhotoWallBrowingActivity photoWallBrowingActivity) {
    }

    public static final /* synthetic */ int B(PhotoWallBrowingActivity photoWallBrowingActivity) {
    }

    public static final /* synthetic */ HashMap C(PhotoWallBrowingActivity photoWallBrowingActivity) {
    }

    private final void D() {
    }

    private final int E() {
    }

    private static final void F(PhotoWallBrowingActivity photoWallBrowingActivity, View view) {
    }

    private final boolean G(String str) {
    }

    private final boolean H(String str) {
    }

    public static /* synthetic */ void I(PhotoWallBrowingActivity photoWallBrowingActivity, View view) {
    }

    public static final /* synthetic */ void w(PhotoWallBrowingActivity photoWallBrowingActivity) {
    }

    public static final /* synthetic */ String x(PhotoWallBrowingActivity photoWallBrowingActivity) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity y(PhotoWallBrowingActivity photoWallBrowingActivity) {
    }

    public static final /* synthetic */ int z(PhotoWallBrowingActivity photoWallBrowingActivity) {
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

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i2) {
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

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public boolean setStatusBarTextWhite() {
    }
}
