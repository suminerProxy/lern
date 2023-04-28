package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9975a;
    private static w b;
    private static x c;

    /* compiled from: BUGLY */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w f9976a;
        private int b;
        private v c;

        /* renamed from: d  reason: collision with root package name */
        private String f9977d;

        /* renamed from: e  reason: collision with root package name */
        private ContentValues f9978e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f9979f;

        /* renamed from: g  reason: collision with root package name */
        private String[] f9980g;

        /* renamed from: h  reason: collision with root package name */
        private String f9981h;

        /* renamed from: i  reason: collision with root package name */
        private String[] f9982i;

        /* renamed from: j  reason: collision with root package name */
        private String f9983j;

        /* renamed from: k  reason: collision with root package name */
        private String f9984k;

        /* renamed from: l  reason: collision with root package name */
        private String f9985l;

        /* renamed from: m  reason: collision with root package name */
        private String f9986m;

        /* renamed from: n  reason: collision with root package name */
        private String f9987n;

        /* renamed from: o  reason: collision with root package name */
        private String[] f9988o;

        /* renamed from: p  reason: collision with root package name */
        private int f9989p;
        private String q;
        private byte[] r;

        public a(w wVar) {
        }

        public final void a(int i2, String str, byte[] bArr) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
        }
    }

    private w(Context context, List<o> list) {
        c = new x(context, list);
    }

    private synchronized boolean b(y yVar) {
        ContentValues d2;
        SQLiteDatabase writableDatabase = c.getWritableDatabase();
        if (writableDatabase != null && (d2 = d(yVar)) != null) {
            long replace = writableDatabase.replace("t_pf", com.umeng.analytics.pro.aq.f14745d, d2);
            if (replace >= 0) {
                al.c("[Database] insert %s success.", "t_pf");
                yVar.f9992a = replace;
                if (f9975a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f9975a && writableDatabase != null) {
                writableDatabase.close();
            }
            return false;
        }
        if (f9975a && writableDatabase != null) {
            writableDatabase.close();
        }
        return false;
    }

    private static ContentValues c(y yVar) {
        if (yVar == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j2 = yVar.f9992a;
            if (j2 > 0) {
                contentValues.put(com.umeng.analytics.pro.aq.f14745d, Long.valueOf(j2));
            }
            contentValues.put(com.umeng.analytics.pro.aq.f14746e, Integer.valueOf(yVar.b));
            contentValues.put("_pc", yVar.c);
            contentValues.put("_th", yVar.f9993d);
            contentValues.put("_tm", Long.valueOf(yVar.f9994e));
            byte[] bArr = yVar.f9996g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    private static ContentValues d(y yVar) {
        if (yVar != null && !ap.b(yVar.f9995f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j2 = yVar.f9992a;
                if (j2 > 0) {
                    contentValues.put(com.umeng.analytics.pro.aq.f14745d, Long.valueOf(j2));
                }
                contentValues.put(com.umeng.analytics.pro.aq.f14746e, yVar.f9995f);
                contentValues.put("_tm", Long.valueOf(yVar.f9994e));
                byte[] bArr = yVar.f9996g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th) {
                if (!al.a(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    public static synchronized w a(Context context, List<o> list) {
        w wVar;
        synchronized (w.class) {
            if (b == null) {
                b = new w(context, list);
            }
            wVar = b;
        }
        return wVar;
    }

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            wVar = b;
        }
        return wVar;
    }

    public final Cursor a(String str, String[] strArr, String str2) {
        return a(str, strArr, str2, (String) null, (String) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cb, code lost:
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.y> c(int r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.w.c(int):java.util.List");
    }

    public final Cursor a(String str, String[] strArr, String str2, String str3, String str4) {
        return a(false, str, strArr, str2, null, null, null, str3, str4, null);
    }

    public final int a(String str, String str2) {
        return a(str, str2, (String[]) null, (v) null);
    }

    public final synchronized long a(String str, ContentValues contentValues, v vVar) {
        long j2;
        j2 = -1;
        SQLiteDatabase writableDatabase = c.getWritableDatabase();
        if (writableDatabase != null && contentValues != null) {
            long replace = writableDatabase.replace(str, com.umeng.analytics.pro.aq.f14745d, contentValues);
            if (replace >= 0) {
                al.c("[Database] insert %s success.", str);
            } else {
                al.d("[Database] replace %s error.", str);
            }
            j2 = replace;
        }
        if (f9975a && writableDatabase != null) {
            writableDatabase.close();
        }
        return j2;
    }

    public final synchronized void b(int i2) {
        SQLiteDatabase writableDatabase = c.getWritableDatabase();
        if (writableDatabase != null) {
            al.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", i2 >= 0 ? "_tp = ".concat(String.valueOf(i2)) : null, null)));
            if (f9975a && writableDatabase != null) {
                writableDatabase.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Cursor a(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, v vVar) {
        Cursor cursor;
        cursor = null;
        try {
            SQLiteDatabase writableDatabase = c.getWritableDatabase();
            if (writableDatabase != null) {
                cursor = writableDatabase.query(z, str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
        } finally {
            try {
                return cursor;
            } finally {
            }
        }
        return cursor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int a(String str, String str2, String[] strArr, v vVar) {
        int delete;
        SQLiteDatabase writableDatabase = c.getWritableDatabase();
        delete = writableDatabase != null ? writableDatabase.delete(str, str2, strArr) : 0;
        if (f9975a && writableDatabase != null) {
            writableDatabase.close();
        }
        return delete;
    }

    private static y b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            y yVar = new y();
            yVar.f9992a = cursor.getLong(cursor.getColumnIndex(com.umeng.analytics.pro.aq.f14745d));
            yVar.f9994e = cursor.getLong(cursor.getColumnIndex("_tm"));
            yVar.f9995f = cursor.getString(cursor.getColumnIndex(com.umeng.analytics.pro.aq.f14746e));
            yVar.f9996g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return yVar;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    public final boolean a(int i2, String str, byte[] bArr, boolean z) {
        if (!z) {
            a aVar = new a(this);
            aVar.a(i2, str, bArr);
            ak.a().a(aVar);
            return true;
        }
        return a(i2, str, bArr, (v) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i2, String str, byte[] bArr, v vVar) {
        try {
            y yVar = new y();
            yVar.f9992a = i2;
            yVar.f9995f = str;
            yVar.f9994e = System.currentTimeMillis();
            yVar.f9996g = bArr;
            return b(yVar);
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public final Map<String, byte[]> a(int i2, v vVar) {
        HashMap hashMap = null;
        try {
            List<y> c2 = c(i2);
            if (c2 != null) {
                HashMap hashMap2 = new HashMap();
                try {
                    for (y yVar : c2) {
                        byte[] bArr = yVar.f9996g;
                        if (bArr != null) {
                            hashMap2.put(yVar.f9995f, bArr);
                        }
                    }
                    return hashMap2;
                } catch (Throwable th) {
                    th = th;
                    hashMap = hashMap2;
                    if (al.a(th)) {
                        return hashMap;
                    }
                    th.printStackTrace();
                    return hashMap;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized boolean a(y yVar) {
        ContentValues c2;
        SQLiteDatabase writableDatabase = c.getWritableDatabase();
        if (writableDatabase != null && (c2 = c(yVar)) != null) {
            long replace = writableDatabase.replace("t_lr", com.umeng.analytics.pro.aq.f14745d, c2);
            if (replace >= 0) {
                al.c("[Database] insert %s success.", "t_lr");
                yVar.f9992a = replace;
                if (f9975a && writableDatabase != null) {
                    writableDatabase.close();
                }
                return true;
            }
            if (f9975a && writableDatabase != null) {
                writableDatabase.close();
            }
            return false;
        }
        if (f9975a && writableDatabase != null) {
            writableDatabase.close();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:14:0x002d, B:15:0x0030, B:18:0x0036, B:35:0x009b, B:36:0x009e, B:39:0x00a4, B:48:0x00b8, B:49:0x00bb, B:52:0x00c1, B:44:0x00ad, B:46:0x00b3), top: B:66:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8 A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:14:0x002d, B:15:0x0030, B:18:0x0036, B:35:0x009b, B:36:0x009e, B:39:0x00a4, B:48:0x00b8, B:49:0x00bb, B:52:0x00c1, B:44:0x00ad, B:46:0x00b3), top: B:66:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.tencent.bugly.proguard.y> a(int r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.w.a(int):java.util.List");
    }

    public final synchronized void a(List<y> list) {
        if (list != null) {
            if (list.size() != 0) {
                SQLiteDatabase writableDatabase = c.getWritableDatabase();
                if (writableDatabase != null) {
                    StringBuilder sb = new StringBuilder();
                    for (y yVar : list) {
                        sb.append(" or _id = ");
                        sb.append(yVar.f9992a);
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() > 0) {
                        sb2 = sb2.substring(4);
                    }
                    sb.setLength(0);
                    al.c("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", sb2, null)));
                    if (f9975a) {
                        writableDatabase.close();
                    }
                }
            }
        }
    }

    private static y a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            y yVar = new y();
            yVar.f9992a = cursor.getLong(cursor.getColumnIndex(com.umeng.analytics.pro.aq.f14745d));
            yVar.b = cursor.getInt(cursor.getColumnIndex(com.umeng.analytics.pro.aq.f14746e));
            yVar.c = cursor.getString(cursor.getColumnIndex("_pc"));
            yVar.f9993d = cursor.getString(cursor.getColumnIndex("_th"));
            yVar.f9994e = cursor.getLong(cursor.getColumnIndex("_tm"));
            yVar.f9996g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return yVar;
        } catch (Throwable th) {
            if (!al.a(th)) {
                th.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(int i2, String str, v vVar) {
        boolean z;
        String str2;
        SQLiteDatabase sQLiteDatabase = null;
        z = false;
        try {
            SQLiteDatabase writableDatabase = c.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (ap.b(str)) {
                        str2 = "_id = ".concat(String.valueOf(i2));
                    } else {
                        str2 = "_id = " + i2 + " and _tp = \"" + str + "\"";
                    }
                    int delete = writableDatabase.delete("t_pf", str2, null);
                    al.c("[Database] deleted %s data %d", "t_pf", Integer.valueOf(delete));
                    if (delete > 0) {
                        z = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = writableDatabase;
                    if (!al.a(th)) {
                        th.printStackTrace();
                    }
                    if (f9975a && sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return z;
                }
            }
            if (f9975a && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z;
    }
}
