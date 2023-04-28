package i.a.e1.h.f.g;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;

/* compiled from: SingleInternalHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements i.a.e1.g.s<NoSuchElementException> {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a INSTANCE = null;

        private a(String $enum$name, int $enum$ordinal) {
        }

        public static a valueOf(String name) {
        }

        public static a[] values() {
        }

        @Override // i.a.e1.g.s
        public /* bridge */ /* synthetic */ NoSuchElementException get() throws Throwable {
        }

        @Override // i.a.e1.g.s
        /* renamed from: get  reason: avoid collision after fix types in other method */
        public NoSuchElementException get2() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b implements i.a.e1.g.o<i.a.e1.c.x0, Publisher> {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b INSTANCE = null;

        private b(String $enum$name, int $enum$ordinal) {
        }

        public static b valueOf(String name) {
        }

        public static b[] values() {
        }

        @Override // i.a.e1.g.o
        public /* bridge */ /* synthetic */ Publisher apply(i.a.e1.c.x0 v) throws Throwable {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public Publisher apply2(i.a.e1.c.x0 v) {
        }
    }

    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> implements Iterable<i.a.e1.c.s<T>> {
        private final Iterable<? extends i.a.e1.c.x0<? extends T>> b;

        public c(Iterable<? extends i.a.e1.c.x0<? extends T>> sources) {
        }

        @Override // java.lang.Iterable
        public Iterator<i.a.e1.c.s<T>> iterator() {
        }
    }

    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> implements Iterator<i.a.e1.c.s<T>> {
        private final Iterator<? extends i.a.e1.c.x0<? extends T>> b;

        public d(Iterator<? extends i.a.e1.c.x0<? extends T>> sit) {
        }

        public i.a.e1.c.s<T> a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    private l0() {
    }

    public static i.a.e1.g.s<NoSuchElementException> a() {
    }

    public static <T> Iterable<? extends i.a.e1.c.s<T>> b(final Iterable<? extends i.a.e1.c.x0<? extends T>> sources) {
    }

    public static <T> i.a.e1.g.o<i.a.e1.c.x0<? extends T>, Publisher<? extends T>> c() {
    }
}
