package h.p.a.a.f;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: ApkSignatureSchemeV2Verifier.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17714a = "X-Android-APK-Signed";
    public static final int b = 2;
    private static final int c = 1048576;

    /* renamed from: d  reason: collision with root package name */
    private static final int f17715d = 257;

    /* renamed from: e  reason: collision with root package name */
    private static final int f17716e = 258;

    /* renamed from: f  reason: collision with root package name */
    private static final int f17717f = 259;

    /* renamed from: g  reason: collision with root package name */
    private static final int f17718g = 260;

    /* renamed from: h  reason: collision with root package name */
    private static final int f17719h = 513;

    /* renamed from: i  reason: collision with root package name */
    private static final int f17720i = 514;

    /* renamed from: j  reason: collision with root package name */
    private static final int f17721j = 769;

    /* renamed from: k  reason: collision with root package name */
    private static final int f17722k = 1;

    /* renamed from: l  reason: collision with root package name */
    private static final int f17723l = 2;

    /* renamed from: m  reason: collision with root package name */
    public static final long f17724m = 3617552046287187010L;

    /* renamed from: n  reason: collision with root package name */
    public static final long f17725n = 2334950737559900225L;

    /* renamed from: o  reason: collision with root package name */
    private static final int f17726o = 32;

    /* renamed from: p  reason: collision with root package name */
    public static final int f17727p = 1896449818;
    public static final int q = 1114793335;
    public static final int r = 4096;

    /* compiled from: ApkSignatureSchemeV2Verifier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f17728a;
        private final long b;
        private final long c;

        /* renamed from: d  reason: collision with root package name */
        private final long f17729d;

        /* renamed from: e  reason: collision with root package name */
        private final ByteBuffer f17730e;

        private b(ByteBuffer byteBuffer, long j2, long j3, long j4, ByteBuffer byteBuffer2) {
            this.f17728a = byteBuffer;
            this.b = j2;
            this.c = j3;
            this.f17729d = j4;
            this.f17730e = byteBuffer2;
        }
    }

    /* compiled from: ApkSignatureSchemeV2Verifier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class c extends Exception {
        private static final long serialVersionUID = 1;

        public c(String str) {
            super(str);
        }

        public c(String str, Throwable th) {
            super(str, th);
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int b(int i2, int i3) {
        if (i2 == 1) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return -1;
                }
                throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i3);
            }
            return 0;
        } else if (i2 != 2) {
            throw new IllegalArgumentException("Unknown digestAlgorithm1: " + i2);
        } else if (i3 != 1) {
            if (i3 == 2) {
                return 0;
            }
            throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i3);
        } else {
            return 1;
        }
    }

    private static int c(int i2, int i3) {
        return b(n(i2), n(i3));
    }

    private static ByteBuffer d(ByteBuffer byteBuffer) throws c {
        a(byteBuffer);
        ByteBuffer u = u(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i2 = 0;
        while (u.hasRemaining()) {
            i2++;
            if (u.remaining() >= 8) {
                long j2 = u.getLong();
                if (j2 >= 4 && j2 <= 2147483647L) {
                    int i3 = (int) j2;
                    int position = u.position() + i3;
                    if (i3 <= u.remaining()) {
                        if (u.getInt() == 1896449818) {
                            return g(u, i3 - 4);
                        }
                        u.position(position);
                    } else {
                        throw new c("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + u.remaining());
                    }
                } else {
                    throw new c("APK Signing Block entry #" + i2 + " size out of range: " + j2);
                }
            } else {
                throw new c("Insufficient data to read size of APK Signing Block entry #" + i2);
            }
        }
        throw new c("No APK Signature Scheme v2 block in APK Signing Block");
    }

    public static h.p.a.a.c<ByteBuffer, Long> e(RandomAccessFile randomAccessFile, long j2) throws IOException, c {
        if (j2 >= 32) {
            ByteBuffer allocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            randomAccessFile.seek(j2 - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) == f17725n && allocate.getLong(16) == f17724m) {
                long j3 = allocate.getLong(0);
                if (j3 < allocate.capacity() || j3 > 2147483639) {
                    throw new c("APK Signing Block size out of range: " + j3);
                }
                int i2 = (int) (8 + j3);
                long j4 = j2 - i2;
                if (j4 >= 0) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j4);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j5 = allocate2.getLong(0);
                    if (j5 == j3) {
                        return h.p.a.a.c.a(allocate2, Long.valueOf(j4));
                    }
                    throw new c("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
                }
                throw new c("APK Signing Block offset out of range: " + j4);
            }
            throw new c("No APK Signing Block before ZIP Central Directory");
        }
        throw new c("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
    }

    private static b f(RandomAccessFile randomAccessFile) throws IOException, c {
        h.p.a.a.c<ByteBuffer, Long> l2 = l(randomAccessFile);
        ByteBuffer b2 = l2.b();
        long longValue = l2.c().longValue();
        if (!h.p.a.a.f.b.i(randomAccessFile, longValue)) {
            long h2 = h(b2, longValue);
            h.p.a.a.c<ByteBuffer, Long> e2 = e(randomAccessFile, h2);
            return new b(d(e2.b()), e2.c().longValue(), h2, longValue, b2);
        }
        throw new c("ZIP64 APK not supported");
    }

    public static ByteBuffer g(ByteBuffer byteBuffer, int i2) throws BufferUnderflowException {
        if (i2 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i3 = i2 + position;
            if (i3 >= position && i3 <= limit) {
                byteBuffer.limit(i3);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i3);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException("size: " + i2);
    }

    public static long h(ByteBuffer byteBuffer, long j2) throws c {
        long g2 = h.p.a.a.f.b.g(byteBuffer);
        if (g2 < j2) {
            if (h.p.a.a.f.b.h(byteBuffer) + g2 == j2) {
                return g2;
            }
            throw new c("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        throw new c("ZIP Central Directory offset out of range: " + g2 + ". ZIP End of Central Directory offset: " + j2);
    }

    private static final long i(long j2) {
        return ((j2 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - 1) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private static String j(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i2);
        }
        return "SHA-256";
    }

    private static int k(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i2);
        }
        return 32;
    }

    public static h.p.a.a.c<ByteBuffer, Long> l(RandomAccessFile randomAccessFile) throws IOException, c {
        h.p.a.a.c<ByteBuffer, Long> c2 = h.p.a.a.f.b.c(randomAccessFile);
        if (c2 != null) {
            return c2;
        }
        throw new c("Not an APK file: ZIP End of Central Directory record not found");
    }

    private static ByteBuffer m(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i2 = byteBuffer.getInt();
            if (i2 >= 0) {
                if (i2 <= byteBuffer.remaining()) {
                    return g(byteBuffer, i2);
                }
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i2 + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    private static int n(int i2) {
        if (i2 != 513) {
            if (i2 != 514) {
                if (i2 != f17721j) {
                    switch (i2) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i2 & (-1)));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String o(int i2) {
        if (i2 == 513 || i2 == 514) {
            return "EC";
        }
        if (i2 != f17721j) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    return "RSA";
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i2 & (-1)));
            }
        }
        return "DSA";
    }

    private static h.p.a.a.c<String, ? extends AlgorithmParameterSpec> p(int i2) {
        if (i2 != 513) {
            if (i2 != 514) {
                if (i2 != f17721j) {
                    switch (i2) {
                        case 257:
                            return h.p.a.a.c.a("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        case 258:
                            return h.p.a.a.c.a("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        case 259:
                            return h.p.a.a.c.a("SHA256withRSA", null);
                        case 260:
                            return h.p.a.a.c.a("SHA512withRSA", null);
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i2 & (-1)));
                    }
                }
                return h.p.a.a.c.a("SHA256withDSA", null);
            }
            return h.p.a.a.c.a("SHA512withECDSA", null);
        }
        return h.p.a.a.c.a("SHA256withECDSA", null);
    }

    public static boolean q(String str) throws IOException {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
        } catch (c unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            f(randomAccessFile);
            randomAccessFile.close();
            return true;
        } catch (c unused2) {
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    private static boolean r(int i2) {
        if (i2 == 513 || i2 == 514 || i2 == f17721j) {
            return true;
        }
        switch (i2) {
            case 257:
            case 258:
            case 259:
            case 260:
                return true;
            default:
                return false;
        }
    }

    private static byte[] s(ByteBuffer byteBuffer) throws IOException {
        int i2 = byteBuffer.getInt();
        if (i2 >= 0) {
            if (i2 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i2];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i2 + ", available: " + byteBuffer.remaining());
        }
        throw new IOException("Negative length");
    }

    private static void t(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 3] = (byte) ((i2 >>> 24) & 255);
    }

    public static ByteBuffer u(ByteBuffer byteBuffer, int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("start: " + i2);
        } else if (i3 >= i2) {
            int capacity = byteBuffer.capacity();
            if (i3 <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i3);
                    byteBuffer.position(i2);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    return slice;
                } finally {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                }
            }
            throw new IllegalArgumentException("end > capacity: " + i3 + " > " + capacity);
        } else {
            throw new IllegalArgumentException("end < start: " + i3 + " < " + i2);
        }
    }
}
