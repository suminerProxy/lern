package h.p.a.a.f;

import com.google.common.primitives.UnsignedInts;
import h.p.a.a.c;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: ZipUtils.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f17731a = 22;
    private static final int b = 101010256;
    private static final int c = 12;

    /* renamed from: d  reason: collision with root package name */
    private static final int f17732d = 16;

    /* renamed from: e  reason: collision with root package name */
    private static final int f17733e = 20;

    /* renamed from: f  reason: collision with root package name */
    private static final int f17734f = 20;

    /* renamed from: g  reason: collision with root package name */
    private static final int f17735g = 1347094023;

    /* renamed from: h  reason: collision with root package name */
    private static final int f17736h = 65535;

    private b() {
    }

    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            return -1;
        }
        int i2 = capacity - 22;
        int min = Math.min(i2, 65535);
        for (int i3 = 0; i3 < min; i3++) {
            int i4 = i2 - i3;
            if (byteBuffer.getInt(i4) == b && e(byteBuffer, i4 + 20) == i3) {
                return i4;
            }
        }
        return -1;
    }

    public static c<ByteBuffer, Long> c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        c<ByteBuffer, Long> d2 = d(randomAccessFile, 0);
        return d2 != null ? d2 : d(randomAccessFile, 65535);
    }

    private static c<ByteBuffer, Long> d(RandomAccessFile randomAccessFile, int i2) throws IOException {
        if (i2 >= 0 && i2 <= 65535) {
            long length = randomAccessFile.length();
            if (length < 22) {
                return null;
            }
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i2, length - 22)) + 22);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            int b2 = b(allocate);
            if (b2 == -1) {
                return null;
            }
            allocate.position(b2);
            ByteBuffer slice = allocate.slice();
            slice.order(byteOrder);
            return c.a(slice, Long.valueOf(capacity + b2));
        }
        throw new IllegalArgumentException("maxCommentSize: " + i2);
    }

    public static int e(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getShort(i2) & 65535;
    }

    public static long f(ByteBuffer byteBuffer, int i2) {
        return byteBuffer.getInt(i2) & UnsignedInts.INT_MASK;
    }

    public static long g(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return f(byteBuffer, byteBuffer.position() + 16);
    }

    public static long h(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return f(byteBuffer, byteBuffer.position() + 12);
    }

    public static final boolean i(RandomAccessFile randomAccessFile, long j2) throws IOException {
        long j3 = j2 - 20;
        if (j3 < 0) {
            return false;
        }
        randomAccessFile.seek(j3);
        return randomAccessFile.readInt() == f17735g;
    }

    private static void j(ByteBuffer byteBuffer, int i2, long j2) {
        if (j2 >= 0 && j2 <= UnsignedInts.INT_MASK) {
            byteBuffer.putInt(byteBuffer.position() + i2, (int) j2);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j2);
    }

    public static void k(ByteBuffer byteBuffer, long j2) {
        a(byteBuffer);
        j(byteBuffer, byteBuffer.position() + 16, j2);
    }
}
