package com.sobot.network.http.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.locks.Lock;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SobotDBHelper extends SQLiteOpenHelper {
    private static final String DB_CACHE_NAME = "sobot.db";
    private static final int DB_CACHE_VERSION = 1;
    public static final String TABLE_FILECACHE = "fileCache";
    public static final Lock lock = null;
    private StTableEntity fileCacheTableEntity;

    public SobotDBHelper() {
    }

    private void onFirstCreate(SQLiteDatabase sQLiteDatabase) {
    }

    private void upgradeDB(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public SobotDBHelper(Context context) {
    }
}
