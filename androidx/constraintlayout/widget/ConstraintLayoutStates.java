package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private final ConstraintLayout mConstraintLayout;
    private SparseArray<ConstraintSet> mConstraintSetMap;
    private ConstraintsChangedListener mConstraintsChangedListener;
    public int mCurrentConstraintNumber;
    public int mCurrentStateId;
    public ConstraintSet mDefaultConstraintSet;
    private SparseArray<State> mStateList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class State {
        public int mConstraintID;
        public ConstraintSet mConstraintSet;
        public int mId;
        public ArrayList<Variant> mVariants;

        public State(Context context, XmlPullParser xmlPullParser) {
        }

        public void add(Variant variant) {
        }

        public int findMatch(float f2, float f3) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class Variant {
        public int mConstraintID;
        public ConstraintSet mConstraintSet;
        public int mId;
        public float mMaxHeight;
        public float mMaxWidth;
        public float mMinHeight;
        public float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) {
        }

        public boolean match(float f2, float f3) {
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i2) {
    }

    private void load(Context context, int i2) {
    }

    private void parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
    }

    public boolean needsToChange(int i2, float f2, float f3) {
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
    }

    public void updateConstraints(int i2, float f2, float f3) {
    }
}
