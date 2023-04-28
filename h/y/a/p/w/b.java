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
import skin.support.content.res.SkinCompatResources;

/* compiled from: DefaultScrollDialog.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class b extends Dialog implements View.OnClickListener, DialogInterface.OnDismissListener {
    private d b;
    private TextView c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f26551d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f26552e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f26553f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayout f26554g;

    /* renamed from: h  reason: collision with root package name */
    private RelativeLayout f26555h;

    /* renamed from: i  reason: collision with root package name */
    private View f26556i;

    /* renamed from: j  reason: collision with root package name */
    private View f26557j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f26558k;

    public b(Context context) {
        super(context, R.style.DialogTheme);
        this.f26558k = true;
        c();
    }

    private void c() {
        View inflate = View.inflate(getContext(), R.layout.dialog_scroll_default, null);
        this.c = (TextView) inflate.findViewById(R.id.btn_ok);
        this.f26551d = (TextView) inflate.findViewById(R.id.btn_cancle);
        this.f26552e = (TextView) inflate.findViewById(R.id.content);
        this.f26553f = (TextView) inflate.findViewById(R.id.dailogTitle);
        this.f26556i = inflate.findViewById(R.id.bottom_sep);
        this.f26557j = inflate.findViewById(R.id.content_sep);
        this.f26554g = (LinearLayout) inflate.findViewById(R.id.ll_foot_dialog);
        this.f26555h = (RelativeLayout) inflate.findViewById(R.id.root);
        this.c.setOnClickListener(this);
        this.f26551d.setOnClickListener(this);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.width = -2;
        getWindow().setAttributes(attributes);
        setContentView(inflate);
        j(false);
        setOnDismissListener(this);
    }

    public void a() {
        this.c.setBackgroundResource(R.drawable.dialog_button_whole_selector);
        this.f26551d.setVisibility(8);
        this.f26556i.setVisibility(8);
    }

    public void b(boolean z) {
        this.f26557j.setVisibility(z ? 8 : 0);
        this.f26554g.setVisibility(z ? 8 : 0);
    }

    public void d(boolean z) {
        this.f26558k = z;
    }

    public void e(int i2) {
        this.f26555h.setBackgroundColor(SkinCompatResources.getColor(getContext(), i2));
    }

    public void f(String str) {
        if (str != null) {
            this.f26551d.setText(str);
        }
    }

    public void g(int i2) {
        if (i2 != -1) {
            this.f26551d.setTextColor(i2);
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
            this.f26552e.setGravity(i2);
            this.f26552e.setPadding(30, 0, 30, 0);
        }
    }

    public void l(SpannableString spannableString) {
        TextView textView = this.f26552e;
        if (textView == null || spannableString == null) {
            return;
        }
        textView.setText(spannableString);
        this.f26552e.setMovementMethod(LinkMovementMethod.getInstance());
        this.f26552e.setHighlightColor(ContextCompat.getColor(getContext(), 17170445));
    }

    public void m(Object obj) {
        TextView textView = this.f26552e;
        if (textView == null || obj == null) {
            return;
        }
        if (obj instanceof Spanned) {
            textView.setText((Spanned) obj);
        } else {
            textView.setText(obj + "");
        }
        this.f26552e.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public void n(int i2) {
        if (i2 != -1) {
            this.f26552e.setTextColor(i2);
        }
    }

    public void o(int i2) {
        if (i2 != -1) {
            this.f26552e.setTextSize(i2);
            this.f26552e.setGravity(3);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d dVar = this.b;
        if (dVar != null && view != null) {
            dVar.onChlidViewClick(view);
        }
        if (this.f26558k) {
            cancel();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.b != null) {
            this.b = null;
        }
    }

    public void p(d dVar) {
        this.b = dVar;
    }

    public void q(String str) {
        if (str != null) {
            this.f26553f.setVisibility(0);
            this.f26553f.setText(str);
        }
    }
}
