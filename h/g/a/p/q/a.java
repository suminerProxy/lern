package h.g.a.p.q;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import h.g.a.p.q.n;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class a<Data> implements n<Uri, Data> {
    private static final String c = "android_asset";

    /* renamed from: d  reason: collision with root package name */
    private static final String f16877d = "file:///android_asset/";

    /* renamed from: e  reason: collision with root package name */
    private static final int f16878e = 22;

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f16879a;
    private final InterfaceC0319a<Data> b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: h.g.a.p.q.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InterfaceC0319a<Data> {
        h.g.a.p.o.d<Data> b(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0319a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f16880a;

        public b(AssetManager assetManager) {
        }

        @Override // h.g.a.p.q.o
        public void a() {
        }

        @Override // h.g.a.p.q.a.InterfaceC0319a
        public h.g.a.p.o.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0319a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final AssetManager f16881a;

        public c(AssetManager assetManager) {
        }

        @Override // h.g.a.p.q.o
        public void a() {
        }

        @Override // h.g.a.p.q.a.InterfaceC0319a
        public h.g.a.p.o.d<InputStream> b(AssetManager assetManager, String str) {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public n<Uri, InputStream> c(r rVar) {
        }
    }

    public a(AssetManager assetManager, InterfaceC0319a<Data> interfaceC0319a) {
    }

    @Override // h.g.a.p.q.n
    public /* bridge */ /* synthetic */ boolean a(@NonNull Uri uri) {
    }

    @Override // h.g.a.p.q.n
    public /* bridge */ /* synthetic */ n.a b(@NonNull Uri uri, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }

    public n.a<Data> c(@NonNull Uri uri, int i2, int i3, @NonNull h.g.a.p.j jVar) {
    }

    public boolean d(@NonNull Uri uri) {
    }
}
