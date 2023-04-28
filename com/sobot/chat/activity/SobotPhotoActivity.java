package com.sobot.chat.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.sobot.chat.core.HttpUtils;
import com.sobot.chat.widget.RoundProgressBar;
import com.sobot.chat.widget.SelectPicPopupWindow;
import com.sobot.chat.widget.gif.GifView2;
import com.sobot.chat.widget.subscaleview.SobotScaleImageView;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotPhotoActivity extends Activity implements View.OnLongClickListener {
    public Bitmap bitmap;
    private View.OnLongClickListener gifLongClickListener;
    public String imageUrL;
    public boolean isRight;
    private SobotScaleImageView mImageView;
    private SelectPicPopupWindow menuWindow;
    public String sdCardPath;
    private GifView2 sobot_image_view;
    private RoundProgressBar sobot_progress;
    private RelativeLayout sobot_rl_gif;

    /* renamed from: com.sobot.chat.activity.SobotPhotoActivity$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ SobotPhotoActivity this$0;

        public AnonymousClass1(SobotPhotoActivity sobotPhotoActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotPhotoActivity$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements GifView2.LoadFinishListener {
        public final /* synthetic */ SobotPhotoActivity this$0;

        public AnonymousClass2(SobotPhotoActivity sobotPhotoActivity) {
        }

        @Override // com.sobot.chat.widget.gif.GifView2.LoadFinishListener
        public void endCallBack(String str) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotPhotoActivity$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SobotPhotoActivity this$0;

        public AnonymousClass3(SobotPhotoActivity sobotPhotoActivity) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotPhotoActivity$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass4 implements View.OnLongClickListener {
        public final /* synthetic */ SobotPhotoActivity this$0;

        public AnonymousClass4(SobotPhotoActivity sobotPhotoActivity) {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.activity.SobotPhotoActivity$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass5 implements HttpUtils.FileCallBack {
        public final /* synthetic */ SobotPhotoActivity this$0;

        public AnonymousClass5(SobotPhotoActivity sobotPhotoActivity) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void inProgress(int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onError(Exception exc, String str, int i2) {
        }

        @Override // com.sobot.chat.core.HttpUtils.FileCallBack
        public void onResponse(File file) {
        }
    }

    public static /* synthetic */ SobotScaleImageView access$000(SobotPhotoActivity sobotPhotoActivity) {
    }

    public static /* synthetic */ SelectPicPopupWindow access$100(SobotPhotoActivity sobotPhotoActivity) {
    }

    public static /* synthetic */ SelectPicPopupWindow access$102(SobotPhotoActivity sobotPhotoActivity, SelectPicPopupWindow selectPicPopupWindow) {
    }

    public static /* synthetic */ RelativeLayout access$200(SobotPhotoActivity sobotPhotoActivity) {
    }

    public static /* synthetic */ RoundProgressBar access$300(SobotPhotoActivity sobotPhotoActivity) {
    }

    private void initBundleData(Bundle bundle) {
    }

    private void showGif(String str) {
    }

    public void displayImage(String str, File file, GifView2 gifView2) {
    }

    public File getFilesDir(Context context, String str) {
    }

    public File getImageDir(Context context) {
    }

    public boolean isSdCardExist() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    @Override // android.app.Activity
    public void onDestroy() {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
    }

    public void showView(String str) {
    }
}
