package i.a.e1.h.k;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExceptionHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Throwable f27886a = new a();

    /* compiled from: ExceptionHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
        }
    }

    private k() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(AtomicReference<Throwable> field, Throwable exception) {
        Throwable th;
        do {
            th = field.get();
            if (th == f27886a) {
                return false;
            }
        } while (!field.compareAndSet(th, th == null ? exception : new i.a.e1.e.a(th, exception)));
        return true;
    }

    public static NullPointerException b(String prefix) {
        return new NullPointerException(e(prefix));
    }

    public static List<Throwable> c(Throwable t) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(t);
        while (!arrayDeque.isEmpty()) {
            Throwable th = (Throwable) arrayDeque.removeFirst();
            if (th instanceof i.a.e1.e.a) {
                List<Throwable> exceptions = ((i.a.e1.e.a) th).getExceptions();
                for (int size = exceptions.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(exceptions.get(size));
                }
            } else {
                arrayList.add(th);
            }
        }
        return arrayList;
    }

    public static <T> T d(T value, String prefix) {
        if (value != null) {
            return value;
        }
        throw b(prefix);
    }

    public static String e(String prefix) {
        return prefix + " Null values are generally not allowed in 3.x operators and sources.";
    }

    public static Throwable f(AtomicReference<Throwable> field) {
        Throwable th = field.get();
        Throwable th2 = f27886a;
        return th != th2 ? field.getAndSet(th2) : th;
    }

    public static <E extends Throwable> Exception g(Throwable e2) throws Throwable {
        if (e2 instanceof Exception) {
            return (Exception) e2;
        }
        throw e2;
    }

    public static String h(long timeout, TimeUnit unit) {
        return "The source did not signal an event for " + timeout + " " + unit.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException i(Throwable error) {
        if (!(error instanceof Error)) {
            if (error instanceof RuntimeException) {
                return (RuntimeException) error;
            }
            return new RuntimeException(error);
        }
        throw ((Error) error);
    }
}
