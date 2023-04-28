package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import java.util.AbstractMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    private RemovalNotification(@NullableDecl K k2, @NullableDecl V v, RemovalCause removalCause) {
    }

    public static <K, V> RemovalNotification<K, V> create(@NullableDecl K k2, @NullableDecl V v, RemovalCause removalCause) {
    }

    public RemovalCause getCause() {
    }

    public boolean wasEvicted() {
    }
}
