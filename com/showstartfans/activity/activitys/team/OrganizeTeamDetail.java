package com.showstartfans.activity.activitys.team;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.showstartfans.activity.model.TeamDetailBean;
import com.taihebase.activity.base.BaseNoToolBarActivity;
import h.a.a.a.a.i.g;
import h.y.a.m.n;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OrganizeTeamDetail.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014J\b\u0010\u0014\u001a\u00020\u0006H\u0014J\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/showstartfans/activity/activitys/team/OrganizeTeamDetail;", "Lcom/taihebase/activity/base/BaseNoToolBarActivity;", "()V", "beans", "Lcom/showstartfans/activity/model/TeamDetailBean;", "currentPos", "", "getCurrentPos", "()I", "setCurrentPos", "(I)V", "callData", "", "bean", "getTeamShowData", "teamShowId", "", "initData", "initListener", "initView", "setContentViewRes", "setViewPagerData", "list", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Companion", "MyFragmentPagerAdapter", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class OrganizeTeamDetail extends BaseNoToolBarActivity {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final a f6286e = null;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final String f6287f = null;
    @NotNull
    public Map<Integer, View> b;
    private int c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private TeamDetailBean f6288d;

    /* compiled from: OrganizeTeamDetail.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/activitys/team/OrganizeTeamDetail$Companion;", "", "()V", "TEAM_SHOW_ID", "", "start", "", "ctx", "Landroid/content/Context;", "teamShowId", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(@NotNull Context context, @NotNull String str) {
        }
    }

    /* compiled from: OrganizeTeamDetail.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/showstartfans/activity/activitys/team/OrganizeTeamDetail$MyFragmentPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "list", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "(Lcom/showstartfans/activity/activitys/team/OrganizeTeamDetail;Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "getCount", "", "getItem", "arg0", "getPageTitle", "", g.C, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class b extends FragmentPagerAdapter {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<Fragment> f6289a;
        public final /* synthetic */ OrganizeTeamDetail b;

        public b(@NotNull OrganizeTeamDetail organizeTeamDetail, @NotNull FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
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

    /* compiled from: OrganizeTeamDetail.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String $teamShowId;
        public final /* synthetic */ OrganizeTeamDetail this$0;

        public c(OrganizeTeamDetail organizeTeamDetail, String str) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    private final void A(String str) {
    }

    private static final void B(OrganizeTeamDetail organizeTeamDetail, String str, n nVar) {
    }

    private static final void C(OrganizeTeamDetail organizeTeamDetail, View view) {
    }

    public static /* synthetic */ void D(OrganizeTeamDetail organizeTeamDetail, String str, n nVar) {
    }

    public static /* synthetic */ void E(OrganizeTeamDetail organizeTeamDetail, View view) {
    }

    private final void G(ArrayList<Fragment> arrayList) {
    }

    public static final /* synthetic */ String w() {
    }

    public static final /* synthetic */ void x(OrganizeTeamDetail organizeTeamDetail, String str) {
    }

    private final void y(TeamDetailBean teamDetailBean) {
    }

    public final void F(int i2) {
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
    public int setContentViewRes() {
    }

    public final int z() {
    }
}
