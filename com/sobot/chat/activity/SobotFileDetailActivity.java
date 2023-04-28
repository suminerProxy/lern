package com.sobot.chat.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sobot.chat.activity.base.SobotBaseActivity;
import com.sobot.chat.api.model.SobotCacheFile;
import com.sobot.chat.utils.FileSizeUtil;
import com.sobot.network.http.download.SobotDownloadListener;
import com.sobot.network.http.download.SobotDownloadTask;
import com.sobot.network.http.model.SobotProgress;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotFileDetailActivity extends SobotBaseActivity implements View.OnClickListener {
    private SobotCacheFile mCacheFile;
    private SobotDownloadListener mDownloadListener;
    private String mProgressStr;
    private SobotDownloadTask mTask;
    private TextView sobot_btn_cancel;
    private TextView sobot_btn_start;
    private TextView sobot_file_icon;
    private TextView sobot_file_name;
    private LinearLayout sobot_ll_progress;
    private ProgressBar sobot_pb_progress;
    private TextView sobot_tv_decribe;
    private TextView sobot_tv_file_size;
    private TextView sobot_tv_progress;

    /* renamed from: com.sobot.chat.activity.SobotFileDetailActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 extends SobotDownloadListener {
        public final /* synthetic */ SobotFileDetailActivity this$0;

        public AnonymousClass1(SobotFileDetailActivity sobotFileDetailActivity, Object obj) {
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

    /* renamed from: com.sobot.chat.activity.SobotFileDetailActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements FileSizeUtil.CallBack<String> {
        public final /* synthetic */ SobotFileDetailActivity this$0;

        /* renamed from: com.sobot.chat.activity.SobotFileDetailActivity$2$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass2 this$1;
            public final /* synthetic */ String val$s;

            public AnonymousClass1(AnonymousClass2 anonymousClass2, String str) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass2(SobotFileDetailActivity sobotFileDetailActivity) {
        }

        @Override // com.sobot.chat.utils.FileSizeUtil.CallBack
        public /* bridge */ /* synthetic */ void call(String str) {
        }

        /* renamed from: call  reason: avoid collision after fix types in other method */
        public void call2(String str) {
        }
    }

    public static /* synthetic */ void access$000(SobotFileDetailActivity sobotFileDetailActivity, SobotProgress sobotProgress) {
    }

    public static /* synthetic */ SobotCacheFile access$100(SobotFileDetailActivity sobotFileDetailActivity) {
    }

    public static /* synthetic */ TextView access$200(SobotFileDetailActivity sobotFileDetailActivity) {
    }

    private void refreshUI(SobotProgress sobotProgress) {
    }

    private void restoreTask() {
    }

    private void showCommonUi() {
    }

    private void showFinishUi() {
    }

    private void showLoadingUi(float f2, long j2, long j3) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public int getContentViewResId() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initData() {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity
    public void initView() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.sobot.chat.activity.base.SobotBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }
}
