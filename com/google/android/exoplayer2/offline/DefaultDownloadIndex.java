package com.google.android.exoplayer2.offline;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultDownloadIndex implements WritableDownloadIndex {
    private static final String[] COLUMNS = null;
    private static final String COLUMN_BYTES_DOWNLOADED = "bytes_downloaded";
    private static final String COLUMN_CONTENT_LENGTH = "content_length";
    private static final String COLUMN_CUSTOM_CACHE_KEY = "custom_cache_key";
    private static final String COLUMN_DATA = "data";
    private static final String COLUMN_FAILURE_REASON = "failure_reason";
    private static final String COLUMN_ID = "id";
    private static final int COLUMN_INDEX_BYTES_DOWNLOADED = 13;
    private static final int COLUMN_INDEX_CONTENT_LENGTH = 9;
    private static final int COLUMN_INDEX_CUSTOM_CACHE_KEY = 4;
    private static final int COLUMN_INDEX_DATA = 5;
    private static final int COLUMN_INDEX_FAILURE_REASON = 11;
    private static final int COLUMN_INDEX_ID = 0;
    private static final int COLUMN_INDEX_KEY_SET_ID = 14;
    private static final int COLUMN_INDEX_MIME_TYPE = 1;
    private static final int COLUMN_INDEX_PERCENT_DOWNLOADED = 12;
    private static final int COLUMN_INDEX_START_TIME_MS = 7;
    private static final int COLUMN_INDEX_STATE = 6;
    private static final int COLUMN_INDEX_STOP_REASON = 10;
    private static final int COLUMN_INDEX_STREAM_KEYS = 3;
    private static final int COLUMN_INDEX_UPDATE_TIME_MS = 8;
    private static final int COLUMN_INDEX_URI = 2;
    private static final String COLUMN_KEY_SET_ID = "key_set_id";
    private static final String COLUMN_MIME_TYPE = "mime_type";
    private static final String COLUMN_PERCENT_DOWNLOADED = "percent_downloaded";
    private static final String COLUMN_START_TIME_MS = "start_time_ms";
    private static final String COLUMN_STATE = "state";
    private static final String COLUMN_STOP_REASON = "stop_reason";
    private static final String COLUMN_STREAM_KEYS = "stream_keys";
    private static final String COLUMN_UPDATE_TIME_MS = "update_time_ms";
    private static final String COLUMN_URI = "uri";
    private static final String TABLE_PREFIX = "ExoPlayerDownloads";
    private static final String TABLE_SCHEMA = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    @VisibleForTesting
    public static final int TABLE_VERSION = 3;
    private static final String TRUE = "1";
    private static final String WHERE_ID_EQUALS = "id = ?";
    private static final String WHERE_STATE_IS_DOWNLOADING = "state = 2";
    private static final String WHERE_STATE_IS_TERMINAL = null;
    private final DatabaseProvider databaseProvider;
    private final Object initializationLock;
    @GuardedBy("initializationLock")
    private boolean initialized;
    private final String name;
    private final String tableName;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DownloadCursorImpl implements DownloadCursor {
        private final Cursor cursor;

        public /* synthetic */ DownloadCursorImpl(Cursor cursor, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public int getCount() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public Download getDownload() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public int getPosition() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean isAfterLast() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean isBeforeFirst() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public boolean isClosed() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean isFirst() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean isLast() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean moveToFirst() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean moveToLast() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean moveToNext() {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public boolean moveToPosition(int position) {
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public /* synthetic */ boolean moveToPrevious() {
        }

        private DownloadCursorImpl(Cursor cursor) {
        }
    }

    public DefaultDownloadIndex(DatabaseProvider databaseProvider) {
    }

    public static /* synthetic */ Download access$100(Cursor cursor) {
    }

    private static List<StreamKey> decodeStreamKeys(@Nullable String encodedStreamKeys) {
    }

    @VisibleForTesting
    public static String encodeStreamKeys(List<StreamKey> streamKeys) {
    }

    private void ensureInitialized() throws DatabaseIOException {
    }

    private Cursor getCursor(String selection, @Nullable String[] selectionArgs) throws DatabaseIOException {
    }

    private static Download getDownloadForCurrentRow(Cursor cursor) {
    }

    private static Download getDownloadForCurrentRowV2(Cursor cursor) {
    }

    private static String getStateQuery(int... states) {
    }

    private static String inferMimeType(@Nullable String downloadType) {
    }

    private List<Download> loadDownloadsFromVersion2(SQLiteDatabase database) {
    }

    private void putDownloadInternal(Download download, SQLiteDatabase database) {
    }

    @Override // com.google.android.exoplayer2.offline.DownloadIndex
    @Nullable
    public Download getDownload(String id) throws DatabaseIOException {
    }

    @Override // com.google.android.exoplayer2.offline.DownloadIndex
    public DownloadCursor getDownloads(int... states) throws DatabaseIOException {
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void putDownload(Download download) throws DatabaseIOException {
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void removeDownload(String id) throws DatabaseIOException {
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setDownloadingStatesToQueued() throws DatabaseIOException {
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStatesToRemoving() throws DatabaseIOException {
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStopReason(int stopReason) throws DatabaseIOException {
    }

    public DefaultDownloadIndex(DatabaseProvider databaseProvider, String name) {
    }

    @Override // com.google.android.exoplayer2.offline.WritableDownloadIndex
    public void setStopReason(String id, int stopReason) throws DatabaseIOException {
    }
}
