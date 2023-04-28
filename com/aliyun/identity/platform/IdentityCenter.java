package com.aliyun.identity.platform;

import android.graphics.Bitmap;
import com.aliyun.identity.platform.api.IdentityOcrInfo;
import com.aliyun.identity.platform.api.IdentityRetCallback;
import com.aliyun.identity.platform.config.AndroidClientConfig;
import com.aliyun.identity.platform.config.OSSConfig;
import com.aliyun.identity.platform.config.ProtocolContent;
import com.aliyun.identity.platform.network.NetworkEnv;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class IdentityCenter {
    private static IdentityCenter s_instance;
    private String accSensorTxt;
    private boolean albumPhotoSuccess;
    private AndroidClientConfig androidClientConfig;
    private String bankCardNo;
    private String certifyId;
    private String confirmBankNo;
    private String confirmCertName;
    private String confirmCertNo;
    private String deviceToken;
    private Bitmap faceBitmap;
    private String faceBitmapOss;
    private String gyrSensorTxt;
    private IdentityRetCallback identityRetCallback;
    private boolean isFinished;
    private NetworkEnv networkEnv;
    private String nowDate;
    private Bitmap ocrBankFullBitmap;
    private String ocrBankOss;
    private Bitmap ocrBankRoiBitmap;
    private IdentityOcrInfo ocrIdCardBack;
    private Bitmap ocrIdCardBackFullBitmap;
    private String ocrIdCardBackOss;
    private Bitmap ocrIdCardBackRoiBitmap;
    private IdentityOcrInfo ocrIdCardFront;
    private Bitmap ocrIdCardFrontFullBitmap;
    private String ocrIdCardFrontOss;
    private Bitmap ocrIdCardFrontRoiBitmap;
    private IdentityOcrInfo ocrInfo;
    private OSSConfig ossConfig;
    private float pictureMaxWidth;
    private float pictureQuality;
    private ProtocolContent protocolContent;
    private long startTime;
    private String validUrl;
    private String videoFilePath;

    private IdentityCenter() {
    }

    public static IdentityCenter getInstance() {
    }

    private void initValidUrl() {
    }

    public void clear() {
    }

    public String getAccSensorTxt() {
    }

    public boolean getAlbumPhotoSuccess() {
    }

    public AndroidClientConfig getAndroidClientConfig() {
    }

    public String getBankCardNo() {
    }

    public String getCertifyId() {
    }

    public String getConfirmBankNo() {
    }

    public String getConfirmCertName() {
    }

    public String getConfirmCertNo() {
    }

    public String getDeviceToken() {
    }

    public Bitmap getFaceBitmap() {
    }

    public String getFaceBitmapOss() {
    }

    public String getGyrSensorTxt() {
    }

    public IdentityRetCallback getIdentityRetCallback() {
    }

    public NetworkEnv getNetworkEnv() {
    }

    public String getNowDate() {
    }

    public Bitmap getOcrBankFullBitmap() {
    }

    public String getOcrBankOss() {
    }

    public Bitmap getOcrBankRoiBitmap() {
    }

    public IdentityOcrInfo getOcrIdCardBack() {
    }

    public Bitmap getOcrIdCardBackFullBitmap() {
    }

    public String getOcrIdCardBackOss() {
    }

    public Bitmap getOcrIdCardBackRoiBitmap() {
    }

    public IdentityOcrInfo getOcrIdCardFront() {
    }

    public Bitmap getOcrIdCardFrontFullBitmap() {
    }

    public String getOcrIdCardFrontOss() {
    }

    public Bitmap getOcrIdCardFrontRoiBitmap() {
    }

    public IdentityOcrInfo getOcrInfo() {
    }

    public OSSConfig getOssConfig() {
    }

    public float getPictureMaxWidth() {
    }

    public float getPictureQuality() {
    }

    public ProtocolContent getProtocolContent() {
    }

    public long getStartTime() {
    }

    public String getValidUrl() {
    }

    public String getVideoFilePath() {
    }

    public void sendResAndExit(String str) {
    }

    public void setAccSensorTxt(String str) {
    }

    public void setAlbumPhotoSuccess(boolean z) {
    }

    public void setAndroidClientConfig(AndroidClientConfig androidClientConfig) {
    }

    public void setBankCardNo(String str) {
    }

    public void setCertifyId(String str) {
    }

    public void setConfirmBankNo(String str) {
    }

    public void setConfirmCertName(String str) {
    }

    public void setConfirmCertNo(String str) {
    }

    public void setDeviceToken(String str) {
    }

    public void setFaceBitmap(Bitmap bitmap) {
    }

    public void setFaceBitmapOss(String str) {
    }

    public void setGyrSensorTxt(String str) {
    }

    public void setIdentityRetCallback(IdentityRetCallback identityRetCallback) {
    }

    public void setNetworkEnv(NetworkEnv networkEnv) {
    }

    public void setNowDate(String str) {
    }

    public void setOcrBankFullBitmap(Bitmap bitmap) {
    }

    public void setOcrBankOss(String str) {
    }

    public void setOcrBankRoiBitmap(Bitmap bitmap) {
    }

    public void setOcrIdCardBack(IdentityOcrInfo identityOcrInfo) {
    }

    public void setOcrIdCardBackFullBitmap(Bitmap bitmap) {
    }

    public void setOcrIdCardBackOss(String str) {
    }

    public void setOcrIdCardBackRoiBitmap(Bitmap bitmap) {
    }

    public void setOcrIdCardFront(IdentityOcrInfo identityOcrInfo) {
    }

    public void setOcrIdCardFrontFullBitmap(Bitmap bitmap) {
    }

    public void setOcrIdCardFrontOss(String str) {
    }

    public void setOcrIdCardFrontRoiBitmap(Bitmap bitmap) {
    }

    public void setOcrInfo(IdentityOcrInfo identityOcrInfo) {
    }

    public void setOssConfig(OSSConfig oSSConfig) {
    }

    public void setPictureParameters(float f2, float f3) {
    }

    public void setProtocolContent(ProtocolContent protocolContent) {
    }

    public void setStartTime(long j2) {
    }

    public void setVideoFilePath(String str) {
    }

    public void switchValidUrl() {
    }

    public void updateOcrInfo(String str, String str2, String str3) {
    }
}
