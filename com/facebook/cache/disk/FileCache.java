package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.common.disk.DiskTrimmable;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface FileCache extends DiskTrimmable {
    void clearAll();

    long clearOldEntries(long cacheExpirationMs);

    long getCount();

    DiskStorage.DiskDumpInfo getDumpInfo() throws IOException;

    @Nullable
    BinaryResource getResource(CacheKey key);

    long getSize();

    boolean hasKey(CacheKey key);

    boolean hasKeySync(CacheKey key);

    @Nullable
    BinaryResource insert(CacheKey key, WriterCallback writer) throws IOException;

    boolean isEnabled();

    boolean probe(CacheKey key);

    void remove(CacheKey key);
}
