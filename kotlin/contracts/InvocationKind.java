package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* compiled from: ContractBuilder.kt */
@SinceKotlin(version = "1.3")
@ContractsDsl
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalContracts
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class InvocationKind {
    private static final /* synthetic */ InvocationKind[] $VALUES = null;
    @ContractsDsl
    public static final InvocationKind AT_LEAST_ONCE = null;
    @ContractsDsl
    public static final InvocationKind AT_MOST_ONCE = null;
    @ContractsDsl
    public static final InvocationKind EXACTLY_ONCE = null;
    @ContractsDsl
    public static final InvocationKind UNKNOWN = null;

    private static final /* synthetic */ InvocationKind[] $values() {
    }

    private InvocationKind(String str, int i2) {
    }

    public static InvocationKind valueOf(String str) {
    }

    public static InvocationKind[] values() {
    }
}
