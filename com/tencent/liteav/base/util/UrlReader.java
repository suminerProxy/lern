package com.tencent.liteav.base.util;

import android.net.Uri;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.io.InputStream;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UrlReader {
    private static final int AVSEEK_SIZE = 65536;
    private static final int SEEK_CUR = 1;
    private static final int SEEK_END = 2;
    private static final int SEEK_SET = 0;
    private static final String TAG = "UrlReader";
    private int mFileSize;
    private long mOffset;
    private InputStream mStream;
    private Uri mUri;

    @CalledByNative
    public UrlReader(String str) {
    }

    private void open() {
    }

    private long seekFromBegin(long j2) {
    }

    private long seekFromCurrent(long j2) {
    }

    private long seekFromEnd(long j2) {
    }

    @CalledByNative
    public void close() {
    }

    @CalledByNative
    public int read(byte[] bArr, int i2) {
    }

    @CalledByNative
    public long seek(long j2, int i2) {
    }
}
