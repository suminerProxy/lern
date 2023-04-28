package com.facebook.imagepipeline.listener;

import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.producers.ProducerContext;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ForwardingRequestListener2 implements RequestListener2 {
    private static final String TAG = "ForwardingRequestListener2";
    private final List<RequestListener2> mRequestListeners;

    public ForwardingRequestListener2(Set<RequestListener2> requestListeners) {
        this.mRequestListeners = new ArrayList(requestListeners.size());
        for (RequestListener2 requestListener2 : requestListeners) {
            if (requestListener2 != null) {
                this.mRequestListeners.add(requestListener2);
            }
        }
    }

    private void onException(String message, Throwable t) {
        FLog.e(TAG, message, t);
    }

    public void addRequestListener(RequestListener2 requestListener) {
        this.mRequestListeners.add(requestListener);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerEvent(ProducerContext producerContext, String producerName, String producerEventName) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerEvent(producerContext, producerName, producerEventName);
            } catch (Exception e2) {
                onException("InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithCancellation(ProducerContext producerContext, String producerName, @Nullable Map<String, String> extraMap) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerFinishWithCancellation(producerContext, producerName, extraMap);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithFailure(ProducerContext producerContext, String producerName, Throwable t, @Nullable Map<String, String> extraMap) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerFinishWithFailure(producerContext, producerName, t, extraMap);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerFinishWithSuccess(ProducerContext producerContext, String producerName, @Nullable Map<String, String> extraMap) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerFinishWithSuccess(producerContext, producerName, extraMap);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onProducerStart(ProducerContext producerContext, String producerName) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerStart(producerContext, producerName);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestCancellation(ProducerContext producerContext) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onRequestCancellation(producerContext);
            } catch (Exception e2) {
                onException("InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestFailure(ProducerContext producerContext, Throwable throwable) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onRequestFailure(producerContext, throwable);
            } catch (Exception e2) {
                onException("InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestStart(ProducerContext producerContext) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onRequestStart(producerContext);
            } catch (Exception e2) {
                onException("InternalListener exception in onRequestStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener2
    public void onRequestSuccess(ProducerContext producerContext) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onRequestSuccess(producerContext);
            } catch (Exception e2) {
                onException("InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public void onUltimateProducerReached(ProducerContext producerContext, String producerName, boolean successful) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onUltimateProducerReached(producerContext, producerName, successful);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener2
    public boolean requiresExtraMap(ProducerContext producerContext, String producerName) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mRequestListeners.get(i2).requiresExtraMap(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    public ForwardingRequestListener2(RequestListener2... requestListeners) {
        this.mRequestListeners = new ArrayList(requestListeners.length);
        for (RequestListener2 requestListener2 : requestListeners) {
            if (requestListener2 != null) {
                this.mRequestListeners.add(requestListener2);
            }
        }
    }
}
