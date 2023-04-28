package com.tencent.android.tpush;

import com.tencent.android.tpush.common.i;
import com.tencent.android.tpush.logging.TLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class XGLocalMessage {
    private long v;
    public long pushTime = 0;
    public int pushChannel = 99;
    public String nGroupId = "";
    public long targetType = 0;
    public long source = 0;
    public String templateId = "";
    public String traceId = "";

    /* renamed from: a  reason: collision with root package name */
    private int f8440a = 1;
    private String b = "";
    private String c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f8441d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f8442e = "00";

    /* renamed from: f  reason: collision with root package name */
    private String f8443f = "00";

    /* renamed from: g  reason: collision with root package name */
    private int f8444g = 1;

    /* renamed from: h  reason: collision with root package name */
    private int f8445h = 1;

    /* renamed from: i  reason: collision with root package name */
    private int f8446i = 1;

    /* renamed from: j  reason: collision with root package name */
    private int f8447j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f8448k = 1;

    /* renamed from: l  reason: collision with root package name */
    private String f8449l = "";

    /* renamed from: m  reason: collision with root package name */
    private String f8450m = "";

    /* renamed from: n  reason: collision with root package name */
    private String f8451n = "";

    /* renamed from: o  reason: collision with root package name */
    private int f8452o = 1;

    /* renamed from: p  reason: collision with root package name */
    private String f8453p = "";
    private String q = "";
    private String r = "";
    private String s = "";
    private String t = "";
    private String u = "{}";
    private int w = 0;
    private long x = System.currentTimeMillis() * (-1);
    private long y = 0;
    private int z = 2592000;
    private long A = System.currentTimeMillis() + (this.z * 1000);
    private int B = 0;
    private String C = "";
    private int D = 2;
    private String E = "";
    private String F = "";
    private String G = "";
    private int H = -1;

    public int getAction_type() {
        return this.f8452o;
    }

    public String getActivity() {
        return this.f8453p;
    }

    public int getBadgeType() {
        return this.H;
    }

    public long getBuilderId() {
        return this.v;
    }

    public long getBusiMsgId() {
        return this.y;
    }

    public String getChannelId() {
        return this.C;
    }

    public int getColor() {
        return this.B;
    }

    public String getContent() {
        return this.c;
    }

    public String getCustom_content() {
        return this.u;
    }

    public String getDate() {
        if (!i.b(this.f8441d)) {
            try {
                String substring = this.f8441d.substring(0, 8);
                this.f8441d = substring;
                Long.parseLong(substring);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
                simpleDateFormat.setLenient(false);
                simpleDateFormat.parse(this.f8441d);
            } catch (ParseException e2) {
                TLogger.e("XGLocalMessage", "XGLocalMessage.getDate()", e2);
                return new SimpleDateFormat("yyyyMMdd").format(new Date());
            } catch (Throwable th) {
                TLogger.e("XGLocalMessage", "XGLocalMessage.getDate()", th);
                return new SimpleDateFormat("yyyyMMdd").format(new Date());
            }
        }
        return this.f8441d;
    }

    public long getExpirationTimeMs() {
        return this.A;
    }

    public String getHour() {
        if (this.f8442e.length() < 1) {
            return "00";
        }
        if (this.f8442e.length() > 0 && this.f8442e.length() < 2) {
            return "0" + this.f8442e;
        }
        return this.f8442e;
    }

    public String getIcon_res() {
        return this.f8450m;
    }

    public int getIcon_type() {
        return this.f8447j;
    }

    public String getIntent() {
        return this.r;
    }

    public int getLights() {
        return this.f8446i;
    }

    public String getMin() {
        if (this.f8443f.length() < 1) {
            return "00";
        }
        if (this.f8443f.length() > 0 && this.f8443f.length() < 2) {
            return "0" + this.f8443f;
        }
        return this.f8443f;
    }

    public long getMsgId() {
        return this.x;
    }

    public int getNotificationId() {
        return this.w;
    }

    public int getNsModel() {
        return this.D;
    }

    public String getPackageDownloadUrl() {
        return this.s;
    }

    public String getPackageName() {
        return this.t;
    }

    public int getRing() {
        return this.f8444g;
    }

    public String getRing_raw() {
        return this.f8449l;
    }

    public String getSmall_icon() {
        return this.f8451n;
    }

    public int getStyle_id() {
        return this.f8448k;
    }

    public String getThreadId() {
        return this.F;
    }

    public String getThreadSumText() {
        return this.G;
    }

    public String getTitle() {
        return this.b;
    }

    public String getTpns_media_resources() {
        return this.E;
    }

    public int getTtl() {
        return this.z;
    }

    public int getType() {
        return this.f8440a;
    }

    public String getUrl() {
        return this.q;
    }

    public int getVibrate() {
        return this.f8445h;
    }

    public void setAction_type(int i2) {
        this.f8452o = i2;
    }

    public void setActivity(String str) {
        this.f8453p = str;
    }

    public void setBadgeType(int i2) {
        this.H = i2;
    }

    public void setBuilderId(long j2) {
        this.v = j2;
    }

    public void setBusiMsgId(long j2) {
        this.y = j2;
    }

    public void setChannelId(String str) {
        this.C = str;
    }

    public void setColor(int i2) {
        this.B = i2;
    }

    public void setContent(String str) {
        this.c = str;
    }

    public void setCustomContent(HashMap<String, Object> hashMap) {
        this.u = new JSONObject(hashMap).toString();
    }

    public void setDate(String str) {
        this.f8441d = str;
    }

    public void setExpirationTimeMs(long j2) {
        if (j2 > System.currentTimeMillis()) {
            int currentTimeMillis = (int) ((j2 - System.currentTimeMillis()) / 1000);
            this.z = currentTimeMillis;
            if (currentTimeMillis < 0) {
                this.z = Integer.MAX_VALUE;
            }
            this.A = j2;
        }
    }

    public void setHour(String str) {
        this.f8442e = str;
    }

    public void setIcon_res(String str) {
        this.f8450m = str;
    }

    public void setIcon_type(int i2) {
        this.f8447j = i2;
    }

    public void setIntent(String str) {
        String str2;
        try {
            str2 = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            str2 = "";
        }
        this.r = str2;
    }

    public void setLights(int i2) {
        this.f8446i = i2;
    }

    public void setMin(String str) {
        this.f8443f = str;
    }

    public void setMsgId(long j2) {
        this.x = j2;
    }

    public void setNotificationId(int i2) {
        this.w = i2;
    }

    public void setNsModel(int i2) {
        this.D = i2;
    }

    public void setPackageDownloadUrl(String str) {
        this.s = str;
    }

    public void setPackageName(String str) {
        this.t = str;
    }

    public void setRing(int i2) {
        this.f8444g = i2;
    }

    public void setRing_raw(String str) {
        this.f8449l = str;
    }

    public void setSmall_icon(String str) {
        this.f8451n = str;
    }

    public void setStyle_id(int i2) {
        this.f8448k = i2;
    }

    public void setThreadId(String str) {
        this.F = str;
    }

    public void setThreadSumText(String str) {
        this.G = str;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    public void setTpns_media_resources(String str) {
        this.E = str;
    }

    public void setType(int i2) {
        this.f8440a = i2;
    }

    public void setUrl(String str) {
        this.q = str;
    }

    public void setVibrate(int i2) {
        this.f8445h = i2;
    }

    public String toString() {
        return "XGLocalMessage [type=" + this.f8440a + ", title=" + this.b + ", content=" + this.c + ", date=" + this.f8441d + ", hour=" + this.f8442e + ", min=" + this.f8443f + ", builderId=" + this.v + ", msgid=" + this.x + ", templateId=" + this.templateId + ", traceId=" + this.traceId + ", busiMsgId=" + this.y + "]";
    }
}
