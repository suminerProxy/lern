package h.g.a.p.r.d;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class b0 extends FilterInputStream {
    private volatile byte[] b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f16974d;

    /* renamed from: e  reason: collision with root package name */
    private int f16975e;

    /* renamed from: f  reason: collision with root package name */
    private int f16976f;

    /* renamed from: g  reason: collision with root package name */
    private final h.g.a.p.p.a0.b f16977g;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public a(String str) {
        }
    }

    public b0(@NonNull InputStream inputStream, @NonNull h.g.a.p.p.a0.b bVar) {
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
    }

    private static IOException d() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
    }

    public synchronized void b() {
    }

    public synchronized void c() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
    }

    @VisibleForTesting
    public b0(@NonNull InputStream inputStream, @NonNull h.g.a.p.p.a0.b bVar, int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
    }
}
