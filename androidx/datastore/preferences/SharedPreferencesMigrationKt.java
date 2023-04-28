package androidx.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a2\u0010\u000f\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a:\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"MIGRATE_ALL_KEYS", "", "", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "SharedPreferencesMigration", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/Preferences;", "produceSharedPreferences", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "keysToMigrate", "context", "Landroid/content/Context;", "sharedPreferencesName", "getMigrationFunction", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "Lkotlin/coroutines/Continuation;", "", "()Lkotlin/jvm/functions/Function3;", "getShouldRunMigration", "Lkotlin/Function2;", "", "(Ljava/util/Set;)Lkotlin/jvm/functions/Function2;", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SharedPreferencesMigrationKt {
    @NotNull
    private static final Set<String> MIGRATE_ALL_KEYS = null;

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(@NotNull Context context, @NotNull String str) {
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> function0) {
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> function0, @NotNull Set<String> set) {
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Function0 function0, Set set, int i2, Object obj) {
    }

    @NotNull
    public static final Set<String> getMIGRATE_ALL_KEYS() {
    }

    private static final Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> getMigrationFunction() {
    }

    private static final Function2<Preferences, Continuation<? super Boolean>, Object> getShouldRunMigration(Set<String> set) {
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Context context, String str, Set set, int i2, Object obj) {
    }

    @JvmOverloads
    @NotNull
    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(@NotNull Context context, @NotNull String str, @NotNull Set<String> set) {
    }
}
