package h.g.a.v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f17258a = 16384;
    private static final AtomicReference<byte[]> b = null;

    /* compiled from: ByteBufferUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f17260a;
        public final int b;
        public final byte[] c;

        public b(@NonNull byte[] bArr, int i2, int i3) {
        }
    }

    private a() {
    }

    @NonNull
    public static ByteBuffer a(@NonNull File file) throws IOException {
    }

    @NonNull
    public static ByteBuffer b(@NonNull InputStream inputStream) throws IOException {
    }

    @Nullable
    private static b c(@NonNull ByteBuffer byteBuffer) {
    }

    @NonNull
    public static byte[] d(@NonNull ByteBuffer byteBuffer) {
    }

    public static void e(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws IOException {
    }

    @NonNull
    public static InputStream f(@NonNull ByteBuffer byteBuffer) {
    }

    public static void g(@NonNull ByteBuffer byteBuffer, @NonNull OutputStream outputStream) throws IOException {
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: h.g.a.v.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class C0329a extends InputStream {

        /* renamed from: d  reason: collision with root package name */
        private static final int f17259d = -1;
        @NonNull
        private final ByteBuffer b;
        private int c;

        public C0329a(@NonNull ByteBuffer byteBuffer) {
        }

        @Override // java.io.InputStream
        public int available() {
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
        }

        @Override // java.io.InputStream
        public int read() {
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
        }

        @Override // java.io.InputStream
        public long skip(long j2) throws IOException {
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i2, int i3) throws IOException {
        }
    }
}
