package androidx.datastore.rxjava3;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.exifinterface.media.ExifInterface;
import i.a.e1.c.r0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RxSharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/rxjava3/RxSharedPreferencesMigration;", ExifInterface.GPS_DIRECTION_TRUE, "", "migrate", "Lio/reactivex/rxjava3/core/Single;", "sharedPreferencesView", "Landroidx/datastore/migrations/SharedPreferencesView;", "currentData", "(Landroidx/datastore/migrations/SharedPreferencesView;Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Single;", "shouldMigrate", "", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Single;", "datastore-rxjava3_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public interface RxSharedPreferencesMigration<T> {

    /* compiled from: RxSharedPreferencesMigration.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class DefaultImpls {
        @NotNull
        public static <T> r0<Boolean> shouldMigrate(@NotNull RxSharedPreferencesMigration<T> rxSharedPreferencesMigration, T t) {
        }
    }

    @NotNull
    r0<T> migrate(@NotNull SharedPreferencesView sharedPreferencesView, T t);

    @NotNull
    r0<Boolean> shouldMigrate(T t);
}
