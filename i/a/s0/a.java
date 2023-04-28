package i.a.s0;

import i.a.u0.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MainThreadDisposable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a implements c {
    private final AtomicBoolean unsubscribed;

    /* compiled from: MainThreadDisposable.java */
    /* renamed from: i.a.s0.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class RunnableC0519a implements Runnable {
        public final /* synthetic */ a b;

        public RunnableC0519a(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static void verifyMainThread() {
    }

    @Override // i.a.u0.c
    public final void dispose() {
    }

    @Override // i.a.u0.c
    public final boolean isDisposed() {
    }

    public abstract void onDispose();
}
