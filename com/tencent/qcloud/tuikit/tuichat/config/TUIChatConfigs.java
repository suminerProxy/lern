package com.tencent.qcloud.tuikit.tuichat.config;

import com.tencent.qcloud.tuikit.tuichat.component.noticelayout.NoticeLayoutConfig;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TUIChatConfigs {
    private static TUIChatConfigs sConfigs;
    private GeneralConfig generalConfig;
    private NoticeLayoutConfig noticeLayoutConfig;

    private TUIChatConfigs() {
    }

    public static TUIChatConfigs getConfigs() {
        if (sConfigs == null) {
            sConfigs = new TUIChatConfigs();
        }
        return sConfigs;
    }

    public GeneralConfig getGeneralConfig() {
        if (this.generalConfig == null) {
            this.generalConfig = new GeneralConfig();
        }
        return this.generalConfig;
    }

    public NoticeLayoutConfig getNoticeLayoutConfig() {
        if (this.noticeLayoutConfig == null) {
            this.noticeLayoutConfig = new NoticeLayoutConfig();
        }
        return this.noticeLayoutConfig;
    }

    public TUIChatConfigs setGeneralConfig(GeneralConfig generalConfig) {
        this.generalConfig = generalConfig;
        return this;
    }
}
