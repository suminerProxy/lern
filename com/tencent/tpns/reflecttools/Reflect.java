package com.tencent.tpns.reflecttools;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Reflect {
    private final Object object;
    private final Class<?> type;

    /* renamed from: com.tencent.tpns.reflecttools.Reflect$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13804a;
        public final /* synthetic */ Reflect b;

        public AnonymousClass1(Reflect reflect, boolean z) {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class a {
        private a() {
        }
    }

    private Reflect(Class<?> cls) {
    }

    private Reflect(Class<?> cls, Object obj) {
    }

    public static /* synthetic */ Class access$000(Reflect reflect) {
    }

    public static /* synthetic */ Object access$100(Reflect reflect) {
    }

    public static /* synthetic */ Reflect access$200(Class cls, Object obj) {
    }

    public static /* synthetic */ String access$300(String str) {
    }

    public static <T extends AccessibleObject> T accessible(T t) {
    }

    private Method exactMethod(String str, Class<?>[] clsArr) {
    }

    private Field field0(String str) {
    }

    public static Class<?> forName(String str) {
    }

    private static Class<?> forName(String str, ClassLoader classLoader) {
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
    }

    public static Reflect on(Class<?> cls) {
    }

    private static Reflect on(Class<?> cls, Object obj) {
    }

    public static Reflect on(Object obj) {
    }

    public static Reflect on(String str) {
    }

    public static Reflect on(String str, ClassLoader classLoader) {
    }

    private static Reflect on(Constructor<?> constructor, Object... objArr) {
    }

    private static Reflect on(Method method, Object obj, Object... objArr) {
    }

    private static String property(String str) {
    }

    private Method similarMethod(String str, Class<?>[] clsArr) {
    }

    private static Class<?>[] types(Object... objArr) {
    }

    private static Object unwrap(Object obj) {
    }

    public static Class<?> wrapper(Class<?> cls) {
    }

    public <P> P as(Class<P> cls) {
    }

    public Reflect call(String str) {
    }

    public Reflect call(String str, Object... objArr) {
    }

    public Reflect create() {
    }

    public Reflect create(Object... objArr) {
    }

    public boolean equals(Object obj) {
    }

    public Reflect field(String str) {
    }

    public Map<String, Reflect> fields() {
    }

    public <T> T get() {
    }

    public <T> T get(String str) {
    }

    public int hashCode() {
    }

    public Reflect set(String str, Object obj) {
    }

    public String toString() {
    }

    public Class<?> type() {
    }
}
