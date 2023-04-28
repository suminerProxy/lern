package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.FetchState;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface NetworkFetcher<FETCH_STATE extends FetchState> {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Callback {
        void onCancellation();

        void onFailure(Throwable throwable);

        void onResponse(InputStream response, int responseLength) throws IOException;
    }

    FETCH_STATE createFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext);

    void fetch(FETCH_STATE fetchState, Callback callback);

    @Nullable
    Map<String, String> getExtraMap(FETCH_STATE fetchState, int byteSize);

    void onFetchCompletion(FETCH_STATE fetchState, int byteSize);

    boolean shouldPropagate(FETCH_STATE fetchState);
}
