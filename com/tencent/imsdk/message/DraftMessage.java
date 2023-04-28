package com.tencent.imsdk.message;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class DraftMessage implements Serializable {
    private long editTime;
    private Message message;
    private byte[] userDefinedData;

    public long getEditTime() {
        return this.editTime;
    }

    public byte[] getUserDefinedData() {
        return this.userDefinedData;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setUserDefinedData(byte[] bArr) {
        this.userDefinedData = bArr;
    }
}
