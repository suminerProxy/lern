package skin.support.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import skin.support.SkinCompatManager;
import skin.support.annotation.NonNull;
import skin.support.widget.SkinCompatSupportable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatDelegate implements LayoutInflater.Factory2 {
    private final Context mContext;
    private SkinCompatViewInflater mSkinCompatViewInflater;
    private List<WeakReference<SkinCompatSupportable>> mSkinHelpers = new CopyOnWriteArrayList();

    private SkinCompatDelegate(Context context) {
        this.mContext = context;
    }

    public static SkinCompatDelegate create(Context context) {
        return new SkinCompatDelegate(context);
    }

    public void applySkin() {
        List<WeakReference<SkinCompatSupportable>> list = this.mSkinHelpers;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (WeakReference<SkinCompatSupportable> weakReference : this.mSkinHelpers) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().applySkin();
            }
        }
    }

    public View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        if (this.mSkinCompatViewInflater == null) {
            this.mSkinCompatViewInflater = new SkinCompatViewInflater();
        }
        for (SkinWrapper skinWrapper : SkinCompatManager.getInstance().getWrappers()) {
            Context wrapContext = skinWrapper.wrapContext(this.mContext, view, attributeSet);
            if (wrapContext != null) {
                context = wrapContext;
            }
        }
        return this.mSkinCompatViewInflater.createView(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View createView = createView(view, str, context, attributeSet);
        if (createView == null) {
            return null;
        }
        if (createView instanceof SkinCompatSupportable) {
            this.mSkinHelpers.add(new WeakReference<>((SkinCompatSupportable) createView));
        }
        return createView;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View createView = createView(null, str, context, attributeSet);
        if (createView == null) {
            return null;
        }
        if (createView instanceof SkinCompatSupportable) {
            this.mSkinHelpers.add(new WeakReference<>((SkinCompatSupportable) createView));
        }
        return createView;
    }
}
