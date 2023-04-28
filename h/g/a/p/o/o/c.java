package h.g.a.p.o.o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import h.g.a.h;
import h.g.a.p.o.d;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class c implements h.g.a.p.o.d<InputStream> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f16618e = "MediaStoreThumbFetcher";
    private final Uri b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private InputStream f16619d;

    /* compiled from: ThumbFetcher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements d {
        private static final String[] b = null;
        private static final String c = "kind = 1 AND image_id = ?";

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f16620a;

        public a(ContentResolver contentResolver) {
        }

        @Override // h.g.a.p.o.o.d
        public Cursor a(Uri uri) {
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class b implements d {
        private static final String[] b = null;
        private static final String c = "kind = 1 AND video_id = ?";

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f16621a;

        public b(ContentResolver contentResolver) {
        }

        @Override // h.g.a.p.o.o.d
        public Cursor a(Uri uri) {
        }
    }

    @VisibleForTesting
    public c(Uri uri, e eVar) {
    }

    private static c c(Context context, Uri uri, d dVar) {
    }

    public static c e(Context context, Uri uri) {
    }

    public static c f(Context context, Uri uri) {
    }

    private InputStream g() throws FileNotFoundException {
    }

    @Override // h.g.a.p.o.d
    @NonNull
    public Class<InputStream> a() {
    }

    @Override // h.g.a.p.o.d
    public void b() {
    }

    @Override // h.g.a.p.o.d
    public void cancel() {
    }

    @Override // h.g.a.p.o.d
    public void d(@NonNull h hVar, @NonNull d.a<? super InputStream> aVar) {
    }

    @Override // h.g.a.p.o.d
    @NonNull
    public h.g.a.p.a getDataSource() {
    }
}
