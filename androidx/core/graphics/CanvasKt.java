package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Canvas.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001aU\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0013\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0013\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001c2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001d\u001aM\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010#\u001aM\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010\u0012\u001a5\u0010\u001a\u001a\u00020\u0002*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u001a\u0010&¨\u0006'"}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "withSave", "(Landroid/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "", "x", "y", "withTranslation", "(Landroid/graphics/Canvas;FFLkotlin/jvm/functions/Function1;)V", "degrees", "pivotX", "pivotY", "withRotation", "(Landroid/graphics/Canvas;FFFLkotlin/jvm/functions/Function1;)V", "withScale", "(Landroid/graphics/Canvas;FFFFLkotlin/jvm/functions/Function1;)V", "withSkew", "Landroid/graphics/Matrix;", "matrix", "withMatrix", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Rect;", "clipRect", "withClip", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/RectF;", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;Lkotlin/jvm/functions/Function1;)V", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "(Landroid/graphics/Canvas;IIIILkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Path;", "clipPath", "(Landroid/graphics/Canvas;Landroid/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class CanvasKt {
    public static final void withClip(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static final void withMatrix(@NotNull Canvas canvas, @NotNull Matrix matrix, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, Function1 function1, int i2, Object obj) {
    }

    public static final void withRotation(@NotNull Canvas canvas, float f2, float f3, float f4, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f2, float f3, float f4, Function1 function1, int i2, Object obj) {
    }

    public static final void withSave(@NotNull Canvas canvas, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static final void withScale(@NotNull Canvas canvas, float f2, float f3, float f4, float f5, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f2, float f3, float f4, float f5, Function1 function1, int i2, Object obj) {
    }

    public static final void withSkew(@NotNull Canvas canvas, float f2, float f3, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f2, float f3, Function1 function1, int i2, Object obj) {
    }

    public static final void withTranslation(@NotNull Canvas canvas, float f2, float f3, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f2, float f3, Function1 function1, int i2, Object obj) {
    }

    public static final void withClip(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static final void withClip(@NotNull Canvas canvas, int i2, int i3, int i4, int i5, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static final void withClip(@NotNull Canvas canvas, float f2, float f3, float f4, float f5, @NotNull Function1<? super Canvas, Unit> function1) {
    }

    public static final void withClip(@NotNull Canvas canvas, @NotNull Path path, @NotNull Function1<? super Canvas, Unit> function1) {
    }
}
