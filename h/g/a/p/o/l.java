package h.g.a.p.o;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import h.g.a.p.o.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f16609e = "LocalUriFetcher";
    private final Uri b;
    private final ContentResolver c;

    /* renamed from: d  reason: collision with root package name */
    private T f16610d;

    public l(ContentResolver contentResolver, Uri uri) {
    }

    @Override // h.g.a.p.o.d
    public void b() {
    }

    public abstract void c(T t) throws IOException;

    @Override // h.g.a.p.o.d
    public void cancel() {
    }

    @Override // h.g.a.p.o.d
    public final void d(@NonNull h.g.a.h hVar, @NonNull d.a<? super T> aVar) {
    }

    public abstract T e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // h.g.a.p.o.d
    @NonNull
    public h.g.a.p.a getDataSource() {
    }
}
