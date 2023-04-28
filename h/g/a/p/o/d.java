package h.g.a.p.o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: DataFetcher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface d<T> {

    /* compiled from: DataFetcher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a<T> {
        void c(@NonNull Exception exc);

        void e(@Nullable T t);
    }

    @NonNull
    Class<T> a();

    void b();

    void cancel();

    void d(@NonNull h.g.a.h hVar, @NonNull a<? super T> aVar);

    @NonNull
    h.g.a.p.a getDataSource();
}
