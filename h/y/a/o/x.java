package h.y.a.o;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.taihebase.activity.view.UploadProgressView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UploadViewDialog.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\"\u0010\u0019\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0018H\u0016J\u000e\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0006J\b\u0010'\u001a\u00020\u0015H\u0017J\u0010\u0010'\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/taihebase/activity/view/UploadViewDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "LAST_PROGRESS", "", "TouchSlop", "bgImage", "", "ctx", "isTouchIn", "", "offset_Y", "padding", "screenHeight", "upload_view", "Lcom/taihebase/activity/view/UploadProgressView;", "x_down", "y_down", "dismissBeforeOver", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "isTouchPointInView", "view", "Landroid/view/View;", "x", "y", "moveView", "rawY", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTouchEvent", "event", "setProgressNum", "numPro", "show", "module_common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class x extends Dialog {
    private int b;
    private int c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private UploadProgressView f26453d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private Context f26454e;

    /* renamed from: f  reason: collision with root package name */
    private int f26455f;

    /* renamed from: g  reason: collision with root package name */
    private int f26456g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26457h;

    /* renamed from: i  reason: collision with root package name */
    private int f26458i;

    /* renamed from: j  reason: collision with root package name */
    private int f26459j;

    /* renamed from: k  reason: collision with root package name */
    private int f26460k;
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    private String f26461l;

    public x(@NotNull Context context) {
    }

    private static final void b(x xVar) {
    }

    private final boolean c(View view, int i2, int i3) {
    }

    public static /* synthetic */ void d(x xVar) {
    }

    private final void e(int i2) {
    }

    public final void a() {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
    }

    public final void f(int i2) {
    }

    public final void g(@Nullable String str) {
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
    }

    @Override // android.app.Dialog
    @SuppressLint({"CheckResult"})
    public void show() {
    }
}
