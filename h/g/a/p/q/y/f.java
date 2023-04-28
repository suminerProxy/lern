package h.g.a.p.q.y;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import h.g.a.h;
import h.g.a.p.j;
import h.g.a.p.o.d;
import h.g.a.p.q.n;
import h.g.a.p.q.o;
import h.g.a.p.q.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
@RequiresApi(29)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class f<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16951a;
    private final n<File, DataT> b;
    private final n<Uri, DataT> c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<DataT> f16952d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f16953a;
        private final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
        }

        @Override // h.g.a.p.q.o
        public final void a() {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public final n<Uri, DataT> c(@NonNull r rVar) {
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    @RequiresApi(29)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    @RequiresApi(29)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class d<DataT> implements h.g.a.p.o.d<DataT> {

        /* renamed from: l  reason: collision with root package name */
        private static final String[] f16954l = null;
        private final Context b;
        private final n<File, DataT> c;

        /* renamed from: d  reason: collision with root package name */
        private final n<Uri, DataT> f16955d;

        /* renamed from: e  reason: collision with root package name */
        private final Uri f16956e;

        /* renamed from: f  reason: collision with root package name */
        private final int f16957f;

        /* renamed from: g  reason: collision with root package name */
        private final int f16958g;

        /* renamed from: h  reason: collision with root package name */
        private final j f16959h;

        /* renamed from: i  reason: collision with root package name */
        private final Class<DataT> f16960i;

        /* renamed from: j  reason: collision with root package name */
        private volatile boolean f16961j;
        @Nullable

        /* renamed from: k  reason: collision with root package name */
        private volatile h.g.a.p.o.d<DataT> f16962k;

        public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, j jVar, Class<DataT> cls) {
        }

        @Nullable
        private n.a<DataT> c() throws FileNotFoundException {
        }

        @Nullable
        private h.g.a.p.o.d<DataT> e() throws FileNotFoundException {
        }

        private boolean f() {
        }

        @NonNull
        private File g(Uri uri) throws FileNotFoundException {
        }

        @Override // h.g.a.p.o.d
        @NonNull
        public Class<DataT> a() {
        }

        @Override // h.g.a.p.o.d
        public void b() {
        }

        @Override // h.g.a.p.o.d
        public void cancel() {
        }

        @Override // h.g.a.p.o.d
        public void d(@NonNull h hVar, @NonNull d.a<? super DataT> aVar) {
        }

        @Override // h.g.a.p.o.d
        @NonNull
        public h.g.a.p.a getDataSource() {
        }
    }

    public f(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
    }

    @Override // h.g.a.p.q.n
    public /* bridge */ /* synthetic */ boolean a(@NonNull Uri uri) {
    }

    @Override // h.g.a.p.q.n
    public /* bridge */ /* synthetic */ n.a b(@NonNull Uri uri, int i2, int i3, @NonNull j jVar) {
    }

    public n.a<DataT> c(@NonNull Uri uri, int i2, int i3, @NonNull j jVar) {
    }

    public boolean d(@NonNull Uri uri) {
    }
}
