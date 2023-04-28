package h.g.a.p.r.h;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.ImageHeaderParser;
import h.g.a.o.a;
import h.g.a.p.l;
import h.g.a.p.p.v;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a implements l<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f17082f = "BufferGifDecoder";

    /* renamed from: g  reason: collision with root package name */
    private static final C0326a f17083g = null;

    /* renamed from: h  reason: collision with root package name */
    private static final b f17084h = null;

    /* renamed from: a  reason: collision with root package name */
    private final Context f17085a;
    private final List<ImageHeaderParser> b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final C0326a f17086d;

    /* renamed from: e  reason: collision with root package name */
    private final h.g.a.p.r.h.b f17087e;

    /* compiled from: ByteBufferGifDecoder.java */
    @VisibleForTesting
    /* renamed from: h.g.a.p.r.h.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class C0326a {
        public h.g.a.o.a a(a.InterfaceC0307a interfaceC0307a, h.g.a.o.c cVar, ByteBuffer byteBuffer, int i2) {
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<h.g.a.o.d> f17088a;

        public synchronized h.g.a.o.d a(ByteBuffer byteBuffer) {
        }

        public synchronized void b(h.g.a.o.d dVar) {
        }
    }

    public a(Context context) {
    }

    @Nullable
    private e c(ByteBuffer byteBuffer, int i2, int i3, h.g.a.o.d dVar, h.g.a.p.j jVar) {
    }

    private static int e(h.g.a.o.c cVar, int i2, int i3) {
    }

    @Override // h.g.a.p.l
    public /* bridge */ /* synthetic */ boolean a(@NonNull ByteBuffer byteBuffer, @NonNull h.g.a.p.j jVar) throws IOException {
    }

    @Override // h.g.a.p.l
    public /* bridge */ /* synthetic */ v<c> b(@NonNull ByteBuffer byteBuffer, int i2, int i3, @NonNull h.g.a.p.j jVar) throws IOException {
    }

    public e d(@NonNull ByteBuffer byteBuffer, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }

    public boolean f(@NonNull ByteBuffer byteBuffer, @NonNull h.g.a.p.j jVar) throws IOException {
    }

    public a(Context context, List<ImageHeaderParser> list, h.g.a.p.p.a0.e eVar, h.g.a.p.p.a0.b bVar) {
    }

    @VisibleForTesting
    public a(Context context, List<ImageHeaderParser> list, h.g.a.p.p.a0.e eVar, h.g.a.p.p.a0.b bVar, b bVar2, C0326a c0326a) {
    }
}
