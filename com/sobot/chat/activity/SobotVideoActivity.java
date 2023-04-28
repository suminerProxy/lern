package com.sobot.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.sobot.chat.api.model.SobotCacheFile;
import com.sobot.chat.camera.StVideoView;
import com.sobot.chat.camera.listener.StVideoListener;
import com.sobot.network.http.download.SobotDownloadListener;
import com.sobot.network.http.download.SobotDownloadTask;
import com.sobot.network.http.model.SobotProgress;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotVideoActivity extends FragmentActivity implements View.OnClickListener {
    public static final int ACTION_TYPE_PHOTO = 0;
    public static final int ACTION_TYPE_VIDEO = 1;
    private static final String EXTRA_IMAGE_FILE_PATH = "EXTRA_IMAGE_FILE_PATH";
    private static final String EXTRA_VIDEO_FILE_DATA = "EXTRA_VIDEO_FILE_DATA";
    private static final String EXTRA_VIDEO_FILE_PATH = "EXTRA_VIDEO_FILE_PATH";
    private static final int RESULT_CODE = 103;
    private static final String SOBOT_TAG_DOWNLOAD_ACT_VIDEO = "SOBOT_TAG_DOWNLOAD_ACT_VIDEO";
    private SobotCacheFile mCacheFile;
    private SobotDownloadListener mDownloadListener;
    private SobotDownloadTask mTask;
    private StVideoView mVideoView;
    private ProgressBar progressBar;
    private ImageView st_iv_pic;
    private TextView st_tv_play;

    /* renamed from: com.sobot.chat.activity.SobotVideoActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends SobotDownloadListener {
        public final /* synthetic */ SobotVideoActivity this$0;

        public AnonymousClass1(SobotVideoActivity sobotVideoActivity, Object obj) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public void onError(SobotProgress sobotProgress) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public /* bridge */ /* synthetic */ void onFinish(File file, SobotProgress sobotProgress) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public void onProgress(SobotProgress sobotProgress) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public void onRemove(SobotProgress sobotProgress) {
        }

        @Override // com.sobot.network.http.upload.ProgressListener
        public void onStart(SobotProgress sobotProgress) {
        }

        /* renamed from: onFinish  reason: avoid collision after fix types in other method */
        public void onFinish2(File file, SobotProgress sobotProgress) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotVideoActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements StVideoListener {
        public final /* synthetic */ SobotVideoActivity this$0;

        public AnonymousClass2(SobotVideoActivity sobotVideoActivity) {
        }

        @Override // com.sobot.chat.camera.listener.StVideoListener
        public void onCancel() {
        }

        @Override // com.sobot.chat.camera.listener.StVideoListener
        public void onEnd() {
        }

        @Override // com.sobot.chat.camera.listener.StVideoListener
        public void onError() {
        }

        @Override // com.sobot.chat.camera.listener.StVideoListener
        public void onStart() {
        }
    }

    public static /* synthetic */ void access$000(SobotVideoActivity sobotVideoActivity, SobotProgress sobotProgress) {
    }

    public static /* synthetic */ TextView access$100(SobotVideoActivity sobotVideoActivity) {
    }

    public static /* synthetic */ void access$200(SobotVideoActivity sobotVideoActivity) {
    }

    private void downloadFile(SobotProgress sobotProgress) {
    }

    private void initData() {
    }

    public static Intent newIntent(Context context, SobotCacheFile sobotCacheFile) {
    }

    private void refreshUI(SobotProgress sobotProgress) {
    }

    private void restoreTask() {
    }

    private void showErrorUi() {
    }

    private void showFinishUi(String str) {
    }

    private void showLoadingUi(float f2, long j2, long j3) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
    }
}
