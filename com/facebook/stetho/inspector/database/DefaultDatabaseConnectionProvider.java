package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.database.SQLiteDatabaseCompat;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultDatabaseConnectionProvider implements DatabaseConnectionProvider {
    @SQLiteDatabaseCompat.SQLiteOpenOptions
    public int determineOpenOptions(File file) {
    }

    @Override // com.facebook.stetho.inspector.database.DatabaseConnectionProvider
    public SQLiteDatabase openDatabase(File file) throws SQLiteException {
    }

    public SQLiteDatabase performOpen(File file, @SQLiteDatabaseCompat.SQLiteOpenOptions int i2) {
    }
}
