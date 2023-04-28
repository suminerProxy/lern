package com.sobot.chat.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ReSendDialog extends Dialog {
    public Button button;
    public Button button2;
    private Context content;
    public OnItemClick mOnItemClick;
    private TextView sobot_message;

    /* renamed from: com.sobot.chat.widget.ReSendDialog$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public final /* synthetic */ ReSendDialog this$0;

        public AnonymousClass1(ReSendDialog reSendDialog) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* renamed from: com.sobot.chat.widget.ReSendDialog$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public final /* synthetic */ ReSendDialog this$0;

        public AnonymousClass2(ReSendDialog reSendDialog) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface OnItemClick {
        void OnClick(int i2);
    }

    public ReSendDialog(Context context) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
    }

    public void setOnClickListener(OnItemClick onItemClick) {
    }
}
