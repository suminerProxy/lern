package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.videobase.frame.k;
import java.util.Deque;
import java.util.concurrent.Semaphore;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class h<T extends k> {

    /* renamed from: a  reason: collision with root package name */
    public final Deque<T> f11969a;
    public final Semaphore b;
    public volatile boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final g<T> f11970d;

    /* renamed from: com.tencent.liteav.videobase.frame.h$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements g<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f11971a;

        public AnonymousClass1(h hVar) {
        }

        @Override // com.tencent.liteav.videobase.frame.g
        public final void a(T t) {
        }
    }

    private void c() {
    }

    public final T a() throws InterruptedException {
    }

    public abstract T a(g<T> gVar);

    public final void b() {
    }
}
