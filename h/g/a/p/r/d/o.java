package h.g.a.p.r.d;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: DefaultImageHeaderParser.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class o implements ImageHeaderParser {
    private static final String b = "DfltImageHeaderParser";
    private static final int c = 4671814;

    /* renamed from: d  reason: collision with root package name */
    private static final int f17012d = -1991225785;

    /* renamed from: e  reason: collision with root package name */
    public static final int f17013e = 65496;

    /* renamed from: f  reason: collision with root package name */
    private static final int f17014f = 19789;

    /* renamed from: g  reason: collision with root package name */
    private static final int f17015g = 18761;

    /* renamed from: h  reason: collision with root package name */
    private static final String f17016h = "Exif\u0000\u0000";

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f17017i = null;

    /* renamed from: j  reason: collision with root package name */
    private static final int f17018j = 218;

    /* renamed from: k  reason: collision with root package name */
    private static final int f17019k = 217;

    /* renamed from: l  reason: collision with root package name */
    public static final int f17020l = 255;

    /* renamed from: m  reason: collision with root package name */
    public static final int f17021m = 225;

    /* renamed from: n  reason: collision with root package name */
    private static final int f17022n = 274;

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f17023o = null;

    /* renamed from: p  reason: collision with root package name */
    private static final int f17024p = 1380533830;
    private static final int q = 1464156752;
    private static final int r = 1448097792;
    private static final int s = -256;
    private static final int t = 255;
    private static final int u = 88;
    private static final int v = 76;
    private static final int w = 16;
    private static final int x = 8;

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f17025a;

        public a(ByteBuffer byteBuffer) {
        }

        @Override // h.g.a.p.r.d.o.c
        public int a() throws c.a {
        }

        @Override // h.g.a.p.r.d.o.c
        public int b(byte[] bArr, int i2) {
        }

        @Override // h.g.a.p.r.d.o.c
        public short c() throws c.a {
        }

        @Override // h.g.a.p.r.d.o.c
        public long skip(long j2) {
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f17026a;

        public b(byte[] bArr, int i2) {
        }

        private boolean c(int i2, int i3) {
        }

        public short a(int i2) {
        }

        public int b(int i2) {
        }

        public int d() {
        }

        public void e(ByteOrder byteOrder) {
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c {

        /* compiled from: DefaultImageHeaderParser.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class a extends IOException {
            private static final long serialVersionUID = 1;
        }

        int a() throws IOException;

        int b(byte[] bArr, int i2) throws IOException;

        short c() throws IOException;

        long skip(long j2) throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f17027a;

        public d(InputStream inputStream) {
        }

        @Override // h.g.a.p.r.d.o.c
        public int a() throws IOException {
        }

        @Override // h.g.a.p.r.d.o.c
        public int b(byte[] bArr, int i2) throws IOException {
        }

        @Override // h.g.a.p.r.d.o.c
        public short c() throws IOException {
        }

        @Override // h.g.a.p.r.d.o.c
        public long skip(long j2) throws IOException {
        }
    }

    private static int e(int i2, int i3) {
    }

    private int f(c cVar, h.g.a.p.p.a0.b bVar) throws IOException {
    }

    @NonNull
    private ImageHeaderParser.ImageType g(c cVar) throws IOException {
    }

    private static boolean h(int i2) {
    }

    private boolean i(byte[] bArr, int i2) {
    }

    private int j(c cVar) throws IOException {
    }

    private static int k(b bVar) {
    }

    private int l(c cVar, byte[] bArr, int i2) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType a(@NonNull ByteBuffer byteBuffer) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@NonNull ByteBuffer byteBuffer, @NonNull h.g.a.p.p.a0.b bVar) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) throws IOException {
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@NonNull InputStream inputStream, @NonNull h.g.a.p.p.a0.b bVar) throws IOException {
    }
}
