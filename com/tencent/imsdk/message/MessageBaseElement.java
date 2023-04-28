package com.tencent.imsdk.message;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageBaseElement implements Serializable {
    public static int UUID_TYPE_AUDIO = 3;
    public static int UUID_TYPE_FILE = 1;
    public static int UUID_TYPE_VIDEO = 2;
    public static int UUID_TYPE_VIDEO_THUMB;
    public int elementType;

    public int getElementType() {
        return this.elementType;
    }

    public void setElementType(int i2) {
        this.elementType = i2;
    }

    public boolean update(MessageBaseElement messageBaseElement) {
        return false;
    }
}
