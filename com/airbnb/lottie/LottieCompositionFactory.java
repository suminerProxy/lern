package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LottieCompositionFactory {
    private static final Map<String, LottieTask<LottieComposition>> taskCache = null;

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ String val$cacheKey;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$url;

        public AnonymousClass1(Context context, String str, String str2) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$10  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass10 implements LottieListener<LottieComposition> {
        public final /* synthetic */ String val$cacheKey;

        public AnonymousClass10(String str) {
        }

        @Override // com.airbnb.lottie.LottieListener
        public /* bridge */ /* synthetic */ void onResult(LottieComposition lottieComposition) {
        }

        /* renamed from: onResult  reason: avoid collision after fix types in other method */
        public void onResult2(LottieComposition lottieComposition) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$11  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass11 implements LottieListener<Throwable> {
        public final /* synthetic */ String val$cacheKey;

        public AnonymousClass11(String str) {
        }

        @Override // com.airbnb.lottie.LottieListener
        public /* bridge */ /* synthetic */ void onResult(Throwable th) {
        }

        /* renamed from: onResult  reason: avoid collision after fix types in other method */
        public void onResult2(Throwable th) {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ Context val$appContext;
        public final /* synthetic */ String val$cacheKey;
        public final /* synthetic */ String val$fileName;

        public AnonymousClass2(Context context, String str, String str2) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ Context val$appContext;
        public final /* synthetic */ String val$cacheKey;
        public final /* synthetic */ WeakReference val$contextRef;
        public final /* synthetic */ int val$rawRes;

        public AnonymousClass3(WeakReference weakReference, Context context, int i2, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ String val$cacheKey;
        public final /* synthetic */ InputStream val$stream;

        public AnonymousClass4(InputStream inputStream, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ String val$cacheKey;
        public final /* synthetic */ JSONObject val$json;

        public AnonymousClass5(JSONObject jSONObject, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass6 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ String val$cacheKey;
        public final /* synthetic */ String val$json;

        public AnonymousClass6(String str, String str2) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass7 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ String val$cacheKey;
        public final /* synthetic */ JsonReader val$reader;

        public AnonymousClass7(JsonReader jsonReader, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$8  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass8 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ String val$cacheKey;
        public final /* synthetic */ ZipInputStream val$inputStream;

        public AnonymousClass8(ZipInputStream zipInputStream, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    /* renamed from: com.airbnb.lottie.LottieCompositionFactory$9  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass9 implements Callable<LottieResult<LottieComposition>> {
        public final /* synthetic */ LottieComposition val$cachedComposition;

        public AnonymousClass9(LottieComposition lottieComposition) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ LottieResult<LottieComposition> call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public LottieResult<LottieComposition> call() {
        }
    }

    private LottieCompositionFactory() {
    }

    public static /* synthetic */ Map access$000() {
    }

    private static LottieTask<LottieComposition> cache(@Nullable String str, Callable<LottieResult<LottieComposition>> callable) {
    }

    public static void clearCache(Context context) {
    }

    @Nullable
    private static LottieImageAsset findImageAssetForFileName(LottieComposition lottieComposition, String str) {
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
    }

    @Deprecated
    public static LottieTask<LottieComposition> fromJson(JSONObject jSONObject, @Nullable String str) {
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(InputStream inputStream, @Nullable String str) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, @Nullable String str) {
    }

    public static LottieTask<LottieComposition> fromJsonReader(JsonReader jsonReader, @Nullable String str) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, @Nullable String str) {
    }

    private static LottieResult<LottieComposition> fromJsonReaderSyncInternal(JsonReader jsonReader, @Nullable String str, boolean z) {
    }

    public static LottieTask<LottieComposition> fromJsonString(String str, @Nullable String str2) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonStringSync(String str, @Nullable String str2) {
    }

    @WorkerThread
    @Deprecated
    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, @Nullable String str) {
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes int i2) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i2) {
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, @Nullable String str) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, @Nullable String str) {
    }

    @WorkerThread
    private static LottieResult<LottieComposition> fromZipStreamSyncInternal(ZipInputStream zipInputStream, @Nullable String str) {
    }

    private static boolean isNightMode(Context context) {
    }

    private static String rawResCacheKey(Context context, @RawRes int i2) {
    }

    public static void setMaxCacheSize(int i2) {
    }

    @WorkerThread
    private static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, @Nullable String str, boolean z) {
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes int i2, @Nullable String str) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i2, @Nullable String str) {
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str, @Nullable String str2) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str, @Nullable String str2) {
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str, @Nullable String str2) {
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str, @Nullable String str2) {
    }
}
