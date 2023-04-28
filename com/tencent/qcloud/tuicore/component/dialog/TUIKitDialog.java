package com.tencent.qcloud.tuicore.component.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.method.MovementMethod;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIKitDialog {
    public Dialog dialog;
    private float dialogWidth;
    private LinearLayout mBackgroundLayout;
    private Button mCancelButton;
    private Context mContext;
    private Display mDisplay;
    private ImageView mLineImg;
    private LinearLayout mMainLayout;
    private Button mSureButton;
    public TextView mTitleTv;
    private boolean showNegBtn;
    private boolean showPosBtn;
    private boolean showTitle;

    /* renamed from: com.tencent.qcloud.tuicore.component.dialog.TUIKitDialog$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ TUIKitDialog this$0;
        public final /* synthetic */ View.OnClickListener val$listener;

        public AnonymousClass1(TUIKitDialog tUIKitDialog, View.OnClickListener onClickListener) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.dialog.TUIKitDialog$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ TUIKitDialog this$0;
        public final /* synthetic */ View.OnClickListener val$listener;

        public AnonymousClass2(TUIKitDialog tUIKitDialog, View.OnClickListener onClickListener) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.dialog.TUIKitDialog$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ TUIKitDialog this$0;

        public AnonymousClass3(TUIKitDialog tUIKitDialog) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TUIIMUpdateDialog {
        public static final String KEY_NEVER_SHOW = "neverShow";
        private String dialogFeatureName;
        private boolean isNeverShow;
        private boolean isShowOnlyDebug;
        private WeakReference<TUIKitDialog> tuiKitDialog;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class TUIIMUpdateDialogHolder {
            private static final TUIIMUpdateDialog instance = null;

            private TUIIMUpdateDialogHolder() {
            }

            public static /* synthetic */ TUIIMUpdateDialog access$100() {
            }
        }

        public /* synthetic */ TUIIMUpdateDialog(AnonymousClass1 anonymousClass1) {
        }

        private String getDialogFeatureName() {
        }

        public static TUIIMUpdateDialog getInstance() {
        }

        public TUIIMUpdateDialog createDialog(Context context) {
        }

        public void dismiss() {
        }

        public TUIIMUpdateDialog setCancelOutside(boolean z) {
        }

        public TUIIMUpdateDialog setCancelable(boolean z) {
        }

        public TUIIMUpdateDialog setDialogFeatureName(String str) {
        }

        public TUIIMUpdateDialog setDialogWidth(float f2) {
        }

        public TUIIMUpdateDialog setHighlightColor(int i2) {
        }

        public TUIIMUpdateDialog setMovementMethod(MovementMethod movementMethod) {
        }

        public TUIIMUpdateDialog setNegativeButton(CharSequence charSequence, View.OnClickListener onClickListener) {
        }

        public void setNeverShow(boolean z) {
        }

        public TUIIMUpdateDialog setPositiveButton(CharSequence charSequence, View.OnClickListener onClickListener) {
        }

        public TUIIMUpdateDialog setShowOnlyDebug(boolean z) {
        }

        public TUIIMUpdateDialog setTitle(CharSequence charSequence) {
        }

        public void show() {
        }

        private TUIIMUpdateDialog() {
        }
    }

    public TUIKitDialog(Context context) {
    }

    private void setLayout() {
    }

    public TUIKitDialog builder() {
    }

    public void dismiss() {
    }

    public boolean isShowing() {
    }

    public TUIKitDialog setCancelOutside(boolean z) {
    }

    public TUIKitDialog setCancelable(boolean z) {
    }

    public TUIKitDialog setDialogWidth(float f2) {
    }

    public TUIKitDialog setNegativeButton(CharSequence charSequence, View.OnClickListener onClickListener) {
    }

    public TUIKitDialog setPositiveButton(CharSequence charSequence, View.OnClickListener onClickListener) {
    }

    public TUIKitDialog setTitle(@NonNull CharSequence charSequence) {
    }

    public void setTitleGravity(int i2) {
    }

    public void show() {
    }

    public TUIKitDialog setNegativeButton(View.OnClickListener onClickListener) {
    }

    public TUIKitDialog setPositiveButton(View.OnClickListener onClickListener) {
    }
}
