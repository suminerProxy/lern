package h.s.a;

import android.graphics.Bitmap;
import android.media.SoundPool;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.opensource.svgaplayer.proto.AudioEntity;
import com.opensource.svgaplayer.proto.MovieEntity;
import com.opensource.svgaplayer.proto.MovieParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.umeng.analytics.pro.am;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: SVGAVideoEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010r\u001a\u00020(¢\u0006\u0004\bs\u0010tB)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010r\u001a\u00020(\u0012\u0006\u0010u\u001a\u00020O\u0012\u0006\u0010v\u001a\u00020O¢\u0006\u0004\bs\u0010wB\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0006\u0010r\u001a\u00020(¢\u0006\u0004\bs\u0010xB)\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\u0006\u0010r\u001a\u00020(\u0012\u0006\u0010u\u001a\u00020O\u0012\u0006\u0010v\u001a\u00020O¢\u0006\u0004\bs\u0010yJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u0019J%\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0002¢\u0006\u0004\b#\u0010$J+\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020%2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020(2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u001aH\u0002¢\u0006\u0004\b/\u00100J#\u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b1\u00102J#\u00103\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a0'2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u00102J%\u00104\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0002¢\u0006\u0004\b4\u0010$J\u001f\u00107\u001a\n 6*\u0004\u0018\u000105052\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\u00042\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0000¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=R.\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010I\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010N\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010\u0019R$\u0010T\u001a\u00020O2\u0006\u0010P\u001a\u00020O8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010Q\u001a\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010QR\u0016\u0010X\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010QR\u0016\u0010[\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010\\\u001a\u00020O2\u0006\u0010P\u001a\u00020O8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010Q\u001a\u0004\bU\u0010SR(\u0010d\u001a\b\u0012\u0004\u0012\u00020^0]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010i\u001a\u00020e2\u0006\u0010P\u001a\u00020e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010f\u001a\u0004\bg\u0010hR\"\u0010o\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010k\u001a\u0004\bY\u0010l\"\u0004\bm\u0010nR(\u0010q\u001a\b\u0012\u0004\u0012\u00020*0]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010_\u001a\u0004\bW\u0010a\"\u0004\bp\u0010c¨\u0006z"}, d2 = {"Lh/s/a/j;", "", "Lorg/json/JSONObject;", "movieObject", "", ExifInterface.LONGITUDE_EAST, "(Lorg/json/JSONObject;)V", "Lcom/opensource/svgaplayer/proto/MovieParams;", "movieParams", "F", "(Lcom/opensource/svgaplayer/proto/MovieParams;)V", "json", am.aI, "", "imgName", "imgKey", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "filePath", "Landroid/graphics/Bitmap;", "b", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "Lcom/opensource/svgaplayer/proto/MovieEntity;", MapBundleKey.MapObjKey.OBJ_SL_OBJ, am.aB, "(Lcom/opensource/svgaplayer/proto/MovieEntity;)V", "", "byteArray", am.aF, "([BLjava/lang/String;)Landroid/graphics/Bitmap;", "w", "entity", am.aE, "Lkotlin/Function0;", "completionBlock", "D", "(Lcom/opensource/svgaplayer/proto/MovieEntity;Lkotlin/jvm/functions/Function0;)V", "Lcom/opensource/svgaplayer/proto/AudioEntity;", "audio", "Ljava/util/HashMap;", "Ljava/io/File;", "audiosFileMap", "Lh/s/a/m/a;", "d", "(Lcom/opensource/svgaplayer/proto/AudioEntity;Ljava/util/HashMap;)Lh/s/a/m/a;", "audioCache", "value", "e", "(Ljava/io/File;[B)Ljava/io/File;", "f", "(Lcom/opensource/svgaplayer/proto/MovieEntity;)Ljava/util/HashMap;", "g", "G", "Landroid/media/SoundPool;", "kotlin.jvm.PlatformType", "i", "(Lcom/opensource/svgaplayer/proto/MovieEntity;)Landroid/media/SoundPool;", "callback", am.aH, "(Lkotlin/jvm/functions/Function0;)V", "a", "()V", "Ljava/util/HashMap;", "n", "()Ljava/util/HashMap;", "z", "(Ljava/util/HashMap;)V", "imageMap", "Landroid/media/SoundPool;", "p", "()Landroid/media/SoundPool;", "B", "(Landroid/media/SoundPool;)V", "soundPool", "Lcom/opensource/svgaplayer/proto/MovieEntity;", "o", "()Lcom/opensource/svgaplayer/proto/MovieEntity;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "movieItem", "", "<set-?>", "I", "m", "()I", "frames", "l", "mFrameWidth", "k", "mFrameHeight", "j", "Ljava/io/File;", "mCacheDir", "FPS", "", "Lh/s/a/m/g;", "Ljava/util/List;", "q", "()Ljava/util/List;", "C", "(Ljava/util/List;)V", "spriteList", "Lh/s/a/n/c;", "Lh/s/a/n/c;", "r", "()Lh/s/a/n/c;", "videoSize", "", "Z", "()Z", "x", "(Z)V", "antiAlias", "y", "audioList", "cacheDir", "<init>", "(Lorg/json/JSONObject;Ljava/io/File;)V", TUIConstants.TUIBeauty.PARAM_NAME_FRAME_WIDTH, TUIConstants.TUIBeauty.PARAM_NAME_FRAME_HEIGHT, "(Lorg/json/JSONObject;Ljava/io/File;II)V", "(Lcom/opensource/svgaplayer/proto/MovieEntity;Ljava/io/File;)V", "(Lcom/opensource/svgaplayer/proto/MovieEntity;Ljava/io/File;II)V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private boolean f17808a;
    @Nullable
    private MovieEntity b;
    @NotNull
    private h.s.a.n.c c;

    /* renamed from: d  reason: collision with root package name */
    private int f17809d;

    /* renamed from: e  reason: collision with root package name */
    private int f17810e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private List<h.s.a.m.g> f17811f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private List<h.s.a.m.a> f17812g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private SoundPool f17813h;
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    private HashMap<String, Bitmap> f17814i;

    /* renamed from: j  reason: collision with root package name */
    private File f17815j;

    /* renamed from: k  reason: collision with root package name */
    private int f17816k;

    /* renamed from: l  reason: collision with root package name */
    private int f17817l;

    /* compiled from: SVGAVideoEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Function0 $callback;

        public a(Function0 function0) {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: SVGAVideoEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/media/SoundPool;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "onLoadComplete", "(Landroid/media/SoundPool;II)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b implements SoundPool.OnLoadCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f17818a;
        public final /* synthetic */ MovieEntity b;
        public final /* synthetic */ Function0 c;

        public b(Ref.IntRef intRef, MovieEntity movieEntity, Function0 function0) {
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public final void onLoadComplete(SoundPool soundPool, int i2, int i3) {
        }
    }

    public j(@NotNull JSONObject jSONObject, @NotNull File file) {
    }

    private final void D(MovieEntity movieEntity, Function0<Unit> function0) {
    }

    private final void E(JSONObject jSONObject) {
    }

    private final void F(MovieParams movieParams) {
    }

    private final void G(MovieEntity movieEntity, Function0<Unit> function0) {
    }

    private final Bitmap b(String str) {
    }

    private final Bitmap c(byte[] bArr, String str) {
    }

    private final h.s.a.m.a d(AudioEntity audioEntity, HashMap<String, File> hashMap) {
    }

    private final File e(File file, byte[] bArr) {
    }

    private final HashMap<String, File> f(MovieEntity movieEntity) {
    }

    private final HashMap<String, byte[]> g(MovieEntity movieEntity) {
    }

    private final String h(String str, String str2) {
    }

    private final SoundPool i(MovieEntity movieEntity) {
    }

    private final void s(MovieEntity movieEntity) {
    }

    private final void t(JSONObject jSONObject) {
    }

    private final void v(MovieEntity movieEntity) {
    }

    private final void w(JSONObject jSONObject) {
    }

    public final void A(@Nullable MovieEntity movieEntity) {
    }

    public final void B(@Nullable SoundPool soundPool) {
    }

    public final void C(@NotNull List<h.s.a.m.g> list) {
    }

    public final void a() {
    }

    public final boolean j() {
    }

    @NotNull
    public final List<h.s.a.m.a> k() {
    }

    public final int l() {
    }

    public final int m() {
    }

    @NotNull
    public final HashMap<String, Bitmap> n() {
    }

    @Nullable
    public final MovieEntity o() {
    }

    @Nullable
    public final SoundPool p() {
    }

    @NotNull
    public final List<h.s.a.m.g> q() {
    }

    @NotNull
    public final h.s.a.n.c r() {
    }

    public final void u(@NotNull Function0<Unit> function0) {
    }

    public final void x(boolean z) {
    }

    public final void y(@NotNull List<h.s.a.m.a> list) {
    }

    public final void z(@NotNull HashMap<String, Bitmap> hashMap) {
    }

    public j(@NotNull JSONObject jSONObject, @NotNull File file, int i2, int i3) {
    }

    public j(@NotNull MovieEntity movieEntity, @NotNull File file) {
    }

    public j(@NotNull MovieEntity movieEntity, @NotNull File file, int i2, int i3) {
    }
}
