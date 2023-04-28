package kotlin;

import kotlin.internal.InlineOnly;

/* compiled from: FloorDivMod.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "", "", "mod", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(byte b, byte b2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte mod(byte b, byte b2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(byte b, short s) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short mod(byte b, short s) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(byte b, int i2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int mod(byte b, int i2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(byte b, long j2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long mod(byte b, long j2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(short s, byte b) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte mod(short s, byte b) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(short s, short s2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short mod(short s, short s2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(short s, int i2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int mod(short s, int i2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(short s, long j2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long mod(short s, long j2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(int i2, byte b) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte mod(int i2, byte b) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(int i2, short s) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short mod(int i2, short s) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int floorDiv(int i2, int i3) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int mod(int i2, int i3) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(int i2, long j2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long mod(int i2, long j2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(long j2, byte b) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final byte mod(long j2, byte b) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(long j2, short s) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final short mod(long j2, short s) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(long j2, int i2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int mod(long j2, int i2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long floorDiv(long j2, long j3) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long mod(long j2, long j3) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final float mod(float f2, float f3) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double mod(float f2, double d2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double mod(double d2, float f2) {
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final double mod(double d2, double d3) {
    }
}
