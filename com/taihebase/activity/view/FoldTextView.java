package com.taihebase.activity.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.taihebase.activity.view.svg.SvgImageView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FoldTextView extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private View b;
    private b c;

    /* renamed from: d  reason: collision with root package name */
    public int f7986d;

    /* renamed from: e  reason: collision with root package name */
    public int f7987e;

    /* renamed from: f  reason: collision with root package name */
    public int f7988f;

    /* renamed from: g  reason: collision with root package name */
    public int f7989g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7990h;

    /* renamed from: i  reason: collision with root package name */
    public RotateAnimation f7991i;

    /* renamed from: j  reason: collision with root package name */
    public RotateAnimation f7992j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7993k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7994l;

    /* renamed from: m  reason: collision with root package name */
    public final int f7995m;

    /* renamed from: n  reason: collision with root package name */
    public View.OnClickListener f7996n;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ FoldTextView b;

        public a(FoldTextView foldTextView) {
        }

        private /* synthetic */ void a(int i2) throws Exception {
        }

        private /* synthetic */ void c(int i2) throws Exception {
        }

        private /* synthetic */ void e() {
        }

        private /* synthetic */ void g() {
        }

        public /* synthetic */ void b(int i2) {
        }

        public /* synthetic */ void d(int i2) {
        }

        public /* synthetic */ void f() {
        }

        public /* synthetic */ void h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public TextView f7997a;
        public SvgImageView b;
        public TextView c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f7998d;

        public b(View view) {
        }
    }

    public FoldTextView(Context context) {
    }

    public static /* synthetic */ b a(FoldTextView foldTextView) {
    }

    private void b() {
    }

    public void c() {
    }

    public String getText() {
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    public void setText(String str) {
    }

    public void setTextColor(int i2) {
    }

    public FoldTextView(Context context, AttributeSet attributeSet) {
    }

    @TargetApi(11)
    public FoldTextView(Context context, AttributeSet attributeSet, int i2) {
    }
}
