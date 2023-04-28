package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.AnimationListener {
    private final BaseKeyframeAnimation<?, Float> endAnimation;
    private final boolean hidden;
    private final List<BaseKeyframeAnimation.AnimationListener> listeners;
    private final String name;
    private final BaseKeyframeAnimation<?, Float> offsetAnimation;
    private final BaseKeyframeAnimation<?, Float> startAnimation;
    private final ShapeTrimPath.Type type;

    public TrimPathContent(BaseLayer baseLayer, ShapeTrimPath shapeTrimPath) {
    }

    public void addListener(BaseKeyframeAnimation.AnimationListener animationListener) {
    }

    public BaseKeyframeAnimation<?, Float> getEnd() {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
    }

    public BaseKeyframeAnimation<?, Float> getOffset() {
    }

    public BaseKeyframeAnimation<?, Float> getStart() {
    }

    public ShapeTrimPath.Type getType() {
    }

    public boolean isHidden() {
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}
