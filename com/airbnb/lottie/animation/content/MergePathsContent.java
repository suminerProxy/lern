package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class MergePathsContent implements PathContent, GreedyContent {
    private final Path firstPath;
    private final MergePaths mergePaths;
    private final String name;
    private final Path path;
    private final List<PathContent> pathContents;
    private final Path remainderPath;

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode = null;
    }

    public MergePathsContent(MergePaths mergePaths) {
    }

    private void addPaths() {
    }

    @TargetApi(19)
    private void opFirstPathWithRest(Path.Op op) {
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public void absorbContent(ListIterator<Content> listIterator) {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
    }
}
