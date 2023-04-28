package com.showstartfans.activity.view.pin;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.showstartfans.activity.view.SearchEditText;
import com.showstartfans.activity.view.TopTitleListview;
import h.u.a.u.a4.c;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class PinnedList extends FrameLayout implements c.b {

    /* renamed from: l  reason: collision with root package name */
    public static final String f7218l = null;

    /* renamed from: m  reason: collision with root package name */
    public static final int f7219m = 0;
    public Context b;
    private SearchEditText c;

    /* renamed from: d  reason: collision with root package name */
    public ListView f7220d;

    /* renamed from: e  reason: collision with root package name */
    public View f7221e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f7222f;

    /* renamed from: g  reason: collision with root package name */
    public Sidebar f7223g;

    /* renamed from: h  reason: collision with root package name */
    private TopTitleListview f7224h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7225i;

    /* renamed from: j  reason: collision with root package name */
    public c f7226j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f7227k;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PinnedList f7228a;

        public a(PinnedList pinnedList) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements TextWatcher {
        public final /* synthetic */ PinnedList b;

        public b(PinnedList pinnedList) {
        }

        private /* synthetic */ void a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        public /* synthetic */ void b() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public PinnedList(Context context) {
    }

    public static /* synthetic */ boolean c(PinnedList pinnedList, boolean z) {
    }

    private void e(Context context) {
    }

    private /* synthetic */ void g(View view) {
    }

    @Override // h.u.a.u.a4.c.b
    public void a() {
    }

    @Override // h.u.a.u.a4.c.b
    public void b() {
    }

    public void d(CharSequence charSequence) {
    }

    public boolean f() {
    }

    public ListView getListView() {
    }

    public /* synthetic */ void h(View view) {
    }

    public void i(boolean z) {
    }

    public void j() {
    }

    public void setAdapter(c cVar) {
    }

    public void setSearchHitString(String str) {
    }

    public void setShowSiderBar(boolean z) {
    }

    public void setSliderStr(List<String> list) {
    }

    public void setTopView(View view) {
    }

    public PinnedList(Context context, AttributeSet attributeSet, int i2) {
    }

    public PinnedList(Context context, AttributeSet attributeSet) {
    }
}
