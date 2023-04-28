package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PreferencesKeys.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0005\u001a\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\b\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u000b\u001a\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u000e\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0011\u001a\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0013\u001a!\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0016¨\u0006\u0017"}, d2 = {"booleanPreferencesKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "name", "", "booleanKey", "doublePreferencesKey", "", "doubleKey", "floatPreferencesKey", "", "floatKey", "intPreferencesKey", "", "intKey", "longPreferencesKey", "", "longKey", "stringPreferencesKey", "stringKey", "stringSetPreferencesKey", "", "stringSetKey", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName(name = "PreferencesKeys")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class PreferencesKeys {
    @JvmName(name = "booleanKey")
    @NotNull
    public static final Preferences.Key<Boolean> booleanKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @JvmName(name = "doubleKey")
    @NotNull
    public static final Preferences.Key<Double> doubleKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @JvmName(name = "floatKey")
    @NotNull
    public static final Preferences.Key<Float> floatKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @JvmName(name = "intKey")
    @NotNull
    public static final Preferences.Key<Integer> intKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @JvmName(name = "longKey")
    @NotNull
    public static final Preferences.Key<Long> longKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @JvmName(name = "stringKey")
    @NotNull
    public static final Preferences.Key<String> stringKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }

    @JvmName(name = "stringSetKey")
    @NotNull
    public static final Preferences.Key<Set<String>> stringSetKey(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Preferences.Key<>(name);
    }
}
