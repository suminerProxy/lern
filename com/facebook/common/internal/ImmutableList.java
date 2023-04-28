package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ImmutableList<E> extends ArrayList<E> {
    private ImmutableList(final int capacity) {
        super(capacity);
    }

    public static <E> ImmutableList<E> copyOf(List<E> list) {
        return new ImmutableList<>(list);
    }

    public static <E> ImmutableList<E> of(E... elements) {
        ImmutableList<E> immutableList = new ImmutableList<>(elements.length);
        Collections.addAll(immutableList, elements);
        return immutableList;
    }

    private ImmutableList(List<E> list) {
        super(list);
    }
}
