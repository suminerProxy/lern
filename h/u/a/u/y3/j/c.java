package h.u.a.u.y3.j;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.showstartfans.activity.view.GroupMemberTagView;
import com.showstartfans.activity.view.UserLevelView;
import com.tencent.qcloud.tuicore.component.gatherimage.ShadeImageView;
import com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback;
import com.tencent.qcloud.tuikit.tuicontact.bean.ContactItemBean;
import com.tencent.qcloud.tuikit.tuicontact.ui.view.ContactListView;
import h.u.a.o.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomContactAdapter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c extends RecyclerView.Adapter<C0368c> {

    /* renamed from: a  reason: collision with root package name */
    public String f24770a;
    public List<t> b;
    private ContactListView.OnItemClickListener c;

    /* renamed from: d  reason: collision with root package name */
    private int f24771d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f24772e;

    /* renamed from: f  reason: collision with root package name */
    private h.u.a.u.y3.s.b f24773f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f24774g;

    /* renamed from: h  reason: collision with root package name */
    private int f24775h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<String> f24776i;

    /* compiled from: CustomContactAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ ContactItemBean b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f24777d;

        public a(c cVar, ContactItemBean contactItemBean, int i2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: CustomContactAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends IUIKitCallback<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0368c f24778a;
        public final /* synthetic */ c b;

        public b(c cVar, C0368c c0368c) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public void onError(String str, int i2, String str2) {
        }

        @Override // com.tencent.qcloud.tuicore.component.interfaces.IUIKitCallback
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
        }

        /* renamed from: onSuccess  reason: avoid collision after fix types in other method */
        public void onSuccess2(Integer num) {
        }
    }

    /* compiled from: CustomContactAdapter.java */
    /* renamed from: h.u.a.u.y3.j.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class C0368c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public RelativeLayout f24779a;
        public TextView b;
        public TextView c;

        /* renamed from: d  reason: collision with root package name */
        public ShadeImageView f24780d;

        /* renamed from: e  reason: collision with root package name */
        public View f24781e;

        /* renamed from: f  reason: collision with root package name */
        public View f24782f;

        /* renamed from: g  reason: collision with root package name */
        public View f24783g;

        /* renamed from: h  reason: collision with root package name */
        public GroupMemberTagView f24784h;

        /* renamed from: i  reason: collision with root package name */
        public ImageView f24785i;

        /* renamed from: j  reason: collision with root package name */
        public UserLevelView f24786j;

        public C0368c(View view) {
        }
    }

    public c(List<t> list) {
    }

    public static /* synthetic */ ContactListView.OnItemClickListener c(c cVar) {
    }

    public static /* synthetic */ boolean d(c cVar) {
    }

    public static /* synthetic */ int e(c cVar) {
    }

    public static /* synthetic */ int f(c cVar, int i2) {
    }

    private t g(int i2) {
    }

    private void k(C0368c c0368c, ContactItemBean contactItemBean) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    public void h(C0368c c0368c, @SuppressLint({"RecyclerView"}) int i2) {
    }

    public C0368c i(ViewGroup viewGroup, int i2) {
    }

    public void j(C0368c c0368c) {
    }

    public void l(h.u.a.u.y3.s.b bVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(C0368c c0368c, @SuppressLint({"RecyclerView"}) int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ C0368c onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(C0368c c0368c) {
    }

    public void setAlreadySelectedList(ArrayList<String> arrayList) {
    }

    public void setDataSource(List<t> list) {
    }

    public void setDataSourceType(int i2) {
    }

    public void setIsGroupList(boolean z) {
    }

    public void setOnItemClickListener(ContactListView.OnItemClickListener onItemClickListener) {
    }

    public void setSingleSelectMode(boolean z) {
    }
}
