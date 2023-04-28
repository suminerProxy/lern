package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Ticker {
    private static final Ticker SYSTEM_TICKER = null;

    /* renamed from: com.google.common.base.Ticker$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends Ticker {
        @Override // com.google.common.base.Ticker
        public long read() {
        }
    }

    public static Ticker systemTicker() {
    }

    public abstract long read();
}
