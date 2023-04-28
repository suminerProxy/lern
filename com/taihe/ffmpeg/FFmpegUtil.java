package com.taihe.ffmpeg;

import android.os.Handler;
import android.os.Message;
import com.taihe.ffmpeg.FFmpegCmd;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FFmpegUtil implements Handler.Callback {
    private static final int MSG_ON_CANCEL_FINISH = 5;
    private static final int MSG_ON_COMPLETE = 4;
    private static final int MSG_ON_ERROR = 257;
    private static final int MSG_ON_FAILURE = 2;
    private static final int MSG_ON_PROGRESS = 3;
    private static final int MSG_ON_START = 1;
    private static final String TAG = "FFmpegUtil";
    private static volatile FFmpegUtil mInstance;
    private boolean isRunning;
    private LinkedBlockingQueue<FFmepgTask> mAsynTaskQueue;
    private onCallBack mCallbackListener;
    private FFmepgTask mCurrentTask;
    private Handler mHandler;
    private Object mLock;
    private Runnable mReadThread;
    private ExecutorService mThreadPoolService;

    /* renamed from: com.taihe.ffmpeg.FFmpegUtil$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements FFmpegCmd.OnCmdExecListener {
        public final /* synthetic */ FFmpegUtil this$0;

        public AnonymousClass1(final FFmpegUtil this$0) {
        }

        @Override // com.taihe.ffmpeg.FFmpegCmd.OnCmdExecListener
        public void onCancelFinish() {
        }

        @Override // com.taihe.ffmpeg.FFmpegCmd.OnCmdExecListener
        public void onComplete() {
        }

        @Override // com.taihe.ffmpeg.FFmpegCmd.OnCmdExecListener
        public void onFailure() {
        }

        @Override // com.taihe.ffmpeg.FFmpegCmd.OnCmdExecListener
        public void onProgress(float progress) {
        }

        @Override // com.taihe.ffmpeg.FFmpegCmd.OnCmdExecListener
        public void onStart() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface onCallBack {
        void onComplete();

        void onFailure();

        void onProgress(float progress);

        void onStart();
    }

    private FFmpegUtil() {
    }

    private /* synthetic */ void a() {
    }

    public static /* synthetic */ Handler access$000(FFmpegUtil fFmpegUtil) {
    }

    private void exec(String[] cmds, long duration, onCallBack listener) {
    }

    public static FFmpegUtil getInstance() {
    }

    public /* synthetic */ void b() {
    }

    public void enQueueTask(String[] cmds, long duration, onCallBack listener) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
    }

    public void onDestroy() {
    }

    public void stopTask() {
    }

    private void exec(String[] cmds, onCallBack listener) {
    }
}
