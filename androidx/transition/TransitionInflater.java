package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TransitionInflater {
    private static final ArrayMap<String, Constructor<?>> CONSTRUCTORS = null;
    private static final Class<?>[] CONSTRUCTOR_SIGNATURE = null;
    private final Context mContext;

    private TransitionInflater(@NonNull Context context) {
    }

    private Object createCustom(AttributeSet attributeSet, Class<?> cls, String str) {
    }

    private Transition createTransitionFromXml(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
    }

    private TransitionManager createTransitionManagerFromXml(XmlPullParser xmlPullParser, AttributeSet attributeSet, ViewGroup viewGroup) throws XmlPullParserException, IOException {
    }

    public static TransitionInflater from(Context context) {
    }

    @SuppressLint({"RestrictedApi"})
    private void getTargetIds(XmlPullParser xmlPullParser, AttributeSet attributeSet, Transition transition) throws XmlPullParserException, IOException {
    }

    @SuppressLint({"RestrictedApi"})
    private void loadTransition(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, TransitionManager transitionManager) throws Resources.NotFoundException {
    }

    public Transition inflateTransition(int i2) {
    }

    public TransitionManager inflateTransitionManager(int i2, ViewGroup viewGroup) {
    }
}
