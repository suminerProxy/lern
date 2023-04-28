package com.tencent.cloud.huiyansdkface.okhttp3.internal.io;

import com.tencent.cloud.huiyansdkface.okio.Sink;
import com.tencent.cloud.huiyansdkface.okio.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface FileSystem {

    /* renamed from: a  reason: collision with root package name */
    public static final FileSystem f11076a = null;

    /* renamed from: com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 implements FileSystem {
        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem
        public final Sink appendingSink(File file) throws FileNotFoundException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem
        public final void delete(File file) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem
        public final void deleteContents(File file) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem
        public final boolean exists(File file) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem
        public final void rename(File file, File file2) throws IOException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem
        public final Sink sink(File file) throws FileNotFoundException {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem
        public final long size(File file) {
        }

        @Override // com.tencent.cloud.huiyansdkface.okhttp3.internal.io.FileSystem
        public final Source source(File file) throws FileNotFoundException {
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
