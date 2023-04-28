package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class UiThreadImmediateExecutorService extends HandlerExecutorServiceImpl {
    @Nullable
    private static UiThreadImmediateExecutorService sInstance;

    private UiThreadImmediateExecutorService() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static UiThreadImmediateExecutorService getInstance() {
        if (sInstance == null) {
            sInstance = new UiThreadImmediateExecutorService();
        }
        return sInstance;
    }

    @Override // com.facebook.common.executors.HandlerExecutorServiceImpl, java.util.concurrent.Executor
    public void execute(Runnable command) {
        if (isHandlerThread()) {
            command.run();
        } else {
            super.execute(command);
        }
    }
}
