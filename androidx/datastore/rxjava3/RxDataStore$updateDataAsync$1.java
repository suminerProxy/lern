package androidx.datastore.rxjava3;

import androidx.datastore.core.DataStore;
import androidx.exifinterface.media.ExifInterface;
import i.a.e1.c.r0;
import i.a.e1.g.o;
import k.b.v0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: RxDataStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.rxjava3.RxDataStore$updateDataAsync$1", f = "RxDataStore.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class RxDataStore$updateDataAsync$1<T> extends SuspendLambda implements Function2<v0, Continuation<? super T>, Object> {
    public final /* synthetic */ o<T, r0<T>> $transform;
    public int label;
    public final /* synthetic */ RxDataStore<T> this$0;

    /* compiled from: RxDataStore.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.rxjava3.RxDataStore$updateDataAsync$1$1", f = "RxDataStore.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.datastore.rxjava3.RxDataStore$updateDataAsync$1$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<T, Continuation<? super T>, Object> {
        public final /* synthetic */ o<T, r0<T>> $transform;
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(o<T, r0<T>> oVar, Continuation<? super AnonymousClass1> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        }

        @Nullable
        public final Object invoke(@NotNull T t, @Nullable Continuation<? super T> continuation) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxDataStore$updateDataAsync$1(RxDataStore<T> rxDataStore, o<T, r0<T>> oVar, Continuation<? super RxDataStore$updateDataAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = rxDataStore;
        this.$transform = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RxDataStore$updateDataAsync$1(this.this$0, this.$transform, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(v0 v0Var, Object obj) {
        return invoke(v0Var, (Continuation) ((Continuation) obj));
    }

    @Nullable
    public final Object invoke(@NotNull v0 v0Var, @Nullable Continuation<? super T> continuation) {
        return ((RxDataStore$updateDataAsync$1) create(v0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DataStore dataStore;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            dataStore = ((RxDataStore) this.this$0).delegateDs;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
            this.label = 1;
            obj = dataStore.updateData(anonymousClass1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
