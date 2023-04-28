package h.g.a.p.p.b0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* compiled from: DiskCache.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface a {

    /* compiled from: DiskCache.java */
    /* renamed from: h.g.a.p.p.b0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InterfaceC0311a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f16674a = 262144000;
        public static final String b = "image_manager_disk_cache";

        @Nullable
        a build();
    }

    /* compiled from: DiskCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        boolean a(@NonNull File file);
    }

    void a(h.g.a.p.g gVar, b bVar);

    @Nullable
    File b(h.g.a.p.g gVar);

    void c(h.g.a.p.g gVar);

    void clear();
}
