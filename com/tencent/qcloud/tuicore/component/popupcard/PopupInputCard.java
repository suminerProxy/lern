package com.tencent.qcloud.tuicore.component.popupcard;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PopupInputCard {
    private View closeBtn;
    private TextView descriptionTv;
    private EditText editText;
    private ByteLengthFilter lengthFilter;
    private int maxLimit;
    private int minLimit;
    private String notMachRuleTip;
    private PopupWindow popupWindow;
    private Button positiveBtn;
    private OnClickListener positiveOnClickListener;
    private String rule;
    private OnTextExceedListener textExceedListener;
    private TextView titleTv;

    /* renamed from: com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends PopupWindow {
        public final /* synthetic */ PopupInputCard this$0;
        public final /* synthetic */ Activity val$activity;

        public AnonymousClass1(PopupInputCard popupInputCard, View view, int i2, int i3, boolean z, Activity activity) {
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
        }

        @Override // android.widget.PopupWindow
        public void showAtLocation(View view, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements PopupWindow.OnDismissListener {
        public final /* synthetic */ PopupInputCard this$0;
        public final /* synthetic */ Activity val$activity;

        public AnonymousClass2(PopupInputCard popupInputCard, Activity activity) {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public final /* synthetic */ PopupInputCard this$0;

        public AnonymousClass3(PopupInputCard popupInputCard) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public final /* synthetic */ PopupInputCard this$0;

        public AnonymousClass4(PopupInputCard popupInputCard) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements TextWatcher {
        public final /* synthetic */ PopupInputCard this$0;

        public AnonymousClass5(PopupInputCard popupInputCard) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuicore.component.popupcard.PopupInputCard$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ PopupInputCard this$0;
        public final /* synthetic */ Window val$window;

        public AnonymousClass6(PopupInputCard popupInputCard, Window window) {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class ByteLengthFilter implements InputFilter {
        private int length;
        public final /* synthetic */ PopupInputCard this$0;

        public ByteLengthFilter(PopupInputCard popupInputCard) {
        }

        private CharSequence getSource(CharSequence charSequence, int i2, int i3) {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        }

        public void setLength(int i2) {
        }
    }

    @FunctionalInterface
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnClickListener {
        void onClick(String str);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnTextExceedListener {
        void onTextExceedMax();
    }

    public PopupInputCard(Activity activity) {
    }

    public static /* synthetic */ void access$000(PopupInputCard popupInputCard, Window window, boolean z) {
    }

    public static /* synthetic */ EditText access$100(PopupInputCard popupInputCard) {
    }

    public static /* synthetic */ int access$200(PopupInputCard popupInputCard) {
    }

    public static /* synthetic */ int access$300(PopupInputCard popupInputCard) {
    }

    public static /* synthetic */ String access$400(PopupInputCard popupInputCard) {
    }

    public static /* synthetic */ String access$500(PopupInputCard popupInputCard) {
    }

    public static /* synthetic */ OnClickListener access$600(PopupInputCard popupInputCard) {
    }

    public static /* synthetic */ PopupWindow access$700(PopupInputCard popupInputCard) {
    }

    public static /* synthetic */ Button access$800(PopupInputCard popupInputCard) {
    }

    public static /* synthetic */ OnTextExceedListener access$900(PopupInputCard popupInputCard) {
    }

    private void startAnimation(Window window, boolean z) {
    }

    public void setContent(String str) {
    }

    public void setDescription(String str) {
    }

    public void setMaxLimit(int i2) {
    }

    public void setMinLimit(int i2) {
    }

    public void setNotMachRuleTip(String str) {
    }

    public void setOnPositive(OnClickListener onClickListener) {
    }

    public void setRule(String str) {
    }

    public void setSingleLine(boolean z) {
    }

    public void setTextExceedListener(OnTextExceedListener onTextExceedListener) {
    }

    public void setTitle(String str) {
    }

    public void show(View view, int i2) {
    }
}
