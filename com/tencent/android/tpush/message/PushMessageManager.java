package com.tencent.android.tpush.message;

import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.XGPushManager;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.logging.TLogger;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class PushMessageManager {
    public static final int CUSTOM_LAYOUT_TYPE_1 = 1;
    public static final int CUSTOM_LAYOUT_TYPE_2 = 2;
    public static final int CUSTOM_LAYOUT_TYPE_3 = 3;
    public static final int MESSAGE_TYPE_CLOUD_CTRL = 1000;
    public static final int MESSAGE_TYPE_CTRL = 3;
    public static final int MESSAGE_TYPE_IN_MSG = 7;
    public static final int MESSAGE_TYPE_NOTIFICATION = 1;
    public static final int MESSAGE_TYPE_TEXT = 2;

    /* renamed from: m  reason: collision with root package name */
    private Context f8743m;

    /* renamed from: n  reason: collision with root package name */
    private Intent f8744n;

    /* renamed from: a  reason: collision with root package name */
    private long f8733a = -1;
    private long b = -1;
    private long c = -1;

    /* renamed from: d  reason: collision with root package name */
    private String f8734d = "";

    /* renamed from: e  reason: collision with root package name */
    private long f8735e = -1;

    /* renamed from: f  reason: collision with root package name */
    private String f8736f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f8737g = "";

    /* renamed from: h  reason: collision with root package name */
    private long f8738h = -1;

    /* renamed from: i  reason: collision with root package name */
    private long f8739i = -1;

    /* renamed from: j  reason: collision with root package name */
    private String f8740j = "";

    /* renamed from: k  reason: collision with root package name */
    private String f8741k = "";

    /* renamed from: l  reason: collision with root package name */
    private String f8742l = "";
    public int pushChannel = 100;
    public long pushTime = 0;
    public long targetType = 0;
    public long source = 0;

    /* renamed from: o  reason: collision with root package name */
    private a f8745o = null;

    /* renamed from: p  reason: collision with root package name */
    private int f8746p = 0;

    private PushMessageManager(Context context, Intent intent) {
        this.f8743m = null;
        this.f8744n = null;
        this.f8743m = context;
        this.f8744n = intent;
    }

    public static PushMessageManager getInstance(Context context, Intent intent) {
        PushMessageManager pushMessageManager = new PushMessageManager(context, intent);
        String decrypt = Rijndael.decrypt(intent.getStringExtra("content"));
        TLogger.d("PushMessageManager", "PushMessageManager content:" + decrypt);
        pushMessageManager.f8736f = decrypt;
        String decrypt2 = Rijndael.decrypt(intent.getStringExtra(MessageKey.MSG_IN_MSG));
        TLogger.d("PushMessageManager", "PushMessageManager inMsg:" + decrypt2);
        pushMessageManager.f8737g = decrypt2;
        pushMessageManager.b = intent.getLongExtra(MessageKey.MSG_ID, -1L);
        TLogger.d("PushMessageManager", "PushMessageManager msgId:" + pushMessageManager.b);
        pushMessageManager.c = intent.getLongExtra("accId", -1L);
        pushMessageManager.f8734d = intent.getStringExtra(Constants.XG_SYS_INTENT_KEY_THIRD_APP);
        pushMessageManager.f8735e = intent.getLongExtra(MessageKey.MSG_BUSI_MSG_ID, -1L);
        pushMessageManager.f8733a = intent.getLongExtra(MessageKey.MSG_CHANNEL_ID, -1L);
        pushMessageManager.f8738h = intent.getLongExtra(MessageKey.MSG_CREATE_TIMESTAMPS, -1L);
        pushMessageManager.f8739i = intent.getLongExtra("type", -1L);
        TLogger.d("PushMessageManager", "PushMessageManager type:" + pushMessageManager.f8739i);
        int intExtra = intent.getIntExtra(MessageKey.MSG_PUSH_CHANNEL, 100);
        pushMessageManager.pushTime = intent.getLongExtra(MessageKey.MSG_PUSH_TIME, -1L);
        pushMessageManager.pushChannel = intExtra;
        String stringExtra = intent.getStringExtra("group_id");
        pushMessageManager.f8740j = stringExtra;
        if (i.b(stringExtra)) {
            pushMessageManager.f8740j = intent.getStringExtra("groupId");
        }
        pushMessageManager.targetType = intent.getLongExtra(MessageKey.MSG_TARGET_TYPE, 0L);
        pushMessageManager.source = intent.getLongExtra(MessageKey.MSG_SOURCE, 0L);
        pushMessageManager.f8741k = intent.getStringExtra(MessageKey.MSG_TEMPLATE_ID);
        pushMessageManager.f8742l = intent.getStringExtra(MessageKey.MSG_TRACE_ID);
        a aVar = null;
        int i2 = (int) pushMessageManager.f8739i;
        if (i2 == 1) {
            aVar = new d(decrypt);
        } else if (i2 == 2) {
            aVar = new f(decrypt);
        } else if (i2 == 3) {
            MessageManager.getInstance().onCrtlMsgHandle(context, decrypt);
            XGPushManager.msgAck(context, pushMessageManager);
        } else if (i2 != 7 && i2 != 1000) {
            TLogger.e("PushMessageManager", "error type for message, drop it, type:" + pushMessageManager.f8739i + ",intent:" + intent);
            XGPushManager.msgAck(context, pushMessageManager);
        }
        if (aVar != null) {
            pushMessageManager.f8745o = aVar;
            aVar.a();
        }
        pushMessageManager.f8746p = intent.getIntExtra(MessageKey.MSG_REVOKEID, 0);
        return pushMessageManager;
    }

    public long getAccessId() {
        return this.c;
    }

    public String getAppPkgName() {
        return this.f8734d;
    }

    public long getBusiMsgId() {
        return this.f8735e;
    }

    public long getChannelId() {
        return this.f8733a;
    }

    public String getContent() {
        return this.f8736f;
    }

    public Context getContext() {
        return this.f8743m;
    }

    public String getGroupId() {
        return this.f8740j;
    }

    public String getInMsg() {
        return this.f8737g;
    }

    public Intent getIntent() {
        return this.f8744n;
    }

    public a getMessageHolder() {
        return this.f8745o;
    }

    public long getMsgId() {
        return this.b;
    }

    public int getRevokeId() {
        return this.f8746p;
    }

    public long getSource() {
        return this.source;
    }

    public long getTargetType() {
        return this.targetType;
    }

    public String getTemplateId() {
        return this.f8741k;
    }

    public long getTimestamps() {
        return this.f8738h;
    }

    public String getTraceId() {
        return this.f8742l;
    }

    public long getType() {
        return this.f8739i;
    }

    public void setAppPkgName(String str) {
        this.f8734d = str;
    }

    public void setChannelId(long j2) {
        this.f8733a = j2;
    }

    public void setGroupId(String str) {
        this.f8740j = str;
    }

    public void setSource(long j2) {
        this.source = j2;
    }

    public void setTargetType(long j2) {
        this.targetType = j2;
    }

    public void showNotifacition() {
        if (this.f8745o.b() != 1) {
            return;
        }
        b.a(this.f8743m, this);
    }

    public String toString() {
        return "PushMessageManager [msgId=" + this.b + ", accessId=" + this.c + ", busiMsgId=" + this.f8735e + ", content=" + this.f8736f + ", timestamps=" + this.f8738h + ", type=" + this.f8739i + ", intent=" + this.f8744n + ", messageHolder=" + this.f8745o + ", appPkgName=" + this.f8734d + ", revokeId=" + this.f8746p + ", templateId=" + this.f8741k + ", traceId=" + this.f8742l + "]";
    }
}
