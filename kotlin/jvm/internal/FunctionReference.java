package kotlin.jvm.internal;

import com.pnikosis.materialishprogress.BuildConfig;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    private final int arity;
    @SinceKotlin(version = BuildConfig.VERSION_NAME)
    private final int flags;

    public FunctionReference(int i2) {
        this(i2, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KCallable computeReflected() {
        return Reflection.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return Intrinsics.areEqual(getOwner(), functionReference.getOwner()) && getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver());
        } else if (obj instanceof KFunction) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + Reflection.REFLECTION_NOT_AVAILABLE;
    }

    @SinceKotlin(version = "1.1")
    public FunctionReference(int i2, Object obj) {
        this(i2, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    @SinceKotlin(version = BuildConfig.VERSION_NAME)
    public FunctionReference(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.arity = i2;
        this.flags = i3 >> 1;
    }
}
