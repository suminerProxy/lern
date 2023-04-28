package com.showstartfans.activity.view.videocut;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import h.u.a.u.f4.d;
import h.u.a.u.f4.g;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoConverSelectView.kt */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u00102\u001a\u00020\tH\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\tH\u0002J\u0006\u00106\u001a\u00020\tJ\u001a\u00107\u001a\u00020,2\u0006\u00105\u001a\u00020\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010,J\"\u00109\u001a\u0004\u0018\u00010$2\u0006\u0010:\u001a\u00020;2\u0006\u00105\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0002J\u0012\u0010=\u001a\u0002042\b\u0010>\u001a\u0004\u0018\u00010,H\u0002J\"\u0010?\u001a\u0002042\b\u0010>\u001a\u0004\u0018\u00010,2\b\u0010@\u001a\u0004\u0018\u00010)2\u0006\u0010!\u001a\u00020\u0013J\u0006\u0010A\u001a\u000204J0\u0010B\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\u0006\u0010C\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010!\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/showstartfans/activity/view/videocut/VideoConverSelectView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "CONVET_PICK_TIME", "RECYCLER_VIEW_PADDING", "THUMB_HEIGHT", "THUMB_WIDTH", "currentPage", "endPosition", "", "isDestoryed", "", "mDuration", "mOnScrollListener", "com/showstartfans/activity/view/videocut/VideoConverSelectView$mOnScrollListener$1", "Lcom/showstartfans/activity/view/videocut/VideoConverSelectView$mOnScrollListener$1;", "mThumbsTotalCount", "mVideoThumbAdapter", "Lcom/showstartfans/activity/view/videocut/VideoTrimmerAdapter;", "manager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "manager$delegate", "Lkotlin/Lazy;", "needThumbs", "scrollPos", "showBitmap", "Landroid/graphics/Bitmap;", "snapHelper", "Landroidx/recyclerview/widget/PagerSnapHelper;", "startPosition", "videoConverShowView", "Landroid/widget/ImageView;", "videoHeight", "videoPath", "", "videoUri", "Landroid/net/Uri;", "videoWidth", "video_conver_recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "calcScrollXDistance", "checkIndex", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "getCheckIndex", "getConverFile", "outputDir", "getFrameBitmap", "retriever", "Landroid/media/MediaMetadataRetriever;", AnimatedPasterJsonConfig.CONFIG_WIDTH, "initVideoInfoData", "path", "loadData", "videoConver", "onDestory", "startShootVideoThumbs", "totalThumbsCount", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class VideoConverSelectView extends FrameLayout {
    @NotNull
    public Map<Integer, View> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private int f7287d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView f7288e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private g f7289f;

    /* renamed from: g  reason: collision with root package name */
    private int f7290g;

    /* renamed from: h  reason: collision with root package name */
    private int f7291h;

    /* renamed from: i  reason: collision with root package name */
    private long f7292i;

    /* renamed from: j  reason: collision with root package name */
    private int f7293j;

    /* renamed from: k  reason: collision with root package name */
    private int f7294k;

    /* renamed from: l  reason: collision with root package name */
    private int f7295l;

    /* renamed from: m  reason: collision with root package name */
    private long f7296m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    private ImageView f7297n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private PagerSnapHelper f7298o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    private final Lazy f7299p;
    private int q;
    private long r;
    private long s;
    @Nullable
    private Uri t;
    @Nullable
    private Bitmap u;
    private boolean v;
    private boolean w;
    @NotNull
    private String x;
    @NotNull
    private final a y;

    /* compiled from: VideoConverSelectView.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/showstartfans/activity/view/videocut/VideoConverSelectView$mOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoConverSelectView f7300a;

        public a(VideoConverSelectView videoConverSelectView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NotNull RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* compiled from: VideoConverSelectView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/LinearLayoutManager;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b extends Lambda implements Function0<LinearLayoutManager> {
        public final /* synthetic */ VideoConverSelectView this$0;

        public b(VideoConverSelectView videoConverSelectView) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ LinearLayoutManager invoke() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final LinearLayoutManager invoke() {
        }
    }

    /* compiled from: VideoConverSelectView.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/showstartfans/activity/view/videocut/VideoConverSelectView$startShootVideoThumbs$1", "Lcom/showstartfans/activity/view/videocut/BackgroundExecutor$Task;", "execute", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class c extends d.a {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Context f7301i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Uri f7302j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f7303k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ VideoConverSelectView f7304l;

        public c(Context context, Uri uri, int i2, VideoConverSelectView videoConverSelectView) {
        }

        private static final void l(VideoConverSelectView videoConverSelectView, Ref.ObjectRef objectRef) {
        }

        public static /* synthetic */ void m(VideoConverSelectView videoConverSelectView, Ref.ObjectRef objectRef) {
        }

        @Override // h.u.a.u.f4.d.a
        public void j() {
        }
    }

    public VideoConverSelectView(@NotNull Context context) {
    }

    private final void A(Context context, Uri uri, int i2, long j2, long j3) {
    }

    public static final /* synthetic */ int c(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ void d(VideoConverSelectView videoConverSelectView, int i2) {
    }

    public static final /* synthetic */ int e(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ Bitmap f(VideoConverSelectView videoConverSelectView, MediaMetadataRetriever mediaMetadataRetriever, int i2, int i3) {
    }

    public static final /* synthetic */ long g(VideoConverSelectView videoConverSelectView) {
    }

    private final LinearLayoutManager getManager() {
    }

    public static final /* synthetic */ int h(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ g i(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ LinearLayoutManager j(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ int k(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ PagerSnapHelper l(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ int m(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ boolean n(VideoConverSelectView videoConverSelectView) {
    }

    public static final /* synthetic */ void o(VideoConverSelectView videoConverSelectView, int i2) {
    }

    public static final /* synthetic */ void p(VideoConverSelectView videoConverSelectView, long j2) {
    }

    private final int q() {
    }

    private final void r(int i2) {
    }

    private static final void s(VideoConverSelectView videoConverSelectView) {
    }

    public static /* synthetic */ String u(VideoConverSelectView videoConverSelectView, int i2, String str, int i3, Object obj) {
    }

    private final Bitmap v(MediaMetadataRetriever mediaMetadataRetriever, int i2, int i3) {
    }

    private final void w(String str) {
    }

    public static /* synthetic */ void x(VideoConverSelectView videoConverSelectView) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    public final int getCheckIndex() {
    }

    @NotNull
    public final String t(int i2, @Nullable String str) {
    }

    public final void y(@Nullable String str, @Nullable ImageView imageView, boolean z) {
    }

    public final void z() {
    }

    public VideoConverSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public VideoConverSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
