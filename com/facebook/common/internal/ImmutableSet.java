package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import java.util.HashSet;
import java.util.Set;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImmutableSet<E> extends HashSet<E> {
    private ImmutableSet(Set<E> set) {
    }

    public static <E> ImmutableSet<E> copyOf(Set<E> set) {
    }

    public static <E> ImmutableSet<E> of(E... elements) {
    }
}
