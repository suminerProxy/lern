package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.TreeTraverser;
import com.google.common.graph.SuccessorsFunction;
import com.google.common.graph.Traverser;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Files {
    private static final SuccessorsFunction<File> FILE_TREE = null;
    private static final TreeTraverser<File> FILE_TREE_TRAVERSER = null;
    private static final int TEMP_DIR_ATTEMPTS = 10000;

    /* renamed from: com.google.common.io.Files$1  reason: invalid class name */
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

    /* renamed from: com.google.common.io.Files$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends TreeTraverser<File> {
        @Override // com.google.common.collect.TreeTraverser
        public /* bridge */ /* synthetic */ Iterable<File> children(File file) {
        }

        public String toString() {
        }

        /* renamed from: children  reason: avoid collision after fix types in other method */
        public Iterable<File> children2(File file) {
        }
    }

    /* renamed from: com.google.common.io.Files$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass3 implements SuccessorsFunction<File> {
        @Override // com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ Iterable<? extends File> successors(File file) {
        }

        /* renamed from: successors  reason: avoid collision after fix types in other method */
        public Iterable<File> successors2(File file) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FileByteSink extends ByteSink {
        private final File file;
        private final ImmutableSet<FileWriteMode> modes;

        public /* synthetic */ FileByteSink(File file, FileWriteMode[] fileWriteModeArr, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.io.ByteSink
        public /* bridge */ /* synthetic */ OutputStream openStream() throws IOException {
        }

        public String toString() {
        }

        private FileByteSink(File file, FileWriteMode... fileWriteModeArr) {
        }

        @Override // com.google.common.io.ByteSink
        public FileOutputStream openStream() throws IOException {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class FileByteSource extends ByteSource {
        private final File file;

        public /* synthetic */ FileByteSource(File file, AnonymousClass1 anonymousClass1) {
        }

        @Override // com.google.common.io.ByteSource
        public /* bridge */ /* synthetic */ InputStream openStream() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public byte[] read() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public long size() throws IOException {
        }

        @Override // com.google.common.io.ByteSource
        public Optional<Long> sizeIfKnown() {
        }

        public String toString() {
        }

        private FileByteSource(File file) {
        }

        @Override // com.google.common.io.ByteSource
        public FileInputStream openStream() throws IOException {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class FilePredicate implements Predicate<File> {
        private static final /* synthetic */ FilePredicate[] $VALUES = null;
        public static final FilePredicate IS_DIRECTORY = null;
        public static final FilePredicate IS_FILE = null;

        /* renamed from: com.google.common.io.Files$FilePredicate$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends FilePredicate {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(File file) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }

            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public boolean apply2(File file) {
            }
        }

        /* renamed from: com.google.common.io.Files$FilePredicate$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends FilePredicate {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.base.Predicate
            public /* bridge */ /* synthetic */ boolean apply(File file) {
            }

            @Override // java.lang.Enum
            public String toString() {
            }

            /* renamed from: apply  reason: avoid collision after fix types in other method */
            public boolean apply2(File file) {
            }
        }

        private FilePredicate(String str, int i2) {
        }

        public static FilePredicate valueOf(String str) {
        }

        public static FilePredicate[] values() {
        }

        public /* synthetic */ FilePredicate(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    private Files() {
    }

    public static /* synthetic */ Iterable access$200(File file) {
    }

    @Beta
    @Deprecated
    public static void append(CharSequence charSequence, File file, Charset charset) throws IOException {
    }

    public static ByteSink asByteSink(File file, FileWriteMode... fileWriteModeArr) {
    }

    public static ByteSource asByteSource(File file) {
    }

    public static CharSink asCharSink(File file, Charset charset, FileWriteMode... fileWriteModeArr) {
    }

    public static CharSource asCharSource(File file, Charset charset) {
    }

    @Beta
    public static void copy(File file, OutputStream outputStream) throws IOException {
    }

    @Beta
    public static void createParentDirs(File file) throws IOException {
    }

    @Beta
    public static File createTempDir() {
    }

    @Beta
    public static boolean equal(File file, File file2) throws IOException {
    }

    @Beta
    public static Traverser<File> fileTraverser() {
    }

    private static Iterable<File> fileTreeChildren(File file) {
    }

    @Deprecated
    public static TreeTraverser<File> fileTreeTraverser() {
    }

    @Beta
    public static String getFileExtension(String str) {
    }

    @Beta
    public static String getNameWithoutExtension(String str) {
    }

    @Beta
    @Deprecated
    public static HashCode hash(File file, HashFunction hashFunction) throws IOException {
    }

    @Beta
    public static Predicate<File> isDirectory() {
    }

    @Beta
    public static Predicate<File> isFile() {
    }

    @Beta
    public static MappedByteBuffer map(File file) throws IOException {
    }

    private static MappedByteBuffer mapInternal(File file, FileChannel.MapMode mapMode, long j2) throws IOException {
    }

    @Beta
    public static void move(File file, File file2) throws IOException {
    }

    @Beta
    public static BufferedReader newReader(File file, Charset charset) throws FileNotFoundException {
    }

    @Beta
    public static BufferedWriter newWriter(File file, Charset charset) throws FileNotFoundException {
    }

    @Beta
    @Deprecated
    @CanIgnoreReturnValue
    public static <T> T readBytes(File file, ByteProcessor<T> byteProcessor) throws IOException {
    }

    @Beta
    @Deprecated
    public static String readFirstLine(File file, Charset charset) throws IOException {
    }

    @Beta
    public static List<String> readLines(File file, Charset charset) throws IOException {
    }

    @Beta
    public static String simplifyPath(String str) {
    }

    @Beta
    public static byte[] toByteArray(File file) throws IOException {
    }

    @Beta
    @Deprecated
    public static String toString(File file, Charset charset) throws IOException {
    }

    @Beta
    public static void touch(File file) throws IOException {
    }

    @Beta
    public static void write(byte[] bArr, File file) throws IOException {
    }

    @Beta
    public static void copy(File file, File file2) throws IOException {
    }

    @Beta
    @Deprecated
    public static void write(CharSequence charSequence, File file, Charset charset) throws IOException {
    }

    @Beta
    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode) throws IOException {
    }

    @Beta
    @Deprecated
    @CanIgnoreReturnValue
    public static <T> T readLines(File file, Charset charset, LineProcessor<T> lineProcessor) throws IOException {
    }

    @Beta
    @Deprecated
    public static void copy(File file, Charset charset, Appendable appendable) throws IOException {
    }

    @Beta
    public static MappedByteBuffer map(File file, FileChannel.MapMode mapMode, long j2) throws IOException {
    }
}
