package org.greenrobot.eventbus;

import java.util.List;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class EventBusBuilder {
    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = null;
    public boolean eventInheritance;
    public ExecutorService executorService;
    public boolean ignoreGeneratedIndex;
    public boolean logNoSubscriberMessages;
    public boolean logSubscriberExceptions;
    public Logger logger;
    public MainThreadSupport mainThreadSupport;
    public boolean sendNoSubscriberEvent;
    public boolean sendSubscriberExceptionEvent;
    public List<Class<?>> skipMethodVerificationForClasses;
    public boolean strictMethodVerification;
    public List<SubscriberInfoIndex> subscriberInfoIndexes;
    public boolean throwSubscriberException;

    public static Object getAndroidMainLooperOrNull() {
    }

    public EventBusBuilder addIndex(SubscriberInfoIndex subscriberInfoIndex) {
    }

    public EventBus build() {
    }

    public EventBusBuilder eventInheritance(boolean z) {
    }

    public EventBusBuilder executorService(ExecutorService executorService) {
    }

    public Logger getLogger() {
    }

    public MainThreadSupport getMainThreadSupport() {
    }

    public EventBusBuilder ignoreGeneratedIndex(boolean z) {
    }

    public EventBus installDefaultEventBus() {
    }

    public EventBusBuilder logNoSubscriberMessages(boolean z) {
    }

    public EventBusBuilder logSubscriberExceptions(boolean z) {
    }

    public EventBusBuilder logger(Logger logger) {
    }

    public EventBusBuilder sendNoSubscriberEvent(boolean z) {
    }

    public EventBusBuilder sendSubscriberExceptionEvent(boolean z) {
    }

    public EventBusBuilder skipMethodVerificationFor(Class<?> cls) {
    }

    public EventBusBuilder strictMethodVerification(boolean z) {
    }

    public EventBusBuilder throwSubscriberException(boolean z) {
    }
}
