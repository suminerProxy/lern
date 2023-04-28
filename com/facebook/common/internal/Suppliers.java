package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Suppliers {
    public static final Supplier<Boolean> BOOLEAN_TRUE = new Supplier<Boolean>() { // from class: com.facebook.common.internal.Suppliers.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.common.internal.Supplier
        public Boolean get() {
            return Boolean.TRUE;
        }
    };
    public static final Supplier<Boolean> BOOLEAN_FALSE = new Supplier<Boolean>() { // from class: com.facebook.common.internal.Suppliers.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.common.internal.Supplier
        public Boolean get() {
            return Boolean.FALSE;
        }
    };

    public static <T> Supplier<T> of(final T instance) {
        return new Supplier<T>() { // from class: com.facebook.common.internal.Suppliers.1
            @Override // com.facebook.common.internal.Supplier
            public T get() {
                return (T) instance;
            }
        };
    }
}
