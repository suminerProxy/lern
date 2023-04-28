package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AtomicFile {
    private final File mBackupName;
    private final File mBaseName;

    public AtomicFile(@NonNull File file) {
    }

    private static boolean sync(@NonNull FileOutputStream fileOutputStream) {
    }

    public void delete() {
    }

    public void failWrite(@Nullable FileOutputStream fileOutputStream) {
    }

    public void finishWrite(@Nullable FileOutputStream fileOutputStream) {
    }

    @NonNull
    public File getBaseFile() {
    }

    @NonNull
    public FileInputStream openRead() throws FileNotFoundException {
    }

    @NonNull
    public byte[] readFully() throws IOException {
    }

    @NonNull
    public FileOutputStream startWrite() throws IOException {
    }
}
