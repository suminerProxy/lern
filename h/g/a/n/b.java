package h.g.a.n;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final byte f16518g = 13;

    /* renamed from: h  reason: collision with root package name */
    private static final byte f16519h = 10;
    private final InputStream b;
    private final Charset c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f16520d;

    /* renamed from: e  reason: collision with root package name */
    private int f16521e;

    /* renamed from: f  reason: collision with root package name */
    private int f16522f;

    /* compiled from: StrictLineReader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a extends ByteArrayOutputStream {
        public final /* synthetic */ b b;

        public a(b bVar, int i2) {
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
        }
    }

    public b(InputStream inputStream, Charset charset) {
    }

    public static /* synthetic */ Charset a(b bVar) {
    }

    private void b() throws IOException {
    }

    public boolean c() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public String d() throws IOException {
    }

    public b(InputStream inputStream, int i2, Charset charset) {
    }
}
