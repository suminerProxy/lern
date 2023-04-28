package com.mob.tools.utils;

import com.mob.commons.s;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MobRSA implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private int f4512a;

    public MobRSA(int i2) {
        this.f4512a = i2;
    }

    private byte[] a(byte[] bArr, int i2, int i3, BigInteger bigInteger, BigInteger bigInteger2, int i4) throws Throwable {
        if (bArr.length != i3 || i2 != 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            bArr = bArr2;
        }
        BigInteger bigInteger3 = new BigInteger(a(bArr, i4));
        if (bigInteger3.compareTo(bigInteger2) <= 0) {
            return bigInteger3.modPow(bigInteger, bigInteger2).toByteArray();
        }
        throw new Throwable("the message must be smaller than the modulue");
    }

    public byte[] encode(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        int i2 = this.f4512a / 8;
        int i3 = i2 - 11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            int i4 = 0;
            while (bArr.length > i4) {
                try {
                    int min = Math.min(bArr.length - i4, i3);
                    byte[] a2 = a(bArr, i4, min, bigInteger, bigInteger2, i2);
                    dataOutputStream2.writeInt(a2.length);
                    dataOutputStream2.write(a2);
                    i4 += min;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    s.a(dataOutputStream);
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            s.a(dataOutputStream2);
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private byte[] a(byte[] bArr, int i2) throws Throwable {
        if (bArr.length <= i2 - 1) {
            byte[] bArr2 = new byte[i2];
            bArr2[0] = 1;
            int length = bArr.length;
            bArr2[1] = (byte) (length >> 24);
            bArr2[2] = (byte) (length >> 16);
            bArr2[3] = (byte) (length >> 8);
            bArr2[4] = (byte) length;
            System.arraycopy(bArr, 0, bArr2, i2 - length, length);
            return bArr2;
        }
        throw new Throwable("Message too large");
    }
}
