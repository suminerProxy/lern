package org.greenrobot.eventbus;

import android.os.Looper;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public interface MainThreadSupport {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AndroidHandlerMainThreadSupport implements MainThreadSupport {
        private final Looper looper;

        public AndroidHandlerMainThreadSupport(Looper looper) {
        }

        @Override // org.greenrobot.eventbus.MainThreadSupport
        public Poster createPoster(EventBus eventBus) {
        }

        @Override // org.greenrobot.eventbus.MainThreadSupport
        public boolean isMainThread() {
        }
    }

    Poster createPoster(EventBus eventBus);

    boolean isMainThread();
}
