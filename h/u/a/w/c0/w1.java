package h.u.a.w.c0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: CommInputTextMsgDialog.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class w1 extends Dialog {
    private Context b;
    private InputMethodManager c;

    /* renamed from: d  reason: collision with root package name */
    private EditText f25132d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f25133e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f25134f;

    /* renamed from: g  reason: collision with root package name */
    private int f25135g;

    /* renamed from: h  reason: collision with root package name */
    private int f25136h;

    /* renamed from: i  reason: collision with root package name */
    private h.u.a.w.d0.d2 f25137i;

    /* compiled from: CommInputTextMsgDialog.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements TextWatcher {
        public final /* synthetic */ w1 b;

        public a(w1 w1Var) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: CommInputTextMsgDialog.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends InputFilter.LengthFilter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w1 f25138a;

        public b(w1 w1Var, int i2) {
        }
    }

    /* compiled from: CommInputTextMsgDialog.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ String b;
        public final /* synthetic */ w1 c;

        public c(w1 w1Var, String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public w1(@i.a.t0.f Context context, h.u.a.w.d0.d2 d2Var) {
    }

    public static /* synthetic */ void a(w1 w1Var) {
    }

    public static /* synthetic */ EditText b(w1 w1Var) {
    }

    private void c(String str) {
    }

    private void d() {
    }

    private /* synthetic */ void e(View view) {
    }

    private /* synthetic */ boolean g(TextView textView, int i2, KeyEvent keyEvent) {
    }

    public static /* synthetic */ boolean i(View view, int i2, KeyEvent keyEvent) {
    }

    private /* synthetic */ void j(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    private /* synthetic */ boolean l(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
    }

    private void o() {
    }

    private void q() {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
    }

    public /* synthetic */ void f(View view) {
    }

    public /* synthetic */ boolean h(TextView textView, int i2, KeyEvent keyEvent) {
    }

    public /* synthetic */ void k(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public /* synthetic */ boolean m(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
    }

    public void n(String str) {
    }

    public void p(int i2) {
    }

    @Override // android.app.Dialog
    public void show() {
    }

    public w1(@i.a.t0.f Context context, String str, h.u.a.w.d0.d2 d2Var) {
    }

    public w1(@i.a.t0.f Context context, String str, int i2, h.u.a.w.d0.d2 d2Var) {
    }
}
