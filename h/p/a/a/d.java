package h.p.a.a;

import h.p.a.a.f.a;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* compiled from: V1SchemeUtil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class d {

    /* compiled from: V1SchemeUtil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a extends Exception {
        public static final long serialVersionUID = -3387516993124229949L;

        public a() {
        }

        public a(String str) {
        }
    }

    public static boolean a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = randomAccessFile.length();
            byte[] bArr = b.f17712d;
            byte[] bArr2 = new byte[bArr.length];
            randomAccessFile.seek(length - bArr.length);
            randomAccessFile.readFully(bArr2);
            boolean e2 = e(bArr2);
            randomAccessFile.close();
            return e2;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        r1 = r0.getJarEntry(r3.getName());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.io.File r6) {
        /*
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.io.IOException -> L36
            r0.<init>(r6)     // Catch: java.io.IOException -> L36
            java.lang.String r6 = "META-INF/MANIFEST.MF"
            java.util.jar.JarEntry r6 = r0.getJarEntry(r6)     // Catch: java.io.IOException -> L36
            r1 = 0
            java.util.Enumeration r2 = r0.entries()     // Catch: java.io.IOException -> L36
        L10:
            boolean r3 = r2.hasMoreElements()     // Catch: java.io.IOException -> L36
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.nextElement()     // Catch: java.io.IOException -> L36
            java.util.jar.JarEntry r3 = (java.util.jar.JarEntry) r3     // Catch: java.io.IOException -> L36
            java.lang.String r4 = r3.getName()     // Catch: java.io.IOException -> L36
            java.lang.String r5 = "META-INF/\\w+\\.SF"
            boolean r4 = r4.matches(r5)     // Catch: java.io.IOException -> L36
            if (r4 == 0) goto L10
            java.lang.String r1 = r3.getName()     // Catch: java.io.IOException -> L36
            java.util.jar.JarEntry r1 = r0.getJarEntry(r1)     // Catch: java.io.IOException -> L36
        L30:
            if (r6 == 0) goto L3a
            if (r1 == 0) goto L3a
            r6 = 1
            return r6
        L36:
            r6 = move-exception
            r6.printStackTrace()
        L3a:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h.p.a.a.d.b(java.io.File):boolean");
    }

    public static void c(File file, File file2) throws IOException {
        FileChannel fileChannel;
        FileChannel channel;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel fileChannel2 = null;
        try {
            channel = new FileInputStream(file).getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = new FileOutputStream(file2).getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            if (channel != null) {
                channel.close();
            }
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }

    public static c<ByteBuffer, Long> d(File file) throws IOException, a.c {
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
                if (!h.p.a.a.f.b.i(randomAccessFile, l2.c().longValue())) {
                    randomAccessFile.close();
                    return l2;
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

    private static boolean e(byte[] bArr) {
        if (bArr.length != b.f17712d.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = b.f17712d;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static String f(File file) throws Exception {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (Throwable th) {
            th = th;
        }
        try {
            long length = randomAccessFile.length();
            byte[] bArr = b.f17712d;
            byte[] bArr2 = new byte[bArr.length];
            long length2 = length - bArr.length;
            randomAccessFile.seek(length2);
            randomAccessFile.readFully(bArr2);
            if (e(bArr2)) {
                long j2 = length2 - 2;
                randomAccessFile.seek(j2);
                int g2 = g(randomAccessFile);
                if (g2 > 0) {
                    randomAccessFile.seek(j2 - g2);
                    byte[] bArr3 = new byte[g2];
                    randomAccessFile.readFully(bArr3);
                    String str = new String(bArr3, "UTF-8");
                    randomAccessFile.close();
                    return str;
                }
                throw new Exception("zip channel info not found");
            }
            throw new Exception("zip v1 magic not found");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    private static short g(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }

    public static void h(File file) throws Exception {
        RandomAccessFile randomAccessFile;
        if (file != null && file.exists() && file.isFile()) {
            RandomAccessFile randomAccessFile2 = null;
            c<ByteBuffer, Long> d2 = d(file);
            if (d2.b().remaining() == 22) {
                PrintStream printStream = System.out;
                printStream.println("file : " + file.getName() + " , has no comment");
                return;
            }
            PrintStream printStream2 = System.out;
            printStream2.println("file : " + file.getName() + " , has comment");
            int e2 = h.p.a.a.f.b.e(d2.b(), 20);
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Throwable th) {
                th = th;
            }
            try {
                randomAccessFile.seek((d2.c().longValue() + 22) - 2);
                j(0, randomAccessFile);
                randomAccessFile.setLength(file.length() - e2);
                PrintStream printStream3 = System.out;
                printStream3.println("file : " + file.getName() + " , remove comment success");
                randomAccessFile.close();
                return;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
                throw th;
            }
        }
        throw new Exception("param error , file : " + file);
    }

    public static void i(File file, String str) throws Exception {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        if (file != null && file.exists() && file.isFile() && str != null && !str.isEmpty()) {
            RandomAccessFile randomAccessFile3 = null;
            byte[] bytes = str.getBytes("UTF-8");
            c<ByteBuffer, Long> d2 = d(file);
            if (d2.b().remaining() == 22) {
                PrintStream printStream = System.out;
                printStream.println("file : " + file.getAbsolutePath() + " , has no comment");
                try {
                    randomAccessFile2 = new RandomAccessFile(file, "rw");
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    randomAccessFile2.seek(file.length() - 2);
                    byte[] bArr = b.f17712d;
                    j(bytes.length + 2 + bArr.length, randomAccessFile2);
                    randomAccessFile2.write(bytes);
                    j(bytes.length, randomAccessFile2);
                    randomAccessFile2.write(bArr);
                    randomAccessFile2.close();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile3 = randomAccessFile2;
                    if (randomAccessFile3 != null) {
                        randomAccessFile3.close();
                    }
                    throw th;
                }
            }
            PrintStream printStream2 = System.out;
            printStream2.println("file : " + file.getAbsolutePath() + " , has comment");
            if (a(file)) {
                try {
                    String f2 = f(file);
                    if (f2 != null) {
                        file.delete();
                        throw new a("file : " + file.getAbsolutePath() + " has a channel : " + f2 + ", only ignore");
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            int e3 = h.p.a.a.f.b.e(d2.b(), 20);
            byte[] bArr2 = b.f17712d;
            int length = bytes.length + e3 + 2 + bArr2.length;
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                randomAccessFile.seek((d2.c().longValue() + 22) - 2);
                j(length, randomAccessFile);
                randomAccessFile.seek(d2.c().longValue() + 22 + e3);
                randomAccessFile.write(bytes);
                j(bytes.length, randomAccessFile);
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                return;
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile3 = randomAccessFile;
                if (randomAccessFile3 != null) {
                    randomAccessFile3.close();
                }
                throw th;
            }
        }
        throw new Exception("param error , file : " + file + " , channel : " + str);
    }

    private static void j(int i2, DataOutput dataOutput) throws IOException {
        ByteBuffer order = ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) i2);
        dataOutput.write(order.array());
    }
}
