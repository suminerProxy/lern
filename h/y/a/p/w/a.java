package h.y.a.p.w;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.taihebase.activity.R;
import h.y.a.n.z;
import skin.support.content.res.SkinCompatResources;

/* compiled from: DefaultDialog.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class a extends Dialog implements View.OnClickListener, DialogInterface.OnDismissListener {
    private d b;
    private TextView c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f26542d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f26543e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f26544f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f26545g;

    /* renamed from: h  reason: collision with root package name */
    private LinearLayout f26546h;

    /* renamed from: i  reason: collision with root package name */
    private RelativeLayout f26547i;

    /* renamed from: j  reason: collision with root package name */
    private View f26548j;

    /* renamed from: k  reason: collision with root package name */
    private View f26549k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f26550l;

    public a(Context context) {
        super(context, R.style.DialogTheme);
        this.f26550l = true;
        c();
    }

    private void c() {
        View inflate = View.inflate(getContext(), R.layout.dialog_default, null);
        this.c = (TextView) inflate.findViewById(R.id.btn_ok);
        this.f26542d = (TextView) inflate.findViewById(R.id.btn_cancle);
        this.f26543e = (TextView) inflate.findViewById(R.id.content);
        this.f26544f = (TextView) inflate.findViewById(R.id.dailogTitle);
        this.f26548j = inflate.findViewById(R.id.bottom_sep);
        this.f26549k = inflate.findViewById(R.id.content_sep);
        this.f26545g = (LinearLayout) inflate.findViewById(R.id.ll_foot_dialog);
        this.f26546h = (LinearLayout) inflate.findViewById(R.id.ll_content_dialog);
        this.f26547i = (RelativeLayout) inflate.findViewById(R.id.root);
        this.c.setOnClickListener(this);
        this.f26542d.setOnClickListener(this);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.width = z.c(300.0f, getContext());
        getWindow().setAttributes(attributes);
        setContentView(inflate);
        j(false);
        setOnDismissListener(this);
    }

    public void a() {
        this.c.setBackgroundResource(R.drawable.dialog_button_whole_selector);
        this.f26542d.setVisibility(8);
        this.f26548j.setVisibility(8);
    }

    public void b(boolean z) {
        this.f26549k.setVisibility(z ? 8 : 0);
        this.f26545g.setVisibility(z ? 8 : 0);
    }

    public void d(boolean z) {
        this.f26550l = z;
    }

    public void e(int i2) {
        this.f26547i.setBackgroundColor(SkinCompatResources.getColor(getContext(), i2));
    }

    public void f(String str) {
        if (str != null) {
            this.f26542d.setText(str);
        }
    }

    public void g(int i2) {
        if (i2 != -1) {
            this.f26542d.setTextColor(i2);
        }
    }

    public void h(String str) {
        if (str != null) {
            this.c.setText(str);
        }
    }

    public void i(int i2) {
        if (i2 != -1) {
            this.c.setTextColor(i2);
        }
    }

    public void j(boolean z) {
        setCanceledOnTouchOutside(z);
        setCancelable(z);
    }

    public void k(int i2) {
        if (i2 != -1) {
            this.f26543e.setGravity(i2);
            this.f26543e.setPadding(30, 0, 30, 0);
        }
    }

    public void l(View view) {
        if (view != null) {
            this.f26543e.setVisibility(8);
            this.f26546h.addView(view);
        }
    }

    public void m(SpannableString spannableString) {
        TextView textView = this.f26543e;
        if (textView == null || spannableString == null) {
            return;
        }
        textView.setText(spannableString);
        this.f26543e.setMovementMethod(LinkMovementMethod.getInstance());
        this.f26543e.setHighlightColor(ContextCompat.getColor(getContext(), 17170445));
    }

    public void n(Object obj) {
        TextView textView = this.f26543e;
        if (textView == null || obj == null) {
            return;
        }
        if (obj instanceof Spanned) {
            textView.setText((Spanned) obj);
        } else {
            textView.setText(obj + "");
        }
        this.f26543e.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public void o(int i2) {
        if (i2 != -1) {
            this.f26543e.setTextColor(i2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar = this.b;
        if (dVar != null && view != null) {
            dVar.onChlidViewClick(view);
        }
        if (this.f26550l) {
            cancel();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.b != null) {
            this.b = null;
        }
    }

    public void p(int i2) {
        if (i2 != -1) {
            this.f26543e.setTextSize(i2);
            this.f26543e.setGravity(3);
        }
    }

    public void q(d dVar) {
        this.b = dVar;
    }

    public void r(String str) {
        if (str != null) {
            this.f26544f.setVisibility(0);
            this.f26544f.setText(str);
        }
    }
}
