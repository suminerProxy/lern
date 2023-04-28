package com.sunmi.scan;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class SymbolSet extends AbstractCollection<Symbol> {
    private long peer;

    public SymbolSet(long j2) {
    }

    private native void destroy(long j2);

    private native long firstSymbol(long j2);

    private static native void init();

    public synchronized void destroy() {
    }

    public void finalize() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Symbol> iterator() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public native int size();
}
