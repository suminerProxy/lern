package kotlin.jvm.internal;

import com.pnikosis.materialishprogress.BuildConfig;
import java.util.List;
import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class ReflectionFactory {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public KClass createKotlinClass(Class cls) {
    }

    public KFunction function(FunctionReference functionReference) {
    }

    public KClass getOrCreateKotlinClass(Class cls) {
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
    }

    @SinceKotlin(version = "1.6")
    public KType mutableCollectionType(KType kType) {
    }

    public KMutableProperty0 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
    }

    public KMutableProperty1 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
    }

    public KMutableProperty2 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
    }

    @SinceKotlin(version = "1.6")
    public KType nothingType(KType kType) {
    }

    @SinceKotlin(version = "1.6")
    public KType platformType(KType kType, KType kType2) {
    }

    public KProperty0 property0(PropertyReference0 propertyReference0) {
    }

    public KProperty1 property1(PropertyReference1 propertyReference1) {
    }

    public KProperty2 property2(PropertyReference2 propertyReference2) {
    }

    @SinceKotlin(version = "1.1")
    public String renderLambdaToString(Lambda lambda) {
    }

    @SinceKotlin(version = BuildConfig.VERSION_NAME)
    public void setUpperBounds(KTypeParameter kTypeParameter, List<KType> list) {
    }

    @SinceKotlin(version = BuildConfig.VERSION_NAME)
    public KType typeOf(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
    }

    @SinceKotlin(version = BuildConfig.VERSION_NAME)
    public KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z) {
    }

    public KClass createKotlinClass(Class cls, String str) {
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
    }

    @SinceKotlin(version = "1.3")
    public String renderLambdaToString(FunctionBase functionBase) {
    }
}
