package m.b.a.a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NonNls;

/* compiled from: Flow.java */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public @interface a {
    @NonNls
    public static final String r = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    @NonNls
    public static final String s = "this";
    @NonNls
    public static final String t = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";
    @NonNls
    public static final String u = "The return value of this method";
    @NonNls
    public static final String v = "this";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}
