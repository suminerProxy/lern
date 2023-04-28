package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.DrawingContent;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BaseLayer implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {
    private static final int CLIP_SAVE_FLAG = 2;
    private static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
    private static final int MATRIX_SAVE_FLAG = 1;
    private static final int SAVE_FLAGS = 19;
    private final List<BaseKeyframeAnimation<?, ?>> animations;
    public final Matrix boundsMatrix;
    private final Paint clearPaint;
    private final Paint contentPaint;
    private final String drawTraceName;
    private final Paint dstInPaint;
    private final Paint dstOutPaint;
    @Nullable
    private FloatKeyframeAnimation inOutAnimation;
    public final Layer layerModel;
    public final LottieDrawable lottieDrawable;
    @Nullable
    private MaskKeyframeAnimation mask;
    private final RectF maskBoundsRect;
    private final Matrix matrix;
    private final RectF matteBoundsRect;
    @Nullable
    private BaseLayer matteLayer;
    private final Paint mattePaint;
    @Nullable
    private BaseLayer parentLayer;
    private List<BaseLayer> parentLayers;
    private final Path path;
    private final RectF rect;
    private final RectF tempMaskBoundsRect;
    public final TransformKeyframeAnimation transform;
    private boolean visible;

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 implements BaseKeyframeAnimation.AnimationListener {
        public final /* synthetic */ BaseLayer this$0;

        public AnonymousClass1(BaseLayer baseLayer) {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
        public void onValueChanged() {
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$Mask$MaskMode = null;
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$LayerType = null;
    }

    public BaseLayer(LottieDrawable lottieDrawable, Layer layer) {
    }

    public static /* synthetic */ FloatKeyframeAnimation access$000(BaseLayer baseLayer) {
    }

    public static /* synthetic */ void access$100(BaseLayer baseLayer, boolean z) {
    }

    private void applyAddMask(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
    }

    private void applyIntersectMask(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
    }

    private void applyInvertedAddMask(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
    }

    private void applyInvertedIntersectMask(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
    }

    private void applyInvertedSubtractMask(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
    }

    private void applyMasks(Canvas canvas, Matrix matrix) {
    }

    private void applySubtractMask(Canvas canvas, Matrix matrix, Mask mask, BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimation, BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2) {
    }

    private boolean areAllMasksNone() {
    }

    private void buildParentLayerListIfNeeded() {
    }

    private void clearCanvas(Canvas canvas) {
    }

    @Nullable
    public static BaseLayer forModel(Layer layer, LottieDrawable lottieDrawable, LottieComposition lottieComposition) {
    }

    private void intersectBoundsWithMask(RectF rectF, Matrix matrix) {
    }

    private void intersectBoundsWithMatte(RectF rectF, Matrix matrix) {
    }

    private void invalidateSelf() {
    }

    private void recordRenderTime(float f2) {
    }

    private void setVisible(boolean z) {
    }

    private void setupInOutAnimations() {
    }

    public void addAnimation(@Nullable BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    @CallSuper
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i2) {
    }

    public abstract void drawLayer(Canvas canvas, Matrix matrix, int i2);

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    @CallSuper
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
    }

    public Layer getLayerModel() {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
    }

    public boolean hasMasksOnThisLayer() {
    }

    public boolean hasMatteOnThisLayer() {
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
    }

    public void removeAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
    }

    public void resolveChildKeyPath(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }

    public void setMatteLayer(@Nullable BaseLayer baseLayer) {
    }

    public void setParentLayer(@Nullable BaseLayer baseLayer) {
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
    }
}
