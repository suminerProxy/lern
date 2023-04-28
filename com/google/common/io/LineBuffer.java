package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class LineBuffer {
    private StringBuilder line;
    private boolean sawReturn;

    @CanIgnoreReturnValue
    private boolean finishLine(boolean z) throws IOException {
    }

    public void add(char[] cArr, int i2, int i3) throws IOException {
    }

    public void finish() throws IOException {
    }

    public abstract void handleLine(String str, String str2) throws IOException;
}
