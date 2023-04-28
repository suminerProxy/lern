package h.g.a.p.q;

import androidx.annotation.NonNull;
import h.g.a.p.o.d;
import h.g.a.p.q.n;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class e<Model, Data> implements n<Model, Data> {
    private static final String b = "data:image";
    private static final String c = ";base64";

    /* renamed from: a  reason: collision with root package name */
    private final a<Data> f16887a;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface a<Data> {
        Class<Data> a();

        Data b(String str) throws IllegalArgumentException;

        void c(Data data) throws IOException;
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b<Data> implements h.g.a.p.o.d<Data> {
        private final String b;
        private final a<Data> c;

        /* renamed from: d  reason: collision with root package name */
        private Data f16888d;

        public b(String str, a<Data> aVar) {
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

    /* compiled from: DataUrlLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final a<InputStream> f16889a;

        /* compiled from: DataUrlLoader.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class a implements a<InputStream> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f16890a;

            public a(c cVar) {
            }

            @Override // h.g.a.p.q.e.a
            public Class<InputStream> a() {
            }

            @Override // h.g.a.p.q.e.a
            public /* bridge */ /* synthetic */ InputStream b(String str) throws IllegalArgumentException {
            }

            @Override // h.g.a.p.q.e.a
            public /* bridge */ /* synthetic */ void c(InputStream inputStream) throws IOException {
            }

            public void d(InputStream inputStream) throws IOException {
            }

            public InputStream e(String str) {
            }
        }

        @Override // h.g.a.p.q.o
        public void a() {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public n<Model, InputStream> c(@NonNull r rVar) {
        }
    }

    public e(a<Data> aVar) {
    }

    @Override // h.g.a.p.q.n
    public boolean a(@NonNull Model model) {
    }

    @Override // h.g.a.p.q.n
    public n.a<Data> b(@NonNull Model model, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }
}
