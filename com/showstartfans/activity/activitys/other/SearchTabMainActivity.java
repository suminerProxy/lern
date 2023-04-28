package com.showstartfans.activity.activitys.other;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.a.a.a.a.i.g;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchTabMainActivity.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0014J\b\u0010!\u001a\u00020\u0016H\u0014J\b\u0010\"\u001a\u00020\u0016H\u0014J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0007H\u0002J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J*\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010)\u001a\u00020\u0007H\u0014J\u0006\u0010*\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u000fj\b\u0012\u0004\u0012\u00020\u0013`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t0\u000fj\b\u0012\u0004\u0012\u00020\t`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/showstartfans/activity/activitys/other/SearchTabMainActivity;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "Landroid/text/TextWatcher;", "()V", "firstLoad", "", "initDisplayPos", "", "searchKey", "", "getSearchKey", "()Ljava/lang/String;", "setSearchKey", "(Ljava/lang/String;)V", "tabClass", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/activitys/other/SearchTabMainActivity$TabItems;", "Lkotlin/collections/ArrayList;", "tabFragment", "Landroidx/fragment/app/Fragment;", "tabTitle", "afterTextChanged", "", "p0", "Landroid/text/Editable;", "beforeTextChanged", "", "p1", "p2", "p3", "getHotWord", "hideSoft", "initData", "initListener", "initView", "loadFirst", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "needTopToolbar", "onBackPressed", "onTextChanged", "inputStr", "setContentViewRes", "videoFragmentShow", "TabItems", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class SearchTabMainActivity extends BaseNoToolBarActivity implements TextWatcher {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private int f6023d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6024e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<Fragment> f6025f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<String> f6026g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<a> f6027h;

    /* compiled from: SearchTabMainActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/showstartfans/activity/activitys/other/SearchTabMainActivity$TabItems;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final Fragment f6028a;

        public a(@NotNull Fragment fragment) {
        }

        public static /* synthetic */ a c(a aVar, Fragment fragment, int i2, Object obj) {
        }

        @NotNull
        public final Fragment a() {
        }

        @NotNull
        public final a b(@NotNull Fragment fragment) {
        }

        @NotNull
        public final Fragment d() {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        @NotNull
        public String toString() {
        }
    }

    /* compiled from: SearchTabMainActivity.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/showstartfans/activity/activitys/other/SearchTabMainActivity$initListener$4", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageScrolled", "", g.C, "", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends ViewPager.SimpleOnPageChangeListener {
        public final /* synthetic */ SearchTabMainActivity b;

        public b(SearchTabMainActivity searchTabMainActivity) {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i2) {
        }
    }

    private final void A() {
    }

    private static final void B(n nVar) {
    }

    private final void D() {
    }

    private static final void E(SearchTabMainActivity searchTabMainActivity, View view) {
    }

    private static final void F(SearchTabMainActivity searchTabMainActivity, View view) {
    }

    private static final boolean G(SearchTabMainActivity searchTabMainActivity, View view, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ void H(SearchTabMainActivity searchTabMainActivity, View view) {
    }

    public static /* synthetic */ boolean I(SearchTabMainActivity searchTabMainActivity, View view, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ void J(SearchTabMainActivity searchTabMainActivity, View view) {
    }

    public static /* synthetic */ void K(n nVar) {
    }

    private final void L(int i2) {
    }

    public static final /* synthetic */ boolean w(SearchTabMainActivity searchTabMainActivity) {
    }

    public static final /* synthetic */ int x(SearchTabMainActivity searchTabMainActivity) {
    }

    public static final /* synthetic */ void y(SearchTabMainActivity searchTabMainActivity, int i2) {
    }

    public static final /* synthetic */ void z(SearchTabMainActivity searchTabMainActivity, boolean z) {
    }

    @NotNull
    public final String C() {
    }

    public final void M(@NotNull String str) {
    }

    public final boolean N() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
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

    @Override // com.taihebase.activity.base.BaseNoToolBarActivity, com.taihebase.activity.base.BaseNewActivity
    public boolean needTopToolbar() {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // com.taihebase.activity.base.BaseNewActivity
    public int setContentViewRes() {
    }
}
