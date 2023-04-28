package com.mob.tools.network;

import android.content.Context;
import com.alipay.sdk.packet.e;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mob.MobSDK;
import com.mob.commons.k;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.proguard.EverythingKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileUtils;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.ReflectHelper;
import com.sobot.network.http.SobotOkHttpUtils;
import com.tencent.bugly.idasc.Bugly;
import h.a.a.a.a.i.c;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import kotlin.text.Typography;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class NetworkHelper implements EverythingKeeper {
    public static int connectionTimeout = 0;
    private static boolean followRedirects = true;
    public static int readTimout;
    public boolean instanceFollowRedirects = followRedirects;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class NetworkTimeOut implements PublicMemberKeeper {
        public int connectionTimeout;
        public int readTimout;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Object f4454a;
        private String b;

        public /* synthetic */ a(String str, AnonymousClass1 anonymousClass1) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        }

        private a(String str) {
        }
    }

    @Deprecated
    public static String checkHttpRequestUrl(String str) {
        return NetCommunicator.checkHttpRequestUrl(str);
    }

    private HttpURLConnection getConnection(String str, NetworkTimeOut networkTimeOut) throws Throwable {
        Object obj;
        boolean z;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        String a2 = k.a("012jgba=ca1fVcgcabhBg*bide");
        try {
            obj = ReflectHelper.getInstanceField(httpURLConnection, a2);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            a2 = "PERMITTED_USER_METHODS";
            try {
                obj = ReflectHelper.getStaticField("HttpURLConnection", "PERMITTED_USER_METHODS");
            } catch (Throwable unused2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (obj != null) {
            String[] strArr = (String[]) obj;
            String[] strArr2 = new String[strArr.length + 1];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[strArr.length] = k.a("005Refchcgeefb");
            if (z) {
                ReflectHelper.setStaticField("HttpURLConnection", a2, strArr2);
            } else {
                ReflectHelper.setInstanceField(httpURLConnection, a2, strArr2);
            }
        }
        System.setProperty("http.keepAlive", Bugly.SDK_IS_DEV);
        if (httpURLConnection instanceof HttpsURLConnection) {
            X509HostnameVerifier x509HostnameVerifier = SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLContext sSLContext = SSLContext.getInstance(k.a("003Ccgcicf"));
            TrustManager[] trustManagerArr = new TrustManager[0];
            try {
                trustManagerArr = new TrustManager[]{(TrustManager) getTrustManager(httpsURLConnection.getURL().getHost())};
            } catch (Throwable th) {
                MobLog.getInstance().e(th);
            }
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            httpsURLConnection.setHostnameVerifier(x509HostnameVerifier);
        }
        int i2 = networkTimeOut == null ? connectionTimeout : networkTimeOut.connectionTimeout;
        if (i2 > 0) {
            httpURLConnection.setConnectTimeout(i2);
        }
        int i3 = networkTimeOut == null ? readTimout : networkTimeOut.readTimout;
        if (i3 > 0) {
            httpURLConnection.setReadTimeout(i3);
        }
        return httpURLConnection;
    }

    @Deprecated
    private HTTPPart getDataPostHttpPart(HttpURLConnection httpURLConnection, String str, byte[] bArr) throws Throwable {
        ByteArrayPart byteArrayPart = new ByteArrayPart();
        byteArrayPart.append(bArr);
        return byteArrayPart;
    }

    @Deprecated
    private HTTPPart getFilePostHTTPPart(HttpURLConnection httpURLConnection, String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2) throws Throwable {
        FileInputStream fileInputStream;
        String uuid = UUID.randomUUID().toString();
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + uuid);
        MultiPart multiPart = new MultiPart();
        StringPart stringPart = new StringPart();
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                stringPart.append(HelpFormatter.DEFAULT_LONG_OPT_PREFIX).append(uuid).append("\r\n");
                stringPart.append("Content-Disposition: form-data; name=\"").append(next.name).append("\"\r\n\r\n");
                stringPart.append(next.value).append("\r\n");
            }
        }
        multiPart.append(stringPart);
        Iterator<KVPair<String>> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            KVPair<String> next2 = it2.next();
            StringPart stringPart2 = new StringPart();
            File file = new File(next2.value);
            stringPart2.append(HelpFormatter.DEFAULT_LONG_OPT_PREFIX).append(uuid).append("\r\n");
            stringPart2.append("Content-Disposition: form-data; name=\"").append(next2.name).append("\"; filename=\"").append(file.getName()).append("\"\r\n");
            String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(next2.value);
            if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                if (next2.value.toLowerCase().endsWith("jpg") || next2.value.toLowerCase().endsWith("jpeg")) {
                    contentTypeFor = MimeTypes.IMAGE_JPEG;
                } else if (next2.value.toLowerCase().endsWith("png")) {
                    contentTypeFor = "image/png";
                } else if (next2.value.toLowerCase().endsWith("gif")) {
                    contentTypeFor = "image/gif";
                } else {
                    FileInputStream fileInputStream2 = null;
                    try {
                        fileInputStream = new FileInputStream(next2.value);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        contentTypeFor = URLConnection.guessContentTypeFromStream(fileInputStream);
                        FileUtils.closeIO(fileInputStream);
                        if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                            contentTypeFor = c.f15657e;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        FileUtils.closeIO(fileInputStream2);
                        throw th;
                    }
                }
            }
            stringPart2.append("Content-Type: ").append(contentTypeFor).append("\r\n\r\n");
            multiPart.append(stringPart2);
            FilePart filePart = new FilePart();
            filePart.setFile(next2.value);
            multiPart.append(filePart);
            StringPart stringPart3 = new StringPart();
            stringPart3.append("\r\n");
            multiPart.append(stringPart3);
        }
        StringPart stringPart4 = new StringPart();
        stringPart4.append(HelpFormatter.DEFAULT_LONG_OPT_PREFIX).append(uuid).append("--\r\n");
        multiPart.append(stringPart4);
        return multiPart;
    }

    @Deprecated
    private HTTPPart getTextPostHTTPPart(HttpURLConnection httpURLConnection, String str, ArrayList<KVPair<String>> arrayList) throws Throwable {
        httpURLConnection.setRequestProperty("Content-Type", k.a("033Jbd*ccOcbbcbebd@b^bccabi+e6bjfgdbdbdbfgdfcabf;jUfgbabfcbKgRbibecaEfgf"));
        StringPart stringPart = new StringPart();
        if (arrayList != null) {
            stringPart.append(requestParamsToUrl(kvPairsToObjHashMap(arrayList)));
        }
        return stringPart;
    }

    public static Object getTrustManager(String str) throws Throwable {
        Class<?> cls = Class.forName(k.a("030)fdbd9h:bdbjcjbi*gbGcjdedecbcjfefcdcffcgbfbadeUbAegbdbibdddFgZbf"));
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{cls}, new a(str, null));
    }

    @Deprecated
    private HashMap<String, Object> kvPairsToObjHashMap(ArrayList<KVPair<String>> arrayList) throws Throwable {
        if (arrayList == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        return hashMap;
    }

    @Deprecated
    private HashMap<String, String> kvPairsToStrHashMap(ArrayList<KVPair<String>> arrayList) throws Throwable {
        if (arrayList == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        return hashMap;
    }

    private String requestParamsToUrl(HashMap<String, Object> hashMap) throws Throwable {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            String urlEncode = Data.urlEncode(entry.getKey(), "utf-8");
            String urlEncode2 = entry.getValue() == null ? "" : Data.urlEncode(String.valueOf(entry.getValue()), "utf-8");
            if (sb.length() > 0) {
                sb.append(Typography.amp);
            }
            sb.append(urlEncode);
            sb.append('=');
            sb.append(urlEncode2);
        }
        return sb.toString();
    }

    private void setHeader(URLConnection uRLConnection, HashMap<String, String> hashMap) {
        if (hashMap == null || hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            uRLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public void download(String str, OutputStream outputStream, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, new RawNetworkCallback(this, new byte[1024], outputStream) { // from class: com.mob.tools.network.NetworkHelper.1

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ byte[] f4449a;
            public final /* synthetic */ OutputStream b;
            public final /* synthetic */ NetworkHelper c;

            @Override // com.mob.tools.network.RawNetworkCallback
            public void onResponse(InputStream inputStream) throws Throwable {
            }
        }, networkTimeOut);
        outputStream.flush();
    }

    public String downloadCache(Context context, String str, String str2, boolean z, NetworkTimeOut networkTimeOut) throws Throwable {
        return downloadCache(context, str, str2, z, networkTimeOut, null);
    }

    @Deprecated
    public String httpGet(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpGetNew(str, kvPairsToObjHashMap(arrayList), kvPairsToStrHashMap(arrayList2), networkTimeOut);
    }

    public String httpGetNew(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkTimeOut networkTimeOut) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader2;
        MobLog.getInstance().d(String.format("hgt: %s", str) + "\n" + String.format("hd: %s", hashMap2), new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        if (hashMap != null) {
            String requestParamsToUrl = requestParamsToUrl(hashMap);
            if (requestParamsToUrl.length() > 0) {
                str = str + "?" + requestParamsToUrl;
            }
        }
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap2);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        int responseCode = connection.getResponseCode();
        BufferedReader bufferedReader3 = null;
        if (responseCode == 200) {
            StringBuilder sb = new StringBuilder();
            try {
                inputStreamReader2 = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                try {
                    bufferedReader2 = new BufferedReader(inputStreamReader2);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader2 = null;
            }
            try {
                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(readLine);
                }
                FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                connection.disconnect();
                String sb2 = sb.toString();
                MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                return sb2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader3 = bufferedReader2;
                FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                throw th;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        try {
            inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
        }
        try {
            for (String readLine2 = bufferedReader.readLine(); readLine2 != null; readLine2 = bufferedReader.readLine()) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(readLine2);
            }
            FileUtils.closeIO(bufferedReader, inputStreamReader);
            connection.disconnect();
            HashMap hashMap3 = new HashMap();
            hashMap3.put(k.a("005gFbfbfcabf"), sb3.toString());
            hashMap3.put(k.a("006.de;bFbd5b,bade"), Integer.valueOf(responseCode));
            throw new Throwable(HashonHelper.fromHashMap(hashMap3));
        } catch (Throwable th6) {
            th = th6;
            bufferedReader3 = bufferedReader;
            FileUtils.closeIO(bufferedReader3, inputStreamReader);
            throw th;
        }
    }

    @Deprecated
    public String httpPost(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpPostNew(str, kvPairsToObjHashMap(arrayList), kvPairsToStrHashMap(arrayList2), networkTimeOut);
    }

    @Deprecated
    public String httpPostFiles(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, ArrayList<KVPair<String>> arrayList3, int i2, NetworkTimeOut networkTimeOut) throws Throwable {
        HashMap hashMap = new HashMap();
        httpPost(str, arrayList, arrayList2, arrayList3, i2, new HttpResponseCallback(this, hashMap) { // from class: com.mob.tools.network.NetworkHelper.3

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HashMap f4451a;
            public final /* synthetic */ NetworkHelper b;

            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    @Deprecated
    public String httpPostFilesChecked(String str, ArrayList<KVPair<String>> arrayList, byte[] bArr, ArrayList<KVPair<String>> arrayList2, int i2, NetworkTimeOut networkTimeOut) throws Throwable {
        HashMap hashMap = new HashMap();
        httpPost(str, arrayList, bArr, arrayList2, i2, new HttpResponseCallback(this, hashMap) { // from class: com.mob.tools.network.NetworkHelper.4

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HashMap f4452a;
            public final /* synthetic */ NetworkHelper b;

            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    public String httpPostNew(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2, NetworkTimeOut networkTimeOut) throws Throwable {
        InputStream inputStream;
        OutputStream outputStream;
        InputStream inputStream2;
        Throwable th;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader2;
        InputStreamReader inputStreamReader3;
        long currentTimeMillis = System.currentTimeMillis();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("hpt: " + str + "\nhd: " + hashMap2, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        setHeader(connection, hashMap2);
        connection.setRequestProperty(k.a("010NeecabibiZgZbe$bObccabi"), "Keep-Alive");
        connection.setRequestProperty("Content-Type", k.a("033RbdKcc:cbbcbebd7b^bccabi7e1bjfgdbdbdbfgdfcabfRj[fgbabfcb!g>bibeca'fgf"));
        StringPart stringPart = new StringPart();
        if (hashMap != null) {
            stringPart.append(requestParamsToUrl(hashMap));
        }
        connection.setFixedLengthStreamingMode((int) stringPart.b());
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream2 = stringPart.toInputStream();
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            outputStream = null;
        }
        try {
            byte[] bArr = new byte[65536];
            for (int read = inputStream2.read(bArr); read > 0; read = inputStream2.read(bArr)) {
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200 && responseCode >= 300) {
                StringBuilder sb = new StringBuilder();
                try {
                    inputStreamReader3 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                    try {
                        bufferedReader2 = new BufferedReader(inputStreamReader3);
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader2 = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader2 = null;
                    inputStreamReader3 = null;
                }
                try {
                    for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                    }
                    FileUtils.closeIO(bufferedReader2, inputStreamReader3);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put(k.a("005g$bfbfcabf"), sb.toString());
                    hashMap3.put(k.a("006(de:bEbdXbMbade"), Integer.valueOf(responseCode));
                    throw new Throwable(HashonHelper.fromHashMap(hashMap3));
                } catch (Throwable th6) {
                    th = th6;
                    FileUtils.closeIO(bufferedReader2, inputStreamReader3);
                    throw th;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            try {
                inputStreamReader2 = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
            } catch (Throwable th7) {
                th = th7;
                inputStreamReader = null;
            }
            try {
                BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                try {
                    for (String readLine2 = bufferedReader3.readLine(); readLine2 != null; readLine2 = bufferedReader3.readLine()) {
                        if (sb2.length() > 0) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine2);
                    }
                    FileUtils.closeIO(bufferedReader3, inputStreamReader2);
                    String sb3 = sb2.toString();
                    connection.disconnect();
                    FileUtils.closeIO(inputStream2, outputStream);
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    return sb3;
                } catch (Throwable th8) {
                    th = th8;
                    inputStreamReader = inputStreamReader2;
                    bufferedReader = bufferedReader3;
                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                inputStreamReader = inputStreamReader2;
                bufferedReader = null;
                FileUtils.closeIO(bufferedReader, inputStreamReader);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            inputStream = inputStream2;
            connection.disconnect();
            FileUtils.closeIO(inputStream, outputStream);
            NLog mobLog3 = MobLog.getInstance();
            mobLog3.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            throw th;
        }
    }

    public String httpPostWithBytes(String str, byte[] bArr, HashMap<String, String> hashMap, NetworkTimeOut networkTimeOut) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        OutputStream outputStream;
        ByteArrayInputStream byteArrayInputStream2;
        Throwable th;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3;
        InputStreamReader inputStreamReader3;
        BufferedReader bufferedReader4;
        long currentTimeMillis = System.currentTimeMillis();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("hpt: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        setHeader(connection, hashMap);
        connection.setRequestProperty(k.a("010Ieecabibi7g7be=bRbccabi"), "Keep-Alive");
        connection.setRequestProperty("Content-Type", c.f15657e);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
            try {
                byte[] bytes = MobSDK.getAppkey().getBytes("utf-8");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(bytes.length);
                dataOutputStream.write(bytes);
                dataOutputStream.write(bArr);
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream = null;
            }
            try {
                byte[] bArr2 = new byte[65536];
                for (int read = byteArrayInputStream2.read(bArr2); read > 0; read = byteArrayInputStream2.read(bArr2)) {
                    outputStream.write(bArr2, 0, read);
                }
                outputStream.flush();
                int responseCode = connection.getResponseCode();
                if (responseCode != 200 && responseCode >= 300) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        inputStreamReader3 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            bufferedReader4 = new BufferedReader(inputStreamReader3);
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader3 = null;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader3 = null;
                        inputStreamReader3 = null;
                    }
                    try {
                        for (String readLine = bufferedReader4.readLine(); readLine != null; readLine = bufferedReader4.readLine()) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                        }
                        FileUtils.closeIO(bufferedReader4, inputStreamReader3);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(k.a("005gObfbfcabf"), sb.toString());
                        hashMap2.put(k.a("006HdeEbUbd5bLbade"), Integer.valueOf(responseCode));
                        throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedReader3 = bufferedReader4;
                        FileUtils.closeIO(bufferedReader3, inputStreamReader3);
                        throw th;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                try {
                    inputStreamReader2 = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                } catch (Throwable th6) {
                    th = th6;
                    inputStreamReader = null;
                }
                try {
                    bufferedReader2 = new BufferedReader(inputStreamReader2);
                } catch (Throwable th7) {
                    th = th7;
                    inputStreamReader = inputStreamReader2;
                    bufferedReader = null;
                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                    throw th;
                }
                try {
                    for (String readLine2 = bufferedReader2.readLine(); readLine2 != null; readLine2 = bufferedReader2.readLine()) {
                        if (sb2.length() > 0) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine2);
                    }
                    FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                    String sb3 = sb2.toString();
                    connection.disconnect();
                    FileUtils.closeIO(byteArrayInputStream2, outputStream);
                    NLog mobLog2 = MobLog.getInstance();
                    mobLog2.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    return sb3;
                } catch (Throwable th8) {
                    th = th8;
                    inputStreamReader = inputStreamReader2;
                    bufferedReader = bufferedReader2;
                    FileUtils.closeIO(bufferedReader, inputStreamReader);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                byteArrayInputStream = byteArrayInputStream2;
                connection.disconnect();
                FileUtils.closeIO(byteArrayInputStream, outputStream);
                NLog mobLog3 = MobLog.getInstance();
                mobLog3.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            byteArrayInputStream = null;
            outputStream = null;
        }
    }

    @Deprecated
    public String httpPut(String str, ArrayList<KVPair<String>> arrayList, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        return httpPut(str, kvPairsToObjHashMap(arrayList), kVPair, arrayList2, networkTimeOut, null);
    }

    @Deprecated
    public String jsonPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut) throws Throwable {
        HashMap hashMap = new HashMap();
        jsonPost(str, arrayList, arrayList2, networkTimeOut, new HttpResponseCallback(this, hashMap) { // from class: com.mob.tools.network.NetworkHelper.2

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HashMap f4450a;
            public final /* synthetic */ NetworkHelper b;

            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
            }
        });
        if (hashMap.containsKey(k.a("003_bf:g de"))) {
            return (String) hashMap.get(k.a("003BbfQg,de"));
        }
        return null;
    }

    @Deprecated
    public void rawGet(String str, ArrayList<KVPair<String>> arrayList, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, kvPairsToStrHashMap(arrayList), rawNetworkCallback, networkTimeOut);
    }

    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawPost(str, arrayList, hTTPPart, 0, httpResponseCallback, networkTimeOut);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x024e A[Catch: all -> 0x02b5, TryCatch #4 {all -> 0x02b5, blocks: (B:99:0x022c, B:106:0x024e, B:108:0x0254, B:110:0x025a, B:111:0x025d, B:117:0x0270, B:118:0x0283, B:103:0x023d), top: B:166:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020f A[Catch: all -> 0x02b7, TryCatch #6 {all -> 0x02b7, blocks: (B:91:0x0206, B:93:0x020f, B:97:0x021c), top: B:169:0x0206 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String downloadCache(android.content.Context r20, java.lang.String r21, java.lang.String r22, boolean r23, com.mob.tools.network.NetworkHelper.NetworkTimeOut r24, com.mob.tools.network.FileDownloadListener r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.network.NetworkHelper.downloadCache(android.content.Context, java.lang.String, java.lang.String, boolean, com.mob.tools.network.NetworkHelper$NetworkTimeOut, com.mob.tools.network.FileDownloadListener):java.lang.String");
    }

    public String httpGet(String str, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) throws Throwable {
        NetworkTimeOut networkTimeOut = new NetworkTimeOut();
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 10000;
        return httpGetNew(str, hashMap, hashMap2, networkTimeOut);
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, ArrayList<KVPair<String>> arrayList3, int i2, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        HTTPPart textPostHTTPPart;
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(k.a("010)eecabibi9g:beIb2bccabi"), "Keep-Alive");
        if (arrayList2 != null && arrayList2.size() > 0) {
            textPostHTTPPart = getFilePostHTTPPart(connection, str, arrayList, arrayList2);
            if (i2 >= 0) {
                connection.setChunkedStreamingMode(i2);
            }
        } else {
            textPostHTTPPart = getTextPostHTTPPart(connection, str, arrayList);
            connection.setFixedLengthStreamingMode((int) textPostHTTPPart.b());
        }
        if (arrayList3 != null) {
            Iterator<KVPair<String>> it = arrayList3.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
        } catch (Throwable th) {
            th = th;
            outputStream = null;
        }
        try {
            inputStream = textPostHTTPPart.toInputStream();
            byte[] bArr = new byte[65536];
            for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                    connection.disconnect();
                } finally {
                }
            }
            MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th2) {
            th = th2;
            FileUtils.closeIO(inputStream, outputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public String httpPut(String str, HashMap<String, Object> hashMap, KVPair<String> kVPair, ArrayList<KVPair<String>> arrayList, NetworkTimeOut networkTimeOut, OnReadListener onReadListener) throws Throwable {
        OutputStream outputStream;
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader2;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPut: " + str);
        if (hashMap != null) {
            String requestParamsToUrl = requestParamsToUrl(hashMap);
            if (requestParamsToUrl.length() > 0) {
                str = str + "?" + requestParamsToUrl;
            }
        }
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        connection.setRequestMethod(SobotOkHttpUtils.METHOD.PUT);
        connection.setRequestProperty("Content-Type", c.f15657e);
        setHeader(connection, kvPairsToStrHashMap(arrayList));
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream2 = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                FilePart filePart = new FilePart();
                if (onReadListener != null) {
                    filePart.setOnReadListener(onReadListener);
                }
                filePart.setFile(kVPair.value);
                inputStream = filePart.toInputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            byte[] bArr = new byte[65536];
            for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            int responseCode = connection.getResponseCode();
            if (responseCode != 200 && responseCode != 201) {
                StringBuilder sb = new StringBuilder();
                try {
                    inputStreamReader2 = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                    try {
                        bufferedReader2 = new BufferedReader(inputStreamReader2);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamReader2 = null;
                }
                try {
                    for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                    }
                    FileUtils.closeIO(bufferedReader2, inputStreamReader2);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(k.a("005g^bfbfcabf"), sb.toString());
                    hashMap2.put(k.a("006GdeTb,bdCb(bade"), Integer.valueOf(responseCode));
                    throw new Throwable(new Hashon().fromHashMap(hashMap2));
                } catch (Throwable th5) {
                    th = th5;
                    inputStream2 = bufferedReader2;
                    FileUtils.closeIO(inputStream2, inputStreamReader2);
                    throw th;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            try {
                inputStreamReader = new InputStreamReader(connection.getInputStream(), Charset.forName("utf-8"));
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                inputStreamReader = null;
            }
            try {
                for (String readLine2 = bufferedReader.readLine(); readLine2 != null; readLine2 = bufferedReader.readLine()) {
                    if (sb2.length() > 0) {
                        sb2.append('\n');
                    }
                    sb2.append(readLine2);
                }
                FileUtils.closeIO(bufferedReader, inputStreamReader);
                connection.disconnect();
                String sb3 = sb2.toString();
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
                return sb3;
            } catch (Throwable th8) {
                th = th8;
                inputStream2 = bufferedReader;
                FileUtils.closeIO(inputStream2, inputStreamReader);
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            inputStream2 = inputStream;
            FileUtils.closeIO(inputStream2, outputStream);
            throw th;
        }
    }

    @Deprecated
    public void rawGet(String str, ArrayList<KVPair<String>> arrayList, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, kvPairsToStrHashMap(arrayList), httpResponseCallback, networkTimeOut);
    }

    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, int i2, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawPost(str, kvPairsToStrHashMap(arrayList), hTTPPart, 0, httpResponseCallback, networkTimeOut);
    }

    public void rawGet(String str, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, new HashMap<>(), rawNetworkCallback, networkTimeOut);
    }

    public void rawPost(String str, HashMap<String, String> hashMap, HTTPPart hTTPPart, int i2, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("hptr: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        if (i2 >= 0) {
            connection.setChunkedStreamingMode(0);
        }
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
        } catch (Throwable th) {
            th = th;
            outputStream = null;
        }
        try {
            inputStream = hTTPPart.toInputStream();
            byte[] bArr = new byte[65536];
            for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                    connection.disconnect();
                } finally {
                }
            }
            MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        } catch (Throwable th2) {
            th = th2;
            FileUtils.closeIO(inputStream, outputStream);
            throw th;
        }
    }

    public void rawGet(String str, HashMap<String, String> hashMap, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().d("rawGet: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            if (rawNetworkCallback != null) {
                InputStream inputStream = connection.getInputStream();
                try {
                    rawNetworkCallback.onResponse(inputStream);
                    FileUtils.closeIO(inputStream);
                    connection.disconnect();
                } finally {
                }
            } else {
                connection.disconnect();
            }
            MobLog.getInstance().d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamReader = null;
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(readLine);
            }
            FileUtils.closeIO(bufferedReader, inputStreamReader);
            connection.disconnect();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(k.a("005g$bfbfcabf"), sb.toString());
            hashMap2.put(k.a("006]deDb)bd0b]bade"), Integer.valueOf(responseCode));
            throw new Throwable(HashonHelper.fromHashMap(hashMap2));
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            FileUtils.closeIO(bufferedReader2, inputStreamReader);
            throw th;
        }
    }

    @Deprecated
    private void jsonPost(String str, ArrayList<KVPair<String>> arrayList, ArrayList<KVPair<String>> arrayList2, NetworkTimeOut networkTimeOut, HttpResponseCallback httpResponseCallback) throws Throwable {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            hashMap.put(next.name, next.value);
        }
        jsonPost(str, hashMap, arrayList2, networkTimeOut, httpResponseCallback);
    }

    @Deprecated
    public void jsonPost(String str, HashMap<String, Object> hashMap, ArrayList<KVPair<String>> arrayList, NetworkTimeOut networkTimeOut, HttpResponseCallback httpResponseCallback) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("jsonPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        connection.setRequestProperty(e.f723d, "application/json");
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        StringPart stringPart = new StringPart();
        if (hashMap != null) {
            stringPart.append(new Hashon().fromHashMap(hashMap));
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
        } catch (Throwable th) {
            th = th;
            outputStream = null;
        }
        try {
            inputStream = stringPart.toInputStream();
            byte[] bArr = new byte[65536];
            for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                    connection.disconnect();
                } finally {
                }
            }
            MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th2) {
            th = th2;
            FileUtils.closeIO(inputStream, outputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void rawPost(String str, ArrayList<KVPair<String>> arrayList, HTTPPart hTTPPart, RawNetworkCallback rawNetworkCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        InputStreamReader inputStreamReader;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("rawpost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setChunkedStreamingMode(0);
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                InputStream inputStream2 = hTTPPart.toInputStream();
                try {
                    byte[] bArr = new byte[65536];
                    for (int read = inputStream2.read(bArr); read > 0; read = inputStream2.read(bArr)) {
                        outputStream.write(bArr, 0, read);
                    }
                    outputStream.flush();
                    FileUtils.closeIO(inputStream2, outputStream);
                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200) {
                        if (rawNetworkCallback != null) {
                            InputStream inputStream3 = connection.getInputStream();
                            try {
                                rawNetworkCallback.onResponse(inputStream3);
                                FileUtils.closeIO(inputStream3);
                                connection.disconnect();
                            } finally {
                            }
                        } else {
                            connection.disconnect();
                        }
                        MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    try {
                        inputStreamReader = new InputStreamReader(connection.getErrorStream(), Charset.forName("utf-8"));
                        try {
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            try {
                                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(readLine);
                                }
                                FileUtils.closeIO(bufferedReader, inputStreamReader);
                                connection.disconnect();
                                HashMap hashMap = new HashMap();
                                hashMap.put(k.a("005gIbfbfcabf"), sb.toString());
                                hashMap.put(k.a("006Fde!bPbd4b6bade"), Integer.valueOf(responseCode));
                                throw new Throwable(new Hashon().fromHashMap(hashMap));
                            } catch (Throwable th) {
                                th = th;
                                inputStream = bufferedReader;
                                FileUtils.closeIO(inputStream, inputStreamReader);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamReader = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = inputStream2;
                    FileUtils.closeIO(inputStream, outputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            outputStream = null;
        }
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, byte[] bArr, ArrayList<KVPair<String>> arrayList2, int i2, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        HTTPPart textPostHTTPPart;
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(k.a("010.eecabibi%gRbe_b$bccabi"), "Keep-Alive");
        if (bArr != null && bArr.length > 0) {
            textPostHTTPPart = getDataPostHttpPart(connection, str, bArr);
            if (i2 >= 0) {
                connection.setChunkedStreamingMode(i2);
            }
        } else {
            textPostHTTPPart = getTextPostHTTPPart(connection, str, arrayList);
            connection.setFixedLengthStreamingMode((int) textPostHTTPPart.b());
        }
        if (arrayList2 != null) {
            Iterator<KVPair<String>> it = arrayList2.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        InputStream inputStream = null;
        try {
            outputStream = connection.getOutputStream();
            try {
                inputStream = textPostHTTPPart.toInputStream();
                byte[] bArr2 = new byte[65536];
                for (int read = inputStream.read(bArr2); read > 0; read = inputStream.read(bArr2)) {
                    outputStream.write(bArr2, 0, read);
                }
                outputStream.flush();
                FileUtils.closeIO(inputStream, outputStream);
                if (httpResponseCallback != null) {
                    try {
                        httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                        connection.disconnect();
                    } finally {
                    }
                }
                MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                th = th;
                FileUtils.closeIO(inputStream, outputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    public void rawGet(String str, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        rawGet(str, new HashMap<>(), httpResponseCallback, networkTimeOut);
    }

    public void rawGet(String str, HashMap<String, String> hashMap, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        long currentTimeMillis = System.currentTimeMillis();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("rawGet: " + str, new Object[0]);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        setHeader(connection, hashMap);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        if (connection.getResponseCode() == 301) {
            rawGet(connection.getHeaderField(k.a("008-cicabebd=bIbccabi")), new HashMap<>(), httpResponseCallback, networkTimeOut);
        } else if (httpResponseCallback != null) {
            try {
                httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                connection.disconnect();
            } finally {
            }
        }
        NLog mobLog2 = MobLog.getInstance();
        mobLog2.d("use time: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
    }

    @Deprecated
    public String httpPost(String str, ArrayList<KVPair<String>> arrayList, int i2, NetworkTimeOut networkTimeOut) throws Throwable {
        HashMap hashMap = new HashMap();
        httpPost(str, arrayList, i2, new HttpResponseCallback(this, hashMap) { // from class: com.mob.tools.network.NetworkHelper.5

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HashMap f4453a;
            public final /* synthetic */ NetworkHelper b;

            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) throws Throwable {
            }
        }, networkTimeOut);
        return (String) hashMap.get("resp");
    }

    @Deprecated
    public void httpPost(String str, ArrayList<KVPair<String>> arrayList, int i2, HttpResponseCallback httpResponseCallback, NetworkTimeOut networkTimeOut) throws Throwable {
        OutputStream outputStream;
        long currentTimeMillis = System.currentTimeMillis();
        MobLog.getInstance().i("httpPost: " + str);
        HttpURLConnection connection = getConnection(str, networkTimeOut);
        connection.setDoOutput(true);
        connection.setRequestProperty(k.a("010Yeecabibi)gMbeAb+bccabi"), "Keep-Alive");
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                connection.setRequestProperty(next.name, next.value);
            }
        }
        StringPart stringPart = new StringPart();
        InputStream inputStream = null;
        stringPart.append(null);
        connection.setInstanceFollowRedirects(this.instanceFollowRedirects);
        connection.connect();
        try {
            outputStream = connection.getOutputStream();
        } catch (Throwable th) {
            th = th;
            outputStream = null;
        }
        try {
            inputStream = stringPart.toInputStream();
            byte[] bArr = new byte[65536];
            for (int read = inputStream.read(bArr); read > 0; read = inputStream.read(bArr)) {
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            FileUtils.closeIO(inputStream, outputStream);
            if (httpResponseCallback != null) {
                try {
                    httpResponseCallback.onResponse(new HttpConnectionImpl23(connection));
                    connection.disconnect();
                } finally {
                }
            }
            MobLog.getInstance().i("use time: " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th2) {
            th = th2;
            FileUtils.closeIO(inputStream, outputStream);
            throw th;
        }
    }
}
