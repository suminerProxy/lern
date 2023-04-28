package com.facebook.stetho.inspector.database;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ContentProviderDatabaseDriver extends DatabaseDriver2<ContentProviderDatabaseDescriptor> {
    private static final String sDatabaseName = "content-providers";
    private final ContentProviderSchema[] mContentProviderSchemas;
    private List<String> mTableNames;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class ContentProviderDatabaseDescriptor implements DatabaseDescriptor {
        @Override // com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor
        public String name() {
        }
    }

    public ContentProviderDatabaseDriver(Context context, ContentProviderSchema... contentProviderSchemaArr) {
    }

    private String fetchTableName(String str) {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public /* bridge */ /* synthetic */ Database.ExecuteSQLResponse executeSQL(Object obj, String str, BaseDatabaseDriver.ExecuteResultHandler executeResultHandler) throws SQLiteException {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public List<ContentProviderDatabaseDescriptor> getDatabaseNames() {
    }

    @Override // com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver
    public /* bridge */ /* synthetic */ List getTableNames(Object obj) {
    }

    public Database.ExecuteSQLResponse executeSQL(ContentProviderDatabaseDescriptor contentProviderDatabaseDescriptor, String str, BaseDatabaseDriver.ExecuteResultHandler<Database.ExecuteSQLResponse> executeResultHandler) throws SQLiteException {
    }

    public List<String> getTableNames(ContentProviderDatabaseDescriptor contentProviderDatabaseDescriptor) {
    }
}
