package androidx.lifecycle;

import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ClassesInfoCache {
    private static final int CALL_TYPE_NO_ARG = 0;
    private static final int CALL_TYPE_PROVIDER = 1;
    private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
    public static ClassesInfoCache sInstance = new ClassesInfoCache();
    private final Map<Class, CallbackInfo> mCallbackMap = new HashMap();
    private final Map<Class, Boolean> mHasLifecycleMethods = new HashMap();

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class CallbackInfo {
        public final Map<Lifecycle.Event, List<MethodReference>> mEventToHandlers;
        public final Map<MethodReference, Lifecycle.Event> mHandlerToEvent;

        public CallbackInfo(Map<MethodReference, Lifecycle.Event> map) {
        }

        private static void invokeMethodsForEvent(List<MethodReference> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
        }

        public void invokeCallbacks(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class MethodReference {
        public final int mCallType;
        public final Method mMethod;

        public MethodReference(int i2, Method method) {
        }

        public boolean equals(Object obj) {
        }

        public int hashCode() {
        }

        public void invokeCallback(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
        }
    }

    private CallbackInfo createInfo(Class cls, @Nullable Method[] methodArr) {
        int i2;
        CallbackInfo info;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (info = getInfo(superclass)) != null) {
            hashMap.putAll(info.mHandlerToEvent);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<MethodReference, Lifecycle.Event> entry : getInfo(cls2).mHandlerToEvent.entrySet()) {
                verifyAndPutHandler(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = getDeclaredMethods(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i2 = 1;
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        if (value != Lifecycle.Event.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    verifyAndPutHandler(hashMap, new MethodReference(i2, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        CallbackInfo callbackInfo = new CallbackInfo(hashMap);
        this.mCallbackMap.put(cls, callbackInfo);
        this.mHasLifecycleMethods.put(cls, Boolean.valueOf(z));
        return callbackInfo;
    }

    private Method[] getDeclaredMethods(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void verifyAndPutHandler(Map<MethodReference, Lifecycle.Event> map, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = map.get(methodReference);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(methodReference, event);
                return;
            }
            return;
        }
        Method method = methodReference.mMethod;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    public CallbackInfo getInfo(Class cls) {
        CallbackInfo callbackInfo = this.mCallbackMap.get(cls);
        return callbackInfo != null ? callbackInfo : createInfo(cls, null);
    }

    public boolean hasLifecycleMethods(Class cls) {
        Boolean bool = this.mHasLifecycleMethods.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] declaredMethods = getDeclaredMethods(cls);
        for (Method method : declaredMethods) {
            if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                createInfo(cls, declaredMethods);
                return true;
            }
        }
        this.mHasLifecycleMethods.put(cls, Boolean.FALSE);
        return false;
    }
}
