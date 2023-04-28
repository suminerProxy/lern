package i.a.y0.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    public final boolean nonBlocking;
    public final String prefix;
    public final int priority;

    /* compiled from: RxThreadFactory.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends Thread implements j {
        public a(Runnable runnable, String str) {
        }
    }

    public k(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
    }

    public k(String str, int i2) {
    }

    public k(String str, int i2, boolean z) {
    }
}
