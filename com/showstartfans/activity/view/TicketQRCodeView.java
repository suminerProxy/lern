package com.showstartfans.activity.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.showstartfans.activity.model.WalletBean;
import h.u.a.w.c0.m2;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import skin.support.widget.SkinCompatFrameLayout;

/* compiled from: TicketQRCodeView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\u0006\u0010\u001c\u001a\u00020\u0018J\b\u0010\u001d\u001a\u00020\u0018H\u0014J\u0010\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0010J\b\u0010\"\u001a\u00020\u0018H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/showstartfans/activity/view/TicketQRCodeView;", "Lskin/support/widget/SkinCompatFrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animal_line", "Lcom/showstartfans/activity/view/LineAnimalView;", "countDownTimer", "Landroid/os/CountDownTimer;", "isTicket", "", "mBean", "Lcom/showstartfans/activity/model/WalletBean;", "sdv_code", "Landroid/widget/ImageView;", "v_bg", "Landroid/view/View;", "OnQRcodeTimed", "", "applySkin", "checkQRCode", "initCountDownTimer", "initListener", "onDetachedFromWindow", "setData", "bean", "setIsTicket", "isTicketCode", "stopTimer", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class TicketQRCodeView extends SkinCompatFrameLayout {
    @NotNull
    public Map<Integer, View> b;
    @Nullable
    private ImageView c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private LineAnimalView f7060d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private CountDownTimer f7061e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    private View f7062f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7063g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private WalletBean f7064h;

    /* compiled from: TicketQRCodeView.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/showstartfans/activity/view/TicketQRCodeView$initCountDownTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TicketQRCodeView f7065a;

        public a(TicketQRCodeView ticketQRCodeView) {
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j2) {
        }
    }

    /* compiled from: TicketQRCodeView.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/showstartfans/activity/view/TicketQRCodeView$initListener$1$dialog$1", "Lcom/showstartfans/activity/widget/dialog/OnRealNameTwoPointCall;", "onRealNameTwoPoint", "", "onRealNameTwoPointFail", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class b implements m2 {
        @Override // h.u.a.w.c0.m2
        public void a() {
        }

        @Override // h.u.a.w.c0.m2
        public void b() {
        }
    }

    public TicketQRCodeView(@Nullable Context context) {
    }

    private final void e() {
    }

    public static final /* synthetic */ void h(TicketQRCodeView ticketQRCodeView) {
    }

    private final void i() {
    }

    private final void j() {
    }

    private static final void l(TicketQRCodeView ticketQRCodeView, View view) {
    }

    public static /* synthetic */ void m(TicketQRCodeView ticketQRCodeView, View view) {
    }

    private final void n() {
    }

    @Override // skin.support.widget.SkinCompatFrameLayout, skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    public void f() {
    }

    @Nullable
    public View g(int i2) {
    }

    public final void k() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    public final void setData(@Nullable WalletBean walletBean) {
    }

    public final void setIsTicket(boolean z) {
    }

    public TicketQRCodeView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
    }

    public TicketQRCodeView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
