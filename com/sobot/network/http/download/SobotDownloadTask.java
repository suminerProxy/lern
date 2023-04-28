package com.sobot.network.http.download;

import com.sobot.network.http.model.SobotProgress;
import com.sobot.network.http.request.RequestCall;
import com.sobot.network.http.task.PriorityRunnable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotDownloadTask implements Runnable {
    private static final int BUFFER_SIZE = 8192;
    private ThreadPoolExecutor executor;
    public Map<Object, SobotDownloadListener> listeners;
    private PriorityRunnable priorityRunnable;
    public SobotProgress progress;

    /* renamed from: com.sobot.network.http.download.SobotDownloadTask$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements SobotProgress.Action {
        public final /* synthetic */ SobotDownloadTask this$0;

        public AnonymousClass1(SobotDownloadTask sobotDownloadTask) {
        }

        @Override // com.sobot.network.http.model.SobotProgress.Action
        public void call(SobotProgress sobotProgress) {
        }
    }

    /* renamed from: com.sobot.network.http.download.SobotDownloadTask$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ SobotDownloadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass2(SobotDownloadTask sobotDownloadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.download.SobotDownloadTask$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ SobotDownloadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass3(SobotDownloadTask sobotDownloadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.download.SobotDownloadTask$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ SobotDownloadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass4(SobotDownloadTask sobotDownloadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.download.SobotDownloadTask$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ SobotDownloadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass5(SobotDownloadTask sobotDownloadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.download.SobotDownloadTask$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass6 implements Runnable {
        public final /* synthetic */ SobotDownloadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass6(SobotDownloadTask sobotDownloadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.download.SobotDownloadTask$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ SobotDownloadTask this$0;
        public final /* synthetic */ File val$file;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass7(SobotDownloadTask sobotDownloadTask, SobotProgress sobotProgress, File file) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.network.http.download.SobotDownloadTask$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass8 implements Runnable {
        public final /* synthetic */ SobotDownloadTask this$0;
        public final /* synthetic */ SobotProgress val$progress;

        public AnonymousClass8(SobotDownloadTask sobotDownloadTask, SobotProgress sobotProgress) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public SobotDownloadTask(String str, RequestCall requestCall) {
    }

    public static /* synthetic */ void access$000(SobotDownloadTask sobotDownloadTask, SobotProgress sobotProgress) {
    }

    private void download(InputStream inputStream, RandomAccessFile randomAccessFile, SobotProgress sobotProgress) throws IOException {
    }

    private void postLoading(SobotProgress sobotProgress) {
    }

    private void postOnError(SobotProgress sobotProgress, Throwable th) {
    }

    private void postOnFinish(SobotProgress sobotProgress, File file) {
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

    public SobotDownloadTask fileName(String str) {
    }

    public SobotDownloadTask folder(String str) {
    }

    public void pause() {
    }

    public SobotDownloadTask priority(int i2) {
    }

    public SobotDownloadTask register(SobotDownloadListener sobotDownloadListener) {
    }

    public void remove() {
    }

    public void restart() {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public SobotDownloadTask save() {
    }

    public void start() {
    }

    public void unRegister(SobotDownloadListener sobotDownloadListener) {
    }

    public SobotDownloadTask remove(boolean z) {
    }

    public void unRegister(String str) {
    }

    public SobotDownloadTask(SobotProgress sobotProgress) {
    }
}
