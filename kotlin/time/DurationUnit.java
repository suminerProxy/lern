package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* compiled from: DurationUnitJvm.kt */
@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lkotlin/time/DurationUnit;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class DurationUnit {
    private static final /* synthetic */ DurationUnit[] $VALUES = null;
    public static final DurationUnit DAYS = null;
    public static final DurationUnit HOURS = null;
    public static final DurationUnit MICROSECONDS = null;
    public static final DurationUnit MILLISECONDS = null;
    public static final DurationUnit MINUTES = null;
    public static final DurationUnit NANOSECONDS = null;
    public static final DurationUnit SECONDS = null;
    @NotNull
    private final TimeUnit timeUnit;

    private static final /* synthetic */ DurationUnit[] $values() {
    }

    private DurationUnit(String str, int i2, TimeUnit timeUnit) {
    }

    public static DurationUnit valueOf(String str) {
    }

    public static DurationUnit[] values() {
    }

    @NotNull
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
    }
}
