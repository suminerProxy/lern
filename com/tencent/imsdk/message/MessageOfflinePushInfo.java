package com.tencent.imsdk.message;

import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MessageOfflinePushInfo implements Serializable {
    public static final int OFFLINE_APNS_BADGE_MODE_DEFAULT = 0;
    public static final int OFFLINE_APNS_BADGE_MODE_IGNORE = 1;
    public static final int OFFLINE_PUSH_FLAG_DEFAULT = 0;
    public static final int OFFLINE_PUSH_FLAG_NO_PUSH = 1;
    private String description;
    private byte[] extension;
    private int pushFlag;
    private String soundFilePath;
    private String title;
    private APNSOfflinePushInfo apnsConfig = new APNSOfflinePushInfo(this);
    private AndroidOfflinePushInfo androidConfig = new AndroidOfflinePushInfo(this);

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class APNSOfflinePushInfo implements Serializable {
        private int badgeMode;
        private String description;
        private int iOSPushType;
        private String soundFilePath;
        public final /* synthetic */ MessageOfflinePushInfo this$0;
        private String title;

        public APNSOfflinePushInfo(MessageOfflinePushInfo messageOfflinePushInfo) {
        }

        public void setBadgeMode(int i2) {
        }

        public void setIOSPushType(int i2) {
        }

        public void setSoundFilePath(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AndroidOfflinePushInfo implements Serializable {
        private String description;
        private int notifyMode;
        private String oppoChannelID;
        private String soundFilePath;
        public final /* synthetic */ MessageOfflinePushInfo this$0;
        private String title;
        private int vivoClassification;

        public AndroidOfflinePushInfo(MessageOfflinePushInfo messageOfflinePushInfo) {
        }

        public void setOppoChannelID(String str) {
        }

        public void setSoundFilePath(String str) {
        }

        public void setVivoClassification(int i2) {
        }
    }

    public AndroidOfflinePushInfo getAndroidConfig() {
        return this.androidConfig;
    }

    public APNSOfflinePushInfo getApnsConfig() {
        return this.apnsConfig;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getExtension() {
        return this.extension;
    }

    public int getPushFlag() {
        return this.pushFlag;
    }

    public String getSoundFilePath() {
        return this.soundFilePath;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAndroidConfig(AndroidOfflinePushInfo androidOfflinePushInfo) {
        this.androidConfig = androidOfflinePushInfo;
    }

    public void setApnsConfig(APNSOfflinePushInfo aPNSOfflinePushInfo) {
        this.apnsConfig = aPNSOfflinePushInfo;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExtension(byte[] bArr) {
        this.extension = bArr;
    }

    public void setPushFlag(int i2) {
        this.pushFlag = i2;
    }

    public void setSoundFilePath(String str) {
        this.soundFilePath = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
