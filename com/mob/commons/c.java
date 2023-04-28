package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, List<String>> f3527a = new HashMap<>();
    public static final String b;
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f3528d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f3529e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f3530f;

    static {
        String a2 = j.a("006^figefmhjfghh");
        b = a2;
        String a3 = j.a("0051fiFjGfhBf]fh");
        c = a3;
        String a4 = j.a("005kPfjfjgefj");
        f3528d = a4;
        String a5 = j.a("006jklAfgfi>k");
        f3529e = a5;
        String a6 = j.a("003j gfgf");
        f3530f = a6;
        try {
            f3527a.put(a4, Arrays.asList(j.a("018YfhPg2fgjkFk9fnfign0jRfeMfGfggfhignfige9n"), j.a("0205fh<gEfgjk9kUfjfjgefjgnOjGfeRfNfggfhignfigeXn")));
            f3527a.put(a5, Arrays.asList(j.a("020jklIhijkZj:fh2f?fhgnQjCfe0f8fggfhignfige!n"), j.a("019Zfh^g-fgjk?jklGhignOj(fe?f[fggfhignfige6n")));
            f3527a.put(a6, Arrays.asList("dfe-mic.mob.com", "df-mic.mob.com"));
            f3527a.put(a2, Arrays.asList(j.a("0179fh]gBfgjkhjfign(j-feUf9fggfhignfigeUn"), j.a("016RfhUgOfgjkfignXj=fe)f(fggfhignfige:n")));
            f3527a.put(a3, Arrays.asList(j.a("016Ofh*gOfgjkBjQgn4j,fe0f?fggfhignfigeDn"), j.a("0177fhRg)fgjkhj6j3gnKj$feSf*fggfhignfigeHn")));
            f3527a.put("sdrl", Arrays.asList("df-mic.mob.com", "df-mic.mob.com"));
        } catch (Throwable unused) {
        }
    }

    private static String b(String str, String str2) {
        List<String> list;
        String c2 = x.a().c(str, str2);
        return (!TextUtils.isEmpty(c2) || (list = f3527a.get(str)) == null || list.size() <= 0) ? c2 : list.get(0);
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str) || str.equals("127.0.0.1") || str.startsWith("10.") || str.startsWith("192.168")) {
            return false;
        }
        if (str.startsWith("172.")) {
            String[] split = str.split("\\.");
            if (split.length > 1) {
                try {
                    int parseInt = Integer.parseInt(split[1]);
                    return parseInt < 16 || parseInt > 31;
                } catch (Throwable th) {
                    MobLog.getInstance().d(th);
                }
            }
        }
        return true;
    }

    public static void a(com.mob.tools.utils.b<Void> bVar) {
        DH.requester(MobSDK.getContext()).checkNetworkAvailable().request(new DH.DHResponder(bVar) { // from class: com.mob.commons.c.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ com.mob.tools.utils.b f3531a;

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        });
    }

    public static String a(String str) {
        return s.a(b(str, (String) null));
    }

    public static boolean a(HashMap<String, List<String>> hashMap) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        DH.requester(MobSDK.getContext()).checkNetworkAvailable().request(new DH.DHResponder(linkedBlockingQueue, hashMap) { // from class: com.mob.commons.c.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ LinkedBlockingQueue f3532a;
            public final /* synthetic */ HashMap b;

            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
            }
        });
        try {
            Boolean bool = (Boolean) linkedBlockingQueue.poll(200L, TimeUnit.MILLISECONDS);
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.lang.String r3, java.util.List<java.lang.String> r4) {
        /*
            if (r4 == 0) goto L67
            int r0 = r4.size()
            if (r0 != 0) goto L9
            goto L67
        L9:
            r0 = 0
            java.lang.String r0 = b(r3, r0)
            boolean r1 = b(r0)
            if (r1 != 0) goto L67
            boolean r1 = b(r0)
            if (r1 != 0) goto L67
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = b(r1)
            if (r2 != 0) goto L36
            boolean r2 = b(r1)
            if (r2 == 0) goto L1e
        L36:
            boolean r4 = r1.equals(r0)
            if (r4 != 0) goto L67
            com.mob.tools.log.NLog r4 = com.mob.tools.MobLog.getInstance()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sy dm: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ":"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4.d(r0, r2)
            com.mob.commons.x r4 = com.mob.commons.x.a()
            r4.d(r3, r1)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.c.b(java.lang.String, java.util.List):void");
    }

    public static String a(String str, String str2) {
        return s.a(b(str, str2));
    }

    private static boolean b(String str) {
        if (str != null) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                if (allByName != null) {
                    for (InetAddress inetAddress : allByName) {
                        if (!c(inetAddress.getHostAddress())) {
                            return false;
                        }
                    }
                }
                MobLog.getInstance().d("ck ht suc: " + str, new Object[0]);
                return true;
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return false;
    }
}
