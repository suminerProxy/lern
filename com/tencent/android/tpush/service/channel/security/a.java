package com.tencent.android.tpush.service.channel.security;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f8896a = true;

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.android.tpush.service.channel.security.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class AbstractC0160a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f8897a;
        public int b;
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class b extends AbstractC0160a {
        private static final int[] c = null;

        /* renamed from: d  reason: collision with root package name */
        private static final int[] f8898d = null;

        /* renamed from: e  reason: collision with root package name */
        private int f8899e;

        /* renamed from: f  reason: collision with root package name */
        private int f8900f;

        /* renamed from: g  reason: collision with root package name */
        private final int[] f8901g;

        public b(int i2, byte[] bArr) {
        }

        public boolean a(byte[] bArr, int i2, int i3, boolean z) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class c extends AbstractC0160a {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ boolean f8902g = true;

        /* renamed from: h  reason: collision with root package name */
        private static final byte[] f8903h = null;

        /* renamed from: i  reason: collision with root package name */
        private static final byte[] f8904i = null;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f8905d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f8906e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f8907f;

        /* renamed from: j  reason: collision with root package name */
        private final byte[] f8908j;

        /* renamed from: k  reason: collision with root package name */
        private int f8909k;

        /* renamed from: l  reason: collision with root package name */
        private final byte[] f8910l;

        public c(int i2, byte[] bArr) {
        }

        public boolean a(byte[] bArr, int i2, int i3, boolean z) {
        }
    }

    private a() {
    }

    public static byte[] a(String str, int i2) {
        return a(str.getBytes(), i2);
    }

    public static byte[] b(byte[] bArr, int i2) {
        return b(bArr, 0, bArr.length, i2);
    }

    public static byte[] a(byte[] bArr, int i2) {
        return a(bArr, 0, bArr.length, i2);
    }

    public static byte[] b(byte[] bArr, int i2, int i3, int i4) {
        c cVar = new c(i4, null);
        int i5 = (i3 / 3) * 4;
        if (cVar.f8905d) {
            if (i3 % 3 > 0) {
                i5 += 4;
            }
        } else {
            int i6 = i3 % 3;
            if (i6 == 1) {
                i5 += 2;
            } else if (i6 == 2) {
                i5 += 3;
            }
        }
        if (cVar.f8906e && i3 > 0) {
            i5 += (((i3 - 1) / 57) + 1) * (cVar.f8907f ? 2 : 1);
        }
        cVar.f8897a = new byte[i5];
        cVar.a(bArr, i2, i3, true);
        if (f8896a || cVar.b == i5) {
            return cVar.f8897a;
        }
        throw new AssertionError();
    }

    public static byte[] a(byte[] bArr, int i2, int i3, int i4) {
        b bVar = new b(i4, new byte[(i3 * 3) / 4]);
        if (bVar.a(bArr, i2, i3, true)) {
            int i5 = bVar.b;
            byte[] bArr2 = bVar.f8897a;
            if (i5 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
