package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public abstract class BaseAnimatableValue<V, O> implements AnimatableValue<V, O> {
    public final List<Keyframe<V>> keyframes;

    public BaseAnimatableValue(V v) {
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<Keyframe<V>> getKeyframes() {
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
    }

    public String toString() {
    }

    public BaseAnimatableValue(List<Keyframe<V>> list) {
    }
}
