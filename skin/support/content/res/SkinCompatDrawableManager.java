package skin.support.content.res;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class SkinCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static SkinCompatDrawableManager INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "SkinCompatDrawableManager";
    private ArrayMap<String, InflateDelegate> mDelegates;
    private final Object mDrawableCacheLock = new Object();
    private final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private SparseArray<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, SparseArray<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    private static final int[] TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    private static final int[] TINT_CHECKABLE_BUTTON_LIST = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};

    @RequiresApi(11)
    @TargetApi(11)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class AvdcInflateDelegate implements InflateDelegate {
        @Override // skin.support.content.res.SkinCompatDrawableManager.InflateDelegate
        @SuppressLint({"NewApi"})
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i2) {
        }

        private static int generateCacheKey(int i2, PorterDuff.Mode mode) {
        }

        public PorterDuffColorFilter get(int i2, PorterDuff.Mode mode) {
        }

        public PorterDuffColorFilter put(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface InflateDelegate {
        Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class VdcInflateDelegate implements InflateDelegate {
        @Override // skin.support.content.res.SkinCompatDrawableManager.InflateDelegate
        @SuppressLint({"NewApi"})
        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
        }
    }

    private void addDelegate(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new ArrayMap<>();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private boolean addDrawableToCache(@NonNull Context context, long j2, @NonNull Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            synchronized (this.mDrawableCacheLock) {
                LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray<>();
                    this.mDrawableCaches.put(context, longSparseArray);
                }
                longSparseArray.put(j2, new WeakReference<>(constantState));
            }
            return true;
        }
        return false;
    }

    private void addTintListToCache(@NonNull Context context, @DrawableRes int i2, @NonNull ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        SparseArray<ColorStateList> sparseArray = this.mTintLists.get(context);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.mTintLists.put(context, sparseArray);
        }
        sparseArray.append(i2, colorStateList);
    }

    private static boolean arrayContains(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void checkVectorDrawableSetup(@NonNull Context context) {
        if (this.mHasCheckedVectorDrawableSetup) {
            return;
        }
        this.mHasCheckedVectorDrawableSetup = true;
        Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
        if (drawable == null || !isVectorDrawable(drawable)) {
            this.mHasCheckedVectorDrawableSetup = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private ColorStateList createBorderlessButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, 0);
    }

    private ColorStateList createButtonColorStateList(@NonNull Context context, @ColorInt int i2) {
        int themeAttrColor = SkinCompatThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{SkinCompatThemeUtils.DISABLED_STATE_SET, SkinCompatThemeUtils.PRESSED_STATE_SET, SkinCompatThemeUtils.FOCUSED_STATE_SET, SkinCompatThemeUtils.EMPTY_STATE_SET}, new int[]{SkinCompatThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal), ColorUtils.compositeColors(themeAttrColor, i2), ColorUtils.compositeColors(themeAttrColor, i2), i2});
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private ColorStateList createColoredButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, SkinCompatThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
    }

    private ColorStateList createDefaultButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, SkinCompatThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
    }

    private Drawable createDrawableIfNeeded(@NonNull Context context, @DrawableRes int i2) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        SkinCompatResources.getValue(context, i2, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (i2 == R.drawable.abc_cab_background_top_material) {
            cachedDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, R.drawable.abc_cab_background_internal_bg), getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (cachedDrawable != null) {
            cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, cachedDrawable);
        }
        return cachedDrawable;
    }

    private ColorStateList createSwitchThumbColorStateList(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        int i2 = R.attr.colorSwitchThumbNormal;
        ColorStateList themeAttrColorStateList = SkinCompatThemeUtils.getThemeAttrColorStateList(context, i2);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            iArr[0] = SkinCompatThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = themeAttrColorStateList.getColorForState(iArr[0], 0);
            iArr[1] = SkinCompatThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = SkinCompatThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
            iArr[2] = SkinCompatThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = themeAttrColorStateList.getDefaultColor();
        } else {
            iArr[0] = SkinCompatThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = SkinCompatThemeUtils.getDisabledThemeAttrColor(context, i2);
            iArr[1] = SkinCompatThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = SkinCompatThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
            iArr[2] = SkinCompatThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = SkinCompatThemeUtils.getThemeAttrColor(context, i2);
        }
        return new ColorStateList(iArr, iArr2);
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static SkinCompatDrawableManager get() {
        if (INSTANCE == null) {
            SkinCompatDrawableManager skinCompatDrawableManager = new SkinCompatDrawableManager();
            INSTANCE = skinCompatDrawableManager;
            installDefaultInflateDelegates(skinCompatDrawableManager);
        }
        return INSTANCE;
    }

    private Drawable getCachedDrawable(@NonNull Context context, long j2) {
        synchronized (this.mDrawableCacheLock) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
            if (longSparseArray == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> weakReference = longSparseArray.get(j2);
            if (weakReference != null) {
                Drawable.ConstantState constantState = weakReference.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                longSparseArray.delete(j2);
            }
            return null;
        }
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int i2, PorterDuff.Mode mode) {
        ColorFilterLruCache colorFilterLruCache = COLOR_FILTER_CACHE;
        PorterDuffColorFilter porterDuffColorFilter = colorFilterLruCache.get(i2, mode);
        if (porterDuffColorFilter == null) {
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i2, mode);
            colorFilterLruCache.put(i2, mode, porterDuffColorFilter2);
            return porterDuffColorFilter2;
        }
        return porterDuffColorFilter;
    }

    private ColorStateList getTintListFromCache(@NonNull Context context, @DrawableRes int i2) {
        SparseArray<ColorStateList> sparseArray;
        WeakHashMap<Context, SparseArray<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap == null || (sparseArray = weakHashMap.get(context)) == null) {
            return null;
        }
        return sparseArray.get(i2);
    }

    public static PorterDuff.Mode getTintMode(int i2) {
        if (i2 == R.drawable.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    private static void installDefaultInflateDelegates(@NonNull SkinCompatDrawableManager skinCompatDrawableManager) {
        if (Build.VERSION.SDK_INT < 24) {
            skinCompatDrawableManager.addDelegate("vector", new VdcInflateDelegate());
            skinCompatDrawableManager.addDelegate("animated-vector", new AvdcInflateDelegate());
        }
    }

    private static boolean isVectorDrawable(@NonNull Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName());
    }

    private Drawable loadDrawableFromDelegates(@NonNull Context context, @DrawableRes int i2) {
        int next;
        ArrayMap<String, InflateDelegate> arrayMap = this.mDelegates;
        if (arrayMap == null || arrayMap.isEmpty()) {
            return null;
        }
        SparseArray<String> sparseArray = this.mKnownDrawableIdTags;
        if (sparseArray != null) {
            String str = sparseArray.get(i2);
            if (SKIP_DRAWABLE_TAG.equals(str) || (str != null && this.mDelegates.get(str) == null)) {
                return null;
            }
        } else {
            this.mKnownDrawableIdTags = new SparseArray<>();
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        SkinCompatResources.getValue(context, i2, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = SkinCompatResources.getXml(context, i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.mKnownDrawableIdTags.append(i2, name);
                    InflateDelegate inflateDelegate = this.mDelegates.get(name);
                    if (inflateDelegate != null) {
                        cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, asAttributeSet, null);
                    }
                    if (cachedDrawable != null) {
                        cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                        addDrawableToCache(context, createCacheKey, cachedDrawable);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.append(i2, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    private void removeDelegate(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        ArrayMap<String, InflateDelegate> arrayMap = this.mDelegates;
        if (arrayMap == null || arrayMap.get(str) != inflateDelegate) {
            return;
        }
        this.mDelegates.remove(str);
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (SkinCompatDrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(i2, mode));
    }

    private Drawable tintDrawable(@NonNull Context context, @DrawableRes int i2, boolean z, @NonNull Drawable drawable) {
        ColorStateList tintList = getTintList(context, i2);
        if (tintList != null) {
            if (SkinCompatDrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable wrap = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(wrap, tintList);
            PorterDuff.Mode tintMode = getTintMode(i2);
            if (tintMode != null) {
                DrawableCompat.setTintMode(wrap, tintMode);
                return wrap;
            }
            return wrap;
        } else if (i2 == R.drawable.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
            int i3 = R.attr.colorControlNormal;
            int themeAttrColor = SkinCompatThemeUtils.getThemeAttrColor(context, i3);
            PorterDuff.Mode mode = DEFAULT_MODE;
            setPorterDuffColorFilter(findDrawableByLayerId, themeAttrColor, mode);
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908303), SkinCompatThemeUtils.getThemeAttrColor(context, i3), mode);
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908301), SkinCompatThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), mode);
            return drawable;
        } else if (i2 != R.drawable.abc_ratingbar_material && i2 != R.drawable.abc_ratingbar_indicator_material && i2 != R.drawable.abc_ratingbar_small_material) {
            if (tintDrawableUsingColorFilter(context, i2, drawable) || !z) {
                return drawable;
            }
            return null;
        } else {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
            int disabledThemeAttrColor = SkinCompatThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal);
            PorterDuff.Mode mode2 = DEFAULT_MODE;
            setPorterDuffColorFilter(findDrawableByLayerId2, disabledThemeAttrColor, mode2);
            Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
            int i4 = R.attr.colorControlActivated;
            setPorterDuffColorFilter(findDrawableByLayerId3, SkinCompatThemeUtils.getThemeAttrColor(context, i4), mode2);
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(16908301), SkinCompatThemeUtils.getThemeAttrColor(context, i4), mode2);
            return drawable;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean tintDrawableUsingColorFilter(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.DrawableRes int r7, @androidx.annotation.NonNull android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = skin.support.content.res.SkinCompatDrawableManager.DEFAULT_MODE
            int[] r1 = skin.support.content.res.SkinCompatDrawableManager.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
            boolean r1 = arrayContains(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = androidx.appcompat.R.attr.colorControlNormal
        L12:
            r7 = r3
        L13:
            r1 = r5
            goto L42
        L15:
            int[] r1 = skin.support.content.res.SkinCompatDrawableManager.COLORFILTER_COLOR_CONTROL_ACTIVATED
            boolean r1 = arrayContains(r1, r7)
            if (r1 == 0) goto L20
            int r2 = androidx.appcompat.R.attr.colorControlActivated
            goto L12
        L20:
            int[] r1 = skin.support.content.res.SkinCompatDrawableManager.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
            boolean r1 = arrayContains(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L13
        L3a:
            int r1 = androidx.appcompat.R.drawable.abc_dialog_material_background
            if (r7 != r1) goto L3f
            goto L12
        L3f:
            r7 = r3
            r1 = r4
            r2 = r1
        L42:
            if (r1 == 0) goto L5f
            boolean r1 = skin.support.content.res.SkinCompatDrawableUtils.canSafelyMutateDrawable(r8)
            if (r1 == 0) goto L4e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L4e:
            int r6 = skin.support.content.res.SkinCompatThemeUtils.getThemeAttrColor(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = getPorterDuffColorFilter(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L5e
            r8.setAlpha(r7)
        L5e:
            return r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: skin.support.content.res.SkinCompatDrawableManager.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public void clearCaches() {
        this.mDrawableCaches.clear();
        SparseArray<String> sparseArray = this.mKnownDrawableIdTags;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        WeakHashMap<Context, SparseArray<ColorStateList>> weakHashMap = this.mTintLists;
        if (weakHashMap != null) {
            weakHashMap.clear();
        }
        COLOR_FILTER_CACHE.evictAll();
    }

    public Drawable getDrawable(@NonNull Context context, @DrawableRes int i2) {
        return getDrawable(context, i2, false);
    }

    public ColorStateList getTintList(@NonNull Context context, @DrawableRes int i2) {
        ColorStateList tintListFromCache = getTintListFromCache(context, i2);
        if (tintListFromCache == null) {
            if (i2 == R.drawable.abc_edit_text_material) {
                tintListFromCache = SkinCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
            } else if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                tintListFromCache = SkinCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
            } else if (i2 == R.drawable.abc_switch_thumb_material) {
                tintListFromCache = createSwitchThumbColorStateList(context);
            } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                tintListFromCache = createDefaultButtonColorStateList(context);
            } else if (i2 == R.drawable.abc_btn_borderless_material) {
                tintListFromCache = createBorderlessButtonColorStateList(context);
            } else if (i2 == R.drawable.abc_btn_colored_material) {
                tintListFromCache = createColoredButtonColorStateList(context);
            } else if (i2 != R.drawable.abc_spinner_mtrl_am_alpha && i2 != R.drawable.abc_spinner_textfield_background_material) {
                if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i2)) {
                    tintListFromCache = SkinCompatThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
                } else if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i2)) {
                    tintListFromCache = SkinCompatResources.getColorStateList(context, R.color.abc_tint_default);
                } else if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i2)) {
                    tintListFromCache = SkinCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
                } else if (i2 == R.drawable.abc_seekbar_thumb_material) {
                    tintListFromCache = SkinCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
            } else {
                tintListFromCache = SkinCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (tintListFromCache != null) {
                addTintListToCache(context, i2, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    public void onConfigurationChanged(@NonNull Context context) {
        synchronized (this.mDrawableCacheLock) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.mDrawableCaches.get(context);
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        }
    }

    public Drawable getDrawable(@NonNull Context context, @DrawableRes int i2, boolean z) {
        checkVectorDrawableSetup(context);
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i2);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i2);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = SkinCompatResources.getDrawable(context, i2);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i2, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            SkinCompatDrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }
}
