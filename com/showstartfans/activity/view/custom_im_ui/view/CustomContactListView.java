package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.component.CustomLinearLayoutManager;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactListView;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView;
import h.u.a.o.t;
import h.u.a.u.y3.u.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CustomContactListView extends LinearLayout implements IContactListView {
    private static final String r = null;
    private RecyclerView b;
    private h.u.a.u.y3.j.c c;

    /* renamed from: d  reason: collision with root package name */
    private CustomLinearLayoutManager f7141d;

    /* renamed from: e  reason: collision with root package name */
    private List<t> f7142e;

    /* renamed from: f  reason: collision with root package name */
    private List<t> f7143f;

    /* renamed from: g  reason: collision with root package name */
    private h.u.a.u.y3.l.a f7144g;

    /* renamed from: h  reason: collision with root package name */
    private ProgressBar f7145h;

    /* renamed from: i  reason: collision with root package name */
    private String f7146i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7147j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7148k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f7149l;

    /* renamed from: m  reason: collision with root package name */
    private CustomIndexBar f7150m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f7151n;

    /* renamed from: o  reason: collision with root package name */
    private h.u.a.u.y3.s.b f7152o;

    /* renamed from: p  reason: collision with root package name */
    private int f7153p;
    private ArrayList<String> q;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomContactListView f7154a;

        public a(CustomContactListView customContactListView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements Comparator<t> {
        public final /* synthetic */ CustomContactListView b;

        public b(CustomContactListView customContactListView) {
        }

        public int a(t tVar, t tVar2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(t tVar, t tVar2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f7155a;
        public final /* synthetic */ CustomContactListView b;

        public c(CustomContactListView customContactListView, List list) {
        }

        @Override // h.u.a.u.y3.u.d.a
        public void a(boolean z) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public static final int f7156a = -1;
        public static final int b = 1;
        public static final int c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7157d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static final int f7158e = 4;

        /* renamed from: f  reason: collision with root package name */
        public static final int f7159f = 5;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface e {
        void onItemClick(int i2, ContactItemBean contactItemBean);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface f {
        void onSelectChanged(ContactItemBean contactItemBean, boolean z);
    }

    public CustomContactListView(Context context) {
    }

    public static /* synthetic */ h.u.a.u.y3.s.b a(CustomContactListView customContactListView) {
    }

    public static /* synthetic */ String b(CustomContactListView customContactListView) {
    }

    public static /* synthetic */ boolean c(CustomContactListView customContactListView) {
    }

    public static /* synthetic */ h.u.a.u.y3.j.c d(CustomContactListView customContactListView) {
    }

    private void e() {
    }

    private boolean f(ContactItemBean contactItemBean) {
    }

    private void i(List<t> list) {
    }

    public void g(int i2) {
    }

    public h.u.a.u.y3.j.c getAdapter() {
    }

    public void h(String str) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactListView
    public void onDataSourceChanged(List<ContactItemBean> list) {
    }

    @Override // com.tencent.qcloud.tuikit.tuicontact.ui.interfaces.IContactListView
    public void onFriendApplicationChanged() {
    }

    public void setAdminList(List<t> list) {
    }

    public void setAlreadySelectedList(ArrayList<String> arrayList) {
    }

    public void setGroupId(String str) {
    }

    public void setIsAdmin(Boolean bool) {
    }

    public void setIsGroupList(boolean z) {
    }

    public void setNotFoundTip(String str) {
    }

    public void setOnItemClickListener(ContactListView.OnItemClickListener onItemClickListener) {
    }

    public void setPresenter(h.u.a.u.y3.s.b bVar) {
    }

    public void setSingleSelectMode(boolean z) {
    }

    public CustomContactListView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public CustomContactListView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
