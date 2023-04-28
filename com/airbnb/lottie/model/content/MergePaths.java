package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MergePaths implements ContentModel {
    private final boolean hidden;
    private final MergePathsMode mode;
    private final String name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static final class MergePathsMode {
        private static final /* synthetic */ MergePathsMode[] $VALUES = null;
        public static final MergePathsMode ADD = null;
        public static final MergePathsMode EXCLUDE_INTERSECTIONS = null;
        public static final MergePathsMode INTERSECT = null;
        public static final MergePathsMode MERGE = null;
        public static final MergePathsMode SUBTRACT = null;

        private MergePathsMode(String str, int i2) {
        }

        public static MergePathsMode forId(int i2) {
        }

        public static MergePathsMode valueOf(String str) {
        }

        public static MergePathsMode[] values() {
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
    }

    public MergePathsMode getMode() {
    }

    public String getName() {
    }

    public boolean isHidden() {
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
    }

    public String toString() {
    }
}
