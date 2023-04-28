package androidx.datastore.rxjava3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import com.sobot.network.http.model.SobotProgress;
import i.a.e1.c.q0;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxDataStoreBuilder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B#\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\rJ\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cJ\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/datastore/rxjava3/RxDataStoreBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "", "produceFile", "Ljava/util/concurrent/Callable;", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "(Ljava/util/concurrent/Callable;Landroidx/datastore/core/Serializer;)V", "context", "Landroid/content/Context;", SobotProgress.FILE_NAME, "", "(Landroid/content/Context;Ljava/lang/String;Landroidx/datastore/core/Serializer;)V", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "dataMigrations", "", "Landroidx/datastore/core/DataMigration;", "ioScheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "name", "addDataMigration", "dataMigration", "addRxDataMigration", "rxDataMigration", "Landroidx/datastore/rxjava3/RxDataMigration;", "build", "Landroidx/datastore/rxjava3/RxDataStore;", "setCorruptionHandler", "setIoScheduler", "datastore-rxjava3_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"TopLevelBuilder"})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RxDataStoreBuilder<T> {
    @Nullable
    private Context context;
    @Nullable
    private ReplaceFileCorruptionHandler<T> corruptionHandler;
    @NotNull
    private final List<DataMigration<T>> dataMigrations;
    @NotNull
    private q0 ioScheduler;
    @Nullable
    private String name;
    @Nullable
    private Callable<File> produceFile;
    @Nullable
    private Serializer<T> serializer;

    public RxDataStoreBuilder(@NotNull Callable<File> callable, @NotNull Serializer<T> serializer) {
    }

    public static final /* synthetic */ Context access$getContext$p(RxDataStoreBuilder rxDataStoreBuilder) {
    }

    public static final /* synthetic */ String access$getName$p(RxDataStoreBuilder rxDataStoreBuilder) {
    }

    public static final /* synthetic */ Callable access$getProduceFile$p(RxDataStoreBuilder rxDataStoreBuilder) {
    }

    @NotNull
    public final RxDataStoreBuilder<T> addDataMigration(@NotNull DataMigration<T> dataMigration) {
    }

    @NotNull
    public final RxDataStoreBuilder<T> addRxDataMigration(@NotNull RxDataMigration<T> rxDataMigration) {
    }

    @NotNull
    public final RxDataStore<T> build() {
    }

    @NotNull
    public final RxDataStoreBuilder<T> setCorruptionHandler(@NotNull ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
    }

    @NotNull
    public final RxDataStoreBuilder<T> setIoScheduler(@NotNull q0 q0Var) {
    }

    public RxDataStoreBuilder(@NotNull Context context, @NotNull String str, @NotNull Serializer<T> serializer) {
    }
}
