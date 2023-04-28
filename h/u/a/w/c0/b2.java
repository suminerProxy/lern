package h.u.a.w.c0;

import android.app.Dialog;
import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import com.umeng.analytics.pro.am;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KeyBoardDialog.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/showstartfans/activity/widget/dialog/KeyBoardDialog;", "Landroid/app/Dialog;", "mContext", "Landroid/content/Context;", "maxNum", "", "call", "Lcom/showstartfans/activity/listener/OnNumKeyBoardCall;", "(Landroid/content/Context;ILcom/showstartfans/activity/listener/OnNumKeyBoardCall;)V", "inputMaxDes", "Landroid/widget/TextView;", "inputNum", "Landroid/widget/EditText;", "keyBoard", "Landroid/inputmethodservice/KeyboardView;", "sureBtn", "initViews", "", "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public final class b2 extends Dialog {
    @NotNull
    private TextView b;
    @NotNull
    private TextView c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private EditText f25008d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private KeyboardView f25009e;

    /* compiled from: KeyBoardDialog.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/showstartfans/activity/widget/dialog/KeyBoardDialog$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", am.aB, "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", AnimatedPasterJsonConfig.CONFIG_COUNT, TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "Xiudong_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static final class a implements TextWatcher {
        public final /* synthetic */ b2 b;

        public a(b2 b2Var) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public /* synthetic */ b2(Context context, int i2, h.u.a.l.c cVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
    }

    private static final void a(b2 b2Var, int i2, h.u.a.l.c cVar, View view) {
    }

    private static final void b(b2 b2Var, View view) {
    }

    private static final void c(b2 b2Var, View view) {
    }

    public static final /* synthetic */ TextView d(b2 b2Var) {
    }

    private final void e() {
    }

    public static /* synthetic */ void f(b2 b2Var, View view) {
    }

    public static /* synthetic */ void g(b2 b2Var, View view) {
    }

    public static /* synthetic */ void h(b2 b2Var, int i2, h.u.a.l.c cVar, View view) {
    }

    public b2(@NotNull Context context, int i2, @Nullable h.u.a.l.c cVar) {
    }
}
