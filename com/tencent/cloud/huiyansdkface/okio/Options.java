package com.tencent.cloud.huiyansdkface.okio;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    public final ByteString[] byteStrings;
    public final int[] trie;

    private Options(ByteString[] byteStringArr, int[] iArr) {
    }

    private static void buildTrieRecursive(long j2, Buffer buffer, int i2, List<ByteString> list, int i3, int i4, List<Integer> list2) {
    }

    private static int intCount(Buffer buffer) {
    }

    public static Options of(ByteString... byteStringArr) {
    }

    @Override // java.util.AbstractList, java.util.List
    public final ByteString get(int i2) {
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
    }
}
