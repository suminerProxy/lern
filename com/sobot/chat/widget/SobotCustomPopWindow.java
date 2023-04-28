package com.sobot.chat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.annotation.RequiresApi;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotCustomPopWindow implements PopupWindow.OnDismissListener {
    private static final float DEFAULT_ALPHA = 0.7f;
    private static final String TAG = "SobotCustomPopWindow";
    private boolean enableOutsideTouchDisMiss;
    private int mAnimationStyle;
    private float mBackgroundDrakValue;
    private boolean mClippEnable;
    private View mContentView;
    private Context mContext;
    private int mHeight;
    private boolean mIgnoreCheekPress;
    private int mInputMode;
    private boolean mIsBackgroundDark;
    private boolean mIsFocusable;
    private boolean mIsOutside;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private View.OnTouchListener mOnTouchListener;
    private PopupWindow mPopupWindow;
    private int mResLayoutId;
    private int mSoftInputMode;
    private boolean mTouchable;
    private int mWidth;
    private Window mWindow;
    private boolean widthMatchParent;

    /* renamed from: com.sobot.chat.widget.SobotCustomPopWindow$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnKeyListener {
        public final /* synthetic */ SobotCustomPopWindow this$0;

        public AnonymousClass1(SobotCustomPopWindow sobotCustomPopWindow) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        }
    }

    /* renamed from: com.sobot.chat.widget.SobotCustomPopWindow$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnTouchListener {
        public final /* synthetic */ SobotCustomPopWindow this$0;

        public AnonymousClass2(SobotCustomPopWindow sobotCustomPopWindow) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    public /* synthetic */ SobotCustomPopWindow(Context context, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ PopupWindow access$000(SobotCustomPopWindow sobotCustomPopWindow) {
    }

    public static /* synthetic */ int access$100(SobotCustomPopWindow sobotCustomPopWindow) {
    }

    public static /* synthetic */ boolean access$1002(SobotCustomPopWindow sobotCustomPopWindow, boolean z) {
    }

    public static /* synthetic */ int access$102(SobotCustomPopWindow sobotCustomPopWindow, int i2) {
    }

    public static /* synthetic */ boolean access$1102(SobotCustomPopWindow sobotCustomPopWindow, boolean z) {
    }

    public static /* synthetic */ int access$1202(SobotCustomPopWindow sobotCustomPopWindow, int i2) {
    }

    public static /* synthetic */ PopupWindow.OnDismissListener access$1302(SobotCustomPopWindow sobotCustomPopWindow, PopupWindow.OnDismissListener onDismissListener) {
    }

    public static /* synthetic */ int access$1402(SobotCustomPopWindow sobotCustomPopWindow, int i2) {
    }

    public static /* synthetic */ boolean access$1502(SobotCustomPopWindow sobotCustomPopWindow, boolean z) {
    }

    public static /* synthetic */ View.OnTouchListener access$1602(SobotCustomPopWindow sobotCustomPopWindow, View.OnTouchListener onTouchListener) {
    }

    public static /* synthetic */ boolean access$1702(SobotCustomPopWindow sobotCustomPopWindow, boolean z) {
    }

    public static /* synthetic */ float access$1802(SobotCustomPopWindow sobotCustomPopWindow, float f2) {
    }

    public static /* synthetic */ boolean access$1902(SobotCustomPopWindow sobotCustomPopWindow, boolean z) {
    }

    public static /* synthetic */ int access$200(SobotCustomPopWindow sobotCustomPopWindow) {
    }

    public static /* synthetic */ PopupWindow access$2000(SobotCustomPopWindow sobotCustomPopWindow) {
    }

    public static /* synthetic */ int access$202(SobotCustomPopWindow sobotCustomPopWindow, int i2) {
    }

    public static /* synthetic */ boolean access$402(SobotCustomPopWindow sobotCustomPopWindow, boolean z) {
    }

    public static /* synthetic */ boolean access$502(SobotCustomPopWindow sobotCustomPopWindow, boolean z) {
    }

    public static /* synthetic */ int access$602(SobotCustomPopWindow sobotCustomPopWindow, int i2) {
    }

    public static /* synthetic */ View access$702(SobotCustomPopWindow sobotCustomPopWindow, View view) {
    }

    public static /* synthetic */ boolean access$802(SobotCustomPopWindow sobotCustomPopWindow, boolean z) {
    }

    public static /* synthetic */ int access$902(SobotCustomPopWindow sobotCustomPopWindow, int i2) {
    }

    private void apply(PopupWindow popupWindow) {
    }

    private PopupWindow build() {
    }

    public void dissmiss() {
    }

    public int getHeight() {
    }

    public PopupWindow getPopupWindow() {
    }

    public int getWidth() {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
    }

    public SobotCustomPopWindow showAsDropDown(View view, int i2, int i3) {
    }

    public SobotCustomPopWindow showAtLocation(View view, int i2, int i3, int i4) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static class PopupWindowBuilder {
        private SobotCustomPopWindow mCustomPopWindow;

        public PopupWindowBuilder(Context context) {
        }

        public SobotCustomPopWindow create() {
        }

        public PopupWindowBuilder enableBackgroundDark(boolean z) {
        }

        public PopupWindowBuilder enableOutsideTouchableDissmiss(boolean z) {
        }

        public PopupWindowBuilder setAnimationStyle(int i2) {
        }

        public PopupWindowBuilder setBgDarkAlpha(float f2) {
        }

        public PopupWindowBuilder setClippingEnable(boolean z) {
        }

        public PopupWindowBuilder setFocusable(boolean z) {
        }

        public PopupWindowBuilder setIgnoreCheekPress(boolean z) {
        }

        public PopupWindowBuilder setInputMethodMode(int i2) {
        }

        public PopupWindowBuilder setOnDissmissListener(PopupWindow.OnDismissListener onDismissListener) {
        }

        public PopupWindowBuilder setOutsideTouchable(boolean z) {
        }

        public PopupWindowBuilder setSoftInputMode(int i2) {
        }

        public PopupWindowBuilder setTouchIntercepter(View.OnTouchListener onTouchListener) {
        }

        public PopupWindowBuilder setTouchable(boolean z) {
        }

        public PopupWindowBuilder setView(int i2) {
        }

        public PopupWindowBuilder setWidthMatchParent(boolean z) {
        }

        public PopupWindowBuilder size(int i2, int i3) {
        }

        public PopupWindowBuilder setView(View view) {
        }
    }

    private SobotCustomPopWindow(Context context) {
    }

    public SobotCustomPopWindow showAsDropDown(View view) {
    }

    @RequiresApi(api = 19)
    public SobotCustomPopWindow showAsDropDown(View view, int i2, int i3, int i4) {
    }
}
