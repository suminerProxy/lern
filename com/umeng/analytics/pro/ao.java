package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: CacheDBHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class ao extends SQLiteOpenHelper {
    private static final Object b = null;
    private static ao c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f14736d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";

    /* renamed from: e  reason: collision with root package name */
    private static final String f14737e = "DROP TABLE IF EXISTS stf";

    /* renamed from: f  reason: collision with root package name */
    private static final String f14738f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";

    /* renamed from: a  reason: collision with root package name */
    private final Context f14739a;

    private ao(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2) {
    }

    public static final int a() {
    }

    public static ao a(Context context) {
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
    }

    private void d() {
    }

    public boolean c() {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public void b() {
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
    }

    public boolean b(String str) {
    }

    public void a(String str, ContentValues contentValues) {
    }

    public void a(String str, String str2, String[] strArr) {
    }

    public ap a(String str) {
    }

    public void a(String str, String str2) {
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
    }
}
