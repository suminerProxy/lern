package com.soli.pullupdownrefresh.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class GridViewWithHeaderAndFooter extends GridView {

    /* renamed from: k  reason: collision with root package name */
    public static boolean f7766k = false;

    /* renamed from: l  reason: collision with root package name */
    private static final String f7767l = "GridViewHeaderAndFooter";
    private AdapterView.OnItemClickListener b;
    private AdapterView.OnItemLongClickListener c;

    /* renamed from: d  reason: collision with root package name */
    private int f7768d;

    /* renamed from: e  reason: collision with root package name */
    private View f7769e;

    /* renamed from: f  reason: collision with root package name */
    private int f7770f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<b> f7771g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<b> f7772h;

    /* renamed from: i  reason: collision with root package name */
    private ListAdapter f7773i;

    /* renamed from: j  reason: collision with root package name */
    private e f7774j;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f7775a;
        public ViewGroup b;
        public Object c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f7776d;

        private b() {
        }

        public /* synthetic */ b(a aVar) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends FrameLayout {
        public final /* synthetic */ GridViewWithHeaderAndFooter b;

        public c(GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter, Context context) {
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class d implements WrapperListAdapter, Filterable {

        /* renamed from: l  reason: collision with root package name */
        public static final ArrayList<b> f7777l = null;
        private final DataSetObservable b;
        private final ListAdapter c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f7778d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<b> f7779e;

        /* renamed from: f  reason: collision with root package name */
        private int f7780f;

        /* renamed from: g  reason: collision with root package name */
        private int f7781g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f7782h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f7783i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f7784j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f7785k;

        public d(ArrayList<b> arrayList, ArrayList<b> arrayList2, ListAdapter listAdapter) {
        }

        private boolean a(ArrayList<b> arrayList) {
        }

        private int c() {
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
        }

        public int d() {
        }

        public int e() {
        }

        public void f() {
        }

        public boolean g(View view) {
        }

        @Override // android.widget.Adapter
        public int getCount() {
        }

        @Override // android.widget.Filterable
        public Filter getFilter() {
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
        }

        @Override // android.widget.WrapperListAdapter
        public ListAdapter getWrappedAdapter() {
        }

        public boolean h(View view) {
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
        }

        public void i(int i2) {
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
        }

        public void j(int i2) {
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
        public final /* synthetic */ GridViewWithHeaderAndFooter b;

        private e(GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter) {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        }

        public /* synthetic */ e(GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter, a aVar) {
        }
    }

    public GridViewWithHeaderAndFooter(Context context) {
    }

    public static /* synthetic */ AdapterView.OnItemClickListener a(GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter) {
    }

    public static /* synthetic */ int b(GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter) {
    }

    public static /* synthetic */ AdapterView.OnItemLongClickListener c(GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter) {
    }

    @TargetApi(16)
    private int getColumnWidthCompatible() {
    }

    private e getItemClickHandler() {
    }

    @TargetApi(11)
    private int getNumColumnsCompatible() {
    }

    private void i() {
    }

    private void k(View view, ArrayList<b> arrayList) {
    }

    public void d(View view) {
    }

    public void e(View view, Object obj, boolean z) {
    }

    public void f(View view) {
    }

    public void g(View view, Object obj, boolean z) {
    }

    public int getFooterViewsCount() {
    }

    public int getHeaderViewsCount() {
    }

    @Override // android.widget.GridView
    @TargetApi(16)
    public int getHorizontalSpacing() {
    }

    public ListAdapter getOriginalAdapter() {
    }

    public int getRowHeight() {
    }

    @Override // android.widget.GridView
    @TargetApi(16)
    public int getVerticalSpacing() {
    }

    public int h(int i2) {
    }

    public void j() {
    }

    public boolean l(View view) {
    }

    public boolean m(View view) {
    }

    @TargetApi(11)
    public void n() {
    }

    @TargetApi(11)
    public void o(int i2) {
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(ListAdapter listAdapter) {
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z) {
    }

    public void setClipChildrenSupper(boolean z) {
    }

    @Override // android.widget.GridView
    public void setNumColumns(int i2) {
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public void setAdapter2(ListAdapter listAdapter) {
    }

    public GridViewWithHeaderAndFooter(Context context, AttributeSet attributeSet) {
    }

    public GridViewWithHeaderAndFooter(Context context, AttributeSet attributeSet, int i2) {
    }
}
