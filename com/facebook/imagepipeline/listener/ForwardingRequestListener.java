package com.facebook.imagepipeline.listener;

import com.facebook.common.logging.FLog;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ForwardingRequestListener implements RequestListener {
    private static final String TAG = "ForwardingRequestListener";
    private final List<RequestListener> mRequestListeners;

    public ForwardingRequestListener(Set<RequestListener> requestListeners) {
        this.mRequestListeners = new ArrayList(requestListeners.size());
        for (RequestListener requestListener : requestListeners) {
            if (requestListener != null) {
                this.mRequestListeners.add(requestListener);
            }
        }
    }

    private void onException(String message, Throwable t) {
        FLog.e(TAG, message, t);
    }

    public void addRequestListener(RequestListener requestListener) {
        this.mRequestListeners.add(requestListener);
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerEvent(String requestId, String producerName, String producerEventName) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerEvent(requestId, producerName, producerEventName);
            } catch (Exception e2) {
                onException("InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithCancellation(String requestId, String producerName, @Nullable Map<String, String> extraMap) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerFinishWithCancellation(requestId, producerName, extraMap);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithFailure(String requestId, String producerName, Throwable t, @Nullable Map<String, String> extraMap) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerFinishWithFailure(requestId, producerName, t, extraMap);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerFinishWithSuccess(String requestId, String producerName, @Nullable Map<String, String> extraMap) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerFinishWithSuccess(requestId, producerName, extraMap);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onProducerStart(String requestId, String producerName) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onProducerStart(requestId, producerName);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String requestId) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onRequestCancellation(requestId);
            } catch (Exception e2) {
                onException("InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest request, String requestId, Throwable throwable, boolean isPrefetch) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onRequestFailure(request, requestId, throwable, isPrefetch);
            } catch (Exception e2) {
                onException("InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest request, Object callerContext, String requestId, boolean isPrefetch) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onRequestStart(request, callerContext, requestId, isPrefetch);
            } catch (Exception e2) {
                onException("InternalListener exception in onRequestStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest request, String requestId, boolean isPrefetch) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onRequestSuccess(request, requestId, isPrefetch);
            } catch (Exception e2) {
                onException("InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public void onUltimateProducerReached(String requestId, String producerName, boolean successful) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                this.mRequestListeners.get(i2).onUltimateProducerReached(requestId, producerName, successful);
            } catch (Exception e2) {
                onException("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.ProducerListener
    public boolean requiresExtraMap(String id) {
        int size = this.mRequestListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mRequestListeners.get(i2).requiresExtraMap(id)) {
                return true;
            }
        }
        return false;
    }

    public ForwardingRequestListener(RequestListener... requestListeners) {
        this.mRequestListeners = new ArrayList(requestListeners.length);
        for (RequestListener requestListener : requestListeners) {
            if (requestListener != null) {
                this.mRequestListeners.add(requestListener);
            }
        }
    }
}
