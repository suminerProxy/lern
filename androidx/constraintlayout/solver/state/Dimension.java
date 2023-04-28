package androidx.constraintlayout.solver.state;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Dimension {
    public static final Object FIXED_DIMENSION = null;
    public static final Object PARENT_DIMENSION = null;
    public static final Object PERCENT_DIMENSION = null;
    public static final Object SPREAD_DIMENSION = null;
    public static final Object WRAP_DIMENSION = null;
    private final int WRAP_CONTENT;
    public Object mInitialValue;
    public boolean mIsSuggested;
    public int mMax;
    public int mMin;
    public float mPercent;
    public float mRatio;
    public int mValue;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES = null;
        public static final Type FIXED = null;
        public static final Type MATCH_CONSTRAINT = null;
        public static final Type MATCH_PARENT = null;
        public static final Type WRAP = null;

        private Type(String str, int i2) {
        }

        public static Type valueOf(String str) {
        }

        public static Type[] values() {
        }
    }

    private Dimension() {
    }

    public static Dimension Fixed(int i2) {
    }

    public static Dimension Parent() {
    }

    public static Dimension Percent(Object obj, float f2) {
    }

    public static Dimension Spread() {
    }

    public static Dimension Suggested(int i2) {
    }

    public static Dimension Wrap() {
    }

    public void apply(State state, ConstraintWidget constraintWidget, int i2) {
    }

    public Dimension fixed(Object obj) {
    }

    public float getRatio() {
    }

    public int getValue() {
    }

    public Dimension max(int i2) {
    }

    public Dimension min(int i2) {
    }

    public Dimension percent(Object obj, float f2) {
    }

    public Dimension ratio(float f2) {
    }

    public void setRatio(float f2) {
    }

    public void setValue(int i2) {
    }

    public Dimension suggested(int i2) {
    }

    public Dimension min(Object obj) {
    }

    public Dimension suggested(Object obj) {
    }

    public static Dimension Fixed(Object obj) {
    }

    public static Dimension Suggested(Object obj) {
    }

    public Dimension max(Object obj) {
    }

    public Dimension fixed(int i2) {
    }

    private Dimension(Object obj) {
    }
}
