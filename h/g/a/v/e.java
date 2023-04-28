package h.g.a.v;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class e extends InputStream {
    @GuardedBy("POOL")

    /* renamed from: d  reason: collision with root package name */
    private static final Queue<e> f17264d = null;
    private InputStream b;
    private IOException c;

    public static void a() {
    }

    @NonNull
    public static e c(@NonNull InputStream inputStream) {
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
    }

    @Nullable
    public IOException b() {
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public void d() {
    }

    public void e(@NonNull InputStream inputStream) {
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
    }
}
