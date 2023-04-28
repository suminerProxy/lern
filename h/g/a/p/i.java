package h.g.a.p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class i<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final b<Object> f16585e = null;

    /* renamed from: a  reason: collision with root package name */
    private final T f16586a;
    private final b<T> b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private volatile byte[] f16587d;

    /* compiled from: Option.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class a implements b<Object> {
        @Override // h.g.a.p.i.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    private i(@NonNull String str, @Nullable T t, @NonNull b<T> bVar) {
    }

    @NonNull
    public static <T> i<T> a(@NonNull String str, @NonNull b<T> bVar) {
    }

    @NonNull
    public static <T> i<T> b(@NonNull String str, @Nullable T t, @NonNull b<T> bVar) {
    }

    @NonNull
    private static <T> b<T> c() {
    }

    @NonNull
    private byte[] e() {
    }

    @NonNull
    public static <T> i<T> f(@NonNull String str) {
    }

    @NonNull
    public static <T> i<T> g(@NonNull String str, @NonNull T t) {
    }

    @Nullable
    public T d() {
    }

    public boolean equals(Object obj) {
    }

    public void h(@NonNull T t, @NonNull MessageDigest messageDigest) {
    }

    public int hashCode() {
    }

    public String toString() {
    }
}
