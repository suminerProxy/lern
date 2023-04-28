package com.mob.tools.network;

import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.commons.MobProduct;
import com.mob.commons.e;
import com.mob.commons.o;
import com.mob.commons.s;
import com.mob.commons.w;
import com.mob.mcl.b.a;
import com.mob.tools.MobLog;
import com.mob.tools.a.c;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class NetCommunicator implements PublicMemberKeeper {
    public static final String KEY_DUID_PREVIOUS = "duidPrevious";
    public static final String KEY_IS_MODIFIED = "isModified";
    private BigInteger c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f4436d;

    /* renamed from: e  reason: collision with root package name */
    private MobRSA f4437e;

    /* renamed from: g  reason: collision with root package name */
    private NetworkHelper.NetworkTimeOut f4439g;

    /* renamed from: h  reason: collision with root package name */
    private ThreadPoolExecutor f4440h;
    public static final String KEY_DUID = o.b("004g,cbcdOg");

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f4435a = new ThreadPoolExecutor(3, 20, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());
    private SecureRandom b = new SecureRandom();

    /* renamed from: f  reason: collision with root package name */
    private NetworkHelper f4438f = new NetworkHelper();

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Callback<T> implements PublicMemberKeeper {
        public void onResultError(Throwable th) {
        }

        public void onResultOk(T t) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NetworkError extends Exception implements PublicMemberKeeper {
        private static final long serialVersionUID = -8447657431687664787L;

        public NetworkError(String str) {
        }
    }

    public NetCommunicator(int i2, String str, String str2) {
        this.f4437e = new MobRSA(i2);
        this.c = new BigInteger(str, 16);
        this.f4436d = new BigInteger(str2, 16);
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        this.f4439g = networkTimeOut;
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 5000;
        this.f4440h = f4435a;
    }

    public static String checkHttpRequestUrl(String str) {
        return s.b(str);
    }

    public static String dynamicModifyUrl(String str) {
        return s.a(str);
    }

    public static HashMap<String, String> getCommonDefaultHeaders() throws Throwable {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(o.b("003.ciIh3ch"), MobSDK.getAppkey());
        hashMap.put(o.b("013:ddef'h3cgghdf=ghDcj[cDcd@cRch"), w.c());
        hashMap.put(o.b("004kTdbcd>g"), c.a(MobSDK.getContext()).b().aY());
        return hashMap;
    }

    public static synchronized String getDUID(MobProduct mobProduct) {
        String a2;
        synchronized (NetCommunicator.class) {
            a2 = e.a(mobProduct);
        }
        return a2;
    }

    public static synchronized HashMap<String, Object> getDUIDWithModifyInfo(MobProduct mobProduct) {
        HashMap<String, Object> b;
        synchronized (NetCommunicator.class) {
            b = e.b(mobProduct);
        }
        return b;
    }

    public static String getSDKDomain(String str, String str2) {
        return com.mob.commons.c.a(str, str2);
    }

    public static boolean initSDKDM(HashMap<String, List<String>> hashMap) {
        return com.mob.commons.c.a(hashMap);
    }

    public void addTcpIntercept(String str) {
        try {
            a.a(str);
        } catch (Throwable unused) {
        }
    }

    public void removeTcpIntercept(String str) {
        try {
            a.b(str);
        } catch (Throwable unused) {
        }
    }

    public <T> void request(HashMap<String, Object> hashMap, String str, boolean z, Callback<T> callback) {
        request(true, null, hashMap, str, z, callback);
    }

    public <T> T requestSynchronized(HashMap<String, Object> hashMap, String str, boolean z) throws Throwable {
        return (T) requestSynchronized((HashMap<String, String>) null, hashMap, str, z);
    }

    public String requestSynchronizedGet(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) throws Throwable {
        try {
            a.a((String) null);
            String a2 = a.a(false, str, hashMap, hashMap2, this.f4439g);
            NLog mobLog = MobLog.getInstance();
            mobLog.d(">>> gt res:  " + a2, new Object[0]);
            return a2;
        } catch (Throwable unused) {
            return this.f4438f.httpGetNew(str, hashMap, hashMap2, this.f4439g);
        }
    }

    public void setThreadPool(ThreadPoolExecutor threadPoolExecutor) {
        this.f4440h = threadPoolExecutor;
    }

    public <T> void request(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z, Callback<T> callback) {
        request(true, hashMap, hashMap2, str, z, callback);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z) throws Throwable {
        return (T) requestSynchronized(true, hashMap, hashMap2, str, z);
    }

    private byte[] a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(byteArrayOutputStream));
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public <T> void request(boolean z, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z2, Callback<T> callback) {
        this.f4440h.execute(new com.mob.tools.utils.e(this, z, hashMap, hashMap2, str, z2, callback) { // from class: com.mob.tools.network.NetCommunicator.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f4441a;
            public final /* synthetic */ HashMap b;
            public final /* synthetic */ HashMap c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f4442d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ boolean f4443e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Callback f4444f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ NetCommunicator f4445g;

            /* renamed from: com.mob.tools.network.NetCommunicator$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class C01101 implements Handler.Callback {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Object f4446a;
                public final /* synthetic */ AnonymousClass1 b;

                public C01101(AnonymousClass1 anonymousClass1, Object obj) {
                }

                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                }
            }

            /* renamed from: com.mob.tools.network.NetCommunicator$1$2  reason: invalid class name */
            /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
            public class AnonymousClass2 implements Handler.Callback {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Throwable f4447a;
                public final /* synthetic */ AnonymousClass1 b;

                public AnonymousClass2(AnonymousClass1 anonymousClass1, Throwable th) {
                }

                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                }
            }

            @Override // com.mob.tools.utils.e
            public void a() {
            }
        });
    }

    public <T> T requestSynchronized(String str, String str2, boolean z) throws Throwable {
        return (T) requestSynchronized((HashMap<String, String>) null, str, str2, z);
    }

    public <T> T requestSynchronized(HashMap<String, String> hashMap, String str, String str2, boolean z) throws Throwable {
        return (T) requestSynchronized(true, hashMap, str, str2, z);
    }

    public <T> T requestSynchronized(boolean z, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, String str, boolean z2) throws Throwable {
        String str2;
        if (hashMap2 != null) {
            String fromHashMap = HashonHelper.fromHashMap(hashMap2);
            if (fromHashMap.length() != 0) {
                str2 = fromHashMap;
                return (T) requestSynchronized(z, hashMap, str2, str, z2);
            }
        }
        str2 = "{}";
        return (T) requestSynchronized(z, hashMap, str2, str, z2);
    }

    public <T> T requestSynchronized(boolean z, HashMap<String, String> hashMap, String str, String str2, boolean z2) throws Throwable {
        byte[] a2 = a();
        String a3 = a(a2, str, z2);
        HashMap<String, String> a4 = a(z, hashMap, str, a3.getBytes("utf-8").length);
        boolean z3 = true;
        String[] strArr = new String[1];
        HttpResponseCallback a5 = a(a2, strArr);
        StringPart stringPart = new StringPart();
        stringPart.append(a3);
        MobLog.getInstance().d(">>>  request(" + str2 + "): " + str + "\nheader = " + a4.toString(), new Object[0]);
        try {
            a.a((String) null);
        } catch (Throwable unused) {
            z3 = false;
        }
        if (z3) {
            a.a(false, str2, a4, stringPart, -1, a5, this.f4439g);
        } else {
            this.f4438f.rawPost(str2, a4, stringPart, -1, a5, this.f4439g);
        }
        if (strArr[0] != null) {
            MobLog.getInstance().d(">>> response(" + str2 + "): " + strArr[0], new Object[0]);
            return (T) a(strArr[0]);
        }
        return null;
    }

    private byte[] a() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeLong(this.b.nextLong());
        dataOutputStream.writeLong(this.b.nextLong());
        dataOutputStream.flush();
        dataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private String a(byte[] bArr, String str, boolean z) throws Throwable {
        byte[] bytes = str.getBytes("utf-8");
        if (z) {
            bytes = a(bytes);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] encode = this.f4437e.encode(bArr, this.c, this.f4436d);
        dataOutputStream.writeInt(encode.length);
        dataOutputStream.write(encode);
        byte[] AES128Encode = Data.AES128Encode(bArr, bytes);
        dataOutputStream.writeInt(AES128Encode.length);
        dataOutputStream.write(AES128Encode);
        dataOutputStream.flush();
        dataOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    private HashMap<String, String> a(boolean z, HashMap<String, String> hashMap, String str, int i2) throws Throwable {
        HashMap<String, String> a2 = z ? a(str, i2) : null;
        if (a2 == null) {
            a2 = new HashMap<>();
        }
        if (hashMap != null) {
            a2.putAll(hashMap);
        }
        return a2;
    }

    private HashMap<String, String> a(String str, int i2) throws Throwable {
        HashMap<String, String> commonDefaultHeaders = getCommonDefaultHeaders();
        String b = o.b("004:efcdeecj");
        commonDefaultHeaders.put(b, Data.MD5(str + MobSDK.getAppSecret()));
        commonDefaultHeaders.put(o.b("003@ci-hAch"), MobSDK.getAppkey());
        commonDefaultHeaders.put(o.b("014 ffdbcjOchEcj2cZghdj0h<cjeeVcb"), String.valueOf(i2));
        return commonDefaultHeaders;
    }

    private HttpResponseCallback a(byte[] bArr, String[] strArr) {
        return new HttpResponseCallback(this, strArr, bArr) { // from class: com.mob.tools.network.NetCommunicator.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String[] f4448a;
            public final /* synthetic */ byte[] b;
            public final /* synthetic */ NetCommunicator c;

            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(HttpConnection httpConnection) throws Throwable {
        List<String> a2 = a(httpConnection, o.b("0148ffdbcj+chWcj<c)ghdj[h3cjee(cb"));
        if (a2 == null || a2.size() <= 0) {
            return -1L;
        }
        return Long.parseLong(a2.get(0));
    }

    private List<String> a(HttpConnection httpConnection, String str) throws Throwable {
        Map<String, List<String>> headerFields = httpConnection.getHeaderFields();
        if (headerFields == null || headerFields.isEmpty()) {
            return null;
        }
        for (String str2 : headerFields.keySet()) {
            if (str2 != null && str2.equals(str)) {
                return headerFields.get(str2);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(byte[] bArr, byte[] bArr2) throws Throwable {
        return new String(Data.AES128Decode(bArr, Base64.decode(bArr2, 2)), "utf-8");
    }

    private Object a(String str) throws Throwable {
        if (str != null) {
            HashMap fromJson = HashonHelper.fromJson(str.trim());
            if (!fromJson.isEmpty()) {
                Object obj = fromJson.get(o.b("003XcgOh+ef"));
                return obj == null ? fromJson.get(o.b("004g8ceXcJce")) : obj;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(o.b("006'efDcSce$cCcbef"), -1);
            hashMap.put(o.b("005hRcgcgdbcg"), "RS is empty");
            throw new NetworkError(HashonHelper.fromHashMap(hashMap));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(o.b("006,ef6cQce<c;cbef"), -1);
        hashMap2.put(o.b("005h=cgcgdbcg"), "RS is empty");
        throw new NetworkError(HashonHelper.fromHashMap(hashMap2));
    }
}
