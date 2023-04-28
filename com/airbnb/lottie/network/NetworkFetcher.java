package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieResult;
import java.io.IOException;
import java.net.HttpURLConnection;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class NetworkFetcher {
    private final Context appContext;
    @Nullable
    private final NetworkCache networkCache;
    private final String url;

    private NetworkFetcher(Context context, String str, @Nullable String str2) {
    }

    @Nullable
    @WorkerThread
    private LottieComposition fetchFromCache() {
    }

    @WorkerThread
    private LottieResult<LottieComposition> fetchFromNetwork() {
    }

    @WorkerThread
    private LottieResult<LottieComposition> fetchFromNetworkInternal() throws IOException {
    }

    public static LottieResult<LottieComposition> fetchSync(Context context, String str, @Nullable String str2) {
    }

    private String getErrorFromConnection(HttpURLConnection httpURLConnection) throws IOException {
    }

    @Nullable
    private LottieResult<LottieComposition> getResultFromConnection(HttpURLConnection httpURLConnection) throws IOException {
    }

    @WorkerThread
    public LottieResult<LottieComposition> fetchSync() {
    }
}
