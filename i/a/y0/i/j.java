package i.a.y0.i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* compiled from: SubscriptionHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j implements Subscription {
    private static final /* synthetic */ j[] $VALUES = null;
    public static final j CANCELLED = null;

    private j(String str, int i2) {
    }

    public static boolean cancel(AtomicReference<Subscription> atomicReference) {
    }

    public static void deferredRequest(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, long j2) {
    }

    public static boolean deferredSetOnce(AtomicReference<Subscription> atomicReference, AtomicLong atomicLong, Subscription subscription) {
    }

    public static boolean replace(AtomicReference<Subscription> atomicReference, Subscription subscription) {
    }

    public static void reportMoreProduced(long j2) {
    }

    public static void reportSubscriptionSet() {
    }

    public static boolean set(AtomicReference<Subscription> atomicReference, Subscription subscription) {
    }

    public static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription) {
    }

    public static boolean validate(Subscription subscription, Subscription subscription2) {
    }

    public static j valueOf(String str) {
    }

    public static j[] values() {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    public static boolean validate(long j2) {
    }

    public static boolean setOnce(AtomicReference<Subscription> atomicReference, Subscription subscription, long j2) {
    }
}
