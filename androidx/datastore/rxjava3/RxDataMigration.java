package androidx.datastore.rxjava3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import i.a.e1.c.j;
import i.a.e1.c.r0;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface RxDataMigration<T> {
    @NonNull
    j cleanUp();

    @NonNull
    r0<T> migrate(@Nullable T currentData);

    @NonNull
    r0<Boolean> shouldMigrate(@Nullable T currentData);
}
