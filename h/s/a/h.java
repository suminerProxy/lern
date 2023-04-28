package h.s.a;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.umeng.analytics.pro.am;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SVGAParser.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 G2\u00020\u0001:\u0003.D=B\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bF\u0010\u001eJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010\u0010J'\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010(2\u0006\u0010'\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010\u0010J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b-\u0010\u0010J'\u0010.\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u0010/J1\u00102\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b5\u0010\u0010J!\u00106\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b6\u00107J3\u00108\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00101\u001a\u000200H\u0007¢\u0006\u0004\b8\u00103R\u0018\u0010:\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00109R\u0016\u0010;\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0014R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010\u0014¨\u0006H"}, d2 = {"Lh/s/a/h;", "", "Lh/s/a/j;", "videoItem", "Lh/s/a/h$d;", "callback", "", "C", "(Lh/s/a/j;Lh/s/a/h$d;)V", "Ljava/lang/Exception;", "e", "D", "(Ljava/lang/Exception;Lh/s/a/h$d;)V", "", "cacheKey", am.aH, "(Ljava/lang/String;Lh/s/a/h$d;)V", "Ljava/io/InputStream;", "inputStream", "", "I", "(Ljava/io/InputStream;)[B", "byteArray", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "([B)[B", "L", "(Ljava/io/InputStream;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "B", "(Landroid/content/Context;)V", "", TUIConstants.TUIBeauty.PARAM_NAME_FRAME_WIDTH, TUIConstants.TUIBeauty.PARAM_NAME_FRAME_HEIGHT, "K", "(II)V", "name", am.aI, "Ljava/net/URL;", "url", "Lkotlin/Function0;", "x", "(Ljava/net/URL;Lh/s/a/h$d;)Lkotlin/jvm/functions/Function0;", "a", "error", "y", "b", "(Ljava/io/InputStream;Ljava/lang/String;Lh/s/a/h$d;)V", "", "closeInputStream", am.aE, "(Ljava/io/InputStream;Ljava/lang/String;Lh/s/a/h$d;Z)V", "assetsName", "F", "G", "(Ljava/net/URL;Lh/s/a/h$d;)V", ExifInterface.LONGITUDE_EAST, "Landroid/content/Context;", "mContext", "mFrameWidth", "Lh/s/a/h$c;", "d", "Lh/s/a/h$c;", "z", "()Lh/s/a/h$c;", "J", "(Lh/s/a/h$c;)V", "fileDownloader", am.aF, "mFrameHeight", "<init>", "i", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    private static final String f17789e = "SVGAParser";

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicInteger f17790f = null;

    /* renamed from: g  reason: collision with root package name */
    private static h f17791g;

    /* renamed from: h  reason: collision with root package name */
    private static ExecutorService f17792h;

    /* renamed from: i  reason: collision with root package name */
    public static final b f17793i = null;

    /* renamed from: a  reason: collision with root package name */
    private Context f17794a;
    private volatile int b;
    private volatile int c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private c f17795d;

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a implements ThreadFactory {
        public static final a b = null;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public final Thread newThread(Runnable runnable) {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR*\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"h/s/a/h$b", "", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "", "b", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "Lh/s/a/h;", "d", "()Lh/s/a/h;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "threadPoolExecutor", "Ljava/util/concurrent/ExecutorService;", "a", "()Ljava/util/concurrent/ExecutorService;", am.aF, "(Ljava/util/concurrent/ExecutorService;)V", "", "TAG", "Ljava/lang/String;", "mShareParser", "Lh/s/a/h;", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNum", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b {
        private b() {
        }

        public final ExecutorService a() {
        }

        public final void b(@NotNull ThreadPoolExecutor threadPoolExecutor) {
        }

        public final void c(ExecutorService executorService) {
        }

        @NotNull
        public final h d() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJg\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042%\u0010\u000e\u001a!\u0012\u0017\u0012\u00150\u000bj\u0002`\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"h/s/a/h$c", "", "Ljava/net/URL;", "url", "Lkotlin/Function1;", "Ljava/io/InputStream;", "Lkotlin/ParameterName;", "name", "inputStream", "", "complete", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failure", "Lkotlin/Function0;", "b", "(Ljava/net/URL;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "", "a", "Z", "()Z", am.aF, "(Z)V", "noCache", "<init>", "()V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private boolean f17796a;

        /* compiled from: SVGAParser.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a implements Runnable {
            public final /* synthetic */ c b;
            public final /* synthetic */ URL c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f17797d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ Function1 f17798e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Function1 f17799f;

            public a(c cVar, URL url, Ref.BooleanRef booleanRef, Function1 function1, Function1 function12) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        /* compiled from: SVGAParser.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Ref.BooleanRef $cancelled;

            public b(Ref.BooleanRef booleanRef) {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public final boolean a() {
        }

        @NotNull
        public Function0<Unit> b(@NotNull URL url, @NotNull Function1<? super InputStream, Unit> function1, @NotNull Function1<? super Exception, Unit> function12) {
        }

        public final void c(boolean z) {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h/s/a/h$d", "", "Lh/s/a/j;", "videoItem", "", "a", "(Lh/s/a/j;)V", "onError", "()V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface d {
        void a(@NotNull h.s.a.j jVar);

        void onError();
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()V", "com/opensource/svgaplayer/SVGAParser$$special$$inlined$let$lambda$2", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ String $cacheKey$inlined;
        public final /* synthetic */ d $callback$inlined;
        public final /* synthetic */ h.s.a.j $videoItem;
        public final /* synthetic */ h this$0;

        public e(h.s.a.j jVar, h hVar, String str, d dVar) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class f implements Runnable {
        public final /* synthetic */ h b;
        public final /* synthetic */ InputStream c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f17800d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f17801e;

        /* compiled from: SVGAParser.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "run", "()V", "com/opensource/svgaplayer/SVGAParser$_decodeFromInputStream$1$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a implements Runnable {
            public final /* synthetic */ byte[] b;
            public final /* synthetic */ f c;

            public a(byte[] bArr, f fVar) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        /* compiled from: SVGAParser.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()V", "com/opensource/svgaplayer/SVGAParser$_decodeFromInputStream$1$$special$$inlined$let$lambda$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ h.s.a.j $videoItem;
            public final /* synthetic */ f this$0;

            public b(h.s.a.j jVar, f fVar) {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public f(h hVar, InputStream inputStream, String str, d dVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class g implements Runnable {
        public final /* synthetic */ h b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f17802d;

        public g(h hVar, String str, d dVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* renamed from: h.s.a.h$h  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RunnableC0341h implements Runnable {
        public final /* synthetic */ h b;
        public final /* synthetic */ InputStream c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f17803d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f17804e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f17805f;

        /* compiled from: SVGAParser.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()V", "com/opensource/svgaplayer/SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: h.s.a.h$h$a */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ h.s.a.j $videoItem;
            public final /* synthetic */ RunnableC0341h this$0;

            public a(h.s.a.j jVar, RunnableC0341h runnableC0341h) {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        public RunnableC0341h(h hVar, InputStream inputStream, String str, d dVar, boolean z) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class i implements Runnable {
        public final /* synthetic */ h b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f17806d;

        public i(h hVar, String str, d dVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/InputStream;", "it", "", "invoke", "(Ljava/io/InputStream;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class j extends Lambda implements Function1<InputStream, Unit> {
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ d $callback;
        public final /* synthetic */ h this$0;

        public j(h hVar, String str, d dVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InputStream inputStream) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InputStream inputStream) {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class k extends Lambda implements Function1<Exception, Unit> {
        public final /* synthetic */ d $callback;
        public final /* synthetic */ h this$0;

        public k(h hVar, d dVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Exception exc) {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class l implements Runnable {
        public final /* synthetic */ d b;
        public final /* synthetic */ h.s.a.j c;

        public l(d dVar, h.s.a.j jVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: SVGAParser.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class m implements Runnable {
        public final /* synthetic */ d b;

        public m(d dVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public h(@Nullable Context context) {
    }

    private final byte[] A(byte[] bArr) {
    }

    private final void C(h.s.a.j jVar, d dVar) {
    }

    private final void D(Exception exc, d dVar) {
    }

    public static /* synthetic */ void H(h hVar, InputStream inputStream, String str, d dVar, boolean z, int i2, Object obj) {
    }

    private final byte[] I(InputStream inputStream) {
    }

    private final void L(InputStream inputStream, String str) {
    }

    public static final /* synthetic */ void c(h hVar, String str, d dVar) {
    }

    public static final /* synthetic */ Context d(h hVar) {
    }

    public static final /* synthetic */ int e(h hVar) {
    }

    public static final /* synthetic */ int f(h hVar) {
    }

    public static final /* synthetic */ h g() {
    }

    public static final /* synthetic */ AtomicInteger h() {
    }

    public static final /* synthetic */ ExecutorService i() {
    }

    public static final /* synthetic */ byte[] j(h hVar, byte[] bArr) {
    }

    public static final /* synthetic */ void k(h hVar, h.s.a.j jVar, d dVar) {
    }

    public static final /* synthetic */ void l(h hVar, Exception exc, d dVar) {
    }

    public static final /* synthetic */ byte[] m(h hVar, InputStream inputStream) {
    }

    public static final /* synthetic */ void n(h hVar, Context context) {
    }

    public static final /* synthetic */ void o(h hVar, int i2) {
    }

    public static final /* synthetic */ void p(h hVar, int i2) {
    }

    public static final /* synthetic */ void q(h hVar) {
    }

    public static final /* synthetic */ void r(ExecutorService executorService) {
    }

    public static final /* synthetic */ void s(h hVar, InputStream inputStream, String str) {
    }

    private final void u(String str, d dVar) {
    }

    public static /* synthetic */ void w(h hVar, InputStream inputStream, String str, d dVar, boolean z, int i2, Object obj) {
    }

    public final void B(@NotNull Context context) {
    }

    @Deprecated(message = "This method has been deprecated from 2.4.0.", replaceWith = @ReplaceWith(expression = "this.decodeFromInputStream(inputStream, cacheKey, callback, closeInputStream)", imports = {}))
    public final void E(@NotNull InputStream inputStream, @NotNull String str, @Nullable d dVar, boolean z) {
    }

    @Deprecated(message = "This method has been deprecated from 2.4.0.", replaceWith = @ReplaceWith(expression = "this.decodeFromAssets(assetsName, callback)", imports = {}))
    public final void F(@NotNull String str, @Nullable d dVar) {
    }

    @Deprecated(message = "This method has been deprecated from 2.4.0.", replaceWith = @ReplaceWith(expression = "this.decodeFromURL(url, callback)", imports = {}))
    public final void G(@NotNull URL url, @Nullable d dVar) {
    }

    public final void J(@NotNull c cVar) {
    }

    public final void K(int i2, int i3) {
    }

    public final void a(@NotNull String str, @Nullable d dVar) {
    }

    public final void b(@NotNull InputStream inputStream, @NotNull String str, @Nullable d dVar) {
    }

    public final void t(@NotNull String str, @Nullable d dVar) {
    }

    public final void v(@NotNull InputStream inputStream, @NotNull String str, @Nullable d dVar, boolean z) {
    }

    @Nullable
    public final Function0<Unit> x(@NotNull URL url, @Nullable d dVar) {
    }

    public final void y(@NotNull String str, @Nullable d dVar) {
    }

    @NotNull
    public final c z() {
    }
}
