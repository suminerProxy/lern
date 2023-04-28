package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.protocol.module.Database;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseDatabaseDriver<DESC> {
    public Context mContext;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface ExecuteResultHandler<RESULT> {
        RESULT handleInsert(long j2) throws SQLiteException;

        RESULT handleRawQuery() throws SQLiteException;

        RESULT handleSelect(Cursor cursor) throws SQLiteException;

        RESULT handleUpdateDelete(int i2) throws SQLiteException;
    }

    public BaseDatabaseDriver(Context context) {
    }

    public abstract Database.ExecuteSQLResponse executeSQL(DESC desc, String str, ExecuteResultHandler<Database.ExecuteSQLResponse> executeResultHandler) throws SQLiteException;

    public Context getContext() {
    }

    public abstract List<DESC> getDatabaseNames();

    public abstract List<String> getTableNames(DESC desc);
}
