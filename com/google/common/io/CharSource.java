package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Optional;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class CharSource {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class AsByteSource extends ByteSource {
        public final Charset charset;
        public final /* synthetic */ CharSource this$0;

        public AsByteSource(CharSource charSource, Charset charset) {
        }

        @Override // com.google.common.io.ByteSource
        public CharSource asCharSource(Charset charset) {
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class CharSequenceCharSource extends CharSource {
        private static final Splitter LINE_SPLITTER = null;
        public final CharSequence seq;

        /* renamed from: com.google.common.io.CharSource$CharSequenceCharSource$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class AnonymousClass1 extends AbstractIterator<String> {
            public Iterator<String> lines;
            public final /* synthetic */ CharSequenceCharSource this$0;

            public AnonymousClass1(CharSequenceCharSource charSequenceCharSource) {
            }

            @Override // com.google.common.collect.AbstractIterator
            public /* bridge */ /* synthetic */ String computeNext() {
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: computeNext  reason: avoid collision after fix types in other method */
            public String computeNext2() {
            }
        }

        public CharSequenceCharSource(CharSequence charSequence) {
        }

        public static /* synthetic */ Splitter access$100() {
        }

        private Iterator<String> linesIterator() {
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() {
        }

        @Override // com.google.common.io.CharSource
        public long length() {
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() {
        }

        @Override // com.google.common.io.CharSource
        public String read() {
        }

        @Override // com.google.common.io.CharSource
        public String readFirstLine() {
        }

        @Override // com.google.common.io.CharSource
        public ImmutableList<String> readLines() {
        }

        public String toString() {
        }

        @Override // com.google.common.io.CharSource
        public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ConcatenatedCharSource extends CharSource {
        private final Iterable<? extends CharSource> sources;

        public ConcatenatedCharSource(Iterable<? extends CharSource> iterable) {
        }

        @Override // com.google.common.io.CharSource
        public boolean isEmpty() throws IOException {
        }

        @Override // com.google.common.io.CharSource
        public long length() throws IOException {
        }

        @Override // com.google.common.io.CharSource
        public Optional<Long> lengthIfKnown() {
        }

        @Override // com.google.common.io.CharSource
        public Reader openStream() throws IOException {
        }

        public String toString() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EmptyCharSource extends StringCharSource {
        private static final EmptyCharSource INSTANCE = null;

        private EmptyCharSource() {
        }

        public static /* synthetic */ EmptyCharSource access$000() {
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public String toString() {
        }
    }

    public static CharSource concat(Iterable<? extends CharSource> iterable) {
    }

    private long countBySkipping(Reader reader) throws IOException {
    }

    public static CharSource empty() {
    }

    public static CharSource wrap(CharSequence charSequence) {
    }

    @Beta
    public ByteSource asByteSource(Charset charset) {
    }

    @CanIgnoreReturnValue
    public long copyTo(Appendable appendable) throws IOException {
    }

    public boolean isEmpty() throws IOException {
    }

    @Beta
    public long length() throws IOException {
    }

    @Beta
    public Optional<Long> lengthIfKnown() {
    }

    public BufferedReader openBufferedStream() throws IOException {
    }

    public abstract Reader openStream() throws IOException;

    public String read() throws IOException {
    }

    @NullableDecl
    public String readFirstLine() throws IOException {
    }

    public ImmutableList<String> readLines() throws IOException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class StringCharSource extends CharSequenceCharSource {
        public StringCharSource(String str) {
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(Appendable appendable) throws IOException {
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.io.CharSource
        public Reader openStream() {
        }

        @Override // com.google.common.io.CharSource
        public long copyTo(CharSink charSink) throws IOException {
        }
    }

    public static CharSource concat(Iterator<? extends CharSource> it) {
    }

    public static CharSource concat(CharSource... charSourceArr) {
    }

    @CanIgnoreReturnValue
    public long copyTo(CharSink charSink) throws IOException {
    }

    @CanIgnoreReturnValue
    @Beta
    public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
    }
}
