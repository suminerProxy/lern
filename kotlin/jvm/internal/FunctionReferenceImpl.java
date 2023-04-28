package kotlin.jvm.internal;

import com.pnikosis.materialishprogress.BuildConfig;
import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i2, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i2, CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @SinceKotlin(version = BuildConfig.VERSION_NAME)
    public FunctionReferenceImpl(int i2, Class cls, String str, String str2, int i3) {
        super(i2, CallableReference.NO_RECEIVER, cls, str, str2, i3);
    }

    @SinceKotlin(version = BuildConfig.VERSION_NAME)
    public FunctionReferenceImpl(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(i2, obj, cls, str, str2, i3);
    }
}
