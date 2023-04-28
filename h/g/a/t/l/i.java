package h.g.a.t.l;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: FixedSizeDrawable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class i extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f17219a;
    private final RectF b;
    private final RectF c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f17220d;

    /* renamed from: e  reason: collision with root package name */
    private a f17221e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17222f;

    /* compiled from: FixedSizeDrawable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f17223a;
        public final int b;
        public final int c;

        public a(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
        }

        public a(Drawable.ConstantState constantState, int i2, int i3) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
        }
    }

    public i(Drawable drawable, int i2, int i3) {
    }

    private void a() {
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public int getAlpha() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@NonNull Runnable runnable, long j2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i2, @NonNull PorterDuff.Mode mode) {
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NonNull Runnable runnable) {
    }

    public i(a aVar, Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
    }
}
