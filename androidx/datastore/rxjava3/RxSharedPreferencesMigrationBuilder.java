package androidx.datastore.rxjava3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.exifinterface.media.ExifInterface;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxSharedPreferencesMigration.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0010\"\u00020\u0006¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/datastore/rxjava3/RxSharedPreferencesMigrationBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "", "context", "Landroid/content/Context;", "sharedPreferencesName", "", "rxSharedPreferencesMigration", "Landroidx/datastore/rxjava3/RxSharedPreferencesMigration;", "(Landroid/content/Context;Ljava/lang/String;Landroidx/datastore/rxjava3/RxSharedPreferencesMigration;)V", "keysToMigrate", "", "build", "Landroidx/datastore/core/DataMigration;", "setKeysToMigrate", "keys", "", "([Ljava/lang/String;)Landroidx/datastore/rxjava3/RxSharedPreferencesMigrationBuilder;", "datastore-rxjava3_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"TopLevelBuilder"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RxSharedPreferencesMigrationBuilder<T> {
    @NotNull
    private final Context context;
    @Nullable
    private Set<String> keysToMigrate;
    @NotNull
    private final RxSharedPreferencesMigration<T> rxSharedPreferencesMigration;
    @NotNull
    private final String sharedPreferencesName;

    public RxSharedPreferencesMigrationBuilder(@NotNull Context context, @NotNull String str, @NotNull RxSharedPreferencesMigration<T> rxSharedPreferencesMigration) {
    }

    public static final /* synthetic */ RxSharedPreferencesMigration access$getRxSharedPreferencesMigration$p(RxSharedPreferencesMigrationBuilder rxSharedPreferencesMigrationBuilder) {
    }

    @NotNull
    public final DataMigration<T> build() {
    }

    @NotNull
    public final RxSharedPreferencesMigrationBuilder<T> setKeysToMigrate(@NotNull String... strArr) {
    }
}
