package h.g.a.p.q;

import androidx.annotation.NonNull;
import h.g.a.p.o.d;
import h.g.a.p.q.n;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0321b<Data> f16882a;

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: h.g.a.p.q.b$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class C0320a implements InterfaceC0321b<ByteBuffer> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f16883a;

            public C0320a(a aVar) {
            }

            @Override // h.g.a.p.q.b.InterfaceC0321b
            public Class<ByteBuffer> a() {
            }

            @Override // h.g.a.p.q.b.InterfaceC0321b
            public /* bridge */ /* synthetic */ ByteBuffer b(byte[] bArr) {
            }

            public ByteBuffer c(byte[] bArr) {
            }
        }

        @Override // h.g.a.p.q.o
        public void a() {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public n<byte[], ByteBuffer> c(@NonNull r rVar) {
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: h.g.a.p.q.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InterfaceC0321b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c<Data> implements h.g.a.p.o.d<Data> {
        private final byte[] b;
        private final InterfaceC0321b<Data> c;

        public c(byte[] bArr, InterfaceC0321b<Data> interfaceC0321b) {
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

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class a implements InterfaceC0321b<InputStream> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f16884a;

            public a(d dVar) {
            }

            @Override // h.g.a.p.q.b.InterfaceC0321b
            public Class<InputStream> a() {
            }

            @Override // h.g.a.p.q.b.InterfaceC0321b
            public /* bridge */ /* synthetic */ InputStream b(byte[] bArr) {
            }

            public InputStream c(byte[] bArr) {
            }
        }

        @Override // h.g.a.p.q.o
        public void a() {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public n<byte[], InputStream> c(@NonNull r rVar) {
        }
    }

    public b(InterfaceC0321b<Data> interfaceC0321b) {
    }

    @Override // h.g.a.p.q.n
    public /* bridge */ /* synthetic */ boolean a(@NonNull byte[] bArr) {
    }

    @Override // h.g.a.p.q.n
    public /* bridge */ /* synthetic */ n.a b(@NonNull byte[] bArr, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }

    public n.a<Data> c(@NonNull byte[] bArr, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }

    public boolean d(@NonNull byte[] bArr) {
    }
}
