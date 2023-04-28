package com.facebook.stetho.inspector.elements;

import com.facebook.stetho.inspector.elements.Descriptor;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DescriptorMap implements DescriptorRegistrar {
    private Descriptor.Host mHost;
    private boolean mIsInitializing;
    private final Map<Class<?>, Descriptor> mMap;

    @Nullable
    private Descriptor getImpl(Class<?> cls) {
    }

    public DescriptorMap beginInit() {
    }

    public DescriptorMap endInit() {
    }

    @Nullable
    public Descriptor get(Class<?> cls) {
    }

    @Override // com.facebook.stetho.inspector.elements.DescriptorRegistrar
    public /* bridge */ /* synthetic */ DescriptorRegistrar registerDescriptor(Class cls, Descriptor descriptor) {
    }

    public DescriptorMap setHost(Descriptor.Host host) {
    }

    @Override // com.facebook.stetho.inspector.elements.DescriptorRegistrar
    public DescriptorMap registerDescriptor(Class<?> cls, Descriptor descriptor) {
    }
}
