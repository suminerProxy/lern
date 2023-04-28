package h.u.a.w.c0;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.showstartfans.activity.view.PinEntryEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VoiceDialog.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J+\u0010\u001d\u001a\u00020\u00152#\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011J\u0016\u0010\u001f\u001a\u00020\u00152\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019J\b\u0010!\u001a\u00020\u0015H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/showstartfans/activity/widget/dialog/VoiceDialog;", "Landroid/app/Dialog;", "mContext", "Landroid/content/Context;", "desc", "", "(Landroid/content/Context;Ljava/lang/String;)V", "canClick", "", "codeInputView", "Lcom/showstartfans/activity/view/PinEntryEditText;", "countDown", "Lcom/showstartfans/activity/widget/dialog/VoiceDialog$TimeCount;", "getDesc", "()Ljava/lang/String;", "generatecode", "onConfirmListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "content", "", "retryGet", "Landroid/widget/TextView;", "retryListener", "Lkotlin/Function0;", "initViews", "view", "Landroid/view/View;", "setOnConfirmListener", "listener", "setRetryListener", "retry", "show", "TimeCount", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class y2 extends Dialog {
    @NotNull
    private final String b;
    private PinEntryEditText c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f25159d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private Function1<? super String, Unit> f25160e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private Function0<Unit> f25161f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private String f25162g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25163h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private a f25164i;

    /* compiled from: VoiceDialog.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/showstartfans/activity/widget/dialog/VoiceDialog$TimeCount;", "Lcom/showstartfans/activity/view/textview/CountDownTimer;", "millisInFuture", "", "countDownInterval", "(Lcom/showstartfans/activity/widget/dialog/VoiceDialog;JJ)V", "onFinish", "", "onTick", "millisUntilFinished", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public final class a extends h.u.a.u.e4.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ y2 f25165f;

        public a(y2 y2Var, long j2, long j3) {
        }

        @Override // h.u.a.u.e4.a
        public void d() {
        }

        @Override // h.u.a.u.e4.a
        public void e(long j2) {
        }
    }

    public y2(@NotNull Context context, @NotNull String str) {
    }

    public static final /* synthetic */ TextView a(y2 y2Var) {
    }

    private final void c(View view) {
    }

    private static final void d(y2 y2Var, View view) {
    }

    private static final void e(y2 y2Var, View view) {
    }

    private static final void f(y2 y2Var, Button button, CharSequence charSequence) {
    }

    public static /* synthetic */ void g(y2 y2Var, View view) {
    }

    public static /* synthetic */ void h(y2 y2Var, Button button, CharSequence charSequence) {
    }

    public static /* synthetic */ void i(y2 y2Var, View view) {
    }

    @NotNull
    public final String b() {
    }

    public final void j(@Nullable Function1<? super String, Unit> function1) {
    }

    public final void k(@Nullable Function0<Unit> function0) {
    }

    @Override // android.app.Dialog
    public void show() {
    }

    public /* synthetic */ y2(Context context, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
