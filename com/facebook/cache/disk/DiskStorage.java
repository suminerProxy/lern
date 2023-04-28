package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.WriterCallback;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface DiskStorage {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DiskDumpInfo {
        public List<DiskDumpInfoEntry> entries = new ArrayList();
        public Map<String, Integer> typeCounts = new HashMap();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class DiskDumpInfoEntry {
        public final String firstBits;
        public final String id;
        public final String path;
        public final float size;
        public final String type;

        public DiskDumpInfoEntry(String id, String path, String type, float size, String firstBits) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Entry {
        String getId();

        BinaryResource getResource();

        long getSize();

        long getTimestamp();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface Inserter {
        boolean cleanUp();

        BinaryResource commit(Object debugInfo) throws IOException;

        BinaryResource commit(Object debugInfo, long time) throws IOException;

        void writeData(WriterCallback callback, Object debugInfo) throws IOException;
    }

    void clearAll() throws IOException;

    boolean contains(String resourceId, Object debugInfo) throws IOException;

    DiskDumpInfo getDumpInfo() throws IOException;

    Collection<Entry> getEntries() throws IOException;

    @Nullable
    BinaryResource getResource(String resourceId, Object debugInfo) throws IOException;

    String getStorageName();

    Inserter insert(String resourceId, Object debugInfo) throws IOException;

    boolean isEnabled();

    boolean isExternal();

    void purgeUnexpectedResources();

    long remove(Entry entry) throws IOException;

    long remove(String resourceId) throws IOException;

    boolean touch(String resourceId, Object debugInfo) throws IOException;
}
