package org.greenrobot.eventbus;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class EventBus {
    private static final EventBusBuilder DEFAULT_BUILDER = null;
    public static String TAG = "EventBus";
    public static volatile EventBus defaultInstance;
    private static final Map<Class<?>, List<Class<?>>> eventTypesCache = null;
    private final AsyncPoster asyncPoster;
    private final BackgroundPoster backgroundPoster;
    private final ThreadLocal<PostingThreadState> currentPostingThreadState;
    private final boolean eventInheritance;
    private final ExecutorService executorService;
    private final int indexCount;
    private final boolean logNoSubscriberMessages;
    private final boolean logSubscriberExceptions;
    private final Logger logger;
    private final Poster mainThreadPoster;
    private final MainThreadSupport mainThreadSupport;
    private final boolean sendNoSubscriberEvent;
    private final boolean sendSubscriberExceptionEvent;
    private final Map<Class<?>, Object> stickyEvents;
    private final SubscriberMethodFinder subscriberMethodFinder;
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> subscriptionsByEventType;
    private final boolean throwSubscriberException;
    private final Map<Object, List<Class<?>>> typesBySubscriber;

    /* renamed from: org.greenrobot.eventbus.EventBus$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 extends ThreadLocal<PostingThreadState> {
        public final /* synthetic */ EventBus this$0;

        public AnonymousClass1(EventBus eventBus) {
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ PostingThreadState initialValue() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue  reason: avoid collision after fix types in other method */
        public PostingThreadState initialValue2() {
        }
    }

    /* renamed from: org.greenrobot.eventbus.EventBus$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$org$greenrobot$eventbus$ThreadMode = null;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class PostingThreadState {
        public boolean canceled;
        public Object event;
        public final List<Object> eventQueue;
        public boolean isMainThread;
        public boolean isPosting;
        public Subscription subscription;
    }

    public EventBus() {
    }

    public static void addInterfaces(List<Class<?>> list, Class<?>[] clsArr) {
    }

    public static EventBusBuilder builder() {
    }

    private void checkPostStickyEventToSubscription(Subscription subscription, Object obj) {
    }

    public static void clearCaches() {
    }

    public static EventBus getDefault() {
    }

    private void handleSubscriberException(Subscription subscription, Object obj, Throwable th) {
    }

    private boolean isMainThread() {
    }

    private static List<Class<?>> lookupAllEventTypes(Class<?> cls) {
    }

    private void postSingleEvent(Object obj, PostingThreadState postingThreadState) throws Error {
    }

    private boolean postSingleEventForEventType(Object obj, PostingThreadState postingThreadState, Class<?> cls) {
    }

    private void postToSubscription(Subscription subscription, Object obj, boolean z) {
    }

    private void subscribe(Object obj, SubscriberMethod subscriberMethod) {
    }

    private void unsubscribeByEventType(Object obj, Class<?> cls) {
    }

    public void cancelEventDelivery(Object obj) {
    }

    public ExecutorService getExecutorService() {
    }

    public Logger getLogger() {
    }

    public <T> T getStickyEvent(Class<T> cls) {
    }

    public boolean hasSubscriberForEvent(Class<?> cls) {
    }

    public void invokeSubscriber(PendingPost pendingPost) {
    }

    public synchronized boolean isRegistered(Object obj) {
    }

    public void post(Object obj) {
    }

    public void postSticky(Object obj) {
    }

    public void register(Object obj) {
    }

    public void removeAllStickyEvents() {
    }

    public <T> T removeStickyEvent(Class<T> cls) {
    }

    public String toString() {
    }

    public synchronized void unregister(Object obj) {
    }

    public EventBus(EventBusBuilder eventBusBuilder) {
    }

    public boolean removeStickyEvent(Object obj) {
    }

    public void invokeSubscriber(Subscription subscription, Object obj) {
    }
}
