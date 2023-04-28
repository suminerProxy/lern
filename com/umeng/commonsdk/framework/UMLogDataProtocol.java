package com.umeng.commonsdk.framework;

import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface UMLogDataProtocol {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class UMBusinessType {
        private static final /* synthetic */ UMBusinessType[] $VALUES = null;
        public static final UMBusinessType U_APP = null;
        public static final UMBusinessType U_INTERNAL = null;
        public static final UMBusinessType U_Silent = null;
        public static final UMBusinessType U_ZeroEnv = null;

        private UMBusinessType(String str, int i2) {
        }

        public static UMBusinessType valueOf(String str) {
        }

        public static UMBusinessType[] values() {
        }
    }

    void removeCacheData(Object obj);

    JSONObject setupReportData(long j2);

    void workEvent(Object obj, int i2);
}
