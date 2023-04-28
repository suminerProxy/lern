package h.g.a.p.q;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import h.g.a.p.o.d;
import h.g.a.p.q.n;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class f<Data> implements n<File, Data> {
    private static final String b = "FileLoader";

    /* renamed from: a  reason: collision with root package name */
    private final d<Data> f16891a;

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final d<Data> f16892a;

        public a(d<Data> dVar) {
        }

        @Override // h.g.a.p.q.o
        public final void a() {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public final n<File, Data> c(@NonNull r rVar) {
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // h.g.a.p.q.f.d
            public Class<ParcelFileDescriptor> a() {
            }

            @Override // h.g.a.p.q.f.d
            public /* bridge */ /* synthetic */ ParcelFileDescriptor b(File file) throws FileNotFoundException {
            }

            @Override // h.g.a.p.q.f.d
            public /* bridge */ /* synthetic */ void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            }

            public void d(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            }

            public ParcelFileDescriptor e(File file) throws FileNotFoundException {
            }
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class c<Data> implements h.g.a.p.o.d<Data> {
        private final File b;
        private final d<Data> c;

        /* renamed from: d  reason: collision with root package name */
        private Data f16893d;

        public c(File file, d<Data> dVar) {
        }

        @Override // h.g.a.p.o.d
        @NonNull
        public Class<Data> a() {
        }

        @Override // h.g.a.p.o.d
        public void b() {
        }

        @Override // h.g.a.p.o.d
        public void cancel() {
        }

        @Override // h.g.a.p.o.d
        public void d(@NonNull h.g.a.h hVar, @NonNull d.a<? super Data> aVar) {
        }

        @Override // h.g.a.p.o.d
        @NonNull
        public h.g.a.p.a getDataSource() {
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void c(Data data) throws IOException;
    }

    /* compiled from: FileLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class a implements d<InputStream> {
            @Override // h.g.a.p.q.f.d
            public Class<InputStream> a() {
            }

            @Override // h.g.a.p.q.f.d
            public /* bridge */ /* synthetic */ InputStream b(File file) throws FileNotFoundException {
            }

            @Override // h.g.a.p.q.f.d
            public /* bridge */ /* synthetic */ void c(InputStream inputStream) throws IOException {
            }

            public void d(InputStream inputStream) throws IOException {
            }

            public InputStream e(File file) throws FileNotFoundException {
            }
        }
    }

    public f(d<Data> dVar) {
    }

    @Override // h.g.a.p.q.n
    public /* bridge */ /* synthetic */ boolean a(@NonNull File file) {
    }

    @Override // h.g.a.p.q.n
    public /* bridge */ /* synthetic */ n.a b(@NonNull File file, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }

    public n.a<Data> c(@NonNull File file, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }

    public boolean d(@NonNull File file) {
    }
}
