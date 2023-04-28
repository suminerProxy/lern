package h.p.a.a;

import h.p.a.a.f.a;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: V2SchemeUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class e {
    public static boolean a(File file) {
        try {
            return e(g(file)).containsKey(Integer.valueOf((int) h.p.a.a.f.a.f17727p));
        } catch (a.c unused) {
            PrintStream printStream = System.out;
            printStream.println("APK : " + file.getAbsolutePath() + " not have apk signature block");
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static c<ByteBuffer, Long> b(RandomAccessFile randomAccessFile, long j2, int i2) throws IOException {
        return c.a(h(randomAccessFile, j2, i2), Long.valueOf(j2));
    }

    public static c<ByteBuffer, Long> c(RandomAccessFile randomAccessFile, int i2) throws IOException {
        return c.a(h(randomAccessFile, 0L, i2), 0L);
    }

    public static ByteBuffer d(Map<Integer, ByteBuffer> map) {
        Iterator<Map.Entry<Integer, ByteBuffer>> it;
        if (map != null && !map.isEmpty()) {
            long j2 = 24;
            while (map.entrySet().iterator().hasNext()) {
                j2 += it.next().getValue().remaining() + 12;
            }
            boolean containsKey = map.containsKey(Integer.valueOf((int) h.p.a.a.f.a.q));
            System.out.println("generateApkSigningBlock , needPadding = " + containsKey);
            if (containsKey) {
                j2 -= map.get(Integer.valueOf((int) h.p.a.a.f.a.q)).remaining() + 12;
                map.remove(Integer.valueOf((int) h.p.a.a.f.a.q));
                int i2 = (int) ((j2 + 8) % 4096);
                if (i2 != 0) {
                    int i3 = 4096 - i2;
                    if (i3 < 12) {
                        i3 += 4096;
                    }
                    j2 += i3;
                    int i4 = (i3 - 8) - 4;
                    map.put(Integer.valueOf((int) h.p.a.a.f.a.q), ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN));
                    System.out.println("generateApkSigningBlock , final length = " + j2 + " padding = " + i3 + " bufferSize = " + i4);
                }
            }
            ByteBuffer allocate = ByteBuffer.allocate((int) (8 + j2));
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putLong(j2);
            for (Map.Entry<Integer, ByteBuffer> entry : map.entrySet()) {
                ByteBuffer value = entry.getValue();
                allocate.putLong(value.remaining() + 4);
                allocate.putInt(entry.getKey().intValue());
                allocate.put(value.array(), value.arrayOffset() + value.position(), value.remaining());
            }
            allocate.putLong(j2);
            allocate.putLong(h.p.a.a.f.a.f17725n);
            allocate.putLong(h.p.a.a.f.a.f17724m);
            if (allocate.remaining() <= 0) {
                allocate.flip();
                return allocate;
            }
            throw new RuntimeException("generateNewApkV2SchemeBlock error");
        }
        throw new RuntimeException("getNewApkV2SchemeBlock , id value pair is empty");
    }

    public static Map<Integer, ByteBuffer> e(ByteBuffer byteBuffer) throws a.c {
        h.p.a.a.f.a.a(byteBuffer);
        ByteBuffer u = h.p.a.a.f.a.u(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        while (u.hasRemaining()) {
            i2++;
            if (u.remaining() >= 8) {
                long j2 = u.getLong();
                if (j2 >= 4 && j2 <= 2147483647L) {
                    int i3 = (int) j2;
                    int position = u.position() + i3;
                    if (i3 <= u.remaining()) {
                        int i4 = u.getInt();
                        linkedHashMap.put(Integer.valueOf(i4), h.p.a.a.f.a.g(u, i3 - 4));
                        if (i4 == 1896449818) {
                            System.out.println("find V2 signature block Id : 1896449818");
                        }
                        u.position(position);
                    } else {
                        throw new a.c("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + u.remaining());
                    }
                } else {
                    throw new a.c("APK Signing Block entry #" + i2 + " size out of range: " + j2);
                }
            } else {
                throw new a.c("Insufficient data to read size of APK Signing Block entry #" + i2);
            }
        }
        if (linkedHashMap.isEmpty()) {
            throw new a.c("not have Id-Value Pair in APK Signing Block entry #" + i2);
        }
        return linkedHashMap;
    }

    public static a f(File file, boolean z) throws IOException, a.c {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (Throwable th) {
            th = th;
        }
        try {
            c<ByteBuffer, Long> l2 = h.p.a.a.f.a.l(randomAccessFile);
            ByteBuffer b = l2.b();
            long longValue = l2.c().longValue();
            if (!h.p.a.a.f.b.i(randomAccessFile, longValue)) {
                long h2 = h.p.a.a.f.a.h(b, longValue);
                c<ByteBuffer, Long> e2 = h.p.a.a.f.a.e(randomAccessFile, h2);
                c<ByteBuffer, Long> b2 = b(randomAccessFile, h2, (int) (longValue - h2));
                a aVar = new a();
                aVar.f17707a = z;
                aVar.b = file.length();
                if (!z) {
                    aVar.c = c(randomAccessFile, (int) e2.c().longValue());
                }
                aVar.f17708d = e2;
                aVar.f17709e = b2;
                aVar.f17710f = l2;
                aVar.b();
                PrintStream printStream = System.out;
                printStream.println("baseApk : " + file.getAbsolutePath() + "\nApkSectionInfo = " + aVar);
                randomAccessFile.close();
                return aVar;
            }
            throw new a.c("ZIP64 APK not supported");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    public static ByteBuffer g(File file) throws a.c, IOException {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        if (file != null && file.exists() && file.isFile()) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (Throwable th) {
                th = th;
            }
            try {
                c<ByteBuffer, Long> l2 = h.p.a.a.f.a.l(randomAccessFile);
                ByteBuffer b = l2.b();
                long longValue = l2.c().longValue();
                if (!h.p.a.a.f.b.i(randomAccessFile, longValue)) {
                    ByteBuffer b2 = h.p.a.a.f.a.e(randomAccessFile, h.p.a.a.f.a.h(b, longValue)).b();
                    randomAccessFile.close();
                    return b2;
                }
                throw new a.c("ZIP64 APK not supported");
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
                throw th;
            }
        }
        return null;
    }

    private static ByteBuffer h(RandomAccessFile randomAccessFile, long j2, int i2) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j2);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        return allocate;
    }

    public static boolean i(String str) throws Exception {
        return h.p.a.a.f.a.q(str);
    }
}
