package kotlin.jvm.internal;

import com.pnikosis.materialishprogress.BuildConfig;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty2;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    public PropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
    }

    @Override // kotlin.reflect.KProperty2
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
    }

    @Override // kotlin.reflect.KProperty
    public /* bridge */ /* synthetic */ KProperty.Getter getGetter() {
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
    }

    @SinceKotlin(version = BuildConfig.VERSION_NAME)
    public PropertyReference2(Class cls, String str, String str2, int i2) {
    }

    @Override // kotlin.reflect.KProperty
    public KProperty2.Getter getGetter() {
    }
}
