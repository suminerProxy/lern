package k.b.l4;

import androidx.exifinterface.media.ExifInterface;
import com.sobot.network.http.model.SobotProgress;
import com.umeng.analytics.pro.am;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.b.g4.d0;
import k.b.j4.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\u0012\u0004\u0012\u00028\u00000\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/reactive/SubscriptionChannel;", ExifInterface.GPS_DIRECTION_TRUE, "", SobotProgress.REQUEST, "<init>", "(I)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "closed", "", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "onComplete", "()V", "", "e", "onError", "(Ljava/lang/Throwable;)V", am.aI, "onNext", "(Ljava/lang/Object;)V", "onReceiveDequeued", "onReceiveEnqueued", "Lorg/reactivestreams/Subscription;", am.aB, "onSubscribe", "(Lorg/reactivestreams/Subscription;)V", "I", "kotlinx-coroutines-reactive", "Lkotlinx/coroutines/channels/LinkedListChannel;", "Lorg/reactivestreams/Subscriber;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p<T> extends d0<T> implements Subscriber<T> {

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29504f = null;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29505g = null;
    @NotNull
    private volatile /* synthetic */ int _requested;
    @NotNull
    private volatile /* synthetic */ Object _subscription;

    /* renamed from: e  reason: collision with root package name */
    private final int f29506e;

    public p(int i2) {
    }

    @Override // k.b.g4.c
    public void F(@NotNull y yVar) {
    }

    @Override // k.b.g4.a
    public void k0() {
    }

    @Override // k.b.g4.a
    public void l0() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@NotNull Throwable th) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
    }

    @Override // org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(@NotNull Subscription subscription) {
    }
}
