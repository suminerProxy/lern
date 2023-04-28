package i.a.e1.h.k;

/* compiled from: OpenHashSet.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final int f27891f = -1640531527;

    /* renamed from: a  reason: collision with root package name */
    public final float f27892a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f27893d;

    /* renamed from: e  reason: collision with root package name */
    public T[] f27894e;

    public s() {
        this(16, 0.75f);
    }

    public static int c(int x) {
        int i2 = x * f27891f;
        return i2 ^ (i2 >>> 16);
    }

    public boolean a(T value) {
        T t;
        T[] tArr = this.f27894e;
        int i2 = this.b;
        int c = c(value.hashCode()) & i2;
        T t2 = tArr[c];
        if (t2 != null) {
            if (t2.equals(value)) {
                return false;
            }
            do {
                c = (c + 1) & i2;
                t = tArr[c];
                if (t == null) {
                }
            } while (!t.equals(value));
            return false;
        }
        tArr[c] = value;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 >= this.f27893d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f27894e;
    }

    public void d() {
        T[] tArr = this.f27894e;
        int length = tArr.length;
        int i2 = length << 1;
        int i3 = i2 - 1;
        T[] tArr2 = (T[]) new Object[i2];
        int i4 = this.c;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int c = c(tArr[length].hashCode()) & i3;
                if (tArr2[c] != null) {
                    do {
                        c = (c + 1) & i3;
                    } while (tArr2[c] != null);
                }
                tArr2[c] = tArr[length];
                i4 = i5;
            } else {
                this.b = i3;
                this.f27893d = (int) (i2 * this.f27892a);
                this.f27894e = tArr2;
                return;
            }
        }
    }

    public boolean e(T value) {
        T t;
        T[] tArr = this.f27894e;
        int i2 = this.b;
        int c = c(value.hashCode()) & i2;
        T t2 = tArr[c];
        if (t2 == null) {
            return false;
        }
        if (t2.equals(value)) {
            return f(c, tArr, i2);
        }
        do {
            c = (c + 1) & i2;
            t = tArr[c];
            if (t == null) {
                return false;
            }
        } while (!t.equals(value));
        return f(c, tArr, i2);
    }

    public boolean f(int pos, T[] a2, int m2) {
        int i2;
        T t;
        this.c--;
        while (true) {
            int i3 = pos + 1;
            while (true) {
                i2 = i3 & m2;
                t = a2[i2];
                if (t == null) {
                    a2[pos] = null;
                    return true;
                }
                int c = c(t.hashCode()) & m2;
                if (pos > i2) {
                    if (pos >= c && c > i2) {
                        break;
                    }
                    i3 = i2 + 1;
                } else if (pos < c && c <= i2) {
                    i3 = i2 + 1;
                }
            }
            a2[pos] = t;
            pos = i2;
        }
    }

    public int g() {
        return this.c;
    }

    public s(int capacity) {
        this(capacity, 0.75f);
    }

    public s(int capacity, float loadFactor) {
        this.f27892a = loadFactor;
        int b = t.b(capacity);
        this.b = b - 1;
        this.f27893d = (int) (loadFactor * b);
        this.f27894e = (T[]) new Object[b];
    }
}
