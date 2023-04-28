package androidx.constraintlayout.motion.widget;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class KeyFrames {
    private static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    public static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    private HashMap<Integer, ArrayList<Key>> mFramesMap;

    public KeyFrames(Context context, XmlPullParser xmlPullParser) {
    }

    private void addKey(Key key) {
    }

    public static String name(int i2, Context context) {
    }

    public void addFrames(MotionController motionController) {
    }

    public ArrayList<Key> getKeyFramesForView(int i2) {
    }

    public Set<Integer> getKeys() {
    }
}
