package com.facebook.soloader;

import com.google.common.primitives.UnsignedInts;
import h.w.a.e.c.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MinElf {
    public static final int DT_NEEDED = 1;
    public static final int DT_NULL = 0;
    public static final int DT_STRTAB = 5;
    public static final int ELF_MAGIC = 1179403647;
    public static final int PN_XNUM = 65535;
    public static final int PT_DYNAMIC = 2;
    public static final int PT_LOAD = 1;
    private static final String TAG = "MinElf";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ElfError extends RuntimeException {
        public ElfError(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public enum ISA {
        NOT_SO("not_so"),
        X86(a.f25806a),
        ARM("armeabi-v7a"),
        X86_64("x86_64"),
        AARCH64("arm64-v8a"),
        OTHERS("others");
        
        private final String value;

        ISA(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r0 <= 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        r2 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] extract_DT_NEEDED(java.io.File r4) throws java.io.IOException {
        /*
            r0 = 0
        L1:
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> L12 java.nio.channels.ClosedByInterruptException -> L14
            java.lang.String[] r4 = extract_DT_NEEDED(r2)     // Catch: java.lang.Throwable -> L12 java.nio.channels.ClosedByInterruptException -> L14
            r1.close()
            return r4
        L12:
            r4 = move-exception
            goto L22
        L14:
            r2 = move-exception
            int r0 = r0 + 1
            r3 = 3
            if (r0 > r3) goto L21
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L12
            r1.close()
            goto L1
        L21:
            throw r2     // Catch: java.lang.Throwable -> L12
        L22:
            r1.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.MinElf.extract_DT_NEEDED(java.io.File):java.lang.String[]");
    }

    private static long get64(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        read(fileChannel, byteBuffer, 8, j2);
        return byteBuffer.getLong();
    }

    private static String getSz(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j3 = 1 + j2;
            short u8Var = getu8(fileChannel, byteBuffer, j2);
            if (u8Var != 0) {
                sb.append((char) u8Var);
                j2 = j3;
            } else {
                return sb.toString();
            }
        }
    }

    private static int getu16(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        read(fileChannel, byteBuffer, 2, j2);
        return byteBuffer.getShort() & 65535;
    }

    private static long getu32(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        read(fileChannel, byteBuffer, 4, j2);
        return byteBuffer.getInt() & UnsignedInts.INT_MASK;
    }

    private static short getu8(FileChannel fileChannel, ByteBuffer byteBuffer, long j2) throws IOException {
        read(fileChannel, byteBuffer, 1, j2);
        return (short) (byteBuffer.get() & 255);
    }

    private static void read(FileChannel fileChannel, ByteBuffer byteBuffer, int i2, long j2) throws IOException {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i2);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j2)) != -1) {
            j2 += read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new ElfError("ELF file truncated");
    }

    public static String[] extract_DT_NEEDED(FileChannel fileChannel) throws IOException {
        long j2;
        long j3;
        long j4;
        long j5;
        String str;
        long j6;
        String str2;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (getu32(fileChannel, allocate, 0L) == 1179403647) {
            boolean z = getu8(fileChannel, allocate, 4L) == 1;
            if (getu8(fileChannel, allocate, 5L) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            long j13 = z ? getu32(fileChannel, allocate, 28L) : get64(fileChannel, allocate, 32L);
            long j14 = z ? getu16(fileChannel, allocate, 44L) : getu16(fileChannel, allocate, 56L);
            int i2 = getu16(fileChannel, allocate, z ? 42L : 54L);
            if (j14 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                long j15 = z ? getu32(fileChannel, allocate, 32L) : get64(fileChannel, allocate, 40L);
                if (z) {
                    j12 = getu32(fileChannel, allocate, j15 + 28);
                } else {
                    j12 = getu32(fileChannel, allocate, j15 + 44);
                }
                j14 = j12;
            }
            long j16 = j13;
            long j17 = 0;
            while (true) {
                if (j17 >= j14) {
                    j3 = 0;
                    break;
                }
                if (z) {
                    j11 = getu32(fileChannel, allocate, j16 + 0);
                } else {
                    j11 = getu32(fileChannel, allocate, j16 + 0);
                }
                if (j11 != 2) {
                    j16 += i2;
                    j17++;
                } else if (z) {
                    j3 = getu32(fileChannel, allocate, j16 + 4);
                } else {
                    j3 = get64(fileChannel, allocate, j16 + 8);
                }
            }
            long j18 = 0;
            if (j3 == 0) {
                throw new ElfError("ELF file does not contain dynamic linking information");
            }
            long j19 = j3;
            long j20 = 0;
            int i3 = 0;
            while (true) {
                boolean z2 = z;
                long j21 = z ? getu32(fileChannel, allocate, j19 + j18) : get64(fileChannel, allocate, j19 + j18);
                long j22 = j3;
                String str3 = "malformed DT_NEEDED section";
                if (j21 == 1) {
                    if (i3 == Integer.MAX_VALUE) {
                        throw new ElfError("malformed DT_NEEDED section");
                    }
                    i3++;
                    j4 = j21;
                } else if (j21 == 5) {
                    if (z2) {
                        j4 = j21;
                        j5 = getu32(fileChannel, allocate, j19 + 4);
                    } else {
                        j4 = j21;
                        j5 = get64(fileChannel, allocate, j19 + 8);
                    }
                    j20 = j5;
                } else {
                    j4 = j21;
                }
                long j23 = 16;
                j19 += z2 ? 8L : 16L;
                j18 = 0;
                if (j4 != 0) {
                    z = z2;
                    j3 = j22;
                } else if (j20 == 0) {
                    throw new ElfError("Dynamic section string-table not found");
                } else {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= j14) {
                            str = str3;
                            j6 = 0;
                            break;
                        }
                        if (z2) {
                            j7 = getu32(fileChannel, allocate, j13 + j18);
                        } else {
                            j7 = getu32(fileChannel, allocate, j13 + j18);
                        }
                        if (j7 == 1) {
                            if (z2) {
                                j8 = getu32(fileChannel, allocate, j13 + 8);
                            } else {
                                j8 = get64(fileChannel, allocate, j13 + j23);
                            }
                            if (z2) {
                                str = str3;
                                j9 = getu32(fileChannel, allocate, j13 + 20);
                            } else {
                                str = str3;
                                j9 = get64(fileChannel, allocate, j13 + 40);
                            }
                            if (j8 <= j20 && j20 < j9 + j8) {
                                if (z2) {
                                    j10 = getu32(fileChannel, allocate, j13 + 4);
                                } else {
                                    j10 = get64(fileChannel, allocate, j13 + 8);
                                }
                                j6 = j10 + (j20 - j8);
                            }
                        } else {
                            str = str3;
                        }
                        j13 += i2;
                        i4++;
                        str3 = str;
                        j23 = 16;
                        j18 = 0;
                    }
                    long j24 = 0;
                    if (j6 != 0) {
                        String[] strArr = new String[i3];
                        long j25 = j22;
                        int i5 = 0;
                        while (true) {
                            long j26 = j25 + j24;
                            long j27 = z2 ? getu32(fileChannel, allocate, j26) : get64(fileChannel, allocate, j26);
                            if (j27 == 1) {
                                strArr[i5] = getSz(fileChannel, allocate, (z2 ? getu32(fileChannel, allocate, j25 + 4) : get64(fileChannel, allocate, j25 + 8)) + j6);
                                if (i5 == Integer.MAX_VALUE) {
                                    throw new ElfError(str);
                                }
                                i5++;
                                str2 = str;
                            } else {
                                str2 = str;
                            }
                            j25 += z2 ? 8L : 16L;
                            if (j27 == 0) {
                                if (i5 == i3) {
                                    return strArr;
                                }
                                throw new ElfError(str2);
                            }
                            str = str2;
                            j24 = 0;
                        }
                    } else {
                        throw new ElfError("did not find file offset of DT_STRTAB table");
                    }
                }
            }
        } else {
            throw new ElfError("file is not ELF: 0x" + Long.toHexString(j2));
        }
    }
}
