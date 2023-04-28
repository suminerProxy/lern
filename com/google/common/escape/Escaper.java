package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;

@GwtCompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Escaper {
    private final Function<String, String> asFunction;

    /* renamed from: com.google.common.escape.Escaper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Function<String, String> {
        public final /* synthetic */ Escaper this$0;

        public AnonymousClass1(Escaper escaper) {
        }

        @Override // com.google.common.base.Function
        public /* bridge */ /* synthetic */ String apply(String str) {
        }

        /* renamed from: apply  reason: avoid collision after fix types in other method */
        public String apply2(String str) {
        }
    }

    public final Function<String, String> asFunction() {
    }

    public abstract String escape(String str);
}
