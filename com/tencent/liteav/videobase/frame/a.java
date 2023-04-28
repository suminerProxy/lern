package com.tencent.liteav.videobase.frame;

import androidx.annotation.NonNull;
import com.tencent.liteav.videobase.frame.k;
import java.util.Deque;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a<T extends k> {

    /* renamed from: a  reason: collision with root package name */
    private static final long f11958a = 0;
    private final String b;
    private final Map<InterfaceC0200a, Deque<T>> c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f11959d;

    /* renamed from: e  reason: collision with root package name */
    private final com.tencent.liteav.base.b.a f11960e;

    /* renamed from: f  reason: collision with root package name */
    private final g<T> f11961f;

    /* renamed from: com.tencent.liteav.videobase.frame.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface InterfaceC0200a {
    }

    public static /* synthetic */ void a(a aVar, k kVar) {
    }

    private void c() {
    }

    public abstract T a(g<T> gVar, InterfaceC0200a interfaceC0200a);

    public abstract void a(T t);

    public abstract InterfaceC0200a b(T t);

    public void b() {
    }

    public void finalize() throws Throwable {
    }

    private Deque<T> b(InterfaceC0200a interfaceC0200a) {
    }

    @NonNull
    public final T a(InterfaceC0200a interfaceC0200a) {
    }

    public void a() {
    }
}
