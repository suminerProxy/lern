package h.w.a.e.b.b;

import java.util.Collection;
import java.util.Comparator;

/* compiled from: IDanmakus.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final int f25634a = 0;
    public static final int b = 1;
    public static final int c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f25635d = 4;

    /* compiled from: IDanmakus.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class a implements Comparator<h.w.a.e.b.b.d> {
        public boolean b;

        public a(boolean z) {
        }

        public int a(h.w.a.e.b.b.d dVar, h.w.a.e.b.b.d dVar2) {
        }

        public void b(boolean z) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(h.w.a.e.b.b.d dVar, h.w.a.e.b.b.d dVar2) {
        }
    }

    /* compiled from: IDanmakus.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class b<Progress, Result> {

        /* renamed from: a  reason: collision with root package name */
        public static final int f25636a = 0;
        public static final int b = 1;
        public static final int c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static final int f25637d = 3;

        public abstract int a(Progress progress);

        public void b() {
        }

        public void c() {
        }

        public Result d() {
        }
    }

    /* compiled from: IDanmakus.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static abstract class c<Progress> extends b<Progress, Void> {
    }

    /* compiled from: IDanmakus.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class d extends a {
        public d(boolean z) {
        }

        @Override // h.w.a.e.b.b.m.a
        public int a(h.w.a.e.b.b.d dVar, h.w.a.e.b.b.d dVar2) {
        }

        @Override // h.w.a.e.b.b.m.a, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(h.w.a.e.b.b.d dVar, h.w.a.e.b.b.d dVar2) {
        }
    }

    /* compiled from: IDanmakus.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class e extends a {
        public e(boolean z) {
        }

        @Override // h.w.a.e.b.b.m.a
        public int a(h.w.a.e.b.b.d dVar, h.w.a.e.b.b.d dVar2) {
        }

        @Override // h.w.a.e.b.b.m.a, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(h.w.a.e.b.b.d dVar, h.w.a.e.b.b.d dVar2) {
        }
    }

    /* compiled from: IDanmakus.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class f extends a {
        public f(boolean z) {
        }

        @Override // h.w.a.e.b.b.m.a
        public int a(h.w.a.e.b.b.d dVar, h.w.a.e.b.b.d dVar2) {
        }

        @Override // h.w.a.e.b.b.m.a, java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(h.w.a.e.b.b.d dVar, h.w.a.e.b.b.d dVar2) {
        }
    }

    boolean a(h.w.a.e.b.b.d dVar);

    Collection<h.w.a.e.b.b.d> b();

    void c(boolean z);

    void clear();

    boolean d(h.w.a.e.b.b.d dVar);

    m e(long j2, long j3);

    Object f();

    h.w.a.e.b.b.d first();

    boolean g(h.w.a.e.b.b.d dVar);

    void h(b<? super h.w.a.e.b.b.d, ?> bVar);

    m i(long j2, long j3);

    boolean isEmpty();

    void j(b<? super h.w.a.e.b.b.d, ?> bVar);

    h.w.a.e.b.b.d last();

    int size();
}
