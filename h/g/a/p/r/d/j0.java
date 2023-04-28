package h.g.a.p.r.d;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import h.g.a.p.i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: VideoDecoder.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class j0<T> implements h.g.a.p.l<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    private static final String f16998d = "VideoDecoder";

    /* renamed from: e  reason: collision with root package name */
    public static final long f16999e = -1;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    public static final int f17000f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final h.g.a.p.i<Long> f17001g = null;

    /* renamed from: h  reason: collision with root package name */
    public static final h.g.a.p.i<Integer> f17002h = null;

    /* renamed from: i  reason: collision with root package name */
    private static final e f17003i = null;

    /* renamed from: a  reason: collision with root package name */
    private final f<T> f17004a;
    private final h.g.a.p.p.a0.e b;
    private final e c;

    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements i.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f17005a;

        @Override // h.g.a.p.i.b
        public /* bridge */ /* synthetic */ void a(@NonNull byte[] bArr, @NonNull Long l2, @NonNull MessageDigest messageDigest) {
        }

        public void b(@NonNull byte[] bArr, @NonNull Long l2, @NonNull MessageDigest messageDigest) {
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements i.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f17006a;

        @Override // h.g.a.p.i.b
        public /* bridge */ /* synthetic */ void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
        }

        public void b(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        @Override // h.g.a.p.r.d.j0.f
        public /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
        }

        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
        }

        public /* synthetic */ c(a aVar) {
        }
    }

    /* compiled from: VideoDecoder.java */
    @RequiresApi(23)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class d implements f<ByteBuffer> {

        /* compiled from: VideoDecoder.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class a extends MediaDataSource {
            public final /* synthetic */ ByteBuffer b;
            public final /* synthetic */ d c;

            public a(d dVar, ByteBuffer byteBuffer) {
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j2, byte[] bArr, int i2, int i3) {
            }
        }

        @Override // h.g.a.p.r.d.j0.f
        public /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
        }

        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
        }
    }

    /* compiled from: VideoDecoder.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class e {
        public MediaMetadataRetriever a() {
        }
    }

    /* compiled from: VideoDecoder.java */
    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // h.g.a.p.r.d.j0.f
        public /* bridge */ /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
        }

        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;
    }

    public j0(h.g.a.p.p.a0.e eVar, f<T> fVar) {
    }

    public static h.g.a.p.l<AssetFileDescriptor, Bitmap> c(h.g.a.p.p.a0.e eVar) {
    }

    @RequiresApi(api = 23)
    public static h.g.a.p.l<ByteBuffer, Bitmap> d(h.g.a.p.p.a0.e eVar) {
    }

    @Nullable
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, p pVar) {
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2) {
    }

    @Nullable
    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, p pVar) {
    }

    public static h.g.a.p.l<ParcelFileDescriptor, Bitmap> h(h.g.a.p.p.a0.e eVar) {
    }

    @Override // h.g.a.p.l
    public boolean a(@NonNull T t, @NonNull h.g.a.p.j jVar) {
    }

    @Override // h.g.a.p.l
    public h.g.a.p.p.v<Bitmap> b(@NonNull T t, int i2, int i3, @NonNull h.g.a.p.j jVar) throws IOException {
    }

    @VisibleForTesting
    public j0(h.g.a.p.p.a0.e eVar, f<T> fVar, e eVar2) {
    }
}
