package i.a.y0.e.g;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* compiled from: SingleInternalHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a implements Callable<NoSuchElementException> {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a INSTANCE = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ NoSuchElementException call() throws Exception {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call  reason: avoid collision after fix types in other method */
        public NoSuchElementException call2() throws Exception {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b implements i.a.x0.o<i.a.q0, Publisher> {
        private static final /* synthetic */ b[] $VALUES = null;
        public static final b INSTANCE = null;

        private b(String str, int i2) {
        }

        public static b valueOf(String str) {
        }

        public static b[] values() {
        }

        @Override // i.a.x0.o
        public /* bridge */ /* synthetic */ Publisher apply(i.a.q0 q0Var) throws Exception {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public Publisher apply2(i.a.q0 q0Var) {
        }
    }

    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> implements Iterable<i.a.l<T>> {
        private final Iterable<? extends i.a.q0<? extends T>> b;

        public c(Iterable<? extends i.a.q0<? extends T>> iterable) {
        }

        @Override // java.lang.Iterable
        public Iterator<i.a.l<T>> iterator() {
        }
    }

    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> implements Iterator<i.a.l<T>> {
        private final Iterator<? extends i.a.q0<? extends T>> b;

        public d(Iterator<? extends i.a.q0<? extends T>> it) {
        }

        public i.a.l<T> a() {
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: SingleInternalHelper.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e implements i.a.x0.o<i.a.q0, i.a.b0> {
        private static final /* synthetic */ e[] $VALUES = null;
        public static final e INSTANCE = null;

        private e(String str, int i2) {
        }

        public static e valueOf(String str) {
        }

        public static e[] values() {
        }

        @Override // i.a.x0.o
        public /* bridge */ /* synthetic */ i.a.b0 apply(i.a.q0 q0Var) throws Exception {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public i.a.b0 apply2(i.a.q0 q0Var) {
        }
    }

    private h0() {
    }

    public static <T> Callable<NoSuchElementException> a() {
    }

    public static <T> Iterable<? extends i.a.l<T>> b(Iterable<? extends i.a.q0<? extends T>> iterable) {
    }

    public static <T> i.a.x0.o<i.a.q0<? extends T>, Publisher<? extends T>> c() {
    }

    public static <T> i.a.x0.o<i.a.q0<? extends T>, i.a.b0<? extends T>> d() {
    }
}
