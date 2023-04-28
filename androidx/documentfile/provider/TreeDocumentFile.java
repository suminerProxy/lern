package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TreeDocumentFile extends DocumentFile {
    private Context mContext;
    private Uri mUri;

    public TreeDocumentFile(@Nullable DocumentFile documentFile, Context context, Uri uri) {
    }

    private static void closeQuietly(@Nullable AutoCloseable autoCloseable) {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public DocumentFile createDirectory(String str) {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public DocumentFile createFile(String str, String str2) {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public String getName() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    @Nullable
    public String getType() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public Uri getUri() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public DocumentFile[] listFiles() {
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(String str) {
    }

    @Nullable
    private static Uri createFile(Context context, Uri uri, String str, String str2) {
    }
}
