package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.showstartfans.activity.model.home.NewYearHomeHeaderBean;
import h.s.a.h;
import h.s.a.j;
import h.u.a.c.f0.u8;
import h.y.a.m.n;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HomeShowHeadView.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J6\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tJ\u0010\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020\u0014J\u0006\u0010'\u001a\u00020\u0014R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/showstartfans/activity/activitys/maintab/HomeShowHeadView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "eShowAdapter", "Lcom/showstartfans/activity/activitys/maintab/ExcellentRepresentationAdapter;", "getEShowAdapter", "()Lcom/showstartfans/activity/activitys/maintab/ExcellentRepresentationAdapter;", "eShowAdapter$delegate", "Lkotlin/Lazy;", "mHandler", "Landroid/os/Handler;", "bannerClickEvent", "", "ctx", "bannerId", "", "bindData", "liveIcon", "liveUrl", "title", "w", "h", "bindHomeHeadData", "data", "Lcom/showstartfans/activity/model/home/NewYearHomeHeaderBean;", "playBanner", "playStatus", "", "playSvga", "play", "setHideView", "setShowView", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class HomeShowHeadView extends LinearLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final Lazy c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Handler f5785d;

    /* compiled from: HomeShowHeadView.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/activitys/maintab/HomeShowHeadView$bindData$1$1", "Lcom/opensource/svgaplayer/SVGAParser$ParseCompletion;", "onComplete", "", "videoItem", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "onError", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeShowHeadView f5786a;

        public a(HomeShowHeadView homeShowHeadView) {
        }

        @Override // h.s.a.h.d
        public void a(@NotNull j jVar) {
        }

        @Override // h.s.a.h.d
        public void onError() {
        }
    }

    /* compiled from: HomeShowHeadView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/showstartfans/activity/activitys/maintab/ExcellentRepresentationAdapter;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<u8> {
        public final /* synthetic */ HomeShowHeadView this$0;

        public b(HomeShowHeadView homeShowHeadView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ u8 invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final u8 invoke() {
        }
    }

    public HomeShowHeadView(@Nullable Context context) {
    }

    public static final /* synthetic */ Handler c(HomeShowHeadView homeShowHeadView) {
    }

    private final void d(Context context, String str) {
    }

    private static final void e(n nVar) {
    }

    private static final void g(HomeShowHeadView homeShowHeadView, String str) {
    }

    private final u8 getEShowAdapter() {
    }

    private static final void h(String str, Context context, String str2, View view) {
    }

    private static final void j(HomeShowHeadView homeShowHeadView, List list, int i2) {
    }

    public static /* synthetic */ void k(HomeShowHeadView homeShowHeadView, List list, int i2) {
    }

    public static /* synthetic */ void l(String str, Context context, String str2, View view) {
    }

    public static /* synthetic */ void m(HomeShowHeadView homeShowHeadView, String str) {
    }

    public static /* synthetic */ boolean n(HomeShowHeadView homeShowHeadView, Message message) {
    }

    public static /* synthetic */ void o(n nVar) {
    }

    private static final boolean p(HomeShowHeadView homeShowHeadView, Message message) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void f(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, int i2, int i3) {
    }

    public final void i(@Nullable NewYearHomeHeaderBean newYearHomeHeaderBean) {
    }

    public final void q(boolean z) {
    }

    public final void r(boolean z) {
    }

    public final void s() {
    }

    public final void t() {
    }

    public HomeShowHeadView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public HomeShowHeadView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
