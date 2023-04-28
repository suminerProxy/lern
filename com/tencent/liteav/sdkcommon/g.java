package com.tencent.liteav.sdkcommon;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayMetrics f11626a;
    public final Context b;
    public WindowManager c;

    /* renamed from: d  reason: collision with root package name */
    public WindowManager.LayoutParams f11627d;

    /* renamed from: e  reason: collision with root package name */
    public WindowManager.LayoutParams f11628e;

    /* renamed from: f  reason: collision with root package name */
    public View f11629f;

    /* renamed from: g  reason: collision with root package name */
    public View f11630g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f11631h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f11632i;

    /* renamed from: j  reason: collision with root package name */
    public Spinner f11633j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayAdapter<String> f11634k;

    /* renamed from: l  reason: collision with root package name */
    public ScrollView f11635l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11636m;

    /* renamed from: n  reason: collision with root package name */
    public String f11637n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f11638o;

    /* renamed from: p  reason: collision with root package name */
    public final a f11639p;
    private final int q;
    private final int r;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface a {
        void a(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f11640a;
        private int b;
        private int c;

        private b(g gVar) {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
        }

        public /* synthetic */ b(g gVar, byte b) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f11641a;

        private c(g gVar) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        public /* synthetic */ c(g gVar, byte b) {
        }
    }

    public g(Context context, a aVar) {
    }

    public final void a(String str) {
    }

    public final void b(String str) {
    }

    public final void a() {
    }

    public final int a(int i2) {
    }
}
