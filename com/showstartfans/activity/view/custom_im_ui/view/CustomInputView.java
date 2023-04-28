package com.showstartfans.activity.view.custom_im_ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.showstartfans.activity.model.EmojiBean;
import com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit;
import com.tencent.qcloud.tuikit.tuichat.bean.ReplyPreviewBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.input.TIMMentionEditText;
import h.u.a.u.y3.m.a;
import java.util.Comparator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CustomInputView extends InputView {
    private LinearLayout b;
    private LinearLayout c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f7178d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f7179e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7180f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7181g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7182h;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ CustomInputView b;

        public a(CustomInputView customInputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomInputView f7183a;

        public b(CustomInputView customInputView) {
        }

        @Override // h.u.a.u.y3.m.a.f
        public void a(EmojiBean emojiBean) {
        }

        @Override // h.u.a.u.y3.m.a.f
        public void b() {
        }

        @Override // h.u.a.u.y3.m.a.f
        public void c(int i2, EmojiBean emojiBean) {
        }

        @Override // h.u.a.u.y3.m.a.f
        public void onEmojiDelete() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class c implements Runnable {
        public final /* synthetic */ CustomInputView b;

        public c(CustomInputView customInputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class d extends InputMoreActionUnit {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomInputView f7184a;

        public d(CustomInputView customInputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit
        public void onAction(String str, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e extends InputMoreActionUnit {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomInputView f7185a;

        public e(CustomInputView customInputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit
        public void onAction(String str, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class f extends InputMoreActionUnit {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomInputView f7186a;

        public f(CustomInputView customInputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit
        public void onAction(String str, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class g extends InputMoreActionUnit {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CustomInputView f7187a;

        public g(CustomInputView customInputView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit
        public void onAction(String str, int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class h implements Comparator<InputMoreActionUnit> {
        public final /* synthetic */ CustomInputView b;

        public h(CustomInputView customInputView) {
        }

        public int a(InputMoreActionUnit inputMoreActionUnit, InputMoreActionUnit inputMoreActionUnit2) {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(InputMoreActionUnit inputMoreActionUnit, InputMoreActionUnit inputMoreActionUnit2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class i implements Runnable {
        public final /* synthetic */ CustomInputView b;

        public i(CustomInputView customInputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class j implements Runnable {
        public final /* synthetic */ CustomInputView b;

        public j(CustomInputView customInputView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public CustomInputView(Context context) {
    }

    public static /* synthetic */ TIMMentionEditText a(CustomInputView customInputView) {
    }

    public static /* synthetic */ TIMMentionEditText b(CustomInputView customInputView) {
    }

    public static /* synthetic */ void c(CustomInputView customInputView) {
    }

    public static /* synthetic */ InputView.ChatInputHandler d(CustomInputView customInputView) {
    }

    public static /* synthetic */ void e(CustomInputView customInputView) {
    }

    public static /* synthetic */ ImageView f(CustomInputView customInputView) {
    }

    public static /* synthetic */ ImageView g(CustomInputView customInputView) {
    }

    public static /* synthetic */ Button h(CustomInputView customInputView) {
    }

    public static /* synthetic */ void i(CustomInputView customInputView, boolean z) {
    }

    public static /* synthetic */ TIMMentionEditText j(CustomInputView customInputView) {
    }

    public static /* synthetic */ InputView.ChatInputHandler k(CustomInputView customInputView) {
    }

    public static /* synthetic */ TIMMentionEditText l(CustomInputView customInputView) {
    }

    public static /* synthetic */ TIMMentionEditText m(CustomInputView customInputView) {
    }

    public static /* synthetic */ TIMMentionEditText n(CustomInputView customInputView) {
    }

    public static /* synthetic */ TIMMentionEditText o(CustomInputView customInputView) {
    }

    public static /* synthetic */ TIMMentionEditText p(CustomInputView customInputView) {
    }

    public static /* synthetic */ InputView.MessageHandler q(CustomInputView customInputView) {
    }

    public static /* synthetic */ InputView.ChatInputHandler r(CustomInputView customInputView) {
    }

    public static /* synthetic */ void s(CustomInputView customInputView) {
    }

    private void x(boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void assembleActions() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void initViews() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView, android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void onEmptyClick() {
    }

    public void setInputMode_Text(boolean z) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void showFaceViewGroup() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void showInputMoreLayout() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void showReplyPreview(ReplyPreviewBean replyPreviewBean) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void showSoftInput() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void startCapture() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.ui.view.input.InputView
    public void startSendPhoto() {
    }

    public void t() {
    }

    public void u(TUIMessageBean tUIMessageBean) {
    }

    public void v(boolean z, String str) {
    }

    public void w() {
    }

    public void y(boolean z, boolean z2, boolean z3) {
    }

    public CustomInputView(Context context, @Nullable AttributeSet attributeSet) {
    }

    public CustomInputView(Context context, @Nullable AttributeSet attributeSet, int i2) {
    }
}
