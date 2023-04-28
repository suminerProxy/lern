package androidx.datastore.rxjava3;

import androidx.annotation.RestrictTo;
import androidx.datastore.core.DataStore;
import androidx.exifinterface.media.ExifInterface;
import i.a.e1.c.j;
import i.a.e1.c.r0;
import i.a.e1.c.s;
import i.a.e1.d.f;
import k.b.c2;
import k.b.k;
import k.b.m4.n;
import k.b.m4.o;
import k.b.n2;
import k.b.r2;
import k.b.r3;
import k.b.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RxDataStore.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0015*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0015B\u001d\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0014H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/datastore/rxjava3/RxDataStore;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lio/reactivex/rxjava3/disposables/Disposable;", "delegateDs", "Landroidx/datastore/core/DataStore;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/CoroutineScope;)V", "data", "Lio/reactivex/rxjava3/core/Flowable;", "dispose", "", "isDisposed", "", "shutdownComplete", "Lio/reactivex/rxjava3/core/Completable;", "updateDataAsync", "Lio/reactivex/rxjava3/core/Single;", "transform", "Lio/reactivex/rxjava3/functions/Function;", "Companion", "datastore-rxjava3_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RxDataStore<T> implements f {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final DataStore<T> delegateDs;
    @NotNull
    private final v0 scope;

    /* compiled from: RxDataStore.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Landroidx/datastore/rxjava3/RxDataStore$Companion;", "", "()V", "create", "Landroidx/datastore/rxjava3/RxDataStore;", ExifInterface.GPS_DIRECTION_TRUE, "delegateDs", "Landroidx/datastore/core/DataStore;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "datastore-rxjava3_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> RxDataStore<T> create(@NotNull DataStore<T> delegateDs, @NotNull v0 scope) {
            Intrinsics.checkNotNullParameter(delegateDs, "delegateDs");
            Intrinsics.checkNotNullParameter(scope, "scope");
            return new RxDataStore<>(delegateDs, scope, null);
        }
    }

    private RxDataStore(DataStore<T> dataStore, v0 v0Var) {
        this.delegateDs = dataStore;
        this.scope = v0Var;
    }

    public /* synthetic */ RxDataStore(DataStore dataStore, v0 v0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataStore, v0Var);
    }

    @c2
    @NotNull
    public final s<T> data() {
        return o.c(this.delegateDs.getData(), this.scope.S());
    }

    @Override // i.a.e1.d.f
    public void dispose() {
        n2.a.b(r2.B(this.scope.S()), null, 1, null);
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
        return r2.B(this.scope.S()).isActive();
    }

    @NotNull
    public final j shutdownComplete() {
        return n.b(this.scope.S().minusKey(n2.v0), new RxDataStore$shutdownComplete$1(this, null));
    }

    @c2
    @NotNull
    public final r0<T> updateDataAsync(@NotNull i.a.e1.g.o<T, r0<T>> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return o.i(k.b(this.scope, r3.c(null, 1, null), null, new RxDataStore$updateDataAsync$1(this, transform, null), 2, null), this.scope.S().minusKey(n2.v0));
    }
}
