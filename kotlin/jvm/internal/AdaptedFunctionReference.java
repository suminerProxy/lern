package kotlin.jvm.internal;

import com.pnikosis.materialishprogress.BuildConfig;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;

@SinceKotlin(version = BuildConfig.VERSION_NAME)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class AdaptedFunctionReference implements FunctionBase, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int i2, Class cls, String str, String str2, int i3) {
    }

    public boolean equals(Object obj) {
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
    }

    public KDeclarationContainer getOwner() {
    }

    public int hashCode() {
    }

    public String toString() {
    }

    public AdaptedFunctionReference(int i2, Object obj, Class cls, String str, String str2, int i3) {
    }
}
