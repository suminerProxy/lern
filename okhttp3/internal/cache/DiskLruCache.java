package okhttp3.internal.cache;

import com.baidu.platform.comapi.map.MapBundleKey;
import h.a.a.a.a.i.g;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okio.BufferedSink;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DiskLruCache.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0001`\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0004mnopB9\b\u0000\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010W\u001a\u00020I\u0012\u0006\u0010:\u001a\u00020\u001b\u0012\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0005J\u001e\u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020\u00032\n\u0010\"\u001a\u00060\u001dR\u00020\u00002\u0006\u0010#\u001a\u00020\u000eH\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u001b\u0010-\u001a\u00020\u000e2\n\u0010*\u001a\u00060)R\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010\u0005J\r\u0010/\u001a\u00020\u000e¢\u0006\u0004\b/\u0010\u0010J\u000f\u00100\u001a\u00020\u0003H\u0016¢\u0006\u0004\b0\u0010\u0005J\r\u00101\u001a\u00020\u0003¢\u0006\u0004\b1\u0010\u0005J\r\u00102\u001a\u00020\u0003¢\u0006\u0004\b2\u0010\u0005J\r\u00103\u001a\u00020\u0003¢\u0006\u0004\b3\u0010\u0005J\u0017\u00105\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u000004¢\u0006\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R*\u0010:\u001a\u00020\u001b2\u0006\u00109\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010!\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010CR\u0019\u0010E\u001a\u00020D8\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010M\u001a\u00020L8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010@R\u0016\u0010R\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010FR\u0016\u0010S\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010FR\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010@R\u0016\u0010U\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010;R\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010;R\u0016\u0010V\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010@R\u001c\u0010W\u001a\u00020I8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010K\u001a\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010@R\u0016\u0010[\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010FR\u0016\u0010\\\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010KR\u0016\u0010^\u001a\u00020]8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR,\u0010d\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060)R\u00020\u00000c8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010@¨\u0006q"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "readJournal", "()V", "Lokio/BufferedSink;", "newJournalWriter", "()Lokio/BufferedSink;", "", "line", "readJournalLine", "(Ljava/lang/String;)V", "processJournal", "", "journalRebuildRequired", "()Z", "checkNotClosed", "removeOldestEntry", "key", "validateKey", "initialize", "rebuildJournal$okhttp", "rebuildJournal", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", MapBundleKey.OfflineMapKey.OFFLINE_TOTAL_SIZE, "()J", "editor", "success", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", "close", "trimToSize", g.f15697i, "evictAll", "", "snapshots", "()Ljava/util/Iterator;", "journalWriter", "Lokio/BufferedSink;", "value", "maxSize", "J", "getMaxSize", "setMaxSize", "(J)V", "closed", "Z", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "Ljava/io/File;", "directory", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "", "appVersion", "I", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "civilizedFileSystem", "journalFile", "journalFileBackup", "mostRecentTrimFailed", "nextSequenceNumber", "initialized", "valueCount", "getValueCount$okhttp", "()I", "hasJournalErrors", "journalFileTmp", "redundantOpCount", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "mostRecentRebuildFailed", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class DiskLruCache implements Closeable, Flushable {
    @JvmField
    public static final long ANY_SEQUENCE_NUMBER = -1;
    @JvmField
    @NotNull
    public static final String CLEAN = "CLEAN";
    public static final Companion Companion = null;
    @JvmField
    @NotNull
    public static final String DIRTY = "DIRTY";
    @JvmField
    @NotNull
    public static final String JOURNAL_FILE = "journal";
    @JvmField
    @NotNull
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    @JvmField
    @NotNull
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    @JvmField
    @NotNull
    public static final Regex LEGAL_KEY_PATTERN = null;
    @JvmField
    @NotNull
    public static final String MAGIC = "libcore.io.DiskLruCache";
    @JvmField
    @NotNull
    public static final String READ = "READ";
    @JvmField
    @NotNull
    public static final String REMOVE = "REMOVE";
    @JvmField
    @NotNull
    public static final String VERSION_1 = "1";
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    @NotNull
    private final File directory;
    @NotNull
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private BufferedSink journalWriter;
    @NotNull
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    /* compiled from: DiskLruCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\r\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\u00020\u00058\u0006@\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", DiskLruCache.CLEAN, "Ljava/lang/String;", DiskLruCache.DIRTY, "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/Regex;", "LEGAL_KEY_PATTERN", "Lkotlin/text/Regex;", "MAGIC", DiskLruCache.READ, DiskLruCache.REMOVE, "VERSION_1", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0012\u001a\u00060\u0010R\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0004R \u0010\u0012\u001a\u00060\u0010R\u00020\u00118\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "", "detach$okhttp", "()V", "detach", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "Lokio/Source;", "newSource", "(I)Lokio/Source;", "Lokio/Sink;", "newSink", "(I)Lokio/Sink;", "commit", "abort", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class Editor {
        private boolean done;
        @NotNull
        private final Entry entry;
        public final /* synthetic */ DiskLruCache this$0;
        @Nullable
        private final boolean[] written;

        public Editor(@NotNull DiskLruCache diskLruCache, Entry entry) {
        }

        public final void abort() throws IOException {
        }

        public final void commit() throws IOException {
        }

        public final void detach$okhttp() {
        }

        @NotNull
        public final Entry getEntry$okhttp() {
        }

        @Nullable
        public final boolean[] getWritten$okhttp() {
        }

        @NotNull
        public final Sink newSink(int i2) {
        }

        @Nullable
        public final Source newSource(int i2) {
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u00101\u001a\u00020\u0003¢\u0006\u0004\bJ\u0010KJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u001a\u001a\b\u0018\u00010\u0016R\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010&\u001a\b\u0018\u00010%R\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00101\u001a\u00020\u00038\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010;\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010H\u001a\b\u0012\u0004\u0012\u000206058\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bI\u0010:¨\u0006L"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "", "strings", "", "invalidLengths", "(Ljava/util/List;)Ljava/lang/Void;", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "Lokio/Source;", "newSource", "(I)Lokio/Source;", "", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lokio/BufferedSink;", "writer", "writeLengths$okhttp", "(Lokio/BufferedSink;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "", "zombie", "Z", "getZombie$okhttp", "()Z", "setZombie$okhttp", "(Z)V", "readable", "getReadable$okhttp", "setReadable$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "", "lengths", "[J", "getLengths$okhttp", "()[J", "key", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "dirtyFiles", "getDirtyFiles$okhttp", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class Entry {
        @NotNull
        private final List<File> cleanFiles;
        @Nullable
        private Editor currentEditor;
        @NotNull
        private final List<File> dirtyFiles;
        @NotNull
        private final String key;
        @NotNull
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        public final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(@NotNull DiskLruCache diskLruCache, String str) {
        }

        private final Void invalidLengths(List<String> list) throws IOException {
        }

        private final Source newSource(int i2) {
        }

        @NotNull
        public final List<File> getCleanFiles$okhttp() {
        }

        @Nullable
        public final Editor getCurrentEditor$okhttp() {
        }

        @NotNull
        public final List<File> getDirtyFiles$okhttp() {
        }

        @NotNull
        public final String getKey$okhttp() {
        }

        @NotNull
        public final long[] getLengths$okhttp() {
        }

        public final int getLockingSourceCount$okhttp() {
        }

        public final boolean getReadable$okhttp() {
        }

        public final long getSequenceNumber$okhttp() {
        }

        public final boolean getZombie$okhttp() {
        }

        public final void setCurrentEditor$okhttp(@Nullable Editor editor) {
        }

        public final void setLengths$okhttp(@NotNull List<String> list) throws IOException {
        }

        public final void setLockingSourceCount$okhttp(int i2) {
        }

        public final void setReadable$okhttp(boolean z) {
        }

        public final void setSequenceNumber$okhttp(long j2) {
        }

        public final void setZombie$okhttp(boolean z) {
        }

        @Nullable
        public final Snapshot snapshot$okhttp() {
        }

        public final void writeLengths$okhttp(@NotNull BufferedSink bufferedSink) throws IOException {
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "key", "()Ljava/lang/String;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", MapBundleKey.MapObjKey.OBJ_SL_INDEX, "Lokio/Source;", "getSource", "(I)Lokio/Source;", "", "getLength", "(I)J", "", "close", "()V", "", "lengths", "[J", "sequenceNumber", "J", "Ljava/lang/String;", "", "sources", "Ljava/util/List;", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<Source> sources;
        public final /* synthetic */ DiskLruCache this$0;

        public Snapshot(@NotNull DiskLruCache diskLruCache, String str, @NotNull long j2, @NotNull List<? extends Source> list, long[] jArr) {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Nullable
        public final Editor edit() throws IOException {
        }

        public final long getLength(int i2) {
        }

        @NotNull
        public final Source getSource(int i2) {
        }

        @NotNull
        public final String key() {
        }
    }

    public DiskLruCache(@NotNull FileSystem fileSystem, @NotNull File file, int i2, int i3, long j2, @NotNull TaskRunner taskRunner) {
    }

    public static final /* synthetic */ boolean access$getCivilizedFileSystem$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ boolean access$getHasJournalErrors$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ boolean access$getInitialized$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ BufferedSink access$getJournalWriter$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ boolean access$getMostRecentRebuildFailed$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ boolean access$getMostRecentTrimFailed$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ int access$getRedundantOpCount$p(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(DiskLruCache diskLruCache) {
    }

    public static final /* synthetic */ void access$setCivilizedFileSystem$p(DiskLruCache diskLruCache, boolean z) {
    }

    public static final /* synthetic */ void access$setHasJournalErrors$p(DiskLruCache diskLruCache, boolean z) {
    }

    public static final /* synthetic */ void access$setInitialized$p(DiskLruCache diskLruCache, boolean z) {
    }

    public static final /* synthetic */ void access$setJournalWriter$p(DiskLruCache diskLruCache, BufferedSink bufferedSink) {
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(DiskLruCache diskLruCache, boolean z) {
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(DiskLruCache diskLruCache, boolean z) {
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(DiskLruCache diskLruCache, int i2) {
    }

    private final synchronized void checkNotClosed() {
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j2, int i2, Object obj) throws IOException {
    }

    private final boolean journalRebuildRequired() {
    }

    private final BufferedSink newJournalWriter() throws FileNotFoundException {
    }

    private final void processJournal() throws IOException {
    }

    private final void readJournal() throws IOException {
    }

    private final void readJournalLine(String str) throws IOException {
    }

    private final boolean removeOldestEntry() {
    }

    private final void validateKey(String str) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
    }

    public final synchronized void completeEdit$okhttp(@NotNull Editor editor, boolean z) throws IOException {
    }

    public final void delete() throws IOException {
    }

    @JvmOverloads
    @Nullable
    public final Editor edit(@NotNull String str) throws IOException {
    }

    @JvmOverloads
    @Nullable
    public final synchronized Editor edit(@NotNull String str, long j2) throws IOException {
    }

    public final synchronized void evictAll() throws IOException {
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
    }

    @Nullable
    public final synchronized Snapshot get(@NotNull String str) throws IOException {
    }

    public final boolean getClosed$okhttp() {
    }

    @NotNull
    public final File getDirectory() {
    }

    @NotNull
    public final FileSystem getFileSystem$okhttp() {
    }

    @NotNull
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
    }

    public final synchronized long getMaxSize() {
    }

    public final int getValueCount$okhttp() {
    }

    public final synchronized void initialize() throws IOException {
    }

    public final synchronized boolean isClosed() {
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
    }

    public final synchronized boolean remove(@NotNull String str) throws IOException {
    }

    public final boolean removeEntry$okhttp(@NotNull Entry entry) throws IOException {
    }

    public final void setClosed$okhttp(boolean z) {
    }

    public final synchronized void setMaxSize(long j2) {
    }

    public final synchronized long size() throws IOException {
    }

    @NotNull
    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
    }

    public final void trimToSize() throws IOException {
    }
}
