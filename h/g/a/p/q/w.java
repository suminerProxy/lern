package h.g.a.p.q;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import h.g.a.p.q.n;
import java.io.InputStream;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class w<Data> implements n<Uri, Data> {
    private static final Set<String> b = null;

    /* renamed from: a  reason: collision with root package name */
    private final c<Data> f16939a;

    /* compiled from: UriLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f16940a;

        public a(ContentResolver contentResolver) {
        }

        @Override // h.g.a.p.q.o
        public void a() {
        }

        @Override // h.g.a.p.q.w.c
        public h.g.a.p.o.d<AssetFileDescriptor> b(Uri uri) {
        }

        @Override // h.g.a.p.q.o
        public n<Uri, AssetFileDescriptor> c(r rVar) {
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f16941a;

        public b(ContentResolver contentResolver) {
        }

        @Override // h.g.a.p.q.o
        public void a() {
        }

        @Override // h.g.a.p.q.w.c
        public h.g.a.p.o.d<ParcelFileDescriptor> b(Uri uri) {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface c<Data> {
        h.g.a.p.o.d<Data> b(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f16942a;

        public d(ContentResolver contentResolver) {
        }

        @Override // h.g.a.p.q.o
        public void a() {
        }

        @Override // h.g.a.p.q.w.c
        public h.g.a.p.o.d<InputStream> b(Uri uri) {
        }

        @Override // h.g.a.p.q.o
        @NonNull
        public n<Uri, InputStream> c(r rVar) {
        }
    }

    public w(c<Data> cVar) {
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
