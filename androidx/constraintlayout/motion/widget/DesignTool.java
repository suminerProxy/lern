package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class DesignTool implements ProxyInterface {
    private static final boolean DEBUG = false;
    private static final String TAG = "DesignTool";
    public static final HashMap<Pair<Integer, Integer>, String> allAttributes = null;
    public static final HashMap<String, String> allMargins = null;
    private String mLastEndState;
    private int mLastEndStateId;
    private String mLastStartState;
    private int mLastStartStateId;
    private final MotionLayout mMotionLayout;
    private MotionScene mSceneCache;

    public DesignTool(MotionLayout motionLayout) {
    }

    private static void Connect(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i3, int i4) {
    }

    private static int GetPxFromDp(int i2, String str) {
    }

    private static void SetAbsolutePositions(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap) {
    }

    private static void SetBias(ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i2) {
    }

    private static void SetDimensions(int i2, ConstraintSet constraintSet, View view, HashMap<String, String> hashMap, int i3) {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public int designAccess(int i2, String str, Object obj, float[] fArr, int i3, float[] fArr2, int i4) {
    }

    public void disableAutoTransition(boolean z) {
    }

    public void dumpConstraintSet(String str) {
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
    }

    public int getAnimationPath(Object obj, float[] fArr, int i2) {
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
    }

    public String getEndState() {
    }

    public int getKeyFrameInfo(Object obj, int i2, int[] iArr) {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public float getKeyFramePosition(Object obj, int i2, float f2, float f3) {
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
    }

    public Object getKeyframe(int i2, int i3, int i4) {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public Object getKeyframeAtLocation(Object obj, float f2, float f3) {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public Boolean getPositionKeyframe(Object obj, Object obj2, float f2, float f3, String[] strArr, float[] fArr) {
    }

    public float getProgress() {
    }

    public String getStartState() {
    }

    public String getState() {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public long getTransitionTimeMs() {
    }

    public boolean isInTransition() {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setAttributes(int i2, String str, Object obj, Object obj2) {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setKeyFrame(Object obj, int i2, String str, Object obj2) {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public boolean setKeyFramePosition(Object obj, int i2, int i3, float f2, float f3) {
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
    }

    public void setState(String str) {
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setToolPosition(float f2) {
    }

    public void setTransition(String str, String str2) {
    }

    public void setViewDebug(Object obj, int i2) {
    }

    public Object getKeyframe(Object obj, int i2, int i3) {
    }
}
