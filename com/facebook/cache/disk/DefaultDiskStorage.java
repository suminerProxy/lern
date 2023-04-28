package com.facebook.cache.disk;

import android.os.Environment;
import androidx.annotation.VisibleForTesting;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.common.file.FileTree;
import com.facebook.common.file.FileTreeVisitor;
import com.facebook.common.file.FileUtils;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.time.Clock;
import com.facebook.common.time.SystemClock;
import com.facebook.infer.annotation.Nullsafe;
import h.l.a.a.c;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DefaultDiskStorage implements DiskStorage {
    private static final String CONTENT_FILE_EXTENSION = ".cnt";
    private static final String DEFAULT_DISK_STORAGE_VERSION_PREFIX = "v2";
    private static final int SHARDING_BUCKET_COUNT = 100;
    private static final String TEMP_FILE_EXTENSION = ".tmp";
    private final CacheErrorLogger mCacheErrorLogger;
    private final Clock mClock;
    private final boolean mIsExternal;
    private final File mRootDirectory;
    private final File mVersionDirectory;
    private static final Class<?> TAG = DefaultDiskStorage.class;
    public static final long TEMP_FILE_LIFETIME_MS = TimeUnit.MINUTES.toMillis(30);

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class EntryImpl implements DiskStorage.Entry {
        private final String id;
        private final FileBinaryResource resource;
        private long size;
        private long timestamp;

        public /* synthetic */ EntryImpl(String str, File file, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public String getId() {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public /* bridge */ /* synthetic */ BinaryResource getResource() {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public long getSize() {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public long getTimestamp() {
        }

        private EntryImpl(String id, File cachedFile) {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Entry
        public FileBinaryResource getResource() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FileInfo {
        public final String resourceId;
        @FileType
        public final String type;

        public /* synthetic */ FileInfo(String str, String str2, AnonymousClass1 anonymousClass1) {
        }

        @Nullable
        public static FileInfo fromFile(File file) {
        }

        public File createTempFile(File parent) throws IOException {
        }

        public String toPath(String parentPath) {
        }

        public String toString() {
        }

        private FileInfo(@FileType String type, String resourceId) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public @interface FileType {
        public static final String CONTENT = ".cnt";
        public static final String TEMP = ".tmp";
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class IncompleteFileException extends IOException {
        public IncompleteFileException(long expected, long actual) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class InserterImpl implements DiskStorage.Inserter {
        private final String mResourceId;
        @VisibleForTesting
        public final File mTemporaryFile;
        public final /* synthetic */ DefaultDiskStorage this$0;

        public InserterImpl(final DefaultDiskStorage this$0, String resourceId, File temporaryFile) {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Inserter
        public boolean cleanUp() {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Inserter
        public BinaryResource commit(Object debugInfo) throws IOException {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Inserter
        public void writeData(WriterCallback callback, Object debugInfo) throws IOException {
        }

        @Override // com.facebook.cache.disk.DiskStorage.Inserter
        public BinaryResource commit(Object debugInfo, long time) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class PurgingVisitor implements FileTreeVisitor {
        private boolean insideBaseDirectory;
        public final /* synthetic */ DefaultDiskStorage this$0;

        private PurgingVisitor(final DefaultDiskStorage this$0) {
        }

        private boolean isExpectedFile(File file) {
        }

        private boolean isRecentFile(File file) {
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void postVisitDirectory(File directory) {
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void preVisitDirectory(File directory) {
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void visitFile(File file) {
        }

        public /* synthetic */ PurgingVisitor(DefaultDiskStorage defaultDiskStorage, AnonymousClass1 anonymousClass1) {
        }
    }

    public DefaultDiskStorage(File rootDirectory, int version, CacheErrorLogger cacheErrorLogger) {
        Preconditions.checkNotNull(rootDirectory);
        this.mRootDirectory = rootDirectory;
        this.mIsExternal = isExternal(rootDirectory, cacheErrorLogger);
        this.mVersionDirectory = new File(rootDirectory, getVersionSubdirectoryName(version));
        this.mCacheErrorLogger = cacheErrorLogger;
        recreateDirectoryIfVersionChanges();
        this.mClock = SystemClock.get();
    }

    private long doRemove(final File contentFile) {
        if (contentFile.exists()) {
            long length = contentFile.length();
            if (contentFile.delete()) {
                return length;
            }
            return -1L;
        }
        return 0L;
    }

    private DiskStorage.DiskDumpInfoEntry dumpCacheEntry(DiskStorage.Entry entry) throws IOException {
        EntryImpl entryImpl = (EntryImpl) entry;
        byte[] read = entryImpl.getResource().read();
        String typeOfBytes = typeOfBytes(read);
        return new DiskStorage.DiskDumpInfoEntry(entryImpl.getId(), entryImpl.getResource().getFile().getPath(), typeOfBytes, (float) entryImpl.getSize(), (!typeOfBytes.equals("undefined") || read.length < 4) ? "" : String.format(null, "0x%02X 0x%02X 0x%02X 0x%02X", Byte.valueOf(read[0]), Byte.valueOf(read[1]), Byte.valueOf(read[2]), Byte.valueOf(read[3])));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @FileType
    @Nullable
    public static String getFileTypefromExtension(String extension) {
        if (".cnt".equals(extension)) {
            return ".cnt";
        }
        if (".tmp".equals(extension)) {
            return ".tmp";
        }
        return null;
    }

    private String getFilename(String resourceId) {
        FileInfo fileInfo = new FileInfo(".cnt", resourceId, null);
        return fileInfo.toPath(getSubdirectoryPath(fileInfo.resourceId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public FileInfo getShardFileInfo(File file) {
        FileInfo fromFile = FileInfo.fromFile(file);
        if (fromFile != null && getSubdirectory(fromFile.resourceId).equals(file.getParentFile())) {
            return fromFile;
        }
        return null;
    }

    private File getSubdirectory(String resourceId) {
        return new File(getSubdirectoryPath(resourceId));
    }

    private String getSubdirectoryPath(String resourceId) {
        String valueOf = String.valueOf(Math.abs(resourceId.hashCode() % 100));
        return this.mVersionDirectory + File.separator + valueOf;
    }

    @VisibleForTesting
    public static String getVersionSubdirectoryName(int version) {
        return String.format(null, "%s.ols%d.%d", DEFAULT_DISK_STORAGE_VERSION_PREFIX, 100, Integer.valueOf(version));
    }

    private static boolean isExternal(File directory, CacheErrorLogger cacheErrorLogger) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            try {
                try {
                    return directory.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException e2) {
                    e = e2;
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.OTHER;
                    Class<?> cls = TAG;
                    cacheErrorLogger.logError(cacheErrorCategory, cls, "failed to read folder to check if external: " + ((String) null), e);
                    return false;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Exception e4) {
            cacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.OTHER, TAG, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    private void mkdirs(File directory, String message) throws IOException {
        try {
            FileUtils.mkdirs(directory);
        } catch (FileUtils.CreateDirectoryException e2) {
            this.mCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, TAG, message, e2);
            throw e2;
        }
    }

    private boolean query(String resourceId, boolean touch) {
        File contentFileFor = getContentFileFor(resourceId);
        boolean exists = contentFileFor.exists();
        if (touch && exists) {
            contentFileFor.setLastModified(this.mClock.now());
        }
        return exists;
    }

    private void recreateDirectoryIfVersionChanges() {
        boolean z = true;
        if (this.mRootDirectory.exists()) {
            if (this.mVersionDirectory.exists()) {
                z = false;
            } else {
                FileTree.deleteRecursively(this.mRootDirectory);
            }
        }
        if (z) {
            try {
                FileUtils.mkdirs(this.mVersionDirectory);
            } catch (FileUtils.CreateDirectoryException unused) {
                CacheErrorLogger cacheErrorLogger = this.mCacheErrorLogger;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
                Class<?> cls = TAG;
                cacheErrorLogger.logError(cacheErrorCategory, cls, "version directory could not be created: " + this.mVersionDirectory, null);
            }
        }
    }

    private String typeOfBytes(byte[] bytes) {
        return bytes.length >= 2 ? (bytes[0] == -1 && bytes[1] == -40) ? "jpg" : (bytes[0] == -119 && bytes[1] == 80) ? "png" : (bytes[0] == 82 && bytes[1] == 73) ? "webp" : (bytes[0] == 71 && bytes[1] == 73) ? "gif" : "undefined" : "undefined";
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public void clearAll() {
        FileTree.deleteContents(this.mRootDirectory);
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public boolean contains(String resourceId, Object debugInfo) {
        return query(resourceId, false);
    }

    @VisibleForTesting
    public File getContentFileFor(String resourceId) {
        return new File(getFilename(resourceId));
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public DiskStorage.DiskDumpInfo getDumpInfo() throws IOException {
        List<DiskStorage.Entry> entries = getEntries();
        DiskStorage.DiskDumpInfo diskDumpInfo = new DiskStorage.DiskDumpInfo();
        for (DiskStorage.Entry entry : entries) {
            DiskStorage.DiskDumpInfoEntry dumpCacheEntry = dumpCacheEntry(entry);
            String str = dumpCacheEntry.type;
            Integer num = diskDumpInfo.typeCounts.get(str);
            if (num == null) {
                diskDumpInfo.typeCounts.put(str, 1);
            } else {
                diskDumpInfo.typeCounts.put(str, Integer.valueOf(num.intValue() + 1));
            }
            diskDumpInfo.entries.add(dumpCacheEntry);
        }
        return diskDumpInfo;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    @Nullable
    public BinaryResource getResource(String resourceId, Object debugInfo) {
        File contentFileFor = getContentFileFor(resourceId);
        if (contentFileFor.exists()) {
            contentFileFor.setLastModified(this.mClock.now());
            return FileBinaryResource.createOrNull(contentFileFor);
        }
        return null;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public String getStorageName() {
        String absolutePath = this.mRootDirectory.getAbsolutePath();
        return c.f17369e + absolutePath.substring(absolutePath.lastIndexOf(47) + 1, absolutePath.length()) + c.f17369e + absolutePath.hashCode();
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public DiskStorage.Inserter insert(String resourceId, Object debugInfo) throws IOException {
        FileInfo fileInfo = new FileInfo(".tmp", resourceId, null);
        File subdirectory = getSubdirectory(fileInfo.resourceId);
        if (!subdirectory.exists()) {
            mkdirs(subdirectory, "insert");
        }
        try {
            return new InserterImpl(this, resourceId, fileInfo.createTempFile(subdirectory));
        } catch (IOException e2) {
            this.mCacheErrorLogger.logError(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, TAG, "insert", e2);
            throw e2;
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public void purgeUnexpectedResources() {
        FileTree.walkFileTree(this.mRootDirectory, new PurgingVisitor(this, null));
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public long remove(DiskStorage.Entry entry) {
        return doRemove(((EntryImpl) entry).getResource().getFile());
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public boolean touch(String resourceId, Object debugInfo) {
        return query(resourceId, true);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class EntriesCollector implements FileTreeVisitor {
        private final List<DiskStorage.Entry> result;
        public final /* synthetic */ DefaultDiskStorage this$0;

        private EntriesCollector(final DefaultDiskStorage this$0) {
        }

        public List<DiskStorage.Entry> getEntries() {
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void postVisitDirectory(File directory) {
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void preVisitDirectory(File directory) {
        }

        @Override // com.facebook.common.file.FileTreeVisitor
        public void visitFile(File file) {
        }

        public /* synthetic */ EntriesCollector(DefaultDiskStorage defaultDiskStorage, AnonymousClass1 anonymousClass1) {
        }
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public List<DiskStorage.Entry> getEntries() throws IOException {
        EntriesCollector entriesCollector = new EntriesCollector(this, null);
        FileTree.walkFileTree(this.mVersionDirectory, entriesCollector);
        return entriesCollector.getEntries();
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public long remove(final String resourceId) {
        return doRemove(getContentFileFor(resourceId));
    }

    @Override // com.facebook.cache.disk.DiskStorage
    public boolean isExternal() {
        return this.mIsExternal;
    }
}
