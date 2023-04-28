package com.taihe.ffmpeg;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FFmpegCmd {
    private static final String TAG = "FFmpegCmd";
    private static long sDuration;
    private static OnCmdExecListener sOnCmdExecListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnCmdExecListener {
        void onCancelFinish();

        void onComplete();

        void onFailure();

        void onProgress(float progress);

        void onStart();
    }

    public static native int dump_Rtsp_h265(String input, String output);

    public static native int dump_stream(String input, String output);

    public static native int exec(int argc, String[] argv);

    public static void exec(String[] cmds, long duration, OnCmdExecListener listener) {
    }

    public static native void exit();

    public static native String getFFmpegVersion();

    public static void onCancelFinish() {
    }

    public static void onComplete() {
    }

    public static void onFailure() {
    }

    public static void onProgress(float progress) {
    }

    public static void onStart() {
    }

    public static void exec(String[] cmds, OnCmdExecListener listener) {
    }
}
