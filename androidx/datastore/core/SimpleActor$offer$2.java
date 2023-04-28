package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import k.b.v0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SimpleActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {122, 122}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class SimpleActor$offer$2 extends SuspendLambda implements Function2<v0, Continuation<? super Unit>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ SimpleActor<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<T> simpleActor, Continuation<? super SimpleActor$offer$2> continuation) {
        super(2, continuation);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SimpleActor$offer$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull v0 v0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((SimpleActor$offer$2) create(v0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006c -> B:24:0x006e). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L6e
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            java.lang.Object r1 = r7.L$0
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlin.ResultKt.throwOnFailure(r8)
            r4 = r1
            r1 = r0
            r0 = r7
            goto L60
        L26:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.datastore.core.SimpleActor<T> r8 = r7.this$0
            java.util.concurrent.atomic.AtomicInteger r8 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r8)
            int r8 = r8.get()
            if (r8 <= 0) goto L37
            r8 = r3
            goto L38
        L37:
            r8 = 0
        L38:
            if (r8 == 0) goto L7d
            r8 = r7
        L3b:
            androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
            k.b.v0 r1 = androidx.datastore.core.SimpleActor.access$getScope$p(r1)
            k.b.w0.j(r1)
            androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
            kotlin.jvm.functions.Function2 r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r1)
            androidx.datastore.core.SimpleActor<T> r4 = r8.this$0
            k.b.g4.n r4 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r4)
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r4 = r4.Q(r8)
            if (r4 != r0) goto L5b
            return r0
        L5b:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r6
        L60:
            r5 = 0
            r0.L$0 = r5
            r0.label = r2
            java.lang.Object r8 = r4.invoke(r8, r0)
            if (r8 != r1) goto L6c
            return r1
        L6c:
            r8 = r0
            r0 = r1
        L6e:
            androidx.datastore.core.SimpleActor<T> r1 = r8.this$0
            java.util.concurrent.atomic.AtomicInteger r1 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r1)
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L3b
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L7d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
