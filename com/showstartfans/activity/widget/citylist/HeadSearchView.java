package com.showstartfans.activity.widget.citylist;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HeadSearchView extends LinearLayout {
    private c b;
    private b c;

    /* renamed from: d  reason: collision with root package name */
    private d f7455d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f7456e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f7457f;

    /* renamed from: g  reason: collision with root package name */
    public EditText f7458g;

    /* renamed from: h  reason: collision with root package name */
    private Context f7459h;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements TextWatcher {
        public final /* synthetic */ HeadSearchView b;

        public a(HeadSearchView headSearchView) {
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

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void onClick();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface c {
        void onClick();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void a(CharSequence charSequence);
    }

    public HeadSearchView(Context context) {
    }

    public static /* synthetic */ d a(HeadSearchView headSearchView) {
    }

    private void d() {
    }

    private /* synthetic */ void e(View view) {
    }

    private /* synthetic */ void g(View view) {
    }

    public void b() {
    }

    public void c() {
    }

    public /* synthetic */ void f(View view) {
    }

    public /* synthetic */ void h(View view) {
    }

    public void setBgColor(int i2) {
    }

    public void setBtnVisibility(int i2) {
    }

    public void setEditHint(CharSequence charSequence) {
    }

    public void setEditText(CharSequence charSequence) {
    }

    public void setImageCleanVisibility(int i2) {
    }

    public void setOnActionBtnListener(b bVar) {
    }

    public void setOnBackBtnListener(c cVar) {
    }

    public void setOnEditSearchListener(d dVar) {
    }

    public void setbtnActionText(CharSequence charSequence) {
    }

    public HeadSearchView(Context context, AttributeSet attributeSet) {
    }
}
