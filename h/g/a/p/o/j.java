package h.g.a.p.o;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import h.g.a.p.o.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class j implements d<InputStream> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f16598h = "HttpUrlFetcher";

    /* renamed from: i  reason: collision with root package name */
    private static final int f16599i = 5;
    @VisibleForTesting

    /* renamed from: j  reason: collision with root package name */
    public static final String f16600j = "Location";
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    public static final b f16601k = null;
    @VisibleForTesting

    /* renamed from: l  reason: collision with root package name */
    public static final int f16602l = -1;
    private final h.g.a.p.q.g b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final b f16603d;

    /* renamed from: e  reason: collision with root package name */
    private HttpURLConnection f16604e;

    /* renamed from: f  reason: collision with root package name */
    private InputStream f16605f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f16606g;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements b {
        @Override // h.g.a.p.o.j.b
        public HttpURLConnection a(URL url) throws IOException {
        }
    }

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(h.g.a.p.q.g gVar, int i2) {
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws h.g.a.p.e {
    }

    private static int e(HttpURLConnection httpURLConnection) {
    }

    private InputStream f(HttpURLConnection httpURLConnection) throws h.g.a.p.e {
    }

    private static boolean g(int i2) {
    }

    private static boolean h(int i2) {
    }

    private InputStream i(URL url, int i2, URL url2, Map<String, String> map) throws h.g.a.p.e {
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
    public void d(@NonNull h.g.a.h hVar, @NonNull d.a<? super InputStream> aVar) {
    }

    @Override // h.g.a.p.o.d
    @NonNull
    public h.g.a.p.a getDataSource() {
    }

    @VisibleForTesting
    public j(h.g.a.p.q.g gVar, int i2, b bVar) {
    }
}
