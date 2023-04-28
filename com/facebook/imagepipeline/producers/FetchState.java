package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class FetchState {
    private final Consumer<EncodedImage> mConsumer;
    private final ProducerContext mContext;
    private long mLastIntermediateResultTimeMs = 0;
    private int mOnNewResultStatusFlags;
    @Nullable
    private BytesRange mResponseBytesRange;

    public FetchState(Consumer<EncodedImage> consumer, ProducerContext context) {
        this.mConsumer = consumer;
        this.mContext = context;
    }

    public Consumer<EncodedImage> getConsumer() {
        return this.mConsumer;
    }

    public ProducerContext getContext() {
        return this.mContext;
    }

    public String getId() {
        return this.mContext.getId();
    }

    public long getLastIntermediateResultTimeMs() {
        return this.mLastIntermediateResultTimeMs;
    }

    public ProducerListener2 getListener() {
        return this.mContext.getProducerListener();
    }

    public int getOnNewResultStatusFlags() {
        return this.mOnNewResultStatusFlags;
    }

    @Nullable
    public BytesRange getResponseBytesRange() {
        return this.mResponseBytesRange;
    }

    public Uri getUri() {
        return this.mContext.getImageRequest().getSourceUri();
    }

    public void setLastIntermediateResultTimeMs(long lastIntermediateResultTimeMs) {
        this.mLastIntermediateResultTimeMs = lastIntermediateResultTimeMs;
    }

    public void setOnNewResultStatusFlags(int onNewResultStatusFlags) {
        this.mOnNewResultStatusFlags = onNewResultStatusFlags;
    }

    public void setResponseBytesRange(@Nullable BytesRange bytesRange) {
        this.mResponseBytesRange = bytesRange;
    }
}
