package com.google.android.exoplayer2.upstream.cache;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.ReusableBufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CachedContentIndex {
    public static final String FILE_NAME_ATOMIC = "cached_content_index.exi";
    private static final int INCREMENTAL_METADATA_READ_LENGTH = 10485760;
    private final SparseArray<String> idToKey;
    private final HashMap<String, CachedContent> keyToContent;
    private final SparseBooleanArray newIds;
    @Nullable
    private Storage previousStorage;
    private final SparseBooleanArray removedIds;
    private Storage storage;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DatabaseStorage implements Storage {
        private static final String[] COLUMNS = null;
        private static final String COLUMN_ID = "id";
        private static final int COLUMN_INDEX_ID = 0;
        private static final int COLUMN_INDEX_KEY = 1;
        private static final int COLUMN_INDEX_METADATA = 2;
        private static final String COLUMN_KEY = "key";
        private static final String COLUMN_METADATA = "metadata";
        private static final String TABLE_PREFIX = "ExoPlayerCacheIndex";
        private static final String TABLE_SCHEMA = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        private static final int TABLE_VERSION = 1;
        private static final String WHERE_ID_EQUALS = "id = ?";
        private final DatabaseProvider databaseProvider;
        private String hexUid;
        private final SparseArray<CachedContent> pendingUpdates;
        private String tableName;

        public DatabaseStorage(DatabaseProvider databaseProvider) {
        }

        private void addOrUpdateRow(SQLiteDatabase writableDatabase, CachedContent cachedContent) throws IOException {
        }

        public static void delete(DatabaseProvider databaseProvider, long uid) throws DatabaseIOException {
        }

        private void deleteRow(SQLiteDatabase writableDatabase, int key) {
        }

        private static void dropTable(SQLiteDatabase writableDatabase, String tableName) {
        }

        private Cursor getCursor() {
        }

        private static String getTableName(String hexUid) {
        }

        private void initializeTable(SQLiteDatabase writableDatabase) throws DatabaseIOException {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public boolean exists() throws DatabaseIOException {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void initialize(long uid) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void load(HashMap<String, CachedContent> content, SparseArray<String> idToKey) throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onRemove(CachedContent cachedContent, boolean neverStored) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onUpdate(CachedContent cachedContent) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeFully(HashMap<String, CachedContent> content) throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeIncremental(HashMap<String, CachedContent> content) throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void delete() throws DatabaseIOException {
        }

        private static void delete(DatabaseProvider databaseProvider, String hexUid) throws DatabaseIOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class LegacyStorage implements Storage {
        private static final int FLAG_ENCRYPTED_INDEX = 1;
        private static final int VERSION = 2;
        private static final int VERSION_METADATA_INTRODUCED = 2;
        private final AtomicFile atomicFile;
        @Nullable
        private ReusableBufferedOutputStream bufferedOutputStream;
        private boolean changed;
        @Nullable
        private final Cipher cipher;
        private final boolean encrypt;
        @Nullable
        private final SecureRandom random;
        @Nullable
        private final SecretKeySpec secretKeySpec;

        public LegacyStorage(File file, @Nullable byte[] secretKey, boolean encrypt) {
        }

        private int hashCachedContent(CachedContent cachedContent, int version) {
        }

        private CachedContent readCachedContent(int version, DataInputStream input) throws IOException {
        }

        private boolean readFile(HashMap<String, CachedContent> content, SparseArray<String> idToKey) {
        }

        private void writeCachedContent(CachedContent cachedContent, DataOutputStream output) throws IOException {
        }

        private void writeFile(HashMap<String, CachedContent> content) throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void delete() {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public boolean exists() {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void initialize(long uid) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void load(HashMap<String, CachedContent> content, SparseArray<String> idToKey) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onRemove(CachedContent cachedContent, boolean neverStored) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void onUpdate(CachedContent cachedContent) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeFully(HashMap<String, CachedContent> content) throws IOException {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.CachedContentIndex.Storage
        public void storeIncremental(HashMap<String, CachedContent> content) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Storage {
        void delete() throws IOException;

        boolean exists() throws IOException;

        void initialize(long uid);

        void load(HashMap<String, CachedContent> content, SparseArray<String> idToKey) throws IOException;

        void onRemove(CachedContent cachedContent, boolean neverStored);

        void onUpdate(CachedContent cachedContent);

        void storeFully(HashMap<String, CachedContent> content) throws IOException;

        void storeIncremental(HashMap<String, CachedContent> content) throws IOException;
    }

    public CachedContentIndex(DatabaseProvider databaseProvider) {
    }

    public static /* synthetic */ Cipher access$000() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    public static /* synthetic */ DefaultContentMetadata access$100(DataInputStream dataInputStream) throws IOException {
    }

    public static /* synthetic */ void access$200(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) throws IOException {
    }

    private CachedContent addNew(String key) {
    }

    @WorkerThread
    public static void delete(DatabaseProvider databaseProvider, long uid) throws DatabaseIOException {
    }

    @SuppressLint({"GetInstance"})
    private static Cipher getCipher() throws NoSuchPaddingException, NoSuchAlgorithmException {
    }

    @VisibleForTesting
    public static int getNewId(SparseArray<String> idToKey) {
    }

    public static boolean isIndexFile(String fileName) {
    }

    private static DefaultContentMetadata readContentMetadata(DataInputStream input) throws IOException {
    }

    private static void writeContentMetadata(DefaultContentMetadata metadata, DataOutputStream output) throws IOException {
    }

    public void applyContentMetadataMutations(String key, ContentMetadataMutations mutations) {
    }

    public int assignIdForKey(String key) {
    }

    @Nullable
    public CachedContent get(String key) {
    }

    public Collection<CachedContent> getAll() {
    }

    public ContentMetadata getContentMetadata(String key) {
    }

    @Nullable
    public String getKeyForId(int id) {
    }

    public Set<String> getKeys() {
    }

    public CachedContent getOrAdd(String key) {
    }

    @WorkerThread
    public void initialize(long uid) throws IOException {
    }

    public void maybeRemove(String key) {
    }

    public void removeEmpty() {
    }

    @WorkerThread
    public void store() throws IOException {
    }

    public CachedContentIndex(@Nullable DatabaseProvider databaseProvider, @Nullable File legacyStorageDir, @Nullable byte[] legacyStorageSecretKey, boolean legacyStorageEncrypt, boolean preferLegacyStorage) {
    }
}
