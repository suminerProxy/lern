package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    @Nullable
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String key, long position, long length) {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CacheSpan another) {
    }

    public boolean isHoleSpan() {
    }

    public boolean isOpenEnded() {
    }

    public String toString() {
    }

    public CacheSpan(String key, long position, long length, long lastTouchTimestamp, @Nullable File file) {
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(CacheSpan another) {
    }
}
