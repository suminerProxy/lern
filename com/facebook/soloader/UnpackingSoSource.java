package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class UnpackingSoSource extends DirectorySoSource {
    private static final String DEPS_FILE_NAME = "dso_deps";
    private static final String LOCK_FILE_NAME = "dso_lock";
    private static final String MANIFEST_FILE_NAME = "dso_manifest";
    private static final byte MANIFEST_VERSION = 1;
    private static final byte STATE_CLEAN = 1;
    private static final byte STATE_DIRTY = 0;
    private static final String STATE_FILE_NAME = "dso_state";
    private static final String TAG = "fb-UnpackingSoSource";
    @Nullable
    private String[] mAbis;
    public final Context mContext;
    @Nullable
    public String mCorruptedLib;
    private final Map<String, Object> mLibsBeingLoaded;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class Dso {
        public final String hash;
        public final String name;

        public Dso(String str, String str2) {
            this.name = str;
            this.hash = str2;
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DsoManifest {
        public final Dso[] dsos;

        public DsoManifest(Dso[] dsoArr) {
            this.dsos = dsoArr;
        }

        public static final DsoManifest read(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    Dso[] dsoArr = new Dso[readInt];
                    for (int i2 = 0; i2 < readInt; i2++) {
                        dsoArr[i2] = new Dso(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new DsoManifest(dsoArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void write(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.dsos.length);
            int i2 = 0;
            while (true) {
                Dso[] dsoArr = this.dsos;
                if (i2 >= dsoArr.length) {
                    return;
                }
                dataOutput.writeUTF(dsoArr[i2].name);
                dataOutput.writeUTF(this.dsos[i2].hash);
                i2++;
            }
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InputDso implements Closeable {
        public final InputStream content;
        public final Dso dso;

        public InputDso(Dso dso, InputStream inputStream) {
            this.dso = dso;
            this.content = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.content.close();
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class InputDsoIterator implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public abstract boolean hasNext();

        public abstract InputDso next() throws IOException;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Unpacker implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public abstract DsoManifest getDsoManifest() throws IOException;

        public abstract InputDsoIterator openDsoIterator() throws IOException;
    }

    public UnpackingSoSource(Context context, String str) {
        super(getSoStorePath(context, str), 1);
        this.mLibsBeingLoaded = new HashMap();
        this.mContext = context;
    }

    private void deleteUnmentionedFiles(Dso[] dsoArr) throws IOException {
        String[] list = this.soDirectory.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(STATE_FILE_NAME) && !str.equals(LOCK_FILE_NAME) && !str.equals(DEPS_FILE_NAME) && !str.equals(MANIFEST_FILE_NAME)) {
                    boolean z = false;
                    for (int i2 = 0; !z && i2 < dsoArr.length; i2++) {
                        if (dsoArr[i2].name.equals(str)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        File file = new File(this.soDirectory, str);
                        r0 = "deleting unaccounted-for file " + file;
                        SysUtil.dumbDeleteRecursive(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.soDirectory);
    }

    private void extractDso(InputDso inputDso, byte[] bArr) throws IOException {
        boolean writable;
        String str = "extracting DSO " + inputDso.dso.name;
        try {
            if (this.soDirectory.setWritable(true)) {
                extractDsoImpl(inputDso, bArr);
                if (writable) {
                    return;
                }
                return;
            }
            throw new IOException("cannot make directory writable for us: " + this.soDirectory);
        } finally {
            if (!this.soDirectory.setWritable(false)) {
                String str2 = "error removing " + this.soDirectory.getCanonicalPath() + " write permission";
            }
        }
    }

    private void extractDsoImpl(InputDso inputDso, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        File file = new File(this.soDirectory, inputDso.dso.name);
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    String str = "error adding write permission to: " + file;
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException unused) {
                    String str2 = "error overwriting " + file + " trying to delete and start over";
                    SysUtil.dumbDeleteRecursive(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int available = inputDso.content.available();
                if (available > 1) {
                    SysUtil.fallocateIfSupported(randomAccessFile2.getFD(), available);
                }
                SysUtil.copyBytes(randomAccessFile2, inputDso.content, Integer.MAX_VALUE, bArr);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (file.setExecutable(true, false)) {
                    if (!file.setWritable(false)) {
                        String str3 = "error removing " + file + " write permission";
                    }
                    randomAccessFile2.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e2) {
                SysUtil.dumbDeleteRecursive(file);
                throw e2;
            }
        } catch (Throwable th) {
            if (!file.setWritable(false)) {
                String str4 = "error removing " + file + " write permission";
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    private Object getLibraryLock(String str) {
        Object obj;
        synchronized (this.mLibsBeingLoaded) {
            obj = this.mLibsBeingLoaded.get(str);
            if (obj == null) {
                obj = new Object();
                this.mLibsBeingLoaded.put(str, obj);
            }
        }
        return obj;
    }

    public static File getSoStorePath(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean refreshLocked(final com.facebook.soloader.FileLocker r11, int r12, final byte[] r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.refreshLocked(com.facebook.soloader.FileLocker, int, byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #7 {all -> 0x0030, blocks: (B:4:0x002b, B:11:0x0037, B:12:0x003e, B:13:0x0048, B:15:0x004e, B:40:0x0094, B:18:0x0056, B:20:0x005b, B:22:0x0069, B:25:0x007a, B:29:0x0081), top: B:52:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #7 {all -> 0x0030, blocks: (B:4:0x002b, B:11:0x0037, B:12:0x003e, B:13:0x0048, B:15:0x004e, B:40:0x0094, B:18:0x0056, B:20:0x005b, B:22:0x0069, B:25:0x007a, B:29:0x0081), top: B:52:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void regenerate(byte r9, com.facebook.soloader.UnpackingSoSource.DsoManifest r10, com.facebook.soloader.UnpackingSoSource.InputDsoIterator r11) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r0.toString()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.soDirectory
            java.lang.String r2 = "dso_manifest"
            r0.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r0 = 1
            if (r9 != r0) goto L33
            com.facebook.soloader.UnpackingSoSource$DsoManifest r9 = com.facebook.soloader.UnpackingSoSource.DsoManifest.read(r1)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33
            goto L34
        L30:
            r9 = move-exception
            goto Lb4
        L33:
            r9 = 0
        L34:
            r2 = 0
            if (r9 != 0) goto L3e
            com.facebook.soloader.UnpackingSoSource$DsoManifest r9 = new com.facebook.soloader.UnpackingSoSource$DsoManifest     // Catch: java.lang.Throwable -> L30
            com.facebook.soloader.UnpackingSoSource$Dso[] r3 = new com.facebook.soloader.UnpackingSoSource.Dso[r2]     // Catch: java.lang.Throwable -> L30
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L30
        L3e:
            com.facebook.soloader.UnpackingSoSource$Dso[] r10 = r10.dsos     // Catch: java.lang.Throwable -> L30
            r8.deleteUnmentionedFiles(r10)     // Catch: java.lang.Throwable -> L30
            r10 = 32768(0x8000, float:4.5918E-41)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L30
        L48:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L98
            com.facebook.soloader.UnpackingSoSource$InputDso r3 = r11.next()     // Catch: java.lang.Throwable -> L30
            r4 = r0
            r5 = r2
        L54:
            if (r4 == 0) goto L7f
            com.facebook.soloader.UnpackingSoSource$Dso[] r6 = r9.dsos     // Catch: java.lang.Throwable -> L7d
            int r7 = r6.length     // Catch: java.lang.Throwable -> L7d
            if (r5 >= r7) goto L7f
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = r6.name     // Catch: java.lang.Throwable -> L7d
            com.facebook.soloader.UnpackingSoSource$Dso r7 = r3.dso     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = r7.name     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L7a
            com.facebook.soloader.UnpackingSoSource$Dso[] r6 = r9.dsos     // Catch: java.lang.Throwable -> L7d
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = r6.hash     // Catch: java.lang.Throwable -> L7d
            com.facebook.soloader.UnpackingSoSource$Dso r7 = r3.dso     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = r7.hash     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L7a
            r4 = r2
        L7a:
            int r5 = r5 + 1
            goto L54
        L7d:
            r9 = move-exception
            goto L85
        L7f:
            if (r4 == 0) goto L92
            r8.extractDso(r3, r10)     // Catch: java.lang.Throwable -> L7d
            goto L92
        L85:
            throw r9     // Catch: java.lang.Throwable -> L86
        L86:
            r10 = move-exception
            if (r3 == 0) goto L91
            r3.close()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r11 = move-exception
            r9.addSuppressed(r11)     // Catch: java.lang.Throwable -> L30
        L91:
            throw r10     // Catch: java.lang.Throwable -> L30
        L92:
            if (r3 == 0) goto L48
            r3.close()     // Catch: java.lang.Throwable -> L30
            goto L48
        L98:
            r1.close()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Finished regenerating DSO store "
            r9.append(r10)
            java.lang.Class r10 = r8.getClass()
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            r9.toString()
            return
        Lb4:
            throw r9     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r10 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lba
            goto Lbe
        Lba:
            r11 = move-exception
            r9.addSuppressed(r11)
        Lbe:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.regenerate(byte, com.facebook.soloader.UnpackingSoSource$DsoManifest, com.facebook.soloader.UnpackingSoSource$InputDsoIterator):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeState(File file, byte b) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public byte[] getDepsBlock() throws IOException {
        Parcel obtain = Parcel.obtain();
        Unpacker makeUnpacker = makeUnpacker();
        try {
            Dso[] dsoArr = makeUnpacker.getDsoManifest().dsos;
            obtain.writeByte((byte) 1);
            obtain.writeInt(dsoArr.length);
            for (int i2 = 0; i2 < dsoArr.length; i2++) {
                obtain.writeString(dsoArr[i2].name);
                obtain.writeString(dsoArr[i2].hash);
            }
            if (makeUnpacker != null) {
                makeUnpacker.close();
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (makeUnpacker != null) {
                    try {
                        makeUnpacker.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String[] getSoSourceAbis() {
        String[] strArr = this.mAbis;
        return strArr == null ? super.getSoSourceAbis() : strArr;
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int loadLibraryFrom;
        synchronized (getLibraryLock(str)) {
            loadLibraryFrom = loadLibraryFrom(str, i2, this.soDirectory, threadPolicy);
        }
        return loadLibraryFrom;
    }

    public abstract Unpacker makeUnpacker() throws IOException;

    @Override // com.facebook.soloader.SoSource
    public void prepare(int i2) throws IOException {
        SysUtil.mkdirOrThrow(this.soDirectory);
        FileLocker lock = FileLocker.lock(new File(this.soDirectory, LOCK_FILE_NAME));
        try {
            String str = "locked dso store " + this.soDirectory;
            if (refreshLocked(lock, i2, getDepsBlock())) {
                lock = null;
            } else {
                String str2 = "dso store is up-to-date: " + this.soDirectory;
            }
        } finally {
            if (lock != null) {
                String str3 = "releasing dso store lock for " + this.soDirectory;
                lock.close();
            } else {
                String str4 = "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)";
            }
        }
    }

    public void setSoSourceAbis(String[] strArr) {
        this.mAbis = strArr;
    }

    public UnpackingSoSource(Context context, File file) {
        super(file, 1);
        this.mLibsBeingLoaded = new HashMap();
        this.mContext = context;
    }

    public synchronized void prepare(String str) throws IOException {
        synchronized (getLibraryLock(str)) {
            this.mCorruptedLib = str;
            prepare(2);
        }
    }
}
