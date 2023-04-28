package com.showstartfans.activity.activitys.usercenter;

import android.view.View;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.taihebase.activity.base.BaseNewActivity;
import h.u.a.g.a6;
import h.u.a.g.c6;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UserFriendActivity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014R\u0014\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/UserFriendActivity;", "Lcom/taihebase/activity/base/BaseNewActivity;", "()V", "adapter", "Lcom/showstartfans/activity/activitys/usercenter/UserFriendActivity$MyFragmentPagerAdapter;", "binding", "Lcom/showstartfans/activity/databinding/ActivityUserFriendBinding;", "fansId", "", "titleBinding", "Lcom/showstartfans/activity/databinding/ActivityUserFriendTitleBinding;", "initData", "", "initListener", "initView", "setContentViewResByViewBind", "Landroid/view/View;", "Companion", "MyFragmentPagerAdapter", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class UserFriendActivity extends BaseNewActivity {
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final a f6413g = null;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final String f6414h = "fansId";
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final String f6415i = "isAttenttion";
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final String f6416j = "DATA_FROM";
    @NotNull
    public Map<Integer, View> b;
    private a6 c;

    /* renamed from: d  reason: collision with root package name */
    private c6 f6417d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private b f6418e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private String f6419f;

    /* compiled from: UserFriendActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/UserFriendActivity$Companion;", "", "()V", "DATA_ATTENTION", "", "DATA_FANSID", "DATA_FROM", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: UserFriendActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/showstartfans/activity/activitys/usercenter/UserFriendActivity$MyFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "list", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "(Lcom/showstartfans/activity/activitys/usercenter/UserFriendActivity;Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "getCount", "", "getItem", "arg0", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class b extends FragmentPagerAdapter {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<Fragment> f6420a;
        public final /* synthetic */ UserFriendActivity b;

        public b(@NotNull UserFriendActivity userFriendActivity, @NotNull FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        @NotNull
        public Fragment getItem(int i2) {
        }
    }

    /* compiled from: UserFriendActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/activitys/usercenter/UserFriendActivity$initListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "arg0", "", "onPageScrolled", "arg1", "", "arg2", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ UserFriendActivity b;

        public c(UserFriendActivity userFriendActivity) {
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

    public static /* synthetic */ void A(UserFriendActivity userFriendActivity, RadioGroup radioGroup, int i2) {
    }

    public static /* synthetic */ void B(UserFriendActivity userFriendActivity, Boolean bool) {
    }

    public static /* synthetic */ void C(UserFriendActivity userFriendActivity, View view) {
    }

    public static final /* synthetic */ c6 w(UserFriendActivity userFriendActivity) {
    }

    private static final void x(UserFriendActivity userFriendActivity, View view) {
    }

    private static final void y(UserFriendActivity userFriendActivity, Boolean bool) {
    }

    private static final void z(UserFriendActivity userFriendActivity, RadioGroup radioGroup, int i2) {
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

    @Override // com.taihebase.activity.base.BaseNewActivity
    @NotNull
    public View setContentViewResByViewBind() {
    }
}
