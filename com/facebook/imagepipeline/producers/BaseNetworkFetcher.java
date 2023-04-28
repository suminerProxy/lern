package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.FetchState;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;
import javax.annotation.Nullable;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class BaseNetworkFetcher<FETCH_STATE extends FetchState> implements NetworkFetcher<FETCH_STATE> {
    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    @Nullable
    public Map<String, String> getExtraMap(FETCH_STATE fetchState, int byteSize) {
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void onFetchCompletion(FETCH_STATE fetchState, int byteSize) {
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public boolean shouldPropagate(FETCH_STATE fetchState) {
        return true;
    }
}
