package h.v.a.e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: LoadMoreRecyclerAdapter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class e extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: h  reason: collision with root package name */
    public static final int f25448h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f25449i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f25450j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f25451k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f25452l = 7898;

    /* renamed from: m  reason: collision with root package name */
    public static final int f25453m = 7899;

    /* renamed from: a  reason: collision with root package name */
    private List<View> f25454a;
    private List<View> b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private InterfaceC0393e f25455d;

    /* renamed from: e  reason: collision with root package name */
    private f f25456e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.Adapter<RecyclerView.ViewHolder> f25457f;

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView.AdapterDataObserver f25458g;

    /* compiled from: LoadMoreRecyclerAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends RecyclerView.AdapterDataObserver {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f25459a;

        public a(e eVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i4) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
        }
    }

    /* compiled from: LoadMoreRecyclerAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public FrameLayout f25460a;

        public b(View view) {
        }
    }

    /* compiled from: LoadMoreRecyclerAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements View.OnClickListener {
        private RecyclerView.ViewHolder b;
        public final /* synthetic */ e c;

        public c(e eVar, RecyclerView.ViewHolder viewHolder) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: LoadMoreRecyclerAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d implements View.OnLongClickListener {
        private RecyclerView.ViewHolder b;
        public final /* synthetic */ e c;

        public d(e eVar, RecyclerView.ViewHolder viewHolder) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* compiled from: LoadMoreRecyclerAdapter.java */
    /* renamed from: h.v.a.e.e$e  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface InterfaceC0393e {
        void a(e eVar, RecyclerView.ViewHolder viewHolder, int i2);
    }

    /* compiled from: LoadMoreRecyclerAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface f {
        void a(e eVar, RecyclerView.ViewHolder viewHolder, int i2);
    }

    public e(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
    }

    private void D(b bVar, View view) {
    }

    public static /* synthetic */ InterfaceC0393e c(e eVar) {
    }

    public static /* synthetic */ f d(e eVar) {
    }

    public RecyclerView.ViewHolder A(ViewGroup viewGroup, int i2) {
    }

    public void B(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    public void C(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    public void E(View view) {
    }

    public void F(View view) {
    }

    public void G(int i2) {
    }

    public void e(View view) {
    }

    public void f(View view) {
    }

    public int g() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i2) {
    }

    public int h() {
    }

    public int i() {
    }

    public long j(int i2) {
    }

    public int k(int i2) {
    }

    public int l() {
    }

    public InterfaceC0393e m() {
    }

    public f n() {
    }

    public int o(int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public boolean p(int i2) {
    }

    public boolean q(int i2) {
    }

    public void r() {
    }

    public void s(int i2) {
    }

    public void setOnItemClickListener(InterfaceC0393e interfaceC0393e) {
    }

    public void setOnItemLongClickListener(f fVar) {
    }

    public void t(int i2) {
    }

    public void u(int i2, int i3) {
    }

    public void v(int i2, int i3) {
    }

    public void w(int i2, int i3) {
    }

    public void x(int i2, int i3) {
    }

    public void y(int i2) {
    }

    public void z(RecyclerView.ViewHolder viewHolder, int i2) {
    }
}
