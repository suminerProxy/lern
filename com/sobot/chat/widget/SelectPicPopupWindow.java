package com.sobot.chat.widget;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import com.sobot.chat.widget.zxing.Result;
import java.io.File;

@SuppressLint({"ViewConstructor"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SelectPicPopupWindow extends PopupWindow {
    private Context context;
    private String imgUrl;
    private LayoutInflater inflater;
    private View mView;
    private Result[] result;
    private View.OnClickListener savePictureOnClick;
    private Button sobot_btn_cancel;
    private Button sobot_btn_scan_qr_code;
    private Button sobot_btn_take_photo;
    private String type;
    private String uid;

    /* renamed from: com.sobot.chat.widget.SelectPicPopupWindow$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ SelectPicPopupWindow this$0;

        /* renamed from: com.sobot.chat.widget.SelectPicPopupWindow$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class RunnableC01461 implements Runnable {
            public final /* synthetic */ AnonymousClass1 this$1;

            public RunnableC01461(AnonymousClass1 anonymousClass1) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass1(SelectPicPopupWindow selectPicPopupWindow) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.sobot.chat.widget.SelectPicPopupWindow$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnTouchListener {
        public final /* synthetic */ SelectPicPopupWindow this$0;

        public AnonymousClass2(SelectPicPopupWindow selectPicPopupWindow) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.sobot.chat.widget.SelectPicPopupWindow$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ SelectPicPopupWindow this$0;

        public AnonymousClass3(SelectPicPopupWindow selectPicPopupWindow) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public SelectPicPopupWindow(Activity activity, String str) {
    }

    public static /* synthetic */ Result[] access$000(SelectPicPopupWindow selectPicPopupWindow) {
    }

    public static /* synthetic */ Result[] access$002(SelectPicPopupWindow selectPicPopupWindow, Result[] resultArr) {
    }

    public static /* synthetic */ String access$100(SelectPicPopupWindow selectPicPopupWindow) {
    }

    public static /* synthetic */ Button access$200(SelectPicPopupWindow selectPicPopupWindow) {
    }

    public static /* synthetic */ Context access$300(SelectPicPopupWindow selectPicPopupWindow) {
    }

    public static /* synthetic */ View access$400(SelectPicPopupWindow selectPicPopupWindow) {
    }

    public static /* synthetic */ Button access$500(SelectPicPopupWindow selectPicPopupWindow) {
    }

    public static /* synthetic */ String access$600(SelectPicPopupWindow selectPicPopupWindow) {
    }

    public static /* synthetic */ Button access$700(SelectPicPopupWindow selectPicPopupWindow) {
    }

    private void initView() {
    }

    private void showHint(String str) {
    }

    public boolean fileChannelCopy(File file, File file2) {
    }

    public boolean isSdCardExist() {
    }

    public void notifyUpdatePic(File file, String str) {
    }

    public void saveImageToGallery(Context context, Bitmap bitmap) {
    }

    public SelectPicPopupWindow(Activity activity, String str, String str2) {
    }

    public SelectPicPopupWindow(Activity activity, String str, String str2, boolean z) {
    }

    public void saveImageToGallery(Context context, String str) {
    }
}
