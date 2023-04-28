package h.y.a.m.r.e;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.Cookie;

/* compiled from: SerializableCookie.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class b implements Serializable {
    private static final String TAG = b.class.getSimpleName();
    private static final long serialVersionUID = -8594045714036645534L;
    private transient Cookie cookie;

    private static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i2 = b & 255;
            if (i2 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i2));
        }
        return sb.toString();
    }

    private static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okhttp3.Cookie decode(java.lang.String r3) {
        /*
            r2 = this;
            byte[] r3 = hexStringToByteArray(r3)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            r3 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L1d java.lang.ClassNotFoundException -> L26 java.io.IOException -> L2a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d java.lang.ClassNotFoundException -> L26 java.io.IOException -> L2a
            java.lang.Object r0 = r1.readObject()     // Catch: java.lang.Throwable -> L1b java.lang.ClassNotFoundException -> L27 java.io.IOException -> L2b
            h.y.a.m.r.e.b r0 = (h.y.a.m.r.e.b) r0     // Catch: java.lang.Throwable -> L1b java.lang.ClassNotFoundException -> L27 java.io.IOException -> L2b
            okhttp3.Cookie r3 = r0.cookie     // Catch: java.lang.Throwable -> L1b java.lang.ClassNotFoundException -> L27 java.io.IOException -> L2b
        L17:
            r1.close()     // Catch: java.io.IOException -> L2e
            goto L2e
        L1b:
            r3 = move-exception
            goto L20
        L1d:
            r0 = move-exception
            r1 = r3
            r3 = r0
        L20:
            if (r1 == 0) goto L25
            r1.close()     // Catch: java.io.IOException -> L25
        L25:
            throw r3
        L26:
            r1 = r3
        L27:
            if (r1 == 0) goto L2e
            goto L17
        L2a:
            r1 = r3
        L2b:
            if (r1 == 0) goto L2e
            goto L17
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.a.m.r.e.b.decode(java.lang.String):okhttp3.Cookie");
    }

    public String encode(Cookie cookie) {
        ObjectOutputStream objectOutputStream;
        this.cookie = cookie;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (IOException unused) {
            objectOutputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(this);
            try {
                objectOutputStream.close();
            } catch (IOException unused2) {
            }
            return byteArrayToHexString(byteArrayOutputStream.toByteArray());
        } catch (IOException unused3) {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }
}
