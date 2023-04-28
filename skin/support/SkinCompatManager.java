package skin.support;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import skin.support.annotation.NonNull;
import skin.support.annotation.Nullable;
import skin.support.app.SkinActivityLifecycle;
import skin.support.app.SkinLayoutInflater;
import skin.support.app.SkinWrapper;
import skin.support.content.res.SkinCompatResources;
import skin.support.load.SkinAssetsLoader;
import skin.support.load.SkinBuildInLoader;
import skin.support.load.SkinNoneLoader;
import skin.support.load.SkinPrefixBuildInLoader;
import skin.support.observe.SkinObservable;
import skin.support.utils.SkinPreference;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatManager extends SkinObservable {
    public static final int SKIN_LOADER_STRATEGY_ASSETS = 0;
    public static final int SKIN_LOADER_STRATEGY_BUILD_IN = 1;
    public static final int SKIN_LOADER_STRATEGY_NONE = -1;
    public static final int SKIN_LOADER_STRATEGY_PREFIX_BUILD_IN = 2;
    private static volatile SkinCompatManager sInstance;
    private final Context mAppContext;
    private final Object mLock = new Object();
    private boolean mLoading = false;
    private List<SkinWrapper> mWrappers = new ArrayList();
    private List<SkinLayoutInflater> mInflaters = new ArrayList();
    private List<SkinLayoutInflater> mHookInflaters = new ArrayList();
    private SparseArray<SkinLoaderStrategy> mStrategyMap = new SparseArray<>();
    private boolean mSkinAllActivityEnable = true;
    private boolean mSkinStatusBarColorEnable = false;
    private boolean mSkinWindowBackgroundColorEnable = true;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class SkinLoadTask extends AsyncTask<String, Void, String> {
        private final SkinLoaderListener mListener;
        private final SkinLoaderStrategy mStrategy;

        public SkinLoadTask(@Nullable SkinLoaderListener skinLoaderListener, @NonNull SkinLoaderStrategy skinLoaderStrategy) {
            this.mListener = skinLoaderListener;
            this.mStrategy = skinLoaderStrategy;
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            SkinLoaderListener skinLoaderListener = this.mListener;
            if (skinLoaderListener != null) {
                skinLoaderListener.onStart();
            }
        }

        @Override // android.os.AsyncTask
        public String doInBackground(String... strArr) {
            synchronized (SkinCompatManager.this.mLock) {
                while (SkinCompatManager.this.mLoading) {
                    try {
                        SkinCompatManager.this.mLock.wait();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
                SkinCompatManager.this.mLoading = true;
            }
            try {
                if (strArr.length == 1) {
                    if (TextUtils.isEmpty(this.mStrategy.loadSkinInBackground(SkinCompatManager.this.mAppContext, strArr[0]))) {
                        SkinCompatResources.getInstance().reset(this.mStrategy);
                        return "";
                    }
                    return strArr[0];
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            SkinCompatResources.getInstance().reset();
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            synchronized (SkinCompatManager.this.mLock) {
                if (str != null) {
                    SkinPreference.getInstance().setSkinName(str).setSkinStrategy(this.mStrategy.getType()).commitEditor();
                    SkinCompatManager.this.notifyUpdateSkin();
                    SkinLoaderListener skinLoaderListener = this.mListener;
                    if (skinLoaderListener != null) {
                        skinLoaderListener.onSuccess();
                    }
                } else {
                    SkinPreference.getInstance().setSkinName("").setSkinStrategy(-1).commitEditor();
                    SkinLoaderListener skinLoaderListener2 = this.mListener;
                    if (skinLoaderListener2 != null) {
                        skinLoaderListener2.onFailed("皮肤资源获取失败");
                    }
                }
                SkinCompatManager.this.mLoading = false;
                SkinCompatManager.this.mLock.notifyAll();
            }
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface SkinLoaderListener {
        void onFailed(String str);

        void onStart();

        void onSuccess();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface SkinLoaderStrategy {
        ColorStateList getColor(Context context, String str, int i2);

        ColorStateList getColorStateList(Context context, String str, int i2);

        Drawable getDrawable(Context context, String str, int i2);

        String getTargetResourceEntryName(Context context, String str, int i2);

        int getType();

        String loadSkinInBackground(Context context, String str);
    }

    private SkinCompatManager(Context context) {
        this.mAppContext = context.getApplicationContext();
        initLoaderStrategy();
    }

    public static SkinCompatManager getInstance() {
        return sInstance;
    }

    public static SkinCompatManager init(Context context) {
        if (sInstance == null) {
            synchronized (SkinCompatManager.class) {
                if (sInstance == null) {
                    sInstance = new SkinCompatManager(context);
                }
            }
        }
        SkinPreference.init(context);
        return sInstance;
    }

    private void initLoaderStrategy() {
        this.mStrategyMap.put(-1, new SkinNoneLoader());
        this.mStrategyMap.put(0, new SkinAssetsLoader());
        this.mStrategyMap.put(1, new SkinBuildInLoader());
        this.mStrategyMap.put(2, new SkinPrefixBuildInLoader());
    }

    public static SkinCompatManager withoutActivity(Application application) {
        init(application);
        SkinActivityLifecycle.init(application);
        return sInstance;
    }

    @Deprecated
    public SkinCompatManager addHookInflater(SkinLayoutInflater skinLayoutInflater) {
        this.mHookInflaters.add(skinLayoutInflater);
        return this;
    }

    public SkinCompatManager addInflater(SkinLayoutInflater skinLayoutInflater) {
        if (skinLayoutInflater instanceof SkinWrapper) {
            this.mWrappers.add((SkinWrapper) skinLayoutInflater);
        }
        this.mInflaters.add(skinLayoutInflater);
        return this;
    }

    public SkinCompatManager addStrategy(SkinLoaderStrategy skinLoaderStrategy) {
        this.mStrategyMap.put(skinLoaderStrategy.getType(), skinLoaderStrategy);
        return this;
    }

    public Context getContext() {
        return this.mAppContext;
    }

    @Deprecated
    public String getCurSkinName() {
        return SkinPreference.getInstance().getSkinName();
    }

    @Deprecated
    public List<SkinLayoutInflater> getHookInflaters() {
        return this.mHookInflaters;
    }

    public List<SkinLayoutInflater> getInflaters() {
        return this.mInflaters;
    }

    public String getSkinPackageName(String str) {
        return this.mAppContext.getPackageManager().getPackageArchiveInfo(str, 1).packageName;
    }

    @Nullable
    public Resources getSkinResources(String str) {
        try {
            PackageInfo packageArchiveInfo = this.mAppContext.getPackageManager().getPackageArchiveInfo(str, 0);
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            Resources resourcesForApplication = this.mAppContext.getPackageManager().getResourcesForApplication(packageArchiveInfo.applicationInfo);
            Resources resources = this.mAppContext.getResources();
            return new Resources(resourcesForApplication.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public SparseArray<SkinLoaderStrategy> getStrategies() {
        return this.mStrategyMap;
    }

    public List<SkinWrapper> getWrappers() {
        return this.mWrappers;
    }

    public boolean isSkinAllActivityEnable() {
        return this.mSkinAllActivityEnable;
    }

    @Deprecated
    public boolean isSkinStatusBarColorEnable() {
        return this.mSkinStatusBarColorEnable;
    }

    public boolean isSkinWindowBackgroundEnable() {
        return this.mSkinWindowBackgroundColorEnable;
    }

    public AsyncTask loadSkin() {
        String skinName = SkinPreference.getInstance().getSkinName();
        int skinStrategy = SkinPreference.getInstance().getSkinStrategy();
        if (TextUtils.isEmpty(skinName) || skinStrategy == -1) {
            return null;
        }
        return loadSkin(skinName, null, skinStrategy);
    }

    public void restoreDefaultTheme() {
        loadSkin("", -1);
    }

    public SkinCompatManager setSkinAllActivityEnable(boolean z) {
        this.mSkinAllActivityEnable = z;
        return this;
    }

    @Deprecated
    public SkinCompatManager setSkinStatusBarColorEnable(boolean z) {
        this.mSkinStatusBarColorEnable = z;
        return this;
    }

    public SkinCompatManager setSkinWindowBackgroundEnable(boolean z) {
        this.mSkinWindowBackgroundColorEnable = z;
        return this;
    }

    public AsyncTask loadSkin(SkinLoaderListener skinLoaderListener) {
        String skinName = SkinPreference.getInstance().getSkinName();
        int skinStrategy = SkinPreference.getInstance().getSkinStrategy();
        if (TextUtils.isEmpty(skinName) || skinStrategy == -1) {
            return null;
        }
        return loadSkin(skinName, skinLoaderListener, skinStrategy);
    }

    @Deprecated
    public AsyncTask loadSkin(String str) {
        return loadSkin(str, (SkinLoaderListener) null);
    }

    @Deprecated
    public AsyncTask loadSkin(String str, SkinLoaderListener skinLoaderListener) {
        return loadSkin(str, skinLoaderListener, 0);
    }

    public AsyncTask loadSkin(String str, int i2) {
        return loadSkin(str, null, i2);
    }

    public AsyncTask loadSkin(String str, SkinLoaderListener skinLoaderListener, int i2) {
        SkinLoaderStrategy skinLoaderStrategy = this.mStrategyMap.get(i2);
        if (skinLoaderStrategy == null) {
            return null;
        }
        return new SkinLoadTask(skinLoaderListener, skinLoaderStrategy).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
    }
}
