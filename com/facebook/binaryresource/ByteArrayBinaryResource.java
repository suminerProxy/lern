package com.facebook.binaryresource;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ByteArrayBinaryResource implements BinaryResource {
    private final byte[] mBytes;

    public ByteArrayBinaryResource(byte[] bytes) {
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public InputStream openStream() throws IOException {
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public byte[] read() {
    }

    @Override // com.facebook.binaryresource.BinaryResource
    public long size() {
    }
}
