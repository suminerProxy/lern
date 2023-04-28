package h.s.a.m;

import android.graphics.Matrix;
import android.graphics.Path;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.opensource.svgaplayer.proto.ShapeEntity;
import com.umeng.analytics.pro.am;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: SVGAVideoShapeEntity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0010&B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b3\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b3\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010#\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0013\u0010\"R@\u0010)\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0001\u0018\u00010$2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0001\u0018\u00010$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0013\u0010-\u001a\u00020*8F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010,R$\u00102\u001a\u00020.2\u0006\u0010\u001b\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lh/s/a/m/d;", "", "Lorg/json/JSONObject;", MapBundleKey.MapObjKey.OBJ_SL_OBJ, "", "o", "(Lorg/json/JSONObject;)V", "Lcom/opensource/svgaplayer/proto/ShapeEntity;", "n", "(Lcom/opensource/svgaplayer/proto/ShapeEntity;)V", "i", "h", "k", "j", "m", "l", "a", "()V", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", am.aF, "()Landroid/graphics/Path;", "p", "(Landroid/graphics/Path;)V", "shapePath", "Lh/s/a/m/d$a;", "<set-?>", "Lh/s/a/m/d$a;", "d", "()Lh/s/a/m/d$a;", "styles", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "transform", "", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "args", "", "g", "()Z", "isKeep", "Lh/s/a/m/d$b;", "Lh/s/a/m/d$b;", "f", "()Lh/s/a/m/d$b;", "type", "<init>", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class d {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private b f17845a;
    @Nullable
    private Map<String, ? extends Object> b;
    @Nullable
    private a c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Matrix f17846d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private Path f17847e;

    /* compiled from: SVGAVideoShapeEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010 \u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0004\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010\"\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\f\u0010\u0017\"\u0004\b!\u0010\u0019R*\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R*\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b&\u0010\u0011¨\u0006*"}, d2 = {"h/s/a/m/d$a", "", "", "<set-?>", "g", "[F", am.aF, "()[F", "j", "([F)V", "lineDash", "", "b", "I", "f", "()I", "m", "(I)V", "stroke", "", "e", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "lineJoin", "", "F", "()F", "n", "(F)V", "strokeWidth", "i", "lineCap", "a", "h", "fill", "l", "miterLimit", "<init>", "()V", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f17848a;
        private int b;
        private float c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private String f17849d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private String f17850e;

        /* renamed from: f  reason: collision with root package name */
        private int f17851f;
        @NotNull

        /* renamed from: g  reason: collision with root package name */
        private float[] f17852g;

        public final int a() {
        }

        @NotNull
        public final String b() {
        }

        @NotNull
        public final float[] c() {
        }

        @NotNull
        public final String d() {
        }

        public final int e() {
        }

        public final int f() {
        }

        public final float g() {
        }

        public final void h(int i2) {
        }

        public final void i(@NotNull String str) {
        }

        public final void j(@NotNull float[] fArr) {
        }

        public final void k(@NotNull String str) {
        }

        public final void l(int i2) {
        }

        public final void m(int i2) {
        }

        public final void n(float f2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SVGAVideoShapeEntity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"h/s/a/m/d$b", "", "Lh/s/a/m/d$b;", "<init>", "(Ljava/lang/String;I)V", "shape", "rect", "ellipse", "keep", h.s.a.a.b}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b ellipse = null;
        public static final b keep = null;
        public static final b rect = null;
        public static final b shape = null;

        private b(String str, int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }
    }

    public d(@NotNull JSONObject jSONObject) {
    }

    private final void h(ShapeEntity shapeEntity) {
    }

    private final void i(JSONObject jSONObject) {
    }

    private final void j(ShapeEntity shapeEntity) {
    }

    private final void k(JSONObject jSONObject) {
    }

    private final void l(ShapeEntity shapeEntity) {
    }

    private final void m(JSONObject jSONObject) {
    }

    private final void n(ShapeEntity shapeEntity) {
    }

    private final void o(JSONObject jSONObject) {
    }

    public final void a() {
    }

    @Nullable
    public final Map<String, Object> b() {
    }

    @Nullable
    public final Path c() {
    }

    @Nullable
    public final a d() {
    }

    @Nullable
    public final Matrix e() {
    }

    @NotNull
    public final b f() {
    }

    public final boolean g() {
    }

    public final void p(@Nullable Path path) {
    }

    public d(@NotNull ShapeEntity shapeEntity) {
    }
}
