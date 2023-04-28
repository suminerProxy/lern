package com.tencent.thumbplayer.api.report;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface ITPBusinessReportManager {
    public static final int EVENT_ID_302_REDIRECT = 1001;
    public static final int EVENT_ID_EARLY_ERROR = 1100;
    public static final int EVENT_ID_GET_CDN_URL = 1000;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface EventId {
    }

    @Deprecated
    void reportEvent(int i2, Map<String, Object> map);

    void setReportInfoGetter(TPDefaultReportInfo tPDefaultReportInfo);
}
