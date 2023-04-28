package i.a.e1.h.k;

import i.a.e1.c.p0;
import java.io.Serializable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* compiled from: NotificationLite.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q {
    private static final /* synthetic */ q[] $VALUES = null;
    public static final q COMPLETE = null;

    /* compiled from: NotificationLite.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        public final i.a.e1.d.f upstream;

        public a(i.a.e1.d.f d2) {
        }

        public String toString() {
        }
    }

    /* compiled from: NotificationLite.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: e  reason: collision with root package name */
        public final Throwable f27890e;

        public b(Throwable e2) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public String toString() {
        }
    }

    /* compiled from: NotificationLite.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        public final Subscription upstream;

        public c(Subscription s) {
        }

        public String toString() {
        }
    }

    private q(String $enum$name, int $enum$ordinal) {
    }

    public static <T> boolean accept(Object o2, Subscriber<? super T> s) {
    }

    public static <T> boolean acceptFull(Object o2, Subscriber<? super T> s) {
    }

    public static Object complete() {
    }

    public static Object disposable(i.a.e1.d.f d2) {
    }

    public static Object error(Throwable e2) {
    }

    public static i.a.e1.d.f getDisposable(Object o2) {
    }

    public static Throwable getError(Object o2) {
    }

    public static Subscription getSubscription(Object o2) {
    }

    public static <T> T getValue(Object o2) {
    }

    public static boolean isComplete(Object o2) {
    }

    public static boolean isDisposable(Object o2) {
    }

    public static boolean isError(Object o2) {
    }

    public static boolean isSubscription(Object o2) {
    }

    public static <T> Object next(T value) {
    }

    public static Object subscription(Subscription s) {
    }

    public static q valueOf(String name) {
    }

    public static q[] values() {
    }

    @Override // java.lang.Enum
    public String toString() {
    }

    public static <T> boolean accept(Object o2, p0<? super T> observer) {
    }

    public static <T> boolean acceptFull(Object o2, p0<? super T> observer) {
    }
}
