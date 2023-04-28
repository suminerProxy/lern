package com.showstartfans.activity.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.taihebase.activity.view.RatioLayout;
import com.tencent.rtmp.ITXVodPlayListener;
import com.tencent.rtmp.TXVodPlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import h.a.a.a.a.i.g;
import h.y.a.n.h1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DyVideoView.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001:\u0001NB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u00010\u001dJ\b\u00105\u001a\u00020.H\u0002J\u0006\u00106\u001a\u00020.J\b\u00107\u001a\u00020.H\u0002J\u0006\u00108\u001a\u00020\fJ\u0010\u00109\u001a\u00020.2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010:\u001a\u00020.J\u0006\u0010;\u001a\u00020.J\u001a\u0010;\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010<\u001a\u00020\fJ\u0010\u0010=\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010>\u001a\u00020.J\u000e\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\tJ\u000e\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020\fJ\u000e\u0010C\u001a\u00020.2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010D\u001a\u00020.2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eJ\u0018\u0010E\u001a\u00020.2\u0006\u0010F\u001a\u00020\f2\b\b\u0002\u0010G\u001a\u00020\fJF\u0010H\u001a\u00020.2>\u00104\u001a:\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020.\u0018\u00010(j\u0004\u0018\u0001`/J\u001a\u0010I\u001a\u00020.2\b\u0010J\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010<\u001a\u00020\fJ\u000e\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020\tJ\u0006\u0010M\u001a\u00020.R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000RF\u0010'\u001a:\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020.\u0018\u00010(j\u0004\u0018\u0001`/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/showstartfans/activity/view/DyVideoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "CanControl", "", "TAG", "", "conver", "Lcom/facebook/drawee/view/SimpleDraweeView;", "converScaleMode", "Lcom/taihebase/activity/view/RatioLayout$Mode;", "converUrl", "conver_layout", "Lcom/taihebase/activity/view/RatioLayout;", "isLoop", "isPlayed", "isTouchPause", "iv_play_icon", "Landroid/widget/ImageView;", "listeners", "Ljava/util/ArrayList;", "Lcom/showstartfans/activity/view/DyVideoView$DySuperPlayerObserver;", "Lkotlin/collections/ArrayList;", "mSuperPlayer", "Lcom/taihe/videoplayer/model/SuperPlayerImpl;", "getMSuperPlayer", "()Lcom/taihe/videoplayer/model/SuperPlayerImpl;", "setMSuperPlayer", "(Lcom/taihe/videoplayer/model/SuperPlayerImpl;)V", "mSuperPlayerObserver", "Lcom/taihe/videoplayer/model/SuperPlayerObserver;", "onProgressListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", g.C, "duration", "", "Lcom/taihebase/activity/view/OnProgressChange;", "url", "video_view", "Lcom/tencent/rtmp/ui/TXCloudVideoView;", "addListener", "listener", "checkStopUI", "clearConver", "initPlayer", "isPlayering", "loadConverImage", "pause", "play", "showConver", "removeListener", "resume", "seek", "postion", "setCanControl", "can", "setConverScaleMode", "setConverUrl", "setLoop", "boolean", "useNormal", "setOnProgressListener", "setUrl", "videoUrl", "setVolume", "volume", "stop", "DySuperPlayerObserver", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class DyVideoView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final String c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private TXCloudVideoView f6652d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private h.x.g.k.b f6653e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private SimpleDraweeView f6654f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private RatioLayout f6655g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private ImageView f6656h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private String f6657i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private String f6658j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6659k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6660l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6661m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<a> f6662n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private Function2<? super Long, ? super Long, Unit> f6663o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6664p;
    @Nullable
    private RatioLayout.a q;
    @NotNull
    private final h.x.g.k.c r;

    /* compiled from: DyVideoView.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/showstartfans/activity/view/DyVideoView$DySuperPlayerObserver;", "", "()V", "onPlayBegin", "", "name", "", "onPlayLoading", "onPlayNormal", "onPlayPause", "isTouch", "", "onPlayPrepared", "onPlayProgress", "current", "", "duration", "onPlayStop", "onSeek", g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a {
        public void a(@Nullable String str) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(boolean z) {
        }

        public void e() {
        }

        public void f(long j2, long j3) {
        }

        public void g() {
        }

        public void h(int i2) {
        }
    }

    /* compiled from: DyVideoView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\f"}, d2 = {"com/showstartfans/activity/view/DyVideoView$initPlayer$1", "Lcom/tencent/rtmp/ITXVodPlayListener;", "onNetStatus", "", "p0", "Lcom/tencent/rtmp/TXVodPlayer;", "bundle", "Landroid/os/Bundle;", "onPlayEvent", "p1", "", "p2", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements ITXVodPlayListener {
        @Override // com.tencent.rtmp.ITXVodPlayListener
        public void onNetStatus(@Nullable TXVodPlayer tXVodPlayer, @Nullable Bundle bundle) {
        }

        @Override // com.tencent.rtmp.ITXVodPlayListener
        public void onPlayEvent(@Nullable TXVodPlayer tXVodPlayer, int i2, @Nullable Bundle bundle) {
        }
    }

    /* compiled from: DyVideoView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"com/showstartfans/activity/view/DyVideoView$mSuperPlayerObserver$1", "Lcom/taihe/videoplayer/model/SuperPlayerObserver;", "onPlayBegin", "", "name", "", "onPlayLoading", "onPlayNormal", "onPlayPause", "onPlayPrepared", "onPlayProgress", "current", "", "duration", "onPlayStop", "onSeek", g.C, "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends h.x.g.k.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DyVideoView f6665a;

        public c(DyVideoView dyVideoView) {
        }

        @Override // h.x.g.k.c
        public void b(@Nullable String str) {
        }

        @Override // h.x.g.k.c
        public void c() {
        }

        @Override // h.x.g.k.c
        public void d() {
        }

        @Override // h.x.g.k.c
        public void e() {
        }

        @Override // h.x.g.k.c
        public void f() {
        }

        @Override // h.x.g.k.c
        public void g(long j2, long j3) {
        }

        @Override // h.x.g.k.c
        public void h() {
        }

        @Override // h.x.g.k.c
        public void k(int i2) {
        }
    }

    /* compiled from: DyVideoView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/showstartfans/activity/view/DyVideoView$setUrl$1", "Lcom/taihebase/activity/utils/VideoUtils$OnGetVideoThumbListener;", "OnResule", "", "bitmap", "Landroid/graphics/Bitmap;", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class d implements h1.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DyVideoView f6666a;

        public d(DyVideoView dyVideoView) {
        }

        @Override // h.y.a.n.h1.c
        public void a(@Nullable Bitmap bitmap) {
        }
    }

    public DyVideoView(@NotNull Context context) {
    }

    public static /* synthetic */ void B(DyVideoView dyVideoView, boolean z, boolean z2, int i2, Object obj) {
    }

    public static /* synthetic */ void D(DyVideoView dyVideoView, String str, boolean z, int i2, Object obj) {
    }

    private static final void c(DyVideoView dyVideoView, View view) {
    }

    public static final /* synthetic */ void d(DyVideoView dyVideoView) {
    }

    public static final /* synthetic */ SimpleDraweeView e(DyVideoView dyVideoView) {
    }

    public static final /* synthetic */ RatioLayout.a f(DyVideoView dyVideoView) {
    }

    public static final /* synthetic */ RatioLayout g(DyVideoView dyVideoView) {
    }

    public static final /* synthetic */ ArrayList h(DyVideoView dyVideoView) {
    }

    public static final /* synthetic */ Function2 i(DyVideoView dyVideoView) {
    }

    public static final /* synthetic */ boolean j(DyVideoView dyVideoView) {
    }

    public static final /* synthetic */ boolean k(DyVideoView dyVideoView) {
    }

    public static final /* synthetic */ void l(DyVideoView dyVideoView, boolean z) {
    }

    private final void n() {
    }

    private final void p() {
    }

    public static /* synthetic */ void r(DyVideoView dyVideoView, View view) {
    }

    public static /* synthetic */ void w(DyVideoView dyVideoView, String str, boolean z, int i2, Object obj) {
    }

    public final void A(boolean z, boolean z2) {
    }

    public final void C(@Nullable String str, boolean z) {
    }

    public final void E() {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Nullable
    public final h.x.g.k.b getMSuperPlayer() {
    }

    public final void m(@Nullable a aVar) {
    }

    public final void o() {
    }

    public final boolean q() {
    }

    public final void s(@Nullable String str) {
    }

    public final void setCanControl(boolean z) {
    }

    public final void setConverScaleMode(@NotNull RatioLayout.a aVar) {
    }

    public final void setConverUrl(@Nullable String str) {
    }

    public final void setMSuperPlayer(@Nullable h.x.g.k.b bVar) {
    }

    public final void setOnProgressListener(@Nullable Function2<? super Long, ? super Long, Unit> function2) {
    }

    public final void setVolume(int i2) {
    }

    public final void t() {
    }

    public final void u() {
    }

    public final void v(@Nullable String str, boolean z) {
    }

    public final void x(@Nullable a aVar) {
    }

    public final void y() {
    }

    public final void z(int i2) {
    }

    public DyVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public DyVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
