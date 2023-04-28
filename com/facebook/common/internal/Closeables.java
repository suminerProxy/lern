package com.facebook.common.internal;

import androidx.annotation.VisibleForTesting;
import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Closeables {
    @VisibleForTesting
    public static final Logger logger = Logger.getLogger(Closeables.class.getName());

    private Closeables() {
    }

    public static void close(@Nullable Closeable closeable, boolean swallowIOException) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            if (swallowIOException) {
                logger.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e2);
                return;
            }
            throw e2;
        }
    }

    public static void closeQuietly(@Nullable InputStream inputStream) {
        try {
            close(inputStream, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void closeQuietly(@Nullable Reader reader) {
        try {
            close(reader, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
