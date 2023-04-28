package com.efs.sdk.base.protocol.record;

import com.efs.sdk.base.protocol.AbsLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbsRecordLog extends AbsLog {
    public HashMap<String, Object> dataMap;

    public AbsRecordLog(String str) {
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public int getBodyType() {
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getFilePath() {
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public byte getLogProtocol() {
    }

    public void put(String str, Object obj) {
    }

    public void putMap(Map<String, Object> map) {
    }

    public void putNum(String str, long j2) {
    }

    public void putString(String str, String str2) {
    }

    public void putTimestamp(String str, long j2) {
    }
}
