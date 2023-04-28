package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AndroidPredicates {
    private AndroidPredicates() {
    }

    public static <T> Predicate<T> False() {
        return new Predicate<T>() { // from class: com.facebook.common.internal.AndroidPredicates.2
            @Override // com.facebook.common.internal.Predicate
            public boolean apply(T t) {
            }
        };
    }

    public static <T> Predicate<T> True() {
        return new Predicate<T>() { // from class: com.facebook.common.internal.AndroidPredicates.1
            @Override // com.facebook.common.internal.Predicate
            public boolean apply(T t) {
            }
        };
    }
}
