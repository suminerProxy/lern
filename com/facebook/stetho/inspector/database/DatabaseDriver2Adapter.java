package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.util.List;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DatabaseDriver2Adapter extends DatabaseDriver2<StringDatabaseDescriptor> {
    private final Database.DatabaseDriver mLegacy;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class StringDatabaseDescriptor implements DatabaseDescriptor {
        public final String name;

        public StringDatabaseDescriptor(String str) {
        }

        @Override // com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor
        public String name() {
        }
    }

    public DatabaseDriver2Adapter(Database.DatabaseDriver databaseDriver) {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public /* bridge */ /* synthetic */ Database.ExecuteSQLResponse executeSQL(Object obj, String str, BaseDatabaseDriver.ExecuteResultHandler executeResultHandler) throws SQLiteException {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public List<StringDatabaseDescriptor> getDatabaseNames() {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public /* bridge */ /* synthetic */ List getTableNames(Object obj) {
    }

    public Database.ExecuteSQLResponse executeSQL(StringDatabaseDescriptor stringDatabaseDescriptor, String str, BaseDatabaseDriver.ExecuteResultHandler executeResultHandler) throws SQLiteException {
    }

    public List<String> getTableNames(StringDatabaseDescriptor stringDatabaseDescriptor) {
    }
}
