package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.UncheckedCallable;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class Descriptor<E> implements NodeDescriptor<E> {
    private Host mHost;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Host extends ThreadBound {
        @Nullable
        Descriptor<?> getDescriptor(@Nullable Object obj);

        void onAttributeModified(Object obj, String str, String str2);

        void onAttributeRemoved(Object obj, String str);
    }

    public static Map<String, String> parseSetAttributesAsTextArg(String str) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final boolean checkThreadAccess() {
    }

    public final Host getHost() {
    }

    public final void initialize(Host host) {
    }

    public final boolean isInitialized() {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final <V> V postAndWait(UncheckedCallable<V> uncheckedCallable) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void postDelayed(Runnable runnable, long j2) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void removeCallbacks(Runnable runnable) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void verifyThreadAccess() {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public final void postAndWait(Runnable runnable) {
    }
}
