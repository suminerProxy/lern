package com.showstartfans.activity.activitys.profile;

import android.content.Intent;
import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.appbar.AppBarLayout;
import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.showstartfans.activity.eventmodel.LoginEvent;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.a.a.a.a.i.g;
import h.y.a.k.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BaseProfileActivity.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002OPB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007H\u0014J\b\u0010)\u001a\u00020'H\u0002J(\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0012H\u0004J\u001e\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007J\u0010\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u0007H\u0002J\b\u00105\u001a\u00020'H\u0014J\b\u00106\u001a\u00020'H\u0014J\b\u00107\u001a\u00020'H\u0014J\b\u00108\u001a\u00020'H\u0016J\u0012\u00109\u001a\u00020'2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020'H\u0014J\u0012\u0010=\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010?H\u0007J\b\u0010@\u001a\u00020'H\u0014J\u0012\u0010A\u001a\u00020'2\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\u001a\u0010D\u001a\u00020'2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010G\u001a\u00020\u0007H\u0016J\u0012\u0010H\u001a\u00020'2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010K\u001a\u00020'H\u0014J\b\u0010L\u001a\u00020\u0007H\u0014J\u0016\u0010M\u001a\u00020'2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0004R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016¨\u0006Q"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/BaseProfileActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "Lcom/taihebase/activity/listener/OnToolbarBackListener;", "Lcom/mob/moblink/SceneRestorable;", "()V", "currentPos", "", "getCurrentPos", "()I", "setCurrentPos", "(I)V", "isFromLive", "", "()Z", "setFromLive", "(Z)V", "livePushId", "", "getLivePushId", "()Ljava/lang/String;", "setLivePushId", "(Ljava/lang/String;)V", "numFans", "getNumFans", "setNumFans", "profileId", "getProfileId", "setProfileId", "tabFragment", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "themeType", "getThemeType", "setThemeType", "umeng_Key", "getUmeng_Key", "setUmeng_Key", "actionToData", "", "pos", "addStatusBarHeights", "clickMoreCrowd", "raiseCount", "goodsCount", "performerId", "UmengFrom", "dealAttention", "id", "userType", "relationship", "getTabTitle", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "initData", "initListener", "initView", "onBackPressed", "onClick", "view", "Landroid/view/View;", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/LoginEvent;", "onLoginSuccess", "onNewIntent", "intent", "Landroid/content/Intent;", "onOffsetChanged", TtmlNode.TAG_LAYOUT, "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "onReturnSceneData", "p0", "Lcom/mob/moblink/Scene;", "onStop", "setContentViewRes", "setViewPagerData", "list", "Companion", "MyFragmentPagerAdapter", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class BaseProfileActivity extends BaseNoToolBarActivity implements AppBarLayout.OnOffsetChangedListener, j, SceneRestorable {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f6181k = null;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private static final String f6182l = null;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    private static final String f6183m = null;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private static final String f6184n = null;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    private static final String f6185o = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f6186d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private String f6187e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private String f6188f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6189g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private String f6190h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private String f6191i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Fragment> f6192j;

    /* compiled from: BaseProfileActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/BaseProfileActivity$Companion;", "", "()V", "livePushid", "", "getLivePushid", "()Ljava/lang/String;", "positionKey", "getPositionKey", "profileIdKey", "getProfileIdKey", "umengKey", "getUmengKey", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final String a() {
        }

        @NotNull
        public final String b() {
        }

        @NotNull
        public final String c() {
        }

        @NotNull
        public final String d() {
        }
    }

    /* compiled from: BaseProfileActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/BaseProfileActivity$MyFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "list", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "(Lcom/showstartfans/activity/activitys/profile/BaseProfileActivity;Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "getCount", "", "getItem", "arg0", "getPageTitle", "", g.C, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class b extends FragmentPagerAdapter {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<Fragment> f6193a;
        public final /* synthetic */ BaseProfileActivity b;

        public b(@NotNull BaseProfileActivity baseProfileActivity, @NotNull FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int i2) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public CharSequence getPageTitle(int i2) {
        }
    }

    /* compiled from: BaseProfileActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/profile/BaseProfileActivity$initListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "arg0", "", "onPageScrolled", "arg1", "", "arg2", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ BaseProfileActivity b;

        public c(BaseProfileActivity baseProfileActivity) {
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

    /* compiled from: BaseProfileActivity.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/activitys/profile/BaseProfileActivity$initListener$3", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends ViewPager.SimpleOnPageChangeListener {
        public final /* synthetic */ BaseProfileActivity b;

        public d(BaseProfileActivity baseProfileActivity) {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    public static final /* synthetic */ String A(BaseProfileActivity baseProfileActivity, int i2) {
    }

    public static final /* synthetic */ String B() {
    }

    private final void D() {
    }

    private static final void F(BaseProfileActivity baseProfileActivity, String str, String str2, View view) {
    }

    private static final void G(BaseProfileActivity baseProfileActivity, View view) {
    }

    private final String M(int i2) {
    }

    private static final void P(BaseProfileActivity baseProfileActivity, RadioGroup radioGroup, int i2) {
    }

    public static /* synthetic */ void R(BaseProfileActivity baseProfileActivity, String str, String str2, View view) {
    }

    public static /* synthetic */ void S(BaseProfileActivity baseProfileActivity, View view) {
    }

    public static /* synthetic */ void T(BaseProfileActivity baseProfileActivity, RadioGroup radioGroup, int i2) {
    }

    public static final /* synthetic */ String w() {
    }

    public static final /* synthetic */ String x() {
    }

    public static final /* synthetic */ String y() {
    }

    public static final /* synthetic */ ArrayList z(BaseProfileActivity baseProfileActivity) {
    }

    public void C(int i2) {
    }

    public final void E(int i2, int i3, @NotNull String str, @NotNull String str2) {
    }

    public final void H(@NotNull String str, int i2, int i3) {
    }

    public final int I() {
    }

    @Nullable
    public final String J() {
    }

    public final int K() {
    }

    @Nullable
    public final String L() {
    }

    @NotNull
    public final String N() {
    }

    @NotNull
    public final String O() {
    }

    public final boolean Q() {
    }

    public void U() {
    }

    public final void V(int i2) {
    }

    public final void W(boolean z) {
    }

    public final void X(@Nullable String str) {
    }

    public final void Y(int i2) {
    }

    public final void Z(@Nullable String str) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void a0(@NotNull String str) {
    }

    public final void b0(@NotNull String str) {
    }

    public final void c0(@NotNull ArrayList<Fragment> arrayList) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable LoginEvent loginEvent) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public void onOffsetChanged(@Nullable AppBarLayout appBarLayout, int i2) {
    }

    @Override // com.mob.moblink.SceneRestorable
    public void onReturnSceneData(@Nullable Scene scene) {
    }

    @Override // com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
