package com.showstartfans.activity.activitys.maintab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h.u.a.c.f0.q8;
import h.u.a.c.f0.t8;
import h.u.a.c.f0.w8;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class HomeCalendarListView extends FrameLayout implements SkinCompatSupportable {
    private int b;
    private RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    private w8 f5774d;

    /* renamed from: e  reason: collision with root package name */
    private q8 f5775e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<t8> f5776f;

    /* renamed from: g  reason: collision with root package name */
    private t8 f5777g;

    /* renamed from: h  reason: collision with root package name */
    private t8 f5778h;

    /* renamed from: i  reason: collision with root package name */
    private b f5779i;

    /* renamed from: j  reason: collision with root package name */
    private final SimpleDateFormat f5780j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeCalendarListView f5781a;

        public a(HomeCalendarListView homeCalendarListView) {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void a(String str, String str2);

        void b(boolean z);

        void c(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class c implements b {
        @Override // com.showstartfans.activity.activitys.maintab.HomeCalendarListView.b
        public void a(String str, String str2) {
        }

        @Override // com.showstartfans.activity.activitys.maintab.HomeCalendarListView.b
        public void b(boolean z) {
        }

        @Override // com.showstartfans.activity.activitys.maintab.HomeCalendarListView.b
        public void c(int i2) {
        }
    }

    public HomeCalendarListView(@NonNull Context context) {
    }

    public static /* synthetic */ ArrayList a(HomeCalendarListView homeCalendarListView) {
    }

    private void b(List<t8> list, int i2, t8 t8Var) {
    }

    private List<t8> d(int i2) {
    }

    private t8 e(long j2) {
    }

    private String f(String str) {
    }

    private void g(Context context, @Nullable AttributeSet attributeSet) {
    }

    private /* synthetic */ void h(View view, int i2) {
    }

    private void k(t8 t8Var) {
    }

    @Override // skin.support.widget.SkinCompatSupportable
    public void applySkin() {
    }

    public int c(String str) {
    }

    public t8 getEndDate() {
    }

    public t8 getStartDate() {
    }

    public t8[] getTarget() {
    }

    public /* synthetic */ void i(View view, int i2) {
    }

    public t8[] j(int i2, boolean z) {
    }

    public void l() {
    }

    public void m(long j2, long j3) {
    }

    public void n(t8 t8Var, t8 t8Var2) {
    }

    public void o() {
    }

    public t8[] p(boolean z) {
    }

    public void setOnDateSelected(b bVar) {
    }

    public HomeCalendarListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    public HomeCalendarListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
