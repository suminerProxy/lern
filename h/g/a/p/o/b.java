package h.g.a.p.o;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import h.g.a.p.o.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f16588e = "AssetPathFetcher";
    private final String b;
    private final AssetManager c;

    /* renamed from: d  reason: collision with root package name */
    private T f16589d;

    public b(AssetManager assetManager, String str) {
    }

    @Override // h.g.a.p.o.d
    public void b() {
    }

    public abstract void c(T t) throws IOException;

    @Override // h.g.a.p.o.d
    public void cancel() {
    }

    @Override // h.g.a.p.o.d
    public void d(@NonNull h.g.a.h hVar, @NonNull d.a<? super T> aVar) {
    }

    public abstract T e(AssetManager assetManager, String str) throws IOException;

    @Override // h.g.a.p.o.d
    @NonNull
    public h.g.a.p.a getDataSource() {
    }
}
