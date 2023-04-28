package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.showstartfans.activity.view.SVGAInRecycleView;
import com.sobot.network.http.model.SobotProgress;
import com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import h.a.a.a.a.i.g;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImSoundView.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0017J,\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u00122\b\u0010-\u001a\u0004\u0018\u00010\u0012J\u000e\u0010.\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u0017J\u0006\u0010/\u001a\u00020\"R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/showstartfans/activity/view/custom_im_ui/view/ImSoundView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AUDIO_MAX_WIDTH", "AUDIO_MIN_WIDTH", DiskLruCache.READ, "UNREAD", "audioContentView", "Landroid/widget/LinearLayout;", "audioTimeText", "Landroid/widget/TextView;", "audio_play_svga", "Lcom/showstartfans/activity/view/SVGAInRecycleView;", "audio_time_tv_Right", "isInLeft", "", "isReply", "iv_audio_normal", "Landroid/widget/ImageView;", "playingIndex", "svga_audio_black", "", "svga_audio_white", "vLeftPadding", "Landroid/view/View;", "checkTextColor", "", "getSound", "messageBean", "Lcom/tencent/qcloud/tuikit/tuichat/bean/message/SoundMessageBean;", "playAnimal", "isSelf", "setData", "msg", "Lcom/tencent/qcloud/tuikit/tuichat/bean/message/TUIMessageBean;", g.C, "unreadAudioText", "isReadText", "setReplyData", "stopAnimal", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class ImSoundView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final String c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final String f7199d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7200e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7201f;

    /* renamed from: g  reason: collision with root package name */
    private final int f7202g;

    /* renamed from: h  reason: collision with root package name */
    private final int f7203h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private TextView f7204i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    private TextView f7205j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f7206k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    private ImageView f7207l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    private SVGAInRecycleView f7208m;

    /* renamed from: n  reason: collision with root package name */
    private int f7209n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private View f7210o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f7211p;
    private boolean q;

    /* compiled from: ImSoundView.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"com/showstartfans/activity/view/custom_im_ui/view/ImSoundView$getSound$1", "Lcom/tencent/qcloud/tuikit/tuichat/bean/message/SoundMessageBean$SoundDownloadCallback;", "onError", "", "code", "", "desc", "", "onProgress", SobotProgress.CURRENT_SIZE, "", SobotProgress.TOTAL_SIZE, "onSuccess", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements SoundMessageBean.SoundDownloadCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SoundMessageBean f7212a;
        public final /* synthetic */ String b;

        public a(SoundMessageBean soundMessageBean, String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean.SoundDownloadCallback
        public void onError(int i2, @NotNull String str) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean.SoundDownloadCallback
        public void onProgress(long j2, long j3) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.SoundMessageBean.SoundDownloadCallback
        public void onSuccess() {
        }
    }

    public ImSoundView(@NotNull Context context) {
    }

    private final void c() {
    }

    private final void d(SoundMessageBean soundMessageBean) {
    }

    public static /* synthetic */ void e(ImSoundView imSoundView, Boolean bool) {
    }

    public static /* synthetic */ void f(SoundMessageBean soundMessageBean, ImSoundView imSoundView, TUIMessageBean tUIMessageBean, TextView textView, int i2, View view) {
    }

    private static final void i(SoundMessageBean soundMessageBean, ImSoundView imSoundView, TUIMessageBean tUIMessageBean, TextView textView, int i2, View view) {
    }

    private static final void j(ImSoundView imSoundView, Boolean bool) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final void g(boolean z) {
    }

    public final void h(@Nullable TUIMessageBean tUIMessageBean, int i2, @Nullable TextView textView, @Nullable TextView textView2) {
    }

    public final void k() {
    }

    public final void setReplyData(boolean z) {
    }

    public ImSoundView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public ImSoundView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
