package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Resources {

    /* renamed from: com.google.common.io.Resources$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 implements LineProcessor<List<String>> {
        public final List<String> result;

        @Override // com.google.common.io.LineProcessor
        public /* bridge */ /* synthetic */ List<String> getResult() {
        }

        @Override // com.google.common.io.LineProcessor
        public boolean processLine(String str) {
        }

        @Override // com.google.common.io.LineProcessor
        /* renamed from: getResult  reason: avoid collision after fix types in other method */
        public List<String> getResult2() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class UrlByteSource extends ByteSource {
        private final URL url;

        public /* synthetic */ UrlByteSource(URL url, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }

        public String toString() {
        }

        private UrlByteSource(URL url) {
        }
    }

    private Resources() {
    }

    public static ByteSource asByteSource(URL url) {
    }

    public static CharSource asCharSource(URL url, Charset charset) {
    }

    public static void copy(URL url, OutputStream outputStream) throws IOException {
    }

    @CanIgnoreReturnValue
    public static URL getResource(String str) {
    }

    @CanIgnoreReturnValue
    public static <T> T readLines(URL url, Charset charset, LineProcessor<T> lineProcessor) throws IOException {
    }

    public static byte[] toByteArray(URL url) throws IOException {
    }

    public static String toString(URL url, Charset charset) throws IOException {
    }

    public static List<String> readLines(URL url, Charset charset) throws IOException {
    }

    public static URL getResource(Class<?> cls, String str) {
    }
}
