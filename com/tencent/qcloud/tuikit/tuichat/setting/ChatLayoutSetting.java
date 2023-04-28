package com.tencent.qcloud.tuikit.tuichat.setting;

import android.content.Context;
import com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit;
import com.tencent.qcloud.tuikit.tuichat.ui.view.ChatView;
import com.tencent.qcloud.tuikit.tuichat.ui.view.message.MessageRecyclerView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ChatLayoutSetting {
    private static final String TAG = "ChatLayoutSetting";
    private String groupId;
    private Context mContext;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.setting.ChatLayoutSetting$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 extends InputMoreActionUnit {
        public final /* synthetic */ ChatLayoutSetting this$0;

        public AnonymousClass1(ChatLayoutSetting chatLayoutSetting) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.setting.ChatLayoutSetting$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 extends InputMoreActionUnit.OnActionClickListener {
        public final /* synthetic */ ChatLayoutSetting this$0;
        public final /* synthetic */ ChatView val$layout;

        public AnonymousClass2(ChatLayoutSetting chatLayoutSetting, InputMoreActionUnit inputMoreActionUnit, ChatView chatView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.bean.InputMoreActionUnit.OnActionClickListener
        public void onClick() {
        }
    }

    public ChatLayoutSetting(Context context) {
    }

    public void customizeChatLayout(ChatView chatView) {
    }

    public void customizeMessageLayout(MessageRecyclerView messageRecyclerView) {
    }

    public void setGroupId(String str) {
    }
}
