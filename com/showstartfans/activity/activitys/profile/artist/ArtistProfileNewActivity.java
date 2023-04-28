package com.showstartfans.activity.activitys.profile.artist;

import android.os.Bundle;
import android.view.View;
import com.showstartfans.activity.activitys.profile.BaseProfileActivity;
import com.showstartfans.activity.eventmodel.RailwayStationFollowEvent;
import com.showstartfans.activity.model.artist.ArtistCallingCardBean;
import com.taihebase.activity.base.BaseNewFunctionActivity;
import h.a.a.a.a.i.g;
import h.s.a.h;
import h.s.a.j;
import h.u.a.w.c0.r2;
import h.u.a.w.d0.w2;
import h.y.a.m.n;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArtistProfileNewActivity.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u001a\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u0006\u0010\u0018\u001a\u00020\rJ\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\rH\u0014J\u0012\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\b\u0010 \u001a\u00020\rH\u0014J$\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020\u0012H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006)"}, d2 = {"Lcom/showstartfans/activity/activitys/profile/artist/ArtistProfileNewActivity;", "Lcom/showstartfans/activity/activitys/profile/BaseProfileActivity;", "Lcom/showstartfans/activity/widget/popupwindow/ShareMenuListListener;", "()V", "bean", "Lcom/showstartfans/activity/model/artist/ArtistCallingCardBean;", "mShareDialog", "Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "getMShareDialog", "()Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "mShareDialog$delegate", "Lkotlin/Lazy;", "checkFollowOrCancle", "", "data", "isFollow", "", "newRelationship", "", "dataCallBack", "isLoginEvent", "getArtistProfile", "id", "", "gotoFans", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "event", "Lcom/showstartfans/activity/eventmodel/RailwayStationFollowEvent;", "onLoginSuccess", "onPupMenuViewClick", "view", "Landroid/view/View;", "content", g.C, "setProfileHeadData", "upDateView", "concernSiteBean", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ArtistProfileNewActivity extends BaseProfileActivity implements w2 {
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public Map<Integer, View> f6280p;
    @Nullable
    private ArtistCallingCardBean q;
    @NotNull
    private final Lazy r;

    /* compiled from: ArtistProfileNewActivity.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/profile/artist/ArtistProfileNewActivity$dataCallBack$1$1", "Lcom/opensource/svgaplayer/SVGAParser$ParseCompletion;", "onComplete", "", "videoItem", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "onError", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArtistProfileNewActivity f6281a;

        public a(ArtistProfileNewActivity artistProfileNewActivity) {
        }

        public static /* synthetic */ void b(ArtistProfileNewActivity artistProfileNewActivity, j jVar) {
        }

        public static /* synthetic */ void c(ArtistProfileNewActivity artistProfileNewActivity) {
        }

        private static final void d(ArtistProfileNewActivity artistProfileNewActivity, j jVar) {
        }

        private static final void e(ArtistProfileNewActivity artistProfileNewActivity) {
        }

        @Override // h.s.a.h.d
        public void a(@NotNull j jVar) {
        }

        @Override // h.s.a.h.d
        public void onError() {
        }
    }

    /* compiled from: ArtistProfileNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ boolean $isLoginEvent;
        public final /* synthetic */ ArtistProfileNewActivity this$0;

        public b(ArtistProfileNewActivity artistProfileNewActivity, boolean z) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: ArtistProfileNewActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/widget/dialog/ShareDialog;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function0<r2> {
        public final /* synthetic */ ArtistProfileNewActivity this$0;

        public c(ArtistProfileNewActivity artistProfileNewActivity) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ r2 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final r2 invoke() {
        }
    }

    /* compiled from: ArtistProfileNewActivity.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002K\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0001j\u0002`\nJ!\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¨\u0006\f"}, d2 = {"com/showstartfans/activity/activitys/profile/artist/ArtistProfileNewActivity$setProfileHeadData$3", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "success", "isFollow", "", "newRelationship", "", "Lcom/showstartfans/activity/widget/OnFollowListener;", "invoke", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements Function3<Boolean, Boolean, Integer, Unit> {
        public final /* synthetic */ ArtistProfileNewActivity b;
        public final /* synthetic */ ArtistCallingCardBean c;

        public d(ArtistProfileNewActivity artistProfileNewActivity, ArtistCallingCardBean artistCallingCardBean) {
        }

        public void a(boolean z, boolean z2, int i2) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Integer num) {
        }
    }

    public static final /* synthetic */ void d0(ArtistProfileNewActivity artistProfileNewActivity, ArtistCallingCardBean artistCallingCardBean, boolean z, int i2) {
    }

    public static final /* synthetic */ void e0(ArtistProfileNewActivity artistProfileNewActivity, String str, boolean z) {
    }

    public static final /* synthetic */ BaseNewFunctionActivity f0(ArtistProfileNewActivity artistProfileNewActivity) {
    }

    private final void g0(ArtistCallingCardBean artistCallingCardBean, boolean z, int i2) {
    }

    private final void h0(ArtistCallingCardBean artistCallingCardBean, boolean z) {
    }

    private static final void i0(ArtistProfileNewActivity artistProfileNewActivity, ArtistCallingCardBean artistCallingCardBean) {
    }

    private static final void j0(ArtistProfileNewActivity artistProfileNewActivity, ArtistCallingCardBean artistCallingCardBean, View view) {
    }

    private final void k0(String str, boolean z) {
    }

    private static final void l0(boolean z, ArtistProfileNewActivity artistProfileNewActivity, n nVar) {
    }

    private final r2 m0() {
    }

    public static /* synthetic */ void o0(ArtistCallingCardBean artistCallingCardBean, ArtistProfileNewActivity artistProfileNewActivity, int i2, View view) {
    }

    public static /* synthetic */ void p0(ArtistProfileNewActivity artistProfileNewActivity, ArtistCallingCardBean artistCallingCardBean) {
    }

    public static /* synthetic */ void q0(ArtistProfileNewActivity artistProfileNewActivity, ArtistCallingCardBean artistCallingCardBean, View view) {
    }

    public static /* synthetic */ void r0(boolean z, ArtistProfileNewActivity artistProfileNewActivity, n nVar) {
    }

    public static /* synthetic */ void s0(ArtistProfileNewActivity artistProfileNewActivity, ArtistCallingCardBean artistCallingCardBean, View view) {
    }

    private final void t0(ArtistCallingCardBean artistCallingCardBean) {
    }

    private static final void u0(ArtistCallingCardBean artistCallingCardBean, ArtistProfileNewActivity artistProfileNewActivity, int i2, View view) {
    }

    private static final void v0(ArtistProfileNewActivity artistProfileNewActivity, ArtistCallingCardBean artistCallingCardBean, View view) {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseProfileActivity
    public void U() {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseProfileActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseProfileActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity
    @Nullable
    public View _$_findCachedViewById(int i2) {
    }

    public final void n0() {
    }

    @Override // com.taihebase.activity.base.BaseNoToolBarActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, com.tbruyelle.rxpermissions.BaseFixOTranslucentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // com.showstartfans.activity.activitys.profile.BaseProfileActivity, com.taihebase.activity.base.BaseNewActivity, com.taihebase.activity.base.BaseNewFunctionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@Nullable RailwayStationFollowEvent railwayStationFollowEvent) {
    }

    @Override // h.u.a.w.d0.w2
    public void onPupMenuViewClick(@Nullable View view, @Nullable String str, int i2) {
    }

    public final void w0(@Nullable ArtistCallingCardBean artistCallingCardBean) {
    }
}
