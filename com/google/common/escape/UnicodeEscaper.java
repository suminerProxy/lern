package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class UnicodeEscaper extends Escaper {
    private static final int DEST_PAD = 32;

    public static int codePointAt(CharSequence charSequence, int i2, int i3) {
    }

    private static char[] growBuffer(char[] cArr, int i2, int i3) {
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
    }

    public abstract char[] escape(int i2);

    public final String escapeSlow(String str, int i2) {
    }

    public int nextEscapeIndex(CharSequence charSequence, int i2, int i3) {
    }
}
