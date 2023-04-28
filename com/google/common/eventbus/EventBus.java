package com.google.common.eventbus;

import com.google.common.annotations.Beta;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@Beta
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class EventBus {
    private static final Logger logger = null;
    private final Dispatcher dispatcher;
    private final SubscriberExceptionHandler exceptionHandler;
    private final Executor executor;
    private final String identifier;
    private final SubscriberRegistry subscribers;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LoggingHandler implements SubscriberExceptionHandler {
        public static final LoggingHandler INSTANCE = null;

        private static Logger logger(SubscriberExceptionContext subscriberExceptionContext) {
        }

        private static String message(SubscriberExceptionContext subscriberExceptionContext) {
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
        }
    }

    public EventBus() {
    }

    public final Executor executor() {
    }

    public void handleSubscriberException(Throwable th, SubscriberExceptionContext subscriberExceptionContext) {
    }

    public final String identifier() {
    }

    public void post(Object obj) {
    }

    public void register(Object obj) {
    }

    public String toString() {
    }

    public void unregister(Object obj) {
    }

    public EventBus(String str) {
    }

    public EventBus(SubscriberExceptionHandler subscriberExceptionHandler) {
    }

    public EventBus(String str, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler subscriberExceptionHandler) {
    }
}
