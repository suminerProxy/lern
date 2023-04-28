package skin.support.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import skin.support.SkinCompatManager;
import skin.support.annotation.NonNull;
import skin.support.annotation.Nullable;
import skin.support.collection.ArrayMap;
import skin.support.view.ViewCompat;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class SkinCompatViewInflater {
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new ArrayMap();

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class DeclaredOnClickListener implements View.OnClickListener {
        private final View mHostView;
        private final String mMethodName;
        private Context mResolvedContext;
        private Method mResolvedMethod;

        public DeclaredOnClickListener(@NonNull View view, @NonNull String str) {
        }

        @NonNull
        private void resolveMethod(@Nullable Context context, @NonNull String str) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || ViewCompat.hasOnClickListeners(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new DeclaredOnClickListener(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewFromHackInflater(Context context, String str, AttributeSet attributeSet) {
        Iterator<SkinLayoutInflater> it = SkinCompatManager.getInstance().getHookInflaters().iterator();
        View view = null;
        while (it.hasNext() && (view = it.next().createView(context, str, attributeSet)) == null) {
        }
        return view;
    }

    private View createViewFromInflater(Context context, String str, AttributeSet attributeSet) {
        Iterator<SkinLayoutInflater> it = SkinCompatManager.getInstance().getInflaters().iterator();
        View view = null;
        while (it.hasNext() && (view = it.next().createView(context, str, attributeSet)) == null) {
        }
        return view;
    }

    public final View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View createViewFromHackInflater = createViewFromHackInflater(context, str, attributeSet);
        if (createViewFromHackInflater == null) {
            createViewFromHackInflater = createViewFromInflater(context, str, attributeSet);
        }
        if (createViewFromHackInflater == null) {
            createViewFromHackInflater = createViewFromTag(context, str, attributeSet);
        }
        if (createViewFromHackInflater != null) {
            checkOnClickListener(createViewFromHackInflater, attributeSet);
        }
        return createViewFromHackInflater;
    }

    public View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if ("view".equals(str)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createView(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i2 >= strArr.length) {
                    return null;
                }
                View createView = createView(context, str, strArr[i2]);
                if (createView != null) {
                    return createView;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private View createView(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Map<String, Constructor<? extends View>> map = sConstructorMap;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(sConstructorSignature);
                map.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }
}
