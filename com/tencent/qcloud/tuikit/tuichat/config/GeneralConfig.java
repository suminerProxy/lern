package com.tencent.qcloud.tuikit.tuichat.config;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class GeneralConfig {
    public static final int DEFAULT_AUDIO_RECORD_MAX_TIME = 60;
    public static final int DEFAULT_VIDEO_RECORD_MAX_TIME = 15;
    private String appCacheDir;
    private boolean excludedFromLastMessage;
    private boolean excludedFromUnreadCount;
    private boolean isAndroidPrivateRing;
    private int audioRecordMaxTime = 60;
    private int videoRecordMaxTime = 15;
    private String userNickname = "";
    private boolean isEnableMessageTyping = true;
    private boolean showRead = false;
    private boolean reactEnable = true;
    private boolean replyEnable = true;
    private boolean quoteEnable = true;
    private boolean enableFloatWindowForCall = true;
    private boolean enableMultiDeviceForCall = false;
    private String userFaceUrl = "";

    public String getAppCacheDir() {
        return this.appCacheDir;
    }

    public int getAudioRecordMaxTime() {
        return this.audioRecordMaxTime;
    }

    public String getUserFaceUrl() {
        return this.userFaceUrl;
    }

    public String getUserNickname() {
        return this.userNickname;
    }

    public int getVideoRecordMaxTime() {
        return this.videoRecordMaxTime;
    }

    public boolean isAndroidPrivateRing() {
        return this.isAndroidPrivateRing;
    }

    public boolean isEnableFloatWindowForCall() {
        return this.enableFloatWindowForCall;
    }

    public boolean isEnableMessageTyping() {
        return this.isEnableMessageTyping;
    }

    public boolean isEnableMultiDeviceForCall() {
        return this.enableMultiDeviceForCall;
    }

    public boolean isExcludedFromLastMessage() {
        return this.excludedFromLastMessage;
    }

    public boolean isExcludedFromUnreadCount() {
        return this.excludedFromUnreadCount;
    }

    public boolean isQuoteEnable() {
        return this.quoteEnable;
    }

    public boolean isReactEnable() {
        return this.reactEnable;
    }

    public boolean isReplyEnable() {
        return this.replyEnable;
    }

    public boolean isShowRead() {
        return this.showRead;
    }

    public void setAndroidPrivateRing(boolean z) {
        this.isAndroidPrivateRing = z;
    }

    public GeneralConfig setAppCacheDir(String str) {
        this.appCacheDir = str;
        return this;
    }

    public GeneralConfig setAudioRecordMaxTime(int i2) {
        this.audioRecordMaxTime = i2;
        return this;
    }

    public void setEnableFloatWindowForCall(boolean z) {
        this.enableFloatWindowForCall = z;
    }

    public void setEnableMessageTyping(boolean z) {
        this.isEnableMessageTyping = z;
    }

    public void setEnableMultiDeviceForCall(boolean z) {
        this.enableMultiDeviceForCall = z;
    }

    public void setExcludedFromLastMessage(boolean z) {
        this.excludedFromLastMessage = z;
    }

    public void setExcludedFromUnreadCount(boolean z) {
        this.excludedFromUnreadCount = z;
    }

    public void setQuoteEnable(boolean z) {
        this.quoteEnable = z;
    }

    public void setReactEnable(boolean z) {
        this.reactEnable = z;
    }

    public void setReplyEnable(boolean z) {
        this.replyEnable = z;
    }

    public void setShowRead(boolean z) {
        this.showRead = z;
    }

    public void setUserFaceUrl(String str) {
        this.userFaceUrl = str;
    }

    public void setUserNickname(String str) {
        this.userNickname = str;
    }

    public GeneralConfig setVideoRecordMaxTime(int i2) {
        this.videoRecordMaxTime = i2;
        return this;
    }
}
