package com.facebook.stetho.inspector.helper;

import android.annotation.TargetApi;
import android.view.ViewDebug;
import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class IntegerFormatter {
    private static IntegerFormatter cachedFormatter;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class IntegerFormatterWithHex extends IntegerFormatter {
        private IntegerFormatterWithHex() {
        }

        @Override // com.facebook.stetho.inspector.helper.IntegerFormatter
        @TargetApi(21)
        public String format(Integer num, @Nullable ViewDebug.ExportedProperty exportedProperty) {
        }

        public /* synthetic */ IntegerFormatterWithHex(AnonymousClass1 anonymousClass1) {
        }
    }

    public /* synthetic */ IntegerFormatter(AnonymousClass1 anonymousClass1) {
    }

    public static IntegerFormatter getInstance() {
    }

    public String format(Integer num, @Nullable ViewDebug.ExportedProperty exportedProperty) {
    }

    private IntegerFormatter() {
    }
}
