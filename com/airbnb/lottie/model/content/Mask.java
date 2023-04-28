package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class Mask {
    private final boolean inverted;
    private final MaskMode maskMode;
    private final AnimatableShapeValue maskPath;
    private final AnimatableIntegerValue opacity;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class MaskMode {
        private static final /* synthetic */ MaskMode[] $VALUES = null;
        public static final MaskMode MASK_MODE_ADD = null;
        public static final MaskMode MASK_MODE_INTERSECT = null;
        public static final MaskMode MASK_MODE_NONE = null;
        public static final MaskMode MASK_MODE_SUBTRACT = null;

        private MaskMode(String str, int i2) {
        }

        public static MaskMode valueOf(String str) {
        }

        public static MaskMode[] values() {
        }
    }

    public Mask(MaskMode maskMode, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z) {
    }

    public MaskMode getMaskMode() {
    }

    public AnimatableShapeValue getMaskPath() {
    }

    public AnimatableIntegerValue getOpacity() {
    }

    public boolean isInverted() {
    }
}
