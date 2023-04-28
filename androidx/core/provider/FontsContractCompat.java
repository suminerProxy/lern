package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.SelfDestructiveThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class FontsContractCompat {
    private static final int BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS = 10000;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final String PARCEL_FONT_RESULTS = "font_results";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
    private static final SelfDestructiveThread sBackgroundThread = null;
    private static final Comparator<byte[]> sByteArrayComparator = null;
    public static final Object sLock = null;
    @GuardedBy("sLock")
    public static final SimpleArrayMap<String, ArrayList<SelfDestructiveThread.ReplyCallback<TypefaceResult>>> sPendingReplies = null;
    public static final LruCache<String, Typeface> sTypefaceCache = null;

    /* renamed from: androidx.core.provider.FontsContractCompat$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements Callable<TypefaceResult> {
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$id;
        public final /* synthetic */ FontRequest val$request;
        public final /* synthetic */ int val$style;

        public AnonymousClass1(Context context, FontRequest fontRequest, int i2, String str) {
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ TypefaceResult call() throws Exception {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public TypefaceResult call() throws Exception {
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements SelfDestructiveThread.ReplyCallback<TypefaceResult> {
        public final /* synthetic */ ResourcesCompat.FontCallback val$fontCallback;
        public final /* synthetic */ Handler val$handler;

        public AnonymousClass2(ResourcesCompat.FontCallback fontCallback, Handler handler) {
        }

        @Override // androidx.core.provider.SelfDestructiveThread.ReplyCallback
        public /* bridge */ /* synthetic */ void onReply(TypefaceResult typefaceResult) {
        }

        /* renamed from: onReply  reason: avoid collision after fix types in other method */
        public void onReply2(TypefaceResult typefaceResult) {
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass3 implements SelfDestructiveThread.ReplyCallback<TypefaceResult> {
        public final /* synthetic */ String val$id;

        public AnonymousClass3(String str) {
        }

        @Override // androidx.core.provider.SelfDestructiveThread.ReplyCallback
        public /* bridge */ /* synthetic */ void onReply(TypefaceResult typefaceResult) {
        }

        /* renamed from: onReply  reason: avoid collision after fix types in other method */
        public void onReply2(TypefaceResult typefaceResult) {
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ Context val$appContext;
        public final /* synthetic */ FontRequestCallback val$callback;
        public final /* synthetic */ Handler val$callerThreadHandler;
        public final /* synthetic */ FontRequest val$request;

        /* renamed from: androidx.core.provider.FontsContractCompat$4$1  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;

            public AnonymousClass1(AnonymousClass4 anonymousClass4) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$4$2  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;

            public AnonymousClass2(AnonymousClass4 anonymousClass4) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$4$3  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass3 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;

            public AnonymousClass3(AnonymousClass4 anonymousClass4) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$4$4  reason: invalid class name and collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class RunnableC00034 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;

            public RunnableC00034(AnonymousClass4 anonymousClass4) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$4$5  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass5 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;

            public AnonymousClass5(AnonymousClass4 anonymousClass4) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$4$6  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass6 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;

            public AnonymousClass6(AnonymousClass4 anonymousClass4) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$4$7  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass7 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;
            public final /* synthetic */ int val$resultCode;

            public AnonymousClass7(AnonymousClass4 anonymousClass4, int i2) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$4$8  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass8 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;

            public AnonymousClass8(AnonymousClass4 anonymousClass4) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* renamed from: androidx.core.provider.FontsContractCompat$4$9  reason: invalid class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public class AnonymousClass9 implements Runnable {
            public final /* synthetic */ AnonymousClass4 this$0;
            public final /* synthetic */ Typeface val$typeface;

            public AnonymousClass9(AnonymousClass4 anonymousClass4, Typeface typeface) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public AnonymousClass4(Context context, FontRequest fontRequest, Handler handler, FontRequestCallback fontRequestCallback) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* renamed from: androidx.core.provider.FontsContractCompat$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass5 implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
        }

        /* renamed from: compare  reason: avoid collision after fix types in other method */
        public int compare2(byte[] bArr, byte[] bArr2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final FontInfo[] mFonts;
        private final int mStatusCode;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public FontFamilyResult(int i2, @Nullable FontInfo[] fontInfoArr) {
        }

        public FontInfo[] getFonts() {
        }

        public int getStatusCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final int mWeight;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public FontInfo(@NonNull Uri uri, @IntRange(from = 0) int i2, @IntRange(from = 1, to = 1000) int i3, boolean z, int i4) {
        }

        public int getResultCode() {
        }

        @IntRange(from = 0)
        public int getTtcIndex() {
        }

        @NonNull
        public Uri getUri() {
        }

        @IntRange(from = 1, to = 1000)
        public int getWeight() {
        }

        public boolean isItalic() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int RESULT_OK = 0;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i2) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class TypefaceResult {
        public final int mResult;
        public final Typeface mTypeface;

        public TypefaceResult(@Nullable Typeface typeface, int i2) {
        }
    }

    private FontsContractCompat() {
    }

    @Nullable
    public static Typeface buildTypeface(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontInfo[] fontInfoArr) {
    }

    private static List<byte[]> convertToByteArrayList(Signature[] signatureArr) {
    }

    private static boolean equalsByteArrayList(List<byte[]> list, List<byte[]> list2) {
    }

    @NonNull
    public static FontFamilyResult fetchFonts(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
    }

    private static List<List<byte[]>> getCertificates(FontRequest fontRequest, Resources resources) {
    }

    @NonNull
    @VisibleForTesting
    public static FontInfo[] getFontFromProvider(Context context, FontRequest fontRequest, String str, CancellationSignal cancellationSignal) {
    }

    @NonNull
    public static TypefaceResult getFontInternal(Context context, FontRequest fontRequest, int i2) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface getFontSync(Context context, FontRequest fontRequest, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean z, int i2, int i3) {
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    public static ProviderInfo getProvider(@NonNull PackageManager packageManager, @NonNull FontRequest fontRequest, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
    }

    public static void requestFont(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
    }

    private static void requestFontInternal(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void resetCache() {
    }
}
