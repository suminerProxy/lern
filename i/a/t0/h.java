package i.a.t0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: SchedulerSupport.java */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public @interface h {

    /* renamed from: d  reason: collision with root package name */
    public static final String f28130d = "none";

    /* renamed from: e  reason: collision with root package name */
    public static final String f28131e = "custom";

    /* renamed from: f  reason: collision with root package name */
    public static final String f28132f = "io.reactivex:computation";

    /* renamed from: g  reason: collision with root package name */
    public static final String f28133g = "io.reactivex:io";

    /* renamed from: h  reason: collision with root package name */
    public static final String f28134h = "io.reactivex:new-thread";

    /* renamed from: i  reason: collision with root package name */
    public static final String f28135i = "io.reactivex:trampoline";

    /* renamed from: j  reason: collision with root package name */
    public static final String f28136j = "io.reactivex:single";

    String value();
}
