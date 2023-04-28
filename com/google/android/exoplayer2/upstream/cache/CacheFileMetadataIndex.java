package com.google.android.exoplayer2.upstream.cache;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CacheFileMetadataIndex {
    private static final String[] COLUMNS = null;
    private static final int COLUMN_INDEX_LAST_TOUCH_TIMESTAMP = 2;
    private static final int COLUMN_INDEX_LENGTH = 1;
    private static final int COLUMN_INDEX_NAME = 0;
    private static final String COLUMN_LAST_TOUCH_TIMESTAMP = "last_touch_timestamp";
    private static final String COLUMN_LENGTH = "length";
    private static final String COLUMN_NAME = "name";
    private static final String TABLE_PREFIX = "ExoPlayerCacheFileMetadata";
    private static final String TABLE_SCHEMA = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
    private static final int TABLE_VERSION = 1;
    private static final String WHERE_NAME_EQUALS = "name = ?";
    private final DatabaseProvider databaseProvider;
    private String tableName;

    public CacheFileMetadataIndex(DatabaseProvider databaseProvider) {
    }

    @WorkerThread
    public static void delete(DatabaseProvider databaseProvider, long uid) throws DatabaseIOException {
    }

    private static void dropTable(SQLiteDatabase writableDatabase, String tableName) {
    }

    private Cursor getCursor() {
    }

    private static String getTableName(String hexUid) {
    }

    @WorkerThread
    public Map<String, CacheFileMetadata> getAll() throws DatabaseIOException {
    }

    @WorkerThread
    public void initialize(long uid) throws DatabaseIOException {
    }

    @WorkerThread
    public void remove(String name) throws DatabaseIOException {
    }

    @WorkerThread
    public void removeAll(Set<String> names) throws DatabaseIOException {
    }

    @WorkerThread
    public void set(String name, long length, long lastTouchTimestamp) throws DatabaseIOException {
    }
}
