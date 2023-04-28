package i.a.e1.b;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: SchedulerSupport.java */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public @interface h {

    /* renamed from: k  reason: collision with root package name */
    public static final String f26723k = "none";

    /* renamed from: l  reason: collision with root package name */
    public static final String f26724l = "custom";

    /* renamed from: m  reason: collision with root package name */
    public static final String f26725m = "io.reactivex:computation";

    /* renamed from: n  reason: collision with root package name */
    public static final String f26726n = "io.reactivex:io";

    /* renamed from: o  reason: collision with root package name */
    public static final String f26727o = "io.reactivex:new-thread";

    /* renamed from: p  reason: collision with root package name */
    public static final String f26728p = "io.reactivex:trampoline";
    public static final String q = "io.reactivex:single";

    String value();
}
