package com.tencent.android.tpush.stat.event;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.logging.TLogger;
import com.tencent.android.tpush.message.PushMessageManager;
import com.tencent.tpns.baseapi.XGApiConfig;
import com.tencent.tpns.baseapi.base.device.GuidInfoManager;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MQTTEvent extends Event {
    public long accessid;
    public String appVersion;
    public String appkey;
    public String eventId;
    public long msgBusiId;
    public long msgId;
    public long msgType;
    public String nGroupId;
    public JSONObject prop;
    public int pushAction;
    public int pushChannel;
    public long pushtime;
    public String sdkVersion;
    public long source;
    public long targetType;
    public String templateId;
    public long timestamp;
    public String token;
    public String traceId;

    public MQTTEvent(Context context, String str, long j2) {
        super(context, str, j2);
        this.appkey = null;
        this.accessid = 0L;
        this.appVersion = null;
        this.sdkVersion = null;
        this.token = null;
        this.msgId = -1L;
        this.msgType = -1L;
        this.pushAction = -1;
        this.nGroupId = null;
        this.targetType = 0L;
        this.source = 0L;
        this.eventId = null;
        this.prop = null;
        this.templateId = "";
        this.traceId = "";
        this.appkey = str;
        this.accessid = j2;
    }

    private void a(PushMessageManager pushMessageManager) {
        this.msgBusiId = pushMessageManager.getBusiMsgId();
        this.timestamp = System.currentTimeMillis() / 1000;
        this.pushtime = pushMessageManager.getTimestamps() / 1000;
        this.pushChannel = pushMessageManager.pushChannel;
        this.appVersion = com.tencent.android.tpush.stat.b.b.c(this.f9138k);
        this.sdkVersion = "1.3.7.0";
        this.token = GuidInfoManager.getToken(this.f9138k);
        this.msgId = pushMessageManager.getMsgId();
        this.msgType = pushMessageManager.getType();
        this.nGroupId = pushMessageManager.getGroupId();
        this.targetType = pushMessageManager.getTargetType();
        this.source = pushMessageManager.getSource();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MQTTEvent mQTTEvent = (MQTTEvent) obj;
            try {
                if (this.accessid == mQTTEvent.accessid && this.timestamp == mQTTEvent.timestamp && this.msgType == mQTTEvent.msgType && this.pushAction == mQTTEvent.pushAction && this.msgId == mQTTEvent.msgId && this.appVersion.equals(mQTTEvent.appVersion) && this.token.equals(mQTTEvent.token) && this.targetType == mQTTEvent.targetType) {
                    if (this.source == mQTTEvent.source) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                TLogger.d("MQTTEvent equals Error:", th.getMessage());
            }
        }
        return false;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public long getAccessid() {
        return this.accessid;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String getAppkey() {
        return this.appkey;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public EventType getType() {
        return null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public boolean onEncode(JSONObject jSONObject) {
        return true;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public void setAccessid(long j2) {
        this.accessid = j2;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public void setAppkey(String str) {
        this.appkey = str;
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accessId", this.accessid);
            jSONObject.put("pushAction", this.pushAction);
            jSONObject.put(MessageKey.MSG_ID, this.msgId);
            jSONObject.put("msgType", this.msgType);
            jSONObject.put(MessageKey.MSG_ID, this.msgId);
            jSONObject.put("pushtime", this.pushtime);
            jSONObject.put("timestamp", this.timestamp);
            jSONObject.put(MessageKey.MSG_TEMPLATE_ID, this.templateId);
            jSONObject.put(MessageKey.MSG_TRACE_ID, this.traceId);
            String str = this.token;
            if (str != null) {
                jSONObject.put(Constants.FLAG_TOKEN, str);
            }
            String str2 = this.appkey;
            if (str2 != null) {
                jSONObject.put("accessKey", str2);
            }
            String str3 = this.appVersion;
            if (str3 != null) {
                jSONObject.put("appVersion", str3);
            }
            String str4 = this.sdkVersion;
            if (str4 != null) {
                jSONObject.put("sdkVersion", str4);
            }
            String str5 = this.nGroupId;
            if (str5 != null) {
                jSONObject.put("groupId", str5);
            }
            jSONObject.put(MessageKey.MSG_PUSH_CHANNEL, this.pushChannel);
            long j2 = this.targetType;
            if (j2 > 0) {
                jSONObject.put(MessageKey.MSG_TARGET_TYPE, j2);
            }
            long j3 = this.source;
            if (j3 > 0) {
                jSONObject.put(MessageKey.MSG_SOURCE, j3);
            }
            String str6 = this.eventId;
            if (str6 != null && !TextUtils.isEmpty(str6)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", this.eventId);
                JSONObject jSONObject3 = this.prop;
                if (jSONObject3 != null && jSONObject3.length() != 0) {
                    jSONObject2.put("kv", this.prop);
                }
                jSONObject.put("customEvent", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            TLogger.d("MQTTEvent toJsonString Error:", th.getMessage());
            return null;
        }
    }

    @Override // com.tencent.android.tpush.stat.event.Event
    public String toString() {
        return toJsonString();
    }

    public MQTTEvent(Context context, long j2) {
        this(context, XGApiConfig.getAccessKey(context), j2);
    }

    public MQTTEvent(Context context) {
        super(context, XGApiConfig.getAccessKey(context), XGApiConfig.getAccessId(context));
        this.appkey = null;
        this.accessid = 0L;
        this.appVersion = null;
        this.sdkVersion = null;
        this.token = null;
        this.msgId = -1L;
        this.msgType = -1L;
        this.pushAction = -1;
        this.nGroupId = null;
        this.targetType = 0L;
        this.source = 0L;
        this.eventId = null;
        this.prop = null;
        this.templateId = "";
        this.traceId = "";
        this.appkey = XGApiConfig.getAccessKey(context);
        this.accessid = XGApiConfig.getAccessId(context);
    }

    public MQTTEvent(Context context, long j2, PushMessageManager pushMessageManager) {
        this(context, j2);
        a(pushMessageManager);
    }
}
