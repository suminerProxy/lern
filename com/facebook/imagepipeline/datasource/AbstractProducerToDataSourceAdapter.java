package com.facebook.imagepipeline.datasource;

import com.facebook.common.internal.Preconditions;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.BaseConsumer;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.imagepipeline.producers.SettableProducerContext;
import com.facebook.imagepipeline.request.HasImageRequest;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class AbstractProducerToDataSourceAdapter<T> extends AbstractDataSource<T> implements HasImageRequest {
    private final RequestListener2 mRequestListener;
    private final SettableProducerContext mSettableProducerContext;

    public AbstractProducerToDataSourceAdapter(Producer<T> producer, SettableProducerContext settableProducerContext, RequestListener2 requestListener) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("AbstractProducerToDataSourceAdapter()");
        }
        this.mSettableProducerContext = settableProducerContext;
        this.mRequestListener = requestListener;
        setInitialExtras();
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        requestListener.onRequestStart(settableProducerContext);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        producer.produceResults(createConsumer(), settableProducerContext);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    private Consumer<T> createConsumer() {
        return new BaseConsumer<T>(this) { // from class: com.facebook.imagepipeline.datasource.AbstractProducerToDataSourceAdapter.1
            public final /* synthetic */ AbstractProducerToDataSourceAdapter this$0;

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public void onCancellationImpl() {
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public void onFailureImpl(Throwable throwable) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public void onNewResultImpl(@Nullable T newResult, int status) {
            }

            @Override // com.facebook.imagepipeline.producers.BaseConsumer
            public void onProgressUpdateImpl(float progress) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onCancellationImpl() {
        Preconditions.checkState(isClosed());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFailureImpl(Throwable throwable) {
        if (super.setFailure(throwable, getExtras(this.mSettableProducerContext))) {
            this.mRequestListener.onRequestFailure(this.mSettableProducerContext, throwable);
        }
    }

    private void setInitialExtras() {
        setExtras(this.mSettableProducerContext.getExtras());
    }

    @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
    public boolean close() {
        if (super.close()) {
            if (super.isFinished()) {
                return true;
            }
            this.mRequestListener.onRequestCancellation(this.mSettableProducerContext);
            this.mSettableProducerContext.cancel();
            return true;
        }
        return false;
    }

    public Map<String, Object> getExtras(ProducerContext producerContext) {
        return producerContext.getExtras();
    }

    @Override // com.facebook.imagepipeline.request.HasImageRequest
    public ImageRequest getImageRequest() {
        return this.mSettableProducerContext.getImageRequest();
    }

    public void onNewResultImpl(@Nullable T result, int status, ProducerContext producerContext) {
        boolean isLast = BaseConsumer.isLast(status);
        if (super.setResult(result, isLast, getExtras(producerContext)) && isLast) {
            this.mRequestListener.onRequestSuccess(this.mSettableProducerContext);
        }
    }
}
