package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Closeables {
    @VisibleForTesting
    public static final Logger logger = null;

    private Closeables() {
    }

    public static void close(@NullableDecl Closeable closeable, boolean z) throws IOException {
    }

    public static void closeQuietly(@NullableDecl InputStream inputStream) {
    }

    public static void closeQuietly(@NullableDecl Reader reader) {
    }
}
