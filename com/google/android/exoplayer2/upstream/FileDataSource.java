package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FileDataSource extends BaseDataSource {
    private long bytesRemaining;
    @Nullable
    private RandomAccessFile file;
    private boolean opened;
    @Nullable
    private Uri uri;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Factory implements DataSource.Factory {
        @Nullable
        private TransferListener listener;

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ DataSource createDataSource() {
        }

        public Factory setListener(@Nullable TransferListener listener) {
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public FileDataSource createDataSource() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class FileDataSourceException extends DataSourceException {
        @Deprecated
        public FileDataSourceException(Exception cause) {
        }

        @Deprecated
        public FileDataSourceException(String message, IOException cause) {
        }

        public FileDataSourceException(Throwable cause, int errorCode) {
        }

        public FileDataSourceException(@Nullable String message, @Nullable Throwable cause, int errorCode) {
        }
    }

    @RequiresApi(21)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PlatformOperationsWrapperV21 {
        private PlatformOperationsWrapperV21() {
        }

        public static /* synthetic */ boolean access$000(Throwable th) {
        }

        @DoNotInline
        private static boolean isPermissionError(@Nullable Throwable e2) {
        }
    }

    private static RandomAccessFile openLocalFile(Uri uri) throws FileDataSourceException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws FileDataSourceException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws FileDataSourceException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws FileDataSourceException {
    }
}
