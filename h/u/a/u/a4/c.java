package h.u.a.u.a4;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.Filter;
import android.widget.SectionIndexer;
import h.u.a.u.a4.d;
import h.y.a.f.g;
import java.util.List;

/* compiled from: BasePinAdapter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public abstract class c<T extends d> extends g<T> implements SectionIndexer {

    /* renamed from: f  reason: collision with root package name */
    private SparseIntArray f24633f;

    /* renamed from: g  reason: collision with root package name */
    private SparseIntArray f24634g;

    /* renamed from: h  reason: collision with root package name */
    private c<T>.a f24635h;

    /* renamed from: i  reason: collision with root package name */
    private b f24636i;

    /* compiled from: BasePinAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends Filter {

        /* renamed from: a  reason: collision with root package name */
        public List<T> f24637a;
        public final /* synthetic */ c b;

        public a(c cVar, List<T> list) {
        }

        public void a(List<T> list) {
        }

        @Override // android.widget.Filter
        public synchronized Filter.FilterResults performFiltering(CharSequence charSequence) {
        }

        @Override // android.widget.Filter
        public synchronized void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        }
    }

    /* compiled from: BasePinAdapter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        void a();

        void b();
    }

    public c(Context context) {
    }

    public static /* synthetic */ b r(c cVar) {
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i2) {
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i2) {
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
    }

    @Override // h.y.a.f.g
    public void k() {
    }

    @Override // h.y.a.f.g
    public void l(List<T> list) {
    }

    public void s(b bVar) {
    }

    public Filter t() {
    }

    public abstract String u(T t);

    public abstract String v(T t);

    public String w(int i2) {
    }

    public c(Context context, List<T> list) {
    }
}
