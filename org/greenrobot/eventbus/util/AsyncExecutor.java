package org.greenrobot.eventbus.util;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.EventBus;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class AsyncExecutor {
    private final EventBus eventBus;
    private final Constructor<?> failureEventConstructor;
    private final Object scope;
    private final Executor threadPool;

    /* renamed from: org.greenrobot.eventbus.util.AsyncExecutor$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ AsyncExecutor this$0;
        public final /* synthetic */ RunnableEx val$runnable;

        public AnonymousClass1(AsyncExecutor asyncExecutor, RunnableEx runnableEx) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class Builder {
        private EventBus eventBus;
        private Class<?> failureEventType;
        private Executor threadPool;

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public AsyncExecutor build() {
        }

        public AsyncExecutor buildForScope(Object obj) {
        }

        public Builder eventBus(EventBus eventBus) {
        }

        public Builder failureEventType(Class<?> cls) {
        }

        public Builder threadPool(Executor executor) {
        }

        private Builder() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface RunnableEx {
        void run() throws Exception;
    }

    public /* synthetic */ AsyncExecutor(Executor executor, EventBus eventBus, Class cls, Object obj, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ Constructor access$200(AsyncExecutor asyncExecutor) {
    }

    public static /* synthetic */ EventBus access$300(AsyncExecutor asyncExecutor) {
    }

    public static /* synthetic */ Object access$400(AsyncExecutor asyncExecutor) {
    }

    public static Builder builder() {
    }

    public static AsyncExecutor create() {
    }

    public void execute(RunnableEx runnableEx) {
    }

    private AsyncExecutor(Executor executor, EventBus eventBus, Class<?> cls, Object obj) {
    }
}
