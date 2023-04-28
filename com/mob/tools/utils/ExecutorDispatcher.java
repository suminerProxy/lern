package com.mob.tools.utils;

import android.os.Handler;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ExecutorDispatcher implements com.mob.tools.utils.a {
    private static volatile ExecutorDispatcher b;

    /* renamed from: a  reason: collision with root package name */
    private final com.mob.tools.utils.a f4505a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class SafeRunnable implements Runnable {
        public void afterRun() {
        }

        public void beforeRun() {
        }

        public void handleException(Throwable th) {
        }

        public String name() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public abstract void safeRun();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class a implements com.mob.tools.utils.a {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f4506a;
        private final ExecutorService b;
        private final ExecutorService c;

        /* renamed from: d  reason: collision with root package name */
        private final Handler f4507d;

        /* renamed from: com.mob.tools.utils.ExecutorDispatcher$a$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends SafeRunnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SafeRunnable f4508a;
            public final /* synthetic */ a b;

            public AnonymousClass1(a aVar, SafeRunnable safeRunnable) {
            }

            @Override // com.mob.tools.utils.ExecutorDispatcher.SafeRunnable
            public void safeRun() {
            }
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeDelayed(T t, long j2) {
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeDuctile(T t) {
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeImmediately(T t) {
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeSerial(T t) {
        }

        private a() {
        }
    }

    public static com.mob.tools.utils.a getInstance() {
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeDelayed(T t, long j2) {
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeDuctile(T t) {
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeImmediately(T t) {
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeSerial(T t) {
    }
}
