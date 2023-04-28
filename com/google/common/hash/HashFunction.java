package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@Immutable
@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface HashFunction {
    int bits();

    HashCode hashBytes(ByteBuffer byteBuffer);

    HashCode hashBytes(byte[] bArr);

    HashCode hashBytes(byte[] bArr, int i2, int i3);

    HashCode hashInt(int i2);

    HashCode hashLong(long j2);

    <T> HashCode hashObject(T t, Funnel<? super T> funnel);

    HashCode hashString(CharSequence charSequence, Charset charset);

    HashCode hashUnencodedChars(CharSequence charSequence);

    Hasher newHasher();

    Hasher newHasher(int i2);
}
