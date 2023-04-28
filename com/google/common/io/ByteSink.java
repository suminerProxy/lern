package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ByteSink {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AsCharSink extends CharSink {
        private final Charset charset;
        public final /* synthetic */ ByteSink this$0;

        public /* synthetic */ AsCharSink(ByteSink byteSink, Charset charset, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.io.CharSink
        public Writer openStream() throws IOException {
        }

        public String toString() {
        }

        private AsCharSink(ByteSink byteSink, Charset charset) {
        }
    }

    public CharSink asCharSink(Charset charset) {
    }

    public OutputStream openBufferedStream() throws IOException {
    }

    public abstract OutputStream openStream() throws IOException;

    public void write(byte[] bArr) throws IOException {
    }

    @CanIgnoreReturnValue
    public long writeFrom(InputStream inputStream) throws IOException {
    }
}
