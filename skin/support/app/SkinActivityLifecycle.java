package skin.support.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import skin.support.SkinCompatManager;
import skin.support.annotation.Skinable;
import skin.support.content.res.SkinCompatResources;
import skin.support.content.res.SkinCompatThemeUtils;
import skin.support.observe.SkinObservable;
import skin.support.observe.SkinObserver;
import skin.support.utils.Slog;
import skin.support.view.LayoutInflaterCompat;
import skin.support.widget.SkinCompatHelper;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinActivityLifecycle implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "SkinActivityLifecycle";
    private static volatile SkinActivityLifecycle sInstance;
    private WeakReference<Activity> mCurActivityRef;
    private WeakHashMap<Context, SkinCompatDelegate> mSkinDelegateMap;
    private WeakHashMap<Context, LazySkinObserver> mSkinObserverMap;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public class LazySkinObserver implements SkinObserver {
        private final Context mContext;
        private boolean mMarkNeedUpdate = false;

        public LazySkinObserver(Context context) {
            this.mContext = context;
        }

        @Override // skin.support.observe.SkinObserver
        public void updateSkin(SkinObservable skinObservable, Object obj) {
            if (SkinActivityLifecycle.this.mCurActivityRef != null && this.mContext != SkinActivityLifecycle.this.mCurActivityRef.get() && (this.mContext instanceof Activity)) {
                this.mMarkNeedUpdate = true;
            } else {
                updateSkinForce();
            }
        }

        public void updateSkinForce() {
            if (Slog.DEBUG) {
                Slog.i(SkinActivityLifecycle.TAG, "Context: " + this.mContext + " updateSkinForce");
            }
            Context context = this.mContext;
            if (context == null) {
                return;
            }
            if ((context instanceof Activity) && SkinActivityLifecycle.this.isContextSkinEnable(context)) {
                SkinActivityLifecycle.this.updateWindowBackground((Activity) this.mContext);
            }
            SkinActivityLifecycle.this.getSkinDelegate(this.mContext).applySkin();
            Context context2 = this.mContext;
            if (context2 instanceof SkinCompatSupportable) {
                ((SkinCompatSupportable) context2).applySkin();
            }
            this.mMarkNeedUpdate = false;
        }

        public void updateSkinIfNeeded() {
            if (this.mMarkNeedUpdate) {
                updateSkinForce();
            }
        }
    }

    private SkinActivityLifecycle(Application application) {
        application.registerActivityLifecycleCallbacks(this);
        installLayoutFactory(application);
        SkinCompatManager.getInstance().addObserver(getObserver(application));
    }

    private LazySkinObserver getObserver(Context context) {
        if (this.mSkinObserverMap == null) {
            this.mSkinObserverMap = new WeakHashMap<>();
        }
        LazySkinObserver lazySkinObserver = this.mSkinObserverMap.get(context);
        if (lazySkinObserver == null) {
            LazySkinObserver lazySkinObserver2 = new LazySkinObserver(context);
            this.mSkinObserverMap.put(context, lazySkinObserver2);
            return lazySkinObserver2;
        }
        return lazySkinObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SkinCompatDelegate getSkinDelegate(Context context) {
        if (this.mSkinDelegateMap == null) {
            this.mSkinDelegateMap = new WeakHashMap<>();
        }
        SkinCompatDelegate skinCompatDelegate = this.mSkinDelegateMap.get(context);
        if (skinCompatDelegate == null) {
            SkinCompatDelegate create = SkinCompatDelegate.create(context);
            this.mSkinDelegateMap.put(context, create);
            return create;
        }
        return skinCompatDelegate;
    }

    public static SkinActivityLifecycle init(Application application) {
        if (sInstance == null) {
            synchronized (SkinActivityLifecycle.class) {
                if (sInstance == null) {
                    sInstance = new SkinActivityLifecycle(application);
                }
            }
        }
        return sInstance;
    }

    private void installLayoutFactory(Context context) {
        try {
            LayoutInflaterCompat.setFactory2(LayoutInflater.from(context), getSkinDelegate(context));
        } catch (Throwable unused) {
            Slog.i("SkinActivity", "A factory has already been set on this LayoutInflater");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isContextSkinEnable(Context context) {
        return SkinCompatManager.getInstance().isSkinAllActivityEnable() || context.getClass().getAnnotation(Skinable.class) != null || (context instanceof SkinCompatSupportable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWindowBackground(Activity activity) {
        Drawable drawable;
        if (SkinCompatManager.getInstance().isSkinWindowBackgroundEnable()) {
            int windowBackgroundResId = SkinCompatThemeUtils.getWindowBackgroundResId(activity);
            if (SkinCompatHelper.checkResourceId(windowBackgroundResId) == 0 || (drawable = SkinCompatResources.getDrawable(activity, windowBackgroundResId)) == null) {
                return;
            }
            activity.getWindow().setBackgroundDrawable(drawable);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (isContextSkinEnable(activity)) {
            installLayoutFactory(activity);
            updateWindowBackground(activity);
            if (activity instanceof SkinCompatSupportable) {
                ((SkinCompatSupportable) activity).applySkin();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (isContextSkinEnable(activity)) {
            SkinCompatManager.getInstance().deleteObserver(getObserver(activity));
            this.mSkinObserverMap.remove(activity);
            this.mSkinDelegateMap.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mCurActivityRef = new WeakReference<>(activity);
        if (isContextSkinEnable(activity)) {
            LazySkinObserver observer = getObserver(activity);
            SkinCompatManager.getInstance().addObserver(observer);
            observer.updateSkinIfNeeded();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
