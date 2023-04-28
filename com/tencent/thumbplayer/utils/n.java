package com.tencent.thumbplayer.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static ArrayList<a> f13603a;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f13604a;
        public Map<Integer, Method> b;

        private a() {
        }

        public /* synthetic */ a(AnonymousClass1 anonymousClass1) {
        }
    }

    @Target({ElementType.METHOD, ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public @interface b {
        boolean a() default false;

        boolean b() default false;

        boolean c() default false;
    }

    public static Method a(Class<?> cls, String str, Object[] objArr) {
    }

    private static boolean a(Class<?> cls) {
    }

    public static synchronized boolean a(Class<?> cls, int i2) {
    }

    private static boolean a(Class<?> cls, Object obj) {
    }

    private static boolean a(Method method, Object[] objArr) {
    }

    public static int b(Class<?> cls, String str, Object[] objArr) {
    }

    public static String b(Class<?> cls, int i2) {
    }

    private static Map<Integer, Method> b(Class<?> cls) {
    }

    public static boolean c(Class<?> cls, int i2) {
    }

    public static boolean d(Class<?> cls, int i2) {
    }

    public static boolean e(Class<?> cls, int i2) {
    }

    public static Method f(Class<?> cls, int i2) {
    }
}
