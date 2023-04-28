package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Rect.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0086\n¢\u0006\u0004\b\u0002\u0010\t\u001a\u0014\u0010\u0004\u001a\u00020\b*\u00020\u0007H\u0086\n¢\u0006\u0004\b\u0004\u0010\t\u001a\u0014\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0086\n¢\u0006\u0004\b\u0005\u0010\t\u001a\u0014\u0010\u0006\u001a\u00020\b*\u00020\u0007H\u0086\n¢\u0006\u0004\b\u0006\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0086\n¢\u0006\u0004\b\u000b\u0010\r\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000b\u0010\u0010\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H\u0086\n¢\u0006\u0004\b\u000b\u0010\u0012\u001a\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0013H\u0086\n¢\u0006\u0004\b\u000b\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0016\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0018\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0016\u0010\u000f\u001a\u001c\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u0016\u0010\u0010\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0012\u001a\u001c\u0010\u0016\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0013H\u0086\n¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001c\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001a\u0010\u000f\u001a\u001c\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u001a\u0010\u0010\u001a\u001c\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u001c\u0010\f\u001a\u001c\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0086\f¢\u0006\u0004\b\u001c\u0010\r\u001a\u001c\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\u001d\u0010\f\u001a\u001c\u0010\u001d\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0087\f¢\u0006\u0004\b\u001d\u0010\r\u001a\u001c\u0010\u001e\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\f¢\u0006\u0004\b\u001e\u0010\u0017\u001a\u001c\u0010\u001e\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0086\f¢\u0006\u0004\b\u001e\u0010\u0018\u001a\u001c\u0010!\u001a\u00020 *\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011H\u0086\n¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010!\u001a\u00020 *\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0013H\u0086\n¢\u0006\u0004\b!\u0010#\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b$\u0010%\u001a\u0014\u0010&\u001a\u00020\u0000*\u00020\u0007H\u0086\b¢\u0006\u0004\b&\u0010'\u001a\u0014\u0010(\u001a\u00020\u0015*\u00020\u0000H\u0086\b¢\u0006\u0004\b(\u0010)\u001a\u0014\u0010(\u001a\u00020\u0015*\u00020\u0007H\u0086\b¢\u0006\u0004\b(\u0010*\u001a\u001c\u0010-\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0086\b¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroid/graphics/Rect;", "", "component1", "(Landroid/graphics/Rect;)I", "component2", "component3", "component4", "Landroid/graphics/RectF;", "", "(Landroid/graphics/RectF;)F", "r", "plus", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Rect;", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/RectF;", "xy", "(Landroid/graphics/Rect;I)Landroid/graphics/Rect;", "(Landroid/graphics/RectF;F)Landroid/graphics/RectF;", "Landroid/graphics/Point;", "(Landroid/graphics/Rect;Landroid/graphics/Point;)Landroid/graphics/Rect;", "Landroid/graphics/PointF;", "(Landroid/graphics/RectF;Landroid/graphics/PointF;)Landroid/graphics/RectF;", "Landroid/graphics/Region;", "minus", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/Region;", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Landroid/graphics/Region;", "factor", "times", "(Landroid/graphics/RectF;I)Landroid/graphics/RectF;", "or", "and", "xor", "p", "", "contains", "(Landroid/graphics/Rect;Landroid/graphics/Point;)Z", "(Landroid/graphics/RectF;Landroid/graphics/PointF;)Z", "toRectF", "(Landroid/graphics/Rect;)Landroid/graphics/RectF;", "toRect", "(Landroid/graphics/RectF;)Landroid/graphics/Rect;", "toRegion", "(Landroid/graphics/Rect;)Landroid/graphics/Region;", "(Landroid/graphics/RectF;)Landroid/graphics/Region;", "Landroid/graphics/Matrix;", "m", "transform", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/RectF;", "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RectKt {
    @SuppressLint({"CheckResult"})
    @NotNull
    public static final Rect and(@NotNull Rect rect, @NotNull Rect rect2) {
    }

    public static final int component1(@NotNull Rect rect) {
    }

    public static final int component2(@NotNull Rect rect) {
    }

    public static final int component3(@NotNull Rect rect) {
    }

    public static final int component4(@NotNull Rect rect) {
    }

    public static final boolean contains(@NotNull Rect rect, @NotNull Point point) {
    }

    @NotNull
    public static final Region minus(@NotNull Rect rect, @NotNull Rect rect2) {
    }

    @NotNull
    public static final Rect or(@NotNull Rect rect, @NotNull Rect rect2) {
    }

    @NotNull
    public static final Rect plus(@NotNull Rect rect, @NotNull Rect rect2) {
    }

    @NotNull
    public static final Rect times(@NotNull Rect rect, int i2) {
    }

    @NotNull
    public static final Rect toRect(@NotNull RectF rectF) {
    }

    @NotNull
    public static final RectF toRectF(@NotNull Rect rect) {
    }

    @NotNull
    public static final Region toRegion(@NotNull Rect rect) {
    }

    @NotNull
    public static final RectF transform(@NotNull RectF rectF, @NotNull Matrix matrix) {
    }

    @NotNull
    public static final Region xor(@NotNull Rect rect, @NotNull Rect rect2) {
    }

    public static final float component1(@NotNull RectF rectF) {
    }

    public static final float component2(@NotNull RectF rectF) {
    }

    public static final float component3(@NotNull RectF rectF) {
    }

    public static final float component4(@NotNull RectF rectF) {
    }

    public static final boolean contains(@NotNull RectF rectF, @NotNull PointF pointF) {
    }

    @NotNull
    public static final Region toRegion(@NotNull RectF rectF) {
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final RectF and(@NotNull RectF rectF, @NotNull RectF rectF2) {
    }

    @NotNull
    public static final Rect minus(@NotNull Rect rect, int i2) {
    }

    @NotNull
    public static final RectF or(@NotNull RectF rectF, @NotNull RectF rectF2) {
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF, @NotNull RectF rectF2) {
    }

    @NotNull
    public static final Region xor(@NotNull RectF rectF, @NotNull RectF rectF2) {
    }

    @NotNull
    public static final RectF minus(@NotNull RectF rectF, float f2) {
    }

    @NotNull
    public static final Rect plus(@NotNull Rect rect, int i2) {
    }

    @NotNull
    public static final RectF times(@NotNull RectF rectF, float f2) {
    }

    @NotNull
    public static final Rect minus(@NotNull Rect rect, @NotNull Point point) {
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF, float f2) {
    }

    @NotNull
    public static final RectF minus(@NotNull RectF rectF, @NotNull PointF pointF) {
    }

    @NotNull
    public static final Rect plus(@NotNull Rect rect, @NotNull Point point) {
    }

    @NotNull
    public static final Region minus(@NotNull RectF rectF, @NotNull RectF rectF2) {
    }

    @NotNull
    public static final RectF plus(@NotNull RectF rectF, @NotNull PointF pointF) {
    }

    @NotNull
    public static final RectF times(@NotNull RectF rectF, int i2) {
    }
}
