package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TypefaceCompatBaseImpl {
    private static final int INVALID_KEY = 0;
    private static final String TAG = "TypefaceCompatBaseImpl";
    private ConcurrentHashMap<Long, FontResourcesParserCompat.FontFamilyFilesResourceEntry> mFontFamilies;

    /* renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements StyleExtractor<FontsContractCompat.FontInfo> {
        public final /* synthetic */ TypefaceCompatBaseImpl this$0;

        public AnonymousClass1(TypefaceCompatBaseImpl typefaceCompatBaseImpl) {
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public /* bridge */ /* synthetic */ int getWeight(FontsContractCompat.FontInfo fontInfo) {
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public /* bridge */ /* synthetic */ boolean isItalic(FontsContractCompat.FontInfo fontInfo) {
        }

        /* renamed from: getWeight  reason: avoid collision after fix types in other method */
        public int getWeight2(FontsContractCompat.FontInfo fontInfo) {
        }

        /* renamed from: isItalic  reason: avoid collision after fix types in other method */
        public boolean isItalic2(FontsContractCompat.FontInfo fontInfo) {
        }
    }

    /* renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        public final /* synthetic */ TypefaceCompatBaseImpl this$0;

        public AnonymousClass2(TypefaceCompatBaseImpl typefaceCompatBaseImpl) {
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public /* bridge */ /* synthetic */ int getWeight(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public /* bridge */ /* synthetic */ boolean isItalic(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
        }

        /* renamed from: getWeight  reason: avoid collision after fix types in other method */
        public int getWeight2(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
        }

        /* renamed from: isItalic  reason: avoid collision after fix types in other method */
        public boolean isItalic2(FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface StyleExtractor<T> {
        int getWeight(T t);

        boolean isItalic(T t);
    }

    private void addFontFamily(Typeface typeface, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry) {
    }

    private FontResourcesParserCompat.FontFileResourceEntry findBestEntry(FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, int i2) {
    }

    private static <T> T findBestFont(T[] tArr, int i2, StyleExtractor<T> styleExtractor) {
    }

    private static long getUniqueKey(@Nullable Typeface typeface) {
    }

    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
    }

    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
    }

    public Typeface createFromInputStream(Context context, InputStream inputStream) {
    }

    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i2, String str, int i3) {
    }

    public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
    }

    @Nullable
    public FontResourcesParserCompat.FontFamilyFilesResourceEntry getFontFamily(Typeface typeface) {
    }
}
