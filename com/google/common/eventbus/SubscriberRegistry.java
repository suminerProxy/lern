package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SubscriberRegistry {
    private static final LoadingCache<Class<?>, ImmutableSet<Class<?>>> flattenHierarchyCache = null;
    private static final LoadingCache<Class<?>, ImmutableList<Method>> subscriberMethodsCache = null;
    @Weak
    private final EventBus bus;
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<Subscriber>> subscribers;

    /* renamed from: com.google.common.eventbus.SubscriberRegistry$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass1 extends CacheLoader<Class<?>, ImmutableList<Method>> {
        @Override // com.google.common.cache.CacheLoader
        public /* bridge */ /* synthetic */ ImmutableList<Method> load(Class<?> cls) throws Exception {
        }

        /* renamed from: load  reason: avoid collision after fix types in other method */
        public ImmutableList<Method> load2(Class<?> cls) throws Exception {
        }
    }

    /* renamed from: com.google.common.eventbus.SubscriberRegistry$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class AnonymousClass2 extends CacheLoader<Class<?>, ImmutableSet<Class<?>>> {
        @Override // com.google.common.cache.CacheLoader
        public /* bridge */ /* synthetic */ ImmutableSet<Class<?>> load(Class<?> cls) throws Exception {
        }

        /* renamed from: load  reason: avoid collision after fix types in other method */
        public ImmutableSet<Class<?>> load2(Class<?> cls) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MethodIdentifier {
        private final String name;
        private final List<Class<?>> parameterTypes;

        public MethodIdentifier(Method method) {
        }

        public boolean equals(@NullableDecl Object obj) {
        }

        public int hashCode() {
        }
    }

    public SubscriberRegistry(EventBus eventBus) {
    }

    public static /* synthetic */ ImmutableList access$000(Class cls) {
    }

    private Multimap<Class<?>, Subscriber> findAllSubscribers(Object obj) {
    }

    @VisibleForTesting
    public static ImmutableSet<Class<?>> flattenHierarchy(Class<?> cls) {
    }

    private static ImmutableList<Method> getAnnotatedMethods(Class<?> cls) {
    }

    private static ImmutableList<Method> getAnnotatedMethodsNotCached(Class<?> cls) {
    }

    public Iterator<Subscriber> getSubscribers(Object obj) {
    }

    @VisibleForTesting
    public Set<Subscriber> getSubscribersForTesting(Class<?> cls) {
    }

    public void register(Object obj) {
    }

    public void unregister(Object obj) {
    }
}
