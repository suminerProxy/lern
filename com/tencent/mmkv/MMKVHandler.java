package com.tencent.mmkv;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface MMKVHandler {
    void mmkvLog(MMKVLogLevel level, String file, int line, String function, String message);

    MMKVRecoverStrategic onMMKVCRCCheckFail(String mmapID);

    MMKVRecoverStrategic onMMKVFileLengthError(String mmapID);

    boolean wantLogRedirecting();
}
