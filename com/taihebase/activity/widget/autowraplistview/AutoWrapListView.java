package com.taihebase.activity.widget.autowraplistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import h.y.a.p.t.e;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class AutoWrapListView<T> extends ViewGroup {
    public List<List<View>> b;
    public List<Integer> c;

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f8218d;

    /* renamed from: e  reason: collision with root package name */
    private e<T> f8219e;

    /* renamed from: f  reason: collision with root package name */
    private List<View> f8220f;

    /* renamed from: g  reason: collision with root package name */
    private int f8221g;

    public AutoWrapListView(Context context) {
    }

    public int getMaxRows() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public void setAdapter(e<T> eVar) {
    }

    public void setMaxNumRows(int i2) {
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
    }

    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
    }

    public AutoWrapListView(Context context, AttributeSet attributeSet) {
    }

    public AutoWrapListView(Context context, AttributeSet attributeSet, int i2) {
    }
}
