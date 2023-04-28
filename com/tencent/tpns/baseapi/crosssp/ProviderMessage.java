package com.tencent.tpns.baseapi.crosssp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import com.tencent.tpns.baseapi.base.SettingsContentProvider;
import com.tencent.tpns.baseapi.base.util.Logger;
import com.tencent.tpns.baseapi.base.util.TTask;
import h.a.a.a.a.i.g;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.cli.HelpFormatter;

/* compiled from: ProGuard */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ProviderMessage {

    /* renamed from: a  reason: collision with root package name */
    private static SettingsContentProvider f13706a;
    private static ConcurrentHashMap<String, List<Long>> b = new ConcurrentHashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a<T> extends TTask {

        /* renamed from: a  reason: collision with root package name */
        public static long f13707a;
        public static long b;
        public static long c;

        /* renamed from: d  reason: collision with root package name */
        public static long f13708d;

        /* renamed from: e  reason: collision with root package name */
        private Context f13709e;

        /* renamed from: g  reason: collision with root package name */
        private Uri f13710g;

        /* renamed from: h  reason: collision with root package name */
        private String[] f13711h;

        /* renamed from: i  reason: collision with root package name */
        private String f13712i;

        /* renamed from: j  reason: collision with root package name */
        private String[] f13713j;

        /* renamed from: k  reason: collision with root package name */
        private String f13714k;

        /* renamed from: l  reason: collision with root package name */
        private ContentValues f13715l;

        /* renamed from: m  reason: collision with root package name */
        private String f13716m;

        /* renamed from: n  reason: collision with root package name */
        private int f13717n = 4;

        /* renamed from: o  reason: collision with root package name */
        private boolean f13718o;

        /* renamed from: p  reason: collision with root package name */
        private T f13719p;

        public a(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, boolean z) {
            this.f13709e = context;
            this.f13710g = uri;
            this.f13711h = strArr;
            this.f13712i = str;
            this.f13713j = strArr2;
            this.f13714k = str2;
            this.f13718o = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.tencent.tpns.baseapi.base.util.TTask
        public void TRun() {
            Object query;
            try {
                int i2 = this.f13717n;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                query = i2 != 5 ? null : Integer.valueOf(this.f13709e.getContentResolver().delete(this.f13710g, this.f13716m, this.f13713j));
                            } else {
                                query = Integer.valueOf(this.f13709e.getContentResolver().update(this.f13710g, this.f13715l, this.f13716m, this.f13713j));
                            }
                        } else if (this.f13718o) {
                            query = ProviderMessage.a().getType(this.f13710g);
                        } else {
                            query = this.f13709e.getContentResolver().getType(this.f13710g);
                        }
                    } else if (this.f13718o) {
                        query = ProviderMessage.a().insert(this.f13710g, this.f13715l);
                    } else {
                        query = this.f13709e.getContentResolver().insert(this.f13710g, this.f13715l);
                    }
                } else if (this.f13718o) {
                    query = ProviderMessage.a().query(this.f13710g, this.f13711h, this.f13712i, this.f13713j, this.f13714k);
                } else {
                    query = this.f13709e.getContentResolver().query(this.f13710g, this.f13711h, this.f13712i, this.f13713j, this.f13714k);
                }
                a(query);
            } catch (Throwable th) {
                Logger.e("ProviderMessage", "call", th);
            }
        }

        public T a() {
            return this.f13719p;
        }

        public void a(T t) {
            this.f13719p = t;
        }

        public static Cursor a(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            boolean z;
            if (!ProviderMessage.b(context, uri)) {
                z = false;
            } else if (Thread.currentThread().getId() != context.getMainLooper().getThread().getId()) {
                return ProviderMessage.a().query(uri, strArr, str, strArr2, str2);
            } else {
                z = true;
            }
            a aVar = new a(context, uri, strArr, str, strArr2, str2, z);
            Thread thread = new Thread(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append("tpnsQ-");
            long j2 = f13707a;
            f13707a = 1 + j2;
            sb.append(j2);
            thread.setName(sb.toString());
            thread.start();
            try {
                thread.join(1000L);
            } catch (Throwable th) {
                Logger.e("ProviderMessage", "myQuery", th);
            }
            return (Cursor) aVar.a();
        }

        public a(Context context, Uri uri, ContentValues contentValues, boolean z) {
            this.f13709e = context;
            this.f13710g = uri;
            this.f13715l = contentValues;
            this.f13718o = z;
        }

        public static Uri a(Context context, Uri uri, ContentValues contentValues) {
            boolean z;
            if (!ProviderMessage.b(context, uri)) {
                z = false;
            } else if (Thread.currentThread().getId() != context.getMainLooper().getThread().getId()) {
                return ProviderMessage.a().insert(uri, contentValues);
            } else {
                z = true;
            }
            a aVar = new a(context, uri, contentValues, z);
            Thread thread = new Thread(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append("tpnsT-");
            long j2 = b;
            b = 1 + j2;
            sb.append(j2);
            thread.setName(sb.toString());
            thread.start();
            try {
                thread.join(1000L);
            } catch (Throwable th) {
                Logger.e("ProviderMessage", "myInsert", th);
            }
            return (Uri) aVar.a();
        }

        public a(Context context, Uri uri, boolean z) {
            this.f13709e = context;
            this.f13710g = uri;
            this.f13718o = z;
        }

        public a(Context context, Uri uri, ContentValues contentValues, String str, String[] strArr) {
            this.f13709e = context;
            this.f13710g = uri;
            this.f13715l = contentValues;
            this.f13716m = str;
            this.f13713j = strArr;
        }

        public static String a(Context context, Uri uri) {
            boolean z;
            int myPid = Process.myPid();
            if (!ProviderMessage.b(context, uri)) {
                z = false;
            } else if (Thread.currentThread().getId() != context.getMainLooper().getThread().getId()) {
                return ProviderMessage.a().getType(uri);
            } else {
                z = true;
            }
            a aVar = new a(context, uri, z);
            Thread thread = new Thread(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append("tpnsT");
            sb.append(myPid);
            sb.append(HelpFormatter.DEFAULT_OPT_PREFIX);
            long j2 = c;
            c = 1 + j2;
            sb.append(j2);
            thread.setName(sb.toString());
            thread.start();
            try {
                thread.join(1000L);
            } catch (Throwable th) {
                Logger.e("ProviderMessage", "myGetType", th);
            }
            return (String) aVar.a();
        }

        public a(Context context, Uri uri, String str, String[] strArr) {
            this.f13709e = context;
            this.f13710g = uri;
            this.f13716m = str;
            this.f13713j = strArr;
        }

        public static int a(Context context, Uri uri, ContentValues contentValues, String str, String[] strArr) {
            a aVar = new a(context, uri, contentValues, str, strArr);
            Thread thread = new Thread(aVar);
            thread.setName("tpnsU");
            thread.start();
            try {
                thread.join(1000L);
            } catch (Throwable th) {
                Logger.e("ProviderMessage", "myUpdate", th);
            }
            return ((Integer) aVar.a()).intValue();
        }

        public static int a(Context context, Uri uri, String str, String[] strArr) {
            a aVar = new a(context, uri, str, strArr);
            Thread thread = new Thread(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append("tpnsD-");
            long j2 = f13708d;
            f13708d = 1 + j2;
            sb.append(j2);
            thread.setName(sb.toString());
            thread.start();
            try {
                thread.join(1000L);
            } catch (Throwable th) {
                Logger.e("ProviderMessage", "myDelete", th);
            }
            return ((Integer) aVar.a()).intValue();
        }
    }

    public static /* synthetic */ SettingsContentProvider a() {
        return b();
    }

    private static SettingsContentProvider b() {
        if (f13706a == null) {
            f13706a = new SettingsContentProvider();
        }
        return f13706a;
    }

    public static int delete(Context context, String str, String str2, String str3, String[] strArr) {
        return delete(context, Uri.parse("content://" + str + "/" + str2), str3, strArr);
    }

    public static String getType(Context context, Uri uri) {
        try {
            return a.a(context, uri);
        } catch (Throwable th) {
            Logger.e("ProviderMessage", "getType", th);
            return null;
        }
    }

    public static Uri insert(Context context, Uri uri, ContentValues contentValues) {
        try {
            return a.a(context, uri, contentValues);
        } catch (Throwable th) {
            Logger.e("ProviderMessage", "insert", th);
            return null;
        }
    }

    public static void log(String str) {
        Logger.d("ProviderMessage", "" + str);
    }

    public static Cursor query(Context context, String str, String str2, String[] strArr, String str3, String[] strArr2, String str4) {
        return query(context, Uri.parse("content://" + str + "/" + str2), strArr, str3, strArr2, str4);
    }

    public static int update(Context context, String str, String str2, ContentValues contentValues, String str3, String[] strArr) {
        return update(context, Uri.parse("content://" + str + "/" + str2), contentValues, str3, strArr);
    }

    public static String getType(Context context, String str, String str2) {
        return getType(context, Uri.parse("content://" + str + "/" + str2));
    }

    public static Uri insert(Context context, String str, String str2, ContentValues contentValues) {
        return insert(context, Uri.parse("content://" + str + "/" + str2), contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, Uri uri) {
        System.nanoTime();
        int providerPid = SettingsContentProvider.getProviderPid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".");
        sb.append(SettingsContentProvider.PREFFERENCE_AUTHORITY);
        return myPid == providerPid && sb.toString().equals(uri.getHost());
    }

    public static int delete(Context context, Uri uri, String str, String[] strArr) {
        try {
            return a.a(context, uri, str, strArr);
        } catch (Throwable th) {
            Logger.e("ProviderMessage", g.f15697i, th);
            return 0;
        }
    }

    public static Cursor query(Context context, Uri uri, String[] strArr, String str) {
        return query(context, uri, strArr, str, null, null);
    }

    public static int update(Context context, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            return a.a(context, uri, contentValues, str, strArr);
        } catch (Throwable th) {
            Logger.e("ProviderMessage", "update", th);
            return 0;
        }
    }

    public static Cursor query(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            return a.a(context, uri, strArr, str, strArr2, str2);
        } catch (Throwable th) {
            Logger.e("ProviderMessage", "query", th);
            return null;
        }
    }
}
