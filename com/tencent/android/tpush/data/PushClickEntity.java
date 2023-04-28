package com.tencent.android.tpush.data;

import java.io.Serializable;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class PushClickEntity implements Serializable {
    private static final long serialVersionUID = -166678396447407161L;
    public long accessId;
    public int action;
    public long broadcastId;
    public long clickTime;
    public String groupId;
    public long msgId;
    public String pkgName;
    public long timestamp;
    public long type;

    public PushClickEntity() {
    }

    public PushClickEntity(long j2, long j3, long j4, long j5, String str, long j6, long j7, int i2, String str2) {
    }
}
