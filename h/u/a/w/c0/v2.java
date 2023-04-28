package h.u.a.w.c0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import h.u.a.c.f0.f9;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TicketGuideDialog.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\bR\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010!\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0015\u0010\u0007\u001a\u00060\bR\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/showstartfans/activity/widget/dialog/TicketGuideDialog;", "Landroid/app/Dialog;", "Landroid/content/DialogInterface$OnDismissListener;", "context", "Landroid/content/Context;", "realType", "", "holder", "Lcom/showstartfans/activity/activitys/maintab/TabTicketHMainAdapter$ViewHodler;", "Lcom/showstartfans/activity/activitys/maintab/TabTicketHMainAdapter;", "(Landroid/content/Context;ILcom/showstartfans/activity/activitys/maintab/TabTicketHMainAdapter$ViewHodler;)V", "getHolder", "()Lcom/showstartfans/activity/activitys/maintab/TabTicketHMainAdapter$ViewHodler;", "onTicketGuideDialogListener", "Lcom/showstartfans/activity/widget/dialog/TicketGuideDialog$OnTicketGuideDialogListener;", "getOnTicketGuideDialogListener", "()Lcom/showstartfans/activity/widget/dialog/TicketGuideDialog$OnTicketGuideDialogListener;", "setOnTicketGuideDialogListener", "(Lcom/showstartfans/activity/widget/dialog/TicketGuideDialog$OnTicketGuideDialogListener;)V", "tickerType", "getPoint", "", "view", "Landroid/view/View;", "initViews", "", "realTypeNum", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "setLocView", "loc", "Landroid/widget/ImageView;", "show", "OnTicketGuideDialogListener", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class v2 extends Dialog implements DialogInterface.OnDismissListener {
    @NotNull
    private final f9.d b;
    @Nullable
    private a c;

    /* renamed from: d  reason: collision with root package name */
    private int f25130d;

    /* compiled from: TicketGuideDialog.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/showstartfans/activity/widget/dialog/TicketGuideDialog$OnTicketGuideDialogListener;", "", "OnDismiss", "", "OnShow", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface a {
        void a();

        void b();
    }

    public v2(@NotNull Context context, int i2, @NotNull f9.d dVar) {
    }

    private final int[] c(View view) {
    }

    private final void d(int i2, View view) {
    }

    private static final void e(v2 v2Var, View view, ImageView imageView, View view2) {
    }

    public static /* synthetic */ void f(v2 v2Var, View view, ImageView imageView, View view2) {
    }

    private final void g(ImageView imageView) {
    }

    @NotNull
    public final f9.d a() {
    }

    @Nullable
    public final a b() {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@Nullable DialogInterface dialogInterface) {
    }

    public final void setOnTicketGuideDialogListener(@Nullable a aVar) {
    }

    public final void show(@Nullable a aVar) {
    }
}
