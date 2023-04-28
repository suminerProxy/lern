package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.exifinterface.media.ExifInterface;
import k.b.i4.e0;
import k.b.i4.i;
import k.b.i4.j;
import k.b.i4.k;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SingleProcessDataStore$data$1<T> extends SuspendLambda implements Function2<j<? super T>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<State<T>, Continuation<? super Boolean>, Object> {
        public final /* synthetic */ State<T> $currentDownStreamFlowState;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State<T> state, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentDownStreamFlowState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentDownStreamFlowState, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Nullable
        public final Object invoke(@NotNull State<T> state, @Nullable Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return invoke((State) ((State) obj), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                State<T> state = (State) this.L$0;
                State<T> state2 = this.$currentDownStreamFlowState;
                boolean z = false;
                if (!(state2 instanceof Data) && !(state2 instanceof Final) && state == state2) {
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$data$1> continuation) {
        super(2, continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, continuation);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return invoke((j) ((j) obj), continuation);
    }

    @Nullable
    public final Object invoke(@NotNull j<? super T> jVar, @Nullable Continuation<? super Unit> continuation) {
        return ((SingleProcessDataStore$data$1) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        e0 e0Var;
        e0 e0Var2;
        SimpleActor simpleActor;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = (j) this.L$0;
            e0Var = ((SingleProcessDataStore) this.this$0).downstreamFlow;
            State state = (State) e0Var.getValue();
            if (!(state instanceof Data)) {
                simpleActor = ((SingleProcessDataStore) this.this$0).actor;
                simpleActor.offer(new SingleProcessDataStore.Message.Read(state));
            }
            e0Var2 = ((SingleProcessDataStore) this.this$0).downstreamFlow;
            final i k0 = k.k0(e0Var2, new AnonymousClass1(state, null));
            i<T> iVar = new i<T>() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1
                @Override // k.b.i4.i
                @Nullable
                public Object collect(@NotNull j jVar2, @NotNull Continuation continuation) {
                    Object collect = i.this.collect(new j<State<T>>(jVar2) { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.2
                        public final /* synthetic */ j $this_unsafeFlow$inlined;

                        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                        @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                        /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public Object L$0;
                            public int label;
                            public /* synthetic */ Object result;
                            public final /* synthetic */ AnonymousClass2 this$0;

                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                            }
                        }

                        @Override // k.b.i4.j
                        @Nullable
                        public Object emit(Object obj2, @NotNull Continuation continuation2) {
                        }
                    }, continuation);
                    return collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (k.m0(jVar, iVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
