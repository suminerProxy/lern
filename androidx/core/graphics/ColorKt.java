package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.Key;
import com.umeng.analytics.pro.am;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Color.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u0002\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0014\u0010\u0004\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0004\u0010\u000b\u001a\u0014\u0010\u0005\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0005\u0010\u000b\u001a\u0014\u0010\u0006\u001a\u00020\n*\u00020\nH\u0086\n¢\u0006\u0004\b\u0006\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\nH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0004\u0010\u0011\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0005\u0010\u0011\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0006\u0010\u0011\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u000eH\u0087\b¢\u0006\u0004\b\f\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u000eH\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0019H\u0087\f¢\u0006\u0004\b\u0017\u0010\u001a\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u001c\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0019H\u0087\f¢\u0006\u0004\b\u0017\u0010\u001c\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0087\f¢\u0006\u0004\b\u0017\u0010\u001d\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0019H\u0087\f¢\u0006\u0004\b\u0017\u0010\u001e\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u001fH\u0087\b¢\u0006\u0004\b\u0013\u0010 \"\u0018\u0010\"\u001a\u00020\n*\u00020\n8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\u000b\"\u0018\u0010\"\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\u0011\"\u0018\u0010$\u001a\u00020#*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0018\u0010'\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010\u0011\"\u0018\u0010'\u001a\u00020\n*\u00020\n8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010\u000b\"\u0018\u0010)\u001a\u00020\n*\u00020\n8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010\u000b\"\u0018\u0010+\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010\u0011\"\u0018\u0010\u0016\u001a\u00020\u0019*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0018\u0010.\u001a\u00020#*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010%\"\u0018\u0010)\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010\u0011\"\u0018\u0010+\u001a\u00020\n*\u00020\n8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010\u000b\"\u0018\u00101\u001a\u00020\u0001*\u00020\n8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0018\u00101\u001a\u00020\u0001*\u00020\u000e8Ç\u0002@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010\u0011¨\u00062"}, d2 = {"Landroid/graphics/Color;", "", "component1", "(Landroid/graphics/Color;)F", "component2", "component3", "component4", am.aF, "plus", "(Landroid/graphics/Color;Landroid/graphics/Color;)Landroid/graphics/Color;", "", "(I)I", "toColor", "(I)Landroid/graphics/Color;", "", "toColorLong", "(I)J", "(J)F", "(J)Landroid/graphics/Color;", "toColorInt", "(J)I", "Landroid/graphics/ColorSpace$Named;", "colorSpace", "convertTo", "(ILandroid/graphics/ColorSpace$Named;)J", "Landroid/graphics/ColorSpace;", "(ILandroid/graphics/ColorSpace;)J", "(JLandroid/graphics/ColorSpace$Named;)J", "(JLandroid/graphics/ColorSpace;)J", "(Landroid/graphics/Color;Landroid/graphics/ColorSpace$Named;)Landroid/graphics/Color;", "(Landroid/graphics/Color;Landroid/graphics/ColorSpace;)Landroid/graphics/Color;", "", "(Ljava/lang/String;)I", "getRed", "red", "", "isSrgb", "(J)Z", "getBlue", "blue", "getAlpha", Key.ALPHA, "getGreen", "green", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", "isWideGamut", "getLuminance", "(I)F", "luminance", "core-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ColorKt {
    @RequiresApi(26)
    public static final float component1(@NotNull Color color) {
    }

    public static final int component1(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final float component2(@NotNull Color color) {
    }

    public static final int component2(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final float component3(@NotNull Color color) {
    }

    public static final int component3(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final float component4(@NotNull Color color) {
    }

    public static final int component4(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final long convertTo(@ColorInt int i2, @NotNull ColorSpace.Named named) {
    }

    @RequiresApi(26)
    public static final float getAlpha(long j2) {
    }

    public static final int getAlpha(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final float getBlue(long j2) {
    }

    public static final int getBlue(@ColorInt int i2) {
    }

    @RequiresApi(26)
    @NotNull
    public static final ColorSpace getColorSpace(long j2) {
    }

    @RequiresApi(26)
    public static final float getGreen(long j2) {
    }

    public static final int getGreen(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final float getLuminance(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final float getRed(long j2) {
    }

    public static final int getRed(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final boolean isSrgb(long j2) {
    }

    @RequiresApi(26)
    public static final boolean isWideGamut(long j2) {
    }

    @RequiresApi(26)
    @NotNull
    public static final Color plus(@NotNull Color color, @NotNull Color color2) {
    }

    @RequiresApi(26)
    @NotNull
    public static final Color toColor(@ColorInt int i2) {
    }

    @ColorInt
    @RequiresApi(26)
    public static final int toColorInt(long j2) {
    }

    @RequiresApi(26)
    public static final long toColorLong(@ColorInt int i2) {
    }

    @RequiresApi(26)
    public static final float component1(long j2) {
    }

    @RequiresApi(26)
    public static final float component2(long j2) {
    }

    @RequiresApi(26)
    public static final float component3(long j2) {
    }

    @RequiresApi(26)
    public static final float component4(long j2) {
    }

    @RequiresApi(26)
    public static final long convertTo(@ColorInt int i2, @NotNull ColorSpace colorSpace) {
    }

    @RequiresApi(26)
    public static final float getLuminance(long j2) {
    }

    @RequiresApi(26)
    @NotNull
    public static final Color toColor(long j2) {
    }

    @ColorInt
    public static final int toColorInt(@NotNull String str) {
    }

    @RequiresApi(26)
    public static final long convertTo(long j2, @NotNull ColorSpace.Named named) {
    }

    @RequiresApi(26)
    public static final long convertTo(long j2, @NotNull ColorSpace colorSpace) {
    }

    @RequiresApi(26)
    @NotNull
    public static final Color convertTo(@NotNull Color color, @NotNull ColorSpace.Named named) {
    }

    @RequiresApi(26)
    @NotNull
    public static final Color convertTo(@NotNull Color color, @NotNull ColorSpace colorSpace) {
    }
}
