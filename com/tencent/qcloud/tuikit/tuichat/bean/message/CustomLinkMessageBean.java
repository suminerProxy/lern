package com.tencent.qcloud.tuikit.tuichat.bean.message;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.CustomHelloMessage;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.CustomLinkReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatLog;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomLinkMessageBean extends TUIMessageBean {
    private CustomHelloMessage customHelloMessage;

    public String getLink() {
        CustomHelloMessage customHelloMessage = this.customHelloMessage;
        return customHelloMessage != null ? customHelloMessage.link : "";
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public Class<? extends TUIReplyQuoteBean> getReplyQuoteBeanClass() {
        return CustomLinkReplyQuoteBean.class;
    }

    public String getText() {
        CustomHelloMessage customHelloMessage = this.customHelloMessage;
        if (customHelloMessage != null) {
            return customHelloMessage.text;
        }
        return getExtra();
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public String onGetDisplayString() {
        return getText();
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public void onProcessMessage(V2TIMMessage v2TIMMessage) {
        String str = new String(v2TIMMessage.getCustomElem().getData());
        if (!TextUtils.isEmpty(str)) {
            try {
                this.customHelloMessage = (CustomHelloMessage) new Gson().fromJson(str, (Class<Object>) CustomHelloMessage.class);
            } catch (Exception e2) {
                TUIChatLog.e("CustomLinkMessageBean", "exception e = " + e2);
            }
        }
        CustomHelloMessage customHelloMessage = this.customHelloMessage;
        if (customHelloMessage != null) {
            setExtra(customHelloMessage.text);
        } else {
            setExtra(ServiceInitializer.getAppContext().getString(R.string.no_support_msg));
        }
    }
}
