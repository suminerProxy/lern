package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class ShapeStroke implements ContentModel {
    private final LineCapType capType;
    private final AnimatableColorValue color;
    private final boolean hidden;
    private final LineJoinType joinType;
    private final List<AnimatableFloatValue> lineDashPattern;
    private final float miterLimit;
    private final String name;
    @Nullable
    private final AnimatableFloatValue offset;
    private final AnimatableIntegerValue opacity;
    private final AnimatableFloatValue width;

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType = null;
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType = null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LineCapType {
        private static final /* synthetic */ LineCapType[] $VALUES = null;
        public static final LineCapType BUTT = null;
        public static final LineCapType ROUND = null;
        public static final LineCapType UNKNOWN = null;

        private LineCapType(String str, int i2) {
        }

        public static LineCapType valueOf(String str) {
        }

        public static LineCapType[] values() {
        }

        public Paint.Cap toPaintCap() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class LineJoinType {
        private static final /* synthetic */ LineJoinType[] $VALUES = null;
        public static final LineJoinType BEVEL = null;
        public static final LineJoinType MITER = null;
        public static final LineJoinType ROUND = null;

        private LineJoinType(String str, int i2) {
        }

        public static LineJoinType valueOf(String str) {
        }

        public static LineJoinType[] values() {
        }

        public Paint.Join toPaintJoin() {
        }
    }

    public ShapeStroke(String str, @Nullable AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, LineCapType lineCapType, LineJoinType lineJoinType, float f2, boolean z) {
    }

    public LineCapType getCapType() {
    }

    public AnimatableColorValue getColor() {
    }

    public AnimatableFloatValue getDashOffset() {
    }

    public LineJoinType getJoinType() {
    }

    public List<AnimatableFloatValue> getLineDashPattern() {
    }

    public float getMiterLimit() {
    }

    public String getName() {
    }

    public AnimatableIntegerValue getOpacity() {
    }

    public AnimatableFloatValue getWidth() {
    }

    public boolean isHidden() {
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
    }
}
