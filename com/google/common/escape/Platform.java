package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible(emulated = true)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = null;

    /* renamed from: com.google.common.escape.Platform$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends ThreadLocal<char[]> {
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ char[] initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public char[] initialValue2() {
        }
    }

    private Platform() {
    }

    public static char[] charBufferFromThreadLocal() {
    }
}
