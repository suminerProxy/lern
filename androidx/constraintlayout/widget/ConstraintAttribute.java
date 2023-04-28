package androidx.constraintlayout.widget;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ConstraintAttribute {
    private static final String TAG = "TransitionLayout";
    public boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    public String mName;
    private String mStringValue;
    private AttributeType mType;

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class AttributeType {
        private static final /* synthetic */ AttributeType[] $VALUES = null;
        public static final AttributeType BOOLEAN_TYPE = null;
        public static final AttributeType COLOR_DRAWABLE_TYPE = null;
        public static final AttributeType COLOR_TYPE = null;
        public static final AttributeType DIMENSION_TYPE = null;
        public static final AttributeType FLOAT_TYPE = null;
        public static final AttributeType INT_TYPE = null;
        public static final AttributeType STRING_TYPE = null;

        private AttributeType(String str, int i2) {
        }

        public static AttributeType valueOf(String str) {
        }

        public static AttributeType[] values() {
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
    }

    private static int clamp(int i2) {
    }

    public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> hashMap, View view) {
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
    }

    public static void setAttributes(View view, HashMap<String, ConstraintAttribute> hashMap) {
    }

    public boolean diff(ConstraintAttribute constraintAttribute) {
    }

    public AttributeType getType() {
    }

    public float getValueToInterpolate() {
    }

    public void getValuesToInterpolate(float[] fArr) {
    }

    public int noOfInterpValues() {
    }

    public void setColorValue(int i2) {
    }

    public void setFloatValue(float f2) {
    }

    public void setIntValue(int i2) {
    }

    public void setInterpolatedValue(View view, float[] fArr) {
    }

    public void setStringValue(String str) {
    }

    public void setValue(float[] fArr) {
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj) {
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
    }

    public void setValue(Object obj) {
    }
}
