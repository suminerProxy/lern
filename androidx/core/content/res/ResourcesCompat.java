package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Method;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public final class ResourcesCompat {
    @AnyRes
    public static final int ID_NULL = 0;
    private static final String TAG = "ResourcesCompat";

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static abstract class FontCallback {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(int i2, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(this, i2) { // from class: androidx.core.content.res.ResourcesCompat.FontCallback.2
                public final /* synthetic */ FontCallback this$0;
                public final /* synthetic */ int val$reason;

                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(Typeface typeface, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(this, typeface) { // from class: androidx.core.content.res.ResourcesCompat.FontCallback.1
                public final /* synthetic */ FontCallback this$0;
                public final /* synthetic */ Typeface val$typeface;

                @Override // java.lang.Runnable
                public void run() {
                }
            });
        }

        public abstract void onFontRetrievalFailed(int i2);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class ThemeCompat {

        @RequiresApi(23)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class ImplApi23 {
            private static Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final Object sRebaseMethodLock = null;

            private ImplApi23() {
            }

            public static void rebase(@NonNull Resources.Theme theme) {
            }
        }

        @RequiresApi(29)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
        public static class ImplApi29 {
            private ImplApi29() {
            }

            public static void rebase(@NonNull Resources.Theme theme) {
            }
        }

        private ThemeCompat() {
        }

        public static void rebase(@NonNull Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                ImplApi29.rebase(theme);
            } else if (i2 >= 23) {
                ImplApi23.rebase(theme);
            }
        }
    }

    private ResourcesCompat() {
    }

    @ColorInt
    public static int getColor(@NonNull Resources resources, @ColorRes int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i2, theme);
        }
        return resources.getColor(i2);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources resources, @ColorRes int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i2, theme);
        }
        return resources.getColorStateList(i2);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Resources resources, @DrawableRes int i2, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i2, theme);
        }
        return resources.getDrawable(i2);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources resources, @DrawableRes int i2, int i3, @Nullable Resources.Theme theme) throws Resources.NotFoundException {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            return resources.getDrawableForDensity(i2, i3, theme);
        }
        if (i4 >= 15) {
            return resources.getDrawableForDensity(i2, i3);
        }
        return resources.getDrawable(i2);
    }

    public static float getFloat(@NonNull Resources resources, @DimenRes int i2) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i2, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i2) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    @Nullable
    public static Typeface getFont(@NonNull Context context, @FontRes int i2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i2, new TypedValue(), 0, null, null, false);
    }

    private static Typeface loadFont(@NonNull Context context, int i2, TypedValue typedValue, int i3, @Nullable FontCallback fontCallback, @Nullable Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i2, i3, fontCallback, handler, z);
        if (loadFont == null && fontCallback == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
        }
        return loadFont;
    }

    public static void getFont(@NonNull Context context, @FontRes int i2, @NonNull FontCallback fontCallback, @Nullable Handler handler) throws Resources.NotFoundException {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i2, new TypedValue(), 0, fontCallback, handler, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r18, @androidx.annotation.Nullable android.os.Handler r19, boolean r20) {
        /*
            r2 = r14
            r0 = r15
            r3 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L93
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r10.startsWith(r0)
            r11 = 0
            r12 = -3
            if (r0 != 0) goto L22
            if (r8 == 0) goto L21
            r8.callbackFailAsync(r12, r9)
        L21:
            return r11
        L22:
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.findFromCache(r14, r3, r4)
            if (r0 == 0) goto L2e
            if (r8 == 0) goto L2d
            r8.callbackSuccessAsync(r0, r9)
        L2d:
            return r0
        L2e:
            java.lang.String r0 = r10.toLowerCase()     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
            if (r0 == 0) goto L5b
            android.content.res.XmlResourceParser r0 = r14.getXml(r3)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = androidx.core.content.res.FontResourcesParserCompat.parse(r0, r14)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
            if (r1 != 0) goto L4a
            if (r8 == 0) goto L49
            r8.callbackFailAsync(r12, r9)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
        L49:
            return r11
        L4a:
            r0 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
            return r0
        L5b:
            r0 = r13
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r13, r14, r3, r10, r4)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
            if (r8 == 0) goto L6b
            if (r0 == 0) goto L68
            r8.callbackSuccessAsync(r0, r9)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
            goto L6b
        L68:
            r8.callbackFailAsync(r12, r9)     // Catch: java.io.IOException -> L6c org.xmlpull.v1.XmlPullParserException -> L7d
        L6b:
            return r0
        L6c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read xml resource "
            r0.append(r1)
            r0.append(r10)
            r0.toString()
            goto L8d
        L7d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to parse xml resource "
            r0.append(r1)
            r0.append(r10)
            r0.toString()
        L8d:
            if (r8 == 0) goto L92
            r8.callbackFailAsync(r12, r9)
        L92:
            return r11
        L93:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Resource \""
            r4.append(r5)
            java.lang.String r2 = r14.getResourceName(r3)
            r4.append(r2)
            java.lang.String r2 = "\" ("
            r4.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r16)
            r4.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean):android.graphics.Typeface");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface getFont(@NonNull Context context, @FontRes int i2, TypedValue typedValue, int i3, @Nullable FontCallback fontCallback) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i2, typedValue, i3, fontCallback, null, true);
    }
}
