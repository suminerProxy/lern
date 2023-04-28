package com.showstartfans.activity.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.showstartfans.activity.model.LevelInfo;
import h.u.a.g.vs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LevelCardView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/showstartfans/activity/view/LevelCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/showstartfans/activity/databinding/ViewLevelCardBinding;", "listener", "Lkotlin/Function0;", "", "getListener", "()Lkotlin/jvm/functions/Function0;", "setListener", "(Lkotlin/jvm/functions/Function0;)V", "bitmap", "Landroid/graphics/Bitmap;", "levelInfo", "Lcom/showstartfans/activity/model/LevelInfo;", "setData", "startAnimation", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class LevelCardView extends ConstraintLayout {
    @NotNull
    public Map<Integer, View> b;
    @NotNull
    private final vs c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Function0<Unit> f6836d;

    @JvmOverloads
    public LevelCardView(@NotNull Context context) {
    }

    public /* synthetic */ LevelCardView(Context context, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private static final void c(Context context, LevelCardView levelCardView) {
    }

    private static final void d(View view) {
    }

    private static final void e(LevelCardView levelCardView, Context context, View view) {
    }

    private final Bitmap f(LevelInfo levelInfo) {
    }

    public static /* synthetic */ void g(LevelCardView levelCardView, Context context, View view) {
    }

    public static /* synthetic */ void h(View view) {
    }

    public static /* synthetic */ void i(Context context, LevelCardView levelCardView) {
    }

    private final void j(LevelInfo levelInfo) {
    }

    public void a() {
    }

    @Nullable
    public View b(int i2) {
    }

    @Nullable
    public final Function0<Unit> getListener() {
    }

    public final void setData(@NotNull LevelInfo levelInfo) {
    }

    public final void setListener(@Nullable Function0<Unit> function0) {
    }

    @JvmOverloads
    public LevelCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
