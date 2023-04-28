package kotlin.math;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mobile.auth.BuildConfig;
import com.tencent.android.tpush.common.MessageKey;
import com.tencent.cloud.huiyansdkface.facelight.api.WbCloudFaceContant;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* compiled from: MathJVM.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b7\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010(\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0018\u0010*\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0001H\u0007\u001a\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0007\u001a\u0011\u0010,\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010,\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0019\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0087\b\u001a\u0019\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0087\b\u001a\u0019\u00101\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0087\b\u001a\u0019\u00101\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0087\b\u001a\u0019\u00101\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0087\b\u001a\u0019\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0087\b\u001a\u0011\u00102\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00102\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u00108\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0015\u00109\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00109\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0087\b\u001a\r\u0010;\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010;\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010<\u001a\u00020\u0001*\u00020\u00012\u0006\u0010=\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010<\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0087\b\u001a\r\u0010>\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010>\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\f\u0010@\u001a\u00020\t*\u00020\u0001H\u0007\u001a\f\u0010@\u001a\u00020\t*\u00020\u0006H\u0007\u001a\f\u0010A\u001a\u00020\f*\u00020\u0001H\u0007\u001a\f\u0010A\u001a\u00020\f*\u00020\u0006H\u0007\u001a\u0015\u0010B\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u0000\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\b\"\u001f\u0010\u0000\u001a\u00020\t*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u001f\u0010\u0000\u001a\u00020\f*\u00020\f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\r\u001a\u0004\b\u0004\u0010\u000e\"\u001f\u0010\u000f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\u001f\u0010\u000f\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\"\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006C"}, d2 = {"absoluteValue", "", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", WbCloudFaceContant.SIGN, "getSign$annotations", "getSign", "(J)I", "ulp", "getUlp$annotations", "getUlp", "abs", "x", "n", "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", BuildConfig.FLAVOR_type, TtmlNode.RUBY_BASE, "log10", "log2", "max", "a", "b", MessageKey.MSG_ACCEPT_TIME_MIN, "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", "to", "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double IEEErem(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double abs(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double acos(double d2) {
    }

    @SinceKotlin(version = "1.2")
    public static final double acosh(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double asin(double d2) {
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan2(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ceil(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cos(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cosh(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double exp(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double expm1(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double floor(double d2) {
    }

    private static final double getAbsoluteValue(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j2) {
    }

    private static final double getSign(double d2) {
    }

    public static final int getSign(int i2) {
    }

    public static final int getSign(long j2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f2) {
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i2) {
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j2) {
    }

    private static final double getUlp(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double hypot(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln1p(double d2) {
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double log10(double d2) {
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double max(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double min(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextDown(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextTowards(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextUp(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double round(double d2) {
    }

    @SinceKotlin(version = "1.2")
    public static final int roundToInt(double d2) {
    }

    @SinceKotlin(version = "1.2")
    public static final long roundToLong(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sign(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sin(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sinh(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sqrt(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tan(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tanh(double d2) {
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d2, double d3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float IEEErem(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float abs(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acos(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asin(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan2(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ceil(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cos(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cosh(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float exp(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float expm1(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float floor(float f2) {
    }

    private static final float getAbsoluteValue(float f2) {
    }

    private static final float getSign(float f2) {
    }

    private static final float getUlp(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float hypot(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln1p(float f2) {
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float log10(float f2) {
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float max(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float min(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextDown(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextTowards(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextUp(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d2, int i2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float round(float f2) {
    }

    @SinceKotlin(version = "1.2")
    public static final long roundToLong(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sign(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sin(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sinh(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sqrt(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tan(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tanh(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d2, int i2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int abs(int i2) {
    }

    private static final int getAbsoluteValue(int i2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int max(int i2, int i3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int min(int i2, int i3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f2, float f3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long abs(long j2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atanh(float f2) {
    }

    private static final long getAbsoluteValue(long j2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long max(long j2, long j3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long min(long j2, long j3) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f2, int i2) {
    }

    @SinceKotlin(version = "1.2")
    public static final int roundToInt(float f2) {
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f2, int i2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acosh(float f2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asinh(float f2) {
    }
}
