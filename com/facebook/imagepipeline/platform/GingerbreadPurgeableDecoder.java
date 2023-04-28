package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

@DoNotStrip
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    private static Method sGetFileDescriptorMethod;
    @Nullable
    private final WebpBitmapFactory mWebpBitmapFactory;

    private static MemoryFile copyToMemoryFile(CloseableReference<PooledByteBuffer> bytesRef, int inputLength, @Nullable byte[] suffix) throws IOException {
    }

    private Bitmap decodeFileDescriptorAsPurgeable(CloseableReference<PooledByteBuffer> bytesRef, int inputLength, @Nullable byte[] suffix, BitmapFactory.Options options) {
    }

    private synchronized Method getFileDescriptorMethod() {
    }

    private FileDescriptor getMemoryFileDescriptor(MemoryFile memoryFile) {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> bytesRef, BitmapFactory.Options options) {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> bytesRef, int length, BitmapFactory.Options options) {
    }
}
