package com.facebook.stetho.inspector.elements.android;

import android.app.Application;
import android.os.Handler;
import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.inspector.elements.DescriptorProvider;
import com.facebook.stetho.inspector.elements.DocumentProvider;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class AndroidDocumentProviderFactory implements DocumentProviderFactory, ThreadBound {
    private final Application mApplication;
    private final List<DescriptorProvider> mDescriptorProviders;
    private final Handler mHandler;

    public AndroidDocumentProviderFactory(Application application, List<DescriptorProvider> list) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public boolean checkThreadAccess() {
    }

    @Override // com.facebook.stetho.inspector.elements.DocumentProviderFactory
    public DocumentProvider create() {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public <V> V postAndWait(UncheckedCallable<V> uncheckedCallable) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public void postDelayed(Runnable runnable, long j2) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public void removeCallbacks(Runnable runnable) {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public void verifyThreadAccess() {
    }

    @Override // com.facebook.stetho.common.ThreadBound
    public void postAndWait(Runnable runnable) {
    }
}
