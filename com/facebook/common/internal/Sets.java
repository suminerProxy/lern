package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class Sets {
    private Sets() {
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithCapacity(int capacity) {
        return new HashSet<>(capacity);
    }

    public static <E> Set<E> newIdentityHashSet() {
        return newSetFromMap(new IdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E> HashSet<E> newHashSet(E... elements) {
        HashSet<E> newHashSetWithCapacity = newHashSetWithCapacity(elements.length);
        Collections.addAll(newHashSetWithCapacity, elements);
        return newHashSetWithCapacity;
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> elements) {
        return elements instanceof Collection ? new HashSet<>((Collection) elements) : newHashSet(elements.iterator());
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> elements) {
        HashSet<E> newHashSet = newHashSet();
        while (elements.hasNext()) {
            newHashSet.add(elements.next());
        }
        return newHashSet;
    }
}
