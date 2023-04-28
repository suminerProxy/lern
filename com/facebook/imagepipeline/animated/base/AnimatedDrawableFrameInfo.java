package com.facebook.imagepipeline.animated.base;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class AnimatedDrawableFrameInfo {
    public final BlendOperation blendOperation;
    public final DisposalMethod disposalMethod;
    public final int frameNumber;
    public final int height;
    public final int width;
    public final int xOffset;
    public final int yOffset;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class BlendOperation {
        private static final /* synthetic */ BlendOperation[] $VALUES = null;
        public static final BlendOperation BLEND_WITH_PREVIOUS = null;
        public static final BlendOperation NO_BLEND = null;

        private BlendOperation(String $enum$name, int $enum$ordinal) {
        }

        public static BlendOperation valueOf(String name) {
        }

        public static BlendOperation[] values() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class DisposalMethod {
        private static final /* synthetic */ DisposalMethod[] $VALUES = null;
        public static final DisposalMethod DISPOSE_DO_NOT = null;
        public static final DisposalMethod DISPOSE_TO_BACKGROUND = null;
        public static final DisposalMethod DISPOSE_TO_PREVIOUS = null;

        private DisposalMethod(String $enum$name, int $enum$ordinal) {
        }

        public static DisposalMethod valueOf(String name) {
        }

        public static DisposalMethod[] values() {
        }
    }

    public AnimatedDrawableFrameInfo(int frameNumber, int xOffset, int yOffset, int width, int height, BlendOperation blendOperation, DisposalMethod disposalMethod) {
    }
}
