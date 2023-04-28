package androidx.datastore.preferences.rxjava3;

import androidx.datastore.core.DataMigration;
import androidx.datastore.rxjava3.RxDataMigration;
import androidx.exifinterface.media.ExifInterface;
import i.a.e1.c.j;
import i.a.e1.c.r0;
import k.b.m4.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RxPreferenceDataStoreBuilder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/datastore/preferences/rxjava3/DataMigrationFromRxDataMigration;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/DataMigration;", "migration", "Landroidx/datastore/rxjava3/RxDataMigration;", "(Landroidx/datastore/rxjava3/RxDataMigration;)V", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrate", "currentData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "", "datastore-preferences-rxjava3_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class DataMigrationFromRxDataMigration<T> implements DataMigration<T> {
    @NotNull
    private final RxDataMigration<T> migration;

    public DataMigrationFromRxDataMigration(@NotNull RxDataMigration<T> migration) {
        Intrinsics.checkNotNullParameter(migration, "migration");
        this.migration = migration;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object cleanUp(@NotNull Continuation<? super Unit> continuation) {
        j cleanUp = this.migration.cleanUp();
        Intrinsics.checkNotNullExpressionValue(cleanUp, "migration.cleanUp()");
        Object b = i.b(cleanUp, continuation);
        return b == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? b : Unit.INSTANCE;
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object migrate(T t, @NotNull Continuation<? super T> continuation) {
        r0<T> migrate = this.migration.migrate(t);
        Intrinsics.checkNotNullExpressionValue(migrate, "migration.migrate(currentData)");
        return i.d(migrate, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // androidx.datastore.core.DataMigration
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object shouldMigrate(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1 r0 = (androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1 r0 = new androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.datastore.rxjava3.RxDataMigration<T> r6 = r4.migration
            i.a.e1.c.r0 r5 = r6.shouldMigrate(r5)
            java.lang.String r6 = "migration.shouldMigrate(currentData)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r0.label = r3
            java.lang.Object r6 = k.b.m4.i.d(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r5 = "migration.shouldMigrate(currentData).await()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration.shouldMigrate(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
