package androidx.datastore.rxjava3;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import com.sobot.network.http.model.SobotProgress;
import i.a.e1.c.q0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0003BW\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\u0012 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0016\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0096\u0002R\u001a\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/datastore/rxjava3/RxDataStoreSingletonDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/rxjava3/RxDataStore;", SobotProgress.FILE_NAME, "", "serializer", "Landroidx/datastore/core/Serializer;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "(Ljava/lang/String;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lio/reactivex/rxjava3/core/Scheduler;)V", "INSTANCE", "lock", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "datastore-rxjava3_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RxDataStoreSingletonDelegate<T> implements ReadOnlyProperty<Context, RxDataStore<T>> {
    @GuardedBy("lock")
    @Nullable
    private volatile RxDataStore<T> INSTANCE;
    @Nullable
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    @NotNull
    private final String fileName;
    @NotNull
    private final Object lock;
    @NotNull
    private final Function1<Context, List<DataMigration<T>>> produceMigrations;
    @NotNull
    private final q0 scheduler;
    @NotNull
    private final Serializer<T> serializer;

    /* compiled from: RxDataStoreDelegate.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Landroidx/datastore/core/DataMigration;", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "Landroid/content/Context;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.datastore.rxjava3.RxDataStoreSingletonDelegate$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Context, List<? extends DataMigration<T>>> {
        public static final AnonymousClass1 INSTANCE = null;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Context context) {
        }

        @NotNull
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<DataMigration<T>> invoke2(@NotNull Context context) {
        }
    }

    public RxDataStoreSingletonDelegate(@NotNull String str, @NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function1<? super Context, ? extends List<? extends DataMigration<T>>> function1, @NotNull q0 q0Var) {
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Context context, KProperty kProperty) {
    }

    @NotNull
    /* renamed from: getValue  reason: avoid collision after fix types in other method */
    public RxDataStore<T> getValue2(@NotNull Context context, @NotNull KProperty<?> kProperty) {
    }

    public /* synthetic */ RxDataStoreSingletonDelegate(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, q0 q0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
