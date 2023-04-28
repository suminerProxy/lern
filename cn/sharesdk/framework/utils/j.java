package cn.sharesdk.framework.utils;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: ThreadPoolManager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ThreadPoolExecutor f231a;
    private static ScheduledExecutorService b;

    /* compiled from: ThreadPoolManager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class a implements Runnable {
        public abstract void a() throws Throwable;

        public void a(Throwable th) {
        }

        public String b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static void a(Runnable runnable) {
    }

    public static <T extends a> void a(T t) {
    }
}
