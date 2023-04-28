package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Layer {
    private final LottieComposition composition;
    private final boolean hidden;
    private final List<Keyframe<Float>> inOutKeyframes;
    private final long layerId;
    private final String layerName;
    private final LayerType layerType;
    private final List<Mask> masks;
    private final MatteType matteType;
    private final long parentId;
    private final int preCompHeight;
    private final int preCompWidth;
    @Nullable
    private final String refId;
    private final List<ContentModel> shapes;
    private final int solidColor;
    private final int solidHeight;
    private final int solidWidth;
    private final float startFrame;
    @Nullable
    private final AnimatableTextFrame text;
    @Nullable
    private final AnimatableTextProperties textProperties;
    @Nullable
    private final AnimatableFloatValue timeRemapping;
    private final float timeStretch;
    private final AnimatableTransform transform;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LayerType {
        private static final /* synthetic */ LayerType[] $VALUES = null;
        public static final LayerType IMAGE = null;
        public static final LayerType NULL = null;
        public static final LayerType PRE_COMP = null;
        public static final LayerType SHAPE = null;
        public static final LayerType SOLID = null;
        public static final LayerType TEXT = null;
        public static final LayerType UNKNOWN = null;

        private LayerType(String str, int i2) {
        }

        public static LayerType valueOf(String str) {
        }

        public static LayerType[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class MatteType {
        private static final /* synthetic */ MatteType[] $VALUES = null;
        public static final MatteType ADD = null;
        public static final MatteType INVERT = null;
        public static final MatteType NONE = null;
        public static final MatteType UNKNOWN = null;

        private MatteType(String str, int i2) {
        }

        public static MatteType valueOf(String str) {
        }

        public static MatteType[] values() {
        }
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j2, LayerType layerType, long j3, @Nullable String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i2, int i3, int i4, float f2, float f3, int i5, int i6, @Nullable AnimatableTextFrame animatableTextFrame, @Nullable AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, MatteType matteType, @Nullable AnimatableFloatValue animatableFloatValue, boolean z) {
    }

    public LottieComposition getComposition() {
    }

    public long getId() {
    }

    public List<Keyframe<Float>> getInOutKeyframes() {
    }

    public LayerType getLayerType() {
    }

    public List<Mask> getMasks() {
    }

    public MatteType getMatteType() {
    }

    public String getName() {
    }

    public long getParentId() {
    }

    public int getPreCompHeight() {
    }

    public int getPreCompWidth() {
    }

    @Nullable
    public String getRefId() {
    }

    public List<ContentModel> getShapes() {
    }

    public int getSolidColor() {
    }

    public int getSolidHeight() {
    }

    public int getSolidWidth() {
    }

    public float getStartProgress() {
    }

    @Nullable
    public AnimatableTextFrame getText() {
    }

    @Nullable
    public AnimatableTextProperties getTextProperties() {
    }

    @Nullable
    public AnimatableFloatValue getTimeRemapping() {
    }

    public float getTimeStretch() {
    }

    public AnimatableTransform getTransform() {
    }

    public boolean isHidden() {
    }

    public String toString() {
    }

    public String toString(String str) {
    }
}
