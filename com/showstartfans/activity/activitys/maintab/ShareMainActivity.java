package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.taihebase.activity.base.BaseNewActivity;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.y.a.k.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareMainActivity.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0012\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\nj\b\u0012\u0004\u0012\u00020\b`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ShareMainActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "Lcom/mob/moblink/SceneRestorable;", "Lcom/taihebase/activity/listener/OnToolbarBackListener;", "()V", "initDisplayPos", "", "shareId", "", "tabFragment", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "getTabFragment", "()Ljava/util/ArrayList;", "tabTitle", "Lkotlin/collections/ArrayList;", "topSilTabLayout", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getTopSilTabLayout", "()Landroid/view/View;", "topSilTabLayout$delegate", "Lkotlin/Lazy;", "initData", "", "initListener", "initView", "onBackPressed", "onClick", "view", "onNewIntent", "intent", "Landroid/content/Intent;", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "setContentViewRes", "Companion", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ShareMainActivity extends BaseNewActivity implements SceneRestorable, j {
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final a f5853h = null;
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private int f5854d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<Fragment> f5855e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<String> f5856f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Lazy f5857g;

    /* compiled from: ShareMainActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/ShareMainActivity$Companion;", "", "()V", "start", "", "ctx", "Landroid/content/Context;", "selectTab", "", "shareId", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context) {
        }

        public final void b(@NotNull Context context, int i2) {
        }

        public final void c(@NotNull Context context, @NotNull String str) {
        }
    }

    /* compiled from: ShareMainActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/maintab/ShareMainActivity$initListener$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends ViewPager.SimpleOnPageChangeListener {
        public final /* synthetic */ ShareMainActivity b;

        public b(ShareMainActivity shareMainActivity) {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    /* compiled from: ShareMainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<View> {
        public final /* synthetic */ ShareMainActivity this$0;

        public c(ShareMainActivity shareMainActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ View invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
        }
    }

    public static final /* synthetic */ BaseNewFunctionActivity w(ShareMainActivity shareMainActivity) {
    }

    private final View y() {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // h.y.a.k.j
    public void onClick(@Nullable View view) {
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

    @NotNull
    public final ArrayList<Fragment> x() {
    }
}
