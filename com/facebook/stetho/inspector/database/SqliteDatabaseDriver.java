package com.facebook.stetho.inspector.database;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.io.File;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SqliteDatabaseDriver extends DatabaseDriver2<SqliteDatabaseDescriptor> {
    private static final String[] UNINTERESTING_FILENAME_SUFFIXES = null;
    private final DatabaseConnectionProvider mDatabaseConnectionProvider;
    private final DatabaseFilesProvider mDatabaseFilesProvider;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SqliteDatabaseDescriptor implements DatabaseDescriptor {
        public final File file;

        public SqliteDatabaseDescriptor(File file) {
        }

        @Override // com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor
        public String name() {
        }
    }

    @Deprecated
    public SqliteDatabaseDriver(Context context) {
    }

    private <T> T executeInsert(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
    }

    private <T> T executeRawQuery(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
    }

    private <T> T executeSelect(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
    }

    @TargetApi(11)
    private <T> T executeUpdateDelete(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
    }

    private static String getFirstWord(String str) {
    }

    private SQLiteDatabase openDatabase(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
    }

    private static String removeSuffix(String str, String[] strArr) {
    }

    public static List<File> tidyDatabaseList(List<File> list) {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public /* bridge */ /* synthetic */ Database.ExecuteSQLResponse executeSQL(Object obj, String str, BaseDatabaseDriver.ExecuteResultHandler executeResultHandler) throws SQLiteException {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public List<SqliteDatabaseDescriptor> getDatabaseNames() {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public /* bridge */ /* synthetic */ List getTableNames(Object obj) {
    }

    @Deprecated
    public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider) {
    }

    public Database.ExecuteSQLResponse executeSQL(SqliteDatabaseDescriptor sqliteDatabaseDescriptor, String str, BaseDatabaseDriver.ExecuteResultHandler<Database.ExecuteSQLResponse> executeResultHandler) throws SQLiteException {
    }

    public List<String> getTableNames(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
    }

    public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider, DatabaseConnectionProvider databaseConnectionProvider) {
    }
}
