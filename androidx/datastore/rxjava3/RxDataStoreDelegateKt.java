package androidx.datastore.rxjava3;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import com.sobot.network.http.model.SobotProgress;
import i.a.e1.c.q0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxDataStoreDelegate.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001av\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00040\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u000b2 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000f0\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"rxDataStore", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/rxjava3/RxDataStore;", ExifInterface.GPS_DIRECTION_TRUE, "", SobotProgress.FILE_NAME, "", "serializer", "Landroidx/datastore/core/Serializer;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "scheduler", "Lio/reactivex/rxjava3/core/Scheduler;", "datastore-rxjava3_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RxDataStoreDelegateKt {
    @NotNull
    public static final <T> ReadOnlyProperty<Context, RxDataStore<T>> rxDataStore(@NotNull String str, @NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function1<? super Context, ? extends List<? extends DataMigration<T>>> function1, @NotNull q0 q0Var) {
    }

    public static /* synthetic */ ReadOnlyProperty rxDataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, q0 q0Var, int i2, Object obj) {
    }
}
