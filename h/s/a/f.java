package h.s.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.umeng.analytics.pro.am;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SVGADrawable.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010,\u001a\u00020(\u0012\u0006\u0010#\u001a\u00020\u001e¢\u0006\u0004\b6\u00107B\u0011\b\u0016\u0012\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b6\u00108J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0012R*\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R*\u0010'\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\nR\u0019\u0010,\u001a\u00020(8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\"\u00105\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00101\u001a\u0004\b)\u00102\"\u0004\b3\u00104¨\u00069"}, d2 = {"Lh/s/a/f;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "", Key.ALPHA, "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "h", "()V", "g", "l", "a", "", "value", "Z", "b", "()Z", "i", "(Z)V", "cleared", "Lh/s/a/g;", "f", "Lh/s/a/g;", "d", "()Lh/s/a/g;", "dynamicItem", "I", am.aF, "j", "currentFrame", "Lh/s/a/j;", "e", "Lh/s/a/j;", "()Lh/s/a/j;", "videoItem", "Lh/s/a/l/b;", "Lh/s/a/l/b;", "drawer", "Landroid/widget/ImageView$ScaleType;", "Landroid/widget/ImageView$ScaleType;", "()Landroid/widget/ImageView$ScaleType;", "k", "(Landroid/widget/ImageView$ScaleType;)V", "scaleType", "<init>", "(Lh/s/a/j;Lh/s/a/g;)V", "(Lh/s/a/j;)V", a.b}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f17772a;
    private int b;
    @NotNull
    private ImageView.ScaleType c;

    /* renamed from: d  reason: collision with root package name */
    private final h.s.a.l.b f17773d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final j f17774e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final g f17775f;

    public f(@NotNull j jVar, @NotNull g gVar) {
    }

    public final void a() {
    }

    public final boolean b() {
    }

    public final int c() {
    }

    @NotNull
    public final g d() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@Nullable Canvas canvas) {
    }

    @NotNull
    public final ImageView.ScaleType e() {
    }

    @NotNull
    public final j f() {
    }

    public final void g() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    public final void h() {
    }

    public final void i(boolean z) {
    }

    public final void j(int i2) {
    }

    public final void k(@NotNull ImageView.ScaleType scaleType) {
    }

    public final void l() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public f(@NotNull j jVar) {
    }
}
