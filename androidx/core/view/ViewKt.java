package androidx.core.view;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: View.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\u001a9\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\t\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\u000b\u001a\u00020\n*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\b\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\b\u001a<\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a<\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0016\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0017\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u001e\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\b¢\u0006\u0004\b \u0010!\u001a,\u0010\"\u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0087\b¢\u0006\u0004\b\"\u0010!\u001a\u001b\u0010&\u001a\u00020%*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'\u001a-\u0010+\u001a\u00020\u0005*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b)H\u0086\b¢\u0006\u0004\b+\u0010\b\u001a9\u0010+\u001a\u00020\u0005\"\n\b\u0000\u0010,\u0018\u0001*\u00020(*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b)H\u0087\b¢\u0006\u0004\b-\u0010\b\"\u0018\u00100\u001a\u00020\u000f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0018\u00102\u001a\u00020\u000f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b1\u0010/\"*\u00105\u001a\u000203*\u00020\u00002\u0006\u00104\u001a\u0002038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108\"\u0018\u0010:\u001a\u00020\u000f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b9\u0010/\"*\u0010;\u001a\u000203*\u00020\u00002\u0006\u00104\u001a\u0002038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00106\"\u0004\b<\u00108\"\u0018\u0010>\u001a\u00020\u000f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010/\"\u0018\u0010@\u001a\u00020\u000f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010/\"\u0018\u0010B\u001a\u00020\u000f*\u00020\u00008Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\bA\u0010/\"*\u0010C\u001a\u000203*\u00020\u00002\u0006\u00104\u001a\u0002038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bC\u00106\"\u0004\bD\u00108¨\u0006E"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "", "action", "doOnNextLayout", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "doOnLayout", "Landroidx/core/view/OneShotPreDrawListener;", "doOnPreDraw", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroidx/core/view/OneShotPreDrawListener;", "doOnAttach", "doOnDetach", "", "start", "top", "end", "bottom", "updatePaddingRelative", "(Landroid/view/View;IIII)V", TtmlNode.LEFT, TtmlNode.RIGHT, "updatePadding", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "setPadding", "(Landroid/view/View;I)V", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/view/View;JLkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;", "postOnAnimationDelayed", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "drawToBitmap", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/ExtensionFunctionType;", "block", "updateLayoutParams", ExifInterface.GPS_DIRECTION_TRUE, "updateLayoutParamsTyped", "getMarginTop", "(Landroid/view/View;)I", "marginTop", "getMarginBottom", "marginBottom", "", "value", "isInvisible", "(Landroid/view/View;)Z", "setInvisible", "(Landroid/view/View;Z)V", "getMarginLeft", "marginLeft", "isGone", "setGone", "getMarginRight", "marginRight", "getMarginStart", "marginStart", "getMarginEnd", "marginEnd", "isVisible", "setVisible", "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ViewKt {
    public static final void doOnAttach(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
    }

    public static final void doOnDetach(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
    }

    public static final void doOnLayout(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
    }

    public static final void doOnNextLayout(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
    }

    @NotNull
    public static final OneShotPreDrawListener doOnPreDraw(@NotNull View view, @NotNull Function1<? super View, Unit> function1) {
    }

    @NotNull
    public static final Bitmap drawToBitmap(@NotNull View view, @NotNull Bitmap.Config config) {
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i2, Object obj) {
    }

    public static final int getMarginBottom(@NotNull View view) {
    }

    public static final int getMarginEnd(@NotNull View view) {
    }

    public static final int getMarginLeft(@NotNull View view) {
    }

    public static final int getMarginRight(@NotNull View view) {
    }

    public static final int getMarginStart(@NotNull View view) {
    }

    public static final int getMarginTop(@NotNull View view) {
    }

    public static final boolean isGone(@NotNull View view) {
    }

    public static final boolean isInvisible(@NotNull View view) {
    }

    public static final boolean isVisible(@NotNull View view) {
    }

    @NotNull
    public static final Runnable postDelayed(@NotNull View view, long j2, @NotNull Function0<Unit> function0) {
    }

    @RequiresApi(16)
    @NotNull
    public static final Runnable postOnAnimationDelayed(@NotNull View view, long j2, @NotNull Function0<Unit> function0) {
    }

    public static final void setGone(@NotNull View view, boolean z) {
    }

    public static final void setInvisible(@NotNull View view, boolean z) {
    }

    public static final void setPadding(@NotNull View view, @Px int i2) {
    }

    public static final void setVisible(@NotNull View view, boolean z) {
    }

    public static final void updateLayoutParams(@NotNull View view, @NotNull Function1<? super ViewGroup.LayoutParams, Unit> function1) {
    }

    @JvmName(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(@NotNull View view, @NotNull Function1<? super T, Unit> function1) {
    }

    public static final void updatePadding(@NotNull View view, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
    }

    public static /* synthetic */ void updatePadding$default(View view, int i2, int i3, int i4, int i5, int i6, Object obj) {
    }

    @RequiresApi(17)
    public static final void updatePaddingRelative(@NotNull View view, @Px int i2, @Px int i3, @Px int i4, @Px int i5) {
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i2, int i3, int i4, int i5, int i6, Object obj) {
    }
}
