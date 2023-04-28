package i.a.e1.h.j;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* compiled from: SubscriptionHelper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j implements Subscription {
    private static final /* synthetic */ j[] $VALUES = null;
    public static final j CANCELLED = null;

    private j(String $enum$name, int $enum$ordinal) {
    }

    public static boolean cancel(AtomicReference<Subscription> field) {
    }

    public static void deferredRequest(AtomicReference<Subscription> field, AtomicLong requested, long n2) {
    }

    public static boolean deferredSetOnce(AtomicReference<Subscription> field, AtomicLong requested, Subscription s) {
    }

    public static boolean replace(AtomicReference<Subscription> field, Subscription s) {
    }

    public static void reportMoreProduced(long n2) {
    }

    public static void reportSubscriptionSet() {
    }

    public static boolean set(AtomicReference<Subscription> field, Subscription s) {
    }

    public static boolean setOnce(AtomicReference<Subscription> field, Subscription s) {
    }

    public static boolean validate(Subscription current, Subscription next) {
    }

    public static j valueOf(String name) {
    }

    public static j[] values() {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n2) {
    }

    public static boolean validate(long n2) {
    }

    public static boolean setOnce(AtomicReference<Subscription> field, Subscription s, long request) {
    }
}
