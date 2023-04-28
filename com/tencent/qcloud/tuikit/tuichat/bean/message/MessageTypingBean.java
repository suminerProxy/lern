package com.tencent.qcloud.tuikit.tuichat.bean.message;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuikit.tuichat.bean.MessageTyping;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatLog;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageTypingBean extends TUIMessageBean {
    private MessageTyping messageTyping;

    public int getTypingStatus() {
        MessageTyping messageTyping = this.messageTyping;
        if (messageTyping != null) {
            return messageTyping.typingStatus;
        }
        return 0;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public String onGetDisplayString() {
        return null;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public void onProcessMessage(V2TIMMessage v2TIMMessage) {
        String str = new String(v2TIMMessage.getCustomElem().getData());
        TUIChatLog.d("messageTypingBean", "data = " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                this.messageTyping = (MessageTyping) new Gson().fromJson(str, (Class<Object>) MessageTyping.class);
            } catch (Exception e2) {
                TUIChatLog.e("messageTyping", "exception e = " + e2);
            }
        }
        if (this.messageTyping == null) {
            TUIChatLog.e("messageTypingBean", "messageTyping is null");
        }
    }
}
