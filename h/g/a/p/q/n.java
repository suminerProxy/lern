package h.g.a.p.q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final h.g.a.p.g f16915a;
        public final List<h.g.a.p.g> b;
        public final h.g.a.p.o.d<Data> c;

        public a(@NonNull h.g.a.p.g gVar, @NonNull h.g.a.p.o.d<Data> dVar) {
        }

        public a(@NonNull h.g.a.p.g gVar, @NonNull List<h.g.a.p.g> list, @NonNull h.g.a.p.o.d<Data> dVar) {
        }
    }

    boolean a(@NonNull Model model);

    @Nullable
    a<Data> b(@NonNull Model model, int i2, int i3, @NonNull h.g.a.p.j jVar);
}
