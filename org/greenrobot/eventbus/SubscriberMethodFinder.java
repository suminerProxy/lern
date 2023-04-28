package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SubscriberMethodFinder {
    private static final int BRIDGE = 64;
    private static final FindState[] FIND_STATE_POOL = null;
    private static final Map<Class<?>, List<SubscriberMethod>> METHOD_CACHE = null;
    private static final int MODIFIERS_IGNORE = 5192;
    private static final int POOL_SIZE = 4;
    private static final int SYNTHETIC = 4096;
    private final boolean ignoreGeneratedIndex;
    private final boolean strictMethodVerification;
    private List<SubscriberInfoIndex> subscriberInfoIndexes;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class FindState {
        public final Map<Class, Object> anyMethodByEventType;
        public Class<?> clazz;
        public final StringBuilder methodKeyBuilder;
        public boolean skipSuperClasses;
        public Class<?> subscriberClass;
        public final Map<String, Class> subscriberClassByMethodKey;
        public SubscriberInfo subscriberInfo;
        public final List<SubscriberMethod> subscriberMethods;

        private boolean checkAddWithMethodSignature(Method method, Class<?> cls) {
        }

        public boolean checkAdd(Method method, Class<?> cls) {
        }

        public void initForSubscriber(Class<?> cls) {
        }

        public void moveToSuperclass() {
        }

        public void recycle() {
        }
    }

    public SubscriberMethodFinder(List<SubscriberInfoIndex> list, boolean z, boolean z2) {
    }

    public static void clearCaches() {
    }

    private List<SubscriberMethod> findUsingInfo(Class<?> cls) {
    }

    private List<SubscriberMethod> findUsingReflection(Class<?> cls) {
    }

    private void findUsingReflectionInSingleClass(FindState findState) {
    }

    private List<SubscriberMethod> getMethodsAndRelease(FindState findState) {
    }

    private SubscriberInfo getSubscriberInfo(FindState findState) {
    }

    private FindState prepareFindState() {
    }

    public List<SubscriberMethod> findSubscriberMethods(Class<?> cls) {
    }
}
