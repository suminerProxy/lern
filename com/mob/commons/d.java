package com.mob.commons;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import com.mob.MobSDK;
import com.mob.tools.MDP;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetCommunicator;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.FileUtils;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.SQLiteHelper;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import net.sourceforge.pinyin4j.ChineseToPinyinResource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f3584a;
    private static volatile SQLiteHelper.SingleTableDB b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private static final a[] f3591a = new a[3];
        private long b;
        private HashMap<String, Object> c;

        private a(long j2, HashMap<String, Object> hashMap) {
            this.b = j2;
            this.c = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.a(m.a(m.b), new l(this) { // from class: com.mob.commons.d.a.1

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ a f3592a;

                    /* renamed from: com.mob.commons.d$a$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
                    public class C00881 implements DH.DHResponder {

                        /* renamed from: a  reason: collision with root package name */
                        public final /* synthetic */ AnonymousClass1 f3593a;

                        public C00881(AnonymousClass1 anonymousClass1) {
                        }

                        @Override // com.mob.tools.utils.DH.DHResponder
                        public void onResponse(DH.DHResponse dHResponse) {
                        }
                    }

                    @Override // com.mob.commons.l
                    public boolean a(FileLocker fileLocker) {
                    }
                });
            } finally {
                try {
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(long j2, HashMap<String, Object> hashMap) {
            a[] aVarArr = f3591a;
            synchronized (aVarArr) {
                for (int i2 = 0; i2 < 3; i2++) {
                    a aVar = aVarArr[i2];
                    if (aVar != null) {
                        aVar.b = j2;
                        HashMap<String, Object> hashMap2 = aVar.c;
                        if (hashMap2 != null) {
                            hashMap2.clear();
                        }
                        aVar.c = hashMap;
                        aVarArr[i2] = null;
                        return aVar;
                    }
                }
                return new a(j2, hashMap);
            }
        }

        private void a() {
            try {
                a[] aVarArr = f3591a;
                synchronized (aVarArr) {
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (aVarArr[i2] == null) {
                            this.b = 0L;
                            HashMap<String, Object> hashMap = this.c;
                            if (hashMap != null) {
                                hashMap.clear();
                            }
                            this.c = null;
                            aVarArr[i2] = this;
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class b implements Runnable {
        private static final b[] b;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3594a = false;

        static {
            b = r0;
            b[] bVarArr = {new b()};
        }

        private static b b() {
            b[] bVarArr = b;
            synchronized (bVarArr) {
                b bVar = bVarArr[0];
                if (bVar != null) {
                    bVarArr[0] = null;
                    if (bVar.f3594a) {
                        bVar.f3594a = false;
                    }
                    return bVar;
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            try {
                b[] bVarArr = b;
                synchronized (bVarArr) {
                    if (bVarArr[0] == null) {
                        bVarArr[0] = this;
                    }
                }
                this.f3594a = false;
            } catch (Throwable unused) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            DH.requester(MobSDK.getContext()).getDeviceKey().getIMEI().getSerialno().getDetailNetworkTypeForStatic().getDataNtType().request(new DH.DHResponder(this) { // from class: com.mob.commons.d.b.1

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ b f3595a;

                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                }
            });
        }

        public static /* synthetic */ b a() {
            return b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a(String[][] strArr) {
            Cursor cursor = null;
            int i2 = 0;
            try {
                cursor = SQLiteHelper.query(d.b, new String[]{k.a("004bMbcQjg"), k.a("004f'bd;bYbd")}, null, null, null);
                if (cursor == null) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return 0;
                } else if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    return 0;
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i3 = 0;
                    do {
                        try {
                            String[] strArr2 = new String[2];
                            strArr2[0] = cursor.getString(0);
                            strArr2[1] = cursor.getString(1);
                            long j2 = -1;
                            try {
                                j2 = Long.parseLong(strArr2[0]);
                            } catch (Throwable unused3) {
                            }
                            if (j2 <= currentTimeMillis) {
                                strArr[i3] = strArr2;
                                i3++;
                            }
                            if (i3 >= strArr.length) {
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            i2 = i3;
                            try {
                                MobLog.getInstance().w(th);
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Throwable unused4) {
                                    }
                                }
                                return i2;
                            } catch (Throwable th2) {
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Throwable unused5) {
                                    }
                                }
                                throw th2;
                            }
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        try {
                            cursor.close();
                            return i3;
                        } catch (Throwable unused6) {
                            return i3;
                        }
                    }
                    return i3;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a(SparseArray<String> sparseArray) {
            try {
                StringBuilder sb = new StringBuilder();
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append('\'');
                    sb.append(sparseArray.valueAt(i2));
                    sb.append('\'');
                }
                return SQLiteHelper.delete(d.b, "time in (" + sb.toString() + ChineseToPinyinResource.Field.RIGHT_BRACKET, null);
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
                return 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SparseArray<String> a(String[][] strArr, int i2, DH.DHResponse dHResponse) {
            HashMap hashMap;
            ArrayList arrayList;
            SparseArray<String> sparseArray = new SparseArray<>();
            try {
                hashMap = new HashMap();
                hashMap.put(k.a("004c*cbbd@b"), Integer.valueOf(DH.SyncMtd.getPlatformCode()));
                hashMap.put(k.a("006fghJbcbeGg"), dHResponse.getDeviceKey());
                hashMap.put(k.a("005j-caWfg*cb"), DH.SyncMtd.getModel());
                hashMap.put(k.a("004f:babcGf"), e.a((MobProduct) null));
                hashMap.put("iemt", dHResponse.getIMEI());
                hashMap.put("snmt", dHResponse.getSerialno());
                hashMap.put(k.a("011:bi3gb[dbcabfbh+b6bg7cg"), dHResponse.getDetailNetworkTypeForStatic());
                hashMap.put(k.a("015fEbdZb%bdcdPgb6dbcabfbhcgbg1cg"), Integer.valueOf(dHResponse.getDataNtType()));
                arrayList = new ArrayList();
                byte[] rawMD5 = Data.rawMD5(DH.SyncMtd.getManufacturer());
                for (int i3 = 0; i3 < i2; i3++) {
                    String[] strArr2 = strArr[i3];
                    HashMap fromJson = HashonHelper.fromJson(new String(Data.AES128Decode(rawMD5, Base64.decode(strArr2[1], 2)), "utf-8").trim());
                    sparseArray.put(i3, strArr2[0]);
                    arrayList.add(fromJson);
                }
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
            }
            if (arrayList.isEmpty()) {
                return new SparseArray<>();
            }
            hashMap.put(k.a("005f9bd6b%bdde"), arrayList);
            hashMap.put(k.a("005b7cabh>gFbi"), y.a().b());
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put(k.a("013IccdeSgBbffgceNfg'bi]bZbcPb0bg"), w.c());
            hashMap2.put(k.a("004j$cabcCf"), com.mob.tools.a.c.a(MobSDK.getContext()).b().aY());
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 30000;
            networkTimeOut.connectionTimeout = 30000;
            if (!"200".equals(String.valueOf(HashonHelper.fromJson(new NetworkHelper().httpPostWithBytes(c.a(c.c) + "/v6/gcl", a(HashonHelper.fromHashMap(hashMap)), hashMap2, networkTimeOut)).get(k.a("006Rde*b3bd*b:bade"))))) {
                sparseArray.clear();
            }
            return sparseArray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static byte[] a(String str) throws Throwable {
            DataOutputStream dataOutputStream;
            BufferedOutputStream bufferedOutputStream;
            DataOutputStream dataOutputStream2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream3 = null;
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
            try {
                SecureRandom secureRandom = new SecureRandom();
                dataOutputStream.writeLong(secureRandom.nextLong());
                dataOutputStream.writeLong(secureRandom.nextLong());
                dataOutputStream.flush();
                s.a(dataOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bufferedOutputStream = new BufferedOutputStream(new GZIPOutputStream(byteArrayOutputStream2));
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedOutputStream.write(str.getBytes("utf-8"));
                    bufferedOutputStream.flush();
                    s.a(bufferedOutputStream);
                    byte[] AES128Encode = Data.AES128Encode(byteArray, byteArrayOutputStream2.toByteArray());
                    byte[] encode = new MobRSA(1024).encode(byteArray, new BigInteger("ceeef5035212dfe7c6a0acdc0ef35ce5b118aab916477037d7381f85c6b6176fcf57b1d1c3296af0bb1c483fe5e1eb0ce9eb2953b44e494ca60777a1b033cc07", 16), new BigInteger("191737288d17e660c4b61440d5d14228a0bf9854499f9d68d8274db55d6d954489371ecf314f26bec236e58fac7fffa9b27bcf923e1229c4080d49f7758739e5bd6014383ed2a75ce1be9b0ab22f283c5c5e11216c5658ba444212b6270d629f2d615b8dfdec8545fb7d4f935b0cc10b6948ab4fc1cb1dd496a8f94b51e888dd", 16));
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        dataOutputStream2 = new DataOutputStream(byteArrayOutputStream3);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        dataOutputStream2.writeInt(encode.length);
                        dataOutputStream2.write(encode);
                        dataOutputStream2.writeInt(AES128Encode.length);
                        dataOutputStream2.write(AES128Encode);
                        dataOutputStream2.flush();
                        s.a(dataOutputStream2);
                        return byteArrayOutputStream3.toByteArray();
                    } catch (Throwable th4) {
                        th = th4;
                        dataOutputStream = dataOutputStream2;
                        s.a(dataOutputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dataOutputStream3 = bufferedOutputStream;
                    s.a(dataOutputStream3);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                dataOutputStream3 = dataOutputStream;
                s.a(dataOutputStream3);
                throw th;
            }
        }
    }

    private d() {
        try {
            Context context = MobSDK.getContext();
            String str = k.f3634a;
            File dataCacheFile = ResHelper.getDataCacheFile(context, str, true);
            if (dataCacheFile.exists() && dataCacheFile.length() > 209715200) {
                dataCacheFile.delete();
                dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), str, true);
            }
            String absolutePath = dataCacheFile.getAbsolutePath();
            b = SQLiteHelper.getDatabase(absolutePath, k.a("008FdgbdHbHbdfbSg?bd)c") + h.l.a.a.c.f17369e + 1);
            b.addField(k.a("004bPbcHjg"), k.a("004bg4bjYb"), true);
            b.addField(k.a("004fEbd^b-bd"), k.a("004bg0bj)b"), true);
            b a2 = b.a();
            if (a2 != null) {
                com.mob.commons.a.o.a().a(0L, 180, a2);
            }
        } catch (Throwable th) {
            MobLog.getInstance().w(th);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:41:0x00fb
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.io.File b(java.lang.Object... r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.d.b(java.lang.Object[]):java.io.File");
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f3584a == null) {
                f3584a = new d();
            }
            dVar = f3584a;
        }
        return dVar;
    }

    public void a(long j2, HashMap<String, Object> hashMap) {
        boolean a2 = com.mob.commons.b.a();
        NLog mobLog = MobLog.getInstance();
        mobLog.d("DH PD: " + hashMap.get(k.a("004bSbg(cg")) + ", to: " + a2, new Object[0]);
        if (a2) {
            v.f3696d.execute(a.b(j2, hashMap));
        }
    }

    public static void a(Object... objArr) {
        try {
            g.a().a(13);
            ResHelper.deleteFileAndFolder(b(objArr));
        } catch (Throwable th) {
            g.a().a(4, th);
        }
    }

    public static void a(final ArrayList<HashMap<String, Object>> arrayList, final com.mob.tools.utils.b<Void> bVar) throws Throwable {
        if (arrayList != null && !arrayList.isEmpty()) {
            DH.requester(MobSDK.getContext()).getDeviceKey().getIMEI().getIMSI().getSerialno().getSimSerialNumber().getMIUIVersion().getAdvertisingID().getBssid().request(new DH.DHResponder() { // from class: com.mob.commons.d.1
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) {
                    MobProduct mobProduct = null;
                    try {
                        File file = new File(MobSDK.getContext().getFilesDir(), k.a("0039dedacb"));
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            HashMap hashMap = (HashMap) it.next();
                            Boolean bool = (Boolean) hashMap.get(k.a("0026bdde"));
                            boolean booleanValue = bool != null ? bool.booleanValue() : false;
                            String str = (String) hashMap.get(k.a("002Edfcb"));
                            String str2 = (String) hashMap.get("m");
                            String str3 = (String) hashMap.get("args");
                            Object obj = hashMap.get(k.a("002$bc+f"));
                            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                                String a2 = e.a(mobProduct);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(k.a("004fIbabcXf"), a2);
                                hashMap2.put(k.a("005b(cabh(gLbi"), y.a().b());
                                hashMap2.put(k.a("004j?cabcRf"), com.mob.tools.a.c.a(MobSDK.getContext()).b().aX());
                                hashMap2.put(k.a("010%de]fRbhed4gObfdebccabi"), Integer.valueOf(MobSDK.SDK_VERSION_CODE));
                                hashMap2.put(k.a("0069bd'ccSbhSgSbg"), MobSDK.getAppkey());
                                hashMap2.put(k.a("009>bdLccEcf,g@bebfHgb"), MobSDK.getAppSecret());
                                hashMap2.put(k.a("006fQca>jXbdbcbi"), MobSDK.getDomain().getDomain());
                                hashMap2.put(k.a("010Xdfcabfbe)gAfb-bbc4de"), Boolean.valueOf(MobSDK.checkForceHttps()));
                                hashMap2.put(k.a("004g[beWg bj"), Long.valueOf(((Long) com.mob.commons.b.a(k.a("004g0beRg-bj"), 5L)).longValue()));
                                hashMap2.put(k.a("002HbeYf"), (String) com.mob.commons.b.a(k.a("0028be@f"), k.a("006Geieiejejejej")));
                                hashMap2.put("usridt", w.e());
                                hashMap2.put(k.a("002[bcOf"), obj);
                                if (!TextUtils.isEmpty(str3)) {
                                    hashMap2.put("args", HashonHelper.fromJson(str3));
                                }
                                hashMap2.put(k.a("008fghJbcbe1g:ce6f"), dHResponse.getDeviceKey());
                                hashMap2.put(k.a("004QbcNjgRbc"), dHResponse.getIMEI());
                                hashMap2.put(k.a("004Abc2jPdebc"), dHResponse.getIMSI());
                                hashMap2.put("sno", dHResponse.getSerialno());
                                hashMap2.put("ssno", dHResponse.getSimSerialNumber());
                                hashMap2.put("miui", dHResponse.getMIUIVersion());
                                hashMap2.put(k.a("005j(ca_fgMcb"), DH.SyncMtd.getModel());
                                hashMap2.put(k.a("007Tdfbdbe*b6cabfbg"), DH.SyncMtd.getManufacturer());
                                hashMap2.put(k.a("005QdabfbdbiXf"), DH.SyncMtd.getBrand());
                                hashMap2.put(k.a("0055bd?fNdebc6f"), dHResponse.getAdvertisingID());
                                hashMap2.put(k.a("006(bd[cchg;bf"), DH.SyncMtd.getAppVersionName());
                                hashMap2.put("appVerCode", Integer.valueOf(DH.SyncMtd.getAppVersion()));
                                hashMap2.put(k.a("011cFbdbebhbddd,gQcdbd$jg"), DH.SyncMtd.getPackageName());
                                hashMap2.put(k.a("005DdadedebcDf"), dHResponse.getBssid());
                                hashMap2.put("osint", Integer.valueOf(DH.SyncMtd.getOSVersionInt()));
                                hashMap2.put("osname", DH.SyncMtd.getOSVersionName());
                                hashMap2.put("mdpName", MDP.class.getName());
                                String fromHashMap = HashonHelper.fromHashMap(hashMap2);
                                String checkHttpRequestUrl = NetCommunicator.checkHttpRequestUrl(str);
                                if (!TextUtils.isEmpty(str2)) {
                                    File file2 = new File(file, str2);
                                    if (booleanValue) {
                                        arrayList2.add(file2.getAbsolutePath());
                                    }
                                    d.b(String.valueOf(obj), file2, booleanValue, checkHttpRequestUrl, str2, fromHashMap);
                                }
                            }
                            mobProduct = null;
                        }
                        try {
                            FileUtils.deleteFilesInDirWithFilter(file, new FileFilter(this, arrayList2) { // from class: com.mob.commons.d.1.1

                                /* renamed from: a  reason: collision with root package name */
                                public final /* synthetic */ ArrayList f3586a;
                                public final /* synthetic */ AnonymousClass1 b;

                                @Override // java.io.FileFilter
                                public boolean accept(File file3) {
                                }
                            });
                        } catch (Throwable unused) {
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        } else {
            bVar.a(null);
        }
    }

    public static String a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            String f2 = t.f();
            if (iArr[i2] < f2.length()) {
                sb.append((char) (f2.charAt(iArr[i2]) - 2));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final String str, final File file, final boolean z, final String str2, final String str3, final String str4) {
        new Thread(new Runnable() { // from class: com.mob.commons.d.2
            @Override // java.lang.Runnable
            public void run() {
                FileOutputStream fileOutputStream;
                ByteArrayOutputStream byteArrayOutputStream;
                int i2 = 13;
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = null;
                    try {
                        if (z) {
                            try {
                                if (file.exists() && str3.equals(Data.MD5(file))) {
                                    if (d.b(str, 5, file.getAbsolutePath(), null, str4)) {
                                        return;
                                    }
                                    file.delete();
                                    return;
                                }
                                if (file.exists()) {
                                    file.delete();
                                }
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = null;
                                }
                                try {
                                    NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                                    networkTimeOut.readTimout = 60000;
                                    networkTimeOut.connectionTimeout = com.sobot.chat.core.a.a.a.b;
                                    new NetworkHelper().download(str2, fileOutputStream, networkTimeOut);
                                    s.a(fileOutputStream);
                                    if (file.length() > 0 && TextUtils.equals(str3, Data.MD5(file))) {
                                        if (d.b(str, 7, file.getAbsolutePath(), null, str4)) {
                                            return;
                                        }
                                        file.delete();
                                        return;
                                    } else if (file.exists()) {
                                        file.delete();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    s.a(fileOutputStream);
                                    if (file.length() > 0 && TextUtils.equals(str3, Data.MD5(file))) {
                                        if (!d.b(str, 7, file.getAbsolutePath(), null, str4)) {
                                            file.delete();
                                        }
                                    } else if (file.exists()) {
                                        file.delete();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = 5;
                                f.a().a(5, i2, th, str);
                                MobLog.getInstance().d(th);
                                return;
                            }
                        }
                        if (file.exists()) {
                            file.delete();
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        try {
                            NetworkHelper.NetworkTimeOut networkTimeOut2 = new NetworkHelper.NetworkTimeOut();
                            networkTimeOut2.readTimout = 60000;
                            networkTimeOut2.connectionTimeout = com.sobot.chat.core.a.a.a.b;
                            new NetworkHelper().download(str2, byteArrayOutputStream, networkTimeOut2);
                            s.a(byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (byteArray.length <= 0 || !TextUtils.equals(str3, Data.MD5(byteArray))) {
                                return;
                            }
                            d.b(str, 9, null, byteArray, str4);
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            s.a(byteArrayOutputStream2);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        i2 = 7;
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, int i2, String str2, byte[] bArr, String str3) {
        Method[] methods;
        try {
            Method method = null;
            boolean z = false;
            for (Method method2 : com.mob.tools.b.a.class.getMethods()) {
                Annotation[] annotations = method2.getAnnotations();
                if (annotations != null) {
                    int length = annotations.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        Annotation annotation = annotations[i3];
                        if (annotation != null && annotation.annotationType() == com.mob.tools.b.b.class) {
                            z = true;
                            method = method2;
                            break;
                        }
                        i3++;
                    }
                    if (z) {
                        break;
                    }
                }
            }
            if (bArr != null) {
                com.mob.commons.cc.a.a(MobSDK.getContext(), bArr, str3, method);
            } else {
                com.mob.commons.cc.a.a(MobSDK.getContext(), str2, str3, method);
            }
            return true;
        } catch (Throwable th) {
            try {
                f.a().a(6, i2, th, str);
                MobLog.getInstance().d(th);
            } catch (Throwable unused) {
            }
            return false;
        }
    }
}
