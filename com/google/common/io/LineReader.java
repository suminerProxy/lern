package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Queue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LineReader {
    private final char[] buf;
    private final CharBuffer cbuf;
    private final LineBuffer lineBuf;
    private final Queue<String> lines;
    private final Readable readable;
    @NullableDecl
    private final Reader reader;

    /* renamed from: com.google.common.io.LineReader$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 extends LineBuffer {
        public final /* synthetic */ LineReader this$0;

        public AnonymousClass1(LineReader lineReader) {
        }

        @Override // com.google.common.io.LineBuffer
        public void handleLine(String str, String str2) {
        }
    }

    public LineReader(Readable readable) {
    }

    public static /* synthetic */ Queue access$000(LineReader lineReader) {
    }

    @CanIgnoreReturnValue
    public String readLine() throws IOException {
    }
}
