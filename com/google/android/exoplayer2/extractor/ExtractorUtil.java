package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ExtractorUtil {
    private ExtractorUtil() {
    }

    @Pure
    public static void checkContainerInput(boolean expression, @Nullable String message) throws ParserException {
    }

    public static boolean peekFullyQuietly(ExtractorInput input, byte[] output, int offset, int length, boolean allowEndOfInput) throws IOException {
    }

    public static int peekToLength(ExtractorInput input, byte[] target, int offset, int length) throws IOException {
    }

    public static boolean readFullyQuietly(ExtractorInput input, byte[] output, int offset, int length) throws IOException {
    }

    public static boolean skipFullyQuietly(ExtractorInput input, int length) throws IOException {
    }
}
