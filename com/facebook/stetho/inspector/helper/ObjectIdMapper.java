package com.facebook.stetho.inspector.helper;

import android.util.SparseArray;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ObjectIdMapper {
    @GuardedBy("mSync")
    private SparseArray<Object> mIdToObjectMap;
    @GuardedBy("mSync")
    private int mNextId;
    @GuardedBy("mSync")
    private final Map<Object, Integer> mObjectToIdMap;
    public final Object mSync;

    public void clear() {
    }

    public boolean containsId(int i2) {
    }

    public boolean containsObject(Object obj) {
    }

    @Nullable
    public Integer getIdForObject(Object obj) {
    }

    @Nullable
    public Object getObjectForId(int i2) {
    }

    public void onMapped(Object obj, int i2) {
    }

    public void onUnmapped(Object obj, int i2) {
    }

    public int putObject(Object obj) {
    }

    @Nullable
    public Integer removeObject(Object obj) {
    }

    @Nullable
    public Object removeObjectById(int i2) {
    }

    public int size() {
    }
}
