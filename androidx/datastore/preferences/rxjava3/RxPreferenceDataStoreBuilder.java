package androidx.datastore.preferences.rxjava3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.rxjava3.RxDataMigration;
import androidx.datastore.rxjava3.RxDataStore;
import i.a.e1.c.q0;
import i.a.e1.n.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import k.b.d0;
import k.b.m4.u;
import k.b.m4.x;
import k.b.t2;
import k.b.v0;
import k.b.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxPreferenceDataStoreBuilder.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0010J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0019J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/datastore/preferences/rxjava3/RxPreferenceDataStoreBuilder;", "", "produceFile", "Ljava/util/concurrent/Callable;", "Ljava/io/File;", "(Ljava/util/concurrent/Callable;)V", "context", "Landroid/content/Context;", "name", "", "(Landroid/content/Context;Ljava/lang/String;)V", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Landroidx/datastore/preferences/core/Preferences;", "dataMigrations", "", "Landroidx/datastore/core/DataMigration;", "ioScheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "addDataMigration", "dataMigration", "addRxDataMigration", "rxDataMigration", "Landroidx/datastore/rxjava3/RxDataMigration;", "build", "Landroidx/datastore/rxjava3/RxDataStore;", "setCorruptionHandler", "setIoScheduler", "datastore-preferences-rxjava3_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"TopLevelBuilder"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RxPreferenceDataStoreBuilder {
    @Nullable
    private Context context;
    @Nullable
    private ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    @NotNull
    private final List<DataMigration<Preferences>> dataMigrations;
    @NotNull
    private q0 ioScheduler;
    @Nullable
    private String name;
    @Nullable
    private Callable<File> produceFile;

    public RxPreferenceDataStoreBuilder(@NotNull Callable<File> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        q0 e2 = b.e();
        Intrinsics.checkNotNullExpressionValue(e2, "io()");
        this.ioScheduler = e2;
        this.dataMigrations = new ArrayList();
        this.produceFile = produceFile;
    }

    @NotNull
    public final RxPreferenceDataStoreBuilder addDataMigration(@NotNull DataMigration<Preferences> dataMigration) {
        Intrinsics.checkNotNullParameter(dataMigration, "dataMigration");
        this.dataMigrations.add(dataMigration);
        return this;
    }

    @NotNull
    public final RxPreferenceDataStoreBuilder addRxDataMigration(@NotNull RxDataMigration<Preferences> rxDataMigration) {
        Intrinsics.checkNotNullParameter(rxDataMigration, "rxDataMigration");
        this.dataMigrations.add(new DataMigrationFromRxDataMigration(rxDataMigration));
        return this;
    }

    @NotNull
    public final RxDataStore<Preferences> build() {
        d0 c;
        DataStore<Preferences> create;
        x a2 = u.a(this.ioScheduler);
        c = t2.c(null, 1, null);
        v0 a3 = w0.a(a2.plus(c));
        final Callable<File> callable = this.produceFile;
        final Context context = this.context;
        final String str = this.name;
        if (callable != null) {
            create = PreferenceDataStoreFactory.INSTANCE.create(this.corruptionHandler, this.dataMigrations, a3, new Function0<File>() { // from class: androidx.datastore.preferences.rxjava3.RxPreferenceDataStoreBuilder$build$delegate$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final File invoke() {
                    File call = callable.call();
                    Intrinsics.checkNotNullExpressionValue(call, "produceFile.call()");
                    return call;
                }
            });
        } else if (context != null && str != null) {
            create = PreferenceDataStoreFactory.INSTANCE.create(this.corruptionHandler, this.dataMigrations, a3, new Function0<File>() { // from class: androidx.datastore.preferences.rxjava3.RxPreferenceDataStoreBuilder$build$delegate$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final File invoke() {
                    return PreferenceDataStoreFile.preferencesDataStoreFile(context, str);
                }
            });
        } else {
            throw new IllegalStateException("Either produceFile or context and name must be set. This should never happen.".toString());
        }
        return RxDataStore.Companion.create(create, a3);
    }

    @NotNull
    public final RxPreferenceDataStoreBuilder setCorruptionHandler(@NotNull ReplaceFileCorruptionHandler<Preferences> corruptionHandler) {
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        this.corruptionHandler = corruptionHandler;
        return this;
    }

    @NotNull
    public final RxPreferenceDataStoreBuilder setIoScheduler(@NotNull q0 ioScheduler) {
        Intrinsics.checkNotNullParameter(ioScheduler, "ioScheduler");
        this.ioScheduler = ioScheduler;
        return this;
    }

    public RxPreferenceDataStoreBuilder(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        q0 e2 = b.e();
        Intrinsics.checkNotNullExpressionValue(e2, "io()");
        this.ioScheduler = e2;
        this.dataMigrations = new ArrayList();
        this.context = context;
        this.name = name;
    }
}
