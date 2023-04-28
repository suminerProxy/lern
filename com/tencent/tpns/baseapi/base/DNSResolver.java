package com.tencent.tpns.baseapi.base;

import com.tencent.tpns.baseapi.base.logger.TBaseLogger;
import com.tencent.tpns.baseapi.base.util.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import com.tencent.tpns.baseapi.base.util.Util;
import h.w.a.e.b.b.s.e;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class DNSResolver extends TTask {
    public static byte DNS_REASON = 0;

    /* renamed from: a  reason: collision with root package name */
    private static String f13619a = "DNSResolver";
    private String b;
    private String c;

    private DNSResolver(String str) {
        this.b = str;
    }

    private static boolean a(String str) {
        return str == null || str.equals("");
    }

    private static String b(String str) {
        InetAddress inetAddress;
        if (a(str)) {
            return null;
        }
        try {
            long nanoTime = System.nanoTime();
            InetAddress[] allByName = InetAddress.getAllByName(str);
            long nanoTime2 = System.nanoTime();
            if (allByName == null || allByName.length <= 0) {
                inetAddress = null;
            } else {
                inetAddress = allByName[0];
                DNS_REASON = (byte) 2;
                TBaseLogger.dd(f13619a, "getAllByName: " + Arrays.toString(allByName) + " in " + ((nanoTime2 - nanoTime) / 1000000) + "ms");
            }
            if (inetAddress != null) {
                TBaseLogger.d(f13619a, "addr:" + inetAddress.getHostAddress());
                if (inetAddress instanceof Inet4Address) {
                    return inetAddress.getHostAddress();
                }
                if (inetAddress instanceof Inet6Address) {
                    return "[" + inetAddress.getHostAddress() + "]";
                }
            }
        } catch (Throwable th) {
            Logger.e(f13619a, "NSLookup error: ", th);
            DNS_REASON = (byte) 2;
        }
        return null;
    }

    public static String hostToIp(String str, String str2) {
        String str3;
        String str4;
        String[] split;
        String str5 = f13619a;
        StringBuilder sb = new StringBuilder();
        sb.append("Get MqttServer address: ");
        sb.append(str);
        sb.append(", portList:");
        sb.append(str2 == null ? "null" : str2);
        Logger.i(str5, sb.toString());
        ArrayList arrayList = new ArrayList();
        if (!Util.isNullOrEmptyString(str2)) {
            try {
                JSONArray jSONArray = new JSONArray(str2);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(jSONArray.getString(i2));
                }
            } catch (JSONException e2) {
                Logger.e(f13619a, "Get MqttServer parse mqttPortList error ", e2);
            }
        }
        if (arrayList.size() > 0) {
            str3 = (String) arrayList.get(new Random().nextInt(arrayList.size()));
            Logger.i(f13619a, "Get MqttServer random port: " + str3);
        } else {
            str3 = "1883";
            Logger.i(f13619a, "Get MqttServer use default port: 1883");
        }
        String str6 = null;
        if (str.startsWith("tcp://")) {
            try {
                split = str.substring(6).split(":");
            } catch (Throwable th) {
                Logger.e(f13619a, "Get MqttServer parse tcp ip error ", th);
            }
            if (split.length > 1) {
                str4 = split[0];
                Logger.i(f13619a, "Get MqttServer address no need to parse, ip: ");
            }
            str4 = null;
            Logger.i(f13619a, "Get MqttServer address no need to parse, ip: ");
        } else if (str.startsWith("ssl://")) {
            return str;
        } else {
            DNSResolver dNSResolver = new DNSResolver(str);
            try {
                Thread thread = new Thread(dNSResolver);
                thread.setName("tpns-dns");
                thread.start();
                thread.join(e.r);
            } catch (Throwable th2) {
                Logger.e(f13619a, "t.join", th2);
            }
            str4 = dNSResolver.get();
        }
        if (Util.isNullOrEmptyString(str4)) {
            TBaseLogger.ee(f13619a, "Get MqttServer ip is null");
        } else {
            str6 = "tcp://" + str4 + ":" + str3;
        }
        TBaseLogger.i(f13619a, "DNS " + str + " -> " + str6);
        return str6;
    }

    @Override // com.tencent.tpns.baseapi.base.util.TTask
    public void TRun() {
        try {
            set(b(this.b));
        } catch (Throwable th) {
            String str = f13619a;
            TBaseLogger.ww(str, "unexpected for dns resolver:" + th.getMessage());
        }
    }

    public synchronized String get() {
        return this.c;
    }

    public synchronized void set(String str) {
        this.c = str;
    }
}
