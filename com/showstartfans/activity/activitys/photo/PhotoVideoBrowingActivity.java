package com.showstartfans.activity.activitys.photo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.showstartfans.activity.activitys.article.SelectPhotoActivity;
import com.taihe.photoselector.model.PhotoModel;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.a.a.a.a.i.g;
import h.u.a.g.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PhotoVideoBrowingActivity.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\b\u0016\u0018\u0000 52\u00020\u00012\u00020\u0002:\u0003567B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u0005H\u0002J\b\u0010\"\u001a\u00020\u001eH\u0014J\b\u0010#\u001a\u00020\u001eH\u0014J\b\u0010$\u001a\u00020\u001eH\u0014J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020\u001eH\u0014J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0005H\u0016J \u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u001eH\u0014J\b\u00103\u001a\u00020\u001bH\u0014J\b\u00104\u001a\u00020\u000eH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "()V", "PhotoMaxCount", "", "binding", "Lcom/showstartfans/activity/databinding/ActivityBrowingPhotoVideoBinding;", "currentPos", "datas", "Ljava/util/ArrayList;", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/collections/ArrayList;", "isEditMode", "", "isSingle", "mBuilder", "Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;", "mPagerAdapter", "Landroidx/viewpager/widget/PagerAdapter;", "screenHeight", "getScreenHeight", "()I", "screenHeight$delegate", "Lkotlin/Lazy;", "viewMap", "Ljava/util/HashMap;", "Landroid/view/View;", "Lkotlin/collections/HashMap;", "backFinish", "", "checkBottom", "finish", "ignoreType", "initData", "initListener", "initView", "isGreater200", "path", "", "isLoadAll", "onDestroy", "onPageScrollStateChanged", "state", "onPageScrolled", g.C, "positionOffset", "", "positionOffsetPixels", "onPageSelected", "onPause", "setContentViewResByViewBind", "setStatusBarTextWhite", "Companion", "OnCheckDataChangeListener", "OnDataEditListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PhotoVideoBrowingActivity extends BaseNoToolBarActivity implements ViewPager.OnPageChangeListener {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public static final a f6113m = null;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private static LinkedHashMap<String, PhotoModel> f6114n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private static b f6115o;
    @Nullable

    /* renamed from: p  reason: collision with root package name */
    private static c f6116p;
    @NotNull
    private static ArrayList<PhotoModel> q;
    @NotNull
    public Map<Integer, View> b;
    private r c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<PhotoModel> f6117d;

    /* renamed from: e  reason: collision with root package name */
    private int f6118e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<Integer, View> f6119f;

    /* renamed from: g  reason: collision with root package name */
    private int f6120g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6121h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6122i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private SelectPhotoActivity.a f6123j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f6124k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private final PagerAdapter f6125l;

    /* compiled from: PhotoVideoBrowingActivity.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jn\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ2\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\tR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$Companion;", "", "()V", "checkMap", "Ljava/util/LinkedHashMap;", "", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/collections/LinkedHashMap;", "editListener", "Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$OnDataEditListener;", "fromDatas", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$OnCheckDataChangeListener;", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "ctx", "Landroid/content/Context;", "datas", "", "currentPos", "", "PhotoMaxCount", "builder", "Lcom/showstartfans/activity/activitys/article/SelectPhotoActivity$Builder;", "openEdit", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static /* synthetic */ void b(a aVar, Context context, List list, LinkedHashMap linkedHashMap, int i2, int i3, SelectPhotoActivity.a aVar2, b bVar, int i4, Object obj) {
        }

        public static /* synthetic */ void d(a aVar, Context context, List list, int i2, c cVar, int i3, Object obj) {
        }

        public final void a(@NotNull Context context, @Nullable List<? extends PhotoModel> list, @Nullable LinkedHashMap<String, PhotoModel> linkedHashMap, int i2, int i3, @Nullable SelectPhotoActivity.a aVar, @Nullable b bVar) {
        }

        public final void c(@NotNull Context context, @Nullable List<? extends PhotoModel> list, int i2, @Nullable c cVar) {
        }
    }

    /* compiled from: PhotoVideoBrowingActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH&J,\u0010\t\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH&¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$OnCheckDataChangeListener;", "", "OnCheckMapChange", "", "checkMap", "Ljava/util/LinkedHashMap;", "", "Lcom/taihe/photoselector/model/PhotoModel;", "Lkotlin/collections/LinkedHashMap;", "OnClickNext", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void a(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap);

        void b(@NotNull LinkedHashMap<String, PhotoModel> linkedHashMap);
    }

    /* compiled from: PhotoVideoBrowingActivity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$OnDataEditListener;", "", "onClickDelete", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void a(int i2);
    }

    /* compiled from: PhotoVideoBrowingActivity.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0012"}, d2 = {"com/showstartfans/activity/activitys/photo/PhotoVideoBrowingActivity$mPagerAdapter$1", "Landroidx/viewpager/widget/PagerAdapter;", "destroyItem", "", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", g.C, "", "object", "", "getCount", "getImagePreviewView", "Landroid/view/View;", "getVideoPreviewView", "instantiateItem", "isViewFromObject", "", "view", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PhotoVideoBrowingActivity f6126a;

        public d(PhotoVideoBrowingActivity photoVideoBrowingActivity) {
        }

        private final View c(ViewGroup viewGroup, int i2) {
        }

        private static final void d(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view, float f2, float f3) {
        }

        private final View e(ViewGroup viewGroup, int i2) {
        }

        public static /* synthetic */ void g(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view, float f2, float f3) {
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

    /* compiled from: PhotoVideoBrowingActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class e extends Lambda implements Function0<Integer> {
        public final /* synthetic */ PhotoVideoBrowingActivity this$0;

        public e(PhotoVideoBrowingActivity photoVideoBrowingActivity) {
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

    public static final /* synthetic */ int A(PhotoVideoBrowingActivity photoVideoBrowingActivity) {
    }

    public static final /* synthetic */ HashMap B(PhotoVideoBrowingActivity photoVideoBrowingActivity) {
    }

    public static final /* synthetic */ void C(ArrayList arrayList) {
    }

    private final void D() {
    }

    private final void E() {
    }

    private final int F() {
    }

    private final int G() {
    }

    private static final void H(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view) {
    }

    private static final void I(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view) {
    }

    private static final void J(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view) {
    }

    private static final void K(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view) {
    }

    private final boolean L(String str) {
    }

    private final boolean M(String str) {
    }

    public static /* synthetic */ void N(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view) {
    }

    public static /* synthetic */ void O(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view) {
    }

    public static /* synthetic */ void P(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view) {
    }

    public static /* synthetic */ void Q(PhotoVideoBrowingActivity photoVideoBrowingActivity, View view) {
    }

    public static final /* synthetic */ void access$setEditListener$cp(c cVar) {
    }

    public static final /* synthetic */ void access$setListener$cp(b bVar) {
    }

    public static final /* synthetic */ void w(PhotoVideoBrowingActivity photoVideoBrowingActivity) {
    }

    public static final /* synthetic */ LinkedHashMap x() {
    }

    public static final /* synthetic */ BaseNewFunctionActivity y(PhotoVideoBrowingActivity photoVideoBrowingActivity) {
    }

    public static final /* synthetic */ ArrayList z(PhotoVideoBrowingActivity photoVideoBrowingActivity) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity
    public boolean setStatusBarTextWhite() {
    }
}
