package h.u.a.c.h0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.opensource.svgaplayer.SVGAImageView;
import com.showstartfans.activity.model.FindVideoChannelBean;
import com.taihebase.activity.view.LoadImageView;
import com.taihebase.activity.view.RecycleTabLayout;
import h.s.a.h;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdapterVideoChannel.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class o4 extends RecycleTabLayout.c<RecyclerView.ViewHolder> {
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19143d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f19144e;

    /* renamed from: f  reason: collision with root package name */
    private h.u.a.c.f0.v9.x3 f19145f;

    /* renamed from: g  reason: collision with root package name */
    private List<FindVideoChannelBean> f19146g;

    /* compiled from: AdapterVideoChannel.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f19147a;
        public final /* synthetic */ o4 b;

        public a(o4 o4Var, c cVar) {
        }

        @Override // h.s.a.h.d
        public void a(@NotNull h.s.a.j jVar) {
        }

        @Override // h.s.a.h.d
        public void onError() {
        }
    }

    /* compiled from: AdapterVideoChannel.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public LoadImageView f19148a;
        public TextView b;
        public LinearLayout c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ o4 f19149d;

        public b(o4 o4Var, View view) {
        }
    }

    /* compiled from: AdapterVideoChannel.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f19150a;
        public SVGAImageView b;
        public final /* synthetic */ o4 c;

        public c(o4 o4Var, View view) {
        }
    }

    public o4(ViewPager viewPager, Context context) {
    }

    private /* synthetic */ void f(int i2, View view) {
    }

    public void addAll(List<FindVideoChannelBean> list) {
    }

    public /* synthetic */ void g(int i2, View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
    }

    public void h(h.u.a.c.f0.v9.x3 x3Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
    }

    public void removeAll() {
    }
}
