package com.tencent.imsdk.conversation;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ConversationListFilter implements Serializable {
    private int conversationType;
    private int count;
    private String groupName;
    private long markType;
    private long nextSeq;

    public int getCount() {
        return this.count;
    }

    public void setConversationType(int i2) {
        this.conversationType = i2;
    }

    public void setCount(int i2) {
        this.count = i2;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setMarkType(long j2) {
        this.markType = j2;
    }

    public void setNextSeq(long j2) {
        this.nextSeq = j2;
    }
}
