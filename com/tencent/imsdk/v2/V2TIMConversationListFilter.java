package com.tencent.imsdk.v2;

import com.tencent.imsdk.conversation.ConversationListFilter;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class V2TIMConversationListFilter implements Serializable {
    private ConversationListFilter filter = new ConversationListFilter();

    public ConversationListFilter getConversationFilter() {
        return this.filter;
    }

    public int getCount() {
        return this.filter.getCount();
    }

    public void setConversationType(int i2) {
        this.filter.setConversationType(i2);
    }

    public void setCount(int i2) {
        this.filter.setCount(i2);
    }

    public void setGroupName(String str) {
        this.filter.setGroupName(str);
    }

    public void setMarkType(long j2) {
        this.filter.setMarkType(j2);
    }

    public void setNextSeq(long j2) {
        this.filter.setNextSeq(j2);
    }
}
