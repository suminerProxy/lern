package i.a.e1.h.b;

import i.a.e1.g.d;

/* compiled from: ObjectHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d<Object, Object> f26759a = new a();

    /* compiled from: ObjectHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements d<Object, Object> {
        @Override // i.a.e1.g.d
        public boolean a(Object o1, Object o2) {
        }
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> d<T, T> a() {
        return (d<T, T>) f26759a;
    }

    public static int b(int value, String paramName) {
        if (value > 0) {
            return value;
        }
        throw new IllegalArgumentException(paramName + " > 0 required but it was " + value);
    }

    public static long c(long value, String paramName) {
        if (value > 0) {
            return value;
        }
        throw new IllegalArgumentException(paramName + " > 0 required but it was " + value);
    }
}
