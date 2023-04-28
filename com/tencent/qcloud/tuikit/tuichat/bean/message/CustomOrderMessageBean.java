package com.tencent.qcloud.tuikit.tuichat.bean.message;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.tencent.imsdk.v2.V2TIMMessage;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuikit.tuichat.R;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.CustomOrderMessageReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.bean.message.reply.TUIReplyQuoteBean;
import com.tencent.qcloud.tuikit.tuichat.util.TUIChatLog;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class CustomOrderMessageBean extends TUIMessageBean {
    private CustomOrderMessage orderMessage;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class CustomOrderMessage implements Serializable {
        public String businessID;
        public String description;
        public String imageUrl;
        public String link;
        public String price;
        public final /* synthetic */ CustomOrderMessageBean this$0;
        public String title;
        public int version;

        public CustomOrderMessage(CustomOrderMessageBean customOrderMessageBean) {
        }
    }

    public String getDescription() {
        CustomOrderMessage customOrderMessage = this.orderMessage;
        return customOrderMessage != null ? customOrderMessage.description : "";
    }

    public String getImageUrl() {
        CustomOrderMessage customOrderMessage = this.orderMessage;
        return customOrderMessage != null ? customOrderMessage.imageUrl : "";
    }

    public String getLink() {
        CustomOrderMessage customOrderMessage = this.orderMessage;
        return customOrderMessage != null ? customOrderMessage.link : "";
    }

    public String getPrice() {
        CustomOrderMessage customOrderMessage = this.orderMessage;
        return customOrderMessage != null ? customOrderMessage.price : "";
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public Class<? extends TUIReplyQuoteBean> getReplyQuoteBeanClass() {
        return CustomOrderMessageReplyQuoteBean.class;
    }

    public String getTitle() {
        CustomOrderMessage customOrderMessage = this.orderMessage;
        return customOrderMessage != null ? customOrderMessage.title : "";
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public String onGetDisplayString() {
        return getExtra();
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.bean.message.TUIMessageBean
    public void onProcessMessage(V2TIMMessage v2TIMMessage) {
        String str = new String(v2TIMMessage.getCustomElem().getData());
        TUIChatLog.d("CustomOrderMessageBean", "data = " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                this.orderMessage = (CustomOrderMessage) new Gson().fromJson(str, (Class<Object>) CustomOrderMessage.class);
            } catch (Exception e2) {
                TUIChatLog.e("CustomOrderMessageBean", "exception e = " + e2);
            }
        }
        if (this.orderMessage != null) {
            setExtra(ServiceInitializer.getAppContext().getString(R.string.custom_msg));
        } else {
            setExtra(ServiceInitializer.getAppContext().getString(R.string.no_support_msg));
        }
    }
}
