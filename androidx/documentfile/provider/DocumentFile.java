package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class DocumentFile {
    public static final String TAG = "DocumentFile";
    @Nullable
    private final DocumentFile mParent;

    public DocumentFile(@Nullable DocumentFile documentFile) {
    }

    @NonNull
    public static DocumentFile fromFile(@NonNull File file) {
    }

    @Nullable
    public static DocumentFile fromSingleUri(@NonNull Context context, @NonNull Uri uri) {
    }

    @Nullable
    public static DocumentFile fromTreeUri(@NonNull Context context, @NonNull Uri uri) {
    }

    public static boolean isDocumentUri(@NonNull Context context, @Nullable Uri uri) {
    }

    public abstract boolean canRead();

    public abstract boolean canWrite();

    @Nullable
    public abstract DocumentFile createDirectory(@NonNull String str);

    @Nullable
    public abstract DocumentFile createFile(@NonNull String str, @NonNull String str2);

    public abstract boolean delete();

    public abstract boolean exists();

    @Nullable
    public DocumentFile findFile(@NonNull String str) {
    }

    @Nullable
    public abstract String getName();

    @Nullable
    public DocumentFile getParentFile() {
    }

    @Nullable
    public abstract String getType();

    @NonNull
    public abstract Uri getUri();

    public abstract boolean isDirectory();

    public abstract boolean isFile();

    public abstract boolean isVirtual();

    public abstract long lastModified();

    public abstract long length();

    @NonNull
    public abstract DocumentFile[] listFiles();

    public abstract boolean renameTo(@NonNull String str);
}
