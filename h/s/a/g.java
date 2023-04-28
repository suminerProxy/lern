package h.s.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

/* compiled from: SVGADynamicEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b^\u00102J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJM\u0010$\u001a\u00020\u000626\u0010#\u001a2\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+Jw\u0010/\u001a\u00020\u00062`\u0010#\u001a\\\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00020,2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0006¢\u0006\u0004\b1\u00102R>\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020403j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000204`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R>\u0010@\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001903j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0019`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R>\u0010C\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000203j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00107\u001a\u0004\bA\u00109\"\u0004\bB\u0010;Ró\u0001\u0010G\u001aÒ\u0001\u0012\u0004\u0012\u00020\u0004\u0012^\u0012\\\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00020,03jh\u0012\u0004\u0012\u00020\u0004\u0012^\u0012\\\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00020,`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u00107\u001a\u0004\bE\u00109\"\u0004\bF\u0010;R\u009e\u0001\u0010K\u001a~\u0012\u0004\u0012\u00020\u0004\u00124\u00122\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00020\u001c03j>\u0012\u0004\u0012\u00020\u0004\u00124\u00122\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00020\u001c`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R>\u0010N\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000403j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bL\u00109\"\u0004\bM\u0010;R>\u0010P\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t03j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u00107\u001a\u0004\bH\u00109\"\u0004\bO\u0010;R\"\u0010V\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR>\u0010Y\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020W03j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020W`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u00107\u001a\u0004\b=\u00109\"\u0004\bX\u0010;R>\u0010[\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001103j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u00107\u001a\u0004\bD\u00109\"\u0004\bZ\u0010;R>\u0010]\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001503j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015`58\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\b6\u00109\"\u0004\b\\\u0010;¨\u0006_"}, d2 = {"Lh/s/a/g;", "", "", "value", "", "forKey", "", ExifInterface.LONGITUDE_EAST, "(ZLjava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", am.aE, "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "url", "w", "(Ljava/lang/String;Ljava/lang/String;)V", "text", "Landroid/text/TextPaint;", "textPaint", "B", "(Ljava/lang/String;Landroid/text/TextPaint;Ljava/lang/String;)V", "Landroid/text/StaticLayout;", "layoutText", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Landroid/text/StaticLayout;Ljava/lang/String;)V", "Landroid/text/BoringLayout;", "z", "(Landroid/text/BoringLayout;Ljava/lang/String;)V", "Lkotlin/Function2;", "Landroid/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "", "frameIndex", "drawer", "p", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V", "", "clickKey", "n", "(Ljava/util/List;)V", "m", "(Ljava/lang/String;)V", "Lkotlin/Function4;", AnimatedPasterJsonConfig.CONFIG_WIDTH, AnimatedPasterJsonConfig.CONFIG_HEIGHT, "r", "(Lkotlin/jvm/functions/Function4;Ljava/lang/String;)V", "a", "()V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "h", "Ljava/util/HashMap;", "k", "()Ljava/util/HashMap;", "F", "(Ljava/util/HashMap;)V", "mClickMap", "f", "b", "o", "dynamicBoringLayoutText", "e", am.aI, "dynamicHidden", "j", "d", am.aB, "dynamicDrawerSized", "g", am.aF, "q", "dynamicDrawer", "i", "C", "dynamicText", "x", "dynamicImage", "Z", "l", "()Z", "G", "(Z)V", "isTextDirty", "Lh/s/a/b;", am.aH, "dynamicIClickArea", "D", "dynamicTextPaint", "y", "dynamicStaticLayoutText", "<init>", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class g {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Boolean> f17776a;
    @NotNull
    private HashMap<String, Bitmap> b;
    @NotNull
    private HashMap<String, String> c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, TextPaint> f17777d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, StaticLayout> f17778e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private HashMap<String, BoringLayout> f17779f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private HashMap<String, Function2<Canvas, Integer, Boolean>> f17780g;
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private HashMap<String, int[]> f17781h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private HashMap<String, h.s.a.b> f17782i;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    private HashMap<String, Function4<Canvas, Integer, Integer, Integer, Boolean>> f17783j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17784k;

    /* compiled from: SVGADynamicEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"h/s/a/g$a", "Lh/s/a/b;", "", "key", "", "x0", "y0", "x1", "y1", "", "a", "(Ljava/lang/String;IIII)V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a implements h.s.a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f17785a;

        public a(g gVar) {
        }

        @Override // h.s.a.b
        public void a(@NotNull String str, int i2, int i3, int i4, int i5) {
        }
    }

    /* compiled from: SVGADynamicEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"h/s/a/g$b", "Lh/s/a/b;", "", "key", "", "x0", "y0", "x1", "y1", "", "a", "(Ljava/lang/String;IIII)V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b implements h.s.a.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f17786a;

        public b(g gVar) {
        }

        @Override // h.s.a.b
        public void a(@NotNull String str, int i2, int i3, int i4, int i5) {
        }
    }

    /* compiled from: SVGADynamicEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class c implements Runnable {
        public final /* synthetic */ g b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Handler f17787d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f17788e;

        /* compiled from: SVGADynamicEntity.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "run", "()V", "com/opensource/svgaplayer/SVGADynamicEntity$setDynamicImage$1$$special$$inlined$use$lambda$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public static final class a implements Runnable {
            public final /* synthetic */ Bitmap b;
            public final /* synthetic */ c c;

            public a(Bitmap bitmap, c cVar) {
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }

        public c(g gVar, String str, Handler handler, String str2) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public final void A(@NotNull StaticLayout staticLayout, @NotNull String str) {
    }

    public final void B(@NotNull String str, @NotNull TextPaint textPaint, @NotNull String str2) {
    }

    public final void C(@NotNull HashMap<String, String> hashMap) {
    }

    public final void D(@NotNull HashMap<String, TextPaint> hashMap) {
    }

    public final void E(boolean z, @NotNull String str) {
    }

    public final void F(@NotNull HashMap<String, int[]> hashMap) {
    }

    public final void G(boolean z) {
    }

    public final void a() {
    }

    @NotNull
    public final HashMap<String, BoringLayout> b() {
    }

    @NotNull
    public final HashMap<String, Function2<Canvas, Integer, Boolean>> c() {
    }

    @NotNull
    public final HashMap<String, Function4<Canvas, Integer, Integer, Integer, Boolean>> d() {
    }

    @NotNull
    public final HashMap<String, Boolean> e() {
    }

    @NotNull
    public final HashMap<String, h.s.a.b> f() {
    }

    @NotNull
    public final HashMap<String, Bitmap> g() {
    }

    @NotNull
    public final HashMap<String, StaticLayout> h() {
    }

    @NotNull
    public final HashMap<String, String> i() {
    }

    @NotNull
    public final HashMap<String, TextPaint> j() {
    }

    @NotNull
    public final HashMap<String, int[]> k() {
    }

    public final boolean l() {
    }

    public final void m(@NotNull String str) {
    }

    public final void n(@NotNull List<String> list) {
    }

    public final void o(@NotNull HashMap<String, BoringLayout> hashMap) {
    }

    public final void p(@NotNull Function2<? super Canvas, ? super Integer, Boolean> function2, @NotNull String str) {
    }

    public final void q(@NotNull HashMap<String, Function2<Canvas, Integer, Boolean>> hashMap) {
    }

    public final void r(@NotNull Function4<? super Canvas, ? super Integer, ? super Integer, ? super Integer, Boolean> function4, @NotNull String str) {
    }

    public final void s(@NotNull HashMap<String, Function4<Canvas, Integer, Integer, Integer, Boolean>> hashMap) {
    }

    public final void t(@NotNull HashMap<String, Boolean> hashMap) {
    }

    public final void u(@NotNull HashMap<String, h.s.a.b> hashMap) {
    }

    public final void v(@NotNull Bitmap bitmap, @NotNull String str) {
    }

    public final void w(@NotNull String str, @NotNull String str2) {
    }

    public final void x(@NotNull HashMap<String, Bitmap> hashMap) {
    }

    public final void y(@NotNull HashMap<String, StaticLayout> hashMap) {
    }

    public final void z(@NotNull BoringLayout boringLayout, @NotNull String str) {
    }
}
