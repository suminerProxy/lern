package com.mobile.auth.gatewayauth.model;

import com.mobile.auth.x.f;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MonitorStruct implements f, Serializable {
    private String accessCode;
    private String action;
    private String apiLevel;
    private Map<String, String> apiParams;
    private String authSdkCode;
    private String carrierFailedResultData;
    private String carrierSdkCode;
    private String carrierSdkMsg;
    private String carrierTraceId;
    private String certifyId;
    private long endTime;
    private String failRet;
    private String isCache;
    private boolean isSuccess;
    private String phoneNumber;
    private String requestId;
    private String sessionId;
    private long startTime;
    private String topTraceId;
    private int urgency;
    private String vendorKey;
    private long wholeMS;

    @Override // com.mobile.auth.x.f
    public void fromJson(JSONObject jSONObject) {
    }

    public String getAccessCode() {
    }

    public String getAction() {
    }

    public String getApiLevel() {
    }

    public Map<String, String> getApiParams() {
    }

    public String getAuthSdkCode() {
    }

    public String getCarrierFailedResultData() {
    }

    public String getCarrierSdkCode() {
    }

    public String getCarrierSdkMsg() {
    }

    public String getCarrierTraceId() {
    }

    public String getCertifyId() {
    }

    public long getEndTime() {
    }

    public String getFailRet() {
    }

    public String getPhoneNumber() {
    }

    public String getRequestId() {
    }

    public String getSessionId() {
    }

    public long getStartTime() {
    }

    public String getTopTraceId() {
    }

    public int getUrgency() {
    }

    public String getVendorKey() {
    }

    public long getWholeMS() {
    }

    public String isCache() {
    }

    public boolean isSuccess() {
    }

    public void putApiParam(String str, String str2) {
    }

    public void setAccessCode(String str) {
    }

    public void setAction(String str) {
    }

    public void setApiLevel(String str) {
    }

    public void setApiParams(Map<String, String> map) {
    }

    public void setAuthSdkCode(String str) {
    }

    public void setCache(String str) {
    }

    public void setCarrierFailedResultData(String str) {
    }

    public void setCarrierSdkCode(String str) {
    }

    public void setCarrierSdkMsg(String str) {
    }

    public void setCarrierTraceId(String str) {
    }

    public void setCertifyId(String str) {
    }

    public void setEndTime(long j2) {
    }

    public void setFailRet(String str) {
    }

    public void setPhoneNumber(String str) {
    }

    public void setRequestId(String str) {
    }

    public void setSessionId(String str) {
    }

    public void setStartTime(long j2) {
    }

    public void setSuccess(boolean z) {
    }

    public void setTopTraceId(String str) {
    }

    public void setUrgency(int i2) {
    }

    public void setVendorKey(String str) {
    }

    public void setWholeMS(long j2) {
    }

    @Override // com.mobile.auth.x.f
    public JSONObject toJson() {
    }
}
