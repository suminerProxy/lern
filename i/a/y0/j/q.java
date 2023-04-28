package i.a.y0.j;

import i.a.i0;
import java.io.Serializable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* compiled from: NotificationLite.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES = null;
    public static final q COMPLETE = null;

    /* compiled from: NotificationLite.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        public final i.a.u0.c upstream;

        public a(i.a.u0.c cVar) {
        }

        public String toString() {
        }
    }

    /* compiled from: NotificationLite.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e  reason: collision with root package name */
        public final Throwable f29202e;

        public b(Throwable th) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* compiled from: NotificationLite.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        public final Subscription upstream;

        public c(Subscription subscription) {
        }

        public String toString() {
        }
    }

    private q(String str, int i2) {
    }

    public static <T> boolean accept(Object obj, Subscriber<? super T> subscriber) {
    }

    public static <T> boolean acceptFull(Object obj, Subscriber<? super T> subscriber) {
    }

    public static Object complete() {
    }

    public static Object disposable(i.a.u0.c cVar) {
    }

    public static Object error(Throwable th) {
    }

    public static i.a.u0.c getDisposable(Object obj) {
    }

    public static Throwable getError(Object obj) {
    }

    public static Subscription getSubscription(Object obj) {
    }

    public static <T> T getValue(Object obj) {
    }

    public static boolean isComplete(Object obj) {
    }

    public static boolean isDisposable(Object obj) {
    }

    public static boolean isError(Object obj) {
    }

    public static boolean isSubscription(Object obj) {
    }

    public static <T> Object next(T t) {
    }

    public static Object subscription(Subscription subscription) {
    }

    public static q valueOf(String str) {
    }

    public static q[] values() {
    }

    @Override // java.lang.Enum
    public String toString() {
    }

    public static <T> boolean accept(Object obj, i0<? super T> i0Var) {
    }

    public static <T> boolean acceptFull(Object obj, i0<? super T> i0Var) {
    }
}
