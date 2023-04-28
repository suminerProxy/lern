package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private SparseArray<ConstraintSet> mConstraintSetMap;
    private ConstraintsChangedListener mConstraintsChangedListener;
    public int mCurrentConstraintNumber;
    public int mCurrentStateId;
    public ConstraintSet mDefaultConstraintSet;
    public int mDefaultState;
    private SparseArray<State> mStateList;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class State {
        public int mConstraintID;
        public int mId;
        public boolean mIsLayout;
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
        public int mId;
        public boolean mIsLayout;
        public float mMaxHeight;
        public float mMaxWidth;
        public float mMinHeight;
        public float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) {
        }

        public boolean match(float f2, float f3) {
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) {
    }

    private void load(Context context, XmlPullParser xmlPullParser) {
    }

    public int convertToConstraintSet(int i2, int i3, float f2, float f3) {
    }

    public boolean needsToChange(int i2, float f2, float f3) {
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
    }

    public int stateGetConstraintID(int i2, int i3, int i4) {
    }

    public int updateConstraints(int i2, int i3, float f2, float f3) {
    }
}
