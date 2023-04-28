package com.efs.sdk.base.newsharedpreferences;

import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SharedPreferencesNewImpl implements SharedPreferences {
    private static final String BACKUP_FILE_SUFFIX = ".bak";
    private static final int CONTENT_LENGTH_LOST = 1;
    private static final int CONTENT_OVER_SIZE = 7;
    private static final int DATA_TYPE_ERROR = 8;
    private static final int DATA_TYPE_INVALID = 9;
    private static final long DELAY_TIME_TO_SAVE = 1000;
    private static final byte FINISH_MARK = 18;
    private static final int FINISH_MARK_LENGTH = 1;
    private static final int ID_LENGTH = 4;
    private static final int INIT_EXCEPTION = 10;
    private static final int LOAD_BAK_FILE = 12;
    private static final int MAPPED_BUFFER_ERROR = 4;
    private static final int MAX_HANDLERTHREAD = 3;
    private static final long MAX_LOCK_FILE_TIME = 10000;
    private static final int MAX_NUM = Integer.MAX_VALUE;
    private static final int MAX_TRY_TIME = 6;
    private static final int MIN_INCREASE_LENGTH = 1024;
    private static final int MODIFY_ID_LOST = 2;
    private static final int OTHER_EXCEPTION = 11;
    private static final String TAG = "SharedPreferencesNew";
    private static final long TRY_RELOAD_INTERVAL = 60;
    private static final int TRY_SAVE_TIME_DELAY = 2000;
    private static final int TYPE_CAST_EXCEPTION = 13;
    private static final int VALUE_LOST = 3;
    private static final Object mFileMonitorSyncObj = null;
    private static HandlerThread[] mHandlerThreadPool = null;
    private static final int mSaveMessageID = 21310;
    private static ExecutorService sCachedThreadPool;
    private String mBackupFilePath;
    private int mCurTryTime;
    private Vector<SharedPreferences.Editor> mEditorList;
    private OnSharedPreferenceErrorListener mErrorListener;
    private File mFile;
    private FileChannel mFileChannel;
    private FileMonitor mFileMonitor;
    private Handler mHandler;
    private boolean mIsSaving;
    private final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mListeners;
    private boolean mLoaded;
    private final LinkedHashMap<String, Object> mMap;
    private MappedByteBuffer mMappedByteBuffer;
    private int mModifyErrorCnt;
    private int mModifyID;
    private RunnableEx mSaveRunnable;
    private final Object mSyncObj;
    private final Object mSyncSaveObj;
    private final Runnable mTryReloadRunnable;
    private long mTryReloadStartTime;

    /* renamed from: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ SharedPreferencesNewImpl this$0;

        public AnonymousClass1(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ SharedPreferencesNewImpl this$0;

        public AnonymousClass2(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ SharedPreferencesNewImpl this$0;
        public final /* synthetic */ boolean val$force;

        public AnonymousClass3(SharedPreferencesNewImpl sharedPreferencesNewImpl, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 extends RunnableEx {
        public final /* synthetic */ SharedPreferencesNewImpl this$0;

        public AnonymousClass4(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ SharedPreferencesNewImpl this$0;

        public AnonymousClass5(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ByteFloatUtils {
        private ByteFloatUtils() {
        }

        public static float bytesToFloat(byte[] bArr) {
        }

        public static byte[] floatToBytes(float f2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ByteIntUtils {
        private ByteIntUtils() {
        }

        public static int bytesToInt(byte[] bArr) {
        }

        public static byte[] intToBytes(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class ByteLongUtils {
        private ByteLongUtils() {
        }

        public static long bytesToLong(byte[] bArr) {
        }

        public static byte[] longToBytes(long j2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class EditorImpl implements SharedPreferences.Editor {
        private boolean mClear;
        private HashMap<String, Object> mModified;
        public final /* synthetic */ SharedPreferencesNewImpl this$0;

        public EditorImpl(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
        }

        public final boolean doClear() {
        }

        public final HashMap<String, Object> getAll() {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f2) {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i2) {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j2) {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public final class FileMonitor extends FileObserver {
        public final /* synthetic */ SharedPreferencesNewImpl this$0;

        public FileMonitor(SharedPreferencesNewImpl sharedPreferencesNewImpl, String str, int i2) {
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i2, String str) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface OnSharedPreferenceErrorListener {
        void onError(String str, int i2, long j2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class RunnableEx implements Runnable {
        private Object mArg;

        public Object getArg() {
        }

        public void setArg(Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class SUPPORTED_TYPE {
        public static final byte TYPE_BOOLEAN = 4;
        public static final byte TYPE_FLOAT = 2;
        public static final byte TYPE_INT = 1;
        public static final byte TYPE_LONG = 3;
        public static final byte TYPE_STRING = 5;
        public final /* synthetic */ SharedPreferencesNewImpl this$0;

        private SUPPORTED_TYPE(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
        }
    }

    public SharedPreferencesNewImpl(File file) {
    }

    public static /* synthetic */ String access$000(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
    }

    public static /* synthetic */ void access$100(SharedPreferencesNewImpl sharedPreferencesNewImpl, SharedPreferences.Editor editor, boolean z, boolean z2, boolean z3) {
    }

    public static /* synthetic */ int access$200(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
    }

    public static /* synthetic */ void access$300(SharedPreferencesNewImpl sharedPreferencesNewImpl, boolean z) {
    }

    public static /* synthetic */ void access$400(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
    }

    public static /* synthetic */ ArrayList access$500(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
    }

    public static /* synthetic */ void access$600(SharedPreferencesNewImpl sharedPreferencesNewImpl) {
    }

    private MappedByteBuffer allocBuffer(int i2) {
    }

    private void awaitLoadedLocked() {
    }

    private void backup() {
    }

    private byte getBCCCode(byte[] bArr) {
    }

    private byte[] getBytes(Object obj) {
    }

    private int getContentLength() {
    }

    private Pair<Integer, byte[][]> getDataBytes() {
    }

    private HandlerThread getHandlerThread() {
    }

    private byte getMaskByte(byte[] bArr) {
    }

    private Object getObjectByType(byte[] bArr, int i2) {
    }

    private int getObjectType(Object obj) {
    }

    private Pair<byte[], Integer> getOneString(byte[] bArr, int i2) {
    }

    private int increaseModifyID() {
    }

    private boolean initBuffer() {
    }

    private void initFileHeader() {
    }

    private void load(boolean z) {
    }

    private boolean loadFromBakFile() {
    }

    private void loadFromDiskLocked() {
    }

    private FileLock lockFile(boolean z) {
    }

    private boolean merge(SharedPreferences.Editor editor, Map map, boolean z) {
    }

    private void mergeWhenReload() {
    }

    private void notifyDataChanged(String str) {
    }

    private byte[] obtainTotalBytes() {
    }

    private boolean parseBytesIntoMap(byte[] bArr, boolean z) {
    }

    private void reallocBuffer() {
    }

    private boolean safeBufferGet(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
    }

    private void safeBufferPut(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
    }

    private void safeClose(Closeable closeable) {
    }

    private void save(SharedPreferences.Editor editor, boolean z, boolean z2, boolean z3) {
    }

    private void saveInner(boolean z) {
    }

    private void saveToMappedBuffer(byte[] bArr, boolean z) {
    }

    private void startLoadFromDisk(boolean z) {
    }

    private void tryReload() {
    }

    private boolean tryReloadWhenSave() {
    }

    public final boolean checkTypeValid(byte b) {
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f2) {
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i2) {
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j2) {
    }

    public final int getModifyID() {
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
    }

    public final void onDestroy() {
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public final void setSharedPreferenceErrorListener(OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public SharedPreferencesNewImpl(File file, boolean z) {
    }

    public SharedPreferencesNewImpl(File file, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
    }

    public SharedPreferencesNewImpl(File file, int i2, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
    }

    public SharedPreferencesNewImpl(File file, int i2, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener, boolean z) {
    }
}
