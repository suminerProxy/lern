package h.u.a.f.b;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: ImageHeaderParser.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class d {
    private static final String b = "ImageHeaderParser";
    public static final int c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static final int f20401d = 65496;

    /* renamed from: e  reason: collision with root package name */
    private static final int f20402e = 19789;

    /* renamed from: f  reason: collision with root package name */
    private static final int f20403f = 18761;

    /* renamed from: g  reason: collision with root package name */
    private static final String f20404g = "Exif\u0000\u0000";

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f20405h = null;

    /* renamed from: i  reason: collision with root package name */
    private static final int f20406i = 218;

    /* renamed from: j  reason: collision with root package name */
    private static final int f20407j = 217;

    /* renamed from: k  reason: collision with root package name */
    private static final int f20408k = 255;

    /* renamed from: l  reason: collision with root package name */
    private static final int f20409l = 225;

    /* renamed from: m  reason: collision with root package name */
    private static final int f20410m = 274;

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f20411n = null;

    /* renamed from: a  reason: collision with root package name */
    private final b f20412a;

    /* compiled from: ImageHeaderParser.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f20413a;

        public a(byte[] bArr, int i2) {
        }

        public short a(int i2) {
        }

        public int b(int i2) {
        }

        public int c() {
        }

        public void d(ByteOrder byteOrder) {
        }
    }

    /* compiled from: ImageHeaderParser.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface b {
        int a() throws IOException;

        int b(byte[] bArr, int i2) throws IOException;

        short c() throws IOException;

        long skip(long j2) throws IOException;
    }

    /* compiled from: ImageHeaderParser.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f20414a;

        public c(InputStream inputStream) {
        }

        @Override // h.u.a.f.b.d.b
        public int a() throws IOException {
        }

        @Override // h.u.a.f.b.d.b
        public int b(byte[] bArr, int i2) throws IOException {
        }

        @Override // h.u.a.f.b.d.b
        public short c() throws IOException {
        }

        @Override // h.u.a.f.b.d.b
        public long skip(long j2) throws IOException {
        }
    }

    public d(InputStream inputStream) {
    }

    private static int a(int i2, int i3) {
    }

    private static boolean c(int i2) {
    }

    private boolean d(byte[] bArr, int i2) {
    }

    private int e() throws IOException {
    }

    private static int f(a aVar) {
    }

    private int g(byte[] bArr, int i2) throws IOException {
    }

    public int b() throws IOException {
    }
}
