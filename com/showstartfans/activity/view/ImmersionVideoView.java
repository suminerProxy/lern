package com.showstartfans.activity.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.showstartfans.activity.model.Article;
import com.showstartfans.activity.model.SceneDetailCommBean;
import com.showstartfans.activity.view.BaseImmersionView;
import com.showstartfans.activity.view.DyVideoView;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXVodPlayer;
import h.a.a.a.a.i.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImmersionVideoView.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0018H\u0016J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0018H\u0014J\b\u0010&\u001a\u00020\u0018H\u0016J\u0012\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u0018H\u0016J\u0018\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\tH\u0014J\u0006\u0010.\u001a\u00020\u0018R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/showstartfans/activity/view/ImmersionVideoView;", "Lcom/showstartfans/activity/view/BaseImmersionView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iv_center", "Landroid/widget/ImageView;", "mData", "Lcom/showstartfans/activity/model/Article;", "mDuration", "", "mSuperPlayerObserver", "Lcom/showstartfans/activity/view/DyVideoView$DySuperPlayerObserver;", "player", "Lcom/showstartfans/activity/view/DyVideoView;", "v_full_black", "Landroid/view/View;", "OnBindViewHolder_", "", g.C, "data", "getLayoutId", "initVideo", "initView", "onActivityFinish", "onActivityPause", "onActivityResume", "onControlSeetTo", "progress", "touchMode", "Lcom/showstartfans/activity/view/BaseImmersionView$SeekBarMode;", "onDetachedFromWindow", "onPageHide", "onReviewSuccess", "bean", "Lcom/showstartfans/activity/model/SceneDetailCommBean;", "onSelected", "onVisibilityChanged", "changedView", "visibility", "pauseVideo", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImmersionVideoView extends BaseImmersionView {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Map<Integer, View> f6771d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private ImageView f6772e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private View f6773f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private DyVideoView f6774g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private Article f6775h;

    /* renamed from: i  reason: collision with root package name */
    private long f6776i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private final DyVideoView.a f6777j;

    /* compiled from: ImmersionVideoView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", g.C, "", "duration", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends Lambda implements Function2<Long, Long, Unit> {
        public final /* synthetic */ ImmersionVideoView this$0;

        public a(ImmersionVideoView immersionVideoView) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Long l2, Long l3) {
        }

        public final void invoke(long j2, long j3) {
        }
    }

    /* compiled from: ImmersionVideoView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/view/ImmersionVideoView$initVideo$2", "Lcom/tencent/rtmp/ITXVodPlayListener;", "onNetStatus", "", "p0", "Lcom/tencent/rtmp/TXVodPlayer;", "bundle", "Landroid/os/Bundle;", "onPlayEvent", "p1", "", "p2", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements ITXVodPlayListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImmersionVideoView f6778a;

        public b(ImmersionVideoView immersionVideoView) {
        }

        @Override // com.tencent.rtmp.ITXVodPlayListener
        public void onNetStatus(@Nullable TXVodPlayer tXVodPlayer, @Nullable Bundle bundle) {
        }

        @Override // com.tencent.rtmp.ITXVodPlayListener
        public void onPlayEvent(@Nullable TXVodPlayer tXVodPlayer, int i2, @Nullable Bundle bundle) {
        }
    }

    /* compiled from: ImmersionVideoView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "isDouble", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends Lambda implements Function2<View, Boolean, Unit> {
        public final /* synthetic */ ImmersionVideoView this$0;

        public c(ImmersionVideoView immersionVideoView) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Boolean bool) {
        }

        public final void invoke(@NotNull View view, boolean z) {
        }
    }

    /* compiled from: ImmersionVideoView.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"com/showstartfans/activity/view/ImmersionVideoView$mSuperPlayerObserver$1", "Lcom/showstartfans/activity/view/DyVideoView$DySuperPlayerObserver;", "onPlayBegin", "", "name", "", "onPlayLoading", "onPlayNormal", "onPlayPause", "isTouch", "", "onPlayPrepared", "onPlayProgress", "current", "", "duration", "onPlayStop", "onSeek", g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d extends DyVideoView.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImmersionVideoView f6779a;

        public d(ImmersionVideoView immersionVideoView) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void a(@Nullable String str) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void b() {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void c() {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void d(boolean z) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void e() {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void f(long j2, long j3) {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void g() {
        }

        @Override // com.showstartfans.activity.view.DyVideoView.a
        public void h(int i2) {
        }
    }

    public ImmersionVideoView(@Nullable Context context) {
    }

    public static final /* synthetic */ ImageView s(ImmersionVideoView immersionVideoView) {
    }

    public static final /* synthetic */ DyVideoView t(ImmersionVideoView immersionVideoView) {
    }

    public static final /* synthetic */ View u(ImmersionVideoView immersionVideoView) {
    }

    public static final /* synthetic */ void v(ImmersionVideoView immersionVideoView, long j2) {
    }

    private final void w() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void f(int i2, @Nullable Article article) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void g() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public int getLayoutId() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    @Nullable
    public View h(int i2) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void i() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void j() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void k() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void m() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void o(int i2, @NotNull BaseImmersionView.a aVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View view, int i2) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void p() {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void q(@Nullable SceneDetailCommBean sceneDetailCommBean) {
    }

    @Override // com.showstartfans.activity.view.BaseImmersionView
    public void r() {
    }

    public final void x() {
    }

    public ImmersionVideoView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public ImmersionVideoView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
