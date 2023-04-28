package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ExifInterfaceUtils {
    private static final String TAG = "ExifInterfaceUtils";

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static void close(FileDescriptor fileDescriptor) throws ErrnoException {
        }

        @DoNotInline
        public static FileDescriptor dup(FileDescriptor fileDescriptor) throws ErrnoException {
        }

        @DoNotInline
        public static long lseek(FileDescriptor fileDescriptor, long j2, int i2) throws ErrnoException {
        }
    }

    @RequiresApi(23)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static void setDataSource(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
        }
    }

    private ExifInterfaceUtils() {
    }

    public static String byteArrayToHexString(byte[] bArr) {
    }

    public static void closeFileDescriptor(FileDescriptor fileDescriptor) {
    }

    public static void closeQuietly(Closeable closeable) {
    }

    public static long[] convertToLongArray(Object obj) {
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
    }

    public static long parseSubSeconds(String str) {
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i2) throws IOException {
    }
}
