package com.sobot.network.http.upload;

import com.sobot.network.http.model.SobotProgress;
import com.sobot.network.http.request.ProgressRequestBody;
import com.sobot.network.http.request.RequestCall;
import com.sobot.network.http.task.PriorityRunnable;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotUploadTask<T> implements Runnable {
    private static final String TAG = "SobotUploadTask";
    private ThreadPoolExecutor executor;
    public Map<Object, SobotUploadListener> listeners;
    private PriorityRunnable priorityRunnable;
    public SobotProgress progress;

    /* renamed from: com.sobot.network.http.upload.SobotUploadTask$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements ProgressRequestBody.UploadInterceptor {
        public final /* synthetic */ SobotUploadTask this$0;
        public final /* synthetic */ RequestCall val$requestCall;

        public AnonymousClass1(SobotUploadTask sobotUploadTask, RequestCall requestCall) {
        }

        @Override // com.sobot.network.http.request.ProgressRequestBody.UploadInterceptor
        public void uploadProgress(SobotProgress sobotProgress) {
        }
    }

    /* renamed from: com.sobot.network.http.upload.SobotUploadTask$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ SobotUploadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass2(SobotUploadTask sobotUploadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.upload.SobotUploadTask$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ SobotUploadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass3(SobotUploadTask sobotUploadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.upload.SobotUploadTask$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ SobotUploadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass4(SobotUploadTask sobotUploadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.upload.SobotUploadTask$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ SobotUploadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass5(SobotUploadTask sobotUploadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.upload.SobotUploadTask$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements Runnable {
        public final /* synthetic */ SobotUploadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass6(SobotUploadTask sobotUploadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.upload.SobotUploadTask$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ SobotUploadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;
        public final /* synthetic */ SobotUploadModelBase val$result;

        public AnonymousClass7(SobotUploadTask sobotUploadTask, SobotProgress sobotProgress, SobotUploadModelBase sobotUploadModelBase) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.upload.SobotUploadTask$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements Runnable {
        public final /* synthetic */ SobotUploadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass8(SobotUploadTask sobotUploadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public SobotUploadTask(String str, RequestCall requestCall) {
    }

    public static /* synthetic */ void access$000(SobotUploadTask sobotUploadTask, SobotProgress sobotProgress) {
    }

    private void postLoading(SobotProgress sobotProgress) {
    }

    private void postOnError(SobotProgress sobotProgress, Throwable th) {
    }

    private void postOnFinish(SobotProgress sobotProgress, SobotUploadModelBase sobotUploadModelBase) {
    }

    private void postOnRemove(SobotProgress sobotProgress) {
    }

    private void postOnStart(SobotProgress sobotProgress) {
    }

    private void postPause(SobotProgress sobotProgress) {
    }

    private void postWaiting(SobotProgress sobotProgress) {
    }

    private void updateDatabase(SobotProgress sobotProgress) {
    }

    public SobotUploadTask<T> filePath(String str) {
    }

    public void pause() {
    }

    public SobotUploadTask<T> priority(int i2) {
    }

    public SobotUploadTask<T> register(SobotUploadListener sobotUploadListener) {
    }

    public SobotUploadTask<T> remove() {
    }

    public void restart() {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public SobotUploadTask<T> start() {
    }

    public SobotUploadTask<T> tmpTag(String str) {
    }

    public void unRegister(SobotUploadListener sobotUploadListener) {
    }

    public void unRegister(String str) {
    }

    public SobotUploadTask(SobotProgress sobotProgress) {
    }
}
