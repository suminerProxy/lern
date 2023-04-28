package com.tencent.qcloud.tuikit.tuichat.bean.message;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.CustomEvaluationMessageReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatLog;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomEvaluationMessageBean extends TUIMessageBean {
    private CustomEvaluationMessage customEvaluationMessage;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class CustomEvaluationMessage implements Serializable {
        public String businessID;
        public String comment;
        public int score;
        public final /* synthetic */ CustomEvaluationMessageBean this$0;
        public int version;

        public CustomEvaluationMessage(CustomEvaluationMessageBean customEvaluationMessageBean) {
        }
    }

    public String getContent() {
        CustomEvaluationMessage customEvaluationMessage = this.customEvaluationMessage;
        return customEvaluationMessage != null ? customEvaluationMessage.comment : "";
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public Class<? extends TUIReplyQuoteBean> getReplyQuoteBeanClass() {
        return CustomEvaluationMessageReplyQuoteBean.class;
    }

    public int getScore() {
        CustomEvaluationMessage customEvaluationMessage = this.customEvaluationMessage;
        if (customEvaluationMessage != null) {
            return customEvaluationMessage.score;
        }
        return 0;
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public String onGetDisplayString() {
        return getExtra();
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public void onProcessMessage(V2TIMMessage v2TIMMessage) {
        String str = new String(v2TIMMessage.getCustomElem().getData());
        TUIChatLog.d("CustomEvaluationMessageBean", "data = " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                this.customEvaluationMessage = (CustomEvaluationMessage) new Gson().fromJson(str, (Class<Object>) CustomEvaluationMessage.class);
            } catch (Exception e2) {
                TUIChatLog.e("CustomEvaluationMessage", "exception e = " + e2);
            }
        }
        if (this.customEvaluationMessage != null) {
            setExtra(ServiceInitializer.getAppContext().getString(R.string.custom_msg));
        } else {
            setExtra(ServiceInitializer.getAppContext().getString(R.string.no_support_msg));
        }
    }
}
