package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TextLayer extends BaseLayer {
    private final LongSparseArray<String> codePointCache;
    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> colorAnimation;
    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> colorCallbackAnimation;
    private final LottieComposition composition;
    private final Map<FontCharacter, List<ContentGroup>> contentsForCharacter;
    private final Paint fillPaint;
    private final LottieDrawable lottieDrawable;
    private final Matrix matrix;
    private final RectF rectF;
    private final StringBuilder stringBuilder;
    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> strokeColorAnimation;
    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> strokeColorCallbackAnimation;
    private final Paint strokePaint;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> strokeWidthAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> strokeWidthCallbackAnimation;
    private final TextKeyframeAnimation textAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> textSizeAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> textSizeCallbackAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> trackingAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> trackingCallbackAnimation;

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass1 extends Paint {
        public final /* synthetic */ TextLayer this$0;

        public AnonymousClass1(TextLayer textLayer, int i2) {
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class AnonymousClass2 extends Paint {
        public final /* synthetic */ TextLayer this$0;

        public AnonymousClass2(TextLayer textLayer, int i2) {
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification = null;
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
    }

    private void applyJustification(DocumentData.Justification justification, Canvas canvas, float f2) {
    }

    private String codePointToString(String str, int i2) {
    }

    private void drawCharacter(String str, Paint paint, Canvas canvas) {
    }

    private void drawCharacterAsGlyph(FontCharacter fontCharacter, Matrix matrix, float f2, DocumentData documentData, Canvas canvas) {
    }

    private void drawCharacterFromFont(String str, DocumentData documentData, Canvas canvas) {
    }

    private void drawFontTextLine(String str, DocumentData documentData, Canvas canvas, float f2) {
    }

    private void drawGlyph(Path path, Paint paint, Canvas canvas) {
    }

    private void drawGlyphTextLine(String str, DocumentData documentData, Matrix matrix, Font font, Canvas canvas, float f2, float f3) {
    }

    private void drawTextGlyphs(DocumentData documentData, Matrix matrix, Font font, Canvas canvas) {
    }

    private void drawTextWithFont(DocumentData documentData, Font font, Matrix matrix, Canvas canvas) {
    }

    private List<ContentGroup> getContentsForCharacter(FontCharacter fontCharacter) {
    }

    private float getTextLineWidthForGlyphs(String str, Font font, float f2, float f3) {
    }

    private List<String> getTextLines(String str) {
    }

    private boolean isModifier(int i2) {
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i2) {
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
    }
}
