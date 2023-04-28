package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Beta
@GwtIncompatible
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Service {

    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class Listener {
        public void failed(State state, Throwable th) {
        }

        public void running() {
        }

        public void starting() {
        }

        public void stopping(State state) {
        }

        public void terminated(State state) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    @Beta
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class State {
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State FAILED = null;
        public static final State NEW = null;
        public static final State RUNNING = null;
        public static final State STARTING = null;
        public static final State STOPPING = null;
        public static final State TERMINATED = null;

        /* renamed from: com.google.common.util.concurrent.Service$State$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass1 extends State {
            public AnonymousClass1(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean isTerminal() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.Service$State$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass2 extends State {
            public AnonymousClass2(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean isTerminal() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.Service$State$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass3 extends State {
            public AnonymousClass3(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean isTerminal() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.Service$State$4  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass4 extends State {
            public AnonymousClass4(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean isTerminal() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.Service$State$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass5 extends State {
            public AnonymousClass5(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean isTerminal() {
            }
        }

        /* renamed from: com.google.common.util.concurrent.Service$State$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public enum AnonymousClass6 extends State {
            public AnonymousClass6(String str, int i2) {
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean isTerminal() {
            }
        }

        private State(String str, int i2) {
        }

        public static State valueOf(String str) {
        }

        public static State[] values() {
        }

        public abstract boolean isTerminal();

        public /* synthetic */ State(String str, int i2, AnonymousClass1 anonymousClass1) {
        }
    }

    void addListener(Listener listener, Executor executor);

    void awaitRunning();

    void awaitRunning(long j2, TimeUnit timeUnit) throws TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long j2, TimeUnit timeUnit) throws TimeoutException;

    Throwable failureCause();

    boolean isRunning();

    @CanIgnoreReturnValue
    Service startAsync();

    State state();

    @CanIgnoreReturnValue
    Service stopAsync();
}
