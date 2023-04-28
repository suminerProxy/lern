package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class LottieComposition {
    private Rect bounds;
    private SparseArrayCompat<FontCharacter> characters;
    private float endFrame;
    private Map<String, Font> fonts;
    private float frameRate;
    private boolean hasDashPattern;
    private Map<String, LottieImageAsset> images;
    private LongSparseArray<Layer> layerMap;
    private List<Layer> layers;
    private List<Marker> markers;
    private int maskAndMatteCount;
    private final PerformanceTracker performanceTracker;
    private Map<String, List<Layer>> precomps;
    private float startFrame;
    private final HashSet<String> warnings;

    @Deprecated
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Factory {

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static final class ListenerAdapter implements LottieListener<LottieComposition>, Cancellable {
            private boolean cancelled;
            private final OnCompositionLoadedListener listener;

            public /* synthetic */ ListenerAdapter(OnCompositionLoadedListener onCompositionLoadedListener, AnonymousClass1 anonymousClass1) {
            }

            @Override // com.airbnb.lottie.Cancellable
            public void cancel() {
            }

            @Override // com.airbnb.lottie.LottieListener
            public /* bridge */ /* synthetic */ void onResult(LottieComposition lottieComposition) {
            }

            private ListenerAdapter(OnCompositionLoadedListener onCompositionLoadedListener) {
            }

            /* renamed from: onResult  reason: avoid collision after fix types in other method */
            public void onResult2(LottieComposition lottieComposition) {
            }
        }

        private Factory() {
        }

        @Deprecated
        public static Cancellable fromAssetFileName(Context context, String str, OnCompositionLoadedListener onCompositionLoadedListener) {
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromFileSync(Context context, String str) {
        }

        @Deprecated
        public static Cancellable fromInputStream(InputStream inputStream, OnCompositionLoadedListener onCompositionLoadedListener) {
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream) {
        }

        @Deprecated
        public static Cancellable fromJsonReader(JsonReader jsonReader, OnCompositionLoadedListener onCompositionLoadedListener) {
        }

        @Deprecated
        public static Cancellable fromJsonString(String str, OnCompositionLoadedListener onCompositionLoadedListener) {
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(Resources resources, JSONObject jSONObject) {
        }

        @Deprecated
        public static Cancellable fromRawFile(Context context, @RawRes int i2, OnCompositionLoadedListener onCompositionLoadedListener) {
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream, boolean z) {
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(String str) {
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(JsonReader jsonReader) throws IOException {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void addWarning(String str) {
    }

    public Rect getBounds() {
    }

    public SparseArrayCompat<FontCharacter> getCharacters() {
    }

    public float getDuration() {
    }

    public float getDurationFrames() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getEndFrame() {
    }

    public Map<String, Font> getFonts() {
    }

    public float getFrameRate() {
    }

    public Map<String, LottieImageAsset> getImages() {
    }

    public List<Layer> getLayers() {
    }

    @Nullable
    public Marker getMarker(String str) {
    }

    public List<Marker> getMarkers() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMaskAndMatteCount() {
    }

    public PerformanceTracker getPerformanceTracker() {
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> getPrecomps(String str) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getStartFrame() {
    }

    public ArrayList<String> getWarnings() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDashPattern() {
    }

    public boolean hasImages() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void incrementMatteOrMaskCount(int i2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void init(Rect rect, float f2, float f3, float f4, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2, SparseArrayCompat<FontCharacter> sparseArrayCompat, Map<String, Font> map3, List<Marker> list2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer layerModelForId(long j2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasDashPattern(boolean z) {
    }

    public void setPerformanceTrackingEnabled(boolean z) {
    }

    public String toString() {
    }
}
