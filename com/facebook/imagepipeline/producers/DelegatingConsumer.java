package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class DelegatingConsumer<I, O> extends BaseConsumer<I> {
    private final Consumer<O> mConsumer;

    public DelegatingConsumer(Consumer<O> consumer) {
    }

    public Consumer<O> getConsumer() {
    }

    @Override // com.facebook.imagepipeline.producers.BaseConsumer
    public void onCancellationImpl() {
    }

    @Override // com.facebook.imagepipeline.producers.BaseConsumer
    public void onFailureImpl(Throwable t) {
    }

    @Override // com.facebook.imagepipeline.producers.BaseConsumer
    public void onProgressUpdateImpl(float progress) {
    }
}
